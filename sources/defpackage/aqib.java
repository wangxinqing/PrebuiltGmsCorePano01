package defpackage;

/* renamed from: aqib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqib {
    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private Double e;
    private Double f;
    private Double g;
    private Double h;

    public final aqic a() {
        String str = this.a == null ? " reInitAccuracyThresholdMultiplierGnss" : "";
        if (this.b == null) {
            str = str.concat(" reInitAccuracyThresholdMultiplierWifi");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" initializationWindowLengthS");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" maxGnssEvidenceAgeS");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" maxWifiEvidenceAgeS");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" maxStepEvidenceAgeS");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" maxBearingGapS");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" maxGnssWifiDistanceForGnssOnlyM");
        }
        if (str.isEmpty()) {
            return new aqhq(this.a.doubleValue(), this.b.doubleValue(), this.c.doubleValue(), this.d.doubleValue(), this.e.doubleValue(), this.f.doubleValue(), this.g.doubleValue(), this.h.doubleValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(double d2) {
        this.g = Double.valueOf(d2);
    }

    public final void c(double d2) {
        this.d = Double.valueOf(d2);
    }

    public final void d(double d2) {
        this.h = Double.valueOf(d2);
    }

    public final void e(double d2) {
        this.f = Double.valueOf(d2);
    }

    public final void f(double d2) {
        this.e = Double.valueOf(d2);
    }

    public final void g(double d2) {
        this.a = Double.valueOf(d2);
    }

    public final void h(double d2) {
        this.b = Double.valueOf(d2);
    }

    public final void a(double d2) {
        this.c = Double.valueOf(d2);
    }
}
