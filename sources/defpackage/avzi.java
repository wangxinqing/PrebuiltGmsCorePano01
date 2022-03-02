package defpackage;

/* renamed from: avzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzi {
    public avzd a;
    public String b;
    public final avza c;
    public avzk d;
    public Object e;

    public avzi() {
        this.b = "GET";
        this.c = new avza();
    }

    public final avzj a() {
        if (this.a != null) {
            return new avzj(this);
        }
        throw new IllegalStateException("url == null");
    }

    public final void b(String str, String str2) {
        this.c.b(str, str2);
    }

    public avzi(avzj avzj) {
        this.a = avzj.a;
        this.b = avzj.b;
        this.d = avzj.d;
        this.e = avzj.e;
        this.c = avzj.c.b();
    }

    public final void a(avzd avzd) {
        if (avzd != null) {
            this.a = avzd;
            return;
        }
        throw new IllegalArgumentException("url == null");
    }

    public final void a(String str) {
        this.c.a(str);
    }

    public final void a(String str, avzk avzk) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        } else if (avzk != null && !awct.b(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 37);
            sb.append("method ");
            sb.append(str);
            sb.append(" must not have a request body.");
            throw new IllegalArgumentException(sb.toString());
        } else if (avzk == null && awct.a(str)) {
            StringBuilder sb2 = new StringBuilder(str.length() + 33);
            sb2.append("method ");
            sb2.append(str);
            sb2.append(" must have a request body.");
            throw new IllegalArgumentException(sb2.toString());
        } else {
            this.b = str;
            this.d = avzk;
        }
    }

    public final void a(String str, String str2) {
        this.c.c(str, str2);
    }
}
