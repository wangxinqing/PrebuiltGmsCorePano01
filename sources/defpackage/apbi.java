package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: apbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class apbi implements apcs {
    private static final int[] b = b(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    final int[] a;
    private final int c;

    public apbi(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.a = b(bArr);
            this.c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private static int a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    static int[] b(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public abstract int a();

    public abstract int[] a(int[] iArr, int i);

    static void a(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            a(iArr2, 0, 4, 8, 12);
            a(iArr2, 1, 5, 9, 13);
            a(iArr2, 2, 6, 10, 14);
            a(iArr2, 3, 7, 11, 15);
            a(iArr2, 0, 5, 10, 15);
            a(iArr2, 1, 6, 11, 12);
            a(iArr2, 2, 7, 8, 13);
            a(iArr2, 3, 4, 9, 14);
        }
    }

    static void a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int a2 = a(i5 ^ iArr[i4], 16);
        iArr[i4] = a2;
        int i6 = iArr[i3] + a2;
        iArr[i3] = i6;
        int a3 = a(iArr[i2] ^ i6, 12);
        iArr[i2] = a3;
        int i7 = iArr[i] + a3;
        iArr[i] = i7;
        int a4 = a(iArr[i4] ^ i7, 8);
        iArr[i4] = a4;
        int i8 = iArr[i3] + a4;
        iArr[i3] = i8;
        iArr[i2] = a(iArr[i2] ^ i8, 7);
    }

    static void a(int[] iArr, int[] iArr2) {
        int[] iArr3 = b;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, b.length, 8);
    }

    /* access modifiers changed from: package-private */
    public final ByteBuffer a(byte[] bArr, int i) {
        int[] a2 = a(b(bArr), i);
        int[] iArr = (int[]) a2.clone();
        a(iArr);
        for (int i2 = 0; i2 < a2.length; i2++) {
            a2[i2] = a2[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a2, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    public final void a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - a() >= bArr.length) {
            byte[] a2 = apcw.a(a());
            byteBuffer.put(a2);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a3 = a(a2, this.c + i2);
                if (i2 == i - 1) {
                    apbg.a(byteBuffer, wrap, a3, remaining % 64);
                } else {
                    apbg.a(byteBuffer, wrap, a3, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length <= Integer.MAX_VALUE - a()) {
            ByteBuffer allocate = ByteBuffer.allocate(a() + length);
            a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
