package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ToggleButtonPreference extends TwoTargetPreference {
    public Button a;
    public Button b;
    public lwo c;
    private final View.OnClickListener d = new lxf(this);

    public ToggleButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(anb anb) {
        super.a(anb);
        LinearLayout linearLayout = (LinearLayout) anb.c(16908312);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setPadding(0, 0, 0, 0);
        this.a = (Button) anb.c(R.id.on_button);
        this.b = (Button) anb.c(R.id.off_button);
        this.a.setOnClickListener(this.d);
        this.b.setOnClickListener(this.d);
    }

    /* access modifiers changed from: protected */
    public final int g() {
        return R.layout.car_preference_widget_toggle_button;
    }

    public final void h(boolean z) {
        if (z) {
            this.a.setVisibility(0);
            this.b.setVisibility(8);
            return;
        }
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }
}
