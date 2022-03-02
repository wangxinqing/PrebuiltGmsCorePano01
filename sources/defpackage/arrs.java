package defpackage;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* renamed from: arrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arrs extends arhd {
    public transient short a = 0;
    public short[] b;
    public long[] e;
    public int[] f;
    public int[] g;
    public long[] h;
    private arrq i;

    public arrs() {
        this.c = new arrr(this);
    }

    /* renamed from: a */
    public final arrq entrySet() {
        if (this.i == null) {
            this.i = new arrq(this);
        }
        return this.i;
    }

    public final short b() {
        short s = this.a;
        while (true) {
            s = (short) (s + 1);
            if (s != 0 && !((arri) this.d).b(s)) {
                return s;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final byte c() {
        return 3;
    }

    @Deprecated
    public final boolean containsKey(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }

    @Deprecated
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int length = this.b.length;
        return length + length + ((this.e.length + this.h.length) * 8) + (this.f.length * 4) + (this.g.length * 4);
    }

    /* renamed from: f */
    public final arhc values() {
        throw new UnsupportedOperationException("Inherited values is not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        throw new UnsupportedOperationException("Inherited get is not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        Short sh = (Short) obj;
        Long l = (Long) obj2;
        throw new UnsupportedOperationException("Inherited put is not supported.");
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Inherited remove is not supported.");
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.e);
        asLongBuffer.put(this.h);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.f);
        asIntBuffer.put(this.g);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object a(Object obj, boolean z) {
        throw new UnsupportedOperationException("Inherited get is not supported.");
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.e);
        asLongBuffer.get(this.h);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.f);
        asIntBuffer.get(this.g);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    @Deprecated
    public final boolean b(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    public final void a(short s, short s2, long j, int i2, int i3, long j2) {
        int a2 = ((arri) this.d).a(s);
        if (a2 < 0) {
            int i4 = a2 ^ -1;
            this.b[i4] = s2;
            this.e[i4] = j;
            this.f[i4] = i2;
            this.g[i4] = i3;
            this.h[i4] = j2;
            return;
        }
        this.b[a2] = s2;
        this.e[a2] = j;
        this.f[a2] = i2;
        this.g[a2] = i3;
        this.h[a2] = j2;
    }

    @Deprecated
    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }

    public final boolean a(short s) {
        return ((arri) this.d).b(s);
    }
}
