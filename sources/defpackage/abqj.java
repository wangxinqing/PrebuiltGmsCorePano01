package defpackage;

/* renamed from: abqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqj implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ abql b;

    public abqj(abql abql, byte[] bArr) {
        this.b = abql;
        this.a = bArr;
    }

    public final void run() {
        acau acau = this.b.a.e;
        if (acau == null) {
            abqo.a.e("Received %d bytes but controller is null", Integer.valueOf(this.a.length));
            return;
        }
        acau.a(this.a);
    }
}
