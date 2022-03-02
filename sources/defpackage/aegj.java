package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: aegj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aegj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Event[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        aegk f = Event.f();
        f.a(aspb.a(parcel.readInt()));
        f.a(parcel.readLong());
        f.a = (Short) parcel.readValue(Short.class.getClassLoader());
        f.b = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        f.c = (Exception) parcel.readSerializable();
        return f.a();
    }
}
