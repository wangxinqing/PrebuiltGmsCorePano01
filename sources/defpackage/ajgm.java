package defpackage;

/* renamed from: ajgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajgm {
    public final ajgi a;
    public final long[] b;
    public int c = 0;

    public ajgm(ajgi ajgi) {
        this.a = ajgi;
        this.b = new long[ajgi.b];
        for (int i = 0; i < ajgi.b; i++) {
            this.b[i] = -(ajgi.a + 1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        long[] jArr = this.b;
        int i = this.c;
        jArr[i] = j;
        this.c = (i + 1) % this.a.b;
    }
}
