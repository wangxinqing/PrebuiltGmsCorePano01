package defpackage;

/* renamed from: arsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsx {
    public double a = Double.NEGATIVE_INFINITY;
    public int b = Integer.MIN_VALUE;

    public final void a() {
        this.a = Double.NEGATIVE_INFINITY;
        this.b = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arsx) {
            arsx arsx = (arsx) obj;
            return this.a == arsx.a && this.b == arsx.b;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        int i = this.b;
        return i + (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        double d = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(111);
        sb.append("LogLikelihoodCalculationResult - result: ");
        sb.append(d);
        sb.append(" - number of matching predictives: ");
        sb.append(i);
        return sb.toString();
    }
}
