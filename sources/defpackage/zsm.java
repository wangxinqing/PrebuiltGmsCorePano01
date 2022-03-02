package defpackage;

import android.os.Build;

/* renamed from: zsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsm {
    public static boolean a(String str) {
        if (Build.VERSION.SDK_INT < 23 || ixk.a.a(str) == 0) {
            return true;
        }
        return false;
    }
}
