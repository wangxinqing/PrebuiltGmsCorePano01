package defpackage;

/* renamed from: aruu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aruu extends arup {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final arul h;

    public aruu(boolean z, boolean z2, boolean z3, double d2, double d3, double d4, double d5, arul arul) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
        this.h = arul;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
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
        if (obj instanceof arup) {
            arup arup = (arup) obj;
            return this.a == arup.a() && this.b == arup.b() && this.c == arup.c() && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(arup.d()) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(arup.e()) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(arup.f()) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(arup.g()) && this.h.equals(arup.h());
        }
    }

    public final double f() {
        return this.f;
    }

    public final double g() {
        return this.g;
    }

    public final arul h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (!this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = (i ^ 1000003) * 1000003;
        if (!this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (this.c) {
            i3 = 1231;
        }
        return ((((((((((i5 ^ i3) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        double d2 = this.d;
        double d3 = this.e;
        double d4 = this.f;
        double d5 = this.g;
        String valueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 293);
        sb.append("Result{detected=");
        sb.append(z);
        sb.append(", outlierAccel=");
        sb.append(z2);
        sb.append(", spike=");
        sb.append(z3);
        sb.append(", accelVarianceAverageThresholdM2s4=");
        sb.append(d2);
        sb.append(", accelVarianceXThresholdM2s4=");
        sb.append(d3);
        sb.append(", accelVarianceYThresholdM2s4=");
        sb.append(d4);
        sb.append(", accelVarianceZThresholdM2s4=");
        sb.append(d5);
        sb.append(", accelFeatures=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
