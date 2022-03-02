package com.google.android.gms.contactsheet.card.common;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CardButton extends RelativeLayout {
    public final MaterialButton a;

    public CardButton(Context context) {
        super(context);
        if (azhr.d()) {
            inflate(getContext(), R.layout.gm_card_button_tap_bugfix, this);
        } else {
            inflate(getContext(), R.layout.gm_card_button, this);
        }
        this.a = (MaterialButton) findViewById(R.id.card_button_content);
    }

    private static Drawable a(Drawable drawable, int i) {
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public final void b() {
        a((int) R.string.less);
        c(R.drawable.quantum_ic_expand_less_vd_theme_24);
    }

    public final void c(int i) {
        int b = jsa.b(getContext());
        if (azim.b() && azho.b()) {
            b = jsa.f(getContext());
        }
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a(uj.b(getContext(), i), b), (Drawable) null);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        findViewById(R.id.card_button_container).setOnClickListener(onClickListener);
    }

    public final void a() {
        a((int) R.string.common_more);
        c(R.drawable.quantum_ic_expand_more_vd_theme_24);
    }

    public final void b(int i) {
        int b = jsa.b(getContext());
        if (azim.b() && azho.b()) {
            b = jsa.f(getContext());
        }
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(a(uj.b(getContext(), i), b), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void a(int i) {
        this.a.setText(i);
    }

    public final void a(String str) {
        this.a.setText(str);
    }

    public CardButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (azhr.d()) {
            inflate(getContext(), R.layout.gm_card_button_tap_bugfix, this);
        } else {
            inflate(getContext(), R.layout.gm_card_button, this);
        }
        this.a = (MaterialButton) findViewById(R.id.card_button_content);
    }
}
