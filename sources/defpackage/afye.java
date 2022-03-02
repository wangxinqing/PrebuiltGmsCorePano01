package defpackage;

import java.util.List;

/* renamed from: afye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afye implements amqy {
    private final afyl a;
    private final long b;

    public afye(afyl afyl, long j) {
        this.a = afyl;
        this.b = j;
    }

    public final Object a(Object obj) {
        aucj aucj;
        afyl afyl = this.a;
        long j = this.b;
        afys afys = (afys) obj;
        aucx aucx = afyl.c.b;
        aucd aucd = (aucd) afys.c(5);
        aucd.a((aucj) afys);
        int i = 0;
        while (true) {
            long j2 = 0;
            if (i >= ((afys) aucd.b).b.size()) {
                break;
            }
            afyq B = aucd.B(i);
            int a2 = afyt.a((List) aucx, B.b);
            if (a2 != -1) {
                j2 = ((afyq) aucx.get(a2)).c;
            }
            aucd aucd2 = (aucd) B.c(5);
            aucd2.a((aucj) B);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            afyq afyq = (afyq) aucd2.b;
            afyq afyq2 = afyq.e;
            afyq.a |= 4;
            afyq.d = j2;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            afys afys2 = (afys) aucd.b;
            afyq afyq3 = (afyq) aucd2.i();
            afys afys3 = afys.f;
            afyq3.getClass();
            afys2.a();
            afys2.b.set(i, afyq3);
            i++;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        afys afys4 = (afys) aucd.b;
        afys afys5 = afys.f;
        afys4.a |= 1;
        afys4.c = j;
        afys afys6 = (afys) aucd.i();
        aucd aucd3 = (aucd) afys6.c(5);
        aucd3.a((aucj) afys6);
        for (int i2 = 0; i2 < ((afys) aucd3.b).e.size(); i2++) {
            afyr C = aucd3.C(i2);
            if ((C.a & 4) != 0) {
                aucd aucd4 = (aucd) C.c(5);
                aucd4.a((aucj) C);
                long j3 = C.d;
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                afyr afyr = (afyr) aucd4.b;
                afyr afyr2 = afyr.e;
                afyr.a |= 2;
                afyr.c = j3;
                aucj = aucd4.i();
            } else {
                aucd aucd5 = (aucd) C.c(5);
                aucd5.a((aucj) C);
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                afyr afyr3 = (afyr) aucd5.b;
                afyr afyr4 = afyr.e;
                afyr3.a &= -3;
                afyr3.c = 0;
                aucj = aucd5.i();
            }
            aucd3.a(i2, (afyr) aucj);
        }
        return (afys) aucd3.i();
    }
}
