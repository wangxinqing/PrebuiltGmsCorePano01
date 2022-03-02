package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlusAclentryResourceEntity extends FastSafeParcelableJsonResponse implements zhy {
    public static final Parcelable.Creator CREATOR = new zhz();
    private static final HashMap f;
    final Set a;
    final int b;
    String c;
    public String d;
    public String e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("displayName", FastJsonResponse$Field.f("displayName", 2));
        f.put("id", FastJsonResponse$Field.f("id", 3));
        f.put("type", FastJsonResponse$Field.f("type", 4));
    }

    public PlusAclentryResourceEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return f;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlusAclentryResourceEntity)) {
            return false;
        }
        if (this != obj) {
            PlusAclentryResourceEntity plusAclentryResourceEntity = (PlusAclentryResourceEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!plusAclentryResourceEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(plusAclentryResourceEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (plusAclentryResourceEntity.a(fastJsonResponse$Field)) {
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

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = str2;
        } else if (i == 3) {
            this.d = str2;
        } else if (i == 4) {
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
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, true);
        }
        ivx.b(parcel, a2);
    }

    public PlusAclentryResourceEntity(Set set, int i, String str, String str2, String str3) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public PlusAclentryResourceEntity(Set set, String str, String str2) {
        this.a = set;
        this.b = 1;
        this.c = null;
        this.d = str;
        this.e = str2;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
