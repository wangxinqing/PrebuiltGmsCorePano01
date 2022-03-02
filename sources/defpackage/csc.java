package defpackage;

/* renamed from: csc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csc extends au {
    private final as a;
    private final as h;
    private final csb i;

    public csc(as asVar, as asVar2, csb csb) {
        this.a = asVar;
        this.h = asVar2;
        this.i = csb;
        a(asVar, new crz(this));
        a(asVar2, new csa(this));
    }

    public final void e() {
        Object b = this.a.b();
        Object b2 = this.h.b();
        if (b != null && b2 != null) {
            Object a2 = this.i.a(b, b2);
            if (!a2.equals(b())) {
                b(a2);
            }
        }
    }
}
