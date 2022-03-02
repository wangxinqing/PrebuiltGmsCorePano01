package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.view.CheckableLinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExpandableSwitchItem extends SwitchItem implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public boolean a = false;
    private CharSequence g;
    private CharSequence h;
    private final oz i = new alic(this);

    public ExpandableSwitchItem() {
        this.f = 48;
    }

    public final void a(View view) {
        super.a(view);
        View findViewById = view.findViewById(R.id.sud_items_expandable_switch_content);
        findViewById.setOnClickListener(this);
        if (findViewById instanceof CheckableLinearLayout) {
            CheckableLinearLayout checkableLinearLayout = (CheckableLinearLayout) findViewById;
            checkableLinearLayout.setChecked(this.a);
            qb.f(checkableLinearLayout, this.a ? 1 : 0);
            qb.a((View) checkableLinearLayout, this.i);
        }
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{16842806});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (colorStateList != null) {
            TextView textView = (TextView) view.findViewById(R.id.sud_items_title);
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    drawable.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            for (Drawable drawable2 : textView.getCompoundDrawablesRelative()) {
                if (drawable2 != null) {
                    drawable2.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
                }
            }
        }
        view.setFocusable(false);
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return R.layout.sud_items_expandable_switch;
    }

    public final CharSequence g() {
        return !this.a ? this.g : this.h;
    }

    public void onClick(View view) {
        a(!this.a);
    }

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alhx.e);
        this.g = obtainStyledAttributes.getText(0);
        this.h = obtainStyledAttributes.getText(1);
        this.f = obtainStyledAttributes.getInt(6, 48);
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            b();
        }
    }
}
