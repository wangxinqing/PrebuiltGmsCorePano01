package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: anmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmt {
    static final Logger a = Logger.getLogger(anmt.class.getName());

    private anmt() {
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
            }
        }
    }

    public static void a(InputStream inputStream) {
        try {
            a((Closeable) inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
