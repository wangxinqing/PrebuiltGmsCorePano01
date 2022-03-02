package defpackage;

import java.util.Locale;

/* renamed from: ulc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ulc {
    public static String a(int i) {
        return String.format(Locale.ENGLISH, "[%d]%s", new Object[]{Integer.valueOf(i), i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "ADVERTISE_FAILED_FEATURE_UNSUPPORTED" : "ADVERTISE_FAILED_INTERNAL_ERROR" : "ADVERTISE_FAILED_ALREADY_STARTED" : "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS" : "ADVERTISE_FAILED_DATA_TOO_LARGE"});
    }
}
