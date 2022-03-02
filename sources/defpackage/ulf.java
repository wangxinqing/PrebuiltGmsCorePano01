package defpackage;

import java.util.Locale;

/* renamed from: ulf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ulf {
    static String a(int i) {
        return String.format(Locale.ENGLISH, "[%d]%s", new Object[]{Integer.valueOf(i), i != 0 ? i != 1 ? i != 2 ? i != 3 ? "WIFI_STATE_UNKNOWN" : "WIFI_STATE_ENABLED" : "WIFI_STATE_ENABLING" : "WIFI_STATE_DISABLED" : "WIFI_STATE_DISABLING"});
    }
}
