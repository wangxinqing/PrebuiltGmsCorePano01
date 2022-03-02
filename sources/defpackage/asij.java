package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: asij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asij extends asik {
    final /* synthetic */ AtomicInteger a;

    public asij(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public final Integer a() {
        return Integer.valueOf(this.a.getAndIncrement());
    }
}
