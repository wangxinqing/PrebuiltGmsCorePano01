package defpackage;

/* renamed from: aibv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibv {
    public long a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public final String toString() {
        long j2 = this.a;
        int i2 = this.b;
        long j3 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        int i6 = this.g;
        int i7 = this.h;
        int i8 = this.i;
        StringBuilder sb = new StringBuilder(248);
        sb.append("WifiRttResult [bssid=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", ts=");
        sb.append(j3);
        sb.append(", rssi=");
        sb.append(i3);
        sb.append(", distanceCm=");
        sb.append(i4);
        sb.append(", distanceSdCm=");
        sb.append(i5);
        sb.append(", measurementtype=");
        sb.append(i6);
        sb.append(", numMeasurementFrames=");
        sb.append(i7);
        sb.append(", numSuccessFrames=");
        sb.append(i8);
        sb.append("]");
        return sb.toString();
    }
}
