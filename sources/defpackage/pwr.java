package defpackage;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: pwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwr {
    public static final /* synthetic */ int a = 0;
    private static final pao b = new pao("com.google.android.gms", "apps");
    private static final long c = TimeUnit.DAYS.toMillis(3);

    public static pws a(Context context, ozq ozq, oyq oyq) {
        if (!jkr.b() || !((Boolean) pba.aw.c()).booleanValue()) {
            oso.a("Apps Usage Signals is not enabled. API level: %d isAtLeastM: %b", (Object) Integer.valueOf(Build.VERSION.SDK_INT), (Object) Boolean.valueOf(jkr.b()));
            return pxi.b();
        }
        osz d = ozq.d(b);
        if (d == null) {
            oso.b("Can't get CorpusConfig for Apps Corpus.");
            return pxi.b();
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = context.getSharedPreferences("usage_stats_manager_prefs", 0);
        long j = sharedPreferences.getLong("usage_stats_timestamp", 0);
        sharedPreferences.edit().putLong("usage_stats_timestamp", currentTimeMillis).commit();
        try {
            return new pwq(context.getPackageManager(), d, ((UsageStatsManager) context.getSystemService("usagestats")).queryEvents(Math.max(j, currentTimeMillis - c), currentTimeMillis), plw.b(context.getPackageManager()), oyq);
        } catch (RuntimeException e) {
            oso.b("b/62250956. Bad implementation of UsageStatsManager.queryEvents on LeEco devices");
            return pxi.b();
        }
    }
}
