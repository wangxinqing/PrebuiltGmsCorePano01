package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: ph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ph {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginStart();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginEnd();
    }

    public static void a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd(i);
    }
}
