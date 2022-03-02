package defpackage;

import android.content.Context;
import android.net.TrafficStats;

/* renamed from: atgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgw {
    public static void a(Context context, int i) {
        int a = jiy.a(context);
        if (a == -1) {
            a = 7;
        }
        TrafficStats.setThreadStatsTag((a << 28) | i);
    }
}
