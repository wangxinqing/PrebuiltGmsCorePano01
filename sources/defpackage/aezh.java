package defpackage;

/* renamed from: aezh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aezh extends awem {
    private final awef b;

    public aezh(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aezh.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        amzy amzy;
        aeuy aeuy = (aeuy) obj;
        afdo a = aeuy.a().a();
        try {
            if (aeuy.g()) {
                amzy = amzy.a(aeuy.f());
            } else {
                amzy = amzy.h();
            }
            a.close();
            return aorl.a((Object) amzy);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
