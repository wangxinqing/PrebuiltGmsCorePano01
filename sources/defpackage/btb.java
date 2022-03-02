package defpackage;

import java.util.Arrays;

/* renamed from: btb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class btb {
    public final atjv a;
    public final int b;

    public btb(atjv atjv, int i) {
        if (atjv != atjv.UNKNOWN_CONTEXT_NAME) {
            this.a = atjv;
            this.b = 1;
            return;
        }
        this.a = atjv.UNKNOWN_CONTEXT_NAME;
        this.b = i;
    }

    public static btb a(atjv atjv) {
        return new btb(atjv, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btb) {
            btb btb = (btb) obj;
            if (btb.b == this.b && btb.a == this.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b - 1), Integer.valueOf(this.a.bA)});
    }
}
