package defpackage;

import java.util.Arrays;

/* renamed from: ijx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ijx {
    public final iyd a;
    public final boolean b;

    public ijx(iyd iyd, boolean z) {
        this.a = iyd;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ijx) {
            ijx ijx = (ijx) obj;
            if (!ius.a(ijx.a, this.a) || ijx.b != this.b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }
}
