package defpackage;

/* renamed from: aqfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfc extends aqfj {
    public final float a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public aqfc(float f2, int i, int i2, int i3, boolean z, int i4) {
        this.a = f2;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final float a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqfj) {
            aqfj aqfj = (aqfj) obj;
            return Float.floatToIntBits(this.a) == Float.floatToIntBits(aqfj.a()) && this.b == aqfj.b() && this.c == aqfj.c() && this.d == aqfj.d() && this.e == aqfj.e() && this.f == aqfj.f();
        }
    }

    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003) ^ this.f;
    }

    public final String toString() {
        float f2 = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        boolean z = this.e;
        int i4 = this.f;
        StringBuilder sb = new StringBuilder(264);
        sb.append("FlpFusionOptions{gpsAccuracyNormalizationFactor=");
        sb.append(f2);
        sb.append(", gpsPositionRequestTimePeriodSec=");
        sb.append(i);
        sb.append(", wifiLocationRequestTimePeriodSec=");
        sb.append(i2);
        sb.append(", nearIndoorsGpsSnrThreshold=");
        sb.append(i3);
        sb.append(", usePdrWithGpsPosition=");
        sb.append(z);
        sb.append(", flpMinimumOutputAccuracyMm=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
