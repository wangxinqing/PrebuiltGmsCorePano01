package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afym implements afyn {
    public final afyc a;
    public final aekn b;
    public final afzb c;

    public afym(afyc afyc, afzb afzb, aekn aekn) {
        this.a = afyc;
        this.c = afzb;
        this.b = aekn;
    }

    public final aorr a() {
        AtomicReference atomicReference = new AtomicReference();
        return aopr.a(this.c.a(new afxx(atomicReference)), (amqy) new afxy(this, atomicReference), (Executor) aoqm.a);
    }

    @Deprecated
    public afym(Class cls, afzb afzb, aekn aekn) {
        this.a = new afyb(cls);
        this.c = afzb;
        this.b = aekn;
    }

    public final aorr a(Enum enumR) {
        return this.c.a(new afxw(this, enumR, this.b.a()));
    }

    public final aorr a(Iterable iterable) {
        return aopr.a(a(), (aoqb) new afxz(iterable), (Executor) aoqm.a);
    }
}
