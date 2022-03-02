package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NfcViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nat();
    public final boolean a;
    public final boolean b;

    public NfcViewOptions() {
        this(false, false);
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        try {
            a2.put("deviceRemovedTooSoon", this.a);
            a2.put("recommendUsb", this.b);
            return a2;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final nax b() {
        return nax.NFC;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NfcViewOptions) {
            NfcViewOptions nfcViewOptions = (NfcViewOptions) obj;
            if (this.a == nfcViewOptions.a && this.b == nfcViewOptions.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public NfcViewOptions(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
