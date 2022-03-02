package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: aryv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aryv extends BroadcastReceiver {
    private final aryr a;

    public aryv(aryr aryr) {
        this.a = aryr;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (aryx.e.containsValue(intent.getAction()) && bluetoothDevice != null) {
                List a2 = this.a.a.a();
                if (a2.isEmpty()) {
                    ((anih) ((anih) aryq.a.d()).a("aryv", "onReceive", 207, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: receive connection change, but no listener registered.");
                    return;
                }
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    ((aryw) a2.get(i)).a(((Integer) ((anfo) aryx.e).d.get(intent.getAction())).intValue(), intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1), intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1), bluetoothDevice);
                }
                return;
            }
            aryq aryq = aryq.a;
            return;
        }
        aryq aryq2 = aryq.a;
    }
}
