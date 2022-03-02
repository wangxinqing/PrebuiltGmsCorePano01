package defpackage;

/* renamed from: wfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfx implements Runnable {
    private final wgu a;
    private final String b;
    private final byte[] c;

    public wfx(wgu wgu, String str, byte[] bArr) {
        this.a = wgu;
        this.b = str;
        this.c = bArr;
    }

    public final void run() {
        this.a.a(this.b, this.c, true);
    }
}
