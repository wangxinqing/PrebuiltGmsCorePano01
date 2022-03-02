package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Set;

/* renamed from: arhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class arhg extends argu implements Set {
    protected arhl c;
    protected arhi d;

    public static void a(arhg arhg, ByteBuffer byteBuffer) {
        arhg.c = new arhm(arhg.d, byteBuffer).a();
        if (arhh.a(byteBuffer, arhg.b())) {
            arhg.a(byteBuffer);
            return;
        }
        throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
    }

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    public abstract boolean a(Object obj);

    /* access modifiers changed from: protected */
    public abstract byte b();

    /* access modifiers changed from: protected */
    public abstract void b(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract int c();

    public void c(ByteBuffer byteBuffer) {
        arhl arhl = this.c;
        if (byteBuffer != null) {
            int b = arhl.b();
            if (byteBuffer.position() + b <= byteBuffer.limit()) {
                int i = b - 12;
                byteBuffer.putInt(i);
                byteBuffer.position(byteBuffer.position() + 8);
                byteBuffer.putInt(arhl.a);
                byteBuffer.putInt(arhl.b);
                byteBuffer.putFloat(arhl.c);
                byteBuffer.putInt(arhl.d);
                byteBuffer.putInt(arhl.e);
                byteBuffer.putInt(arhl.f);
                byteBuffer.putInt(arhl.g);
                byteBuffer.putInt(arhl.h);
                byteBuffer.putInt(arhl.i);
                arhl.b(byteBuffer);
                arhh.a(byteBuffer, (byte) 1, i);
                int c2 = c() + 12;
                if (byteBuffer.position() + c2 <= byteBuffer.limit()) {
                    int i2 = c2 - 12;
                    byteBuffer.putInt(i2);
                    byteBuffer.position(byteBuffer.position() + 8);
                    b(byteBuffer);
                    arhh.a(byteBuffer, b(), i2);
                    return;
                }
                throw new BufferOverflowException();
            }
            throw new BufferOverflowException();
        }
        throw new NullPointerException("Byte buffer cannot be null.");
    }

    public final void clear() {
        this.c.a();
    }

    public boolean contains(Object obj) {
        return a(obj);
    }

    /* renamed from: d */
    public abstract arhf iterator();

    public /* bridge */ /* synthetic */ argv e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return super.equals(obj);
        }
        return false;
    }

    public final int g() {
        return this.c.a;
    }

    public final int h() {
        return c() + 12 + this.c.b();
    }

    public final int size() {
        return this.c.g;
    }
}
