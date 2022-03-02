package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ahmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmt {
    public final int[] a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final Comparable[] g;
    private final ByteBuffer h;

    public ahmt(Comparable[] comparableArr, ByteBuffer byteBuffer, long j) {
        this.g = comparableArr;
        this.h = byteBuffer;
        byteBuffer.rewind();
        long j2 = byteBuffer.getLong();
        if (j2 == j) {
            this.b = byteBuffer.getInt();
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.getInt();
            this.e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            this.a = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                this.a[i2] = byteBuffer.position();
                byteBuffer.position(this.a[i2] + i3);
            }
            return;
        }
        StringBuilder sb = new StringBuilder(86);
        sb.append("Wrong version in model data. Expected ");
        sb.append(j);
        sb.append(", found ");
        sb.append(j2);
        throw new RuntimeException(sb.toString());
    }

    public final ahms a(int i, float[] fArr) {
        int i2;
        float f2;
        int i3 = this.a[i];
        int i4 = i3;
        while (true) {
            i2 = 0;
            if ((this.h.get(i4) & 1) != 0) {
                break;
            }
            long j = 0;
            while (i2 < this.f) {
                j |= (((long) this.h.get(i4 + i2)) & 255) << (i2 * 8);
                i2++;
            }
            long j2 = j >>> 1;
            int i5 = this.b;
            long j3 = j2 >>> i5;
            i4 = fArr[(int) (j2 & ((1 << i5) + -1))] <= Float.intBitsToFloat((int) j3) ? i4 + this.f : i3 + ((int) (j3 >>> 32));
        }
        int i6 = 0;
        while (i2 < this.e) {
            i6 |= (this.h.get(i4 + i2) & 255) << (i2 * 8);
            i2++;
        }
        int i7 = i6 >>> 1;
        int i8 = this.c;
        int i9 = ((1 << i8) - 1) & i7;
        int i10 = i7 >>> i8;
        int i11 = this.d;
        if (i11 != 0) {
            f2 = ((float) i10) / ((float) ((1 << i11) - 1));
        } else {
            f2 = 1.0f;
        }
        return new ahms(this.g[i9], f2);
    }
}
