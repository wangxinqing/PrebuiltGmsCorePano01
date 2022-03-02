package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.regex.Pattern;

/* renamed from: arqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arqv extends arhd {
    private static final Pattern h = Pattern.compile("-?[a-zA-Z0-9]+");
    public byte[] a;
    public short[] b;
    public short[] e;
    public long[] f;
    public long[] g;
    private final boolean i;
    private arqt j;

    public arqv(boolean z) {
        this.c = new arqu(this);
        this.i = z;
    }

    /* renamed from: a */
    public final arqt entrySet() {
        if (this.j == null) {
            this.j = new arqt(this);
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.e);
        asShortBuffer.put(this.b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.f);
        asLongBuffer.put(this.g);
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
        int length = this.a.length;
        int length2 = this.e.length;
        int length3 = this.b.length;
        return length + length2 + length2 + length3 + length3 + (this.f.length * 8) + (this.g.length * 8);
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

    public final String a(int i2) {
        try {
            return new String(this.a, i2 * 3, 3, "US-ASCII").trim();
        } catch (UnsupportedEncodingException e2) {
            if (!this.i) {
                return "";
            }
            throw new IllegalArgumentException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.get(this.a);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.e);
        asShortBuffer.get(this.b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.f);
        asLongBuffer.get(this.g);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    @Deprecated
    public final boolean b(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    public final void a(short s, short s2, String str, short s3, short s4, long j2, long j3) {
        int a2 = ((arsc) this.d).a(s, s2);
        if (a2 < 0) {
            a2 ^= -1;
        }
        if (str == null || !h.matcher(str).matches()) {
            str = "";
        }
        byte[] bArr = new byte[0];
        try {
            bArr = str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            if (this.i) {
                throw new IllegalArgumentException(e2);
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 < bArr.length) {
                this.a[(a2 * 3) + i2] = bArr[i2];
            } else {
                this.a[(a2 * 3) + i2] = 0;
            }
        }
        this.b[a2] = s3;
        this.e[a2] = s4;
        this.f[a2] = j2;
        this.g[a2] = j3;
    }

    @Deprecated
    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }
}
