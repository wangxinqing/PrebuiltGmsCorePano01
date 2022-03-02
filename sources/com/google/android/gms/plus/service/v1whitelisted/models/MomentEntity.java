package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MomentEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, zhg {
    public static final Parcelable.Creator CREATOR = new zhh();
    private static final HashMap j;
    final Set a;
    final int b;
    AclEntity c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public ItemScope i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("access", FastJsonResponse$Field.a("access", 2, AclEntity.class));
        j.put("applicationId", FastJsonResponse$Field.f("applicationId", 3));
        j.put("confirmDeleteText", FastJsonResponse$Field.f("confirmDeleteText", 4));
        j.put("description", FastJsonResponse$Field.f("description", 5));
        j.put("id", FastJsonResponse$Field.f("id", 6));
        j.put("startDate", FastJsonResponse$Field.f("startDate", 10));
        j.put("target", FastJsonResponse$Field.a("target", 11, ItemScope.class));
    }

    public MomentEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return j;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 3) {
            return this.d;
        }
        if (i2 == 4) {
            return this.e;
        }
        if (i2 == 5) {
            return this.f;
        }
        if (i2 == 6) {
            return this.g;
        }
        if (i2 == 10) {
            return this.h;
        }
        if (i2 == 11) {
            return this.i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public final zej b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MomentEntity)) {
            return false;
        }
        if (this != obj) {
            MomentEntity momentEntity = (MomentEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : j.values()) {
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

    public final String f() {
        return this.h;
    }

    public final boolean g() {
        return this.a.contains(10);
    }

    public final ItemScope h() {
        return this.i;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : j.values()) {
            if (a(fastJsonResponse$Field)) {
                i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i2;
    }

    public final boolean i() {
        return this.a.contains(4);
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = (AclEntity) jag;
        } else if (i2 == 11) {
            this.i = (ItemScope) jag;
        } else {
            String canonicalName = jag.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, i2, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.g, true);
        }
        if (set.contains(10)) {
            ivx.a(parcel, 10, this.h, true);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.i, i2, true);
        }
        ivx.b(parcel, a2);
    }

    public MomentEntity(Set set, int i2, AclEntity aclEntity, String str, String str2, String str3, String str4, String str5, ItemScope itemScope) {
        this.a = set;
        this.b = i2;
        this.c = aclEntity;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = itemScope;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.d = str2;
        } else if (i2 == 4) {
            this.e = str2;
        } else if (i2 == 5) {
            this.f = str2;
        } else if (i2 == 6) {
            this.g = str2;
        } else if (i2 == 10) {
            this.h = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
