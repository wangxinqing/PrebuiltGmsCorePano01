package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anly extends anla {
    private long a;
    private long b;
    private int c = 0;

    public anly(int i) {
        long j = (long) i;
        this.a = j;
        this.b = j;
    }

    private static long b(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    private static long c(long j) {
        return Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
    }

    private static long d(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * -8663945395140668459L;
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long c2 = c(j) ^ this.a;
        this.a = c2;
        long rotateLeft = Long.rotateLeft(c2, 27);
        long j3 = this.b;
        this.a = ((rotateLeft + j3) * 5) + 1390208809;
        long d = d(j2) ^ j3;
        this.b = d;
        this.b = ((Long.rotateLeft(d, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    public final anlh b() {
        long j = this.a;
        long j2 = (long) this.c;
        long j3 = this.b ^ j2;
        long j4 = (j ^ j2) + j3;
        this.a = j4;
        this.b = j3 + j4;
        this.a = b(j4);
        long b2 = b(this.b);
        long j5 = this.a + b2;
        this.a = j5;
        this.b = b2 + j5;
        return anlh.a(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0080, code lost:
        r7 = r7 ^ ((long) defpackage.aoop.a(r14.get(8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008d, code lost:
        r0 = r14.getLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009f, code lost:
        r0 = (((long) defpackage.aoop.a(r14.get(5))) << 40) ^ r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ae, code lost:
        r0 = r0 ^ (((long) defpackage.aoop.a(r14.get(4))) << 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bc, code lost:
        r0 = r0 ^ (((long) defpackage.aoop.a(r14.get(3))) << 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cb, code lost:
        r0 = r0 ^ (((long) defpackage.aoop.a(r14.get(2))) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d9, code lost:
        r0 = r0 ^ (((long) defpackage.aoop.a(r14.get(1))) << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e7, code lost:
        r0 = r0 ^ ((long) defpackage.aoop.a(r14.get(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        r13.a = c(r0) ^ r13.a;
        r13.b ^= d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0104, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        r7 = r7 ^ (((long) defpackage.aoop.a(r14.get(13))) << 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
        r7 = r7 ^ (((long) defpackage.aoop.a(r14.get(12))) << 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0053, code lost:
        r7 = r7 ^ (((long) defpackage.aoop.a(r14.get(11))) << 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0062, code lost:
        r7 = r7 ^ (((long) defpackage.aoop.a(r14.get(10))) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0071, code lost:
        r7 = r7 ^ (((long) defpackage.aoop.a(r14.get(9))) << 8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            int r0 = r13.c
            int r1 = r14.remaining()
            int r0 = r0 + r1
            r13.c = r0
            int r0 = r14.remaining()
            r1 = 40
            r2 = 32
            r3 = 24
            r4 = 16
            r5 = 48
            r6 = 8
            r7 = 0
            switch(r0) {
                case 1: goto L_0x00e6;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00ad;
                case 6: goto L_0x009e;
                case 7: goto L_0x0092;
                case 8: goto L_0x008c;
                case 9: goto L_0x007f;
                case 10: goto L_0x0070;
                case 11: goto L_0x0061;
                case 12: goto L_0x0052;
                case 13: goto L_0x0043;
                case 14: goto L_0x0033;
                case 15: goto L_0x0026;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.AssertionError r14 = new java.lang.AssertionError
            java.lang.String r0 = "Should never get here."
            r14.<init>(r0)
            throw r14
        L_0x0026:
            r0 = 14
            byte r0 = r14.get(r0)
            int r0 = defpackage.aoop.a((byte) r0)
            long r7 = (long) r0
            long r7 = r7 << r5
            goto L_0x0034
        L_0x0033:
        L_0x0034:
            r0 = 13
            byte r0 = r14.get(r0)
            int r0 = defpackage.aoop.a((byte) r0)
            long r9 = (long) r0
            long r0 = r9 << r1
            long r7 = r7 ^ r0
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            r0 = 12
            byte r0 = r14.get(r0)
            int r0 = defpackage.aoop.a((byte) r0)
            long r0 = (long) r0
            long r0 = r0 << r2
            long r7 = r7 ^ r0
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            r0 = 11
            byte r0 = r14.get(r0)
            int r0 = defpackage.aoop.a((byte) r0)
            long r0 = (long) r0
            long r0 = r0 << r3
            long r7 = r7 ^ r0
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            r0 = 10
            byte r0 = r14.get(r0)
            int r0 = defpackage.aoop.a((byte) r0)
            long r0 = (long) r0
            long r0 = r0 << r4
            long r7 = r7 ^ r0
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            r0 = 9
            byte r0 = r14.get(r0)
            int r0 = defpackage.aoop.a((byte) r0)
            long r0 = (long) r0
            long r0 = r0 << r6
            long r7 = r7 ^ r0
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            byte r0 = r14.get(r6)
            int r0 = defpackage.aoop.a((byte) r0)
            long r0 = (long) r0
            long r7 = r7 ^ r0
            goto L_0x008d
        L_0x008c:
        L_0x008d:
            long r0 = r14.getLong()
            goto L_0x00f2
        L_0x0092:
            r0 = 6
            byte r0 = r14.get(r0)
            int r0 = defpackage.aoop.a((byte) r0)
            long r9 = (long) r0
            long r9 = r9 << r5
            goto L_0x009f
        L_0x009e:
            r9 = r7
        L_0x009f:
            r0 = 5
            byte r0 = r14.get(r0)
            int r0 = defpackage.aoop.a((byte) r0)
            long r11 = (long) r0
            long r0 = r11 << r1
            long r0 = r0 ^ r9
            goto L_0x00ae
        L_0x00ad:
            r0 = r7
        L_0x00ae:
            r5 = 4
            byte r5 = r14.get(r5)
            int r5 = defpackage.aoop.a((byte) r5)
            long r9 = (long) r5
            long r9 = r9 << r2
            long r0 = r0 ^ r9
            goto L_0x00bc
        L_0x00bb:
            r0 = r7
        L_0x00bc:
            r2 = 3
            byte r2 = r14.get(r2)
            int r2 = defpackage.aoop.a((byte) r2)
            long r9 = (long) r2
            long r2 = r9 << r3
            long r0 = r0 ^ r2
            goto L_0x00cb
        L_0x00ca:
            r0 = r7
        L_0x00cb:
            r2 = 2
            byte r2 = r14.get(r2)
            int r2 = defpackage.aoop.a((byte) r2)
            long r2 = (long) r2
            long r2 = r2 << r4
            long r0 = r0 ^ r2
            goto L_0x00d9
        L_0x00d8:
            r0 = r7
        L_0x00d9:
            r2 = 1
            byte r2 = r14.get(r2)
            int r2 = defpackage.aoop.a((byte) r2)
            long r2 = (long) r2
            long r2 = r2 << r6
            long r0 = r0 ^ r2
            goto L_0x00e7
        L_0x00e6:
            r0 = r7
        L_0x00e7:
            r2 = 0
            byte r14 = r14.get(r2)
            int r14 = defpackage.aoop.a((byte) r14)
            long r2 = (long) r14
            long r0 = r0 ^ r2
        L_0x00f2:
            long r2 = r13.a
            long r0 = c(r0)
            long r0 = r0 ^ r2
            r13.a = r0
            long r0 = r13.b
            long r2 = d(r7)
            long r0 = r0 ^ r2
            r13.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anly.b(java.nio.ByteBuffer):void");
    }
}
