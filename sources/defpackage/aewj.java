package defpackage;

/* renamed from: aewj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewj extends awem {
    private final awef b;

    public aewj(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aewj.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aevc aevc = (aevc) obj;
        afdo a = aevc.c().a();
        try {
            aumr a2 = aevc.a(a);
            a.close();
            return aorl.a((Object) a2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
