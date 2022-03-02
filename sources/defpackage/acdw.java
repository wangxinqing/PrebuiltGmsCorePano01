package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: acdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdw {
    private final Context a;

    public acdw(Context context) {
        this.a = context;
    }

    public final boolean a() {
        return c() == 0;
    }

    public final boolean b() {
        return c() == 1;
    }

    public final int c() {
        boolean z;
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        if (telephonyManager == null || Build.VERSION.SDK_INT <= 22) {
            z = false;
        } else {
            z = telephonyManager.isVoiceCapable();
        }
        int i = this.a.getResources().getConfiguration().screenLayout & 15;
        if (!z && i >= 3) {
            return 1;
        }
        if (z && i < 3) {
            return 0;
        }
        return 2;
    }
}
