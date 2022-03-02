package defpackage;

/* renamed from: gkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkb {
    public static final iwd a = new iwd("D2D", "BluetoothConnectionSecurer");
    public static final gjy b = gjy.a;

    public static gka a(gkq gkq, gkm gkm, byte[] bArr, gkt gkt) {
        ausc a2 = ausc.a();
        a2.c(bArr);
        byte[] a3 = a2.a(gkt.k());
        aurx d = a2.d();
        gkq.e = new gjz(gkm, d);
        gko gko = new gko(gkq);
        gkq.a.b("Connection listener thread starting.", new Object[0]);
        gko.start();
        gkq.a(a3);
        return new gka(gkq, d);
    }
}
