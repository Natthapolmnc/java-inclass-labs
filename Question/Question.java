/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author usci
 */
public class Question {
    private String text;
    private String answer;
    public Question(String text){
        this.text=text;
    }
    public void setText(String text){
        this.text=text;
    }
    public void setAnswer(String answer){
        this.answer=answer;
    }
    public String getText(){
        return text;
    }
    public String getAnswer(){
        return answer;
    }
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    public void display(){
        System.out.println(text);
    }
}
