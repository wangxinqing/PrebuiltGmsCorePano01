package defpackage;

import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: awbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awbo implements awca {
    public static final Logger a = Logger.getLogger(awbl.class.getName());
    public static final batg b = batg.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static IOException b(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    public static int a(batf batf) {
        return (batf.e() & 255) | ((batf.e() & 255) << 16) | ((batf.e() & 255) << 8);
    }

    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public final awam a(batf batf, boolean z) {
        return new awbm(batf, z);
    }

    public final awan a(bate bate, boolean z) {
        return new awbn(bate, z);
    }
}
