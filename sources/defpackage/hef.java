package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.Set;

/* renamed from: hef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hef {
    public final SharedPreferences a;
    private final boolean b;

    public hef(SharedPreferences sharedPreferences, boolean z) {
        this.a = sharedPreferences;
        this.b = z;
    }

    public static hef a(Context context) {
        return new hef(aekv.d(context.getApplicationContext()).getSharedPreferences("ChimeraConfigService", 0), false);
    }

    public final Set b() {
        Set<String> stringSet = this.a.getStringSet("Chimera.userModuleSetBlacklist", (Set) null);
        return stringSet == null ? Collections.emptySet() : Collections.unmodifiableSet(stringSet);
    }

    public final hhl c() {
        try {
            byte[] a2 = jhy.a(this.a.getString("Chimera.moduleSetJournal", ""));
            if (a2 != null) {
                return (hhl) aucj.a((aucj) hhl.b, a2, aubs.b());
            }
            throw new auda("Module set journal bytes are invalid!");
        } catch (auda | IllegalArgumentException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Could not parse module set journal: ");
            sb.append(valueOf);
            Log.e("ChimeraPrefs", sb.toString());
            return hhl.b;
        }
    }

    public final long d() {
        return this.a.getLong("Chimera.lastHeterodyneChangeTime", 0);
    }

    public final long e() {
        return this.a.getLong("Chimera.lastHeterodyneServingVersion", -1);
    }

    public final boolean f() {
        if (!this.b) {
            return true;
        }
        Log.e("ChimeraPrefs", "Cannot write to shared prefs in read-only mode");
        return false;
    }

    public final int a() {
        return this.a.getInt("ChimeraConfigService.retryCount", 0);
    }

    public final void a(long j) {
        if (f()) {
            this.a.edit().putLong("Chimera.downloadFrom", j).commit();
        }
    }

    public final void b(int i) {
        if (f()) {
            this.a.edit().putInt("ChimeraConfigService.scheduledPeriodSec", i).commit();
        }
    }

    public final boolean a(int i) {
        if (f()) {
            return this.a.edit().putInt("ChimeraConfigService.retryCount", i).commit();
        }
        return false;
    }

    public final void b(long j) {
        if (f()) {
            this.a.edit().putLong("Chimera.lastUpdateTime", j).commit();
        }
    }
}
