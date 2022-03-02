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
public final class MomentsFeed extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new zhi();
    private static final HashMap f;
    final Set a;
    final int b;
    public List c;
    public String d;
    public String e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("items", FastJsonResponse$Field.b("items", 4, MomentEntity.class));
        f.put("nextPageToken", FastJsonResponse$Field.f("nextPageToken", 7));
        f.put("title", FastJsonResponse$Field.f("title", 9));
    }

    public MomentsFeed() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return f;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            return this.c;
        }
        if (i == 7) {
            return this.d;
        }
        if (i == 9) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MomentsFeed)) {
            return false;
        }
        if (this != obj) {
            MomentsFeed momentsFeed = (MomentsFeed) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
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
        if (i == 7) {
            this.d = str2;
        } else if (i == 9) {
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
        if (set.contains(4)) {
            ivx.c(parcel, 4, this.c, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.d, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.e, true);
        }
        ivx.b(parcel, a2);
    }

    public MomentsFeed(Set set, int i, List list, String str, String str2) {
        this.a = set;
        this.b = i;
        this.c = list;
        this.d = str;
        this.e = str2;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
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
