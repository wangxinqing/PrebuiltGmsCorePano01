package defpackage;

import java.util.Arrays;

/* renamed from: ahyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyr {
    public final long a;
    public final float[] b;

    public ahyr(long j, float[] fArr) {
        this.a = j;
        this.b = fArr;
    }

    public final String toString() {
        long j = this.a;
        String arrays = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 55);
        sb.append("SensorEvent [timestampNano=");
        sb.append(j);
        sb.append(", data=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
