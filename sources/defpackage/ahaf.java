package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahaf implements amqy {
    private final AtomicInteger a;

    public ahaf(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public final Object a(Object obj) {
        Void voidR = (Void) obj;
        return Integer.valueOf(this.a.get());
    }
}
