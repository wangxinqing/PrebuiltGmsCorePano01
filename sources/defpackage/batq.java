package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* renamed from: batq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batq {
    static final Logger a = Logger.getLogger(batq.class.getName());

    private batq() {
    }

    public static bate a(batz batz) {
        return new batt(batz);
    }

    public static batz b(File file) {
        if (file != null) {
            return a((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    private static bata c(Socket socket) {
        return new batp(socket);
    }

    public static batf a(baua baua) {
        return new batv(baua);
    }

    public static baua b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            bata c = c(socket);
            return new basy(c, a(socket.getInputStream(), (bauc) c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    public static batz c(File file) {
        if (file != null) {
            return a((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static batz a(OutputStream outputStream) {
        return a(outputStream, new bauc());
    }

    private static batz a(OutputStream outputStream, bauc bauc) {
        if (outputStream != null) {
            return new batn(bauc, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static batz a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            bata c = c(socket);
            return new basx(c, a(socket.getOutputStream(), (bauc) c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static baua a(File file) {
        if (file != null) {
            return a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static baua a(InputStream inputStream) {
        return a(inputStream, new bauc());
    }

    private static baua a(InputStream inputStream, bauc bauc) {
        if (inputStream != null) {
            return new bato(bauc, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
