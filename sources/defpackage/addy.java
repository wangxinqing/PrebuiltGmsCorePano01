package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: addy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class addy implements amqy {
    private final AtomicReference a;
    private final acyb b;

    public addy(AtomicReference atomicReference, acyb acyb) {
        this.a = atomicReference;
        this.b = acyb;
    }

    public final Object a(Object obj) {
        AtomicReference atomicReference = this.a;
        acyb acyb = this.b;
        acyb acyb2 = (acyb) obj;
        if (acyb.d.equals(acyb2)) {
            atomicReference.set((Object) null);
        } else {
            atomicReference.set(acyb2);
        }
        return acyb;
    }
}
