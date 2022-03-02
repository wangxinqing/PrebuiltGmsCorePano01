package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: aosj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aosj {
    private String a = null;
    private Boolean b = null;

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static ThreadFactory a(aosj aosj) {
        String str = aosj.a;
        return new aosi(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0) : null, aosj.b);
    }

    public final void a() {
        this.b = true;
    }

    public final void a(String str) {
        a(str, 0);
        this.a = str;
    }
}
