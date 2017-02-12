package com.example.android.volleyballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int exemelitesScore = 0;
    int javawingsScore = 0;
    int resetTeams = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForExemelites(exemelitesScore);
        displayForJavawings(javawingsScore);
    }

    /**
     * Displays the given score for Exemelites.
     */
    public void displayForExemelites(int exemelitesScore) {
        TextView scoreView = (TextView) findViewById(R.id.exemelitesScore);
        scoreView.setText(String.valueOf(exemelitesScore));
    }

    /**
     * Method is called when Serve +1 button is pressed
     */
    public void servePointForExemelites(View view) {
        exemelitesScore = exemelitesScore + 1;
        displayForExemelites(exemelitesScore);
    }

    /**
     * Method is called when Error point +1 button is pressed.
     */
    public void errorPointForExemelites(View view) {
        exemelitesScore = exemelitesScore + 1;
        displayForExemelites(exemelitesScore);
    }

    /**
     * Method is called when Net-touch -1 button is pressed
     */
    public void netTouchMinusOneForExemelites(View view) {
        exemelitesScore = exemelitesScore - 1;
        displayForExemelites(exemelitesScore);
    }

    /**
     * Method is called when Carry -1 button is pressed
     */
    public void carryMinusPointForExemelites(View view) {
        exemelitesScore = exemelitesScore - 1;
        displayForExemelites(exemelitesScore);
    }

    /**
     * Method is called when Service fault -1 button is pressed
     */
    public void serviceFaultMinusForExemelites(View view) {
        exemelitesScore = exemelitesScore - 1;
        displayForExemelites(exemelitesScore);
    }

    /**
     * Displays the given score for Javawings.
     */
    public void displayForJavawings(int javawingsScore) {
        TextView scoreView = (TextView) findViewById(R.id.javawingsScore);
        scoreView.setText(String.valueOf(javawingsScore));
    }

    /**
     * Method is called when Serve +1 button is pressed
     */
    public void servePointForJavawings(View view) {
        javawingsScore = javawingsScore + 1;
        displayForJavawings(javawingsScore);
    }

    /**
     * Method is called when Error point +1 button is pressed
     */
    public void errorPointForJavawings(View view) {
        javawingsScore = javawingsScore + 1;
        displayForJavawings(javawingsScore);
    }

    /**
     * Method is called when Net-touch -1 button is pressed
     */
    public void netTouchMinusOneForJavawings(View view) {
        javawingsScore = javawingsScore - 1;
        displayForJavawings(javawingsScore);
    }

    /**
     * Method is called when Carry -1 button is pressed
     */
    public void carryMinusPointForJavawings(View view) {
        javawingsScore = javawingsScore - 1;
        displayForJavawings(javawingsScore);
    }

    /**
     * Method is called when Service fault -1 button is pressed
     */
    public void serviceFaultMinusForJavawings(View view) {
        javawingsScore = javawingsScore - 1;
        displayForJavawings(javawingsScore);
    }

    /**
     * Method resets score for both teams
     */
    public void resetTeams(View view) {
        exemelitesScore = resetTeams;
        displayForExemelites(resetTeams);
        javawingsScore = resetTeams;
        displayForJavawings(resetTeams);
    }
}

