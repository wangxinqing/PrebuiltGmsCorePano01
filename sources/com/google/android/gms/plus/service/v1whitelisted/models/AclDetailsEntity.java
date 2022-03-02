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
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AclDetailsEntity extends FastSafeParcelableJsonResponse implements zel {
    public static final Parcelable.Creator CREATOR = new zem();
    private static final HashMap n;
    final Set a;
    final int b;
    List c;
    List d;
    int e;
    int f;
    float g;
    int h;
    float i;
    int j;
    float k;
    int l;
    int m;

    static {
        HashMap hashMap = new HashMap();
        n = hashMap;
        hashMap.put("circle", FastJsonResponse$Field.b("circle", 2, LoggedCircleEntity.class));
        n.put("person", FastJsonResponse$Field.b("person", 4, LoggedCircleMemberEntity.class));
        n.put("personCount", FastJsonResponse$Field.a("personCount", 5));
        n.put("selectedAlphabeticalIndividualCount", FastJsonResponse$Field.a("selectedAlphabeticalIndividualCount", 6));
        n.put("selectedAlphabeticalIndividualCtr", FastJsonResponse$Field.c("selectedAlphabeticalIndividualCtr", 7));
        n.put("selectedAvatarCount", FastJsonResponse$Field.a("selectedAvatarCount", 8));
        n.put("selectedAvatarCtr", FastJsonResponse$Field.c("selectedAvatarCtr", 9));
        n.put("selectedRankedIndividualCount", FastJsonResponse$Field.a("selectedRankedIndividualCount", 10));
        n.put("selectedRankedIndividualCtr", FastJsonResponse$Field.c("selectedRankedIndividualCtr", 11));
        n.put("totalAvatarCount", FastJsonResponse$Field.a("totalAvatarCount", 13));
        n.put("totalRankedIndividualCount", FastJsonResponse$Field.a("totalRankedIndividualCount", 14));
    }

    public AclDetailsEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return n;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return Integer.valueOf(this.e);
            case 6:
                return Integer.valueOf(this.f);
            case 7:
                return Float.valueOf(this.g);
            case 8:
                return Integer.valueOf(this.h);
            case 9:
                return Float.valueOf(this.i);
            case 10:
                return Integer.valueOf(this.j);
            case 11:
                return Float.valueOf(this.k);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return Integer.valueOf(this.l);
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return Integer.valueOf(this.m);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AclDetailsEntity)) {
            return false;
        }
        if (this != obj) {
            AclDetailsEntity aclDetailsEntity = (AclDetailsEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : n.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!aclDetailsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(aclDetailsEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (aclDetailsEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : n.values()) {
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, float f2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 7) {
            this.g = f2;
        } else if (i2 == 9) {
            this.i = f2;
        } else if (i2 == 11) {
            this.k = f2;
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a float.");
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
            ivx.c(parcel, 2, this.c, true);
        }
        if (set.contains(4)) {
            ivx.c(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            ivx.b(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            ivx.b(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g);
        }
        if (set.contains(8)) {
            ivx.b(parcel, 8, this.h);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            ivx.b(parcel, 10, this.j);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.k);
        }
        if (set.contains(13)) {
            ivx.b(parcel, 13, this.l);
        }
        if (set.contains(14)) {
            ivx.b(parcel, 14, this.m);
        }
        ivx.b(parcel, a2);
    }

    public AclDetailsEntity(Set set, int i2, int i3, float f2, int i4, float f3, int i5, float f4, int i6, int i7) {
        this.a = set;
        this.b = 1;
        this.c = null;
        this.d = null;
        this.e = i2;
        this.f = i3;
        this.g = f2;
        this.h = i4;
        this.i = f3;
        this.j = i5;
        this.k = f4;
        this.l = i6;
        this.m = i7;
    }

    public AclDetailsEntity(Set set, int i2, List list, List list2, int i3, int i4, float f2, int i5, float f3, int i6, float f4, int i7, int i8) {
        this.a = set;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = i3;
        this.f = i4;
        this.g = f2;
        this.h = i5;
        this.i = f3;
        this.j = i6;
        this.k = f4;
        this.l = i7;
        this.m = i8;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 5) {
            this.e = i2;
        } else if (i3 == 6) {
            this.f = i2;
        } else if (i3 == 8) {
            this.h = i2;
        } else if (i3 == 10) {
            this.j = i2;
        } else if (i3 == 13) {
            this.l = i2;
        } else if (i3 == 14) {
            this.m = i2;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i3);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i3));
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = arrayList;
        } else if (i2 == 4) {
            this.d = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
