package defpackage;

/* renamed from: ahwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahwl {
    public final String[] a = new String[20];
    public final boolean[] b = new boolean[20];
    public final double[] c = new double[20];
    public final double[] d = new double[20];
    private int e = 0;

    public ahwl() {
        for (int i = 0; i < 20; i++) {
            this.b[i] = false;
        }
    }

    public final void a(aiaj aiaj, aiwz aiwz) {
        String a2 = aiaj.a();
        String[] strArr = this.a;
        int i = this.e;
        strArr[i] = a2;
        this.c[i] = aiwz.b();
        this.d[this.e] = aiwz.c();
        boolean[] zArr = this.b;
        int i2 = this.e;
        zArr[i2] = true;
        this.e = (i2 + 1) % 20;
    }
}
