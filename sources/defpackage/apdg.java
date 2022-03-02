package defpackage;

/* renamed from: apdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apdg extends apef {
    private final int a;
    private final apee b;
    private final int c;

    public apdg(int i, apee apee, int i2) {
        this.a = i;
        this.b = apee;
        this.c = i2;
    }

    public final int a() {
        return this.a;
    }

    public final apee b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apef) {
            apef apef = (apef) obj;
            return this.a == apef.a() && this.b.equals(apef.b()) && this.c == apef.c();
        }
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }
}
