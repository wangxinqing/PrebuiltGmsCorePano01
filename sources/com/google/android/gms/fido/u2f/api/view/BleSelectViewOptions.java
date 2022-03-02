package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleSelectViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new ncq();
    public final boolean a;
    public final List b;

    public BleSelectViewOptions(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final ncx b() {
        return ncx.BLE_SELECT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleSelectViewOptions) {
            BleSelectViewOptions bleSelectViewOptions = (BleSelectViewOptions) obj;
            return this.a == bleSelectViewOptions.a && ius.a(this.b, bleSelectViewOptions.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        try {
            a2.put("previousPairingAttemptFailed", this.a);
            if (this.b != null) {
                JSONArray jSONArray = new JSONArray();
                for (BleDeviceIdentifier b2 : this.b) {
                    JSONObject jSONObject = new JSONObject();
                    b2.b(jSONObject);
                    jSONArray.put(jSONObject);
                }
                a2.put("devicesList", jSONArray);
            }
            return a2;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.c(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
