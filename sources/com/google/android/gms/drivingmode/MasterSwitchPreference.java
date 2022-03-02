package com.google.android.gms.drivingmode;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MasterSwitchPreference extends TwoTargetPreference {
    public SwitchCompat a;
    public boolean b;
    public CompoundButton.OnCheckedChangeListener c;
    private boolean d = true;

    public MasterSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(anb anb) {
        super.a(anb);
        View c2 = anb.c(16908312);
        if (c2 != null) {
            c2.setOnClickListener(new lxd(this));
        }
        SwitchCompat switchCompat = (SwitchCompat) anb.c(R.id.switch_widget);
        this.a = switchCompat;
        switchCompat.setContentDescription(this.r);
        this.a.setChecked(this.b);
        this.a.setEnabled(this.d);
        this.a.setOnCheckedChangeListener(this.c);
    }

    /* access modifiers changed from: protected */
    public final int g() {
        return R.layout.car_preference_widget_master_switch;
    }

    public final void h(boolean z) {
        this.b = z;
        SwitchCompat switchCompat = this.a;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }
}
