package com.android.setupwizardlib.items;

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
import com.android.setupwizardlib.view.CheckableLinearLayout;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExpandableSwitchItem extends SwitchItem implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private CharSequence g;
    private CharSequence h;
    private boolean i = false;

    public ExpandableSwitchItem() {
    }

    public final void a(View view) {
        super.a(view);
        View findViewById = view.findViewById(R.id.suw_items_expandable_switch_content);
        findViewById.setOnClickListener(this);
        if (findViewById instanceof CheckableLinearLayout) {
            ((CheckableLinearLayout) findViewById).setChecked(this.i);
        }
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{16842806});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (colorStateList != null) {
            TextView textView = (TextView) view.findViewById(R.id.suw_items_title);
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
        return R.layout.suw_items_expandable_switch;
    }

    public final CharSequence g() {
        return !this.i ? this.g : this.h;
    }

    public void onClick(View view) {
        boolean z = this.i;
        boolean z2 = !z;
        if (z != z2) {
            this.i = z2;
            b();
        }
    }

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bdg.e);
        this.g = obtainStyledAttributes.getText(0);
        this.h = obtainStyledAttributes.getText(1);
        obtainStyledAttributes.recycle();
    }
}
