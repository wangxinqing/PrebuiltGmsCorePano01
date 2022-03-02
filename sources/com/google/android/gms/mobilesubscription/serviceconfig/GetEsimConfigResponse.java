package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetEsimConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tbf();
    public String a;
    public String b;
    public Long c;
    public Long d;
    public String e;
    public String f;
    public Bundle g;

    private GetEsimConfigResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetEsimConfigResponse) {
            GetEsimConfigResponse getEsimConfigResponse = (GetEsimConfigResponse) obj;
            return ius.a(this.a, getEsimConfigResponse.a) && ius.a(this.b, getEsimConfigResponse.b) && ius.a(this.c, getEsimConfigResponse.c) && ius.a(this.d, getEsimConfigResponse.d) && ius.a(this.e, getEsimConfigResponse.e) && ius.a(this.f, getEsimConfigResponse.f) && ius.a(this.g, getEsimConfigResponse.g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public GetEsimConfigResponse(String str, String str2, Long l, Long l2, String str3, String str4, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = str3;
        this.f = str4;
        this.g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 63, this.g, false);
        ivx.b(parcel, a2);
    }
}
