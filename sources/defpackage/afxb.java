package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxb implements amqy {
    private final AtomicReference a;

    public afxb(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final Object a(Object obj) {
        afxk afxk = (afxk) obj;
        this.a.set((aqxl) afxk.a());
        return (afus) afxk.b();
    }
}
