package com.example.DbExample.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculationRestClient {

    private static ResponseEntity<Object> calc(String a, String b,
            String operation, HttpServletRequest request) {

        String clientType = request.getHeader("User-Agent");
        HttpHeaders headers = new HttpHeaders();

        String op = "";

        try {

            double res = 0;
            if (operation.equals("add")) {
                op = "+";
                res = Double.parseDouble(a) + Double.parseDouble(b);
            } else if (operation.equals("sub")) {
                op = "-";
                res = Double.parseDouble(a) - Double.parseDouble(b);
            } else if (operation.equals("mul")) {
                op = "*";
                res = Double.parseDouble(a) * Double.parseDouble(b);
            } else {
                op = "/";
                res = Double.parseDouble(a) / Double.parseDouble(b);
            }

            if (clientType.equals("MyJavaApp")) {
                String accept = request.getHeader("Accept");

                if (accept.equals("application/json")) {
                    
                    headers.add("Content-Type", "application/json");
                    return new ResponseEntity<Object>(
                            "{\"result\":\"" + res + "\"}",
                            headers, HttpStatus.OK);
                    
                } else if (accept.equals("text/plain")) {
                    
                    headers.add("Content-Type", "text/plain");
                    return new ResponseEntity<Object>(
                            a + op + b + "=" + res,
                            headers, HttpStatus.OK);
                    
                } else {
                    
                    headers.add("Content-Type", "text/html");

                    return new ResponseEntity<Object>(
                            "<h2>" + a + op + b + "=" + res + "</h2>",
                            headers, HttpStatus.OK);
                    
                }
            }//end MyJavaApp if
            
            headers.add("Content-Type", "text/html");

            return new ResponseEntity<Object>(
                    "<h2>" + a + op + b + "=" + res + "</h2>",
                    headers, HttpStatus.OK);

        } catch (Exception e) {
            
            return new ResponseEntity<Object>(
                    e.getMessage(), headers, HttpStatus.OK);
            
        }//end try/catch
    }//end calc

    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> add(@PathVariable("a") String a,
            @PathVariable("b") String b, HttpServletRequest request) {

        return calc(a, b, "add", request);

    }//end add 

    @RequestMapping(value = "/sub/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> sub(@PathVariable("a") String a,
            @PathVariable("b") String b, HttpServletRequest request) {

        return calc(a, b, "sub", request);

    }//end sub

    @RequestMapping(value = "/mul/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> mul(@PathVariable("a") String a,
            @PathVariable("b") String b, HttpServletRequest request) {

        return calc(a, b, "mul", request);

    }//end mul

    @RequestMapping(value = "/div/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> div(@PathVariable("a") String a,
            @PathVariable("b") String b, HttpServletRequest request) {

        return calc(a, b, "div", request);

    }//end sub
}//end Controller
