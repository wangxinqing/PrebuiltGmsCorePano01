package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: apbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class apbk implements aotx {
    private final apbi a;
    private final apbi b;

    public apbk(byte[] bArr) {
        this.a = a(bArr, 1);
        this.b = a(bArr, 0);
    }

    public abstract apbi a(byte[] bArr, int i);

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int length = bArr3.length;
        if (length <= (Integer.MAX_VALUE - this.a.a()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.a.a() + length + 16);
            if (allocate.remaining() >= length + this.a.a() + 16) {
                int position = allocate.position();
                this.a.a(allocate, bArr3);
                allocate.position(position);
                byte[] bArr5 = new byte[this.a.a()];
                allocate.get(bArr5);
                allocate.limit(allocate.limit() - 16);
                byte[] bArr6 = new byte[32];
                this.b.a(bArr5, 0).get(bArr6);
                int length2 = bArr4.length;
                int i2 = length2 & 15;
                if (i2 != 0) {
                    i = (length2 + 16) - i2;
                } else {
                    i = length2;
                }
                int remaining = allocate.remaining();
                int i3 = remaining % 16;
                int i4 = (i3 != 0 ? (remaining + 16) - i3 : remaining) + i;
                ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr4);
                order.position(i);
                order.put(allocate);
                order.position(i4);
                order.putLong((long) length2);
                order.putLong((long) remaining);
                byte[] array = order.array();
                long a2 = apcu.a(bArr6, 0, 0);
                long a3 = apcu.a(bArr6, 3, 2) & 67108611;
                long a4 = apcu.a(bArr6, 6, 4) & 67092735;
                long a5 = apcu.a(bArr6, 9, 6) & 66076671;
                long a6 = apcu.a(bArr6, 12, 8) & 1048575;
                long j = a3 * 5;
                long j2 = a4 * 5;
                long j3 = a5 * 5;
                long j4 = a6 * 5;
                int i5 = 17;
                byte[] bArr7 = new byte[17];
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                int i6 = 0;
                while (true) {
                    int length3 = array.length;
                    if (i6 < length3) {
                        int min = Math.min(16, length3 - i6);
                        System.arraycopy(array, i6, bArr7, 0, min);
                        bArr7[min] = 1;
                        if (min != 16) {
                            Arrays.fill(bArr7, min + 1, i5, (byte) 0);
                        }
                        long a7 = j9 + apcu.a(bArr7, 0, 0);
                        long a8 = j6 + apcu.a(bArr7, 3, 2);
                        long a9 = j5 + apcu.a(bArr7, 6, 4);
                        long a10 = j7 + apcu.a(bArr7, 9, 6);
                        long a11 = j8 + (apcu.a(bArr7, 12, 8) | ((long) (bArr7[16] << 24)));
                        long j10 = (a7 * a2) + (a8 * j4) + (a9 * j3) + (a10 * j2) + (a11 * j);
                        long j11 = (a7 * a3) + (a8 * a2) + (a9 * j4) + (a10 * j3) + (a11 * j2) + (j10 >> 26);
                        long j12 = (a7 * a4) + (a8 * a3) + (a9 * a2) + (a10 * j4) + (a11 * j3) + (j11 >> 26);
                        long j13 = (a7 * a5) + (a8 * a4) + (a9 * a3) + (a10 * a2) + (a11 * j4) + (j12 >> 26);
                        long j14 = (a7 * a6) + (a8 * a5) + (a9 * a4) + (a10 * a3) + (a11 * a2) + (j13 >> 26);
                        j8 = j14 & 67108863;
                        long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                        j9 = j15 & 67108863;
                        j6 = (j11 & 67108863) + (j15 >> 26);
                        i6 += 16;
                        j7 = j13 & 67108863;
                        j5 = j12 & 67108863;
                        i5 = 17;
                    } else {
                        long j16 = j5 + (j6 >> 26);
                        long j17 = j16 & 67108863;
                        long j18 = j7 + (j16 >> 26);
                        long j19 = j18 & 67108863;
                        long j20 = j8 + (j18 >> 26);
                        long j21 = j20 & 67108863;
                        long j22 = j9 + ((j20 >> 26) * 5);
                        long j23 = j22 & 67108863;
                        long j24 = (j6 & 67108863) + (j22 >> 26);
                        long j25 = j23 + 5;
                        long j26 = j24 + (j25 >> 26);
                        long j27 = j17 + (j26 >> 26);
                        long j28 = j19 + (j27 >> 26);
                        long j29 = (j21 + (j28 >> 26)) - 67108864;
                        long j30 = j29 >> 63;
                        long j31 = j30 ^ -1;
                        long j32 = (j24 & j30) | (j26 & 67108863 & j31);
                        long j33 = (j17 & j30) | (j27 & 67108863 & j31);
                        long j34 = (j19 & j30) | (j28 & 67108863 & j31);
                        long a12 = (((j23 & j30) | (j25 & 67108863 & j31) | (j32 << 26)) & 4294967295L) + apcu.a(bArr6, 16);
                        long a13 = (((j32 >> 6) | (j33 << 20)) & 4294967295L) + apcu.a(bArr6, 20) + (a12 >> 32);
                        long a14 = (((j33 >> 12) | (j34 << 14)) & 4294967295L) + apcu.a(bArr6, 24) + (a13 >> 32);
                        long a15 = apcu.a(bArr6, 28);
                        byte[] bArr8 = new byte[16];
                        apcu.a(bArr8, a12 & 4294967295L, 0);
                        apcu.a(bArr8, a13 & 4294967295L, 4);
                        apcu.a(bArr8, a14 & 4294967295L, 8);
                        apcu.a(bArr8, ((((j34 >> 18) | (((j21 & j30) | (j29 & j31)) << 8)) & 4294967295L) + a15 + (a14 >> 32)) & 4294967295L, 12);
                        allocate.limit(allocate.limit() + 16);
                        allocate.put(bArr8);
                        return allocate.array();
                    }
                }
            } else {
                throw new IllegalArgumentException("Given ByteBuffer output is too small");
            }
        } else {
            throw new GeneralSecurityException("plaintext too long");
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
