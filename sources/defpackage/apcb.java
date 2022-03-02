package defpackage;

/* renamed from: apcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcb implements aouu {
    private final byte[] a;
    private final byte[] b;

    public apcb(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] b2 = apbx.b(bArr);
            this.a = b2;
            this.b = apbx.a(b2);
            return;
        }
        throw new IllegalArgumentException(String.format("Given private key's length is not %s", new Object[]{32}));
    }

    public final byte[] a(byte[] bArr) {
        return apbx.a(bArr, this.b, this.a);
    }
}
