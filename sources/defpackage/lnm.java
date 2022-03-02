package defpackage;

import java.util.Arrays;

/* renamed from: lnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lnm {
    private final Class a;
    private final boolean b;
    private final boolean c;

    public lnm(Class cls, boolean z, boolean z2) {
        this.a = cls;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            lnm lnm = (lnm) obj;
            return ius.a(this.a, lnm.a) && this.b == lnm.b && this.c == lnm.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }
}
