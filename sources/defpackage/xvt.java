package defpackage;

/* renamed from: xvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvt {
    public Long a;
    public Long b;
    public Long c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public wvq k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;

    public final xvu a() {
        String str = this.l == null ? " isMarkedAsFavorite" : "";
        if (this.m == null) {
            str = str.concat(" isVisible");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" isReadOnly");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" isAutoAdd");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" isDirty");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" isDeleted");
        }
        if (str.isEmpty()) {
            return new xvq(this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    public final void a(boolean z) {
        this.o = Boolean.valueOf(z);
    }
}
