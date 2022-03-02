package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetEsimConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tbe();
    public String a;
    public UserKey b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String[] g;
    public Bundle h;

    public GetEsimConfigRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetEsimConfigRequest) {
            GetEsimConfigRequest getEsimConfigRequest = (GetEsimConfigRequest) obj;
            return ius.a(this.a, getEsimConfigRequest.a) && ius.a(this.b, getEsimConfigRequest.b) && ius.a(this.c, getEsimConfigRequest.c) && ius.a(this.d, getEsimConfigRequest.d) && ius.a(this.e, getEsimConfigRequest.e) && ius.a(this.f, getEsimConfigRequest.f) && Arrays.equals(this.g, getEsimConfigRequest.g) && ius.a(this.h, getEsimConfigRequest.h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h});
    }

    public GetEsimConfigRequest(String str, UserKey userKey, String str2, String str3, String str4, String str5, String[] strArr, Bundle bundle) {
        this.a = str;
        this.b = userKey;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = strArr;
        this.h = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 63, this.h, false);
        ivx.b(parcel, a2);
    }
}
