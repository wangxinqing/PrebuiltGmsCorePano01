package defpackage;

/* renamed from: aqhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhz {
    private Double a;
    private Double b;

    public final aqia a() {
        String str = this.a == null ? " probabilityDensityForInvalidGrid" : "";
        if (this.b == null) {
            str = str.concat(" blueskyProbDeweightingFactor");
        }
        if (str.isEmpty()) {
            return new aqhp(this.a.doubleValue(), this.b.doubleValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(double d) {
        this.a = Double.valueOf(d);
    }

    public final void a(double d) {
        this.b = Double.valueOf(d);
    }
}
