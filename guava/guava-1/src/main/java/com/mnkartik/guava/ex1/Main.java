package com.mnkartik.guava.ex1;

import com.google.common.base.Optional;

/**
 * Created by User on 05-04-2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {


        /*
        instead of passing the object as is, encapsulate in optional
         */
        Optional<Result> value = getResult();

        if (value.isPresent()) {
            System.out.println("the value is present and is not null");
            System.out.println(value.get().getValue());
        }

        /*
        a good way of assinging the value as null since null is very confusing
         */
        value = getResult1();
        System.out.println(value);

        if (!value.isPresent()) {
            System.out.println("value is null");
        }

    }


    private Optional<Result> getResult() {
        return Optional.of(new Result("result1"));
    }

    /*
    instead of retrning null, this is the option.
    only used when the caller has some logic based upon null and ref value
     */
    private Optional<Result> getResult1() {
        return Optional.absent();
    }

}
