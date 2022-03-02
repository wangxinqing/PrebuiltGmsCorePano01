package defpackage;

/* renamed from: tqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tqc implements tpa {
    final tlh a;
    final byte[] b;
    final /* synthetic */ tql c;

    public tqc(tql tql, tlh tlh, byte[] bArr) {
        this.c = tql;
        this.a = tlh;
        this.b = bArr;
    }

    public final void a(upc upc) {
        this.c.a((Runnable) new tqb(this, upc));
    }
}
