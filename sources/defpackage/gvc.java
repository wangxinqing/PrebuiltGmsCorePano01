package defpackage;

import android.os.Bundle;

/* renamed from: gvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gvc extends gvd {
    private static gvc a;

    public static synchronized gvc a() {
        gvc gvc;
        synchronized (gvc.class) {
            if (a == null) {
                a = new gvc();
            }
            gvc = a;
        }
        return gvc;
    }

    private gvc() {
    }

    public final Bundle a(Bundle bundle) {
        Bundle a2 = super.a(bundle);
        a2.putBoolean("CheckinService_onStart_ignoreNetworkState", bundle.getBoolean("com.google.android.gms.checkin.IGNORE_NETWORK_STATE", false));
        a2.putBoolean("CheckinService_fetchSystemUpdates", bundle.getBoolean("com.google.android.gms.checkin.FETCH_SYSTEM_UPDATES", false));
        a2.putInt("CheckinService_onStart_checkinReason", bundle.getInt("com.google.android.gms.checkin.CHECKIN_REASON_TYPE", 8));
        return a2;
    }
}
