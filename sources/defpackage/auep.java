package defpackage;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: auep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auep extends auay {
    static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public static final /* synthetic */ int h = 0;
    private static final long serialVersionUID = 1;
    public final int d;
    public final auay e;
    public final auay f;
    public final int g;
    private final int i;

    public auep(auay auay, auay auay2) {
        this.e = auay;
        this.f = auay2;
        int a2 = auay.a();
        this.i = a2;
        this.d = a2 + auay2.a();
        this.g = Math.max(auay.c(), auay2.c()) + 1;
    }

    public static auay a(auay auay, auay auay2) {
        int a2 = auay.a();
        int a3 = auay2.a();
        byte[] bArr = new byte[(a2 + a3)];
        auay.b(bArr, 0, 0, a2);
        auay2.b(bArr, 0, a2, a3);
        return auay.b(bArr);
    }

    static int e(int i2) {
        int[] iArr = a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return Integer.MAX_VALUE;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public final int a() {
        return this.d;
    }

    public final byte b(int i2) {
        int i3 = this.i;
        if (i2 >= i3) {
            return this.f.b(i2 - i3);
        }
        return this.e.b(i2);
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return this.d >= e(this.g);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auay) {
            auay auay = (auay) obj;
            if (this.d == auay.a()) {
                if (this.d == 0) {
                    return true;
                }
                int i2 = this.c;
                int i3 = auay.c;
                if (i2 != 0 && i3 != 0 && i2 != i3) {
                    return false;
                }
                auen auen = new auen(this);
                auau a2 = auen.next();
                auen auen2 = new auen(auay);
                auau a3 = auen2.next();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int a4 = a2.a() - i4;
                    int a5 = a3.a() - i5;
                    int min = Math.min(a4, a5);
                    if (!(i4 == 0 ? a2.a(a3, i5, min) : a3.a(a2, i4, min))) {
                        return false;
                    }
                    i6 += min;
                    int i7 = this.d;
                    if (i6 < i7) {
                        if (min == a4) {
                            a2 = auen.next();
                            i4 = 0;
                        } else {
                            i4 += min;
                        }
                        if (min == a5) {
                            a3 = auen2.next();
                            i5 = 0;
                        } else {
                            i5 += min;
                        }
                    } else if (i6 == i7) {
                        return true;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    public final boolean f() {
        int a2 = this.e.a(0, 0, this.i);
        auay auay = this.f;
        return auay.a(a2, 0, auay.a()) == 0;
    }

    public final InputStream g() {
        return new aueo(this);
    }

    public final aubc h() {
        return aubc.a((InputStream) new aueo(this));
    }

    public final auas i() {
        return new auel(this);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return auay.b(k());
    }

    public final byte a(int i2) {
        b(i2, this.d);
        return b(i2);
    }

    /* access modifiers changed from: protected */
    public final int b(int i2, int i3, int i4) {
        int i5 = this.i;
        if (i3 + i4 <= i5) {
            return this.e.b(i2, i3, i4);
        }
        if (i3 >= i5) {
            return this.f.b(i2, i3 - i5, i4);
        }
        int i6 = i5 - i3;
        return this.f.b(this.e.b(i2, i3, i6), 0, i4 - i6);
    }

    public final ByteBuffer e() {
        return ByteBuffer.wrap(k()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: protected */
    public final int a(int i2, int i3, int i4) {
        int i5 = this.i;
        if (i3 + i4 <= i5) {
            return this.e.a(i2, i3, i4);
        }
        if (i3 >= i5) {
            return this.f.a(i2, i3 - i5, i4);
        }
        int i6 = i5 - i3;
        return this.f.a(this.e.a(i2, i3, i6), 0, i4 - i6);
    }

    public final auay a(int i2, int i3) {
        int c = c(i2, i3, this.d);
        if (c == 0) {
            return auay.b;
        }
        if (c == this.d) {
            return this;
        }
        int i4 = this.i;
        if (i3 <= i4) {
            return this.e.a(i2, i3);
        }
        if (i2 < i4) {
            return new auep(this.e.c(i2), this.f.a(0, i3 - this.i));
        }
        return this.f.a(i2 - i4, i3 - i4);
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(k(), charset);
    }

    public final void a(auam auam) {
        this.e.a(auam);
        this.f.a(auam);
    }

    public final void a(OutputStream outputStream) {
        this.e.a(outputStream);
        this.f.a(outputStream);
    }

    public final void a(ByteBuffer byteBuffer) {
        this.e.a(byteBuffer);
        this.f.a(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr, int i2, int i3, int i4) {
        int i5 = this.i;
        if (i2 + i4 <= i5) {
            this.e.a(bArr, i2, i3, i4);
        } else if (i2 < i5) {
            int i6 = i5 - i2;
            this.e.a(bArr, i2, i3, i6);
            this.f.a(bArr, 0, i3 + i6, i4 - i6);
        } else {
            this.f.a(bArr, i2 - i5, i3, i4);
        }
    }
}
