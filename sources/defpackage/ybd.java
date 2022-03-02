package defpackage;

import java.util.Objects;

/* renamed from: ybd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybd {
    public xnd a = xnd.UNSPECIFIED;
    public final xjo b;
    public final boolean c;

    public ybd(xnd xnd, xjo xjo, boolean z) {
        xjo xjo2 = xjo.UNSPECIFIED;
        this.a = xnd;
        this.b = xjo;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ybd) {
            ybd ybd = (ybd) obj;
            return this.a == ybd.a && this.b == ybd.b && this.c == ybd.c;
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }
}
