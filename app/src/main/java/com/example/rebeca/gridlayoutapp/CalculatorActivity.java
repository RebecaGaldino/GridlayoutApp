package com.example.rebeca.gridlayoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.graphics.*;
import android.widget.*;

public class CalculatorActivity extends AppCompatActivity {

    String[] buttonTexts = new String[]
            {
                    "7", "8", "9", "/",
                    "4", "5", "6", "x",
                    "1", "2", "3", "-",
                    ".", "0", "=", "+"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        GridLayout gl = new GridLayout(this);

        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int screenWidth = size.x;
        int screenHeight = size.y;
        int oneQuarterWidth = (int) (screenWidth * 0.25);

        for (int ii = 0; ii < buttonTexts.length; ii++) {
            Button btn = new Button(this);
            btn.setText(buttonTexts[ii]);
            btn.setTextSize(40);

            GridLayout.Spec rowSpec = GridLayout.spec(ii/4 + 2);
            GridLayout.Spec columnSpec = GridLayout.spec(ii % 4 );
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, columnSpec);
            params.width = oneQuarterWidth;
            gl.addView(btn, params);
        }

        setContentView(gl);
    }

}
