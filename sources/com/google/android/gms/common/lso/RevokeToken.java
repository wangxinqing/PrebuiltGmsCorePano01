package com.google.android.gms.common.lso;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RevokeToken extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new iwk();
    private static final HashMap c;
    final Set a;
    String b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("version_info", FastJsonResponse$Field.f("version_info", 2));
    }

    public RevokeToken() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return c;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RevokeToken)) {
            return false;
        }
        if (this != obj) {
            RevokeToken revokeToken = (RevokeToken) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!revokeToken.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(revokeToken.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (revokeToken.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public RevokeToken(Set set, String str) {
        this.a = set;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        if (this.a.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
