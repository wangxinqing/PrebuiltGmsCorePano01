package defpackage;

/* renamed from: fd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fd {
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public float d;
    public final float[] e = new float[6];
    ey[] f = new ey[8];
    int g = 0;
    public int h;

    public fd(int i) {
        this.h = i;
    }

    public final void a() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.g = 0;
    }

    public final String toString() {
        return "null";
    }

    /* access modifiers changed from: package-private */
    public final void a(ey eyVar) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.g) {
            if (this.f[i2] != eyVar) {
                i2++;
            } else {
                while (true) {
                    int i3 = this.g;
                    if (i < (i3 - i2) - 1) {
                        ey[] eyVarArr = this.f;
                        int i4 = i2 + i;
                        eyVarArr[i4] = eyVarArr[i4 + 1];
                        i++;
                    } else {
                        this.g = i3 - 1;
                        return;
                    }
                }
            }
        }
    }
}
