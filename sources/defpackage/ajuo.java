package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.google.android.gms.R;

/* renamed from: ajuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajuo {
    public static int a(int i, int i2, float f) {
        return lk.a(lk.b(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    public static int a(Context context, int i) {
        TypedValue a = ajyl.a(context, i);
        if (a != null) {
            return a.data;
        }
        return 0;
    }

    public static int a(Context context, String str) {
        return ajyl.a(context, (int) R.attr.colorSurface, str);
    }
}
