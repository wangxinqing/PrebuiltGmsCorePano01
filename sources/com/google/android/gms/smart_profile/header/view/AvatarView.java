package com.google.android.gms.smart_profile.header.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AvatarView extends ImageView {
    private static Paint a;
    private static int b;

    public AvatarView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) getWidth()) / 2.0f;
        if (width > 0.0f) {
            canvas.drawCircle(width, width, width - (((float) b) / 2.0f), a);
        }
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b = (int) context.getResources().getDimension(R.dimen.profile_header_avatar_border_width);
        Paint paint = new Paint();
        a = paint;
        paint.setAntiAlias(true);
        a.setStrokeWidth((float) b);
        if (azim.b()) {
            a.setColor(jsa.a(context));
        } else {
            a.setColor(kf.b(getContext(), R.color.profile_header_avatar_border));
        }
        a.setStyle(Paint.Style.STROKE);
    }
}
