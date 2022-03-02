package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ahqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqm {
    public final ahqw a;
    public volatile long b;
    public final AtomicLong c;
    public final AtomicLong d;
    private volatile boolean e = false;

    public ahqm(int i) {
        new AtomicLong(0);
        new AtomicLong(0);
        this.c = new AtomicLong();
        this.d = new AtomicLong();
        this.a = new ahqw(i);
    }
}
