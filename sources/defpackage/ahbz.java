package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ahbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahbz implements agae {
    private final agzs a;
    private final Uri b;

    public ahbz(agzs agzs, Uri uri) {
        this.a = agzs;
        this.b = uri;
    }

    public final long a() {
        return this.a.e(this.b);
    }

    public final long a(InputStream inputStream, long j) {
        agzr agzr;
        long e = this.a.e(this.b);
        if (j <= e) {
            if (j > 0) {
                agzr = new ahcd();
            } else {
                agzr = ahcm.a();
            }
            OutputStream outputStream = (OutputStream) this.a.a(this.b, agzr, new agzk[0]);
            try {
                long a2 = anmr.a(inputStream, outputStream);
                if (outputStream != null) {
                    outputStream.close();
                }
                return j + a2;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", new Object[]{Long.valueOf(j), Long.valueOf(e)}));
        }
        throw th;
    }
}
