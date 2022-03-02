package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: baoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baoo extends InputStream implements azzc {
    public audx a;
    public final auef b;
    public ByteArrayInputStream c;

    public baoo(audx audx, auef auef) {
        this.a = audx;
        this.b = auef;
    }

    public final int available() {
        audx audx = this.a;
        if (audx != null) {
            return audx.p();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    public final int read() {
        audx audx = this.a;
        if (audx != null) {
            this.c = new ByteArrayInputStream(audx.k());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        audx audx = this.a;
        if (audx != null) {
            int p = audx.p();
            if (p == 0) {
                this.a = null;
                this.c = null;
                return -1;
            } else if (i2 < p) {
                this.c = new ByteArrayInputStream(this.a.k());
                this.a = null;
            } else {
                aubk c2 = aubk.c(bArr, i, p);
                this.a.a(c2);
                c2.d();
                this.a = null;
                this.c = null;
                return p;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
