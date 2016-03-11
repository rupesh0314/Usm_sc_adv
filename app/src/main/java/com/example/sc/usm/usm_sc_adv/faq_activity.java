package com.example.sc.usm.usm_sc_adv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by rupeshreddyt on 03/03/16.
 */
public class faq_activity extends AppCompatActivity {

    // inside Activity
    TextView que_1,que_2,que_3,que_4,que_5,que_6,que_7,que_8,que_9,que_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        que_1 = (TextView) findViewById(R.id.que_1_content);
// hide until its title is clicked
        que_1.setVisibility(View.GONE);
        que_2 = (TextView) findViewById(R.id.que_2_content);
// hide until its title is clicked
        que_2.setVisibility(View.GONE);
        que_3 = (TextView) findViewById(R.id.que_3_content);
// hide until its title is clicked
        que_3.setVisibility(View.GONE);
        que_4 = (TextView) findViewById(R.id.que_4_content);
// hide until its title is clicked
        que_4.setVisibility(View.GONE);
        que_5 = (TextView) findViewById(R.id.que_5_content);
// hide until its title is clicked
        que_5.setVisibility(View.GONE);
        que_6 = (TextView) findViewById(R.id.que_6_content);
// hide until its title is clicked
        que_6.setVisibility(View.GONE);
        que_7 = (TextView) findViewById(R.id.que_7_content);
// hide until its title is clicked
        que_7.setVisibility(View.GONE);
        que_8 = (TextView) findViewById(R.id.que_8_content);
// hide until its title is clicked
        que_8.setVisibility(View.GONE);
        que_9 = (TextView) findViewById(R.id.que_8_content);
// hide until its title is clicked
        que_9.setVisibility(View.GONE);
        que_10 = (TextView) findViewById(R.id.que_8_content);
// hide until its title is clicked
        que_10.setVisibility(View.GONE);

    }

    /**
     * onClick handler
     */
    public void toggle_contents(View v) {

switch (v.getId()) {


    case R.id.que_1:
            que_1.setVisibility(que_1.isShown()
            ? View.GONE
            : View.VISIBLE); break;
    case R.id.que_2:
        que_2.setVisibility(que_2.isShown()
                ? View.GONE
                : View.VISIBLE); break;
    case R.id.que_3:
        que_3.setVisibility(que_3.isShown()
                ? View.GONE
                : View.VISIBLE); break;
    case R.id.que_4:
        que_4.setVisibility(que_4.isShown()
                ? View.GONE
                : View.VISIBLE); break;
    case R.id.que_5:
        que_5.setVisibility(que_5.isShown()
                ? View.GONE
                : View.VISIBLE); break;
    case R.id.que_6:
        que_6.setVisibility(que_6.isShown()
                ? View.GONE
                : View.VISIBLE); break;
    case R.id.que_7:
        que_7.setVisibility(que_7.isShown()
                ? View.GONE
                : View.VISIBLE); break;
    case R.id.que_8:
        que_8.setVisibility(que_8.isShown()
                ? View.GONE
                : View.VISIBLE); break;
    case R.id.que_9:
        que_9.setVisibility(que_9.isShown()
                ? View.GONE
                : View.VISIBLE); break;
    case R.id.que_10:
        que_10.setVisibility(que_10.isShown()
                ? View.GONE
                : View.VISIBLE); break;


}
    }
}

