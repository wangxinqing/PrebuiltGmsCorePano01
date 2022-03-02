package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: gvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gvn {
    private static gvn b;
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    private gvn() {
    }

    public static synchronized gvn a() {
        gvn gvn;
        synchronized (gvn.class) {
            if (b == null) {
                b = new gvn();
            }
            gvn = b;
        }
        return gvn;
    }
}
