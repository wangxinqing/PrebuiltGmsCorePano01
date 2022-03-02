package com.google.android.gms.nearby.sharing.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RadarView extends View {
    private vwl a;

    public RadarView(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        vwl vwl = new vwl();
        this.a = vwl;
        vwl.a = new int[]{context.getColor(R.color.sharing_color_primary), context.getColor(R.color.sharing_color_radar_gradient), context.getColor(R.color.sharing_color_primary)};
        vwl.b();
        setBackground(this.a);
    }

    public final void b() {
        this.a.c();
    }

    public RadarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a() {
        vwl vwl = this.a;
        vwl.c();
        vwl.c = 0.0f;
        vwl.b = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        vwl.b.setDuration(3000);
        vwl.b.addUpdateListener(new vwk(vwl));
        vwl.b.setRepeatCount(-1);
        vwl.b.start();
    }

    public RadarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
