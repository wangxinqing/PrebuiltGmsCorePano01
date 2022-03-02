package defpackage;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: arri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arri extends arhg {
    public short[] a;

    private arri(arhj arhj) {
        this.d = new arrh(this, arhj);
    }

    public static arrf a(arhj arhj) {
        return new arrf(new arri(arhj));
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return a(((Short) obj).shortValue()) < 0;
    }

    /* access modifiers changed from: protected */
    public final byte b() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        int length = this.a.length;
        return length + length;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        int i;
        if (obj instanceof Short) {
            int a2 = a(((Short) obj).shortValue(), false);
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
    public final void b(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.a);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    public static arri a(ByteBuffer byteBuffer, arhj arhj) {
        arri arri = new arri(arhj);
        arhg.a(arri, byteBuffer);
        return arri;
    }

    public final int a(short s) {
        int a2 = a(s, true);
        if (a2 != -1) {
            return a2;
        }
        int g = this.c.g();
        this.c.a(g, (int) s);
        this.a[g] = s;
        return g ^ -1;
    }

    public final boolean b(short s) {
        return a(s, false) != -1;
    }

    public final int a(short s, boolean z) {
        if (!isEmpty()) {
            int a2 = this.c.a((int) s);
            while (a2 != -1) {
                if (s != this.a[a2]) {
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
    public final arrg iterator() {
        return new arrg(this);
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.a);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    @Deprecated
    public final boolean a(Object obj) {
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        return false;
    }
}
