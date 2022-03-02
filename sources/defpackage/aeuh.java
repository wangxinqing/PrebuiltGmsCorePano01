package defpackage;

/* renamed from: aeuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeuh extends awem {
    private final awef b;

    public aeuh(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aeuh.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aukv aukv;
        aukh aukh = (aukh) obj;
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        auku a = auku.a(aukv.d);
        if (a == null) {
            a = auku.UNKNOWN;
        }
        return aorl.a((Object) a);
    }
}
