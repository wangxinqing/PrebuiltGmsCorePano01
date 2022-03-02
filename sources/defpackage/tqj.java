package defpackage;

/* renamed from: tqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tqj implements Runnable {
    private final tqk a;
    private final String b;
    private final byte[] c;

    public tqj(tqk tqk, String str, byte[] bArr) {
        this.a = tqk;
        this.b = str;
        this.c = bArr;
    }

    public final void run() {
        tqk tqk = this.a;
        tqk.a.a(this.b, this.c);
    }
}
