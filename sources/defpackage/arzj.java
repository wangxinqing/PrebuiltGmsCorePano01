package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: arzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arzj {
    public final Runnable a;
    public final AtomicBoolean b;
    public final int c;

    public arzj(Runnable runnable, AtomicBoolean atomicBoolean, int i) {
        this.a = runnable == null ? arzg.a : runnable;
        this.b = atomicBoolean == null ? new AtomicBoolean(false) : atomicBoolean;
        this.c = i;
    }
}
