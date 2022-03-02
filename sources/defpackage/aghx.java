package defpackage;

/* renamed from: aghx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aghx {
    public Boolean a;
    public agng b;
    public Integer c;
    public amri d;

    public aghx() {
    }

    public final void a(float f) {
        boolean z = false;
        if (f > 0.0f && f <= 1.0f) {
            z = true;
        }
        amrl.b(z, (Object) "Sampling Probability shall be > 0 and <= 1");
        this.b = agng.a(f);
    }

    public aghx(byte[] bArr) {
        this.d = ampu.a;
    }

    public final void a(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void a(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
