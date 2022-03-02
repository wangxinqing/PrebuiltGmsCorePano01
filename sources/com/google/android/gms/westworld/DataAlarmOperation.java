package com.google.android.gms.westworld;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DataAlarmOperation extends IntentOperation {
    public static long a(bbx bbx) {
        bbx bbx2 = bbx.UNKNOWN_PERIOD;
        int ordinal = bbx.ordinal();
        if (ordinal == 0) {
            return azwc.b();
        }
        if (ordinal == 1) {
            return TimeUnit.HOURS.toMillis(24);
        }
        if (ordinal == 2) {
            return TimeUnit.HOURS.toMillis(4);
        }
        if (ordinal == 3) {
            return TimeUnit.HOURS.toMillis(1);
        }
        if (ordinal == 4) {
            return TimeUnit.MINUTES.toMillis(30);
        }
        if (ordinal != 5) {
            return azwc.b();
        }
        return TimeUnit.MINUTES.toMillis(10);
    }

    public final void onHandleIntent(Intent intent) {
        iby iby;
        if (!aecm.a()) {
            ihs b = ihs.b();
            hph f = aecq.f(b);
            aupy aupy = null;
            if (azvd.b()) {
                iby = adrz.a(ihs.b(), new adry());
            } else {
                aupy = aecq.a((Context) ihs.b());
                iby = null;
            }
            try {
                f.c("DataAlarmOperation").a();
                if (aecq.a(aupy, iby)) {
                    f.c("DataCanCollect").a();
                    FetchOperation.b(b, iby, aupy, f, intent);
                    if (azwv.a.a().q()) {
                        aecq.a(azws.f(), (Context) b);
                    }
                }
                bbx bbx = bbx.UNKNOWN_PERIOD;
                if (jkr.h() && intent.hasExtra("FETCH_PERIOD_EXTRA")) {
                    bbx = bbx.a(intent.getIntExtra("FETCH_PERIOD_EXTRA", 0));
                }
                a(b, Long.valueOf(a(bbx)), f, bbx, true);
            } finally {
                f.d();
            }
        }
    }

    public static synchronized void a(Context context, bbx bbx) {
        Class<DataAlarmOperation> cls = DataAlarmOperation.class;
        synchronized (cls) {
            PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, (Class) cls, new Intent("com.google.android.gms.westworld.action.ALARM"), bbx.g, 134217728);
            new jbs(context).a(pendingIntent);
            pendingIntent.cancel();
        }
    }

    public static synchronized void a(Context context, Long l, hph hph, bbx bbx, boolean z) {
        int i;
        Class<DataAlarmOperation> cls = DataAlarmOperation.class;
        synchronized (cls) {
            hph.c("AlarmDelayOperation").a();
            if (jkr.h()) {
                i = bbx.g;
            } else {
                i = 0;
            }
            if (jkr.h()) {
                if (!z && a(context, i)) {
                    return;
                }
            }
            jbs jbs = new jbs(context);
            Intent intent = new Intent("com.google.android.gms.westworld.action.ALARM");
            if (jkr.h()) {
                intent.putExtra("FETCH_PERIOD_EXTRA", bbx.g);
            }
            jbs.a("WestworldPoll", 3, SystemClock.elapsedRealtime() + l.longValue(), IntentOperation.getPendingIntent(context, (Class) cls, intent, i, 134217728), "com.google.android.gms.westworld");
        }
    }

    private static synchronized boolean a(Context context, int i) {
        boolean z;
        Class<DataAlarmOperation> cls = DataAlarmOperation.class;
        synchronized (cls) {
            z = IntentOperation.getPendingIntent(context, (Class) cls, new Intent("com.google.android.gms.westworld.action.ALARM"), i, 536870912) != null;
        }
        return z;
    }
}
