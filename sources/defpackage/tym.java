package defpackage;

/* renamed from: tym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tym implements Runnable {
    private final tyt a;
    private final int b;
    private final int c;
    private final byte[] d;

    public tym(tyt tyt, int i, int i2, byte[] bArr) {
        this.a = tyt;
        this.b = i;
        this.c = i2;
        this.d = bArr;
    }

    public final void run() {
        tyt tyt = this.a;
        int i = this.b;
        int i2 = this.c;
        byte[] bArr = this.d;
        if (tyt.d()) {
            tyt.a.execute(new tyi(tyt, i, i2, bArr));
        }
    }
}
