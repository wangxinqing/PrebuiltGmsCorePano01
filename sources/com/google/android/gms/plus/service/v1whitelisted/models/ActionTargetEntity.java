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
public final class ActionTargetEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, zep {
    public static final Parcelable.Creator CREATOR = new zeq();
    private static final HashMap j;
    final Set a;
    final int b;
    AclDetailsEntity c;
    String d;
    int e;
    List f;
    LoggedProfileEntity g;
    String h;
    List i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("aclDetails", FastJsonResponse$Field.a("aclDetails", 2, AclDetailsEntity.class));
        j.put("activityId", FastJsonResponse$Field.f("activityId", 5));
        j.put("alphabeticalAclListCount", FastJsonResponse$Field.a("alphabeticalAclListCount", 6));
        j.put("gaiaId", FastJsonResponse$Field.g("gaiaId", 25));
        j.put("profile", FastJsonResponse$Field.a("profile", 61, LoggedProfileEntity.class));
        j.put("profileData", FastJsonResponse$Field.f("profileData", 62));
        j.put("targetType", FastJsonResponse$Field.g("targetType", 89));
    }

    public ActionTargetEntity() {
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
        if (i2 == 25) {
            return this.f;
        }
        if (i2 == 89) {
            return this.i;
        }
        if (i2 == 5) {
            return this.d;
        }
        if (i2 == 6) {
            return Integer.valueOf(this.e);
        }
        if (i2 == 61) {
            return this.g;
        }
        if (i2 == 62) {
            return this.h;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActionTargetEntity)) {
            return false;
        }
        if (this != obj) {
            ActionTargetEntity actionTargetEntity = (ActionTargetEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : j.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!actionTargetEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(actionTargetEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (actionTargetEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
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

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 6) {
            this.e = i2;
            this.a.add(Integer.valueOf(i3));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i3);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
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
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.d, true);
        }
        if (set.contains(6)) {
            ivx.b(parcel, 6, this.e);
        }
        if (set.contains(25)) {
            ivx.b(parcel, 25, this.f, true);
        }
        if (set.contains(61)) {
            ivx.a(parcel, 61, this.g, i2, true);
        }
        if (set.contains(62)) {
            ivx.a(parcel, 62, this.h, true);
        }
        if (set.contains(89)) {
            ivx.b(parcel, 89, this.i, true);
        }
        ivx.b(parcel, a2);
    }

    public ActionTargetEntity(Set set, int i2, AclDetailsEntity aclDetailsEntity, String str, int i3, List list, LoggedProfileEntity loggedProfileEntity, String str2, List list2) {
        this.a = set;
        this.b = i2;
        this.c = aclDetailsEntity;
        this.d = str;
        this.e = i3;
        this.f = list;
        this.g = loggedProfileEntity;
        this.h = str2;
        this.i = list2;
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 25) {
            this.f = arrayList;
        } else if (i2 == 89) {
            this.i = arrayList;
        } else {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an array of String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public ActionTargetEntity(Set set, AclDetailsEntity aclDetailsEntity, String str, int i2, String str2) {
        this.a = set;
        this.b = 1;
        this.c = aclDetailsEntity;
        this.d = str;
        this.e = i2;
        this.f = null;
        this.g = null;
        this.h = str2;
        this.i = null;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = (AclDetailsEntity) jag;
        } else if (i2 == 61) {
            this.g = (LoggedProfileEntity) jag;
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

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.d = str2;
        } else if (i2 == 62) {
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
