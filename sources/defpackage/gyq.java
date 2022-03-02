package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: gyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyq {
    public static final iwd a = gzk.a("SimHelper");
    public final Context b;
    public final TelephonyManager c;

    public gyq(Context context) {
        this.b = context;
        this.c = (TelephonyManager) context.getSystemService("phone");
    }

    public final String a() {
        String simSerialNumber = this.c.getSimSerialNumber();
        String str = "no-sim\nno-imsi";
        if (simSerialNumber != null) {
            str = str.replace("no-sim", simSerialNumber);
        }
        String subscriberId = this.c.getSubscriberId();
        return subscriberId != null ? str.replace("no-imsi", subscriberId) : str;
    }
}
