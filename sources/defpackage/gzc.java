package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: gzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gzc {
    public final amsn a;
    public final amsn b;
    public final aucd c = gzb.j.o();

    public gzc(amtd amtd) {
        this.a = amsn.a(amtd);
        this.b = amsn.a(amtd);
    }

    public final gzb a() {
        amsn amsn = this.b;
        if (amsn.a) {
            aucd aucd = this.c;
            long a2 = amsn.a(TimeUnit.MILLISECONDS);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzb gzb = (gzb) aucd.b;
            gzb gzb2 = gzb.j;
            gzb.a |= 64;
            gzb.h = a2;
            this.b.e();
        }
        aucd aucd2 = this.c;
        long a3 = this.a.a(TimeUnit.MILLISECONDS);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        gzb gzb3 = (gzb) aucd2.b;
        gzb gzb4 = gzb.j;
        gzb3.a |= 2;
        gzb3.c = a3;
        this.a.e();
        aucd aucd3 = this.c;
        if ((((gzb) aucd3.b).a & 1) == 0) {
            aucd o = gza.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            gza gza = (gza) o.b;
            "".getClass();
            gza.a |= 1;
            gza.b = "";
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            gzb gzb5 = (gzb) aucd3.b;
            gza gza2 = (gza) o.i();
            gza2.getClass();
            gzb5.b = gza2;
            gzb5.a |= 1;
        }
        aucd aucd4 = this.c;
        if ((((gzb) aucd4.b).a & 4) == 0) {
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            gzb gzb6 = (gzb) aucd4.b;
            gzb6.a |= 4;
            gzb6.d = 0;
        }
        aucd aucd5 = this.c;
        if ((((gzb) aucd5.b).a & 8) == 0) {
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            gzb gzb7 = (gzb) aucd5.b;
            gzb7.a |= 8;
            gzb7.e = false;
        }
        aucd aucd6 = this.c;
        if ((((gzb) aucd6.b).a & 128) == 0) {
            if (aucd6.c) {
                aucd6.c();
                aucd6.c = false;
            }
            gzb gzb8 = (gzb) aucd6.b;
            gzb8.a |= 128;
            gzb8.i = 1;
        }
        aucd aucd7 = this.c;
        if ((((gzb) aucd7.b).a & 32) == 0) {
            if (aucd7.c) {
                aucd7.c();
                aucd7.c = false;
            }
            gzb gzb9 = (gzb) aucd7.b;
            gzb9.a |= 32;
            gzb9.g = false;
        }
        aucd aucd8 = this.c;
        if ((((gzb) aucd8.b).a & 16) == 0) {
            if (aucd8.c) {
                aucd8.c();
                aucd8.c = false;
            }
            gzb gzb10 = (gzb) aucd8.b;
            gzb10.a |= 16;
            gzb10.f = false;
        }
        return (gzb) this.c.i();
    }

    public final void b() {
        this.b.e();
        aucd aucd = this.c;
        long a2 = this.b.a(TimeUnit.MILLISECONDS);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzb gzb = (gzb) aucd.b;
        gzb gzb2 = gzb.j;
        gzb.a |= 64;
        gzb.h = a2;
    }
}
