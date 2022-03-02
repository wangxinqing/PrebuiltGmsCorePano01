package defpackage;

/* renamed from: baor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baor extends baou {
    public baor(azxi azxi, azxh azxh) {
        super(azxi, azxh);
    }

    public final atwh a(atwf atwf) {
        baaj baaj;
        azxi azxi = this.a;
        baaj baaj2 = atwb.b;
        if (baaj2 == null) {
            synchronized (atwb.class) {
                baaj = atwb.b;
                if (baaj == null) {
                    baag a = baaj.a();
                    a.c = baai.UNARY;
                    a.d = baaj.a("footprints.oneplatform.FootprintsService", "GetActivityControlsSettings");
                    a.b();
                    a.a = baoq.a(atwf.g);
                    a.b = baoq.a(atwh.d);
                    baaj = a.a();
                    atwb.b = baaj;
                }
            }
            baaj2 = baaj;
        }
        return (atwh) bapb.a(azxi, baaj2, this.b, (Object) atwf);
    }

    public final atxj a(atxi atxi) {
        baaj baaj;
        azxi azxi = this.a;
        baaj baaj2 = atwb.c;
        if (baaj2 == null) {
            synchronized (atwb.class) {
                baaj = atwb.c;
                if (baaj == null) {
                    baag a = baaj.a();
                    a.c = baai.UNARY;
                    a.d = baaj.a("footprints.oneplatform.FootprintsService", "UpdateActivityControlsSettings");
                    a.b();
                    a.a = baoq.a(atxi.f);
                    a.b = baoq.a(atxj.b);
                    baaj = a.a();
                    atwb.c = baaj;
                }
            }
            baaj2 = baaj;
        }
        return (atxj) bapb.a(azxi, baaj2, this.b, (Object) atxi);
    }

    public final /* bridge */ /* synthetic */ baou a(azxi azxi, azxh azxh) {
        return new baor(azxi, azxh);
    }
}
