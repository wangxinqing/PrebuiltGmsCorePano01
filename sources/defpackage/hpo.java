package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import java.util.concurrent.TimeUnit;

/* renamed from: hpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hpo {
    private static final long a = TimeUnit.MILLISECONDS.convert(3, TimeUnit.DAYS);

    public static CollectForDebugParcelable a(Context context, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("collectForDebug", 0);
        long min = Math.min(awtm.a.a().a(), a);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis + min;
        long j2 = sharedPreferences.getLong("collectForDebugStartTime", 0);
        long j3 = sharedPreferences.getLong("collectForDebug", 0);
        if (j2 == 0 || currentTimeMillis > j3) {
            j2 = currentTimeMillis;
        }
        sharedPreferences.edit().putLong("collectForDebugStartTime", j2).putLong("collectForDebug", j).putBoolean("collectForDebugSkipPersistentStorage", z).apply();
        return new CollectForDebugParcelable(z, j2, j);
    }

    public static CollectForDebugParcelable b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("collectForDebug", 0);
        return new CollectForDebugParcelable(sharedPreferences.getBoolean("collectForDebugSkipPersistentStorage", false), sharedPreferences.getLong("collectForDebugStartTime", 0), sharedPreferences.getLong("collectForDebug", 0));
    }

    public static void a(Context context) {
        context.getSharedPreferences("collectForDebug", 0).edit().putLong("collectForDebugStartTime", 0).putLong("collectForDebug", 0).apply();
    }

    public static boolean a(Context context, jiq jiq) {
        return context.getSharedPreferences("collectForDebug", 0).getLong("collectForDebug", 0) - jiq.a() > 0;
    }
}
