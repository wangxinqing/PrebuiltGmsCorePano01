package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: jdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jdh implements jje {
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Context context = (Context) obj;
        SharedPreferences sharedPreferences = context.getSharedPreferences("NetworkUsageUploadStats", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long j = sharedPreferences.getLong("timeLastUpdate", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = context.getSharedPreferences("NetworkReportServicePrefs", 0).getLong("lastDailyReportTaskEndTimestamp", jed.c(currentTimeMillis).longValue());
        long longValue = j2 - ((Long) jcd.e.c()).longValue();
        if (j >= currentTimeMillis) {
            return null;
        }
        edit.putLong("timeLastUpdate", currentTimeMillis);
        if (edit.commit()) {
            return jec.a(context.getContentResolver(), longValue, j2);
        }
        Log.e("StatsUploader", "statsuploader editor.commit failed");
        return null;
    }
}
