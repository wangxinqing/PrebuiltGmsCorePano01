package defpackage;

/* renamed from: avyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyh {
    public final double a;
    public final double b;

    public avyh(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final String toString() {
        String d = Double.toString(this.a * 57.29577951308232d);
        double d2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 25);
        sb.append(d);
        sb.append(",");
        sb.append(d2 * 57.29577951308232d);
        return sb.toString();
    }
}
