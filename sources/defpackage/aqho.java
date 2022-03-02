package defpackage;

/* renamed from: aqho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqho extends aqhy {
    public final boolean a;
    public final double b;
    public final boolean c;
    public final boolean d;
    public final aqhw e;

    public aqho(boolean z, double d2, boolean z2, boolean z3, aqhw aqhw) {
        this.a = z;
        this.b = d2;
        this.c = z2;
        this.d = z3;
        this.e = aqhw;
    }

    public final boolean a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final aqhw e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqhy) {
            aqhy aqhy = (aqhy) obj;
            return this.a == aqhy.a() && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(aqhy.b()) && this.c == aqhy.c() && this.d == aqhy.d() && this.e.equals(aqhy.e());
        }
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
        int doubleToLongBits = (((i ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003;
        if (!this.c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = (doubleToLongBits ^ i2) * 1000003;
        if (this.d) {
            i3 = 1231;
        }
        return ((i4 ^ i3) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        double d2 = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 247);
        sb.append("BluemoonLocalizerSensorFusionConfiguration{notRequestWifiScansWhenProposingFromGnss=");
        sb.append(z);
        sb.append(", maxGnssAgeForNotRequestingWifiScansS=");
        sb.append(d2);
        sb.append(", enableBluePixel=");
        sb.append(z2);
        sb.append(", enableBearingRangeFix143083454=");
        sb.append(z3);
        sb.append(", bluemoonLocalizerConfiguration=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
