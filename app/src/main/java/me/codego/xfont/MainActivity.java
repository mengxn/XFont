package me.codego.xfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private LinearLayout mTextLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textView);
        mTextLayout = (LinearLayout) findViewById(R.id.text_layout);

    }

    public void change(View view) {
        XFont.from(Typeface.MONOSPACE).into(mTextView);
    }

    public void changeLayout(View view) {
        XFont.from(Typeface.MONOSPACE).into(mTextLayout);
    }
}
