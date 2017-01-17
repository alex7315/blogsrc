package com.mnkartik.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;


/**
 * Created by kmaringanti on 1/17/2017.
 */
public class HelloWorld implements RequestHandler<Request, Response> {

        // [2]
        public Response handleRequest(Request request, Context context) {

            // [3]
            LambdaLogger logger = context.getLogger();

            String result = "Hello world !! " + request.getFirstName();

            // [4]
            logger.log(result);

            // [5]
            Response res = new Response();
            res.setGreetings(result);

            return res;
        }

    }
