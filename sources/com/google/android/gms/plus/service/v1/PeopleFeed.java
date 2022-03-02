package com.google.android.gms.plus.service.v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PeopleFeed extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new zde();
    private static final HashMap i;
    public final Set a;
    public final int b;
    public String c;
    public List d;
    public String e;
    public String f;
    public String g;
    public int h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("etag", FastJsonResponse$Field.f("etag", 2));
        i.put("items", FastJsonResponse$Field.b("items", 3, PersonEntity.class));
        i.put("nextPageToken", FastJsonResponse$Field.f("nextPageToken", 5));
        i.put("selfLink", FastJsonResponse$Field.f("selfLink", 6));
        i.put("title", FastJsonResponse$Field.f("title", 7));
        i.put("totalItems", FastJsonResponse$Field.a("totalItems", 8));
    }

    public PeopleFeed() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return i;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 3) {
            return this.d;
        }
        if (i2 == 5) {
            return this.e;
        }
        if (i2 == 6) {
            return this.f;
        }
        if (i2 == 7) {
            return this.g;
        }
        if (i2 == 8) {
            return Integer.valueOf(this.h);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PeopleFeed)) {
            return false;
        }
        if (this != obj) {
            PeopleFeed peopleFeed = (PeopleFeed) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : i.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!peopleFeed.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(peopleFeed.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (peopleFeed.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : i.values()) {
            if (a(fastJsonResponse$Field)) {
                i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 8) {
            this.h = i2;
            this.a.add(Integer.valueOf(i3));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i3);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.c(parcel, 3, this.d, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            ivx.b(parcel, 8, this.h);
        }
        ivx.b(parcel, a2);
    }

    public PeopleFeed(Set set, int i2, String str, List list, String str2, String str3, String str4, int i3) {
        this.a = set;
        this.b = i2;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i3;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = str2;
        } else if (i2 == 5) {
            this.e = str2;
        } else if (i2 == 6) {
            this.f = str2;
        } else if (i2 == 7) {
            this.g = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.d = arrayList;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i2);
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
