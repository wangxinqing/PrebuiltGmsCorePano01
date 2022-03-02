package defpackage;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: arho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arho extends arhl {
    private short[] k;
    private short[] l;
    private short[] m;
    private short[] n;
    private short[] o;
    private transient short[] p;

    public arho(arhi arhi, int i, int i2, float f, ByteBuffer byteBuffer) {
        super(arhi, i, i2, f, byteBuffer, 32767);
    }

    private static short[] l(int i) {
        short[] sArr = new short[i];
        Arrays.fill(sArr, -1);
        return sArr;
    }

    public final int a(int i) {
        return this.m[j(i)];
    }

    public final int b() {
        int i = this.f;
        int i2 = this.e;
        return (i * 8) + 48 + i2 + i2;
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
        short[] sArr = new short[i2];
        short s = 0;
        short s2 = 0;
        while (true) {
            i = i2 - 1;
            if (s2 >= i) {
                break;
            }
            short s3 = (short) (s2 + 1);
            sArr[s2] = s3;
            s2 = s3;
        }
        sArr[i] = 0;
        this.k = sArr;
        int i3 = this.f;
        short[] sArr2 = new short[i3];
        int i4 = i3 - 1;
        sArr2[0] = (short) i4;
        while (s < i4) {
            int i5 = s + 1;
            sArr2[i5] = s;
            s = (short) i5;
        }
        this.l = sArr2;
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
            short[] sArr = this.l;
            short s = sArr[i];
            short s2 = sArr[i2];
            if (i == s2) {
                this.h = i;
                this.i = s;
                return;
            }
            if (i == this.i) {
                this.i = s;
            }
            short[] sArr2 = this.k;
            short s3 = sArr2[i];
            sArr2[i] = (short) i2;
            sArr[i] = s2;
            sArr2[s] = s3;
            sArr[s3] = s;
            short s4 = (short) i;
            sArr2[s2] = s4;
            sArr[i2] = s4;
            this.h = i;
            this.d++;
        }
    }

    /* access modifiers changed from: protected */
    public final void h(int i) {
        short s = this.n[i];
        short s2 = this.o[i];
        int j = j(this.j.c(i));
        short[] sArr = this.m;
        if (i == sArr[j]) {
            sArr[j] = s;
        } else {
            this.n[s2] = s;
        }
        if (s != -1) {
            this.o[s] = s2;
        }
        this.n[i] = -1;
        this.o[i] = -1;
        this.g--;
        this.d++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: short} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            int r0 = r6.f
            int r1 = r6.b
            if (r0 != r1) goto L_0x002f
            short[] r0 = r6.m
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            int r0 = r6.h
            int r2 = r6.g
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r2) goto L_0x0028
            short[] r5 = r6.n
            r5[r0] = r1
            short[] r5 = r6.o
            r5[r0] = r1
            arhi r5 = r6.j
            r5.d(r0)
            short[] r5 = r6.k
            short r0 = r5[r0]
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arho.a():void");
    }

    public final int b(int i) {
        return this.n[i];
    }

    public final void b(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.k);
        asShortBuffer.put(this.l);
        asShortBuffer.put(this.m);
        asShortBuffer.put(this.n);
        asShortBuffer.put(this.o);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    public final void a(int i, int i2) {
        short[] sArr;
        int j = j(i2);
        short[] sArr2 = this.m;
        short s = sArr2[j];
        if (s == -1) {
            sArr2[j] = (short) i;
            this.o[i] = -1;
        } else {
            while (true) {
                sArr = this.n;
                short s2 = sArr[s];
                if (s2 == -1) {
                    break;
                }
                s = s2;
            }
            sArr[s] = (short) i;
            this.o[i] = s;
        }
        this.g++;
        this.d++;
    }

    public final void e(int i) {
        int i2 = this.i;
        if (i != i2) {
            short[] sArr = this.k;
            short s = sArr[i];
            short s2 = sArr[i2];
            if (i == s2) {
                this.i = i;
                this.h = s;
                return;
            }
            if (i == this.h) {
                this.h = s;
            }
            short[] sArr2 = this.l;
            short s3 = sArr2[i];
            sArr[i] = s2;
            sArr2[i] = (short) i2;
            sArr[s3] = s;
            sArr2[s] = s3;
            short s4 = (short) i;
            sArr[i2] = s4;
            sArr2[s2] = s4;
            this.i = i;
            this.d++;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        int i = this.f;
        this.k = new short[i];
        this.l = new short[i];
        this.m = new short[this.e];
        this.n = new short[i];
        this.o = new short[i];
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.k);
        asShortBuffer.get(this.l);
        asShortBuffer.get(this.m);
        asShortBuffer.get(this.n);
        asShortBuffer.get(this.o);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }
}
