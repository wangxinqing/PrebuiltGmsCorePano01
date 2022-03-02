package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetTokenResponse extends AbstractSafeParcelable implements apth {
    public static final Parcelable.Creator CREATOR = new apun();
    public String a;
    public String b;
    public Long c;
    public String d;
    public Long e;

    public GetTokenResponse() {
        this.e = Long.valueOf(System.currentTimeMillis());
    }

    public static GetTokenResponse a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            GetTokenResponse getTokenResponse = new GetTokenResponse();
            getTokenResponse.a = jSONObject.optString("refresh_token", (String) null);
            getTokenResponse.b = jSONObject.optString("access_token", (String) null);
            getTokenResponse.c = Long.valueOf(jSONObject.optLong("expires_in"));
            getTokenResponse.d = jSONObject.optString("token_type", (String) null);
            getTokenResponse.e = Long.valueOf(jSONObject.optLong("issued_at"));
            return getTokenResponse;
        } catch (JSONException e2) {
            throw new apnm(e2);
        }
    }

    public GetTokenResponse(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        Long l = this.c;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        ivx.a(parcel, 4, Long.valueOf(j));
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, Long.valueOf(this.e.longValue()));
        ivx.b(parcel, a2);
    }

    public GetTokenResponse(String str, String str2, Long l, String str3, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = l2;
    }

    public final auef a() {
        return (auef) auih.e.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof auih) {
            auih auih = (auih) audx;
            this.a = jlh.b(auih.d);
            this.b = jlh.b(auih.a);
            this.c = Long.valueOf(auih.b);
            this.d = jlh.b(auih.c);
            this.e = Long.valueOf(System.currentTimeMillis());
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of GrantTokenResponse.");
    }
}
