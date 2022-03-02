package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nan();
    public final boolean a;

    public BleViewOptions() {
        this(false);
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        try {
            a2.put("anyFido2DevicesPaired", this.a);
            return a2;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final nax b() {
        return nax.BLE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BleViewOptions) || this.a != ((BleViewOptions) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public BleViewOptions(boolean z) {
        this.a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.b(parcel, a2);
    }
}
