package com.google.android.gms.plus.service.pos;

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
public final class PlusonesEntity extends FastSafeParcelableJsonResponse implements zcr {
    public static final Parcelable.Creator CREATOR = new zct();
    private static final HashMap h;
    public final Set a;
    public final int b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public MetadataEntity g;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class MetadataEntity extends FastSafeParcelableJsonResponse implements zcq {
        public static final Parcelable.Creator CREATOR = new zcu();
        private static final HashMap h;
        public final Set a;
        public final int b;
        public long c;
        public long d;
        public GlobalCountsEntity e;
        public String f;
        public String g;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class GlobalCountsEntity extends FastSafeParcelableJsonResponse implements zcp {
            public static final Parcelable.Creator CREATOR = new zcv();
            private static final HashMap e;
            public final Set a;
            public final int b;
            public double c;
            public List d;

            /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
            public final class PersonEntity extends FastSafeParcelableJsonResponse implements zco {
                public static final Parcelable.Creator CREATOR = new zcw();
                private static final HashMap g;
                public final Set a;
                public final int b;
                public String c;
                public String d;
                public String e;
                public String f;

                static {
                    HashMap hashMap = new HashMap();
                    g = hashMap;
                    hashMap.put("displayName", FastJsonResponse$Field.f("displayName", 2));
                    g.put("id", FastJsonResponse$Field.f("id", 3));
                    g.put("profileUrl", FastJsonResponse$Field.f("profileUrl", 4));
                    g.put("thumbnailUrl", FastJsonResponse$Field.f("thumbnailUrl", 5));
                }

                public PersonEntity() {
                    this.b = 1;
                    this.a = new HashSet();
                }

                public final /* bridge */ /* synthetic */ Map a() {
                    return g;
                }

                /* access modifiers changed from: protected */
                public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        return this.c;
                    }
                    if (i == 3) {
                        return this.d;
                    }
                    if (i == 4) {
                        return this.e;
                    }
                    if (i == 5) {
                        return this.f;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final String b() {
                    return this.c;
                }

                public final String c() {
                    return this.f;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof PersonEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        PersonEntity personEntity = (PersonEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!personEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(personEntity.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (personEntity.a(fastJsonResponse$Field)) {
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
                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        this.c = str2;
                    } else if (i == 3) {
                        this.d = str2;
                    } else if (i == 4) {
                        this.e = str2;
                    } else if (i == 5) {
                        this.f = str2;
                    } else {
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
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
                    if (set.contains(3)) {
                        ivx.a(parcel, 3, this.d, true);
                    }
                    if (set.contains(4)) {
                        ivx.a(parcel, 4, this.e, true);
                    }
                    if (set.contains(5)) {
                        ivx.a(parcel, 5, this.f, true);
                    }
                    ivx.b(parcel, a2);
                }

                public PersonEntity(Set set, int i, String str, String str2, String str3, String str4) {
                    this.a = set;
                    this.b = i;
                    this.c = str;
                    this.d = str2;
                    this.e = str3;
                    this.f = str4;
                }

                /* access modifiers changed from: protected */
                public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                e = hashMap;
                hashMap.put("count", FastJsonResponse$Field.d("count", 2));
                e.put("person", FastJsonResponse$Field.b("person", 3, PersonEntity.class));
            }

            public GlobalCountsEntity() {
                this.b = 1;
                this.a = new HashSet();
            }

            public final /* bridge */ /* synthetic */ Map a() {
                return e;
            }

            public final double b() {
                return this.c;
            }

            public final List c() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof GlobalCountsEntity)) {
                    return false;
                }
                if (this != obj) {
                    GlobalCountsEntity globalCountsEntity = (GlobalCountsEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!globalCountsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(globalCountsEntity.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (globalCountsEntity.a(fastJsonResponse$Field)) {
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
            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d2) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    this.c = d2;
                    this.a.add(Integer.valueOf(i));
                    return;
                }
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a double.");
                throw new IllegalArgumentException(sb.toString());
            }

            /* access modifiers changed from: protected */
            public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    return Double.valueOf(this.c);
                }
                if (i == 3) {
                    return this.d;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a2 = ivx.a(parcel);
                Set set = this.a;
                if (set.contains(1)) {
                    ivx.b(parcel, 1, this.b);
                }
                if (set.contains(2)) {
                    ivx.a(parcel, 2, this.c);
                }
                if (set.contains(3)) {
                    ivx.c(parcel, 3, this.d, true);
                }
                ivx.b(parcel, a2);
            }

            public GlobalCountsEntity(Set set, int i, double d2, List list) {
                this.a = set;
                this.b = i;
                this.c = d2;
                this.d = list;
            }

            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.g;
                if (i == 3) {
                    this.d = arrayList;
                    this.a.add(Integer.valueOf(i));
                    return;
                }
                String canonicalName = arrayList.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not a known array of custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }

            /* access modifiers changed from: protected */
            public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            h = hashMap;
            hashMap.put("adgroupId", FastJsonResponse$Field.b("adgroupId", 2));
            h.put("creativeId", FastJsonResponse$Field.b("creativeId", 3));
            h.put("globalCounts", FastJsonResponse$Field.a("globalCounts", 4, GlobalCountsEntity.class));
            h.put("title", FastJsonResponse$Field.f("title", 5));
            h.put("type", FastJsonResponse$Field.f("type", 6));
        }

        public MetadataEntity() {
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
                return Long.valueOf(this.c);
            }
            if (i == 3) {
                return Long.valueOf(this.d);
            }
            if (i == 4) {
                return this.e;
            }
            if (i == 5) {
                return this.f;
            }
            if (i == 6) {
                return this.g;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final zcp b() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof MetadataEntity)) {
                return false;
            }
            if (this != obj) {
                MetadataEntity metadataEntity = (MetadataEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!metadataEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(metadataEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (metadataEntity.a(fastJsonResponse$Field)) {
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

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = j;
            } else if (i == 3) {
                this.d = j;
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a long.");
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
                ivx.a(parcel, 2, this.c);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.d);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.e, i, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.f, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.g, true);
            }
            ivx.b(parcel, a2);
        }

        public MetadataEntity(Set set, int i, long j, long j2, GlobalCountsEntity globalCountsEntity, String str, String str2) {
            this.a = set;
            this.b = i;
            this.c = j;
            this.d = j2;
            this.e = globalCountsEntity;
            this.f = str;
            this.g = str2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.e = (GlobalCountsEntity) jag;
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
                this.f = str2;
            } else if (i == 6) {
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

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("abtk", FastJsonResponse$Field.f("abtk", 2));
        h.put("aclJson", FastJsonResponse$Field.f("aclJson", 3));
        h.put("id", FastJsonResponse$Field.f("id", 4));
        h.put("isSetByViewer", FastJsonResponse$Field.e("isSetByViewer", 5));
        h.put("metadata", FastJsonResponse$Field.a("metadata", 7, MetadataEntity.class));
    }

    public PlusonesEntity() {
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
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        if (i == 5) {
            return Boolean.valueOf(this.f);
        }
        if (i == 7) {
            return this.g;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean d() {
        return this.a.contains(5);
    }

    public final zcq e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlusonesEntity)) {
            return false;
        }
        if (this != obj) {
            PlusonesEntity plusonesEntity = (PlusonesEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!plusonesEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(plusonesEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (plusonesEntity.a(fastJsonResponse$Field)) {
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
        if (i == 7) {
            this.g = (MetadataEntity) jag;
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
            ivx.a(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g, i, true);
        }
        ivx.b(parcel, a2);
    }

    public PlusonesEntity(Set set, int i, String str, String str2, String str3, boolean z, MetadataEntity metadataEntity) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = metadataEntity;
    }

    public PlusonesEntity(Set set, String str, String str2, boolean z) {
        this.a = set;
        this.b = 1;
        this.c = str;
        this.d = null;
        this.e = str2;
        this.f = z;
        this.g = null;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = str2;
        } else if (i == 3) {
            this.d = str2;
        } else if (i == 4) {
            this.e = str2;
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
        if (i == 5) {
            this.f = z;
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
