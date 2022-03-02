package defpackage;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;

/* renamed from: argb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class argb extends arhg {
    public long[] a;

    private argb(arhj arhj) {
        this.d = new arga(this, arhj);
    }

    public static arfy a(int i, arhj arhj) {
        return new arfy(new argb(arhj), i);
    }

    public static int d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static arfy f() {
        return a(128, (arhj) null);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return a(((Long) obj).longValue());
    }

    /* access modifiers changed from: protected */
    public final byte b() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return this.a.length * 8;
    }

    public final boolean remove(Object obj) {
        int c;
        if (!(obj instanceof Long) || (c = c(((Long) obj).longValue())) == -1) {
            return false;
        }
        this.d.d(c);
        return true;
    }

    public final int b(long j) {
        int b = b(j, true);
        if (b != -1) {
            return b;
        }
        int g = this.c.g();
        this.c.a(g, d(j));
        this.a[g] = j;
        return g ^ -1;
    }

    public final int c(long j) {
        int b = b(j, false);
        if (b != -1) {
            return this.c.a(b, true);
        }
        return -1;
    }

    /* renamed from: a */
    public final arfz iterator() {
        return new arfz(this);
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    public final int b(long j, boolean z) {
        if (!isEmpty()) {
            int a2 = this.c.a(d(j));
            while (a2 != -1) {
                if (j != this.a[a2]) {
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

    public final boolean a(long j) {
        return b(j) < 0;
    }

    public final boolean a(long j, boolean z) {
        return b(j, z) != -1;
    }

    public final boolean a(Object obj) {
        if (obj instanceof Long) {
            return a(((Long) obj).longValue(), false);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }
}
