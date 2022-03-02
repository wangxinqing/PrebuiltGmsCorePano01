package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: pd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pd {
    public static int a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }
}
