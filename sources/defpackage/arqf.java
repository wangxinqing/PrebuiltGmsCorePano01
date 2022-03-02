package defpackage;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: arqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arqf extends arhd {
    public int[] a;
    public byte[] b;
    public byte[] e;
    public short[] f;
    public short[] g;
    private arqd h;

    public arqf() {
        this.c = new arqe(this);
    }

    public final int a(long j, boolean z) {
        return ((arqj) this.d).b(j, z);
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
        byteBuffer.put(this.b);
        byteBuffer.put(this.e);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.f);
        asShortBuffer.put(this.g);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    /* access modifiers changed from: protected */
    public final byte c() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int length = this.b.length;
        int length2 = this.e.length;
        int length3 = this.a.length;
        int length4 = this.f.length;
        int length5 = this.g.length;
        return length + length2 + (length3 * 4) + length4 + length4 + length5 + length5;
    }

    @Deprecated
    /* renamed from: f */
    public final arhc values() {
        throw new UnsupportedOperationException("Inherited value collections are not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        throw new UnsupportedOperationException("Inherited puts are not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Inherited removes are not supported.");
    }

    /* renamed from: a */
    public final arqd entrySet() {
        if (this.h == null) {
            this.h = new arqd(this);
        }
        return this.h;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object a(Object obj, boolean z) {
        throw new UnsupportedOperationException("Inherited gets are not supported.");
    }

    public final void a(long j, short s, int i, byte b2, byte b3, short s2, short s3) {
        int b4 = ((arqj) this.d).b(j, s);
        if (b4 < 0) {
            b4 ^= -1;
        }
        this.a[b4] = i;
        this.b[b4] = b2;
        this.e[b4] = b3;
        this.f[b4] = s2;
        this.g[b4] = s3;
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
        byteBuffer.get(this.b);
        byteBuffer.get(this.e);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.f);
        asShortBuffer.get(this.g);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }
}
