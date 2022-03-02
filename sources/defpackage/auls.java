package defpackage;

/* renamed from: auls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auls extends baos {
    public auls(azxi azxi, azxh azxh) {
        super(azxi, azxh);
    }

    public final aorr a(auli auli) {
        baaj baaj;
        azxi azxi = this.a;
        baaj baaj2 = ault.a;
        if (baaj2 == null) {
            synchronized (ault.class) {
                baaj = ault.a;
                if (baaj == null) {
                    baag a = baaj.a();
                    a.c = baai.UNARY;
                    a.d = baaj.a("search.mdh.MobileDataHubCore", "GetChanges");
                    a.b();
                    a.a = baoq.a(auli.f);
                    a.b = baoq.a(aull.e);
                    baaj = a.a();
                    ault.a = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, this.b), (Object) auli);
    }

    public final aorr a(aung aung) {
        baaj baaj;
        azxi azxi = this.a;
        baaj baaj2 = ault.b;
        if (baaj2 == null) {
            synchronized (ault.class) {
                baaj = ault.b;
                if (baaj == null) {
                    baag a = baaj.a();
                    a.c = baai.UNARY;
                    a.d = baaj.a("search.mdh.MobileDataHubCore", "UploadChanges");
                    a.b();
                    a.a = baoq.a(aung.h);
                    a.b = baoq.a(aunk.e);
                    baaj = a.a();
                    ault.b = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, this.b), (Object) aung);
    }

    public final /* bridge */ /* synthetic */ baou a(azxi azxi, azxh azxh) {
        return new auls(azxi, azxh);
    }
}
