package defpackage;

/* renamed from: uby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uby implements Runnable {
    private final udb a;
    private final String b;
    private final String c;
    private final byte[] d;
    private final aehx e;

    public uby(udb udb, String str, String str2, byte[] bArr, aehx aehx) {
        this.a = udb;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = aehx;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
