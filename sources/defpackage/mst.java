package defpackage;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: mst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mst implements DialogInterface.OnClickListener {
    private final mta a;

    public mst(mta mta) {
        this.a = mta;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        mta mta = this.a;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothDevice bluetoothDevice = null;
        if (defaultAdapter == null || (str = mta.c) == null) {
            ((anih) ((anih) mte.a.d()).a("mta", "h", 354, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: getRemoteBluetoothDevice with null variable, return null.");
        } else {
            try {
                bluetoothDevice = defaultAdapter.getRemoteDevice(str);
            } catch (IllegalArgumentException e) {
            }
        }
        if (!mta.e() || bluetoothDevice == null) {
            ((anih) ((anih) mte.a.d()).a("mta", "d", 343, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Forget device %s (should be null) by FootprintsDeviceManager.forgetDevice", (Object) mta.c);
            arxt arxt = mta.j.a;
            byte[] bArr = mta.b;
            List a2 = arxt.a(arxt.b);
            int size = a2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Account account = (Account) a2.get(i2);
                try {
                    tzj a3 = arxt.a((List) arxt.a(account).get(), bArr);
                    if (a3 == null) {
                        i2++;
                    } else if ((a3.a & 4) == 0) {
                        ((anih) ((anih) aryq.a.c()).a("arxt", "a", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: fail to forget footprints because device has no sha256.");
                    } else {
                        arxt.a(account, bArr, a3.d.k());
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    anih anih = (anih) aryq.a.c();
                    anih.a(e2);
                    ((anih) anih.a("arxt", "a", 368, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: fail to forget footprints.");
                }
            }
        } else {
            ((anih) ((anih) mte.a.d()).a("mta", "d", 329, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Forget device %s by BluetoothDevice.removeBond", (Object) mta.c);
            mta.g().execute(new msu(mta, bluetoothDevice));
        }
        mta.getActivity().onBackPressed();
    }
}
