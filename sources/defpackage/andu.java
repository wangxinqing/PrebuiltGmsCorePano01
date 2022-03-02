package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: andu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class andu implements andl {
    public static final andu a = new andu();

    public final /* bridge */ /* synthetic */ andk a(andp andp, andk andk, andk andk2) {
        andw andw = (andw) andp;
        andv andv = (andv) andk;
        andv andv2 = (andv) andk2;
        if (andp.a((andk) andv)) {
            return null;
        }
        ReferenceQueue referenceQueue = andw.h;
        andv andv3 = new andv(andv.a, andv.b, andv2);
        andv3.d = andv.d.a(referenceQueue, andv3);
        return andv3;
    }

    public final andr b() {
        return andr.WEAK;
    }

    public final /* bridge */ /* synthetic */ andk a(andp andp, Object obj, int i, andk andk) {
        andw andw = (andw) andp;
        return new andv(obj, i, (andv) andk);
    }

    public final /* bridge */ /* synthetic */ andp a(anej anej, int i) {
        return new andw(anej, i);
    }

    public final andr a() {
        return andr.STRONG;
    }

    public final /* bridge */ /* synthetic */ void a(andp andp, andk andk, Object obj) {
        andv andv = (andv) andk;
        ReferenceQueue referenceQueue = ((andw) andp).h;
        aneg aneg = andv.d;
        andv.d = new aneh(referenceQueue, obj, andv);
        aneg.clear();
    }
}
