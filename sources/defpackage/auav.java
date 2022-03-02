package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: auav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class auav extends auau {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public auav(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw null;
    }

    public byte a(int i) {
        return this.a[i];
    }

    public int a() {
        return this.a.length;
    }

    public byte b(int i) {
        return this.a[i];
    }

    /* access modifiers changed from: protected */
    public int b() {
        return 0;
    }

    public final ByteBuffer e() {
        return ByteBuffer.wrap(this.a, b(), a()).asReadOnlyBuffer();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof auay) || a() != ((auay) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof auav)) {
            return obj.equals(this);
        }
        auav auav = (auav) obj;
        int i = this.c;
        int i2 = auav.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return a((auay) auav, 0, a());
        }
        return false;
    }

    public final boolean f() {
        int b = b();
        return aufv.a(this.a, b, a() + b);
    }

    public final InputStream g() {
        return new ByteArrayInputStream(this.a, b(), a());
    }

    public final aubc h() {
        return aubc.a(this.a, b(), a());
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        int b = b() + i2;
        return aufv.a.a(i, this.a, b, i3 + b);
    }

    /* access modifiers changed from: protected */
    public final int b(int i, int i2, int i3) {
        return aucy.a(i, this.a, b() + i2, i3);
    }

    public final auay a(int i, int i2) {
        int c = c(i, i2, a());
        return c != 0 ? new auaq(this.a, b() + i, c) : auay.b;
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.a, b(), a(), charset);
    }

    public final void a(auam auam) {
        auam.a(this.a, b(), a());
    }

    public final void a(OutputStream outputStream) {
        outputStream.write(k());
    }

    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a, b(), a());
    }

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    public final boolean a(auay auay, int i, int i2) {
        if (i2 <= auay.a()) {
            int i3 = i + i2;
            if (i3 > auay.a()) {
                int a2 = auay.a();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(a2);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(auay instanceof auav)) {
                return auay.a(i, i3).equals(a(0, i2));
            } else {
                auav auav = (auav) auay;
                byte[] bArr = this.a;
                byte[] bArr2 = auav.a;
                int b = b() + i2;
                int b2 = b();
                int b3 = auav.b() + i;
                while (b2 < b) {
                    if (bArr[b2] != bArr2[b3]) {
                        return false;
                    }
                    b2++;
                    b3++;
                }
                return true;
            }
        } else {
            int a3 = a();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(a3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
