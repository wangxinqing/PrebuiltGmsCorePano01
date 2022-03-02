package defpackage;

import java.util.Arrays;

/* renamed from: aklp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklp {
    public final float a;
    public final boolean b;

    static {
        new aklp(0.0f, false);
    }

    public aklp(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aklp) {
            aklp aklp = (aklp) obj;
            return this.b == aklp.b && this.a == aklp.a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        return "OnTheGoResult { onTheGoProbability=" + this.a + " isActivityUsed=" + this.b + "}";
    }
}
