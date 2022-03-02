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
public final class FileList extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new kyb();
    private static final HashMap d;
    final Set a;
    public List b;
    public String c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("items", FastJsonResponse$Field.b("items", 4, File.class));
        d.put("nextPageToken", FastJsonResponse$Field.f("nextPageToken", 7));
    }

    public FileList() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return d;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            return this.b;
        }
        if (i == 7) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FileList)) {
            return false;
        }
        if (this != obj) {
            FileList fileList = (FileList) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!fileList.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(fileList.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (fileList.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public FileList(Set set, List list, String str) {
        this.a = set;
        this.b = list;
        this.c = str;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 7) {
            this.c = str2;
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
        if (set.contains(4)) {
            ivx.c(parcel, 4, this.b, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.c, true);
        }
        ivx.b(parcel, a2);
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
