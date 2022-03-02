package com.google.android.gms.smart_profile.card.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseCardView extends CardView {
    public BaseCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void a(String str, Drawable drawable, Drawable drawable2, View.OnClickListener onClickListener) {
        View findViewById = findViewById(R.id.button_container);
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(R.id.bottom_button);
        findViewById.setOnClickListener(onClickListener);
        appCompatButton.setText(str.toUpperCase(Locale.getDefault()));
        appCompatButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        findViewById.setVisibility(0);
        findViewById(R.id.separator).setVisibility(0);
        appCompatButton.setVisibility(0);
    }

    public final void b(int i, int i2, View.OnClickListener onClickListener) {
        a(getContext().getString(i), i2, onClickListener);
    }

    public BaseCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addView(inflate(getContext(), R.layout.base_card_view, (ViewGroup) null));
    }

    public final void a(int i) {
        a(getContext().getString(i));
    }

    public final void a(int i, int i2, View.OnClickListener onClickListener) {
        Drawable b = uj.b(getContext(), i2);
        jpr.a(b, kf.b(getContext(), R.color.card_bottom_button_color));
        a(getContext().getString(i), b, (Drawable) null, onClickListener);
    }

    public final void a(View view) {
        ((ViewGroup) findViewById(R.id.card_content)).addView(view);
    }

    public final void a(String str) {
        TextView textView = (TextView) findViewById(R.id.title);
        textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.card_space_between_entries));
        textView.setVisibility(0);
        textView.setText(str);
    }

    public final void a(String str, int i, View.OnClickListener onClickListener) {
        Drawable b = uj.b(getContext(), i);
        jpr.a(b, kf.b(getContext(), R.color.card_bottom_button_color));
        a(str, (Drawable) null, b, onClickListener);
    }
}
