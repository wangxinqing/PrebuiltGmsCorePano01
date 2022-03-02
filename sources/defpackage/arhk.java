package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: arhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arhk extends arhl {
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private transient byte[] p;

    public arhk(arhi arhi, int i, int i2, float f, ByteBuffer byteBuffer) {
        super(arhi, i, i2, f, byteBuffer, 127);
    }

    private static byte[] l(int i) {
        byte[] bArr = new byte[i];
        Arrays.fill(bArr, (byte) -1);
        return bArr;
    }

    public final int a(int i) {
        return this.m[j(i)];
    }

    public final int b() {
        return (this.f * 4) + 48 + this.e;
    }

    public final int c(int i) {
        return this.l[i];
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.p = this.k;
    }

    public final int d(int i) {
        return this.k[i];
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.p = null;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        int i;
        int i2 = this.f;
        byte[] bArr = new byte[i2];
        byte b = 0;
        byte b2 = 0;
        while (true) {
            i = i2 - 1;
            if (b2 >= i) {
                break;
            }
            byte b3 = (byte) (b2 + 1);
            bArr[b2] = b3;
            b2 = b3;
        }
        bArr[i] = 0;
        this.k = bArr;
        int i3 = this.f;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        bArr2[0] = (byte) i4;
        while (b < i4) {
            int i5 = b + 1;
            bArr2[i5] = b;
            b = (byte) i5;
        }
        this.l = bArr2;
        this.m = l(this.e);
        this.n = l(this.f);
        this.o = l(this.f);
    }

    /* access modifiers changed from: protected */
    public final int f(int i) {
        return this.p[i];
    }

    /* access modifiers changed from: protected */
    public final void g(int i) {
        int i2 = this.h;
        if (i != i2) {
            byte[] bArr = this.l;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (i == b2) {
                this.h = i;
                this.i = b;
                return;
            }
            if (i == this.i) {
                this.i = b;
            }
            byte[] bArr2 = this.k;
            byte b3 = bArr2[i];
            bArr2[i] = (byte) i2;
            bArr[i] = b2;
            bArr2[b] = b3;
            bArr[b3] = b;
            byte b4 = (byte) i;
            bArr2[b2] = b4;
            bArr[i2] = b4;
            this.h = i;
            this.d++;
        }
    }

    /* access modifiers changed from: protected */
    public final void h(int i) {
        byte b = this.n[i];
        byte b2 = this.o[i];
        int j = j(this.j.c(i));
        byte[] bArr = this.m;
        if (i == bArr[j]) {
            bArr[j] = b;
        } else {
            this.n[b2] = b;
        }
        if (b != -1) {
            this.o[b] = b2;
        }
        this.n[i] = -1;
        this.o[i] = -1;
        this.g--;
        this.d++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            int r0 = r6.f
            int r1 = r6.b
            if (r0 != r1) goto L_0x002f
            byte[] r0 = r6.m
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            int r0 = r6.h
            int r2 = r6.g
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r2) goto L_0x0028
            byte[] r5 = r6.n
            r5[r0] = r1
            byte[] r5 = r6.o
            r5[r0] = r1
            arhi r5 = r6.j
            r5.d(r0)
            byte[] r5 = r6.k
            byte r0 = r5[r0]
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0028:
            int r0 = r6.i
            r6.h = r0
            r6.g = r3
            goto L_0x0032
        L_0x002f:
            r6.k(r1)
        L_0x0032:
            int r0 = r6.d
            int r0 = r0 + 1
            r6.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arhk.a():void");
    }

    public final int b(int i) {
        return this.n[i];
    }

    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.k);
        byteBuffer.put(this.l);
        byteBuffer.put(this.m);
        byteBuffer.put(this.n);
        byteBuffer.put(this.o);
    }

    public final void a(int i, int i2) {
        byte[] bArr;
        int j = j(i2);
        byte[] bArr2 = this.m;
        byte b = bArr2[j];
        if (b == -1) {
            bArr2[j] = (byte) i;
            this.o[i] = -1;
        } else {
            while (true) {
                bArr = this.n;
                byte b2 = bArr[b];
                if (b2 == -1) {
                    break;
                }
                b = b2;
            }
            bArr[b] = (byte) i;
            this.o[i] = b;
        }
        this.g++;
        this.d++;
    }

    public final void e(int i) {
        int i2 = this.i;
        if (i != i2) {
            byte[] bArr = this.k;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (i == b2) {
                this.i = i;
                this.h = b;
                return;
            }
            if (i == this.h) {
                this.h = b;
            }
            byte[] bArr2 = this.l;
            byte b3 = bArr2[i];
            bArr[i] = b2;
            bArr2[i] = (byte) i2;
            bArr[b3] = b;
            bArr2[b] = b3;
            byte b4 = (byte) i;
            bArr[i2] = b4;
            bArr2[b2] = b4;
            this.i = i;
            this.d++;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        int i = this.f;
        this.k = new byte[i];
        this.l = new byte[i];
        this.m = new byte[this.e];
        this.n = new byte[i];
        this.o = new byte[i];
        byteBuffer.get(this.k);
        byteBuffer.get(this.l);
        byteBuffer.get(this.m);
        byteBuffer.get(this.n);
        byteBuffer.get(this.o);
    }
}
