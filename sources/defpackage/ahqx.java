package defpackage;

/* renamed from: ahqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqx extends arhj {
    final /* synthetic */ ahqz a;
    private int[] b;
    private long[] c;
    private long[] d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ahqx(ahqz ahqz) {
        super((arhj) null);
        this.a = ahqz;
    }

    public final void a() {
        ahqz ahqz = this.a;
        this.b = ahqz.b;
        this.c = ahqz.c;
        this.d = ahqz.d;
    }

    public final void b() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void b(int i) {
    }

    public final void a(int i) {
        ahqz ahqz = this.a;
        ahqz.b = new int[i];
        ahqz.c = new long[i];
        ahqz.d = new long[i];
    }

    public final void a(int i, int i2) {
        long[] jArr;
        long[] jArr2;
        int[] iArr = this.b;
        if (iArr != null && (jArr = this.c) != null && (jArr2 = this.d) != null) {
            ahqz ahqz = this.a;
            ahqz.b[i2] = iArr[i];
            ahqz.c[i2] = jArr[i];
            ahqz.d[i2] = jArr2[i];
        }
    }
}
