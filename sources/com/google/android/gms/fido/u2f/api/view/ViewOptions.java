package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ViewOptions extends AbstractSafeParcelable implements myv {
    public static final Parcelable.Creator CREATOR = new ncy();
    private final int a;
    public Set c;

    public ViewOptions() {
        this(1);
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewName", b().k);
            Set set = this.c;
            if (set != null && !set.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (Transport transport : this.c) {
                    jSONArray.put(transport.g);
                }
                jSONObject.put("alternateAvailableTransports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public ncx b() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    public int c() {
        return this.a;
    }

    public final String toString() {
        return a().toString();
    }

    public ViewOptions(int i) {
        this.c = new HashSet();
        this.a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, c());
        ivx.b(parcel, a2);
    }
}
