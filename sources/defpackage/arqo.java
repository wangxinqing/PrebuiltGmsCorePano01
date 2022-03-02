package defpackage;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;

/* renamed from: arqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arqo extends arhd {
    public long[] a;
    public long[] b;
    private arqm e;

    public arqo() {
        this.c = new arqn(this);
    }

    /* renamed from: a */
    public final arqm entrySet() {
        if (this.e == null) {
            this.e = new arqm(this);
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.a);
        asLongBuffer.put(this.b);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    /* access modifiers changed from: protected */
    public final byte c() {
        return 1;
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
        return (this.a.length * 8) + (this.b.length * 8);
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
        Integer num = (Integer) obj;
        Long l = (Long) obj2;
        throw new UnsupportedOperationException("Inherited put is not supported.");
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Inherited remove is not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object a(Object obj, boolean z) {
        throw new UnsupportedOperationException("Inherited get is not supported.");
    }

    @Deprecated
    public final boolean b(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.a);
        asLongBuffer.get(this.b);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    public final void a(short s, short s2, long j, long j2) {
        int a2 = ((arsc) this.d).a(s, s2);
        if (a2 < 0) {
            a2 ^= -1;
        }
        this.a[a2] = j;
        this.b[a2] = j2;
    }

    @Deprecated
    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }
}
