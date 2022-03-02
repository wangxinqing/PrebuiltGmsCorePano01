package defpackage;

import android.os.Build;

/* renamed from: aglr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aglr {
    public static boolean a(aghc aghc) {
        return Build.VERSION.SDK_INT < 24 || aghc.c();
    }
}
