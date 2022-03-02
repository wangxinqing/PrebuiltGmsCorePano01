package defpackage;

import android.content.Context;

/* renamed from: acad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acad {
    private static final iwd c = acqa.a("D2D", "Metrics", "PostSetupLogManager");
    public final acap a;
    private final hol b;
    private final aucd d;
    private final aucd e = anwd.d.o();
    private final aucd f = anwf.e.o();
    private final aucd g = anvq.e.o();

    public acad(Context context) {
        hol hol = new hol(context, "SMART_SETUP", (String) null);
        this.b = hol;
        this.d = anwh.j.o();
        this.a = new acap(this.g);
    }

    public final void a() {
        c.a("Sending logs with Clearcut.", new Object[0]);
        aucd aucd = this.f;
        aucd aucd2 = this.g;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwf anwf = (anwf) aucd.b;
        anvq anvq = (anvq) aucd2.i();
        anwf anwf2 = anwf.e;
        anvq.getClass();
        anwf.c = anvq;
        anwf.a |= 2;
        aucd aucd3 = this.f;
        aucd aucd4 = this.e;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        anwf anwf3 = (anwf) aucd3.b;
        anwd anwd = (anwd) aucd4.i();
        anwd.getClass();
        anwf3.d = anwd;
        anwf3.a |= 4;
        aucd aucd5 = this.d;
        aucd aucd6 = this.f;
        if (aucd5.c) {
            aucd5.c();
            aucd5.c = false;
        }
        anwh anwh = (anwh) aucd5.b;
        anwf anwf4 = (anwf) aucd6.i();
        anwh anwh2 = anwh.j;
        anwf4.getClass();
        anwh.h = anwf4;
        anwh.a |= 64;
        c.a(this.d.toString(), new Object[0]);
        this.b.a(((anwh) this.d.i()).k()).b();
    }

    public final void a(int i) {
        aucd aucd = this.f;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwf anwf = (anwf) aucd.b;
        anwf anwf2 = anwf.e;
        anwf.b = i - 1;
        anwf.a |= 1;
    }

    public final void a(long j) {
        aucd aucd = this.d;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwh anwh = (anwh) aucd.b;
        anwh anwh2 = anwh.j;
        anwh.a |= 1;
        anwh.b = j;
    }

    public final void a(String str, boolean z) {
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwd anwd = (anwd) aucd.b;
        anwd anwd2 = anwd.d;
        str.getClass();
        anwd.a |= 1;
        anwd.b = str;
        if ("com.google.android.gms".equals(str)) {
            aucd aucd2 = this.e;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anwd anwd3 = (anwd) aucd2.b;
            anwd3.c = 1;
            anwd3.a |= 2;
        } else if (!z) {
            aucd aucd3 = this.e;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            anwd anwd4 = (anwd) aucd3.b;
            anwd4.c = 4;
            anwd4.a |= 2;
        } else {
            aucd aucd4 = this.e;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            anwd anwd5 = (anwd) aucd4.b;
            anwd5.c = 2;
            anwd5.a |= 2;
        }
    }
}
