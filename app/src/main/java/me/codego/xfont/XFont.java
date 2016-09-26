package me.codego.xfont;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mengxn on 16/9/26.
 */

public class XFont {

    private Typeface typeface;

    private XFont() {

    }

    private XFont(Typeface typeface) {
        if (typeface == null) {
            throw new IllegalArgumentException("typeface is null");
        }
        this.typeface = typeface;
    }

    public static XFont from(Typeface typeface) {
        return new XFont(typeface);
    }

    public void to(ViewGroup viewGroup) {
        to(viewGroup, typeface);
    }

    public void to(ViewGroup viewGroup, Typeface typeface) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("view is null");
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View v = viewGroup.getChildAt(i);
            if (v instanceof ViewGroup) {
                to((ViewGroup) v, typeface);
            } else if (v != null) {
                to(v, typeface);
            }
        }
    }

    public void to(View view) {
        to(view, typeface);
    }

    public void to(View view, Typeface typeface) {
        if (view == null) {
            throw new IllegalArgumentException("view is null");
        }
        if (view instanceof ViewGroup) {
            to((ViewGroup) view, typeface);
        } else if (view instanceof TextView) {
            ((TextView) view).setTypeface(typeface);
        }
    }
}
