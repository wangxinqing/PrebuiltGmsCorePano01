package com.google.android.gms.drivingmode;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GearPreference extends TwoTargetPreference implements View.OnClickListener {
    public lwn a;
    private boolean b = true;

    public GearPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(anb anb) {
        super.a(anb);
        View c = anb.c(R.id.settings_button);
        if (this.a != null) {
            c.setOnClickListener(this);
        } else {
            c.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public final int g() {
        return R.layout.car_preference_widget_gear;
    }

    public final void h(boolean z) {
        this.b = z;
        b();
    }

    public void onClick(View view) {
        lwn lwn;
        if (view.getId() == R.id.settings_button && (lwn = this.a) != null) {
            lwr lwr = lwn.a;
            Intent intent = lwn.b;
            lwr.d.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_PREFERENCE_GEAR_CLICKED);
            lwr.startActivityForResult(intent, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return !this.b;
    }

    public final void a(lwn lwn) {
        this.a = lwn;
        b();
    }
}
