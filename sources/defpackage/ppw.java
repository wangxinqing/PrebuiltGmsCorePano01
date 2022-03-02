package defpackage;

import java.util.Arrays;

/* renamed from: ppw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ppw {
    final String a;
    final aonk b;

    public ppw(ppr ppr) {
        this.a = ppr.j;
        this.b = ppr.g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ppw) {
            ppw ppw = (ppw) obj;
            if (!ius.a(this.a, ppw.a) || !ius.a(this.b, ppw.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b.a())});
    }
}
