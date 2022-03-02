package defpackage;

/* renamed from: awbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awbg {
    public static final batg a = batg.a(":status");
    public static final batg b = batg.a(":method");
    public static final batg c = batg.a(":path");
    public static final batg d = batg.a(":scheme");
    public static final batg e = batg.a(":authority");
    public static final batg f = batg.a(":host");
    public static final batg g = batg.a(":version");
    public final batg h;
    public final batg i;
    final int j;

    public awbg(batg batg, batg batg2) {
        this.h = batg;
        this.i = batg2;
        this.j = batg.e() + 32 + batg2.e();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awbg) {
            awbg awbg = (awbg) obj;
            return this.h.equals(awbg.h) && this.i.equals(awbg.i);
        }
    }

    public final int hashCode() {
        return ((this.h.hashCode() + 527) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", new Object[]{this.h.a(), this.i.a()});
    }

    public awbg(batg batg, String str) {
        this(batg, batg.a(str));
    }

    public awbg(String str, String str2) {
        this(batg.a(str), batg.a(str2));
    }
}
