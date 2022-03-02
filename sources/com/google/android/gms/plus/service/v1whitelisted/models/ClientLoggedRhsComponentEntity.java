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
public final class ClientLoggedRhsComponentEntity extends FastSafeParcelableJsonResponse implements zgf {
    public static final Parcelable.Creator CREATOR = new zgg();
    private static final HashMap d;
    final Set a;
    final int b;
    List c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("item", FastJsonResponse$Field.b("item", 5, ClientLoggedRhsComponentItemEntity.class));
    }

    public ClientLoggedRhsComponentEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return d;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClientLoggedRhsComponentEntity)) {
            return false;
        }
        if (this != obj) {
            ClientLoggedRhsComponentEntity clientLoggedRhsComponentEntity = (ClientLoggedRhsComponentEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!clientLoggedRhsComponentEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(clientLoggedRhsComponentEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientLoggedRhsComponentEntity.a(fastJsonResponse$Field)) {
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

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
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

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(5)) {
            ivx.c(parcel, 5, this.c, true);
        }
        ivx.b(parcel, a2);
    }

    public ClientLoggedRhsComponentEntity(Set set, int i, List list) {
        this.a = set;
        this.b = i;
        this.c = list;
    }

    public ClientLoggedRhsComponentEntity(Set set, List list) {
        this.a = set;
        this.b = 1;
        this.c = list;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
