package defpackage;

import android.content.SharedPreferences;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: wrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wrm implements Runnable {
    private final wrg a;
    private final SharedPreferences b;
    private final wqz c;

    public wrm(SharedPreferences sharedPreferences, wrg wrg, wrl wrl) {
        this.a = wrg;
        this.b = sharedPreferences;
        this.c = wrl;
    }

    public final void run() {
        try {
            wqz wqz = this.c;
            wrg wrg = this.a;
            avdk avdk = (avdk) avdq.A.o();
            if (avdk.c) {
                avdk.c();
                avdk.c = false;
            }
            avdq avdq = (avdq) avdk.b;
            avdq.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            avdq.l = true;
            if (wqz.a(((avdq) avdk.i()).k(), wrg.a, ((wrl) wqz).f)) {
                this.b.edit().putLong("contacts-logger-full-upload-timestamp", 0).apply();
            }
        } catch (Exception e) {
            wml.a().a("DeviceLoggerTask.logData_failure");
        }
    }
}
