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
public final class Audience extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new zfq();
    private static final HashMap e;
    final Set a;
    final int b;
    public PlusAclentryResourceEntity c;
    public String d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("item", FastJsonResponse$Field.a("item", 3, PlusAclentryResourceEntity.class));
        e.put("visibility", FastJsonResponse$Field.f("visibility", 6));
    }

    public Audience() {
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
        if (i == 6) {
            return this.d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Audience)) {
            return false;
        }
        if (this != obj) {
            Audience audience = (Audience) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!audience.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(audience.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (audience.a(fastJsonResponse$Field)) {
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

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = (PlusAclentryResourceEntity) jag;
            this.a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = jag.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, i, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.d, true);
        }
        ivx.b(parcel, a2);
    }

    public Audience(Set set, int i, PlusAclentryResourceEntity plusAclentryResourceEntity, String str) {
        this.a = set;
        this.b = i;
        this.c = plusAclentryResourceEntity;
        this.d = str;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 6) {
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

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
