package defpackage;

import android.os.Build;

/* renamed from: ahwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwx {
    public static boolean a = false;

    public static boolean a() {
        return !a || Build.VERSION.SDK_INT < 26;
    }
}
