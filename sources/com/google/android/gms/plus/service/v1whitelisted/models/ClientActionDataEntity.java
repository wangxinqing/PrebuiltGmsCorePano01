package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ClientActionDataEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, zfw {
    public static final Parcelable.Creator CREATOR = new zfx();
    private static final HashMap h;
    final Set a;
    final int b;
    ClientAclDetailsEntity c;
    List d;
    List e;
    List f;
    ClientLoggedRhsComponentEntity g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("aclDetails", FastJsonResponse$Field.a("aclDetails", 2, ClientAclDetailsEntity.class));
        h.put("circle", FastJsonResponse$Field.b("circle", 7, ClientLoggedCircleEntity.class));
        h.put("circleMember", FastJsonResponse$Field.b("circleMember", 8, ClientLoggedCircleMemberEntity.class));
        h.put("obfuscatedGaiaId", FastJsonResponse$Field.g("obfuscatedGaiaId", 13));
        h.put("rhsComponent", FastJsonResponse$Field.a("rhsComponent", 20, ClientLoggedRhsComponentEntity.class));
    }

    public ClientActionDataEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return h;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        if (i == 13) {
            return this.f;
        }
        if (i == 20) {
            return this.g;
        }
        if (i == 7) {
            return this.d;
        }
        if (i == 8) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClientActionDataEntity)) {
            return false;
        }
        if (this != obj) {
            ClientActionDataEntity clientActionDataEntity = (ClientActionDataEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!clientActionDataEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(clientActionDataEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientActionDataEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = (ClientAclDetailsEntity) jag;
        } else if (i == 20) {
            this.g = (ClientLoggedRhsComponentEntity) jag;
        } else {
            String canonicalName = jag.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 13) {
            this.f = arrayList;
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
            ivx.a(parcel, 2, this.c, i, true);
        }
        if (set.contains(7)) {
            ivx.c(parcel, 7, this.d, true);
        }
        if (set.contains(8)) {
            ivx.c(parcel, 8, this.e, true);
        }
        if (set.contains(13)) {
            ivx.b(parcel, 13, this.f, true);
        }
        if (set.contains(20)) {
            ivx.a(parcel, 20, this.g, i, true);
        }
        ivx.b(parcel, a2);
    }

    public ClientActionDataEntity(Set set, int i, ClientAclDetailsEntity clientAclDetailsEntity, List list, List list2, List list3, ClientLoggedRhsComponentEntity clientLoggedRhsComponentEntity) {
        this.a = set;
        this.b = i;
        this.c = clientAclDetailsEntity;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = clientLoggedRhsComponentEntity;
    }

    public ClientActionDataEntity(Set set, ClientAclDetailsEntity clientAclDetailsEntity, List list, List list2, ClientLoggedRhsComponentEntity clientLoggedRhsComponentEntity) {
        this.a = set;
        this.b = 1;
        this.c = clientAclDetailsEntity;
        this.d = list;
        this.e = list2;
        this.f = null;
        this.g = clientLoggedRhsComponentEntity;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 7) {
            this.d = arrayList;
        } else if (i == 8) {
            this.e = arrayList;
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
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
