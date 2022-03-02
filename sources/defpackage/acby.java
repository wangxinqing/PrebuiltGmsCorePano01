package defpackage;

/* renamed from: acby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acby {
    public final byte[] a;

    public acby() {
        byte[] bArr = new byte[3];
        this.a = bArr;
        bArr[0] = 1;
    }

    public final boolean a() {
        return this.a[1] != 0;
    }

    public final String toString() {
        return String.format("SourceDeviceEndpointInfo[outOfBand=%s]", new Object[]{Boolean.valueOf(a())});
    }

    public acby(byte[] bArr) {
        this.a = bArr;
    }
}
