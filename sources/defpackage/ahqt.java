package defpackage;

/* renamed from: ahqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqt {
    public final long a;
    public short b;
    public long c;

    public ahqt(long j) {
        this.c = -1;
        this.a = j;
        this.b = Short.MAX_VALUE;
    }

    public static final short a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        long floor = (long) Math.floor(d / 8.64E7d);
        if (Math.abs((86400000 * floor) - j) > 85800000) {
            floor++;
        }
        return (short) ((int) floor);
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(38);
        sb.append("SeenWifiAp: bssid ");
        sb.append(j);
        return sb.toString();
    }

    public ahqt(aqek aqek) {
        this(aqek.c(1));
        if (aqek.i(3)) {
            this.b = (short) aqek.b(3);
        }
    }
}
