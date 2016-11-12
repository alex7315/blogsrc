package io.github.mnkartik.modal.respmodel;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.mnkartik.modal.entity.MovieInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListMovieResp {

    public String buildResponse(String status, List<MovieInfo> list){
        String responseJson = null;
        Map dataMap = new HashMap();
        Map resultMap = new HashMap();
        ObjectMapper mapper = new ObjectMapper();

        try {
            ArrayNode arrnode = mapper.createArrayNode();
            for(MovieInfo info : list){
                ObjectNode o = mapper.createObjectNode();
                o.put("id", info.getId());
                o.put("title", info.getTitle());
                o.put("year", info.getYear());

                arrnode.add(o);
            }
            dataMap.put("movies", arrnode);

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
