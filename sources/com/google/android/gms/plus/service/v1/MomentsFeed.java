package com.google.android.gms.plus.service.v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MomentsFeed extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new zdc();
    private static final HashMap j;
    public final Set a;
    public final int b;
    public String c;
    public List d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("etag", FastJsonResponse$Field.f("etag", 2));
        j.put("items", FastJsonResponse$Field.b("items", 3, MomentEntity.class));
        j.put("nextLink", FastJsonResponse$Field.f("nextLink", 5));
        j.put("nextPageToken", FastJsonResponse$Field.f("nextPageToken", 6));
        j.put("selfLink", FastJsonResponse$Field.f("selfLink", 7));
        j.put("title", FastJsonResponse$Field.f("title", 8));
        j.put("updated", FastJsonResponse$Field.f("updated", 9));
    }

    public MomentsFeed() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return j;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.c;
            case 3:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            case 7:
                return this.g;
            case 8:
                return this.h;
            case 9:
                return this.i;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MomentsFeed)) {
            return false;
        }
        if (this != obj) {
            MomentsFeed momentsFeed = (MomentsFeed) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : j.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!momentsFeed.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(momentsFeed.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (momentsFeed.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : j.values()) {
            if (a(fastJsonResponse$Field)) {
                i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 2) {
            switch (i2) {
                case 5:
                    this.e = str2;
                    break;
                case 6:
                    this.f = str2;
                    break;
                case 7:
                    this.g = str2;
                    break;
                case 8:
                    this.h = str2;
                    break;
                case 9:
                    this.i = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.c = str2;
        }
        this.a.add(Integer.valueOf(i2));
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
            ivx.a(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i, true);
        }
        ivx.b(parcel, a2);
    }

    public MomentsFeed(Set set, int i2, String str, List list, String str2, String str3, String str4, String str5, String str6) {
        this.a = set;
        this.b = i2;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
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
