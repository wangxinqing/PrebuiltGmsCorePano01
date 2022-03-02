package defpackage;

import java.util.Arrays;

/* renamed from: lgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lgt implements lgv {
    public final boolean a;

    public lgt(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ius.a(Boolean.valueOf(this.a), Boolean.valueOf(((lgt) obj).a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }
}
