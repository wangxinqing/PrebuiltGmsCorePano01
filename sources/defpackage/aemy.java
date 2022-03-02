package defpackage;

/* renamed from: aemy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aemy {
    static void a(float f, float[] fArr) {
        if (f > 0.5f) {
            fArr[0] = 0.0f;
            fArr[1] = (f + f) - 4.0f;
            return;
        }
        fArr[0] = 1.0f - (f + f);
        fArr[1] = 0.0f;
    }
}
