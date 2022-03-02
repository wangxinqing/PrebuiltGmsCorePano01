package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MomentEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new ywu();
    private static final HashMap h;
    final Set a;
    final int b;
    String c;
    ItemScopeEntity d;
    String e;
    ItemScopeEntity f;
    String g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("id", FastJsonResponse$Field.f("id", 2));
        h.put("result", FastJsonResponse$Field.a("result", 4, ItemScopeEntity.class));
        h.put("startDate", FastJsonResponse$Field.f("startDate", 5));
        h.put("target", FastJsonResponse$Field.a("target", 6, ItemScopeEntity.class));
        h.put("type", FastJsonResponse$Field.f("type", 7));
    }

    public MomentEntity() {
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
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        if (i == 6) {
            return this.f;
        }
        if (i == 7) {
            return this.g;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MomentEntity)) {
            return false;
        }
        if (this != obj) {
            MomentEntity momentEntity = (MomentEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!momentEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(momentEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (momentEntity.a(fastJsonResponse$Field)) {
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
        if (i == 4) {
            this.d = (ItemScopeEntity) jag;
        } else if (i == 6) {
            this.f = (ItemScopeEntity) jag;
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

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, i, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f, i, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g, true);
        }
        ivx.b(parcel, a2);
    }

    public MomentEntity(Set set, int i, String str, ItemScopeEntity itemScopeEntity, String str2, ItemScopeEntity itemScopeEntity2, String str3) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = itemScopeEntity;
        this.e = str2;
        this.f = itemScopeEntity2;
        this.g = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = str2;
        } else if (i == 5) {
            this.e = str2;
        } else if (i == 7) {
            this.g = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
