package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ankd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ankd extends anjx {
    public static final ankd a = new ankd();

    private ankd() {
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final String toString() {
        return "Default millisecond precision clock";
    }
}
