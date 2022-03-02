package defpackage;

import java.nio.ByteBuffer;

/* renamed from: arhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arhm {
    private arhi a;
    private int b;
    private int c = 16;
    private float d = 0.75f;
    private ByteBuffer e;
    private arhl f;
    private boolean g = false;

    public arhm(arhi arhi, int i) {
        a(arhi, i);
    }

    private final void a(arhi arhi, int i) {
        if (arhi == null) {
            throw new NullPointerException("The element listener cannot be null.");
        } else if (i <= 0 || ((float) i) >= this.d * 2.14748365E9f) {
            float f2 = this.d;
            StringBuilder sb = new StringBuilder(85);
            sb.append("The max size ");
            sb.append(i);
            sb.append(" must be between one (inclusive) and ");
            sb.append((int) (f2 * 2.14748365E9f));
            sb.append(" (exclusive).");
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.a = arhi;
            this.b = i;
        }
    }

    public arhm(arhi arhi, ByteBuffer byteBuffer) {
        if (arhh.a(byteBuffer, (byte) 1)) {
            a(arhi, byteBuffer.getInt());
            int i = byteBuffer.getInt();
            if (this.f != null) {
                throw new IllegalStateException("Cannot set initial capacity when building from byte buffer.");
            } else if (i <= 0 || ((float) i) >= 1.61061274E9f) {
                StringBuilder sb = new StringBuilder(92);
                sb.append("The initial capacity ");
                sb.append(i);
                sb.append(" must be between one (inclusive) and 1610612736 (exclusive).");
                throw new IllegalArgumentException(sb.toString());
            } else {
                this.c = i;
                float f2 = byteBuffer.getFloat();
                if (this.f != null) {
                    throw new IllegalStateException("Cannot set load factor when building from byte buffer.");
                } else if (f2 <= 0.0f || f2 > 1.0f) {
                    StringBuilder sb2 = new StringBuilder(85);
                    sb2.append("The load factor ");
                    sb2.append(f2);
                    sb2.append(" must be between zero (exclusive) and one (inclusive).");
                    throw new IllegalArgumentException(sb2.toString());
                } else {
                    this.d = f2;
                    this.e = byteBuffer;
                    this.f = a();
                }
            }
        } else {
            throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
        }
    }

    public final arhl a() {
        arhl arhl = this.f;
        if (arhl != null) {
            this.f = null;
            return arhl;
        } else if (!this.g) {
            this.g = true;
            int i = this.b;
            float f2 = this.d;
            int i2 = (int) (((float) i) / f2);
            if (i2 < 127) {
                return new arhk(this.a, i, this.c, f2, this.e);
            }
            if (i2 >= 32767) {
                return new arhn(this.a, i, this.c, f2, this.e);
            }
            return new arho(this.a, i, this.c, f2, this.e);
        } else {
            throw new IllegalStateException("You can only build once.");
        }
    }
}
