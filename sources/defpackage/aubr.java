package defpackage;

/* renamed from: aubr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aubr {
    private final Object a;
    private final int b;

    public aubr(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aubr) {
            aubr aubr = (aubr) obj;
            if (this.a == aubr.a && this.b == aubr.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
