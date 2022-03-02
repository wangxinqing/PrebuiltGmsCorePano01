package defpackage;

/* renamed from: ahtc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahtc {
    final double a;
    final double b;

    public ahtc(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        StringBuilder sb = new StringBuilder(81);
        sb.append("ComplexNumber [real=");
        sb.append(d);
        sb.append(", imaginary=");
        sb.append(d2);
        sb.append("]");
        return sb.toString();
    }
}
