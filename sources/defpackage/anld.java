package defpackage;

/* renamed from: anld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anld extends ankz {
    static final anli a = new anld();

    private static long a(long j) {
        return j ^ (j >>> 47);
    }

    private static long a(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }

    private static void a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long a2 = anlu.a(bArr, i);
        long a3 = anlu.a(bArr, i + 8);
        long a4 = anlu.a(bArr, i + 16);
        long a5 = anlu.a(bArr, i + 24);
        long j3 = j + a2;
        long rotateRight = Long.rotateRight(j2 + j3 + a5, 21);
        long j4 = a3 + j3 + a4;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + a5;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    public final anlh a(byte[] bArr, int i) {
        long j;
        long j2;
        long j3;
        long a2;
        long rotateRight;
        int i2;
        byte[] bArr2 = bArr;
        int i3 = i;
        amrl.a(0, i3, bArr2.length);
        int i4 = 37;
        if (i3 > 32) {
            if (i3 <= 64) {
                long j4 = ((long) (i3 + i3)) - 7286425919675154353L;
                long a3 = anlu.a(bArr2, 0) * -7286425919675154353L;
                long a4 = anlu.a(bArr2, 8);
                long a5 = anlu.a(bArr2, i3 - 8) * j4;
                long j5 = j4;
                long a6 = (anlu.a(bArr2, i3 - 16) * -7286425919675154353L) + Long.rotateRight(a3 + a4, 43) + Long.rotateRight(a5, 30);
                long rotateRight2 = Long.rotateRight(a4 - 7286425919675154353L, 18);
                long a7 = anlu.a(bArr2, 16) * j5;
                long a8 = anlu.a(bArr2, 24);
                long a9 = (a6 + anlu.a(bArr2, i3 - 32)) * j5;
                long j6 = j5;
                j = a(Long.rotateRight(a7 + a8, 43) + Long.rotateRight(a9, 30) + ((a(a6, rotateRight2 + a3 + a5, j6) + anlu.a(bArr2, i3 - 24)) * j5), a7 + Long.rotateRight(a8 + a3, 18) + a9, j6);
            } else {
                long a10 = a(-7956866745689871395L) * -7286425919675154353L;
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                long a11 = anlu.a(bArr2, 0) + 95310865018149119L;
                int i5 = i3 - 1;
                int i6 = (i5 >> 6) * 64;
                int i7 = i5 & 63;
                int i8 = (i6 + i7) - 63;
                long j7 = 2480279821605975764L;
                int i9 = 0;
                while (true) {
                    long rotateRight3 = Long.rotateRight(a11 + j7 + jArr[0] + anlu.a(bArr2, i9 + 8), i4);
                    long rotateRight4 = Long.rotateRight(j7 + jArr[1] + anlu.a(bArr2, i9 + 48), 42);
                    j3 = (rotateRight3 * -5435081209227447693L) ^ jArr2[1];
                    a2 = (rotateRight4 * -5435081209227447693L) + jArr[0] + anlu.a(bArr2, i9 + 40);
                    rotateRight = Long.rotateRight(a10 + jArr2[0], 33) * -5435081209227447693L;
                    i2 = i7;
                    a(bArr, i9, jArr[1] * -5435081209227447693L, j3 + jArr2[0], jArr);
                    a(bArr, i9 + 32, rotateRight + jArr2[1], a2 + anlu.a(bArr2, i9 + 16), jArr2);
                    int i10 = i9 + 64;
                    if (i10 == i6) {
                        break;
                    }
                    i9 = i10;
                    i7 = i2;
                    a10 = j3;
                    j7 = a2;
                    a11 = rotateRight;
                    i4 = 37;
                }
                long j8 = j3 & 255;
                long j9 = -5435081209227447693L + j8 + j8;
                long j10 = jArr2[0] + ((long) i2);
                long j11 = jArr[0] + j10;
                jArr[0] = j11;
                jArr2[0] = j10 + j11;
                long rotateRight5 = Long.rotateRight(rotateRight + a2 + j11 + anlu.a(bArr2, i8 + 8), 37);
                long rotateRight6 = Long.rotateRight(a2 + jArr[1] + anlu.a(bArr2, i8 + 48), 42);
                long j12 = (rotateRight5 * j9) ^ (jArr2[1] * 9);
                long a12 = (rotateRight6 * j9) + (jArr[0] * 9) + anlu.a(bArr2, i8 + 40);
                long rotateRight7 = Long.rotateRight(j3 + jArr2[0], 33) * j9;
                a(bArr, i8, jArr[1] * j9, j12 + jArr2[0], jArr);
                a(bArr, i8 + 32, rotateRight7 + jArr2[1], a12 + anlu.a(bArr2, i8 + 16), jArr2);
                long j13 = j9;
                j = a(a(jArr[0], jArr2[0], j13) + (a(a12) * -4348849565147123417L) + j12, a(jArr[1], jArr2[1], j13) + rotateRight7, j13);
            }
        } else if (i3 > 16) {
            long j14 = ((long) (i3 + i3)) - 7286425919675154353L;
            long a13 = anlu.a(bArr2, 0) * -5435081209227447693L;
            long a14 = anlu.a(bArr2, 8);
            long a15 = anlu.a(bArr2, i3 - 8) * j14;
            j = a(Long.rotateRight(a13 + a14, 43) + Long.rotateRight(a15, 30) + (anlu.a(bArr2, i3 - 16) * -7286425919675154353L), a13 + Long.rotateRight(a14 - 7286425919675154353L, 18) + a15, j14);
        } else {
            if (i3 >= 8) {
                long j15 = ((long) (i3 + i3)) - 7286425919675154353L;
                long a16 = anlu.a(bArr2, 0) - 7286425919675154353L;
                long a17 = anlu.a(bArr2, i3 - 8);
                j2 = a((Long.rotateRight(a17, 37) * j15) + a16, (Long.rotateRight(a16, 25) + a17) * j15, j15);
            } else if (i3 >= 4) {
                j2 = a(((long) i3) + ((((long) anlu.b(bArr2, 0)) & 4294967295L) << 3), ((long) anlu.b(bArr2, i3 - 4)) & 4294967295L, ((long) (i3 + i3)) - 7286425919675154353L);
            } else if (i3 > 0) {
                j2 = a((((long) (i3 + ((bArr2[i3 - 1] & 255) << 2))) * -4348849565147123417L) ^ (((long) ((bArr2[0] & 255) + ((bArr2[i3 >> 1] & 255) << 8))) * -7286425919675154353L)) * -7286425919675154353L;
            } else {
                j2 = -7286425919675154353L;
            }
            j = j2;
        }
        return anlh.a(j);
    }
}
