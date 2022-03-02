package defpackage;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* renamed from: arrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arrn extends arhd {
    public transient short a = 0;
    public short[] b;
    public long[] e;
    public int[] f;
    public long[] g;
    private arrl h;

    public arrn() {
        this.c = new arrm(this);
    }

    /* renamed from: a */
    public final arrl entrySet() {
        if (this.h == null) {
            this.h = new arrl(this);
        }
        return this.h;
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
        return 2;
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
        return length + length + ((this.e.length + this.g.length) * 8) + (this.f.length * 4);
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
        asLongBuffer.put(this.g);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.f);
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
        asLongBuffer.get(this.g);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.f);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    @Deprecated
    public final boolean b(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    public final void a(short s, short s2, long j, int i, long j2) {
        int a2 = ((arri) this.d).a(s);
        if (a2 < 0) {
            int i2 = a2 ^ -1;
            this.b[i2] = s2;
            this.e[i2] = j;
            this.f[i2] = i;
            this.g[i2] = j2;
            return;
        }
        this.b[a2] = s2;
        this.e[a2] = j;
        this.f[a2] = i;
        this.g[a2] = j2;
    }

    @Deprecated
    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }

    public final boolean a(short s) {
        return ((arri) this.d).b(s);
    }
}
