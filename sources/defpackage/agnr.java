package defpackage;

/* renamed from: agnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agnr implements agnt {
    public final /* bridge */ /* synthetic */ String a(audw audw) {
        return ((baqm) ((aucd) audw).b).d;
    }

    public final /* bridge */ /* synthetic */ String b(audw audw) {
        return ((baqm) ((aucd) audw).b).e;
    }

    public final /* bridge */ /* synthetic */ void c(audw audw) {
        aucd aucd = (aucd) audw;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        baqm baqm = (baqm) aucd.b;
        baqm baqm2 = baqm.k;
        baqm.a &= -5;
        baqm.d = baqm.k.d;
    }

    public final /* bridge */ /* synthetic */ void a(audw audw, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            aucd aucd = (aucd) audw;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            baqm baqm = (baqm) aucd.b;
            baqm baqm2 = baqm.k;
            baqm.a |= 2;
            baqm.c = longValue;
            return;
        }
        aucd aucd2 = (aucd) audw;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        baqm baqm3 = (baqm) aucd2.b;
        baqm baqm4 = baqm.k;
        baqm3.a &= -3;
        baqm3.c = 0;
    }
}
