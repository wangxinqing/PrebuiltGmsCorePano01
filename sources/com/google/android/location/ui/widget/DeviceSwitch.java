package com.google.android.location.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.location.reporting.server.RemoteDevice;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceSwitch extends LinearLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public RemoteDevice a;
    public CompoundButton b;
    public ProgressBar c;
    public TextView d;
    public TextView e;
    public ajpk f;

    public DeviceSwitch(Context context) {
        super(context);
    }

    private final void a(boolean z) {
        setOnClickListener((View.OnClickListener) null);
        this.b.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        postDelayed(new ajpj(this), 300);
        ajpk ajpk = this.f;
        if (ajpk != null) {
            ajpk.a(this.a, z);
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        a(this.b.isChecked());
    }

    public void onClick(View view) {
        a(!this.b.isChecked());
    }

    public DeviceSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DeviceSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
