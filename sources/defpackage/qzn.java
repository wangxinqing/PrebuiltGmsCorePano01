package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qzn implements amqy {
    private final AtomicReference a;

    public qzn(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final Object a(Object obj) {
        this.a.set((afyl) obj);
        return null;
    }
}
