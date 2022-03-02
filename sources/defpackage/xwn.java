package defpackage;

/* renamed from: xwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwn {
    public final xwo a;

    public xwn(xwo xwo) {
        this.a = xwo;
    }

    public final long a() {
        return this.a.a().f;
    }

    public final void a(xvk xvk) {
        if (xvk != null) {
            xwo xwo = this.a;
            xwo.a(xwo.a(xvk));
        }
    }

    public final void b() {
        b((String) null);
    }

    public final void a(long j) {
        xdt.a("FSA2_PeopleSyncState", "@setLastFullSynctime = %d", Long.valueOf(j));
        xvk a2 = this.a.a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        xvk xvk = (xvk) aucd.b;
        xvk xvk2 = xvk.g;
        xvk.a |= 32;
        xvk.f = j;
        a((xvk) aucd.i());
    }

    public final void b(String str) {
        xvk a2 = this.a.a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (str == null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xvk xvk = (xvk) aucd.b;
            xvk xvk2 = xvk.g;
            xvk.a &= -5;
            xvk.d = xvk.g.d;
        } else {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xvk xvk3 = (xvk) aucd.b;
            xvk xvk4 = xvk.g;
            str.getClass();
            xvk3.a |= 4;
            xvk3.d = str;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        xvk xvk5 = (xvk) aucd.b;
        xvk5.a &= -9;
        xvk5.e = xvk.g.e;
        a((xvk) aucd.i());
    }

    public final void a(String str) {
        xvk a2 = this.a.a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (str == null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xvk xvk = (xvk) aucd.b;
            xvk xvk2 = xvk.g;
            xvk.a &= -2;
            xvk.b = xvk.g.b;
        } else {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xvk xvk3 = (xvk) aucd.b;
            xvk xvk4 = xvk.g;
            str.getClass();
            xvk3.a |= 1;
            xvk3.b = str;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        xvk xvk5 = (xvk) aucd.b;
        xvk5.a &= -3;
        xvk5.c = xvk.g.c;
        a((xvk) aucd.i());
    }
}
