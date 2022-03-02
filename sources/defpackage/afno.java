package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: afno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afno implements amqy {
    private final afnt a;
    private final AtomicInteger b;
    private final aflh c;

    public afno(afnt afnt, AtomicInteger atomicInteger, aflh aflh) {
        this.a = afnt;
        this.b = atomicInteger;
        this.c = aflh;
    }

    public final Object a(Object obj) {
        afnt afnt = this.a;
        AtomicInteger atomicInteger = this.b;
        aflh aflh = this.c;
        if (((Boolean) obj).booleanValue()) {
            atomicInteger.getAndIncrement();
            return null;
        }
        afnt.e.b(1036);
        afsh.a("%s: Unsubscribe from file %s failed!", (Object) "ExpirationHandler", (Object) aflh);
        return null;
    }
}
