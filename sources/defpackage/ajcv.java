package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.quake.DeepStillListener$1;

/* renamed from: ajcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajcv extends ajgo {
    public static final /* synthetic */ int a = 0;
    private final Context b;
    private BroadcastReceiver c;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajcv(Context context, ajgd ajgd) {
        super(ajgd);
        this.b = context;
    }

    public final int a() {
        return ahix.Z ? 3 : 2;
    }

    public final synchronized void b() {
        if (this.c == null) {
            this.c = new DeepStillListener$1(this, "location");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
            intentFilter.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
            this.b.registerReceiver(this.c, intentFilter);
        }
    }

    public final synchronized void c() {
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.b.unregisterReceiver(broadcastReceiver);
            this.c = null;
        }
    }
}
