package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;

/* renamed from: ued  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ued extends ueh {
    final /* synthetic */ OnEndpointFoundParams a;

    public ued(OnEndpointFoundParams onEndpointFoundParams) {
        this.a = onEndpointFoundParams;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tiz tiz = (tiz) obj;
        if (!ueg.b(this.a)) {
            String str = this.a.a;
            tiu tiu = new tiu();
            OnEndpointFoundParams onEndpointFoundParams = this.a;
            String str2 = onEndpointFoundParams.b;
            tiu.a = onEndpointFoundParams.c;
            tiu.b = onEndpointFoundParams.e;
            tiz.a(str, tiu.a());
            return;
        }
        tiu tiu2 = new tiu();
        OnEndpointFoundParams onEndpointFoundParams2 = this.a;
        String str3 = onEndpointFoundParams2.b;
        BluetoothDevice bluetoothDevice = onEndpointFoundParams2.d;
        tiu2.a = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
        tiu2.b = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
        tiz.a("__UNRECOGNIZED_BLUETOOTH_DEVICE__", tiu2.a());
    }
}
