package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MultiTransportViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new ncs();
    public final int a;
    private final List b;

    public MultiTransportViewOptions(int i, List list) {
        this.a = i;
        iva.a((Object) list);
        this.b = list;
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Transport transport : this.b) {
                jSONArray.put(transport.g);
            }
            a2.put("transports", jSONArray);
            return a2;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final ncx b() {
        return ncx.MULTI_TRANSPORT;
    }

    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiTransportViewOptions) {
            MultiTransportViewOptions multiTransportViewOptions = (MultiTransportViewOptions) obj;
            return this.b.containsAll(multiTransportViewOptions.b) && multiTransportViewOptions.b.containsAll(this.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, (List) new ArrayList(this.b));
        ivx.b(parcel, a2);
    }
}
