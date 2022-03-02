package defpackage;

import java.util.Arrays;

/* renamed from: qrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrf {
    public final Long a;
    public final Long b;

    public qrf(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean a() {
        return this.a.longValue() < this.b.longValue();
    }

    public final boolean equals(Object obj) {
        qrf qrf;
        if (!(obj instanceof qrf) || (qrf = (qrf) obj) == null || !qrf.a.equals(this.a) || !qrf.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("%d %d", new Object[]{this.a, this.b});
    }
}
