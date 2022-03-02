package defpackage;

/* renamed from: agns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agns implements agnt {
    public final /* bridge */ /* synthetic */ String a(audw audw) {
        return ((barz) ((aucd) audw).b).d;
    }

    public final /* bridge */ /* synthetic */ String b(audw audw) {
        return ((barz) ((aucd) audw).b).b;
    }

    public final /* bridge */ /* synthetic */ void c(audw audw) {
        aucd aucd = (aucd) audw;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        barz barz = (barz) aucd.b;
        barz barz2 = barz.m;
        barz.a &= -5;
        barz.d = barz.m.d;
    }

    public final /* bridge */ /* synthetic */ void a(audw audw, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            aucd aucd = (aucd) audw;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barz barz = (barz) aucd.b;
            barz barz2 = barz.m;
            barz.a |= 2;
            barz.c = longValue;
            return;
        }
        aucd aucd2 = (aucd) audw;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        barz barz3 = (barz) aucd2.b;
        barz barz4 = barz.m;
        barz3.a &= -3;
        barz3.c = 0;
    }
}
