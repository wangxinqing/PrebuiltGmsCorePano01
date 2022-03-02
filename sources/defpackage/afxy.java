package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxy implements amqy {
    private final afym a;
    private final AtomicReference b;

    public afxy(afym afym, AtomicReference atomicReference) {
        this.a = afym;
        this.b = atomicReference;
    }

    public final Object a(Object obj) {
        afym afym = this.a;
        AtomicReference atomicReference = this.b;
        Void voidR = (Void) obj;
        afyc afyc = afym.a;
        afyc.getClass();
        return new afyl(new afya(afyc), afym.c, afym.b, (afys) atomicReference.get());
    }
}
