package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: ahrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrr implements ahss {
    public final ahry a;
    final /* synthetic */ ahrs b;
    private final ahrl c;
    private volatile boolean d = false;
    private volatile List e = ahvx.a();

    public ahrr(ahrs ahrs, ahrl ahrl, ahry ahry) {
        this.b = ahrs;
        this.c = ahrl;
        this.a = ahry;
    }

    private final synchronized void a(String str, int i) {
        a(str, this.c.c(i));
    }

    private final synchronized void b(String str) {
        if (!this.d && this.c.b() != null) {
            this.d = true;
            this.b.m.countDown();
            if (this.a != null) {
                this.b.e.post(new ahrq(this, str));
            }
        }
    }

    public final void a() {
    }

    public final void a(int i) {
    }

    public final void a(int i, aqek aqek) {
    }

    public final void a(int i, String str) {
    }

    public final void a(int i, String str, String str2) {
    }

    public final void a(ahuz ahuz) {
    }

    public final void a(aqek aqek) {
    }

    public final void a(String str) {
    }

    public final void a(Map map) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public final synchronized void k() {
    }

    public final synchronized void a(String str, int i, aqek aqek) {
        this.c.a(i, true);
        if (this.a != null) {
            this.b.e.post(new ahro(this));
        }
        if (!this.b.j && !ahvx.a(str)) {
            this.c.c(str);
            if (this.b.c(str)) {
                this.b.j = true;
            }
        }
        a(str, i);
    }

    public final synchronized void a(String str, int i, String str2) {
        this.c.a(i, false);
        if (this.a != null) {
            this.b.e.post(new ahrn(this));
        }
        a(str, i);
    }

    public final synchronized void a(String str, String str2) {
        if (!this.e.contains(str2)) {
            this.c.a.size();
            ahvw a2 = this.c.a(str2);
            if (a2 != null) {
                String b2 = this.c.b(str2);
                String valueOf = String.valueOf(b2);
                if (valueOf.length() == 0) {
                    new String("Finished uploading GLocRequests in file: ");
                } else {
                    "Finished uploading GLocRequests in file: ".concat(valueOf);
                }
                this.e.add(str2);
                if (this.a != null) {
                    this.b.e.post(new ahrp(this, b2, a2));
                }
            }
        }
        b(str);
    }
}
