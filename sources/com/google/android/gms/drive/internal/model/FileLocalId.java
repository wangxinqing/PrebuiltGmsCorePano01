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
public final class FileLocalId extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new kyc();
    private static final HashMap e;
    public final Set a;
    public String b;
    public String c;
    public String d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("space", FastJsonResponse$Field.f("space", 3));
        e.put("value", FastJsonResponse$Field.f("value", 4));
        e.put("version", FastJsonResponse$Field.f("version", 5));
    }

    public FileLocalId() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return e;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            return this.b;
        }
        if (i == 4) {
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
        if (!(obj instanceof FileLocalId)) {
            return false;
        }
        if (this != obj) {
            FileLocalId fileLocalId = (FileLocalId) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!fileLocalId.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(fileLocalId.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (fileLocalId.a(fastJsonResponse$Field)) {
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

    public FileLocalId(Set set, String str, String str2, String str3) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.b = str2;
        } else if (i == 4) {
            this.c = str2;
        } else if (i == 5) {
            this.d = str2;
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
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.b, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.c, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.d, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
