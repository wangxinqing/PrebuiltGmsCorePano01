package defpackage;

/* renamed from: aibl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibl {
    public final double a;
    public final int b;

    public aibl(int i, double d) {
        this.b = i;
        this.a = d;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? "UNKNOWN" : "MOVING" : "STATIONARY";
        double d = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 66);
        sb.append("TravelDetectionResult [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(d);
        sb.append("]");
        return sb.toString();
    }
}
