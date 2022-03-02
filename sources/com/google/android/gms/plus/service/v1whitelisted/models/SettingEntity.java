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
public final class SettingEntity extends FastSafeParcelableJsonResponse implements zib {
    public static final Parcelable.Creator CREATOR = new zic();
    private static final HashMap h;
    final Set a;
    final int b;
    AclEntity c;
    boolean d;
    String e;
    int f;
    String g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("accessValue", FastJsonResponse$Field.a("accessValue", 2, AclEntity.class));
        h.put("booleanValue", FastJsonResponse$Field.e("booleanValue", 3));
        h.put("id", FastJsonResponse$Field.f("id", 5));
        h.put("int32Value", FastJsonResponse$Field.a("int32Value", 6));
        h.put("stringValue", FastJsonResponse$Field.f("stringValue", 9));
    }

    public SettingEntity() {
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
        if (i == 3) {
            return Boolean.valueOf(this.d);
        }
        if (i == 5) {
            return this.e;
        }
        if (i == 6) {
            return Integer.valueOf(this.f);
        }
        if (i == 9) {
            return this.g;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final zej b() {
        return this.c;
    }

    public final boolean c() {
        return this.a.contains(2);
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.a.contains(3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SettingEntity)) {
            return false;
        }
        if (this != obj) {
            SettingEntity settingEntity = (SettingEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!settingEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(settingEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (settingEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String f() {
        return this.e;
    }

    public final int g() {
        return this.f;
    }

    public final boolean h() {
        return this.a.contains(6);
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

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 6) {
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
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, i, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.b(parcel, 6, this.f);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.g, true);
        }
        ivx.b(parcel, a2);
    }

    public SettingEntity(Set set, int i, AclEntity aclEntity, boolean z, String str, int i2, String str2) {
        this.a = set;
        this.b = i;
        this.c = aclEntity;
        this.d = z;
        this.e = str;
        this.f = i2;
        this.g = str2;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = (AclEntity) jag;
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

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.e = str2;
        } else if (i == 9) {
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.d = z;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
