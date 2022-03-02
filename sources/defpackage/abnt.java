package defpackage;

/* renamed from: abnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abnt implements abvy {
    final /* synthetic */ abnu a;

    public abnt(abnu abnu) {
        this.a = abnu;
    }

    public final void a(Exception exc) {
        abnu.a.e("packet processing error", exc, new Object[0]);
        this.a.a(10556, "packet processing error");
    }

    public final void a(byte[] bArr) {
        abnu.a.a("Fully decoded packet message", new Object[0]);
        this.a.c(bArr);
    }
}
