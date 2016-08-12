package thinkfeelact.android.selfevaluationmodel;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SelfEvaluationActivity extends Activity implements View.OnClickListener{

    ToggleButton overview, mood, thoughts, body, heartBeat;
    View overviewLayout, moodLayout, thoughtsLayout, bodyLayout, heartBeatLayout;
    ImageButton m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15,m16;
    ImageView moodImgView;
    TextView moodTextView, ov_moodText, ov_thoughtsText, ov_bodyText;
    EditText thoughtEdit;
    //physical pain body buttons
    ImageButton img_headButton, img_upperLButton, img_upperRButton, img_chestButton, img_lowerLButton;
    ImageButton img_lowerRButton, img_lowerBButton, img_legButton, img_feetButton;
    ToggleButton allButton, headButton, chestButton, upArmButton, handButton, lowBodButton, legsButton, feetButton;
    ToggleButton[] tbArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se);

        //=======================OVERVIEW SECTION=====================================
        overviewLayout = findViewById(R.id.overviewLayout);
        moodLayout = findViewById(R.id.moodLayout);
        thoughtsLayout = findViewById(R.id.thoughtsLayout);
        bodyLayout = findViewById(R.id.bodyLayout);
        ov_moodText = (TextView) findViewById(R.id.SE_OV_mood);ov_bodyText = (TextView) findViewById(R.id.SE_OV_pain);
        ov_thoughtsText = (TextView) findViewById(R.id.SE_OV_thoughts);
        thoughtEdit = (EditText) findViewById(R.id.SE_THOUGHTS_desc);

        overview = (ToggleButton) findViewById(R.id.overviewButton);
        mood = (ToggleButton) findViewById(R.id.moodButton);
        thoughts = (ToggleButton) findViewById(R.id.thoughtsButton);
        body = (ToggleButton) findViewById(R.id.bodyButton);
        heartBeat = (ToggleButton) findViewById(R.id.heartBeatButton);

        overview.setOnClickListener(this);mood.setOnClickListener(this);
        thoughts.setOnClickListener(this);body.setOnClickListener(this);
        heartBeat.setOnClickListener(this);

        //====================MOOD SECTION=====================================
        m1 = (ImageButton) findViewById(R.id.SE_MOOD_m1Button); m2 = (ImageButton) findViewById(R.id.SE_MOOD_m2Button);
        m3 = (ImageButton) findViewById(R.id.SE_MOOD_m3Button); m4 = (ImageButton) findViewById(R.id.SE_MOOD_m4Button);
        m5 = (ImageButton) findViewById(R.id.SE_MOOD_m5Button); m6 = (ImageButton) findViewById(R.id.SE_MOOD_m6Button);
        m7 = (ImageButton) findViewById(R.id.SE_MOOD_m7Button); m8 = (ImageButton) findViewById(R.id.SE_MOOD_m8Button);
        m9 = (ImageButton) findViewById(R.id.SE_MOOD_m9Button); m10 = (ImageButton) findViewById(R.id.SE_MOOD_m10Button);
        m11 = (ImageButton) findViewById(R.id.SE_MOOD_m11Button); m12 = (ImageButton) findViewById(R.id.SE_MOOD_m12Button);
        m13 = (ImageButton) findViewById(R.id.SE_MOOD_m13Button); m14 = (ImageButton) findViewById(R.id.SE_MOOD_m14Button);
        m15 = (ImageButton) findViewById(R.id.SE_MOOD_m15Button); m16 = (ImageButton) findViewById(R.id.SE_MOOD_m16Button);
        moodImgView = (ImageView) findViewById(R.id.SE_MOOD_imgView); moodTextView = (TextView) findViewById(R.id.SE_MOOD_moodView);
        m1.setOnClickListener(this); m2.setOnClickListener(this); m3.setOnClickListener(this); m4.setOnClickListener(this);
        m5.setOnClickListener(this);m6.setOnClickListener(this);m7.setOnClickListener(this);m8.setOnClickListener(this);
        m9.setOnClickListener(this);m10.setOnClickListener(this);m11.setOnClickListener(this);m12.setOnClickListener(this);
        m13.setOnClickListener(this);m14.setOnClickListener(this);m15.setOnClickListener(this);m16.setOnClickListener(this);

        //====================BODY SECTION=====================================
        img_headButton = (ImageButton) findViewById(R.id.ic_headButton); headButton = (ToggleButton) findViewById(R.id.SE_BODY_headButton);
        img_upperLButton = (ImageButton) findViewById(R.id.ic_upperLButton); chestButton = (ToggleButton) findViewById(R.id.SE_BODY_chestButton);
        img_upperRButton = (ImageButton) findViewById(R.id.ic_upperRButton); upArmButton = (ToggleButton) findViewById(R.id.SE_BODY_armButton);
        img_chestButton = (ImageButton) findViewById(R.id.ic_chestButton); handButton = (ToggleButton) findViewById(R.id.SE_BODY_handButton);
        img_lowerLButton = (ImageButton) findViewById(R.id.ic_lowerLButton); lowBodButton = (ToggleButton) findViewById(R.id.SE_BODY_lowBodyButton);
        img_lowerRButton = (ImageButton) findViewById(R.id.ic_lowerRButton); legsButton = (ToggleButton) findViewById(R.id.SE_BODY_legButton);
        img_lowerBButton = (ImageButton) findViewById(R.id.ic_lowerBodyButton); feetButton = (ToggleButton) findViewById(R.id.SE_BODY_feetButton);
        img_legButton = (ImageButton) findViewById(R.id.ic_legsButton); allButton = (ToggleButton) findViewById(R.id.SE_BODY_allButton);
        img_feetButton = (ImageButton) findViewById(R.id.ic_feetButton);

        //ImageButtons
        img_feetButton.setOnClickListener(this);img_lowerBButton.setOnClickListener(this);img_legButton.setOnClickListener(this);
        img_chestButton.setOnClickListener(this);img_headButton.setOnClickListener(this);img_upperLButton.setOnClickListener(this);
        img_upperRButton.setOnClickListener(this);img_lowerLButton.setOnClickListener(this);img_lowerRButton.setOnClickListener(this);
        img_feetButton.setFocusable(true);img_lowerBButton.setFocusable(true);img_legButton.setFocusable(true);
        img_chestButton.setFocusable(true);img_headButton.setFocusable(true);img_upperLButton.setFocusable(true);
        img_upperRButton.setFocusable(true);img_lowerLButton.setFocusable(true);img_lowerRButton.setFocusable(true);
        //Buttons
        headButton.setOnClickListener(this);chestButton.setOnClickListener(this);upArmButton.setOnClickListener(this);
        handButton.setOnClickListener(this);lowBodButton.setOnClickListener(this);legsButton.setOnClickListener(this);
        feetButton.setOnClickListener(this); allButton.setOnClickListener(this);
        headButton.setFocusable(true);chestButton.setFocusable(true);upArmButton.setFocusable(true);
        handButton.setFocusable(true);lowBodButton.setFocusable(true);legsButton.setFocusable(true);
        feetButton.setFocusable(true); allButton.setFocusable(true);

        tbArray = new ToggleButton[]{headButton, chestButton,
                upArmButton, lowBodButton, handButton, legsButton, feetButton};

    }

    @Override
    public void onClick(View v) {
        int buttonPressed = v.getId();
        if(buttonPressed==R.id.overviewButton||buttonPressed==R.id.thoughtsButton
                ||buttonPressed==R.id.bodyButton||buttonPressed==R.id.moodButton){
            overviewLayout.setVisibility(View.INVISIBLE);moodLayout.setVisibility(View.INVISIBLE);
            thoughtsLayout.setVisibility(View.INVISIBLE);bodyLayout.setVisibility(View.INVISIBLE);
            overview.setChecked(false); overview.setBackgroundResource(R.drawable.del_button_border);
            mood.setChecked(false); mood.setBackgroundResource(R.drawable.del_button_border);
            thoughts.setChecked(false); thoughts.setBackgroundResource(R.drawable.del_button_border);
            body.setChecked(false); body.setBackgroundResource(R.drawable.del_button_border);
        }

        switch (buttonPressed) {
            case R.id.overviewButton:
                overviewLayout.setVisibility(View.VISIBLE);
                overview.setChecked(true);
                overview.setBackgroundResource(R.drawable.sel_button_border);
                break;
            case R.id.moodButton:
                moodLayout.setVisibility(View.VISIBLE);
                mood.setChecked(true);
                mood.setBackgroundResource(R.drawable.sel_button_border);
                break;
            case R.id.thoughtsButton:
                thoughtsLayout.setVisibility(View.VISIBLE);
                thoughts.setChecked(true);
                thoughts.setBackgroundResource(R.drawable.sel_button_border);
                break;
            case R.id.bodyButton:
                bodyLayout.setVisibility(View.VISIBLE);
                body.setChecked(true);
                body.setBackgroundResource(R.drawable.sel_button_border);
                break;
            case R.id.heartBeatButton:
                Toast.makeText(SelfEvaluationActivity.this, "Heart beat not available", Toast.LENGTH_SHORT).show();
                break;
            case R.id.SE_MOOD_m1Button:
                moodImgView.setImageResource(R.drawable.ic_content);
                moodTextView.setText("Content/Just right");
                ov_moodText.setText("Content/Just right");
                break;
            case R.id.SE_MOOD_m2Button:
                moodImgView.setImageResource(R.drawable.ic_happy);
                moodTextView.setText("Happy");
                ov_moodText.setText("Happy");
                break;
            case R.id.SE_MOOD_m3Button:
                moodImgView.setImageResource(R.drawable.ic_sad);
                moodTextView.setText("Sad");
                ov_moodText.setText("Sad");
                break;
            case R.id.SE_MOOD_m4Button:
                moodImgView.setImageResource(R.drawable.ic_sick);
                moodTextView.setText("Sick");
                ov_moodText.setText("Sick");
                break;
            case R.id.SE_MOOD_m5Button:
                moodImgView.setImageResource(R.drawable.ic_negative_thoughts);
                moodTextView.setText("Dwelling on negative thoughts");
                ov_moodText.setText("Dwelling on negative thoughts");
                break;
            case R.id.SE_MOOD_m6Button:
                moodImgView.setImageResource(R.drawable.ic_feellikecrying);
                moodTextView.setText("Feeling like crying");
                ov_moodText.setText("Feeling like crying");
                break;
            case R.id.SE_MOOD_m7Button:
                moodImgView.setImageResource(R.drawable.ic_crying);
                moodTextView.setText("Crying");
                ov_moodText.setText("Crying");
                break;
            case R.id.SE_MOOD_m8Button:
                moodImgView.setImageResource(R.drawable.ic_frustrated_tpoc);
                moodTextView.setText("Frustrated");
                ov_moodText.setText("Frustrated");
                break;
            case R.id.SE_MOOD_m9Button:
                moodImgView.setImageResource(R.drawable.ic_meh);
                moodTextView.setText("Meh");
                ov_moodText.setText("Meh");
                break;
            case R.id.SE_MOOD_m10Button:
                moodImgView.setImageResource(R.drawable.ic_worriednervous);
                moodTextView.setText("Worried/Nervous");
                ov_moodText.setText("Worried/Nervous");
                break;
            case R.id.SE_MOOD_m11Button:
                moodImgView.setImageResource(R.drawable.ic_annoyed);
                moodTextView.setText("Annoyed");
                ov_moodText.setText("Annoyed");
                break;
            case R.id.SE_MOOD_m12Button:
                moodImgView.setImageResource(R.drawable.ic_angry);
                moodTextView.setText("Angry/Furious");
                ov_moodText.setText("Angry/Furious");
                break;
            case R.id.SE_MOOD_m13Button:
                moodImgView.setImageResource(R.drawable.ic_embarrassed);
                moodTextView.setText("Embarrassed");
                ov_moodText.setText("Embarrassed");
                break;
            case R.id.SE_MOOD_m14Button:
                moodImgView.setImageResource(R.drawable.ic_confused);
                moodTextView.setText("Confused");
                ov_moodText.setText("Confused");
                break;
            case R.id.SE_MOOD_m15Button:
                moodImgView.setImageResource(R.drawable.ic_shocked);
                moodTextView.setText("Shocked/Surprised");
                ov_moodText.setText("Shocked/Surprised");
                break;
            case R.id.SE_MOOD_m16Button:
                moodImgView.setImageResource(R.drawable.ic_scared);
                moodTextView.setText("Scared");
                ov_moodText.setText("Scared");
                break;
            case (R.id.SE_BODY_allButton):
                if(allButton.isChecked()){
                    for (ToggleButton eachButton : tbArray) {
                        if (eachButton.isChecked()) {
                            eachButton.performClick();
                        }
                    }
                    allButton.setChecked(true);
                    allButton.setBackgroundResource(R.drawable.item2_button_border);
                    allButton.setBackgroundResource(R.drawable.item_button_border);
                }else if(!allButton.isChecked()){
                    for (ToggleButton eachButton : tbArray) {
                        if (!eachButton.isChecked()) {
                            eachButton.performClick();
                        }
                    }
                    allButton.setChecked(false);
                    allButton.setBackgroundResource(R.drawable.item2_button_border);
                }
                break;
            case (R.id.ic_headButton):
            case (R.id.SE_BODY_headButton):
                if(String.valueOf(img_headButton.getTag())=="head1"){
                    img_headButton.setImageResource(R.drawable.head2);
                    img_headButton.setTag("head2");
                    headButton.setChecked(true);
                    headButton.setBackgroundResource(R.drawable.item2_button_border);
                }else{
                    img_headButton.setImageResource(R.drawable.head1);
                    img_headButton.setTag("head1");
                    headButton.setChecked(false);
                    headButton.setBackgroundResource(R.drawable.item_button_border);
                        allButton.setChecked(true);
                        allButton.setBackgroundResource(R.drawable.item2_button_border);
                }
                break;
            case (R.id.ic_chestButton):
            case (R.id.SE_BODY_chestButton):
                if(String.valueOf(img_chestButton.getTag())=="body1"){
                    img_chestButton.setImageResource(R.drawable.body2);
                    img_chestButton.setTag("body2");
                    chestButton.setChecked(true);
                    chestButton.setBackgroundResource(R.drawable.item2_button_border);
                }else{
                    img_chestButton.setImageResource(R.drawable.body1);img_chestButton.setTag("body1");
                    chestButton.setChecked(false);
                    chestButton.setBackgroundResource(R.drawable.item_button_border);
                    if(allButton.isChecked()){
                        allButton.setChecked(false);
                        allButton.setBackgroundResource(R.drawable.item2_button_border);
                    }
                }
                break;
            case (R.id.ic_upperLButton):
            case (R.id.ic_upperRButton):
            case (R.id.SE_BODY_armButton):
                if(String.valueOf(img_upperLButton.getTag())=="upper_leftarm1" || String.valueOf(img_upperLButton.getTag())== "upper_rightarm1"){
                    img_upperLButton.setImageResource(R.drawable.upper_leftarm2);img_upperLButton.setTag("upper_leftarm2");
                    img_upperRButton.setImageResource(R.drawable.upper_rightarm2);img_upperLButton.setTag("upper_rightarm2");
                    upArmButton.setChecked(true);
                    upArmButton.setBackgroundResource(R.drawable.item2_button_border);
                }else{
                    img_upperLButton.setImageResource(R.drawable.upper_leftarm1);
                    img_upperLButton.setTag("upper_leftarm1");
                    img_upperRButton.setImageResource(R.drawable.upper_rightarm1);
                    img_upperRButton.setTag("upper_rightarm1");
                    upArmButton.setChecked(false);
                    upArmButton.setBackgroundResource(R.drawable.item_button_border);
                    if(allButton.isChecked()){
                        allButton.setChecked(false);
                        allButton.setBackgroundResource(R.drawable.item2_button_border);
                    }
                }
                break;
            case (R.id.ic_lowerLButton):
            case (R.id.ic_lowerRButton):
            case (R.id.SE_BODY_handButton):
                if(String.valueOf(img_lowerLButton.getTag())=="lower_lefthand1" || String.valueOf(img_lowerRButton.getTag())== "lower_righthand1"){
                    img_lowerLButton.setImageResource(R.drawable.lower_lefthand2);img_lowerLButton.setTag("lower_lefthand2");
                    img_lowerRButton.setImageResource(R.drawable.lower_righthand2);img_lowerRButton.setTag("lower_righthand2");
                    handButton.setChecked(true);
                    handButton.setBackgroundResource(R.drawable.item2_button_border);
                }else{
                    img_lowerLButton.setImageResource(R.drawable.lower_lefthand1); img_lowerLButton.setTag("lower_lefthand1");
                    img_lowerRButton.setImageResource(R.drawable.lower_righthand1); img_lowerRButton.setTag("lower_righthand1");
                    handButton.setChecked(false);
                    handButton.setBackgroundResource(R.drawable.item_button_border);
                    if(allButton.isChecked()){
                        allButton.setChecked(false);
                        allButton.setBackgroundResource(R.drawable.item2_button_border);
                    }
                }
                break;
            case(R.id.ic_lowerBodyButton):
            case (R.id.SE_BODY_lowBodyButton):
                if(String.valueOf(img_lowerBButton.getTag())=="lower_body1"){
                    img_lowerBButton.setImageResource(R.drawable.lower_body2);img_lowerBButton.setTag("lower_body2");
                    lowBodButton.setChecked(true);
                    lowBodButton.setBackgroundResource(R.drawable.item2_button_border);
                }else{
                    img_lowerBButton.setImageResource(R.drawable.lower_body1); img_lowerBButton.setTag("lower_body1");
                    lowBodButton.setBackgroundResource(R.drawable.item_button_border);
                    lowBodButton.setChecked(false);
                    if(allButton.isChecked()){
                        allButton.setChecked(false);
                        allButton.setBackgroundResource(R.drawable.item2_button_border);
                    }
                }
                break;
            case(R.id.ic_legsButton):
            case (R.id.SE_BODY_legButton):
                if(String.valueOf(img_legButton.getTag())=="legs1"){
                    img_legButton.setImageResource(R.drawable.legs2);img_legButton.setTag("legs2");
                    legsButton.setBackgroundResource(R.drawable.item2_button_border);
                    legsButton.setChecked(true);
                }else{
                    img_legButton.setImageResource(R.drawable.legs1); img_legButton.setTag("legs1");
                    legsButton.setBackgroundResource(R.drawable.item_button_border);
                    legsButton.setChecked(false);
                    if (allButton.isChecked()) {
                        allButton.setChecked(false);
                        allButton.setBackgroundResource(R.drawable.item_button_border);
                    }
                }
                break;
            case(R.id.ic_feetButton):
            case (R.id.SE_BODY_feetButton):
                if(String.valueOf(img_feetButton.getTag())=="feet1"){
                    img_feetButton.setImageResource(R.drawable.feet2);img_feetButton.setTag("feet2");
                    feetButton.setBackgroundResource(R.drawable.item2_button_border);
                    feetButton.setChecked(true);
                }else{
                    img_feetButton.setImageResource(R.drawable.feet1); img_feetButton.setTag("feet1");
                    feetButton.setBackgroundResource(R.drawable.item_button_border);
                    feetButton.setChecked(false);
                    if(allButton.isChecked()){
                        allButton.setChecked(false);
                        allButton.setBackgroundResource(R.drawable.item2_button_border);
                    }
                }
                break;

        }
    }
}
