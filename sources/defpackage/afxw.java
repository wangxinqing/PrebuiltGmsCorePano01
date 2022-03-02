package defpackage;

import java.util.List;

/* renamed from: afxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxw implements amqy {
    private final afym a;
    private final Enum b;
    private final long c;

    public afxw(afym afym, Enum enumR, long j) {
        this.a = afym;
        this.b = enumR;
        this.c = j;
    }

    public final Object a(Object obj) {
        afys afys;
        afym afym = this.a;
        Enum enumR = this.b;
        long j = this.c;
        afys afys2 = (afys) obj;
        int a2 = afym.a.a((Object) enumR);
        int a3 = afyt.a((List) afys2.b, a2);
        if (a3 != -1) {
            aucd aucd = (aucd) afys2.c(5);
            aucd.a((aucj) afys2);
            aucd.a(a3, afyt.a((afyq) afys2.b.get(a3)));
            afys = (afys) aucd.i();
        } else {
            aucd aucd2 = (aucd) afys2.c(5);
            aucd2.a((aucj) afys2);
            aucd2.a(afyt.a(a2));
            afys = (afys) aucd2.i();
        }
        aucd aucd3 = (aucd) afys.c(5);
        aucd3.a((aucj) afys);
        int b2 = afyt.b(afys.e, a2);
        if (b2 != -1) {
            aucd3.a(b2, afyt.a(aucd3.C(b2), j));
        } else {
            aucd3.a(afyt.a(a2, j, j));
        }
        return (afys) aucd3.i();
    }
}
