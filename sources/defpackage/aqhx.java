package defpackage;

/* renamed from: aqhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhx {
    public aqhw a;
    private Boolean b;
    private Double c;
    private Boolean d;
    private Boolean e;

    public final aqhy a() {
        String str = this.b == null ? " notRequestWifiScansWhenProposingFromGnss" : "";
        if (this.c == null) {
            str = str.concat(" maxGnssAgeForNotRequestingWifiScansS");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" enableBluePixel");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" enableBearingRangeFix143083454");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" bluemoonLocalizerConfiguration");
        }
        if (str.isEmpty()) {
            return new aqho(this.b.booleanValue(), this.c.doubleValue(), this.d.booleanValue(), this.e.booleanValue(), this.a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void a(double d2) {
        this.c = Double.valueOf(d2);
    }

    public final void a(boolean z) {
        this.e = Boolean.valueOf(z);
    }
}
