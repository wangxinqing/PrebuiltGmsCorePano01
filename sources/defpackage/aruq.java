package defpackage;

/* renamed from: aruq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aruq {
    public final arun a;
    public arul b = null;

    public aruq(arun arun) {
        this.a = arun;
    }

    public static double a(arun arun, double d) {
        arut arut = (arut) arun;
        return Math.min(arut.t, Math.max(arut.s, d * arut.u));
    }

    public static double a(arun arun, double d, double d2) {
        arut arut = (arut) arun;
        double min = Math.min(arut.x * d2, d);
        double d3 = arut.w;
        return (min * d3) + ((1.0d - d3) * d2);
    }

    public static boolean a(double[][] dArr) {
        int length = dArr[0].length;
        int length2 = dArr[1].length;
        return length == length2 && length2 == dArr[2].length;
    }
}
