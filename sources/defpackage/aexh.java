package defpackage;

/* renamed from: aexh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexh extends awem {
    private final awef b;

    public aexh(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aexh.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aevm aevm = (aevm) obj;
        afdo a = aevm.c().a();
        try {
            aumr a2 = aevm.a(a);
            a.close();
            return aorl.a((Object) a2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
