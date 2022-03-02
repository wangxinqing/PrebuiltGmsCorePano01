package defpackage;

/* renamed from: rze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rze implements Runnable {
    private final sac a;
    private final byte[] b;
    private final byte[] c;
    private final acwd d;

    public rze(sac sac, byte[] bArr, byte[] bArr2, acwd acwd) {
        this.a = sac;
        this.b = bArr;
        this.c = bArr2;
        this.d = acwd;
    }

    public final void run() {
        sac sac = this.a;
        sac.c.b((ihb) new rzn(sac, this.b, this.c)).a(sac.a, (acvp) new rzh(this.d));
    }
}
