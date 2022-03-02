package defpackage;

import android.content.Context;
import android.os.SystemProperties;
import android.provider.Settings;

/* renamed from: gym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gym {
    public static final iwd a = gzk.a("ParamsBuilder");
    public static final String b = String.format("https://%s/checkin", new Object[]{SystemProperties.get("gms.checkin.sw_domain", "android.clients.google.com")});
    public final Context c;
    public final boolean d;

    public gym(Context context, boolean z) {
        this.c = context;
        this.d = z;
    }

    public final boolean a() {
        if (jkr.e()) {
            try {
                if (Settings.Global.getInt(this.c.getContentResolver(), "euicc_provisioned") == 1) {
                    return true;
                }
                return false;
            } catch (Settings.SettingNotFoundException e) {
            }
        }
        return false;
    }
}
