package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.gms.R;

/* renamed from: ajus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajus {
    public final ajur a;
    final ajur b;
    final ajur c;
    final ajur d;
    final ajur e;
    final ajur f;
    final ajur g;
    public final Paint h;

    public ajus(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ajyl.a(context, (int) R.attr.materialCalendarStyle, ajvf.class.getCanonicalName()), ajvw.a);
        this.a = ajur.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.g = ajur.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.b = ajur.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.c = ajur.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a2 = ajym.a(context, obtainStyledAttributes, 5);
        this.d = ajur.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.e = ajur.a(context, obtainStyledAttributes.getResourceId(6, 0));
        this.f = ajur.a(context, obtainStyledAttributes.getResourceId(8, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
