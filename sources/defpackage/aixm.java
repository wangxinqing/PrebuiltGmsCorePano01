package defpackage;

import android.net.wifi.ScanResult;
import android.os.Build;

/* renamed from: aixm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aixm {
    public static aibs a(aixs aixs, long j, long j2) {
        String str;
        aixs aixs2 = aixs;
        String str2 = aixs2.c;
        if (str2 != null) {
            str = str2.intern();
        } else {
            str = "";
        }
        if (Build.VERSION.SDK_INT < 23 || !aixs2.f) {
            return new aibs(j, aixs2.h, str, (short) aixs2.g, j2);
        }
        ScanResult scanResult = aixs2.k;
        if (scanResult != null) {
            return new aixd(j, aixs2.h, str, (short) aixs2.g, j2, aixs2.e, aixs2.i, aixs2.j, scanResult);
        }
        return new aibp(j, aixs2.h, str, (short) aixs2.g, j2, aixs2.e, aixs2.i, aixs2.j);
    }

    public static boolean a(long j, aixs aixs) {
        String str = aixs.d;
        return (j == -1 || j == 281474976710655L || (str != null && str.contains("[IBSS]"))) ? false : true;
    }
}
