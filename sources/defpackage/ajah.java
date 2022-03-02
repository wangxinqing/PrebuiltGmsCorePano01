package defpackage;

/* renamed from: ajah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajah {
    public final int a;
    public final int b;
    public final long c;
    private final float d;

    public ajah(int i, int i2, float f, long j) {
        this.a = i;
        this.b = i2;
        this.d = f;
        this.c = j;
    }

    public final String toString() {
        float f = this.d;
        long j = this.c;
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(162);
        sb.append("HardwareAudioFusionModelResponse{confidence=");
        sb.append(f);
        sb.append(", elapsedRealTimeMillis=");
        sb.append(j);
        sb.append(", fusionActivity=");
        sb.append(i);
        sb.append(", fusionResultType=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }
}
