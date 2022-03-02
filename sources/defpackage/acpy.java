package defpackage;

import java.security.SecureRandom;

/* renamed from: acpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpy {
    public static long a() {
        long j = -1;
        while (!a(j)) {
            j = new SecureRandom().nextLong();
        }
        return j;
    }

    public static boolean a(long j) {
        return (j == -1 || j == 0) ? false : true;
    }
}
