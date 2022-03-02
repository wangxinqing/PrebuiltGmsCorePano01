package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: ahcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcw implements ahcs {
    public static MessageDigest d() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final InputStream a(Uri uri, InputStream inputStream) {
        return new ahcv(inputStream, ahbe.a(uri, "integrity"));
    }

    public final OutputStream a(OutputStream outputStream) {
        return ahcr.a(this, outputStream);
    }

    public final String a() {
        return "integrity";
    }

    public final void b() {
    }

    public final void c() {
    }

    public final OutputStream a(Uri uri, OutputStream outputStream) {
        return new ahcu(outputStream, ahbe.a(uri, "integrity"));
    }
}
