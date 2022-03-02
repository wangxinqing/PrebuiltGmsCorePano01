package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: aeiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeiq extends aekk {
    final /* synthetic */ aeiy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeiq(aeiy aeiy, Object... objArr) {
        super(objArr);
        this.a = aeiy;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        boolean z;
        BluetoothGattService a2;
        BluetoothGattService a3;
        if (this.a.g) {
            return null;
        }
        try {
            this.a.b();
            z = false;
        } catch (BluetoothException e) {
            if (Build.VERSION.SDK_INT <= 22) {
                throw e;
            } else if (e instanceof BluetoothGattException) {
                int i = ((BluetoothGattException) e).a;
                if (i == 133 || i == 129) {
                    Log.e(aeiy.a, String.valueOf(e.getMessage()).concat("\n Ignore the gatt error for post MNC apis and force a refresh"));
                    z = true;
                } else {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        aeiy aeiy = this.a;
        if (aeiy.d.a().a.getBondState() == 12 && (z || !(((a2 = aeiy.d.a(aees.a)) == null || a2.getCharacteristic(aeeq.a) == null) && ((a3 = aeiy.d.a(aeep.a)) == null || a3.getCharacteristic(aeep.b) == null)))) {
            Log.i(aeiy.a, "Forcing a refresh of local cache of GATT services");
            try {
                if (((Boolean) BluetoothGatt.class.getMethod("refresh", new Class[0]).invoke(aeiy.d.a, new Object[0])).booleanValue()) {
                    aeiy.b();
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            }
            throw new BluetoothException("gatt.refresh returned false.");
        }
        this.a.g = true;
        return null;
    }
}
