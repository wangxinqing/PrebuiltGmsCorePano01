package com.google.android.gms.plus.service.v2whitelisted.models;

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
public final class Mergedpeoplemetadata extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new ziv();
    private static final HashMap n;
    final Set a;
    public List b;
    public String c;
    public String d;
    public String e;
    boolean f;
    public boolean g;
    List h;
    Mergedpeoplefieldacl i;
    public boolean j;
    boolean k;
    String l;
    boolean m;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class EdgeKeyInfo extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new ziw();
        private static final HashMap b = new HashMap();
        final Set a;

        public EdgeKeyInfo() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return b;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof EdgeKeyInfo)) {
                return false;
            }
            if (this != obj) {
                EdgeKeyInfo edgeKeyInfo = (EdgeKeyInfo) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : b.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!edgeKeyInfo.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(edgeKeyInfo.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (edgeKeyInfo.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : b.values()) {
                if (a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public EdgeKeyInfo(Set set) {
            this.a = set;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            ivx.b(parcel, ivx.a(parcel));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        n = hashMap;
        hashMap.put("affinities", FastJsonResponse$Field.b("affinities", 2, Mergedpeopleaffinities.class));
        n.put("container", FastJsonResponse$Field.f("container", 3));
        n.put("containerContactId", FastJsonResponse$Field.f("containerContactId", 4));
        n.put("containerId", FastJsonResponse$Field.f("containerId", 5));
        n.put("container_primary", FastJsonResponse$Field.e("container_primary", 6));
        n.put("edgeKey", FastJsonResponse$Field.e("edgeKey", 7));
        n.put("edgeKeyInfo", FastJsonResponse$Field.b("edgeKeyInfo", 8, EdgeKeyInfo.class));
        n.put("fieldAcl", FastJsonResponse$Field.a("fieldAcl", 9, Mergedpeoplefieldacl.class));
        n.put("primary", FastJsonResponse$Field.e("primary", 10));
        n.put("verified", FastJsonResponse$Field.e("verified", 11));
        n.put("visibility", FastJsonResponse$Field.f("visibility", 12));
        n.put("writeable", FastJsonResponse$Field.e("writeable", 13));
    }

    public Mergedpeoplemetadata() {
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
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return Boolean.valueOf(this.f);
            case 7:
                return Boolean.valueOf(this.g);
            case 8:
                return this.h;
            case 9:
                return this.i;
            case 10:
                return Boolean.valueOf(this.j);
            case 11:
                return Boolean.valueOf(this.k);
            case 12:
                return this.l;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return Boolean.valueOf(this.m);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Mergedpeoplemetadata)) {
            return false;
        }
        if (this != obj) {
            Mergedpeoplemetadata mergedpeoplemetadata = (Mergedpeoplemetadata) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : n.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!mergedpeoplemetadata.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(mergedpeoplemetadata.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (mergedpeoplemetadata.a(fastJsonResponse$Field)) {
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

    public Mergedpeoplemetadata(Set set, List list, String str, String str2, String str3, boolean z, boolean z2, List list2, Mergedpeoplefieldacl mergedpeoplefieldacl, boolean z3, boolean z4, String str4, boolean z5) {
        this.a = set;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = list2;
        this.i = mergedpeoplefieldacl;
        this.j = z3;
        this.k = z4;
        this.l = str4;
        this.m = z5;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 9) {
            this.i = (Mergedpeoplefieldacl) jag;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        String canonicalName = jag.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not a known custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.c(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g);
        }
        if (set.contains(8)) {
            ivx.c(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i, i2, true);
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
        if (set.contains(13)) {
            ivx.a(parcel, 13, this.m);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = str2;
        } else if (i2 == 4) {
            this.d = str2;
        } else if (i2 == 5) {
            this.e = str2;
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

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = arrayList;
        } else if (i2 == 8) {
            this.h = arrayList;
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 6) {
            this.f = z;
        } else if (i2 == 7) {
            this.g = z;
        } else if (i2 == 10) {
            this.j = z;
        } else if (i2 == 11) {
            this.k = z;
        } else if (i2 == 13) {
            this.m = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
