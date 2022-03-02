package defpackage;

/* renamed from: apdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apdh extends apeg {
    private final int a;
    private final int b;
    private final int c;
    private final apei d;

    public apdh(int i, int i2, int i3, apei apei) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (apei != null) {
            this.d = apei;
            return;
        }
        throw new NullPointerException("Null parent");
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final apei d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apeg) {
            apeg apeg = (apeg) obj;
            return this.a == apeg.a() && this.b == apeg.b() && this.c == apeg.c() && this.d.equals(apeg.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }
}
