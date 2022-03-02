package defpackage;

/* renamed from: qlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlh {
    public qlo a;
    public String b;
    public String c;
    private String d;
    private Integer e;
    private Integer f;
    private Boolean g;
    private Boolean h;

    public final qli a() {
        String str = this.d == null ? " packageName" : "";
        if (this.e == null) {
            str = str.concat(" versionCode");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" derivedId");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" eventLog");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" populateRoutes");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" addSyntheticRoutes");
        }
        if (str.isEmpty()) {
            return new qll(this.d, this.e.intValue(), this.f.intValue(), this.a, this.g.booleanValue(), this.b, this.c, this.h.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void b(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void a(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void a(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final void a(boolean z) {
        this.h = Boolean.valueOf(z);
    }
}
