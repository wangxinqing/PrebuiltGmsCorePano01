package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {
    private boolean a = false;

    public SwitchItem() {
    }

    public void a(View view) {
        super.a(view);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.sud_items_switch);
        switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        switchCompat.setChecked(this.a);
        switchCompat.setOnCheckedChangeListener(this);
        switchCompat.setEnabled(d());
    }

    /* access modifiers changed from: protected */
    public int f() {
        return R.layout.sud_items_switch;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a = z;
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alhx.r);
        this.a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
