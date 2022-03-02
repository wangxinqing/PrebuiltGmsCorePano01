package defpackage;

/* renamed from: aehl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aehl extends aehj {
    private final byte[] c;

    public aehl(aehk aehk) {
        super(aehk);
        this.c = aehk.a;
    }

    public final byte[] a() {
        byte[] b = b();
        byte[] bArr = this.c;
        if (bArr != null) {
            System.arraycopy(bArr, 0, b, 8, 6);
        }
        ((anih) ((anih) aehd.a.d()).a("aehl", "a", 225, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake Message: type (%02X), flag (%02X).", b[0], b[1]);
        return b;
    }
}
