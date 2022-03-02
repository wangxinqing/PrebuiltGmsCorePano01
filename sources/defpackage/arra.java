package defpackage;

import java.lang.reflect.Array;

/* renamed from: arra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arra {
    final float[][] a;
    final float[] b;
    final float[] c;

    public arra(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        this.a = (float[][]) Array.newInstance(float.class, iArr);
        this.b = new float[i2];
        this.c = new float[i2];
    }
}
