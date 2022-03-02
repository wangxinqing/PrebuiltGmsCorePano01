package defpackage;

/* renamed from: abnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abnq implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ abnu b;

    public abnq(abnu abnu, byte[] bArr) {
        this.b = abnu;
        this.a = bArr;
    }

    public final void run() {
        abwa abwa;
        abnu abnu = this.b;
        if (!abnu.e || (abwa = abnu.g) == null) {
            abnu.c(this.a);
        } else {
            abwa.b(this.a);
        }
    }
}
