package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: apxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apxe {
    public ByteBuffer a;
    public int b;
    int c;
    int[] d;
    int e;
    boolean f;
    boolean g;
    int h;
    int[] i;
    int j;
    int k;
    apxc l;

    public apxe() {
        this(1024);
    }

    public final int a() {
        return this.a.capacity() - this.b;
    }

    public final int b() {
        if (this.f) {
            this.f = false;
            a(this.k);
            return a();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public final void c() {
        if (!this.g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public final void d() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final int e() {
        int i2;
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        b(0);
        int a2 = a();
        int i3 = this.e - 1;
        while (i3 >= 0 && this.d[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.d[i4];
            a((short) (i5 != 0 ? a2 - i5 : 0));
        }
        a((short) (a2 - this.h));
        int i6 = i3 + 3;
        a((short) (i6 + i6));
        int i7 = 0;
        loop2:
        while (true) {
            if (i7 >= this.j) {
                i2 = 0;
                break;
            }
            int capacity = this.a.capacity() - this.i[i7];
            int i8 = this.b;
            short s = this.a.getShort(capacity);
            if (s == this.a.getShort(i8)) {
                int i9 = 2;
                while (i9 < s) {
                    if (this.a.getShort(capacity + i9) == this.a.getShort(i8 + i9)) {
                        i9 += 2;
                    }
                }
                i2 = this.i[i7];
                break loop2;
            }
            i7++;
        }
        if (i2 != 0) {
            int capacity2 = this.a.capacity() - a2;
            this.b = capacity2;
            this.a.putInt(capacity2, i2 - a2);
        } else {
            int i10 = this.j;
            int[] iArr = this.i;
            if (i10 == iArr.length) {
                this.i = Arrays.copyOf(iArr, i10 + i10);
            }
            int[] iArr2 = this.i;
            int i11 = this.j;
            this.j = i11 + 1;
            iArr2[i11] = a();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.putInt(byteBuffer.capacity() - a2, a() - a2);
        }
        this.f = false;
        return a2;
    }

    public final ByteBuffer f() {
        c();
        return this.a;
    }

    public apxe(int i2) {
        apxd apxd = apxd.a;
        apxi.a();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        i2 = i2 <= 0 ? 1 : i2;
        this.l = apxd;
        ByteBuffer a2 = apxd.a(i2);
        this.a = a2;
        this.b = a2.capacity();
    }

    public final void c(int i2) {
        a(4, 0);
        a((a() - i2) + 4);
    }

    public final void d(int i2) {
        d();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i2) {
            this.d = new int[i2];
        }
        this.e = i2;
        Arrays.fill(this.d, 0, i2, 0);
        this.f = true;
        this.h = a();
    }

    public final void f(int i2) {
        a(this.c, 4);
        c(i2);
        this.a.position(this.b);
        this.g = true;
    }

    public final int a(CharSequence charSequence) {
        char c2;
        int i2;
        int i3;
        char charAt;
        CharSequence charSequence2 = charSequence;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence2.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            c2 = 2048;
            if (i5 >= length) {
                break;
            }
            char charAt2 = charSequence2.charAt(i5);
            if (charAt2 < 2048) {
                i6 += (127 - charAt2) >>> 31;
                i5++;
            } else {
                int length2 = charSequence.length();
                int i7 = 0;
                while (i5 < length2) {
                    char charAt3 = charSequence2.charAt(i5);
                    if (charAt3 < 2048) {
                        i7 += (127 - charAt3) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt3 >= 55296 && charAt3 <= 57343) {
                            if (Character.codePointAt(charSequence2, i5) >= 65536) {
                                i5++;
                            } else {
                                throw new apxj(i5, length2);
                            }
                        }
                    }
                    i5++;
                }
                i6 += i7;
            }
        }
        if (i6 >= length) {
            a((byte) 0);
            a(1, i6, 1);
            ByteBuffer byteBuffer = this.a;
            int i8 = this.b - i6;
            this.b = i8;
            byteBuffer.position(i8);
            ByteBuffer byteBuffer2 = this.a;
            if (byteBuffer2.hasArray()) {
                int arrayOffset = byteBuffer2.arrayOffset();
                byte[] array = byteBuffer2.array();
                int position = byteBuffer2.position() + arrayOffset;
                int remaining = byteBuffer2.remaining();
                int length3 = charSequence.length();
                int i9 = remaining + position;
                while (i4 < length3) {
                    int i10 = i4 + position;
                    if (i10 >= i9 || (charAt = charSequence2.charAt(i4)) >= 128) {
                        break;
                    }
                    array[i10] = (byte) charAt;
                    i4++;
                }
                if (i4 != length3) {
                    i2 = position + i4;
                    while (i4 < length3) {
                        char charAt4 = charSequence2.charAt(i4);
                        if (charAt4 < 128 && i2 < i9) {
                            array[i2] = (byte) charAt4;
                            i2++;
                        } else if (charAt4 < c2 && i2 <= i9 - 2) {
                            int i11 = i2 + 1;
                            array[i2] = (byte) ((charAt4 >>> 6) | 960);
                            array[i11] = (byte) ((charAt4 & '?') | 128);
                            i2 = i11 + 1;
                        } else if ((charAt4 < 55296 || charAt4 > 57343) && i2 <= i9 - 3) {
                            int i12 = i2 + 1;
                            array[i2] = (byte) ((charAt4 >>> 12) | 480);
                            int i13 = i12 + 1;
                            array[i12] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            array[i13] = (byte) ((charAt4 & '?') | 128);
                            i2 = i13 + 1;
                        } else if (i2 <= i9 - 4) {
                            int i14 = i4 + 1;
                            if (i14 != charSequence.length()) {
                                char charAt5 = charSequence2.charAt(i14);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint = Character.toCodePoint(charAt4, charAt5);
                                    int i15 = i2 + 1;
                                    array[i2] = (byte) ((codePoint >>> 18) | 240);
                                    int i16 = i15 + 1;
                                    array[i15] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i17 = i16 + 1;
                                    array[i16] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i2 = i17 + 1;
                                    array[i17] = (byte) ((codePoint & 63) | 128);
                                    i4 = i14;
                                } else {
                                    i4 = i14;
                                }
                            }
                            throw new apxj(i4 - 1, length3);
                        } else if (charAt4 < 55296 || charAt4 > 57343 || ((i3 = i4 + 1) != charSequence.length() && Character.isSurrogatePair(charAt4, charSequence2.charAt(i3)))) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Failed writing ");
                            sb.append(charAt4);
                            sb.append(" at index ");
                            sb.append(i2);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        } else {
                            throw new apxj(i4, length3);
                        }
                        i4++;
                        c2 = 2048;
                    }
                } else {
                    i2 = position + length3;
                }
                byteBuffer2.position(i2 - arrayOffset);
            } else {
                apxi.a(charSequence2, byteBuffer2);
            }
            return b();
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i6) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void b(int i2) {
        a(4, 0);
        a(i2);
    }

    public final void b(int i2, int i3) {
        int capacity = this.a.capacity() - i2;
        if (this.a.getShort((capacity - this.a.getInt(capacity)) + i3) == 0) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("FlatBuffers: field ");
            sb.append(i3);
            sb.append(" must be set");
            throw new AssertionError(sb.toString());
        }
    }

    public final void c(int i2, int i3) {
        if (i3 != 0) {
            c(i3);
            e(i2);
        }
    }

    public final void b(int i2, int i3, int i4) {
        if (i3 != i4) {
            b(i3);
            e(i2);
        }
    }

    public final void e(int i2) {
        this.d[i2] = a();
    }

    public final int a(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a((byte) 0);
        a(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.a;
        int i2 = this.b - remaining;
        this.b = i2;
        byteBuffer2.position(i2);
        this.a.put(byteBuffer);
        return b();
    }

    public final int a(byte[] bArr) {
        int length = bArr.length;
        a(1, length, 1);
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - length;
        this.b = i2;
        byteBuffer.position(i2);
        this.a.put(bArr);
        return b();
    }

    public final void a(byte b2) {
        a(1, 0);
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 1;
        this.b = i2;
        byteBuffer.put(i2, b2);
    }

    public final void a(float f2) {
        a(4, 0);
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putFloat(i2, f2);
    }

    public final void a(int i2) {
        ByteBuffer byteBuffer = this.a;
        int i3 = this.b - 4;
        this.b = i3;
        byteBuffer.putInt(i3, i2);
    }

    public final void a(int i2, int i3) {
        int i4;
        if (i2 > this.c) {
            this.c = i2;
        }
        int capacity = ((((this.a.capacity() - this.b) + i3) ^ -1) + 1) & (i2 - 1);
        while (this.b < capacity + i2 + i3) {
            int capacity2 = this.a.capacity();
            ByteBuffer byteBuffer = this.a;
            apxc apxc = this.l;
            int capacity3 = byteBuffer.capacity();
            if ((-1073741824 & capacity3) == 0) {
                if (capacity3 != 0) {
                    i4 = capacity3 + capacity3;
                } else {
                    i4 = 1;
                }
                byteBuffer.position(0);
                ByteBuffer a2 = apxc.a(i4);
                a2.position(a2.clear().capacity() - capacity3);
                a2.put(byteBuffer);
                this.a = a2;
                this.b += a2.capacity() - capacity2;
            } else {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
        }
        for (int i5 = 0; i5 < capacity; i5++) {
            ByteBuffer byteBuffer2 = this.a;
            int i6 = this.b - 1;
            this.b = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    public final void a(int i2, int i3, int i4) {
        d();
        this.k = i3;
        int i5 = i2 * i3;
        a(4, i5);
        a(i4, i5);
        this.f = true;
    }

    public final void a(int i2, long j2, long j3) {
        if (j2 != j3) {
            a(8, 0);
            ByteBuffer byteBuffer = this.a;
            int i3 = this.b - 8;
            this.b = i3;
            byteBuffer.putLong(i3, j2);
            e(i2);
        }
    }

    public final void a(int i2, String str) {
        a(this.c, 8);
        if (str.length() == 4) {
            for (int i3 = 3; i3 >= 0; i3--) {
                a((byte) str.charAt(i3));
            }
            f(i2);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public final void a(int i2, boolean z) {
        if (z) {
            a(1, 0);
            ByteBuffer byteBuffer = this.a;
            int i3 = this.b - 1;
            this.b = i3;
            byteBuffer.put(i3, (byte) 1);
            e(i2);
        }
    }

    public final void a(short s) {
        a(2, 0);
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 2;
        this.b = i2;
        byteBuffer.putShort(i2, s);
    }
}
