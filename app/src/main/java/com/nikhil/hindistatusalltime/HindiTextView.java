package com.nikhil.hindistatusalltime;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.emoji.widget.EmojiTextView;

public class HindiTextView extends EmojiTextView {
    public HindiTextView(Context context) {
        super(context);
        initTypeFace(context);
    }

    public HindiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initTypeFace(context);
    }

    public HindiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initTypeFace(context);
    }
    private void initTypeFace(Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"dev2.ttf");
        this.setTypeface(typeface);
    }

}
