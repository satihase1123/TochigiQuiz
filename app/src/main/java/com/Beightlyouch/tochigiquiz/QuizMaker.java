package com.Beightlyouch.tochigiquiz;

import java.util.ArrayList;
import java.util.Random;

public class QuizMaker {

    private int answer_num;
    private ArrayList<Integer> choices;
    private int question_num;

    public QuizMaker() {

    }

    //適当な4択　＝＞数字のリストを返す
    public ArrayList<Integer> RandomCity(){
        ArrayList<Integer> choices = new ArrayList<Integer>();
        while(choices.size() < 5){
            Random rand = new Random();
            int randomNumber = rand.nextInt(25);
            if(Notdeplicated(choices, randomNumber)){
                choices.add(randomNumber);
            }
        }
        return choices;
    }

    //答え リスト内の１～４ばんめ
    //まず4たくつくってその中から答えを決める
    public int RandomAnswer() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(4);
        return randomNumber;
    }

    //4たくのなかに重複している奴がないか？
    public boolean Notdeplicated(ArrayList<Integer> choices, int num){
        for(int i=0;i<choices.size();i++){
            if(choices.get(i)==num){
                return false;
            }
        }
        return true;
    }

    public void createQuiz(){
        this.setChoices(this.RandomCity());
        this.setAnswer_num(RandomAnswer());
    }

    public int getAnswer_num() {
        return answer_num;
    }

    public void setAnswer_num(int answer_num) {
        this.answer_num = answer_num;
    }

    public ArrayList<Integer> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<Integer> choices) {
        this.choices = choices;
    }


    public int getQuestion_num() {
        return question_num;
    }

    public void setQuestion_num(int question_num) {
        this.question_num = question_num;
    }
}
