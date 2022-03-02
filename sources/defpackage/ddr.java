package defpackage;

/* renamed from: ddr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ddr implements ax {
    private final dee a;

    public ddr(dee dee) {
        this.a = dee;
    }

    public final void a(Object obj) {
        aqsy aqsy;
        dee dee = this.a;
        aqso aqso = ((csl) obj).a;
        if (aqso.b != 9 || ((aqsy) aqso.c).b.size() == 0) {
            dee.c.setVisibility(8);
            return;
        }
        if (aqso.b == 9) {
            aqsy = (aqsy) aqso.c;
        } else {
            aqsy = aqsy.e;
        }
        dee.g = aqsy;
        dee.c.setVisibility(0);
    }
}
