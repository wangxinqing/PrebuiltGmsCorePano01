package defpackage;

/* renamed from: agnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agnq implements agnt {
    public final /* bridge */ /* synthetic */ String a(audw audw) {
        return ((basu) ((aucd) audw).b).d;
    }

    public final /* bridge */ /* synthetic */ String b(audw audw) {
        return ((basu) ((aucd) audw).b).n;
    }

    public final /* bridge */ /* synthetic */ void c(audw audw) {
        aucd aucd = (aucd) audw;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        basu basu = (basu) aucd.b;
        basu basu2 = basu.s;
        basu.a &= -5;
        basu.d = basu.s.d;
    }

    public final /* bridge */ /* synthetic */ void a(audw audw, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            aucd aucd = (aucd) audw;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            basu basu = (basu) aucd.b;
            basu basu2 = basu.s;
            basu.a |= 2;
            basu.c = longValue;
            return;
        }
        aucd aucd2 = (aucd) audw;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        basu basu3 = (basu) aucd2.b;
        basu basu4 = basu.s;
        basu3.a &= -3;
        basu3.c = 0;
    }
}
