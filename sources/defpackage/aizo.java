package defpackage;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: aizo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aizo extends aiaf {
    protected final BluetoothDevice b;

    public aizo(BluetoothDevice bluetoothDevice) {
        super(arvy.a(bluetoothDevice.getAddress()));
        this.b = bluetoothDevice;
    }

    public final String a() {
        return this.b.getName();
    }

    public final String b() {
        try {
            Method method = this.b.getClass().getMethod("getAlias", new Class[0]);
            if (method == null) {
                return null;
            }
            String str = (String) method.invoke(this.b, new Object[0]);
            Object[] objArr = {a(), str};
            return str;
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            return null;
        }
    }

    public final String c() {
        return this.b.getAddress();
    }

    public final int d() {
        return this.b.getBondState();
    }

    public final int e() {
        BluetoothClass i = i();
        if (i != null) {
            return i.getDeviceClass();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aizo) {
            return this.b.equals(((aizo) obj).b);
        }
        return false;
    }

    public final int f() {
        BluetoothClass i = i();
        if (i != null) {
            return i.getMajorDeviceClass();
        }
        return 0;
    }

    public final String[] g() {
        UUID uuid;
        ParcelUuid[] j = j();
        if (j == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ParcelUuid parcelUuid : j) {
            if (!(parcelUuid == null || (uuid = parcelUuid.getUuid()) == null)) {
                arrayList.add(uuid.toString());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public int h() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final BluetoothClass i() {
        return this.b.getBluetoothClass();
    }

    public ParcelUuid[] j() {
        return null;
    }
}
