package defpackage;

/* renamed from: poa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class poa {
    public String a;
    public Integer b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    private Integer h;
    private String i;
    private Long j;
    private Integer k;
    private String l;
    private Boolean m;

    public final pob a() {
        String str = this.h == null ? " id" : "";
        if (this.a == null) {
            str = str.concat(" messageType");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" uri");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" dateMillis");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" score");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" contentType");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" read");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        return new plx(this.h.intValue(), this.a, this.i, this.b, this.c, this.j.longValue(), this.d, this.e, this.f, this.k.intValue(), this.l, this.g, this.m.booleanValue());
    }

    public final void b(int i2) {
        this.k = Integer.valueOf(i2);
    }

    public final void b(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final void a(int i2) {
        this.h = Integer.valueOf(i2);
    }

    public final void a(long j2) {
        this.j = Long.valueOf(j2);
    }

    public final void a(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final void a(boolean z) {
        this.m = Boolean.valueOf(z);
    }
}
