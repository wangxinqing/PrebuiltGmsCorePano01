package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleProcessRequestViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nal();
    public final BleDeviceIdentifier a;
    public final boolean b;

    public BleProcessRequestViewOptions(BleDeviceIdentifier bleDeviceIdentifier, boolean z) {
        iva.a((Object) bleDeviceIdentifier);
        this.a = bleDeviceIdentifier;
        this.b = z;
    }

    public final nax b() {
        return nax.BLE_PROCESS_REQUEST;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BleProcessRequestViewOptions) {
            BleProcessRequestViewOptions bleProcessRequestViewOptions = (BleProcessRequestViewOptions) obj;
            if (this.b != bleProcessRequestViewOptions.b || !ius.a(this.a, bleProcessRequestViewOptions.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a});
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        try {
            this.a.b(a2);
            if (this.b) {
                a2.put("tupNeeded", true);
            }
            return a2;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
