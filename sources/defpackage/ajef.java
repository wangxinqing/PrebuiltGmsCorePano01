package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.quake.ScreenStateListener$1;

/* renamed from: ajef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajef extends ajgo implements ajfd {
    public static final /* synthetic */ int b = 0;
    public boolean a;
    private final Context c;
    private BroadcastReceiver d;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajef(Context context, ajgd ajgd) {
        super(ajgd);
        this.c = context;
    }

    public final int a() {
        return 3;
    }

    public final synchronized void b() {
        this.a = false;
        if (this.d == null) {
            this.d = new ScreenStateListener$1(this, "location");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.c.registerReceiver(this.d, intentFilter);
        }
    }

    public final synchronized void c() {
        BroadcastReceiver broadcastReceiver = this.d;
        if (broadcastReceiver != null) {
            this.c.unregisterReceiver(broadcastReceiver);
            this.d = null;
        }
    }

    public final int d() {
        return this.a ? 2 : 1;
    }
}
