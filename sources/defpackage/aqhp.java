package defpackage;

/* renamed from: aqhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqhp extends aqia {
    private final double a;
    private final double b;

    public aqhp(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqia) {
            aqia aqia = (aqia) obj;
            return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(aqia.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(aqia.b());
        }
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b))) ^ ((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        StringBuilder sb = new StringBuilder(143);
        sb.append("BlueskyWeightingConfiguration{probabilityDensityForInvalidGrid=");
        sb.append(d);
        sb.append(", blueskyProbDeweightingFactor=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}
