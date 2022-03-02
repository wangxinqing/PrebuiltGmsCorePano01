package defpackage;

/* renamed from: aruj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aruj {
    public final float[] a = new float[10];
    public int b = 0;
    private int c = 0;

    public final float a(int i) {
        int i2 = this.b;
        if (i2 > i) {
            return this.a[(this.c + i) % i2];
        }
        return Float.NaN;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final void a(float f) {
        if (!Float.isNaN(f)) {
            float[] fArr = this.a;
            int i = this.c;
            this.c = i + 1;
            fArr[i] = f;
            this.b = Math.min(10, this.b + 1);
            this.c %= 10;
        }
    }
}
