package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.sharing.utils.BluetoothUtils$1;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: whs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class whs implements Callable {
    private final Context a;
    private final BluetoothAdapter b;

    public whs(Context context, BluetoothAdapter bluetoothAdapter) {
        this.a = context;
        this.b = bluetoothAdapter;
    }

    public final Object call() {
        Context context = this.a;
        BluetoothAdapter bluetoothAdapter = this.b;
        aosh f = aosh.f();
        BluetoothUtils$1 bluetoothUtils$1 = new BluetoothUtils$1("nearby", f);
        context.registerReceiver(bluetoothUtils$1, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        if (!bluetoothAdapter.enable()) {
            f.a((Throwable) new Exception("Bluetooth Service denied the enable request."));
        }
        boolean b2 = thr.b("enableBluetooth", (Future) f, 3000);
        thp.a(context, (BroadcastReceiver) bluetoothUtils$1);
        if (b2 || bluetoothAdapter.isEnabled()) {
            return null;
        }
        throw new Exception("Got exception when turning on bluetooth.");
    }
}
