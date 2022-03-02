package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.reporting.collectors.ble.BluetoothStateReceiver$1;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ajie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajie {
    public final Context a;
    public final IntentFilter b = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
    public final ijp c;
    public final Set d = new HashSet();
    public boolean e = false;
    public final BroadcastReceiver f = new BluetoothStateReceiver$1(this, "location");

    public ajie(Context context) {
        ijp a2 = ijp.a();
        this.a = context;
        this.c = a2;
    }

    public final synchronized void a(ajhy ajhy) {
        this.d.add(ajhy);
    }
}
