package defpackage;

/* renamed from: avzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzl {
    public avzj a;
    public avzh b;
    public int c;
    public String d;
    public avyz e;
    public avza f;
    public avzn g;
    public avzm h;
    public avzm i;
    public avzm j;

    public avzl() {
        this.c = -1;
        this.f = new avza();
    }

    public static final void a(String str, avzm avzm) {
        if (avzm.g != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        } else if (avzm.h != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        } else if (avzm.i != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        } else if (avzm.j != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final void a(avzm avzm) {
        if (avzm == null || avzm.g == null) {
            this.j = avzm;
            return;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }

    public avzl(avzm avzm) {
        this.c = -1;
        this.a = avzm.a;
        this.b = avzm.b;
        this.c = avzm.c;
        this.d = avzm.d;
        this.e = avzm.e;
        this.f = avzm.f.b();
        this.g = avzm.g;
        this.h = avzm.h;
        this.i = avzm.i;
        this.j = avzm.j;
    }

    public final avzm a() {
        if (this.a == null) {
            throw new IllegalStateException("request == null");
        } else if (this.b != null) {
            int i2 = this.c;
            if (i2 >= 0) {
                return new avzm(this);
            }
            StringBuilder sb = new StringBuilder(21);
            sb.append("code < 0: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        } else {
            throw new IllegalStateException("protocol == null");
        }
    }

    public final void a(avzb avzb) {
        this.f = avzb.b();
    }

    public final void a(String str, String str2) {
        this.f.b(str, str2);
    }
}
