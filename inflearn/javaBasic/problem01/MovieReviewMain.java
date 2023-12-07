package javaBasic.problem01;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview elemental = new MovieReview();
        elemental.title = "엘리멘탈";
        elemental.review = "짱 귀여워";
        System.out.println("영화제목: " + elemental.title + " " + "리뷰: " + elemental.review);
    }
}
