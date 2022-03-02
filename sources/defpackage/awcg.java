package defpackage;

/* renamed from: awcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class awcg implements baua {
    protected final batk a = new batk(this.c.b.bu());
    protected boolean b;
    final /* synthetic */ awcm c;

    public awcg(awcm awcm) {
        this.c = awcm;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        int i = this.c.d;
        if (i == 5) {
            awcm.a(this.a);
            awcm awcm = this.c;
            awcm.d = 6;
            awde awde = awcm.a;
            if (awde != null) {
                awde.a((awcu) awcm);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append("state: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final bauc bu() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        awcm awcm = this.c;
        if (awcm.d != 6) {
            awcm.d = 6;
            awde awde = awcm.a;
            if (awde != null) {
                awde.d();
                awcm awcm2 = this.c;
                awcm2.a.a((awcu) awcm2);
            }
        }
    }
}
