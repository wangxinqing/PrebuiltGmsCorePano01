package defpackage;

import android.accounts.Account;

/* renamed from: ajmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmz {
    public final Account a;
    public Long b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public Boolean g;
    public Boolean h;
    public final String i;
    public boolean j = false;
    public Long k;
    public Integer l;
    public Boolean m;
    public Boolean n;
    public boolean o;
    public Integer p;
    public String q;
    public boolean r = false;

    public ajmz(Account account, String str) {
        iva.a((Object) account, (Object) "null account");
        this.a = account;
        this.i = str;
    }

    public final ajna a() {
        return new ajna(this);
    }

    public final void b() {
        this.c = true;
    }

    public final void c() {
        this.o = true;
        a(true);
        b();
    }

    public final void d() {
        this.r = true;
        a(true);
        b();
    }

    public final void e() {
        this.d = true;
        a(true);
        b();
    }

    public final void a(int i2) {
        this.l = Integer.valueOf(i2);
    }

    public final void a(long j2) {
        this.b = Long.valueOf(j2);
    }

    public final void a(ajkh ajkh) {
        this.g = ajkh.b;
        this.h = ajkh.d;
        this.k = ajkh.a;
        a(ajkh.f);
        Boolean bool = ajkh.i;
        this.n = null;
        this.p = Integer.valueOf(ajkh.j);
    }

    public final void a(boolean z) {
        this.m = Boolean.valueOf(z);
    }
}
