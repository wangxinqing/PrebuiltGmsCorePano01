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
public final class AclEntity extends FastSafeParcelableJsonResponse implements zej {
    public static final Parcelable.Creator CREATOR = new zen();
    private static final HashMap m;
    final Set a;
    final int b;
    public String c;
    public String d;
    boolean e;
    String f;
    public List g;
    boolean h;
    boolean i;
    public boolean j;
    public boolean k;
    public String l;

    static {
        HashMap hashMap = new HashMap();
        m = hashMap;
        hashMap.put("accessSummary", FastJsonResponse$Field.f("accessSummary", 2));
        m.put("description", FastJsonResponse$Field.f("description", 3));
        m.put("domainRestricted", FastJsonResponse$Field.e("domainRestricted", 4));
        m.put("etag", FastJsonResponse$Field.f("etag", 5));
        m.put("items", FastJsonResponse$Field.b("items", 6, PlusAclentryResourceEntity.class));
        m.put("readOnly", FastJsonResponse$Field.e("readOnly", 8));
        m.put("restricted", FastJsonResponse$Field.e("restricted", 9));
        m.put("showCircles", FastJsonResponse$Field.e("showCircles", 10));
        m.put("showContacts", FastJsonResponse$Field.e("showContacts", 11));
        m.put("title", FastJsonResponse$Field.f("title", 12));
    }

    public AclEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return m;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.c;
            case 3:
                return this.d;
            case 4:
                return Boolean.valueOf(this.e);
            case 5:
                return this.f;
            case 6:
                return this.g;
            case 8:
                return Boolean.valueOf(this.h);
            case 9:
                return Boolean.valueOf(this.i);
            case 10:
                return Boolean.valueOf(this.j);
            case 11:
                return Boolean.valueOf(this.k);
            case 12:
                return this.l;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final String b() {
        return this.d;
    }

    public final boolean c() {
        return this.a.contains(4);
    }

    public final List d() {
        return this.g;
    }

    public final boolean e() {
        return this.a.contains(6);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AclEntity)) {
            return false;
        }
        if (this != obj) {
            AclEntity aclEntity = (AclEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : m.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!aclEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(aclEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (aclEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return this.a.contains(8);
    }

    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : m.values()) {
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = str2;
        } else if (i2 == 3) {
            this.d = str2;
        } else if (i2 == 5) {
            this.f = str2;
        } else if (i2 == 12) {
            this.l = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a String.");
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
            ivx.a(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f, true);
        }
        if (set.contains(6)) {
            ivx.c(parcel, 6, this.g, true);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.h);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            ivx.a(parcel, 10, this.j);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.k);
        }
        if (set.contains(12)) {
            ivx.a(parcel, 12, this.l, true);
        }
        ivx.b(parcel, a2);
    }

    public AclEntity(Set set, int i2, String str, String str2, boolean z, String str3, List list, boolean z2, boolean z3, boolean z4, boolean z5, String str4) {
        this.a = set;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = list;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = str4;
    }

    public AclEntity(Set set, boolean z, List list, boolean z2, boolean z3) {
        this.a = set;
        this.b = 1;
        this.c = null;
        this.d = null;
        this.e = z;
        this.f = null;
        this.g = list;
        this.h = false;
        this.i = false;
        this.j = z2;
        this.k = z3;
        this.l = null;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 6) {
            this.g = arrayList;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 4) {
            switch (i2) {
                case 8:
                    this.h = z;
                    break;
                case 9:
                    this.i = z;
                    break;
                case 10:
                    this.j = z;
                    break;
                case 11:
                    this.k = z;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(55);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be a boolean.");
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.e = z;
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
