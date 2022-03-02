package defpackage;

/* renamed from: aiay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiay {
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public aiay(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        long j2 = this.d;
        StringBuilder sb = new StringBuilder(148);
        sb.append("NlpLocationstatus[wifiStatus = ");
        sb.append(i);
        sb.append(" cellStatus = ");
        sb.append(i2);
        sb.append(" timestampMillis = ");
        sb.append(j);
        sb.append(" elapsedRealtimeNs = ");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
