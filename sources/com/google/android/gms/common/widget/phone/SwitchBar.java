package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SwitchBar extends LinearLayout implements Checkable, View.OnClickListener {
    public jmo a;
    public CharSequence b;
    private TextView c;
    private CompoundButton d;
    private int e;
    private int f;
    private CharSequence g;
    private CharSequence h;
    private int i;
    private int j;
    private int k;

    public SwitchBar(Context context) {
        super(b(context));
        a(getContext(), (AttributeSet) null, (int) R.attr.switchBarStyle, 2132019177);
    }

    private static int a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842806});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static Context b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.switchBarStyle});
        int resourceId = obtainStyledAttributes.getResourceId(0, 2132019177);
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    public final boolean isChecked() {
        return this.k == 1;
    }

    public void onClick(View view) {
        toggle();
    }

    public final void setChecked(boolean z) {
        CharSequence charSequence;
        int i2;
        CharSequence charSequence2;
        if (this.d == null) {
            b();
        }
        this.d.setChecked(z);
        setSelected(z);
        TextView a2 = a();
        if (!z) {
            charSequence = this.h;
        } else {
            charSequence = this.g;
        }
        a2.setText(charSequence);
        TextView a3 = a();
        if (!z) {
            i2 = this.f;
        } else {
            i2 = this.e;
        }
        a3.setTextColor(i2);
        if (!z) {
            charSequence2 = this.h;
        } else {
            charSequence2 = this.g;
        }
        setContentDescription(charSequence2);
        jmo jmo = this.a;
        if (jmo != null) {
            jmo.a(z);
        }
        this.k = !z ? 2 : 1;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        CompoundButton compoundButton = this.d;
        if (compoundButton != null) {
            compoundButton.setEnabled(!isEnabled());
            this.d.setEnabled(z);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public SwitchBar(Context context, AttributeSet attributeSet) {
        super(b(context), attributeSet);
        a(getContext(), attributeSet, (int) R.attr.switchBarStyle, 2132019177);
    }

    public SwitchBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet, i2, 2132019177);
    }

    private final void b() {
        CharSequence charSequence;
        Context context = getContext();
        boolean isChecked = isChecked();
        TextView textView = new TextView(context);
        this.c = textView;
        if (!isChecked) {
            charSequence = this.h;
        } else {
            charSequence = this.g;
        }
        textView.setText(charSequence);
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            this.c.setContentDescription(charSequence2);
        }
        addView(this.c, a(0, 1.0f, this.i, 0));
        CompoundButton compoundButton = (CompoundButton) inflate(context, R.layout.common_switch_bar_toggle_widget, (ViewGroup) null);
        this.d = compoundButton;
        compoundButton.setChecked(isChecked);
        this.d.setClickable(false);
        setSelected(isChecked);
        setEnabled(isEnabled());
        addView(this.d, a(-2, 0.0f, 0, this.j));
        setOnClickListener(this);
    }

    public SwitchBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private static LinearLayout.LayoutParams a(int i2, float f2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, -2, f2);
        layoutParams.gravity = 16;
        int i5 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(i3);
        layoutParams.setMarginEnd(i4);
        return layoutParams;
    }

    private final void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jlw.b, i2, i3);
        int i4 = 1;
        obtainStyledAttributes.getColor(1, -16777216);
        this.g = obtainStyledAttributes.getText(7);
        this.h = obtainStyledAttributes.getText(6);
        this.e = obtainStyledAttributes.getColor(5, a(context));
        this.f = obtainStyledAttributes.getColor(4, a(context));
        this.i = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.j = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (!obtainStyledAttributes.getBoolean(0, false)) {
                i4 = 2;
            }
            this.k = i4;
        } else {
            this.k = 0;
        }
        obtainStyledAttributes.recycle();
        setOrientation(0);
        int i5 = Build.VERSION.SDK_INT;
        setBackgroundResource(R.drawable.common_switch_bar_background);
        if (this.k != 0) {
            b();
        }
    }

    public final TextView a() {
        if (this.c == null) {
            b();
        }
        return this.c;
    }

    public final void a(boolean z) {
        jmo jmo = this.a;
        this.a = null;
        setChecked(z);
        this.a = jmo;
    }
}
