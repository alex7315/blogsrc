package io.github.mnkartik.controller;

import io.github.mnkartik.modal.reqmodel.AddMovieReq;
import io.github.mnkartik.modal.respmodel.AddMovieResp;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {

    @RequestMapping(value = "/movie", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addMovie(@RequestBody AddMovieReq reqObj){

        System.out.println("From json request to bean = " + reqObj.toString());
        System.out.println("Converted to entity = " + reqObj.convert());

        // service layer calls and (movieId = 100) is returned

        return new AddMovieResp().buildResponse("success", 100);
    }
}
