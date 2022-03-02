package defpackage;

/* renamed from: baob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baob {
    public static final batg a = batg.a(":status");
    public static final batg b = batg.a(":method");
    public static final batg c = batg.a(":path");
    public static final batg d = batg.a(":scheme");
    public static final batg e = batg.a(":authority");
    public final batg f;
    public final batg g;
    final int h;

    static {
        batg.a(":host");
        batg.a(":version");
    }

    public baob(batg batg, batg batg2) {
        this.f = batg;
        this.g = batg2;
        this.h = batg.e() + 32 + batg2.e();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof baob) {
            baob baob = (baob) obj;
            return this.f.equals(baob.f) && this.g.equals(baob.g);
        }
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", new Object[]{this.f.a(), this.g.a()});
    }

    public baob(batg batg, String str) {
        this(batg, batg.a(str));
    }

    public baob(String str, String str2) {
        this(batg.a(str), batg.a(str2));
    }
}
