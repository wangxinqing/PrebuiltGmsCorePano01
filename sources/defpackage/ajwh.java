package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.gms.R;

/* renamed from: ajwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajwh {
    public final boolean a;
    public final int b;
    private final int c;
    private final float d;

    public ajwh(Context context) {
        this.a = ajyl.a(context, (int) R.attr.elevationOverlayEnabled, false);
        this.c = ajuo.a(context, (int) R.attr.elevationOverlayColor);
        this.b = ajuo.a(context, (int) R.attr.colorSurface);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public final int a(int i, float f) {
        if (!this.a || lk.b(i, 255) != this.b) {
            return i;
        }
        float f2 = this.d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return lk.b(ajuo.a(lk.b(i, 255), this.c, f3), Color.alpha(i));
    }
}
