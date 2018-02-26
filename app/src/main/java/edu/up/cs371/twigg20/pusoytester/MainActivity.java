package edu.up.cs371.twigg20.pusoytester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    PSState firstInstance, secondInstance, thirdInstance, fourthInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button runTestButton = (Button)findViewById(R.id.button);
        runTestButton.setOnClickListener(this);
        editText = (EditText)findViewById(R.id.editText);

    }

    @Override
    public void onClick(View v) {

        editText.setText("");
        firstInstance = new PSState();
        //secondInstance = new PSState(firstInstance, 1);
        thirdInstance = new PSState();
        //fourthInstance = new PSState(thirdInstance, 1);

        firstInstance.toString();
        String secondInstText = secondInstance.toString();
        String fourthIstText = fourthInstance.toString();

        editText.setText(secondInstText);
        editText.setText(editText.getText()+fourthIstText);


    }
}
