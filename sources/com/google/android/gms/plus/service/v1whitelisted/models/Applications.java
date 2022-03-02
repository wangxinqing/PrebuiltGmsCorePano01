package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Applications extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new zfp();
    private static final HashMap e;
    final Set a;
    final int b;
    public List c;
    public String d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("items", FastJsonResponse$Field.b("items", 3, Application.class));
        e.put("nextPageToken", FastJsonResponse$Field.f("nextPageToken", 5));
    }

    public Applications() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return e;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            return this.c;
        }
        if (i == 5) {
            return this.d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Applications)) {
            return false;
        }
        if (this != obj) {
            Applications applications = (Applications) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!applications.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(applications.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (applications.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.d = str2;
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
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(3)) {
            ivx.c(parcel, 3, this.c, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.d, true);
        }
        ivx.b(parcel, a2);
    }

    public Applications(Set set, int i, List list, String str) {
        this.a = set;
        this.b = i;
        this.c = list;
        this.d = str;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = arrayList;
            this.a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
