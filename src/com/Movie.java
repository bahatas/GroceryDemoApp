package com;

public class Movie {

    String movieName;
    int rating;

    public Movie(String movieName, int rating) throws RatingTooHighException, RatingTooLowException {
        if(rating>10){
            throw new RatingTooHighException("Rating is larger than 10");
        }
        if(rating<0){
            throw new RatingTooLowException("Rating is less than 0");
        }
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getRating() {
        return rating;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
