package javaBasic.problem01;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview elemental = new MovieReview();
        elemental.title = "엘리멘탈";
        elemental.review = "주인공 들이 쏘 큐트";
        reviews[0] = elemental;

        MovieReview troll = new MovieReview();
        troll.title = "트롤";
        troll.review = "여기 주인공 들도 쏘 큐트";
        reviews[1] = troll;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목 : " + review.title);
            System.out.println("리뷰 : " + review.review);
        }
    }
}
