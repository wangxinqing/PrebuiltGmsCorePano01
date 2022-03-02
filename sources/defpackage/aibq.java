package defpackage;

/* renamed from: aibq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibq {
    private final long a;
    private final byte[] b;
    private int c = 0;

    public aibq(long j, int i) {
        this.a = j;
        byte[] bArr = new byte[((i * 9) + 9)];
        this.b = bArr;
        bArr[0] = 0;
        aibr.a(j, bArr, 1, 8);
        this.c += 9;
    }

    public final aibr a(aibv[] aibvArr, boolean z) {
        int i = this.c;
        byte[] bArr = this.b;
        int length = bArr.length;
        if (i == length) {
            return new aibr(bArr, aibvArr, z);
        }
        StringBuilder sb = new StringBuilder(90);
        sb.append("Too few addDevice() calls? Byte array not filled: ");
        sb.append(i);
        sb.append(" of ");
        sb.append(length);
        sb.append(" bytes written");
        throw new IllegalStateException(sb.toString());
    }

    public final void a(long j, byte b2, int i, long j2) {
        aibr.a(j, this.b, this.c, 6);
        int i2 = this.c + 6;
        byte[] bArr = this.b;
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = b2;
        this.c = i3 + 1;
        bArr[i3] = (byte) (arvy.a(i) - 128);
        long j3 = (this.a - j2) / 100;
        if (j3 > 127) {
            byte[] bArr2 = this.b;
            int i4 = this.c;
            this.c = i4 + 1;
            bArr2[i4] = Byte.MAX_VALUE;
            return;
        }
        byte[] bArr3 = this.b;
        int i5 = this.c;
        this.c = i5 + 1;
        bArr3[i5] = (byte) ((int) j3);
    }
}
