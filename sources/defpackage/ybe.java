package defpackage;

import java.util.Objects;

/* renamed from: ybe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ybe {
    public final xjo a;
    public final xkj b;
    public final xjm c;

    public ybe(xjo xjo, xkj xkj, xjm xjm) {
        xjo xjo2 = xjo.UNSPECIFIED;
        this.a = xjo;
        this.b = xkj;
        this.c = xjm;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ybe) {
            ybe ybe = (ybe) obj;
            return this.a == ybe.a && this.b == ybe.b && this.c == ybe.c;
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}
