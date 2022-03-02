package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlusAppClient extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new zia();
    private static final HashMap f;
    final Set a;
    final int b;
    public String c;
    public String d;
    public String e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("androidCertificateHash", FastJsonResponse$Field.f("androidCertificateHash", 2));
        f.put("androidPackageName", FastJsonResponse$Field.f("androidPackageName", 3));
        f.put("type", FastJsonResponse$Field.f("type", 6));
    }

    public PlusAppClient() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return f;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 6) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlusAppClient)) {
            return false;
        }
        if (this != obj) {
            PlusAppClient plusAppClient = (PlusAppClient) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!plusAppClient.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(plusAppClient.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (plusAppClient.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = str2;
        } else if (i == 3) {
            this.d = str2;
        } else if (i == 6) {
            this.e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.e, true);
        }
        ivx.b(parcel, a2);
    }

    public PlusAppClient(Set set, int i, String str, String str2, String str3) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
