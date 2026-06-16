package com.hemanth.ecommerce.auth.service;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.hemanth.ecommerce.auth.model.User;
import com.hemanth.ecommerce.auth.repository.UserRepository;
import com.hemanth.ecommerce.auth.security.JwtUtil;



@Service
public class AuthService {


    private final UserRepository userRepository;


    private final PasswordEncoder passwordEncoder;


    private final JwtUtil jwtUtil;





    public AuthService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            JwtUtil jwtUtil) {


        this.userRepository = userRepository;


        this.passwordEncoder = passwordEncoder;


        this.jwtUtil = jwtUtil;


    }







    // REGISTER USER
    public User register(User user) {



        user.setPassword(

                passwordEncoder.encode(
                        user.getPassword())

        );



        user.setRole("USER");



        return userRepository.save(user);



    }









    // LOGIN USER + GENERATE JWT TOKEN
    public String login(User user) {




        User existingUser =
                userRepository.findByEmail(
                        user.getEmail());





        if(existingUser == null) {


            throw new RuntimeException(
                    "User not found");


        }







        boolean passwordMatch =
                passwordEncoder.matches(

                        user.getPassword(),

                        existingUser.getPassword()

                );






        if(!passwordMatch) {


            throw new RuntimeException(
                    "Invalid Password");


        }







        String token =
                jwtUtil.generateToken(
                        existingUser.getEmail());




        return token;



    }



}