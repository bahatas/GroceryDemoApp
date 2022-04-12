package com;

public class MovieDemo {
    public static void main(String[] args) throws RatingTooHighException, RatingTooLowException {

        Movie movie1 = new Movie("Movie1",10);
//        Movie movie2 = new Movie("Movie2",11);
        Movie movie3 = new Movie("Movie2",-1);

    }
}
