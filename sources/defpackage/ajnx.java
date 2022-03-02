package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* renamed from: ajnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnx {
    public static final String[] a = {"disabled", "sensorOnly", "batterySaving", "highAccuracy"};

    public static Boolean a() {
        return Boolean.valueOf(jjy.b());
    }

    public static int b(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "low_power_trigger_level", 0);
    }

    public static Boolean a(ContentResolver contentResolver) {
        boolean z = false;
        if (Settings.Global.getInt(contentResolver, "low_power", 0) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean a(Context context) {
        return Boolean.valueOf(jjy.b(context));
    }
}
