package defpackage;

/* renamed from: abnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abnm implements abvy {
    final /* synthetic */ abno a;

    public abnm(abno abno) {
        this.a = abno;
    }

    public final void a(Exception exc) {
        this.a.a.e("Packet processing error", exc, new Object[0]);
        this.a.c.a(10556);
        this.a.b(10556);
    }

    public final void a(byte[] bArr) {
        this.a.a.a("Fully decoded packet message", new Object[0]);
        this.a.b(bArr);
    }
}
