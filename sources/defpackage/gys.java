package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: gys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gys extends gyr {
    private static final iwd a = gzk.a("HighFrequencyBackoffDelayComputer");
    private final ivk b;

    public gys(Context context) {
        this.b = gxv.a(context, "high_frequency_backoff_shared_pref_name");
    }

    public final long a(long j, Bundle bundle) {
        long j2 = awrq.j();
        long q = awrq.a.a().q();
        long j3 = this.b.getLong("HighFrequency_LastCheckinStartTime", 0);
        long j4 = this.b.getLong("HighFrequency_TimeGapSum", 0);
        long j5 = this.b.getLong("HighFrequency_Count", 0);
        long j6 = j - j3;
        if (j5 != 0 && j6 <= j2) {
            long j7 = j5 + 1;
            long max = Math.max(0, (((j7 - q) * j2) - (j4 + j6)) / j7);
            if (gyr.a(bundle)) {
                a.b("Ignore high frequency delay for forced checkin.", new Object[0]);
                return 0;
            }
            long min = Math.min(max, j2);
            a.b("High frequency delay %d ms enforced", Long.valueOf(min));
            return min;
        }
        a.b("Exceeded high frequency delay range.", new Object[0]);
        return 0;
    }

    public final String a() {
        return "HighFrequencyBackoffDelayComputer";
    }

    public final void b() {
        SharedPreferences.Editor edit = this.b.edit();
        edit.remove("HighFrequency_Count");
        edit.remove("HighFrequency_LastCheckinStartTime");
        edit.remove("HighFrequency_TimeGapSum");
        edit.commit();
    }

    public final void a(long j, gvx gvx) {
        long j2;
        long j3;
        long j4 = j;
        if (gvx.e != 3) {
            long j5 = this.b.getLong("HighFrequency_LastCheckinStartTime", 0);
            long j6 = this.b.getLong("HighFrequency_TimeGapSum", 0);
            long j7 = this.b.getLong("HighFrequency_Count", 0);
            long j8 = j4 - j5;
            if (j7 == 0) {
                j2 = 1;
                j3 = j;
            } else if (j8 > awrq.j()) {
                j2 = 1;
                j3 = j;
            } else {
                SharedPreferences.Editor edit = this.b.edit();
                edit.putLong("HighFrequency_Count", j7 + 1);
                edit.putLong("HighFrequency_TimeGapSum", j6 + j8);
                edit.putLong("HighFrequency_LastCheckinStartTime", j);
                edit.commit();
                return;
            }
            a.b("Exceeded high frequency delay range. Reset high frequency state.", new Object[0]);
            SharedPreferences.Editor edit2 = this.b.edit();
            edit2.putLong("HighFrequency_LastCheckinStartTime", j3);
            edit2.putLong("HighFrequency_Count", j2);
            edit2.putLong("HighFrequency_TimeGapSum", 0);
            edit2.commit();
        }
    }
}
