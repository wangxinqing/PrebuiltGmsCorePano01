package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Property extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new kyi();
    private static final HashMap f;
    public final Set a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("appId", FastJsonResponse$Field.f("appId", 2));
        f.put("key", FastJsonResponse$Field.f("key", 4));
        f.put("value", FastJsonResponse$Field.f("value", 7));
        f.put("visibility", FastJsonResponse$Field.f("visibility", 8));
    }

    public Property() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return f;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 4) {
            return this.c;
        }
        if (i == 7) {
            return this.d;
        }
        if (i == 8) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Property)) {
            return false;
        }
        if (this != obj) {
            Property property = (Property) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!property.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(property.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (property.a(fastJsonResponse$Field)) {
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

    public Property(Set set, String str, String str2, String str3, String str4) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 4) {
            this.c = str2;
        } else if (i == 7) {
            this.d = str2;
        } else if (i == 8) {
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
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.c, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.d, true);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.e, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
