package com.google.android.gms.westworld;

import android.app.PendingIntent;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ConfigActivationOperation extends IntentOperation {
    public static List a(StatsManager statsManager, PendingIntent pendingIntent) {
        try {
            long[] jArr = (long[]) statsManager.getClass().getDeclaredMethod("setActiveConfigsChangedOperation", new Class[]{PendingIntent.class}).invoke(statsManager, new Object[]{pendingIntent});
            if (pendingIntent != null) {
                if (jArr != null) {
                    return a(jArr);
                }
            }
            return amzy.h();
        } catch (NoSuchMethodException e) {
            return amzy.h();
        } catch (ClassCastException | IllegalAccessException | SecurityException | InvocationTargetException e2) {
            return amzy.h();
        } catch (Exception e3) {
            if (e3 instanceof StatsManager.StatsUnavailableException) {
                return amzy.h();
            }
            throw e3;
        }
    }

    public final void onHandleIntent(Intent intent) {
        long[] longArrayExtra;
        iby iby;
        aupy aupy;
        if (!aecm.a() && jkr.h() && intent.hasExtra("android.app.extra.STATS_ACTIVE_CONFIG_KEYS") && (longArrayExtra = intent.getLongArrayExtra("android.app.extra.STATS_ACTIVE_CONFIG_KEYS")) != null) {
            if (azvd.b()) {
                iby = adrz.a(ihs.b(), new adry());
                aupy = null;
            } else {
                aupy = aecq.a((Context) ihs.b());
                iby = null;
            }
            if (aecq.a(aupy, iby)) {
                List a = a(longArrayExtra);
                ihs b = ihs.b();
                Set<String> stringSet = aecq.d(b).getStringSet("SENT_CONFIGS", anfv.a);
                anav j = anax.j();
                for (String parseLong : stringSet) {
                    j.b(Long.valueOf(Long.parseLong(parseLong)));
                }
                aecg.a(b, j.a(), a, false, aupy, iby);
            }
        }
    }

    private static List a(long[] jArr) {
        amzt j = amzy.j();
        for (long valueOf : jArr) {
            j.c(Long.valueOf(valueOf));
        }
        return j.a();
    }
}
