package defpackage;

/* renamed from: vbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vbz extends vbw {
    public final String toString() {
        String a = a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 26);
        sb.append("EddystoneUidPrefix{bytes=");
        sb.append(a);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vbz(byte[] bArr) {
        super(bArr);
        int length = bArr.length;
        boolean z = true;
        if (!(length == 10 || length == 16)) {
            z = false;
        }
        iva.b(z, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
    }
}
