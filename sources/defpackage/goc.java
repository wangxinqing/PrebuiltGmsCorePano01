package defpackage;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: goc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class goc {
    private static final iwd d = ehv.a("MetricsHelper");
    private static final fzk e = fzk.a("MetricsHelper.event");
    private static final fzk f = fzk.a("MetricsHelper.last_resume_time");
    private static final fzk g = fzk.a("MetricsHelper.foreground_duration");
    public final aucd a;
    public final aucd b = anoi.g.o();
    public aucd c;
    private final gne h;
    private final gob i;
    private final goj j;
    private boolean k = false;

    public goc(gne gne, gob gob, goj goj) {
        byte[] bArr;
        this.h = gne;
        this.i = gob;
        this.j = goj;
        this.a = anon.v.o();
        if (this.h.f().b(e) && (bArr = (byte[]) this.h.f().a(e)) != null && bArr.length > 0) {
            try {
                this.a.b(bArr);
            } catch (auda e2) {
                d.a((Throwable) e2);
            }
        }
        anon anon = (anon) this.a.b;
        if ((anon.a & 16384) != 0) {
            aucd aucd = this.b;
            anoi anoi = anon.k;
            aucd.a((aucj) anoi == null ? anoi.g : anoi);
        }
        anon anon2 = (anon) this.a.b;
        if ((anon2.a & 65536) != 0) {
            anpp anpp = anon2.m;
            anpp = anpp == null ? anpp.f : anpp;
            aucd aucd2 = (aucd) anpp.c(5);
            aucd2.a((aucj) anpp);
            this.c = aucd2;
        }
    }

    public static goc a(Context context, gne gne, gob gob) {
        return new goc(gne, gob, new goj(context));
    }

    public final void b() {
        long longValue = ((Long) this.h.f().a(f, -1L)).longValue();
        if (longValue != -1) {
            long longValue2 = ((Long) this.h.f().a(g, 0L)).longValue() + (SystemClock.elapsedRealtime() - longValue);
            this.h.f().b(g, Long.valueOf(longValue2));
            this.h.f().a.remove(f.a);
            aucd aucd = this.b;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anoi anoi = (anoi) aucd.b;
            anoi anoi2 = anoi.g;
            anoi.a |= 4;
            anoi.d = longValue2;
        }
        aucd aucd2 = this.a;
        anoi anoi3 = (anoi) this.b.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        anon anon = (anon) aucd2.b;
        anon anon2 = anon.v;
        anoi3.getClass();
        anon.k = anoi3;
        anon.a |= 16384;
        aucd aucd3 = this.c;
        if (aucd3 != null) {
            aucd aucd4 = this.a;
            anpp anpp = (anpp) aucd3.i();
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            anon anon3 = (anon) aucd4.b;
            anpp.getClass();
            anon3.m = anpp;
            anon3.a |= 65536;
        }
        this.h.f().b(e, ((anon) this.a.i()).k());
    }

    public final void c() {
        if (!this.k) {
            this.k = true;
            aucd aucd = this.a;
            anoi anoi = (anoi) this.b.i();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anon anon = (anon) aucd.b;
            anon anon2 = anon.v;
            anoi.getClass();
            anon.k = anoi;
            anon.a |= 16384;
            aucd aucd2 = this.c;
            if (aucd2 != null) {
                aucd aucd3 = this.a;
                anpp anpp = (anpp) aucd2.i();
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                anon anon3 = (anon) aucd3.b;
                anpp.getClass();
                anon3.m = anpp;
                anon3.a |= 65536;
            }
            gob gob = this.i;
            if (gob == null || gob.aJ()) {
                if (d.a(3)) {
                    d.b("Sending Clearcut event:\n%s", new String(((anon) this.a.i()).k()));
                }
                this.j.a((anon) this.a.i());
            }
        }
    }

    public final void a() {
        this.h.f().b(f, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void a(int i2) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anoi anoi = (anoi) aucd.b;
        anoi anoi2 = anoi.g;
        anoi.a |= 2;
        anoi.c = i2;
    }

    public final void a(String str) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anoi anoi = (anoi) aucd.b;
        anoi anoi2 = anoi.g;
        str.getClass();
        anoi.a |= 1;
        anoi.b = str;
    }

    public final void b(int i2) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anoi anoi = (anoi) aucd.b;
        anoi anoi2 = anoi.g;
        anoi.a |= 8;
        anoi.e = i2;
    }

    public final void b(String str) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anoi anoi = (anoi) aucd.b;
        anoi anoi2 = anoi.g;
        str.getClass();
        anoi.a |= 16;
        anoi.f = str;
    }
}
