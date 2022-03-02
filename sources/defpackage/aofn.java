package defpackage;

/* renamed from: aofn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aofn extends aucd implements audy {
    public aofn() {
        super((aucj) aofo.e);
    }

    public final void a(aofp aofp) {
        if (this.c) {
            c();
            this.c = false;
        }
        aofo aofo = (aofo) this.b;
        aofo aofo2 = aofo.e;
        aofp.getClass();
        aofo.a();
        aofo.d.add(aofp);
    }

    public final void a(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        aofo aofo = (aofo) this.b;
        aofp aofp = (aofp) aucd.i();
        aofo aofo2 = aofo.e;
        aofp.getClass();
        aofo.a();
        aofo.d.add(aofp);
    }

    public final void a(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        aofo aofo = (aofo) this.b;
        aofo aofo2 = aofo.e;
        str.getClass();
        if (!aofo.c.a()) {
            aofo.c = aucj.a(aofo.c);
        }
        aofo.c.add(str);
    }
}
