package defpackage;

import android.content.SharedPreferences;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: gaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gaa implements fzu {
    public static final iwd a = new iwd("Auth", "PhenotypeConfigSyncer");
    private static final String c = ihs.b().getPackageName();
    public final yey b;
    private final goj d;
    private final fzx e;

    private static SharedPreferences a() {
        return ihs.b().getSharedPreferences("AuthConfigSyncSharedPrefs", 0);
    }

    public gaa(yey yey, goj goj, fzx fzx) {
        this.b = yey;
        this.d = goj;
        this.e = fzx;
    }

    private final void a(int i, long j, String str) {
        goj goj = this.d;
        aucd o = anon.v.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anon anon = (anon) o.b;
        anon.c = 47;
        anon.a |= 1;
        int i2 = (int) j;
        aucd o2 = anot.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anot anot = (anot) o2.b;
        str.getClass();
        int i3 = anot.a | 1;
        anot.a = i3;
        anot.b = str;
        int i4 = i3 | 2;
        anot.a = i4;
        anot.c = i2;
        anot.d = i - 1;
        anot.a = i4 | 4;
        anot anot2 = (anot) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anon anon2 = (anon) o.b;
        anot2.getClass();
        anon2.t = anot2;
        anon2.b |= FragmentTransaction.TRANSIT_EXIT_MASK;
        goj.a((anon) o.i());
    }

    public final void a(String str) {
        a.a("Called doInitialConfigSync().", new Object[0]);
        String str2 = str != null ? str : c;
        if (a().getBoolean("AUTH_CONFIG_SYNC_FINISHED", false)) {
            a.b("Already synced configs, returning early", new Object[0]);
            a(3, 0, str2);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.e.a.getCurrentModule().moduleVersion;
        int i2 = i;
        int i3 = 7;
        try {
            acws.a(this.b.a(new RegistrationInfo[]{new RegistrationInfo("com.google.android.gms.auth_account", i2, new String[]{"ANDROID_AUTH"}, (byte[]) null, true, (int[]) null, c), new RegistrationInfo("com.google.android.gms.auth_cryptauth", i2, new String[]{"ANDROID_AUTH"}, (byte[]) null, true, (int[]) null, c), new RegistrationInfo("com.google.android.gms.auth_folsom", i2, new String[]{"ANDROID_AUTH"}, (byte[]) null, true, (int[]) null, c), new RegistrationInfo("com.google.android.gms.auth_managed", i2, new String[0], (byte[]) null, true, (int[]) null, c), new RegistrationInfo("com.google.android.gms.droidguard", i2, new String[]{"DROIDGUARD"}, (byte[]) null, true, (int[]) null, c), new RegistrationInfo("com.google.android.gms.fido", i2, new String[]{"FIDO"}, (byte[]) null, true, (int[]) null, c), new RegistrationInfo("com.google.android.gms.setupservices", i2, new String[]{"ANDROID_AUTH"}, (byte[]) null, true, (int[]) null, c), new RegistrationInfo("com.google.android.gms.smartdevice", i2, new String[]{"SMART_DEVICE", "ANDROID_AUTH"}, (byte[]) null, true, (int[]) null, c)}).a((Executor) aoqm.a, (acvz) new fzy(this, i)), 5000, TimeUnit.MILLISECONDS);
            a.c("Successfully synced sidecar_aps configs", new Object[0]);
            a().edit().putBoolean("AUTH_CONFIG_SYNC_FINISHED", true).commit();
            a(2, System.currentTimeMillis() - currentTimeMillis, str2);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            a.e("Encountered exception trying to sync sidecar_aps Phenotype configs", e2, new Object[0]);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (e2 instanceof ExecutionException) {
                i3 = 5;
            } else if (e2 instanceof InterruptedException) {
                i3 = 6;
            } else if (e2 instanceof TimeoutException) {
                i3 = 4;
            }
            a(i3, currentTimeMillis2, str2);
            throw new fzs(e2);
        }
    }
}
