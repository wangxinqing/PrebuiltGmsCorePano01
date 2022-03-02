package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BlePairViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nco();
    public final BleDeviceIdentifier a;

    public BlePairViewOptions(BleDeviceIdentifier bleDeviceIdentifier) {
        iva.a((Object) bleDeviceIdentifier);
        this.a = bleDeviceIdentifier;
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        this.a.b(a2);
        return a2;
    }

    public final ncx b() {
        return ncx.BLE_PAIR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlePairViewOptions) {
            return ius.a(this.a, ((BlePairViewOptions) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
