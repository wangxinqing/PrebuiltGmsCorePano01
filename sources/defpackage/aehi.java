package defpackage;

/* renamed from: aehi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class aehi {
    byte d;
    byte e;
    public byte[] f;

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (length == 6) {
            this.f = bArr;
            return;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("Incorrect verification data length: ");
        sb.append(length);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }
}
