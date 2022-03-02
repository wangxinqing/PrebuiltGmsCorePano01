package defpackage;

/* renamed from: qpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpo extends awem {
    private final awef b;

    public qpo(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(qpo.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        qpk qpk;
        qpk qpk2 = (qpk) obj;
        Boolean bool = qpk2.a;
        Long l = qpk2.b;
        if (l != null) {
            qpk = new qpk(bool, l);
        } else {
            qpk = new qpk(bool, (Long) null);
        }
        return aorl.a((Object) qpk);
    }
}
