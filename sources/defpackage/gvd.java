package defpackage;

import android.os.Build;
import android.os.Bundle;

/* renamed from: gvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class gvd {
    private static gvd a;

    public static synchronized gvd b() {
        gvd gvd;
        synchronized (gvd.class) {
            if (a == null) {
                a = new gvd();
            }
            gvd = a;
        }
        return gvd;
    }

    public Bundle a(Bundle bundle) {
        String str;
        iva.a((Object) bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("CheckinService_onStart_checkinReason", 8);
        bundle2.putString("checkin_source_package", bundle.getString("com.google.android.gms.checkin.CHECKIN_SOURCE_PACKAGE"));
        bundle2.putString("checkin_source_class", bundle.getString("com.google.android.gms.checkin.CHECKIN_SOURCE_CLASS"));
        int i = Build.VERSION.SDK_INT;
        if (bundle.containsKey("com.google.android.gms.checkin.EXTRA_NETWORK_REQUEST")) {
            bundle2.putParcelable("CheckinService_networkRequest", bundle.getParcelable("com.google.android.gms.checkin.EXTRA_NETWORK_REQUEST"));
        }
        boolean z = bundle.getBoolean("com.google.android.gms.checkin.EXTRA_CHECKIN_NOW", false);
        bundle2.putBoolean("CheckinService_onStart_ignoreMinTriggerInterval", z);
        bundle2.putBoolean("CheckinService_onStart_resetTransientErrorCount", z);
        bundle2.putBoolean("CheckinService_onStart_resetTriggerTime", z);
        bundle2.putBoolean("checkin_source_force", z);
        bundle2.putBoolean("CheckinService_forceCheckin", z);
        int i2 = bundle.getInt("com.google.android.gms.checkin.CHECKIN_LOG_UPLOAD_POLICY", 0);
        if (i2 == 0) {
            str = "UPLOAD_ALL";
        } else {
            str = i2 == 1 ? "UPLOAD_NONE" : null;
        }
        if (str != null) {
            bundle2.putString("CheckinService_logUploadPolicy", str);
        }
        return bundle2;
    }
}
