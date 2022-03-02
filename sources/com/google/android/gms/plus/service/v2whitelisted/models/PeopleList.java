package com.google.android.gms.plus.service.v2whitelisted.models;

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
public final class PeopleList extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new zix();
    private static final HashMap h;
    final Set a;
    String b;
    public List c;
    public String d;
    public String e;
    String f;
    int g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("etag", FastJsonResponse$Field.f("etag", 2));
        h.put("items", FastJsonResponse$Field.b("items", 3, Person.class));
        h.put("nextPageToken", FastJsonResponse$Field.f("nextPageToken", 5));
        h.put("nextSyncToken", FastJsonResponse$Field.f("nextSyncToken", 6));
        h.put("title", FastJsonResponse$Field.f("title", 7));
        h.put("totalItems", FastJsonResponse$Field.a("totalItems", 8));
    }

    public PeopleList() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return h;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 5) {
            return this.d;
        }
        if (i == 6) {
            return this.e;
        }
        if (i == 7) {
            return this.f;
        }
        if (i == 8) {
            return Integer.valueOf(this.g);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PeopleList)) {
            return false;
        }
        if (this != obj) {
            PeopleList peopleList = (PeopleList) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!peopleList.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(peopleList.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (peopleList.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public PeopleList(Set set, String str, List list, String str2, String str3, String str4, int i) {
        this.a = set;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 8) {
            this.g = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.c(parcel, 3, this.c, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.d, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.e, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.f, true);
        }
        if (set.contains(8)) {
            ivx.b(parcel, 8, this.g);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 5) {
            this.d = str2;
        } else if (i == 6) {
            this.e = str2;
        } else if (i == 7) {
            this.f = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
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
