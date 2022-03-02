package defpackage;

/* renamed from: aqih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqih {
    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private Double e;

    public final aqii a() {
        String str = this.a == null ? " minStdDevM" : "";
        if (this.b == null) {
            str = str.concat(" maxStdDevM");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" stdDevScaleM");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" rejectionDistanceM");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" rejectionPeriodS");
        }
        if (str.isEmpty()) {
            return new aqht(this.a.doubleValue(), this.b.doubleValue(), this.c.doubleValue(), this.d.doubleValue(), this.e.doubleValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(double d2) {
        this.a = Double.valueOf(d2);
    }

    public final void c(double d2) {
        this.d = Double.valueOf(d2);
    }

    public final void d(double d2) {
        this.e = Double.valueOf(d2);
    }

    public final void e(double d2) {
        this.c = Double.valueOf(d2);
    }

    public final void a(double d2) {
        this.b = Double.valueOf(d2);
    }
}
