package defpackage;

import android.os.Build;

/* renamed from: mm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mm {
    @Deprecated
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean b() {
        return Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'R' && Build.VERSION.CODENAME.charAt(0) <= 'Z';
    }
}
