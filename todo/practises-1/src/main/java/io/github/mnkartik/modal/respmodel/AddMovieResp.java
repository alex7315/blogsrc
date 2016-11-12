package io.github.mnkartik.modal.respmodel;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;


public class AddMovieResp {

    public String buildResponse(String status, int movieId){
        String responseJson = null;
        Map dataMap = new HashMap();
        Map resultMap = new HashMap();
        ObjectMapper mapper = new ObjectMapper();

        try {
            dataMap.put("movie_id", movieId);

            // set result map
            resultMap.put("status", status);
            resultMap.put("data", dataMap);

            // conversion
            responseJson = new ObjectMapper().writeValueAsString(resultMap);

        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }

        return responseJson;
    }
}
