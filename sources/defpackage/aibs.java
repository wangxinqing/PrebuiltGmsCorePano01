package defpackage;

/* renamed from: aibs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aibs implements Comparable {
    public static int j = 0;
    public final long e;
    public final String f;
    public final int g;
    public final short h;
    public final long i;

    public aibs(long j2, int i2, String str, short s, long j3) {
        this.e = j2;
        this.g = i2;
        this.f = str == null ? "" : str;
        this.h = s;
        this.i = j3;
    }

    public boolean a() {
        return false;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((aibs) obj).g - this.g;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof aibs) && this.e == ((aibs) obj).e;
    }

    public final int hashCode() {
        long j2 = this.e;
        return ((int) (j2 >> 32)) ^ ((int) j2);
    }

    public final String toString() {
        long j2 = this.e;
        int i2 = this.g;
        String str = this.f;
        short s = this.h;
        long j3 = this.i;
        StringBuilder sb = new StringBuilder(str.length() + 107);
        sb.append("Device [mac=");
        sb.append(j2);
        sb.append(", rssi=");
        sb.append(i2);
        sb.append(", ssid=");
        sb.append(str);
        sb.append(", frequency=");
        sb.append(s);
        sb.append(", scanTime=");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }
}
