package defpackage;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;

/* renamed from: arqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arqj extends arhg {
    public long[] a;

    private arqj(arhj arhj) {
        this.d = new arqi(this, arhj);
    }

    public static arqg a(int i) {
        return a(i, (arhj) null);
    }

    public static boolean a(long j) {
        return j >= 0 && j <= 281474976710655L;
    }

    public static int b(long j) {
        long c = c(j);
        return (int) (c ^ (c >>> 32));
    }

    public static long c(long j) {
        return j & 281474976710655L;
    }

    public static arqj d(ByteBuffer byteBuffer) {
        return a(byteBuffer, (arhj) null);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return a(((Long) obj).longValue(), 0);
    }

    /* access modifiers changed from: protected */
    public final byte b() {
        return 1;
    }

    @Deprecated
    public final boolean contains(Object obj) {
        return a(obj);
    }

    @Deprecated
    public final boolean remove(Object obj) {
        int i;
        int b;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (!a(longValue) || (b = b(longValue, false)) == -1) {
                i = -1;
            } else {
                i = this.c.a(b, true);
            }
            if (i != -1) {
                this.d.d(i);
                return true;
            }
        }
        return false;
    }

    public static arqg a(int i, arhj arhj) {
        return new arqg(new arqj(arhj), i);
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return this.a.length * 8;
    }

    public final int d(long j) {
        int b = b(c(j), true);
        if (b != -1) {
            this.a[b] = j;
            return b;
        }
        int g = this.c.g();
        this.c.a(g, b(j));
        this.a[g] = j;
        return g ^ -1;
    }

    public final int b(long j, short s) {
        if (a(j)) {
            return d(j + (((long) s) << 48));
        }
        throw new IllegalArgumentException("Specified AP ID is not valid.");
    }

    public static arqj a(ByteBuffer byteBuffer, arhj arhj) {
        arqj arqj = new arqj(arhj);
        arhg.a(arqj, byteBuffer);
        return arqj;
    }

    public final int b(long j, boolean z) {
        if (!isEmpty() && a(j)) {
            int a2 = this.c.a(b(j));
            while (a2 != -1) {
                if (j != c(this.a[a2])) {
                    a2 = this.c.b(a2);
                } else {
                    if (z) {
                        this.c.e(a2);
                    }
                    return a2;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final arqh iterator() {
        return new arqh(this);
    }

    public final void a(arqj arqj) {
        clear();
        if (arqj != null) {
            arqh a2 = arqj.iterator();
            while (a2.hasNext()) {
                a2.c();
                a(a2.a(), a2.f());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    public final short b(int i) {
        return (short) ((int) (this.a[i] >>> 48));
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    public final boolean a(long j, short s) {
        return b(j, s) < 0;
    }

    public final boolean a(long j, boolean z) {
        return b(j, z) != -1;
    }

    @Deprecated
    public final boolean a(Object obj) {
        if (obj instanceof Long) {
            return a(((Long) obj).longValue(), false);
        }
        return false;
    }
}
