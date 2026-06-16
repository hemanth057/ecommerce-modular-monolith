package com.hemanth.ecommerce.auth.security;


import java.util.Date;


import javax.crypto.SecretKey;


import org.springframework.stereotype.Component;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;



@Component
public class JwtUtil {



    private static final String SECRET =

            "mysecretkeymysecretkeymysecretkeymysecretkey";





    private SecretKey getKey() {



        return Keys.hmacShaKeyFor(
                SECRET.getBytes());



    }








    // CREATE TOKEN

    public String generateToken(String username) {




        return Jwts.builder()


                .subject(username)


                .issuedAt(new Date())


                .expiration(

                        new Date(

                                System.currentTimeMillis()

                                + 1000 * 60 * 60

                        )

                )


                .signWith(getKey())


                .compact();



    }








    // GET EMAIL FROM TOKEN

    public String extractUsername(String token) {




        Claims claims =

                Jwts.parser()


                .verifyWith(getKey())


                .build()


                .parseSignedClaims(token)


                .getPayload();





        return claims.getSubject();



    }








    // CHECK TOKEN VALID OR NOT

    public boolean validateToken(String token) {




        try {


            Jwts.parser()


            .verifyWith(getKey())


            .build()


            .parseSignedClaims(token);



            return true;


        }


        catch(Exception e) {


            return false;


        }



    }




}