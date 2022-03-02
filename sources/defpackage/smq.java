package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.mdm.receivers.RetryAfterAlarmChimeraReceiver;

/* renamed from: smq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smq {
    public static PendingIntent a(Context context) {
        return PendingIntent.getBroadcast(context, 0, aann.a(context, RetryAfterAlarmChimeraReceiver.class), 0);
    }

    public static void a(Context context, long j) {
        smo.i.a((Object) Long.valueOf(j));
        new jbs(context).a("RetryAfterAlarmReceiver", 1, j, a(context), "com.google.android.gms");
    }

    public static void a(Context context, jbs jbs) {
        jbs.a(a(context));
    }
}
