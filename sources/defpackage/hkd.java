package defpackage;

import android.content.Intent;

/* renamed from: hkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkd {
    public static Intent a(String str) {
        if (!jkr.a() || !str.startsWith("android-app:")) {
            return Intent.parseUri(str, 1);
        }
        return Intent.parseUri(str, 2);
    }

    public static String a(Intent intent) {
        if (jkr.a()) {
            return intent.toUri(2);
        }
        return intent.toUri(1);
    }
}
