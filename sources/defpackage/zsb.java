package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: zsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsb {
    private static zsb b;
    public final TelephonyManager a;

    private zsb(Context context) {
        this.a = (TelephonyManager) context.getSystemService("phone");
    }

    public static synchronized zsb a(Context context) {
        zsb zsb;
        synchronized (zsb.class) {
            if (b == null) {
                b = new zsb(context.getApplicationContext());
            }
            zsb = b;
        }
        return zsb;
    }
}
