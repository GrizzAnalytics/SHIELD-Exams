package com.example.android.shieldexams;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    public void onRadioButton1Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.mjolnir:
                if (button1Checked)
                    break;
            case R.id.repulsor:
                if (button1Checked)
                    break;
            case R.id.shield:
                if (button1Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.hands:
                if (button1Checked)
                    break;
        }
    }
    public void onRadioButton2Clicked(View view) {
        //Is the button now checked?
        boolean button4Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.trueShit:
                if (button4Checked)
                    break;
            case R.id.falseNess:
                if (button4Checked)
                    totalScore = totalScore + 1;
                    break;
        }
    }
    public void onRadioButton3Clicked(View view) {
        //Is the button now checked?
        boolean button9Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.mt:
                if (button9Checked)
                    break;
            case R.id.leader:
                if (button9Checked)
                    break;
            case R.id.brb:
                if (button9Checked)
                    break;
            case R.id.abomination:
                if (button9Checked)
                    totalScore = totalScore + 1;
                    break;
        }
    }
    public void onRadioButton4Clicked(View view) {
        //Is the button now checked?
        boolean button10Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.trueShit2:
                if (button10Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.falseNess2:
                if (button10Checked)
                    break;
        }
    }
    public void onCheckbox1Clicked(View view) {
        boolean button3Checked = ((CheckBox) view).isChecked();

        //Check which box is clicked
        switch (view.getId()) {
            case R.id.bucky:
                if (button3Checked)
                    break;
            case R.id.spidey:
                if (button3Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.vision:
                if (button3Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.thanos:
                if (button3Checked)
                    break;
        }
    }
    public void onCheckbox2Clicked(View view) {
        boolean button5Checked = ((CheckBox) view).isChecked();

        //Check which box is clicked
        switch (view.getId()) {
            case R.id.fury:
                if (button5Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.coulson:
                if (button5Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.hill:
                if (button5Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.tchalla:
                if (button5Checked)
                    break;
        }
    }
    public void onCheckbox3Clicked(View view) {
        boolean button8Checked = ((CheckBox) view).isChecked();

        //Check which box is clicked
        switch (view.getId()) {
            case R.id.sokovia:
                if (button8Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.wakanda:
                if (button8Checked)
                    break;
            case R.id.knowhere:
                if (button8Checked)
                    break;
            case R.id.genosha:
                if (button8Checked)
                    break;
        }
    }
    public void displayScore(View view) {
        EditText questionAnswer1 = findViewById(R.id.question_2);
        String question_2 = questionAnswer1.getText().toString();
        String rightAnswer1A = "Ultron";
        String rightAnswer2A = "ultron";
        if ((question_2.equalsIgnoreCase(rightAnswer1A) || question_2.equalsIgnoreCase(rightAnswer2A))) {
            totalScore = totalScore + 1;
        }
        EditText questionAnswer2 = findViewById(R.id.question_6);
        String question_6 = questionAnswer2.getText().toString();
        String rightAnswer1B = "Dr. Octopus";
        String rightAnswer2B = "Doc Oc";
        String rightAnswer3B = "Green Goblin";
        String rightAnswer4B = "The Vulture";
        if ((question_6.equalsIgnoreCase(rightAnswer1B) || question_6.equalsIgnoreCase(rightAnswer2B) || question_6.equalsIgnoreCase(rightAnswer3B)) || question_6.equalsIgnoreCase(rightAnswer4B)) {
            totalScore = totalScore + 1;
        }
        EditText questionAnswer3 = findViewById(R.id.question_7);
        String question_7 = questionAnswer3.getText().toString();
        String rightAnswer1C = "The Wasp";
        String rightAnswer2C = "Wasp";
        if (question_7.equalsIgnoreCase(rightAnswer2C) || question_7.equalsIgnoreCase(rightAnswer1C)) {
            totalScore = totalScore + 1;
        }
        if (totalScore == 13) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Your score is: " + totalScore + "/13" + "\nPerfect Score" + "\nCongratulations! You\'ve moved on to the next round!");
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
        if ((totalScore > 10) && (totalScore <= 12)) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Your score is: " + totalScore + "/13" + "\nCongratulations! You\'ve made it to the next round! ");
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
        if (totalScore <= 10) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Your score is: " + totalScore + "/13" + "\nUnfortunately you have failed this exam." + "\n You may retake this exam in one year\'s time!");
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
    }
    public void resetQuiz(View view){
        Intent intent = new Intent(QuizActivity.this, SplashActivity2.class);
        startActivity(intent);
    }
}
