package defpackage;

/* renamed from: ahwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwi {
    public final short[] a;
    public final float[] b;
    public int c = 0;
    public int d = 0;
    private final int e;

    public ahwi(int i, Class cls) {
        if (cls == Float.class) {
            this.b = new float[i];
            this.a = new short[0];
        } else if (cls == Short.class) {
            this.b = new float[0];
            this.a = new short[i];
        } else {
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Does not support ");
            sb.append(valueOf);
            sb.append(" class.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.e = i;
    }

    public final int a(int i) {
        return (this.c + i) % this.e;
    }

    public final void b(int i) {
        int i2 = this.d + i;
        this.d = i2;
        int i3 = this.e;
        if (i2 > i3) {
            this.c = a(i2 % i3);
            this.d = this.e;
        }
    }

    public final void c(int i) {
        this.c = a(i);
        this.d -= i;
    }

    public final void a(int i, int i2, int i3) {
        boolean z = true;
        amrl.a(i2 >= 0 && i2 <= this.e);
        amrl.a(i >= 0);
        if (i + i2 > i3) {
            z = false;
        }
        amrl.a(z);
    }
}
