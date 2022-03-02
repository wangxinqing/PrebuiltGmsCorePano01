package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: apxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class apxg {
    public static final ThreadLocal b = new apxf();
    private int a;
    public int c;
    public ByteBuffer d;
    private int e;

    public apxg() {
        apxi.a();
    }

    protected static int a(int i, ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    public static int b(apxe apxe, int[] iArr) {
        int length = iArr.length;
        apxe.a(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return apxe.b();
            }
            apxe.b(iArr[length]);
        }
    }

    protected static int c(int i, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i;
        return byteBuffer.getShort((capacity + 4) - byteBuffer.getInt(capacity)) + capacity;
    }

    public final String A() {
        int d2 = d(8);
        if (d2 != 0) {
            return f(d2 + this.c);
        }
        return null;
    }

    public final int B() {
        int d2 = d(6);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final int C() {
        int d2 = d(6);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final String D() {
        int d2 = d(8);
        if (d2 != 0) {
            return f(d2 + this.c);
        }
        return null;
    }

    public final int E() {
        int d2 = d(24);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final String F() {
        int d2 = d(26);
        if (d2 != 0) {
            return f(d2 + this.c);
        }
        return null;
    }

    public final int G() {
        int d2 = d(30);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final int H() {
        int d2 = d(32);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final int I() {
        int d2 = d(4);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final int J() {
        int d2 = d(8);
        if (d2 != 0) {
            return this.d.getInt(d2 + this.c);
        }
        return 0;
    }

    public final boolean K() {
        int d2 = d(10);
        return (d2 == 0 || this.d.get(d2 + this.c) == 0) ? false : true;
    }

    public final int L() {
        int d2 = d(12);
        if (d2 != 0) {
            return this.d.getInt(d2 + this.c);
        }
        return 0;
    }

    public final int M() {
        int d2 = d(4);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final int N() {
        int d2 = d(6);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final apxg O() {
        apxg apxg = new apxg();
        int d2 = d(36);
        if (d2 == 0) {
            return null;
        }
        apxg.b(e(d2 + this.c), this.d);
        return apxg;
    }

    public final apxg P() {
        apxg apxg = new apxg();
        int d2 = d(4);
        if (d2 == 0) {
            return null;
        }
        apxg.b(e(d2 + this.c), this.d);
        return apxg;
    }

    public String Q() {
        int d2 = d(4);
        if (d2 != 0) {
            return f(d2 + this.c);
        }
        return null;
    }

    public int R() {
        int d2 = d(4);
        if (d2 != 0) {
            return this.d.getInt(d2 + this.c);
        }
        return 0;
    }

    public int S() {
        int d2 = d(4);
        if (d2 != 0) {
            return this.d.getInt(d2 + this.c);
        }
        return -1;
    }

    public int T() {
        int d2 = d(10);
        if (d2 != 0) {
            return this.d.getInt(d2 + this.c);
        }
        return 0;
    }

    public String U() {
        int d2 = d(6);
        if (d2 != 0) {
            return f(d2 + this.c);
        }
        return null;
    }

    public final int d(int i) {
        if (i < this.e) {
            return this.d.getShort(this.a + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int e(int i) {
        return i + this.d.getInt(i);
    }

    public final String f(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer byteBuffer = this.d;
        int i6 = i + byteBuffer.getInt(i);
        int i7 = i6 + 4;
        int i8 = byteBuffer.getInt(i6);
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + i7;
            int length = array.length;
            if ((arrayOffset | i8 | ((length - arrayOffset) - i8)) >= 0) {
                int i9 = arrayOffset + i8;
                char[] cArr = new char[i8];
                int i10 = 0;
                while (i5 < i9) {
                    byte b2 = array[i5];
                    if (!apxh.a(b2)) {
                        break;
                    }
                    arrayOffset = i5 + 1;
                    apxh.a(b2, cArr, i4);
                    i10 = i4 + 1;
                }
                while (i5 < i9) {
                    int i11 = i5 + 1;
                    byte b3 = array[i5];
                    if (apxh.a(b3)) {
                        apxh.a(b3, cArr, i4);
                        i4++;
                        i5 = i11;
                        while (i5 < i9) {
                            byte b4 = array[i5];
                            if (!apxh.a(b4)) {
                                break;
                            }
                            i5++;
                            apxh.a(b4, cArr, i4);
                            i4++;
                        }
                    } else if (!apxh.b(b3)) {
                        if (!apxh.c(b3)) {
                            if (i11 < i9 - 2) {
                                int i12 = i11 + 1;
                                int i13 = i12 + 1;
                                apxh.a(b3, array[i11], array[i12], array[i13], cArr, i4);
                                i4 += 2;
                                i5 = i13 + 1;
                            } else {
                                throw new IllegalArgumentException("Invalid UTF-8");
                            }
                        } else if (i11 < i9 - 1) {
                            int i14 = i11 + 1;
                            apxh.a(b3, array[i11], array[i14], cArr, i4);
                            i5 = i14 + 1;
                            i4++;
                        } else {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                    } else if (i11 < i9) {
                        i5 = i11 + 1;
                        apxh.a(b3, array[i11], cArr, i4);
                        i4++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                }
                return new String(cArr, 0, i4);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(arrayOffset), Integer.valueOf(i8)}));
        } else if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) >= 0) {
            int i15 = i7 + i8;
            char[] cArr2 = new char[i8];
            int i16 = 0;
            while (i3 < i15) {
                byte b5 = byteBuffer.get(i3);
                if (!apxh.a(b5)) {
                    break;
                }
                i7 = i3 + 1;
                apxh.a(b5, cArr2, i2);
                i16 = i2 + 1;
            }
            while (i3 < i15) {
                int i17 = i3 + 1;
                byte b6 = byteBuffer.get(i3);
                if (apxh.a(b6)) {
                    apxh.a(b6, cArr2, i2);
                    i2++;
                    i3 = i17;
                    while (i3 < i15) {
                        byte b7 = byteBuffer.get(i3);
                        if (!apxh.a(b7)) {
                            break;
                        }
                        i3++;
                        apxh.a(b7, cArr2, i2);
                        i2++;
                    }
                } else if (!apxh.b(b6)) {
                    if (!apxh.c(b6)) {
                        if (i17 < i15 - 2) {
                            int i18 = i17 + 1;
                            int i19 = i18 + 1;
                            apxh.a(b6, byteBuffer.get(i17), byteBuffer.get(i18), byteBuffer.get(i19), cArr2, i2);
                            i2 += 2;
                            i3 = i19 + 1;
                        } else {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                    } else if (i17 < i15 - 1) {
                        int i20 = i17 + 1;
                        apxh.a(b6, byteBuffer.get(i17), byteBuffer.get(i20), cArr2, i2);
                        i3 = i20 + 1;
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i17 < i15) {
                    i3 = i17 + 1;
                    apxh.a(b6, byteBuffer.get(i17), cArr2, i2);
                    i2++;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr2, 0, i2);
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)}));
        }
    }

    public final int g(int i) {
        int i2 = i + this.c;
        return this.d.getInt(i2 + this.d.getInt(i2));
    }

    public final int h(int i) {
        int i2 = i + this.c;
        return i2 + this.d.getInt(i2) + 4;
    }

    public final ByteBuffer i(int i) {
        int d2 = d(i);
        if (d2 == 0) {
            return null;
        }
        ByteBuffer order = this.d.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int h = h(d2);
        order.position(h);
        order.limit(h + g(d2));
        return order;
    }

    public final int j(int i) {
        int d2 = d(6);
        if (d2 != 0) {
            return this.d.getInt(h(d2) + (i * 4));
        }
        return 0;
    }

    public final apxg k(int i) {
        apxg apxg = new apxg();
        int d2 = d(4);
        if (d2 == 0) {
            return null;
        }
        apxg.b(e(h(d2) + (i * 4)), this.d);
        return apxg;
    }

    public final apxg l(int i) {
        apxg apxg = new apxg();
        int d2 = d(6);
        if (d2 == 0) {
            return null;
        }
        apxg.b(e(h(d2) + (i * 4)), this.d);
        return apxg;
    }

    public final long s() {
        int d2 = d(6);
        if (d2 != 0) {
            return this.d.getLong(d2 + this.c);
        }
        return 0;
    }

    public final boolean t() {
        int d2 = d(8);
        return (d2 == 0 || this.d.get(d2 + this.c) == 0) ? false : true;
    }

    public final boolean u() {
        int d2 = d(10);
        return (d2 == 0 || this.d.get(d2 + this.c) == 0) ? false : true;
    }

    public final int v() {
        int d2 = d(6);
        if (d2 != 0) {
            return g(d2);
        }
        return 0;
    }

    public final boy w() {
        boy boy = new boy();
        int d2 = d(8);
        if (d2 == 0) {
            return null;
        }
        boy.b(e(d2 + this.c), this.d);
        return boy;
    }

    public final long x() {
        int d2 = d(10);
        if (d2 != 0) {
            return this.d.getLong(d2 + this.c);
        }
        return -1;
    }

    public final String y() {
        int d2 = d(4);
        if (d2 != 0) {
            return f(d2 + this.c);
        }
        return null;
    }

    public final long z() {
        int d2 = d(6);
        if (d2 != 0) {
            return this.d.getLong(d2 + this.c);
        }
        return 0;
    }

    protected static int a(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int min = Math.min(i3, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    public static apxg b(ByteBuffer byteBuffer) {
        apxg apxg = new apxg();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        apxg.b(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return apxg;
    }

    public final brv c(String str) {
        int d2 = d(24);
        if (d2 == 0) {
            return null;
        }
        int h = h(d2);
        ByteBuffer byteBuffer = this.d;
        byte[] bytes = str.getBytes((Charset) b.get());
        int i = byteBuffer.getInt(h - 4);
        int i2 = 0;
        while (i != 0) {
            int i3 = i / 2;
            int a2 = a(((i2 + i3) * 4) + h, byteBuffer);
            int a3 = a(c(byteBuffer.capacity() - a2, byteBuffer), bytes, byteBuffer);
            if (a3 > 0) {
                i = i3;
            } else if (a3 < 0) {
                int i4 = i3 + 1;
                i2 += i4;
                i -= i4;
            } else {
                brv brv = new brv();
                brv.b(a2, byteBuffer);
                return brv;
            }
        }
        return null;
    }

    public final bsc d(String str) {
        int d2 = d(34);
        if (d2 != 0) {
            return bsc.a((bsc) null, h(d2), str, this.d);
        }
        return null;
    }

    public final apxg e(String str) {
        int d2 = d(28);
        if (d2 == 0) {
            return null;
        }
        int h = h(d2);
        ByteBuffer byteBuffer = this.d;
        byte[] bytes = str.getBytes((Charset) b.get());
        int i = byteBuffer.getInt(h - 4);
        int i2 = 0;
        while (i != 0) {
            int i3 = i / 2;
            int a2 = a(((i2 + i3) * 4) + h, byteBuffer);
            int a3 = a(c(byteBuffer.capacity() - a2, byteBuffer), bytes, byteBuffer);
            if (a3 > 0) {
                i = i3;
            } else if (a3 < 0) {
                int i4 = i3 + 1;
                i2 += i4;
                i -= i4;
            } else {
                apxg apxg = new apxg();
                apxg.b(a2, byteBuffer);
                return apxg;
            }
        }
        return null;
    }

    public static int a(apxe apxe, int i, int i2) {
        apxe.d(2);
        apxe.c(1, i2);
        apxe.b(0, i, -1);
        return apxe.e();
    }

    public final apxg b(apxg apxg, int i) {
        int d2 = d(6);
        if (d2 == 0) {
            return null;
        }
        apxg.b(e(h(d2) + (i * 4)), this.d);
        return apxg;
    }

    public final bsb b(String str) {
        int d2 = d(16);
        if (d2 != 0) {
            return bsb.a((bsb) null, h(d2), str, this.d);
        }
        return null;
    }

    public static int a(apxe apxe, int i, int i2, int i3, long j) {
        apxe.d(4);
        apxe.a(3, j, -1);
        apxe.c(2, i3);
        apxe.c(1, i2);
        apxe.b(0, i, 0);
        return apxe.e();
    }

    public final void b(int i, ByteBuffer byteBuffer) {
        short s;
        this.d = byteBuffer;
        if (byteBuffer != null) {
            this.c = i;
            int i2 = i - byteBuffer.getInt(i);
            this.a = i2;
            s = this.d.getShort(i2);
        } else {
            s = 0;
            this.c = 0;
            this.a = 0;
        }
        this.e = s;
    }

    public static apxg a(apxg apxg, int i, String str, ByteBuffer byteBuffer) {
        byte[] bytes = str.getBytes((Charset) b.get());
        int i2 = byteBuffer.getInt(i - 4);
        int i3 = 0;
        while (i2 != 0) {
            int i4 = i2 / 2;
            int a2 = a(((i3 + i4) * 4) + i, byteBuffer);
            int a3 = a(c(byteBuffer.capacity() - a2, byteBuffer), bytes, byteBuffer);
            if (a3 > 0) {
                i2 = i4;
            } else if (a3 < 0) {
                int i5 = i4 + 1;
                i3 += i5;
                i2 -= i5;
            } else {
                if (apxg == null) {
                    apxg = new apxg();
                }
                apxg.b(a2, byteBuffer);
                return apxg;
            }
        }
        return null;
    }

    public static void a(apxe apxe, int i) {
        apxe.a(i, "FTMR");
    }

    public static boolean a(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public final bru a(bru bru, int i) {
        int d2 = d(32);
        if (d2 == 0) {
            return null;
        }
        bru.b(e(h(d2) + (i * 4)), this.d);
        return bru;
    }

    public final brw a(brw brw, int i) {
        int d2 = d(30);
        if (d2 == 0) {
            return null;
        }
        brw.b(e(h(d2) + (i * 4)), this.d);
        return brw;
    }

    public final void a(brv brv, int i) {
        int d2 = d(24);
        if (d2 != 0) {
            brv.b(e(h(d2) + (i * 4)), this.d);
        }
    }

    public final void a(brx brx, int i) {
        int d2 = d(6);
        if (d2 != 0) {
            brx.b(e(h(d2) + (i * 4)), this.d);
        }
    }
}
