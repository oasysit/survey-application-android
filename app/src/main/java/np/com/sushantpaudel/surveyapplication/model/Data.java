package np.com.sushantpaudel.surveyapplication.model;

import com.google.gson.Gson;

import java.io.Serializable;

public class Data implements Serializable {
    private String userEmail;
    private String presentLocation;
    private ChapterOne chapterOne;
    private ChapterTwo chapterTwo;
    private ChapterThree chapterThree;
    private ChapterFour chapterFour;
    private ChapterFive chapterFive;
    private ChapterSix chapterSix;
    private ChapterSeven chapterSeven;
    private ChapterEight chapterEight;
    private ChapterNine chapterNine;

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setPresentLocation(String presentLocation) {
        this.presentLocation = presentLocation;
    }

    public void setChapterOne(ChapterOne chapterOne) {
        this.chapterOne = chapterOne;
    }

    public void setChapterTwo(ChapterTwo chapterTwo) {
        this.chapterTwo = chapterTwo;
    }

    public void setChapterThree(ChapterThree chapterThree) {
        this.chapterThree = chapterThree;
    }

    public void setChapterFour(ChapterFour chapterFour) {
        this.chapterFour = chapterFour;
    }

    public void setChapterFive(ChapterFive chapterFive) {
        this.chapterFive = chapterFive;
    }

    public void setChapterSix(ChapterSix chapterSix) {
        this.chapterSix = chapterSix;
    }

    public void setChapterSeven(ChapterSeven chapterSeven) {
        this.chapterSeven = chapterSeven;
    }

    public void setChapterEight(ChapterEight chapterEight) {
        this.chapterEight = chapterEight;
    }

    public void setChapterNine(ChapterNine chapterNine) {
        this.chapterNine = chapterNine;
    }

    public String getJSON() {
        String userEmail = "\"userEmail\" : \"" + this.userEmail + "\"";
        String presentLocation = "\"presentLocation\" : \"" + this.presentLocation + "\"";
        String chapterOne = new Gson().toJson(this.chapterOne);
        String chapterTwo = new Gson().toJson(this.chapterTwo);
        String chapterThree = new Gson().toJson(this.chapterThree);
        String chapterFour = new Gson().toJson(this.chapterFour);
        String chapterFive = new Gson().toJson(this.chapterFive);
        String chapterSix = new Gson().toJson(this.chapterSix);
        String chapterSeven = new Gson().toJson(this.chapterSeven);
        String chapterEight = new Gson().toJson(this.chapterEight);
        String chapterNine = new Gson().toJson(this.chapterNine);
        return "{" + userEmail + "," + presentLocation + "," +
                chapterOne.substring(1, chapterOne.length() - 1) + "," +
                chapterTwo.substring(1, chapterTwo.length() - 1) + "," +
                chapterThree.substring(1, chapterThree.length() - 1) + "," +
                chapterFour.substring(1, chapterFour.length() - 1) + "," +
                chapterFive.substring(1, chapterFive.length() - 1) + "," +
                chapterSix.substring(1, chapterSix.length() - 1) + "," +
                chapterSeven.substring(1, chapterSeven.length() - 1) + "," +
                chapterEight.substring(1, chapterEight.length() - 1) + "," +
                chapterNine.substring(1, chapterNine.length() - 1) +
                "}";
    }

}
