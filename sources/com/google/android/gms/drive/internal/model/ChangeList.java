package com.google.android.gms.drive.internal.model;

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
public final class ChangeList extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new kxz();
    private static final HashMap e;
    final Set a;
    public List b;
    public long c;
    public String d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("items", FastJsonResponse$Field.b("items", 4, Change.class));
        e.put("largestChangeId", FastJsonResponse$Field.b("largestChangeId", 6));
        e.put("nextPageToken", FastJsonResponse$Field.f("nextPageToken", 8));
    }

    public ChangeList() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return e;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            return this.b;
        }
        if (i == 6) {
            return Long.valueOf(this.c);
        }
        if (i == 8) {
            return this.d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChangeList)) {
            return false;
        }
        if (this != obj) {
            ChangeList changeList = (ChangeList) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!changeList.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(changeList.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (changeList.a(fastJsonResponse$Field)) {
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

    public ChangeList(Set set, List list, long j, String str) {
        this.a = set;
        this.b = list;
        this.c = j;
        this.d = str;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 6) {
            this.c = j;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a long.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(4)) {
            ivx.c(parcel, 4, this.b, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.c);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.d, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 8) {
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

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.b = arrayList;
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
