package defpackage;

import java.util.Arrays;

/* renamed from: ajns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajns {
    public final boolean a;
    public final int b;

    public ajns(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajns) {
            ajns ajns = (ajns) obj;
            return this.a == ajns.a && this.b == ajns.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(39);
        sb.append("Result{moved=");
        sb.append(z);
        sb.append(", reason=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
