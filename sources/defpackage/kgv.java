package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgv extends kfa {
    private final SetPinnedDownloadPreferencesRequest f;

    public kgv(kec kec, SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, kwg kwg) {
        super("SetPinnedDownloadPreferencesOperation", kec, kwg, "378076965553");
        this.f = setPinnedDownloadPreferencesRequest;
    }

    public final Set a() {
        return EnumSet.allOf(jzl.class);
    }

    public final void c(Context context) {
        boolean z;
        lhx lhx = lsm.a().g;
        if (this.f.a.a() == 2) {
            z = true;
        } else {
            z = false;
        }
        lhy lhy = (lhy) lhx;
        boolean a = lhy.a();
        SharedPreferences d = lhy.d();
        if (!d.contains("drive_preferences.sync_over_wifi_only") || a != z) {
            d.edit().putBoolean("drive_preferences.sync_over_wifi_only", z).commit();
        }
        if (a != z) {
            for (lhd a2 : lhy.b) {
                a2.a(lhy.a(z));
            }
        }
        this.b.b();
    }
}
