package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: glm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class glm {
    public static final iwd a = ehv.a("CarrierSetupHelper");
    public final TelephonyManager b;
    public final qub c;

    public glm(Context context) {
        this.b = (TelephonyManager) context.getSystemService("phone");
        this.c = qub.a(context);
    }
}
