package com.google.android.gms.smart_profile.header.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CircleView extends AvatarView {
    public Paint a = new Paint(1);

    public CircleView(Context context) {
        super(context);
        if (!azim.b() || !azhl.b()) {
            this.a.setColor(jpr.a(kf.b(getContext(), R.color.default_theme_color)));
        } else {
            this.a.setColor(azho.b() ? jsa.f(getContext()) : jsa.b(getContext()));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(R.dimen.profile_header_avatar_border_width);
        float height = (((float) getHeight()) / 2.0f) - dimensionPixelSize;
        float f = dimensionPixelSize + height;
        canvas.drawCircle(f, f, height, this.a);
    }

    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!azim.b() || !azhl.b()) {
            this.a.setColor(jpr.a(kf.b(getContext(), R.color.default_theme_color)));
        } else {
            this.a.setColor(azho.b() ? jsa.f(getContext()) : jsa.b(getContext()));
        }
    }

    public CircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!azim.b() || !azhl.b()) {
            this.a.setColor(jpr.a(kf.b(getContext(), R.color.default_theme_color)));
        } else {
            this.a.setColor(azho.b() ? jsa.f(getContext()) : jsa.b(getContext()));
        }
    }
}
