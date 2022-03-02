package defpackage;

import java.util.Objects;

/* renamed from: ybf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybf {
    public final int a;
    public final String b;

    public ybf(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ybf) {
            ybf ybf = (ybf) obj;
            return this.a == ybf.a && this.b.equals(ybf.b);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), this.b});
    }
}
