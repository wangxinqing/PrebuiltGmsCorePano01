package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: asbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class asbi implements ampc {
    static final ampc a = new asbi();

    private asbi() {
    }

    public final aejx a(Context context, String str, aejz aejz) {
        return aejx.a(((BluetoothDevice) ((asbb) thl.a(context, asbb.class)).a.get(str)).connectGatt(context, false, aejz.b));
    }
}
