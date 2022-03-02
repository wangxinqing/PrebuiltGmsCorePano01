package defpackage;

import java.util.Locale;

/* renamed from: ulg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ulg {
    static String a(int i) {
        return String.format(Locale.ENGLISH, "[%d]%s", new Object[]{Integer.valueOf(i), i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "BUSY" : "P2P_UNSUPPORTED" : "ERROR"});
    }
}
