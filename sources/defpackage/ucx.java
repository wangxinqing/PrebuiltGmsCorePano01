package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ucx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucx extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ udb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucx(udb udb, String str, Intent intent) {
        super(str);
        this.b = udb;
        this.a = intent;
    }

    public final void run() {
        tzi tzi;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            jjg jjg = tsp.a;
            return;
        }
        auay a2 = auay.a(this.a.getByteArrayExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY"));
        Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
        Iterator it = this.b.b.d().iterator();
        while (true) {
            tzi = null;
            if (!it.hasNext()) {
                break;
            }
            tzi tzi2 = (tzi) it.next();
            if (tzi2.c.equals(a2)) {
                jjg jjg2 = tsp.a;
                BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(tzi2.b);
                if (!bondedDevices.contains(remoteDevice) || remoteDevice.removeBond()) {
                    tzi = tzi2;
                }
            }
        }
        if (!aymw.a.a().E()) {
            if (tzi != null) {
                jjg jjg3 = tsp.a;
                this.b.b.c(tzi.b);
                if (aymw.i() && this.b.b.b(tzi.k) == 0) {
                    uac.a(this.b.e, tzi.k);
                }
            }
            if (aymw.F()) {
                this.b.k.a(a2);
            }
        }
    }
}
