package com.nikhil.hindistatusalltime;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.emoji.widget.EmojiEditText;

public class HindiEditText extends EmojiEditText {
    public HindiEditText(Context context) {
        super(context);
        initTypeface(context);
    }

    public HindiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTypeface(context);
    }

    public HindiEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTypeface(context);
    }
    private void initTypeface(Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"dev2.ttf");
        setTypeface(typeface);
    }
}
