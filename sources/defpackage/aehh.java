package defpackage;

/* renamed from: aehh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aehh extends aehj {
    public aehh(aehg aehg) {
        super(aehg);
        byte b = aehg.a;
        byte b2 = aehg.b;
        byte[] bArr = aehg.c;
    }

    public final byte[] a() {
        byte[] b = b();
        if ((this.b & aefn.DEVICE_ACTION.c) != 0) {
            b[8] = 0;
            b[9] = 0;
        }
        ((anih) ((anih) aehd.a.d()).a("aehh", "a", 291, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake Message: type (%02X), flag (%02X).", b[0], b[1]);
        return b;
    }
}
