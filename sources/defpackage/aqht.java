package defpackage;

/* renamed from: aqht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqht extends aqii {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;

    public aqht(double d2, double d3, double d4, double d5, double d6) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final double d() {
        return this.d;
    }

    public final double e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqii) {
            aqii aqii = (aqii) obj;
            return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(aqii.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(aqii.b()) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(aqii.c()) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(aqii.d()) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(aqii.e());
        }
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e))) ^ ((((((((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003);
    }

    public final String toString() {
        double d2 = this.a;
        double d3 = this.b;
        double d4 = this.c;
        double d5 = this.d;
        double d6 = this.e;
        StringBuilder sb = new StringBuilder(244);
        sb.append("PositionMeasurementConditionerConfiguration{minStdDevM=");
        sb.append(d2);
        sb.append(", maxStdDevM=");
        sb.append(d3);
        sb.append(", stdDevScaleM=");
        sb.append(d4);
        sb.append(", rejectionDistanceM=");
        sb.append(d5);
        sb.append(", rejectionPeriodS=");
        sb.append(d6);
        sb.append("}");
        return sb.toString();
    }
}
