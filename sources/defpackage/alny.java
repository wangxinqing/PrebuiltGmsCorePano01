package defpackage;

/* renamed from: alny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alny {
    public aloe a;
    public alob b;
    public alop c;
    public final alsg d;
    private final alpf e;
    private alpl f;
    private alov g;
    private final aloo h;
    private boolean i;

    private alny(alpf alpf, alns alns, aloo aloo) {
        this.e = alpf;
        this.h = aloo;
        alrs alrs = alns.a;
        alul alul = new alul(10485760, alns.b, 100);
        this.d = alul;
        alul.a = alrs.b == alyv.READ_WRITE;
        this.d.a((Iterable) alrs.c, alss.g);
        this.c = new alol(alrs.a);
        this.a = new aloe((alov) null, alrs.d);
        this.b = new alob((alov) null, alrs.b);
    }

    public static final alny a(alpf alpf, alns alns, aloo aloo) {
        return new alny(alpf, alns, aloo);
    }

    public final boolean b() {
        return this.f == null;
    }

    public final synchronized void c() {
        alpl alpl = this.f;
        if (alpl != null) {
            alpl.b();
        }
        alov alov = this.g;
        if (alov != null) {
            alov.b();
        }
    }

    public final synchronized void d() {
        if (!this.i) {
            alpl alpl = this.f;
            if (alpl != null) {
                alpl.c();
            }
            alov alov = this.g;
            if (alov != null) {
                alov.c();
            }
        } else {
            throw new IllegalStateException("Document is closed.");
        }
    }

    public final void a() {
        c();
        this.i = true;
    }

    public final void a(String str) {
        boolean z;
        if (this.f == null) {
            z = true;
        } else {
            z = false;
        }
        alys.b(z, "Document is already connected.");
        alrt g2 = this.c.g();
        String str2 = g2.c;
        this.f = this.e.b(str, str2);
        this.g = new alot(this.e, str, str2);
        this.a = new aloe(this.g, this.a.a());
        alob alob = new alob(this.g, this.b.b);
        this.b = alob;
        alob.a(new alnx(this));
        this.c = new alok(this.f, this.g, this.h, this.d, g2);
    }
}
