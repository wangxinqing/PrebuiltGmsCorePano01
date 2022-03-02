package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: jdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jdi implements jje {
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Context context = (Context) obj;
        SharedPreferences sharedPreferences = context.getSharedPreferences("NetworkUsageUploadStats", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long j = sharedPreferences.getLong("timeLastUpdate", 0);
        long timeInMillis = jii.a().getTimeInMillis();
        if (j >= timeInMillis) {
            return null;
        }
        long j2 = -86400000 + timeInMillis;
        edit.putLong("timeLastUpdate", timeInMillis);
        if (edit.commit()) {
            return jec.a(context.getContentResolver(), j2, timeInMillis - 1);
        }
        return null;
    }
}
