package defpackage;

/* renamed from: anhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anhx extends anhy {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public anhx(String str, String str2, int i, String str3) {
        ankq.a(str, "class name");
        this.b = str;
        ankq.a(str2, "method name");
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    public final String a() {
        return this.b.replace('/', '.');
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anhx) {
            anhx anhx = (anhx) obj;
            if (!this.b.equals(anhx.b) || !this.c.equals(anhx.c) || this.d != anhx.d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
        this.f = hashCode;
        return hashCode;
    }
}
