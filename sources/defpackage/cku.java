package defpackage;

import java.text.SimpleDateFormat;

/* renamed from: cku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cku {
    private static SimpleDateFormat a;

    public static String a(long j) {
        if (a == null) {
            a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
        }
        return a.format(Long.valueOf(j));
    }
}
