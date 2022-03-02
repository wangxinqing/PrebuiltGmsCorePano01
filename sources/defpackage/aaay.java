package defpackage;

/* renamed from: aaay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaay {
    public final int a;
    public final int b;

    public aaay(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaay) {
            aaay aaay = (aaay) obj;
            if (this.a == aaay.a && this.b == aaay.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 10) + this.b;
    }
}
