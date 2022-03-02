package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: anec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anec implements andl {
    public static final anec a = new anec();

    public final /* bridge */ /* synthetic */ andk a(andp andp, andk andk, andk andk2) {
        anee anee = (anee) andp;
        aned aned = (aned) andk;
        aned aned2 = (aned) andk2;
        if (aned.get() == null || andp.a((andk) aned)) {
            return null;
        }
        ReferenceQueue referenceQueue = anee.h;
        ReferenceQueue referenceQueue2 = anee.i;
        aned aned3 = new aned(referenceQueue, aned.get(), aned.a, aned2);
        aned3.c = aned.c.a(referenceQueue2, aned3);
        return aned3;
    }

    public final andr b() {
        return andr.WEAK;
    }

    public final /* bridge */ /* synthetic */ andk a(andp andp, Object obj, int i, andk andk) {
        return new aned(((anee) andp).h, obj, i, (aned) andk);
    }

    public final /* bridge */ /* synthetic */ andp a(anej anej, int i) {
        return new anee(anej, i);
    }

    public final andr a() {
        return andr.WEAK;
    }

    public final /* bridge */ /* synthetic */ void a(andp andp, andk andk, Object obj) {
        aned aned = (aned) andk;
        ReferenceQueue referenceQueue = ((anee) andp).i;
        aneg aneg = aned.c;
        aned.c = new aneh(referenceQueue, obj, aned);
        aneg.clear();
    }
}
