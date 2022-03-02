package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.R;

/* renamed from: uck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uck extends arwm {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ udb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uck(udb udb, String str, BluetoothDevice bluetoothDevice) {
        super(str);
        this.b = udb;
        this.a = bluetoothDevice;
    }

    public final void run() {
        int a2 = arww.a(this.a.getAddress());
        String b2 = arww.b(this.a.getAddress());
        if (aymw.a.a().bk() && b2 != null && a2 >= 0 && a2 <= 100) {
            Context context = this.b.e;
            Toast.makeText(context, context.getString(R.string.fast_pair_battery_remaining, new Object[]{b2, Integer.valueOf(a2)}), (int) aymt.a.a().h()).show();
            this.b.f.a(asom.BLUETOOTH_BATTERY_LEVEL_TOAST_SHOWN);
        }
    }
}
