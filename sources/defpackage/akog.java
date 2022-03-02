package defpackage;

/* renamed from: akog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akog {
    public final long a;
    public final long b;
    public final String c;
    public final int d;
    public final short e;

    public akog(long j, int i, String str, short s, long j2) {
        this.a = j2;
        this.b = j;
        this.d = i;
        this.c = str == null ? "" : str;
        this.e = s;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof akog) && this.b == ((akog) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public final String toString() {
        long j = this.b;
        int i = this.d;
        String str = this.c;
        short s = this.e;
        long j2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 107);
        sb.append("Device [mac=");
        sb.append(j);
        sb.append(", rssi=");
        sb.append(i);
        sb.append(", ssid=");
        sb.append(str);
        sb.append(", frequency=");
        sb.append(s);
        sb.append(", scanTime=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
