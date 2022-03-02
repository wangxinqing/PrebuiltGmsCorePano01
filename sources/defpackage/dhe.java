package defpackage;

/* renamed from: dhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dhe {
    public static final as a = a((Object) ampu.a);
    public static final as b = a((Object) ampu.a);
    public final dfd c;
    public final aw d = new aw();
    public final aw e = new aw();
    private final dgm f;

    public dhe(dfd dfd, dgm dgm) {
        this.c = dfd;
        this.f = dgm;
        a();
    }

    private static final as a(Object obj) {
        aw awVar = new aw();
        awVar.b(obj);
        return awVar;
    }

    public final as b() {
        return bk.b(this.d, new dgy(this));
    }

    public final void a() {
        this.e.b(ampu.a);
        this.d.b(ampu.a);
    }

    public final void a(aqsr aqsr, aqsr aqsr2, int i) {
        if (aqsr2 != null) {
            dgm dgm = this.f;
            int i2 = i - 1;
            int i3 = 5;
            if (i2 == 0) {
                i3 = 6;
            } else if (i2 == 1) {
                i3 = 2;
            } else if (i2 == 2) {
                i3 = 3;
            } else if (i2 == 3) {
                i3 = 4;
            } else if (i2 != 4) {
                i3 = i2 != 5 ? 12 : 8;
            }
            dgm.a(aqsr, aqsr2, i3);
            this.c.a(aqsr2);
            this.e.b(ampu.a);
            this.d.b(amri.b(new dhb(aqsr2, i)));
        }
    }

    public final void a(dhd dhd) {
        this.e.b(amri.b(dhd));
        this.d.b(ampu.a);
    }
}
