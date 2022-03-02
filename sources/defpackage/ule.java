package defpackage;

import java.util.Locale;

/* renamed from: ule  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ule {
    static String a(int i) {
        return String.format(Locale.ENGLISH, "[%d]%s", new Object[]{Integer.valueOf(i), i != 0 ? i != 3 ? i != 4 ? "UNKNOWN" : "FAILURE_MAX_LIMIT" : "FAILURE_ALREADY_ACTIVE" : "FAILURE_INTERNAL_ERROR"});
    }
}
