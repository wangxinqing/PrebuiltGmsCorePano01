package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleDeviceIdentifier extends AbstractSafeParcelable implements myv {
    public static final Parcelable.Creator CREATOR = new ncm();
    public final String a;
    public final String b;
    public final boolean c;

    public BleDeviceIdentifier(String str, String str2, boolean z) {
        iva.a((Object) str);
        this.a = str;
        iva.a((Object) str2);
        this.b = str2;
        this.c = z;
    }

    public static BleDeviceIdentifier a(JSONObject jSONObject) {
        boolean z;
        if (jSONObject.has("requiresPinPairing")) {
            z = jSONObject.getBoolean("requiresPinPairing");
        } else {
            z = false;
        }
        return new BleDeviceIdentifier(jSONObject.getString("deviceName"), jSONObject.getString("deviceId"), z);
    }

    public final JSONObject a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void b(JSONObject jSONObject) {
        try {
            jSONObject.put("deviceName", this.a);
            jSONObject.put("deviceId", this.b);
            jSONObject.put("requiresPinPairing", this.c);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleDeviceIdentifier) {
            BleDeviceIdentifier bleDeviceIdentifier = (BleDeviceIdentifier) obj;
            return this.b.equals(bleDeviceIdentifier.b) && this.a.equals(bleDeviceIdentifier.a) && this.c == bleDeviceIdentifier.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, Boolean.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
