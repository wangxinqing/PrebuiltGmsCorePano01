package defpackage;

import android.os.Build;

/* renamed from: ahtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahtz {
    public static final String a;

    static {
        String str;
        if (Build.FINGERPRINT != null) {
            String valueOf = String.valueOf(Build.FINGERPRINT);
            str = valueOf.length() == 0 ? new String("android/") : "android/".concat(valueOf);
        } else {
            str = "android";
        }
        a = str;
    }
}
