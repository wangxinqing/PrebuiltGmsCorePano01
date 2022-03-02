package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: izj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izj {
    private static ihs a = null;

    public static int a(int i) {
        return i | (c() << 28);
    }

    private static ihs b() {
        if (a == null) {
            a = ihs.b();
        }
        return a;
    }

    private static int c() {
        int a2 = jiy.a((Context) b());
        if (a2 == -1) {
            return 7;
        }
        return a2;
    }

    public static void a() {
        TrafficStats.clearThreadStatsTag();
        TrafficStats.clearThreadStatsUid();
    }

    public static void b(int i) {
        a(i, -1);
    }

    public static void a(int i, int i2) {
        int i3;
        TrafficStats.setThreadStatsTag(a(i));
        if (i2 == -1) {
            TrafficStats.clearThreadStatsUid();
        } else {
            TrafficStats.setThreadStatsUid(i2);
        }
        if (axbe.f()) {
            NetworkInfo d = jkf.d(b());
            if (d != null) {
                i3 = d.getType();
            } else {
                i3 = -1;
            }
            int i4 = i;
            b().getNetworkActivityLogger().logAsync(new NetworkActivityEvent(System.currentTimeMillis(), i3, i4, c(), jkf.e(b())));
        }
    }

    public static void a(Socket socket) {
        try {
            TrafficStats.tagSocket(socket);
        } catch (SocketException e) {
            Log.w("GmsNetworkTrafficStats", "failed to tag socket", e);
        }
    }
}
