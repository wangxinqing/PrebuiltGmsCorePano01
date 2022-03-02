package defpackage;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: arsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsc extends arhg {
    public int[] a;

    private arsc(arhj arhj) {
        this.d = new arsb(this, arhj);
    }

    public static arrz a(int i, arhj arhj) {
        return new arrz(new arsc(arhj), i);
    }

    public static int b(short s, short s2) {
        return (s << 16) | ((char) s2);
    }

    public static short b(int i) {
        return (short) (i >> 16);
    }

    public static short c(int i) {
        return (short) ((char) i);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return a(((Integer) obj).intValue()) < 0;
    }

    /* access modifiers changed from: protected */
    public final byte b() {
        return 1;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int a2 = a(((Integer) obj).intValue(), false);
            if (a2 != -1) {
                i = this.c.a(a2, true);
            } else {
                i = -1;
            }
            if (i != -1) {
                this.d.d(i);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return this.a.length * 4;
    }

    public static arsc a(ByteBuffer byteBuffer, arhj arhj) {
        arsc arsc = new arsc(arhj);
        arhg.a(arsc, byteBuffer);
        return arsc;
    }

    public final int a(int i) {
        int a2 = a(i, true);
        if (a2 != -1) {
            return a2;
        }
        int g = this.c.g();
        this.c.a(g, i);
        this.a[g] = i;
        return g ^ -1;
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    public final int a(int i, boolean z) {
        if (!isEmpty()) {
            int a2 = this.c.a(i);
            while (a2 != -1) {
                if (i != this.a[a2]) {
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

    public final int a(short s, short s2) {
        return a(b(s, s2));
    }

    /* renamed from: a */
    public final arsa iterator() {
        return new arsa(this);
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    @Deprecated
    public final boolean a(Object obj) {
        if (!(obj instanceof Integer) || a(((Integer) obj).intValue(), false) == -1) {
            return false;
        }
        return true;
    }
}
