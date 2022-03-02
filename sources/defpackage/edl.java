package defpackage;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* renamed from: edl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class edl implements BluetoothProfile.ServiceListener {
    final /* synthetic */ edm a;

    public edl(edm edm) {
        this.a = edm;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 1) {
            synchronized (this.a.c) {
                this.a.b = (BluetoothHeadset) bluetoothProfile;
            }
        }
    }

    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            synchronized (this.a.c) {
                this.a.b = null;
            }
        }
    }
}
