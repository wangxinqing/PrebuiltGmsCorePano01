package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {
    public boolean e = false;
    public bds f;

    public SwitchItem() {
    }

    public void a(View view) {
        super.a(view);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.suw_items_switch);
        switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        switchCompat.setChecked(this.e);
        switchCompat.setOnCheckedChangeListener(this);
        switchCompat.setEnabled(this.b);
    }

    /* access modifiers changed from: protected */
    public int f() {
        return R.layout.suw_items_switch;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.e = z;
        bds bds = this.f;
        if (bds != null) {
            bds.a(z);
        }
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bdg.r);
        this.e = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            b();
            bds bds = this.f;
            if (bds != null) {
                bds.a(z);
            }
        }
    }
}
