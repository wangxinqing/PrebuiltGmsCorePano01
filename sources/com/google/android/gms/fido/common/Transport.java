package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    CABLE("cable");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String g;

    static {
        CREATOR = new myt();
    }

    private Transport(String str) {
        this.g = str;
    }

    public static Transport a(String str) {
        for (Transport transport : values()) {
            if (str.equals(transport.g)) {
                return transport;
            }
        }
        throw new myu(String.format("Transport %s not supported", new Object[]{str}));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.g);
    }

    public static List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(a(string));
                } catch (myu e) {
                    Log.w("Transport", string.length() == 0 ? new String("Ignoring unrecognized transport ") : "Ignoring unrecognized transport ".concat(string));
                }
            }
        }
        return new ArrayList(hashSet);
    }
}
