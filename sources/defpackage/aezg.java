package defpackage;

/* renamed from: aezg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aezg extends awem {
    private final awef b;

    public aezg(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aezg.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aeuy aeuy = (aeuy) obj;
        afdo a = aeuy.a().a();
        try {
            aumr a2 = aeuy.a(a);
            a.close();
            return aorl.a((Object) a2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
