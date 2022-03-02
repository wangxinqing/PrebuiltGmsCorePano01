package defpackage;

import org.webrtc.Logging;

/* renamed from: baxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxt {
    public static final boolean a(String str) {
        Logging.a(baxu.a, str.length() == 0 ? new String("Loading library: ") : "Loading library: ".concat(str));
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            Logging.a(baxu.a, str.length() == 0 ? new String("Failed to load native library: ") : "Failed to load native library: ".concat(str), (Throwable) e);
            return false;
        }
    }
}
