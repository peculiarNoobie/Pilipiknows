package com.example.culture_nav;

        import android.app.Activity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.SeekBar;
        import android.widget.SeekBar.OnSeekBarChangeListener;
        import android.widget.TextView;

public class FailActivity extends Activity {

    SeekBar barOpacity;
    ImageView image1, image2;
    TextView textOpacitySetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);

        image1 = (ImageView)findViewById(R.id.image1);
        image2 = (ImageView)findViewById(R.id.image2);

        textOpacitySetting = (TextView)findViewById(R.id.opacitysetting);
        barOpacity = (SeekBar)findViewById(R.id.opacity);

        barOpacity.setOnSeekBarChangeListener(barOpacityOnSeekBarChangeListener);
    }

    OnSeekBarChangeListener barOpacityOnSeekBarChangeListener =
            new OnSeekBarChangeListener(){

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,
                                              boolean fromUser) {
                    int alpha = barOpacity.getProgress();
                    textOpacitySetting.setText(String.valueOf(alpha));
                    image2.setAlpha(alpha);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {}

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {}

            };

}