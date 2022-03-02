package defpackage;

import java.util.Arrays;

/* renamed from: akrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrb {
    public final double a;
    public final double b;
    public final float c;

    private akrb(double d, double d2, float f) {
        this.a = d;
        this.b = d2;
        this.c = f;
    }

    public static akrb a(double d, double d2, float f) {
        return new akrb(d, d2, f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akrb) {
            akrb akrb = (akrb) obj;
            return this.a == akrb.a && this.b == akrb.b && this.c == akrb.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Double.valueOf(this.b), Float.valueOf(this.c)});
    }
}
