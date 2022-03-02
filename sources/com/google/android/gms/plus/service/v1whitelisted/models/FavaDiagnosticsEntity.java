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
public final class FavaDiagnosticsEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new zgx();
    private static final HashMap g;
    final Set a;
    final int b;
    FavaDiagnosticsNamespacedTypeEntity c;
    FavaDiagnosticsNamespacedTypeEntity d;
    FavaDiagnosticsNamespacedTypeEntity e;
    int f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("actionType", FastJsonResponse$Field.a("actionType", 3, FavaDiagnosticsNamespacedTypeEntity.class));
        g.put("endView", FastJsonResponse$Field.a("endView", 4, FavaDiagnosticsNamespacedTypeEntity.class));
        g.put("startView", FastJsonResponse$Field.a("startView", 20, FavaDiagnosticsNamespacedTypeEntity.class));
        g.put("totalTimeMs", FastJsonResponse$Field.a("totalTimeMs", 24));
    }

    public FavaDiagnosticsEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return g;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return this.d;
        }
        if (i == 20) {
            return this.e;
        }
        if (i == 24) {
            return Integer.valueOf(this.f);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FavaDiagnosticsEntity)) {
            return false;
        }
        if (this != obj) {
            FavaDiagnosticsEntity favaDiagnosticsEntity = (FavaDiagnosticsEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!favaDiagnosticsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(favaDiagnosticsEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (favaDiagnosticsEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 24) {
            this.f = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
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
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, i, true);
        }
        if (set.contains(20)) {
            ivx.a(parcel, 20, this.e, i, true);
        }
        if (set.contains(24)) {
            ivx.b(parcel, 24, this.f);
        }
        ivx.b(parcel, a2);
    }

    public FavaDiagnosticsEntity(Set set, int i, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity2, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity3, int i2) {
        this.a = set;
        this.b = i;
        this.c = favaDiagnosticsNamespacedTypeEntity;
        this.d = favaDiagnosticsNamespacedTypeEntity2;
        this.e = favaDiagnosticsNamespacedTypeEntity3;
        this.f = i2;
    }

    public FavaDiagnosticsEntity(Set set, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity2, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity3, int i) {
        this.a = set;
        this.b = 1;
        this.c = favaDiagnosticsNamespacedTypeEntity;
        this.d = favaDiagnosticsNamespacedTypeEntity2;
        this.e = favaDiagnosticsNamespacedTypeEntity3;
        this.f = i;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = (FavaDiagnosticsNamespacedTypeEntity) jag;
        } else if (i == 4) {
            this.d = (FavaDiagnosticsNamespacedTypeEntity) jag;
        } else if (i == 20) {
            this.e = (FavaDiagnosticsNamespacedTypeEntity) jag;
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
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
