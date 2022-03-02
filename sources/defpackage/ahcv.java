package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.FragmentTransaction;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.util.Arrays;

/* renamed from: ahcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahcv extends DigestInputStream implements ahbl {
    final byte[] a = new byte[FragmentTransaction.TRANSIT_ENTER_MASK];
    byte[] b;
    byte[] c;
    final ahbc d;
    ahao e;

    private final void a() {
        if (this.c == null) {
            this.c = this.digest.digest();
            ahao ahao = this.e;
            if (ahao != null) {
                ahbb a2 = this.d.a();
                a2.a("sha256", Base64.encodeToString(this.c, 2));
                ahao.a(a2.a());
            }
            byte[] bArr = this.b;
            if (bArr != null && !Arrays.equals(this.c, bArr)) {
                String encodeToString = Base64.encodeToString(this.c, 2);
                String encodeToString2 = Base64.encodeToString(this.b, 2);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 30 + String.valueOf(encodeToString2).length());
                sb.append("Mismatched digest: ");
                sb.append(encodeToString);
                sb.append(" expected: ");
                sb.append(encodeToString2);
                throw new IOException(sb.toString());
            }
        }
    }

    public final void a(ahao ahao) {
        this.e = ahao;
    }

    public final void close() {
        super.close();
        a();
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            return read;
        }
        a();
        return -1;
    }

    public final long skip(long j) {
        return (long) read(this.a, 0, Math.min(this.a.length, aoog.a(j)));
    }

    public ahcv(InputStream inputStream, ahbc ahbc) {
        super(inputStream, ahcw.d());
        this.d = ahbc;
        String a2 = ahbc.a("sha256");
        if (!TextUtils.isEmpty(a2)) {
            this.b = Base64.decode(a2, 2);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        a();
        return -1;
    }
}
