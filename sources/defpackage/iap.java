package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.analytics.CoreAnalyticsIntentOperation;

/* renamed from: iap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iap {
    private static volatile iap a = null;

    private iap() {
    }

    public static void a() {
        if (a == null) {
            a = new iap();
        }
    }

    public static final void a(Context context, int i, int i2, long j) {
        Intent putExtra = new Intent("com.google.android.gms.common.operation.LOG_CORE_ANALYTICS").setPackage(context.getPackageName()).putExtra("type", "system_health").putExtra("event_code", i - 1);
        if (i2 >= 0) {
            putExtra.putExtra("post_install_checkin_stage", i2);
        }
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, CoreAnalyticsIntentOperation.class, putExtra, i, 134217728);
        amtf.a((Object) pendingIntent);
        jbs jbs = new jbs(context);
        jbs.a(pendingIntent);
        jbs.a("CoreAnalyticsIntents", 3, SystemClock.elapsedRealtime() + j, pendingIntent, "com.google.android.gms");
    }

    public static final void a(Context context, int i, long j) {
        a(context, i, -1, j);
    }
}
