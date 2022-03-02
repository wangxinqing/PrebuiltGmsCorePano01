package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

/* renamed from: ahqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqz {
    protected arhd a;
    protected int[] b;
    public long[] c;
    public long[] d;
    public final ahqv e;

    public ahqz() {
        this.e = new ahqv();
    }

    public final int a() {
        return (this.b.length * 4) + ((this.c.length + this.d.length) * 8);
    }

    public final int b() {
        return this.a.size();
    }

    public final ahqy c() {
        return new ahqy(this);
    }

    public final aibe a(String str, long j) {
        aibe aibe = (aibe) ((argt) this.a).a((Object) str, false);
        if (aibe == null) {
            return null;
        }
        this.d[((argm) ((argt) this.a).d).a(str, true)] = j;
        ahqv ahqv = this.e;
        ahqv.a++;
        ahqv.b++;
        return aibe;
    }

    public final void b(ByteBuffer byteBuffer) {
        try {
            this.a.c(byteBuffer);
            int a2 = a();
            if (byteBuffer.position() + a2 + 12 <= byteBuffer.limit()) {
                byteBuffer.putInt(a2);
                byteBuffer.position(byteBuffer.position() + 8);
                IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
                asIntBuffer.put(this.b);
                byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
                LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
                asLongBuffer.put(this.c);
                asLongBuffer.put(this.d);
                byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
                arhh.a(byteBuffer, (byte) 1, a2);
                return;
            }
            throw new BufferOverflowException();
        } catch (IllegalArgumentException | BufferOverflowException e2) {
            throw new IOException(e2);
        }
    }

    public ahqz(byte[] bArr) {
        this();
        argt argt = new argt(new ahqx(this));
        argn argn = new argn(argt, new argj(new argm(argt.c)));
        ((argm) ((argj) argn.b).a).a = arhr.a;
        ((argt) argn.a).a = aibe.e;
        this.a = argn.a();
    }

    public final void a(ByteBuffer byteBuffer) {
        try {
            ahqz ahqz = new ahqz();
            arhr arhr = arhr.a;
            arhp arhp = aibe.e;
            ahqz.getClass();
            argt argt = new argt(new ahqx(ahqz));
            argt.a = arhp;
            argm argm = new argm(argt.c);
            argm.a = arhr;
            arhg.a(argm, byteBuffer);
            arhd.a(argt, argm, byteBuffer);
            ahqz.a = argt;
            if (arhh.a(byteBuffer, (byte) 1)) {
                IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
                asIntBuffer.get(ahqz.b);
                byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
                LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
                asLongBuffer.get(ahqz.c);
                asLongBuffer.get(ahqz.d);
                byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
                ahqy c2 = ahqz.c();
                while (c2.hasNext()) {
                    c2.b();
                    try {
                        int a2 = ((argt) this.a).a((Object) c2.d(), (Object) (aibe) c2.a.a());
                        if (a2 < 0) {
                            a2 ^= -1;
                        }
                        this.b[a2] = c2.a();
                        this.c[a2] = c2.b.c[c2.a.g()];
                        this.d[a2] = c2.b.d[c2.a.g()];
                    } catch (NullPointerException e2) {
                        throw new IOException(e2);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e3) {
            throw new IOException(e3);
        }
    }
}
