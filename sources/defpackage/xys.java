package defpackage;

/* renamed from: xys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xys {
    public final xvw a;
    private final yaz b;

    public xys(yaz yaz, xvw xvw) {
        this.b = yaz;
        this.a = xvw;
    }

    public final void a(Long l) {
        xvx xvx = this.a.c;
        xvx.a(xvx.a, "dirty", l);
    }

    public final void b(Long l) {
        this.a.c.a(l, true);
    }

    public final void a(yad yad, boolean z) {
        yad yad2 = yad;
        xvx xvx = this.a.c;
        xvu xvu = (xvu) yad2.b;
        xvu xvu2 = (xvu) yad2.a;
        xip.a();
        boolean z2 = (!((Boolean) xfu.a.a()).booleanValue()) | z;
        iva.a((Object) xvu2);
        if (xvu2.f()) {
            if (z) {
                this.b.a(xnd.REMOVE, xjo.GROUP, true, 1, 1);
            }
            if (xvu == null) {
                this.b.a(xnd.REMOVE, xjo.GROUP, z, 3, 1);
                return;
            }
            if (xvu.e()) {
                this.b.a(xnd.REMOVE, xjo.GROUP, z, 4, 1);
            }
            xvx.a(xvu.g(), true);
        } else if (xvu != null) {
            if (z) {
                this.b.a(xnd.UPDATE, xjo.GROUP, true, 1, 1);
                if (xvu.e()) {
                    this.b.a(xnd.UPDATE, xjo.GROUP, true, 4, 1);
                }
            }
            Long g = xvu.g();
            xvx.a(xvx.a, g.longValue(), "version", xvu.h());
            xvx.a(xvx.a, g, xvu2.s(), z2);
        } else {
            if (z) {
                this.b.a(xnd.INSERT, xjo.GROUP, true, 1, 1);
            }
            xvx.a(xvx.a, "sourceid", xvu2.j());
            xvx.a(xvx.a, xvu2.s(), z2);
        }
    }
}
