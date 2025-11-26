package com.feelytics.data.model;

import java.util.ArrayList;

public class Basis {

    // FAMOUS POSTS
    private String most_scored_post_title,
                   most_scored_post_body,
                   most_scored_post_author;

    private int most_scored_post_score;

    // SECOND POST
    private String second_most_scored_post_title,
                   second_most_scored_post_body,
                   second_most_scored_post_author;

    private int second_most_scored_post_score;

    // MISC
    private int amount_of_relevant_posts_on_analysis;
    private String topic_engajement_level_in_word;
    private String one_emoji_popular_opinion_about_topic;

    private ArrayList<String> three_similar_topics_in_one_word;
    private String main_subreddit_about_topic;
    private String resume_about_analysis_and_popular_opinion;

    // private String about_main_subreddit; TO IMPLEMENT!

    public Basis(String most_scored_post_title, String most_scored_post_body, String most_scored_post_author, int most_scored_post_score, String second_most_scored_post_title, String second_most_scored_post_body, String second_most_scored_post_author, int second_most_scored_post_score, int amount_of_relevant_posts_on_analysis, String topic_engajement_level_in_word, String one_emoji_popular_opinion_about_topic, ArrayList<String> three_similar_topics_in_one_word, String main_subreddit_about_topic, String resume_about_analysis_and_popular_opinion) {
        this.most_scored_post_title = most_scored_post_title;
        this.most_scored_post_body = most_scored_post_body;
        this.most_scored_post_author = most_scored_post_author;
        this.most_scored_post_score = most_scored_post_score;
        this.second_most_scored_post_title = second_most_scored_post_title;
        this.second_most_scored_post_body = second_most_scored_post_body;
        this.second_most_scored_post_author = second_most_scored_post_author;
        this.second_most_scored_post_score = second_most_scored_post_score;
        this.amount_of_relevant_posts_on_analysis = amount_of_relevant_posts_on_analysis;
        this.topic_engajement_level_in_word = topic_engajement_level_in_word;
        this.one_emoji_popular_opinion_about_topic = one_emoji_popular_opinion_about_topic;
        this.three_similar_topics_in_one_word = three_similar_topics_in_one_word;
        this.main_subreddit_about_topic = main_subreddit_about_topic;
        this.resume_about_analysis_and_popular_opinion = resume_about_analysis_and_popular_opinion;
    }

    public String getMost_scored_post_title() {
        return most_scored_post_title;
    }

    public void setMost_scored_post_title(String most_scored_post_title) {
        this.most_scored_post_title = most_scored_post_title;
    }

    public String getMost_scored_post_body() {
        return most_scored_post_body;
    }

    public void setMost_scored_post_body(String most_scored_post_body) {
        this.most_scored_post_body = most_scored_post_body;
    }

    public String getMost_scored_post_author() {
        return most_scored_post_author;
    }

    public void setMost_scored_post_author(String most_scored_post_author) {
        this.most_scored_post_author = most_scored_post_author;
    }

    public int getMost_scored_post_score() {
        return most_scored_post_score;
    }

    public void setMost_scored_post_score(int most_scored_post_score) {
        this.most_scored_post_score = most_scored_post_score;
    }

    public String getSecond_most_scored_post_title() {
        return second_most_scored_post_title;
    }

    public void setSecond_most_scored_post_title(String second_most_scored_post_title) {
        this.second_most_scored_post_title = second_most_scored_post_title;
    }

    public String getSecond_most_scored_post_body() {
        return second_most_scored_post_body;
    }

    public void setSecond_most_scored_post_body(String second_most_scored_post_body) {
        this.second_most_scored_post_body = second_most_scored_post_body;
    }

    public String getSecond_most_scored_post_author() {
        return second_most_scored_post_author;
    }

    public void setSecond_most_scored_post_author(String second_most_scored_post_author) {
        this.second_most_scored_post_author = second_most_scored_post_author;
    }

    public int getSecond_most_scored_post_score() {
        return second_most_scored_post_score;
    }

    public void setSecond_most_scored_post_score(int second_most_scored_post_score) {
        this.second_most_scored_post_score = second_most_scored_post_score;
    }

    public int getAmount_of_relevant_posts_on_analysis() {
        return amount_of_relevant_posts_on_analysis;
    }

    public void setAmount_of_relevant_posts_on_analysis(int amount_of_relevant_posts_on_analysis) {
        this.amount_of_relevant_posts_on_analysis = amount_of_relevant_posts_on_analysis;
    }

    public String getTopic_engajement_level_in_word() {
        return topic_engajement_level_in_word;
    }

    public void setTopic_engajement_level_in_word(String topic_engajement_level_in_word) {
        this.topic_engajement_level_in_word = topic_engajement_level_in_word;
    }

    public String getOne_emoji_popular_opinion_about_topic() {
        return one_emoji_popular_opinion_about_topic;
    }

    public void setOne_emoji_popular_opinion_about_topic(String one_emoji_popular_opinion_about_topic) {
        this.one_emoji_popular_opinion_about_topic = one_emoji_popular_opinion_about_topic;
    }

    public ArrayList<String> getThree_similar_topics_in_one_word() {
        return three_similar_topics_in_one_word;
    }

    public void setThree_similar_topics_in_one_word(ArrayList<String> three_similar_topics_in_one_word) {
        this.three_similar_topics_in_one_word = three_similar_topics_in_one_word;
    }

    public String getMain_subreddit_about_topic() {
        return main_subreddit_about_topic;
    }

    public void setMain_subreddit_about_topic(String main_subreddit_about_topic) {
        this.main_subreddit_about_topic = main_subreddit_about_topic;
    }

    public String getResume_about_analysis_and_popular_opinion() {
        return resume_about_analysis_and_popular_opinion;
    }

    public void setResume_about_analysis_and_popular_opinion(String resume_about_analysis_and_popular_opinion) {
        this.resume_about_analysis_and_popular_opinion = resume_about_analysis_and_popular_opinion;
    }

    @Override
    public String toString() {
        return (this.most_scored_post_title + " | " + this.most_scored_post_body + " | "
                + this.most_scored_post_author + " | " + this.most_scored_post_score + "\n\n"
                + this.second_most_scored_post_title + " | " + this.second_most_scored_post_body + " | "
                + this.second_most_scored_post_author + " | " + this.second_most_scored_post_score + "\n\n"
                + this.amount_of_relevant_posts_on_analysis + " | " + this.topic_engajement_level_in_word + "\n\n"
                + this.one_emoji_popular_opinion_about_topic + "\n"
                + this.three_similar_topics_in_one_word + "\n\n"
                + this.main_subreddit_about_topic + "\n"
                + this.resume_about_analysis_and_popular_opinion);
    }
}
