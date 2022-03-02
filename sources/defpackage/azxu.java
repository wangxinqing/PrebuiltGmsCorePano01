package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: azxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azxu implements azxw {
    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    public final String a() {
        return "gzip";
    }

    public final OutputStream a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }
}
