package defpackage;

/* renamed from: utb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class utb implements Runnable {
    private final utd a;
    private final usu b;
    private final byte[] c;

    public utb(utd utd, usu usu, byte[] bArr) {
        this.a = utd;
        this.b = usu;
        this.c = bArr;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
