package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aftz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aftz implements aoqb {
    private final AtomicReference a;

    public aftz(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final aorr a(Object obj) {
        Void voidR = (Void) obj;
        aorr aorr = (aorr) this.a.get();
        amrl.a((Object) aorr, (Object) "If update was successful, new value should have been captured!");
        return aorr;
    }
}
