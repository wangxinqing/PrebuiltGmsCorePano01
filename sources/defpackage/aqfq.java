package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: aqfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfq {
    final int a;
    final float b;
    final float[] c;

    public aqfq(int i, float f, float[] fArr) {
        this.a = i;
        this.b = f;
        float[] fArr2 = new float[fArr.length];
        this.c = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqfq) {
            aqfq aqfq = (aqfq) obj;
            if (this.a == aqfq.a && this.b == aqfq.b && Arrays.equals(this.c, aqfq.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Float.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" GpsStatusInfo{");
        int i = this.a;
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append(" numSatellites=");
        sb2.append(i);
        sb.append(sb2.toString());
        String valueOf = String.valueOf(String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(this.b)}));
        sb.append(valueOf.length() == 0 ? new String(" averageSnr=") : " averageSnr=".concat(valueOf));
        String valueOf2 = String.valueOf(Arrays.toString(this.c));
        sb.append(valueOf2.length() == 0 ? new String(" topFiveSnrs=") : " topFiveSnrs=".concat(valueOf2));
        sb.append("}");
        return sb.toString();
    }
}
