package defpackage;

import android.net.wifi.ScanResult;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: akuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akuw {
    public static final long a = TimeUnit.SECONDS.toMillis(60);
    public final akux b = new akux();

    public akuw() {
        int i = Build.VERSION.SDK_INT;
    }

    public static long a(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int digit = Character.digit(charAt, 16);
            if (digit != -1) {
                j = (j * 16) + ((long) digit);
            } else if (!(charAt == ':' || charAt == '-')) {
                return -1;
            }
        }
        return j;
    }

    public static akog a(ScanResult scanResult, long j, long j2) {
        return new akog(j, scanResult.level, scanResult.SSID != null ? scanResult.SSID.intern() : null, (short) scanResult.frequency, j2);
    }

    public static boolean a(long j, ScanResult scanResult) {
        return (j == -1 || j == 281474976710655L || (scanResult.capabilities != null && scanResult.capabilities.contains("[IBSS]"))) ? false : true;
    }
}
