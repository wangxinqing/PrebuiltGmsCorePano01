package defpackage;

import java.util.Arrays;

/* renamed from: ajaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajaf {
    public final long a;
    public final float[] b;

    public ajaf(long j, float[] fArr) {
        this.a = j;
        this.b = fArr;
    }

    public final String toString() {
        return "HardwareArSample[elapsedRealtimeMs=" + this.a + ", confidences=" + Arrays.toString(this.b) + "]";
    }
}
