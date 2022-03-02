package defpackage;

/* renamed from: avyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyt {
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public avyt(avyu avyu) {
        avyu avyu2 = avyu.a;
        this.a = avyu.d;
        this.b = avyu.f;
        this.c = avyu.g;
        this.d = avyu.e;
    }

    public final avyu a() {
        return new avyu(this);
    }

    public final void b() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final void b(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
    }

    public avyt(boolean z) {
        this.a = z;
    }

    public final void a(avzp... avzpArr) {
        if (this.a) {
            String[] strArr = new String[avzpArr.length];
            for (int i = 0; i < avzpArr.length; i++) {
                strArr[i] = avzpArr[i].e;
            }
            b(strArr);
            return;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final void a(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.b = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
    }
}
