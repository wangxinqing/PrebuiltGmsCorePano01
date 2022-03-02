package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: ahct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahct implements ahcs {
    public final InputStream a(Uri uri, InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }

    public final OutputStream a(OutputStream outputStream) {
        return ahcr.a(this, outputStream);
    }

    public final String a() {
        return "compress";
    }

    public final void b() {
    }

    public final void c() {
    }

    public final OutputStream a(Uri uri, OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }
}
