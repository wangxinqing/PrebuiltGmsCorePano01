package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zot implements amqy {
    private final AtomicReference a;

    public zot(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final Object a(Object obj) {
        return (zra) this.a.get();
    }
}
