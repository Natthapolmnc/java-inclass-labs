package Q1;

import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usci
 */
class ChoiceQuestion extends Question{
    private ArrayList<String> Choice;
    public void addChoice(String choice,boolean correct){
        if (correct){
            super.setAnswer(choice);
        }else{
                this.Choice.add(choice);
    }
}
    ChoiceQuestion(String text){
        super(text);
}
    public boolean checkAnswer(String response){
        int Intres=Integer.parseInt(response)-1;
        return super.checkAnswer(Choice.get(Intres));
    }
}
