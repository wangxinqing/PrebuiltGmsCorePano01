package defpackage;

/* renamed from: bakn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakn extends badd {
    int a;
    final int b;
    final byte[] c;

    public bakn(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "offset must be >= 0");
        amrl.a(true, (Object) "length must be >= 0");
        int i3 = i2 + i;
        amrl.a(i3 <= bArr.length ? true : z2, (Object) "offset + length exceeds array boundary");
        this.c = (byte[]) amrl.a((Object) bArr, (Object) "bytes");
        this.a = i;
        this.b = i3;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final int b() {
        a(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    public final /* bridge */ /* synthetic */ bakl c(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new bakn(this.c, i2, i);
    }
}
