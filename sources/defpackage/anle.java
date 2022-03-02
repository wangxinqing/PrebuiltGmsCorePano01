package defpackage;

import java.io.Serializable;

/* renamed from: anle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anle extends anlh implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public anle(byte[] bArr) {
        this.a = (byte[]) amrl.a((Object) bArr);
    }

    public final int a() {
        return this.a.length * 8;
    }

    public final byte[] b() {
        return (byte[]) this.a.clone();
    }

    public final int c() {
        boolean z;
        int length = this.a.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        int i = (bArr[1] & 255) << 8;
        return ((bArr[3] & 255) << 24) | i | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
    }

    public final long d() {
        boolean z;
        int length = this.a.length;
        if (length >= 8) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = (long) (this.a[0] & 255);
        for (int i = 1; i < Math.min(this.a.length, 8); i++) {
            j |= (((long) this.a[i]) & 255) << (i * 8);
        }
        return j;
    }

    public final byte[] e() {
        return this.a;
    }

    public final boolean a(anlh anlh) {
        if (this.a.length != anlh.e().length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == anlh.e()[i];
            i++;
        }
    }
}
