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
public final class FavaDiagnosticsNamespacedTypeEntity extends FastSafeParcelableJsonResponse implements zgz {
    public static final Parcelable.Creator CREATOR = new zha();
    private static final HashMap e;
    final Set a;
    final int b;
    String c;
    int d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("namespace", FastJsonResponse$Field.f("namespace", 2));
        e.put("typeNum", FastJsonResponse$Field.a("typeNum", 3));
    }

    public FavaDiagnosticsNamespacedTypeEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return e;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return Integer.valueOf(this.d);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FavaDiagnosticsNamespacedTypeEntity)) {
            return false;
        }
        if (this != obj) {
            FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity = (FavaDiagnosticsNamespacedTypeEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!favaDiagnosticsNamespacedTypeEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(favaDiagnosticsNamespacedTypeEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (favaDiagnosticsNamespacedTypeEntity.a(fastJsonResponse$Field)) {
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

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.d = i;
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
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.d);
        }
        ivx.b(parcel, a2);
    }

    public FavaDiagnosticsNamespacedTypeEntity(Set set, int i, String str, int i2) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    public FavaDiagnosticsNamespacedTypeEntity(Set set, String str, int i) {
        this.a = set;
        this.b = 1;
        this.c = str;
        this.d = i;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
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

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
