package defpackage;

import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.stats.AlarmEvent;
import com.google.android.gms.common.stats.ConnectionEvent;
import com.google.android.gms.common.stats.StatsEvent;
import com.google.android.gms.common.stats.WakeLockEvent;

/* renamed from: jcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jcj extends jfo {
    private final jda a = jda.a();

    public jcj(jfp jfp) {
        super(jfp);
    }

    public final void handleMessage(Message message) {
        if (message.what == 0) {
            SafeParcelable safeParcelable = (SafeParcelable) ((Intent) message.obj).getParcelableExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT");
            if (safeParcelable == null) {
                Log.w("GmsCoreStatsService", "Unable to get StatsEventParcelable.");
            } else if (safeParcelable instanceof StatsEvent) {
                StatsEvent statsEvent = (StatsEvent) safeParcelable;
                jda jda = this.a;
                if (statsEvent instanceof WakeLockEvent) {
                    jda.a((WakeLockEvent) statsEvent);
                } else if (statsEvent instanceof ConnectionEvent) {
                    jda.a((ConnectionEvent) statsEvent);
                }
            } else if (safeParcelable instanceof AlarmEvent) {
                this.a.a((AlarmEvent) safeParcelable);
            }
        }
    }
}
