package defpackage;

/* renamed from: aqhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhs extends aqig {
    public final double a;
    public final boolean b;
    public final double c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final double g;
    public final double h;
    public final double i;
    public final boolean j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final double n;
    public final boolean o;
    public final long p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final aqie t;
    private final aqhy u;

    public aqhs(double d2, boolean z, double d3, int i2, boolean z2, boolean z3, double d4, double d5, double d6, boolean z4, long j2, boolean z5, boolean z6, double d7, boolean z7, long j3, boolean z8, boolean z9, boolean z10, aqhy aqhy, aqie aqie) {
        this.a = d2;
        this.b = z;
        this.c = d3;
        this.d = i2;
        this.e = z2;
        this.f = z3;
        this.g = d4;
        this.h = d5;
        this.i = d6;
        this.j = z4;
        this.k = j2;
        this.l = z5;
        this.m = z6;
        this.n = d7;
        this.o = z7;
        this.p = j3;
        this.q = z8;
        this.r = z9;
        this.s = z10;
        this.u = aqhy;
        this.t = aqie;
    }

    public final double a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final double c() {
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
        if (obj instanceof aqig) {
            aqig aqig = (aqig) obj;
            return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(aqig.a()) && this.b == aqig.b() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(aqig.c()) && this.d == aqig.d() && this.e == aqig.e() && this.f == aqig.f() && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(aqig.g()) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(aqig.h()) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(aqig.i()) && this.j == aqig.j() && this.k == aqig.k() && this.l == aqig.l() && this.m == aqig.m() && Double.doubleToLongBits(this.n) == Double.doubleToLongBits(aqig.n()) && this.o == aqig.o() && this.p == aqig.p() && this.q == aqig.q() && this.r == aqig.r() && this.s == aqig.s() && this.u.equals(aqig.t()) && this.t.equals(aqig.u());
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final double g() {
        return this.g;
    }

    public final double h() {
        return this.h;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int doubleToLongBits = (((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003;
        int i11 = 1237;
        if (!this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int doubleToLongBits2 = (((((doubleToLongBits ^ i2) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ this.d) * 1000003;
        if (!this.e) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i12 = (doubleToLongBits2 ^ i3) * 1000003;
        if (!this.f) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int doubleToLongBits3 = (((((((i12 ^ i4) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.h) >>> 32) ^ Double.doubleToLongBits(this.h)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)))) * 1000003;
        if (!this.j) {
            i5 = 1237;
        } else {
            i5 = 1231;
        }
        long j2 = this.k;
        int i13 = (((doubleToLongBits3 ^ i5) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (!this.l) {
            i6 = 1237;
        } else {
            i6 = 1231;
        }
        int i14 = (i13 ^ i6) * 1000003;
        if (!this.m) {
            i7 = 1237;
        } else {
            i7 = 1231;
        }
        int doubleToLongBits4 = (((i14 ^ i7) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.n) >>> 32) ^ Double.doubleToLongBits(this.n)))) * 1000003;
        if (!this.o) {
            i8 = 1237;
        } else {
            i8 = 1231;
        }
        long j3 = this.p;
        int i15 = (((doubleToLongBits4 ^ i8) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        if (!this.q) {
            i9 = 1237;
        } else {
            i9 = 1231;
        }
        int i16 = (i15 ^ i9) * 1000003;
        if (!this.r) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        int i17 = (i16 ^ i10) * 1000003;
        if (this.s) {
            i11 = 1231;
        }
        return this.t.hashCode() ^ ((((i17 ^ i11) * 1000003) ^ this.u.hashCode()) * 1000003);
    }

    public final double i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final long k() {
        return this.k;
    }

    public final boolean l() {
        return this.l;
    }

    public final boolean m() {
        return this.m;
    }

    public final double n() {
        return this.n;
    }

    public final boolean o() {
        return this.o;
    }

    public final long p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    public final boolean r() {
        return this.r;
    }

    public final boolean s() {
        return this.s;
    }

    public final aqhy t() {
        return this.u;
    }

    public final String toString() {
        double d2 = this.a;
        boolean z = this.b;
        double d3 = this.c;
        int i2 = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        double d4 = this.g;
        double d5 = this.h;
        double d6 = this.i;
        boolean z4 = this.j;
        double d7 = d6;
        long j2 = this.k;
        boolean z5 = this.l;
        boolean z6 = this.m;
        double d8 = this.n;
        boolean z7 = this.o;
        long j3 = this.p;
        boolean z8 = this.q;
        boolean z9 = this.r;
        boolean z10 = this.s;
        String valueOf = String.valueOf(this.u);
        boolean z11 = z8;
        String valueOf2 = String.valueOf(this.t);
        String str = valueOf2;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 925 + String.valueOf(valueOf2).length());
        sb.append("ParticleFilterFusionConfiguration{speedUpperThresholdMps=");
        sb.append(d2);
        sb.append(", useNStepActivationFilter=");
        sb.append(z);
        sb.append(", stepTimeoutThresholdSeconds=");
        sb.append(d3);
        sb.append(", requiredStepCount=");
        sb.append(i2);
        sb.append(", alwaysRunAfterOneStep=");
        sb.append(z2);
        sb.append(", useAltitudeFilter=");
        sb.append(z3);
        sb.append(", altitudeFilterWifiValidTimeSeconds=");
        sb.append(d4);
        sb.append(", altitudeFilterGpsValidTimeSeconds=");
        sb.append(d5);
        sb.append(", altitudeFilterFloorLabelValidTimeSeconds=");
        sb.append(d7);
        sb.append(", enableBluePixel=");
        sb.append(z4);
        sb.append(", bluePixelOverruleIntervalNanos=");
        sb.append(j2);
        sb.append(", enableOutputKalmanFilter=");
        sb.append(z5);
        sb.append(", enableActivityAwareKalmanFilter=");
        sb.append(z6);
        sb.append(", globalAccuracyFactor=");
        sb.append(d8);
        sb.append(", enableAccuracyOutputFilter=");
        sb.append(z7);
        sb.append(", accuracyOutputFilterMaxAgeInWindowNanos=");
        sb.append(j3);
        sb.append(", enableOutputFilterTimestampFix=");
        sb.append(z11);
        sb.append(", enableIncomingPositionAccuracyScaling=");
        sb.append(z9);
        sb.append(", enableArForDriving=");
        sb.append(z10);
        sb.append(", bluemoonLocalizerSensorFusionConfiguration=");
        sb.append(valueOf);
        sb.append(", linearLatLngKalmanFilterConfiguration=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final aqie u() {
        return this.t;
    }
}
