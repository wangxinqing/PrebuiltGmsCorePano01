package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: lhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lhy implements lhx {
    public static final ith a = new ith("PreferencesImpl", "");
    public final Set b = new HashSet();
    private final Context c;

    public static jzy a(boolean z) {
        int i;
        if (!z) {
            i = 1;
        } else {
            i = 2;
        }
        kaa kaa = new kaa();
        kaa.b = i;
        kaa.c = false;
        kaa.d = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        return kaa.a();
    }

    public static String b(String str) {
        return String.format("ActivityLevel.%s", new Object[]{str});
    }

    private static String c(String str) {
        return String.format("drive_preferences.folder_color_palette.%s", new Object[]{str});
    }

    public final SharedPreferences d() {
        return this.c.getSharedPreferences("drive.shared_prefs", 4);
    }

    public lhy(Context context) {
        this.c = context;
    }

    @Deprecated
    public final SharedPreferences c() {
        return PreferenceManager.getDefaultSharedPreferences(this.c);
    }

    public final List a(String str) {
        String string = d().getString(c(str), (String) null);
        if (string == null) {
            return new ArrayList();
        }
        return Arrays.asList(string.split(","));
    }

    public final long b() {
        long currentTimeMillis = System.currentTimeMillis();
        a(currentTimeMillis);
        return currentTimeMillis;
    }

    public final void a(long j) {
        d().edit().putLong("databaseInstanceId", j).commit();
    }

    public final void a(String str, List list) {
        d().edit().putString(c(str), TextUtils.join(",", list)).commit();
    }

    public final boolean a() {
        SharedPreferences d = d();
        if (!d.contains("drive_preferences.sync_over_wifi_only")) {
            SharedPreferences c2 = c();
            if (c2.contains("drive_preferences.sync_over_wifi_only")) {
                d.edit().putBoolean("drive_preferences.sync_over_wifi_only", c2.getBoolean("drive_preferences.sync_over_wifi_only", true)).commit();
            }
        }
        return d.getBoolean("drive_preferences.sync_over_wifi_only", true);
    }
}
