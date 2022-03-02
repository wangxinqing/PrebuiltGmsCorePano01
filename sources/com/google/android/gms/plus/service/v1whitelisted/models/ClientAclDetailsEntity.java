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
public final class ClientAclDetailsEntity extends FastSafeParcelableJsonResponse implements zft {
    public static final Parcelable.Creator CREATOR = new zfu();
    private static final HashMap f;
    final Set a;
    final int b;
    List c;
    List d;
    List e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("circle", FastJsonResponse$Field.b("circle", 2, ClientLoggedCircleEntity.class));
        f.put("person", FastJsonResponse$Field.b("person", 4, ClientLoggedCircleMemberEntity.class));
        f.put("systemGroup", FastJsonResponse$Field.g("systemGroup", 5));
    }

    public ClientAclDetailsEntity() {
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
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClientAclDetailsEntity)) {
            return false;
        }
        if (this != obj) {
            ClientAclDetailsEntity clientAclDetailsEntity = (ClientAclDetailsEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!clientAclDetailsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(clientAclDetailsEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientAclDetailsEntity.a(fastJsonResponse$Field)) {
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

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = arrayList;
        } else if (i == 4) {
            this.d = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.e = arrayList;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an array of String.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.c(parcel, 2, this.c, true);
        }
        if (set.contains(4)) {
            ivx.c(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            ivx.b(parcel, 5, this.e, true);
        }
        ivx.b(parcel, a2);
    }

    public ClientAclDetailsEntity(Set set, int i, List list, List list2, List list3) {
        this.a = set;
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = list3;
    }

    public ClientAclDetailsEntity(Set set, List list, List list2, List list3) {
        this.a = set;
        this.b = 1;
        this.c = list;
        this.d = list2;
        this.e = list3;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
