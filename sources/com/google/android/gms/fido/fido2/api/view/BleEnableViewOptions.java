package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleEnableViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new naj();
    public final boolean a;
    public final boolean b;

    public BleEnableViewOptions(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        try {
            a2.put("bluetoothEnabled", this.a);
            a2.put("locationServiceEnabled", this.b);
            return a2;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final nax b() {
        return nax.BLE_ENABLE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BleEnableViewOptions) {
            BleEnableViewOptions bleEnableViewOptions = (BleEnableViewOptions) obj;
            if (this.a == bleEnableViewOptions.a && this.b == bleEnableViewOptions.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
