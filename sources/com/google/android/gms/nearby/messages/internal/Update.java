package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vdy();
    final int a;
    public final int b;
    public final Message c;
    public final DistanceImpl d;
    public final BleSignalImpl e;
    public final NearbyDevice f;
    public final byte[] g;

    public Update(int i, int i2, Message message, DistanceImpl distanceImpl, BleSignalImpl bleSignalImpl, NearbyDevice nearbyDevice, byte[] bArr) {
        this.a = i;
        boolean a2 = a(i2, 2);
        bArr = a2 ? null : bArr;
        nearbyDevice = a2 ? null : nearbyDevice;
        bleSignalImpl = a2 ? null : bleSignalImpl;
        distanceImpl = a2 ? null : distanceImpl;
        this.b = a2 ? 2 : i2;
        this.c = message;
        this.d = distanceImpl;
        this.e = bleSignalImpl;
        this.f = nearbyDevice;
        this.g = bArr;
    }

    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Update) {
            Update update = (Update) obj;
            return this.b == update.b && ius.a(this.c, update.c) && ius.a(this.d, update.d) && ius.a(this.e, update.e) && ius.a(this.f, update.f) && Arrays.equals(this.g, update.g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        ob obVar = new ob();
        if (a(1)) {
            obVar.add("FOUND");
        }
        if (a(2)) {
            obVar.add("LOST");
        }
        if (a(4)) {
            obVar.add("DISTANCE");
        }
        if (a(8)) {
            obVar.add("BLE_SIGNAL");
        }
        if (a(16)) {
            obVar.add("DEVICE");
        }
        if (a(32)) {
            obVar.add("BLE_RECORD");
        }
        String valueOf = String.valueOf(obVar);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(uzx.a(this.g));
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 68 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Update{types=");
        sb.append(valueOf);
        sb.append(", message=");
        sb.append(valueOf2);
        sb.append(", distance=");
        sb.append(valueOf3);
        sb.append(", bleSignal=");
        sb.append(valueOf4);
        sb.append(", device=");
        sb.append(valueOf5);
        sb.append(", bleRecord=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    public final String a() {
        String str = this.c.c().d;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Update{address=");
        sb.append(str);
        sb.append(", distance=");
        sb.append(valueOf);
        sb.append(", bleSignal=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, a2);
    }

    public final boolean a(int i) {
        return a(this.b, i);
    }
}
