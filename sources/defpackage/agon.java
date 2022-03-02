package defpackage;

/* renamed from: agon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agon implements agod {
    private final atwa a;

    public agon(atwa atwa) {
        this.a = atwa;
    }

    public final aorr a(atwj atwj) {
        baaj baaj;
        atwa atwa = this.a;
        azxi azxi = atwa.a;
        baaj baaj2 = atwb.d;
        if (baaj2 == null) {
            synchronized (atwb.class) {
                baaj = atwb.d;
                if (baaj == null) {
                    baag a2 = baaj.a();
                    a2.c = baai.UNARY;
                    a2.d = baaj.a("footprints.oneplatform.FootprintsService", "GetDeletions");
                    a2.b();
                    a2.a = baoq.a(atwj.g);
                    a2.b = baoq.a(atwm.e);
                    baaj = a2.a();
                    atwb.d = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, atwa.b), (Object) atwj);
    }

    public final void close() {
    }

    public final aorr a(atxm atxm) {
        baaj baaj;
        atwa atwa = this.a;
        azxi azxi = atwa.a;
        baaj baaj2 = atwb.a;
        if (baaj2 == null) {
            synchronized (atwb.class) {
                baaj = atwb.a;
                if (baaj == null) {
                    baag a2 = baaj.a();
                    a2.c = baai.UNARY;
                    a2.d = baaj.a("footprints.oneplatform.FootprintsService", "Write");
                    a2.b();
                    a2.a = baoq.a(atxm.e);
                    a2.b = baoq.a(atxn.a);
                    baaj = a2.a();
                    atwb.a = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, atwa.b), (Object) atxm);
    }
}
