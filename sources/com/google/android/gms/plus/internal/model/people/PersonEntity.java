package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.common.server.converter.StringToIntConverter;
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
public final class PersonEntity extends FastSafeParcelableJsonResponse implements yxl {
    private static final HashMap A;
    public static final Parcelable.Creator CREATOR = new ywv();
    final Set a;
    final int b;
    String c;
    AgeRangeEntity d;
    String e;
    String f;
    int g;
    CoverEntity h;
    String i;
    String j;
    int k;
    String l;
    ImageEntity m;
    boolean n;
    String o;
    NameEntity p;
    String q;
    int r;
    List s;
    List t;
    int u;
    int v;
    String w;
    String x;
    List y;
    boolean z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class AgeRangeEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new yww();
        private static final HashMap e;
        final Set a;
        final int b;
        int c;
        int d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("max", FastJsonResponse$Field.a("max", 2));
            e.put("min", FastJsonResponse$Field.a("min", 3));
        }

        public AgeRangeEntity() {
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
                return Integer.valueOf(this.c);
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
            if (!(obj instanceof AgeRangeEntity)) {
                return false;
            }
            if (this != obj) {
                AgeRangeEntity ageRangeEntity = (AgeRangeEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!ageRangeEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(ageRangeEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (ageRangeEntity.a(fastJsonResponse$Field)) {
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
            if (i2 == 2) {
                this.c = i;
            } else if (i2 == 3) {
                this.d = i;
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Field with id=");
                sb.append(i2);
                sb.append(" is not known to be an int.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.add(Integer.valueOf(i2));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            if (set.contains(2)) {
                ivx.b(parcel, 2, this.c);
            }
            if (set.contains(3)) {
                ivx.b(parcel, 3, this.d);
            }
            ivx.b(parcel, a2);
        }

        public AgeRangeEntity(Set set, int i, int i2, int i3) {
            this.a = set;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class CoverEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new ywx();
        private static final HashMap f;
        final Set a;
        final int b;
        CoverInfoEntity c;
        CoverPhotoEntity d;
        int e;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class CoverInfoEntity extends FastSafeParcelableJsonResponse implements ilq {
            public static final Parcelable.Creator CREATOR = new ywy();
            private static final HashMap e;
            final Set a;
            final int b;
            int c;
            int d;

            static {
                HashMap hashMap = new HashMap();
                e = hashMap;
                hashMap.put("leftImageOffset", FastJsonResponse$Field.a("leftImageOffset", 2));
                e.put("topImageOffset", FastJsonResponse$Field.a("topImageOffset", 3));
            }

            public CoverInfoEntity() {
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
                    return Integer.valueOf(this.c);
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
                if (!(obj instanceof CoverInfoEntity)) {
                    return false;
                }
                if (this != obj) {
                    CoverInfoEntity coverInfoEntity = (CoverInfoEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!coverInfoEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(coverInfoEntity.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (coverInfoEntity.a(fastJsonResponse$Field)) {
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
                if (i2 == 2) {
                    this.c = i;
                } else if (i2 == 3) {
                    this.d = i;
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be an int.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.a.add(Integer.valueOf(i2));
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a2 = ivx.a(parcel);
                Set set = this.a;
                if (set.contains(1)) {
                    ivx.b(parcel, 1, this.b);
                }
                if (set.contains(2)) {
                    ivx.b(parcel, 2, this.c);
                }
                if (set.contains(3)) {
                    ivx.b(parcel, 3, this.d);
                }
                ivx.b(parcel, a2);
            }

            public CoverInfoEntity(Set set, int i, int i2, int i3) {
                this.a = set;
                this.b = i;
                this.c = i2;
                this.d = i3;
            }

            /* access modifiers changed from: protected */
            public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }
        }

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class CoverPhotoEntity extends FastSafeParcelableJsonResponse implements ilq {
            public static final Parcelable.Creator CREATOR = new ywz();
            private static final HashMap f;
            final Set a;
            final int b;
            int c;
            String d;
            int e;

            static {
                HashMap hashMap = new HashMap();
                f = hashMap;
                hashMap.put("height", FastJsonResponse$Field.a("height", 2));
                f.put("url", FastJsonResponse$Field.f("url", 3));
                f.put("width", FastJsonResponse$Field.a("width", 4));
            }

            public CoverPhotoEntity() {
                this.b = 1;
                this.a = new HashSet();
            }

            public final /* bridge */ /* synthetic */ Map a() {
                return f;
            }

            /* access modifiers changed from: protected */
            public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    return Integer.valueOf(this.c);
                }
                if (i == 3) {
                    return this.d;
                }
                if (i == 4) {
                    return Integer.valueOf(this.e);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof CoverPhotoEntity)) {
                    return false;
                }
                if (this != obj) {
                    CoverPhotoEntity coverPhotoEntity = (CoverPhotoEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!coverPhotoEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(coverPhotoEntity.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (coverPhotoEntity.a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
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
                if (i2 == 2) {
                    this.c = i;
                } else if (i2 == 4) {
                    this.e = i;
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be an int.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.a.add(Integer.valueOf(i2));
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a2 = ivx.a(parcel);
                Set set = this.a;
                if (set.contains(1)) {
                    ivx.b(parcel, 1, this.b);
                }
                if (set.contains(2)) {
                    ivx.b(parcel, 2, this.c);
                }
                if (set.contains(3)) {
                    ivx.a(parcel, 3, this.d, true);
                }
                if (set.contains(4)) {
                    ivx.b(parcel, 4, this.e);
                }
                ivx.b(parcel, a2);
            }

            public CoverPhotoEntity(Set set, int i, int i2, String str, int i3) {
                this.a = set;
                this.b = i;
                this.c = i2;
                this.d = str;
                this.e = i3;
            }

            /* access modifiers changed from: protected */
            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                int i = fastJsonResponse$Field.g;
                if (i == 3) {
                    this.d = str2;
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

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("coverInfo", FastJsonResponse$Field.a("coverInfo", 2, CoverInfoEntity.class));
            f.put("coverPhoto", FastJsonResponse$Field.a("coverPhoto", 3, CoverPhotoEntity.class));
            HashMap hashMap2 = f;
            StringToIntConverter stringToIntConverter = new StringToIntConverter();
            stringToIntConverter.a("banner", 0);
            hashMap2.put("layout", FastJsonResponse$Field.a("layout", 4, stringToIntConverter));
        }

        public CoverEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
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
                return Integer.valueOf(this.e);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CoverEntity)) {
                return false;
            }
            if (this != obj) {
                CoverEntity coverEntity = (CoverEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!coverEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(coverEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (coverEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
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
            if (i2 == 4) {
                this.e = i;
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
                ivx.a(parcel, 3, this.d, i, true);
            }
            if (set.contains(4)) {
                ivx.b(parcel, 4, this.e);
            }
            ivx.b(parcel, a2);
        }

        public CoverEntity(Set set, int i, CoverInfoEntity coverInfoEntity, CoverPhotoEntity coverPhotoEntity, int i2) {
            this.a = set;
            this.b = i;
            this.c = coverInfoEntity;
            this.d = coverPhotoEntity;
            this.e = i2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = (CoverInfoEntity) jag;
            } else if (i == 3) {
                this.d = (CoverPhotoEntity) jag;
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ImageEntity extends FastSafeParcelableJsonResponse implements yxk {
        public static final Parcelable.Creator CREATOR = new yxa();
        private static final HashMap d;
        final Set a;
        final int b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("url", FastJsonResponse$Field.f("url", 2));
        }

        public ImageEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return d;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final String b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ImageEntity)) {
                return false;
            }
            if (this != obj) {
                ImageEntity imageEntity = (ImageEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!imageEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(imageEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (imageEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
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
                this.a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
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
            ivx.b(parcel, a2);
        }

        public ImageEntity(String str) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = 1;
            this.c = str;
            hashSet.add(2);
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        public ImageEntity(Set set, int i, String str) {
            this.a = set;
            this.b = i;
            this.c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class NameEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new yxb();
        private static final HashMap i;
        final Set a;
        final int b;
        String c;
        String d;
        String e;
        String f;
        String g;
        String h;

        static {
            HashMap hashMap = new HashMap();
            i = hashMap;
            hashMap.put("familyName", FastJsonResponse$Field.f("familyName", 2));
            i.put("formatted", FastJsonResponse$Field.f("formatted", 3));
            i.put("givenName", FastJsonResponse$Field.f("givenName", 4));
            i.put("honorificPrefix", FastJsonResponse$Field.f("honorificPrefix", 5));
            i.put("honorificSuffix", FastJsonResponse$Field.f("honorificSuffix", 6));
            i.put("middleName", FastJsonResponse$Field.f("middleName", 7));
        }

        public NameEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return i;
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
                    return this.e;
                case 5:
                    return this.f;
                case 6:
                    return this.g;
                case 7:
                    return this.h;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof NameEntity)) {
                return false;
            }
            if (this != obj) {
                NameEntity nameEntity = (NameEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : i.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!nameEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(nameEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (nameEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i2 = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : i.values()) {
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
            switch (i2) {
                case 2:
                    this.c = str2;
                    break;
                case 3:
                    this.d = str2;
                    break;
                case 4:
                    this.e = str2;
                    break;
                case 5:
                    this.f = str2;
                    break;
                case 6:
                    this.g = str2;
                    break;
                case 7:
                    this.h = str2;
                    break;
                default:
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
                ivx.a(parcel, 4, this.e, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.f, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.g, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.h, true);
            }
            ivx.b(parcel, a2);
        }

        public NameEntity(Set set, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = set;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class OrganizationsEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new yxc();
        private static final HashMap l;
        final Set a;
        final int b;
        String c;
        String d;
        String e;
        String f;
        String g;
        boolean h;
        String i;
        String j;
        int k;

        static {
            HashMap hashMap = new HashMap();
            l = hashMap;
            hashMap.put("department", FastJsonResponse$Field.f("department", 2));
            l.put("description", FastJsonResponse$Field.f("description", 3));
            l.put("endDate", FastJsonResponse$Field.f("endDate", 4));
            l.put("location", FastJsonResponse$Field.f("location", 5));
            l.put("name", FastJsonResponse$Field.f("name", 6));
            l.put("primary", FastJsonResponse$Field.e("primary", 7));
            l.put("startDate", FastJsonResponse$Field.f("startDate", 8));
            l.put("title", FastJsonResponse$Field.f("title", 9));
            HashMap hashMap2 = l;
            StringToIntConverter stringToIntConverter = new StringToIntConverter();
            stringToIntConverter.a("work", 0);
            stringToIntConverter.a("school", 1);
            hashMap2.put("type", FastJsonResponse$Field.a("type", 10, stringToIntConverter));
        }

        public OrganizationsEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return l;
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
                    return this.e;
                case 5:
                    return this.f;
                case 6:
                    return this.g;
                case 7:
                    return Boolean.valueOf(this.h);
                case 8:
                    return this.i;
                case 9:
                    return this.j;
                case 10:
                    return Integer.valueOf(this.k);
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OrganizationsEntity)) {
                return false;
            }
            if (this != obj) {
                OrganizationsEntity organizationsEntity = (OrganizationsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!organizationsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(organizationsEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (organizationsEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i2 = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
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
            if (i3 == 10) {
                this.k = i2;
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
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.g, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.h);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.i, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.j, true);
            }
            if (set.contains(10)) {
                ivx.b(parcel, 10, this.k);
            }
            ivx.b(parcel, a2);
        }

        public OrganizationsEntity(Set set, int i2, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i3) {
            this.a = set;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = z;
            this.i = str6;
            this.j = str7;
            this.k = i3;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i2 = fastJsonResponse$Field.g;
            switch (i2) {
                case 2:
                    this.c = str2;
                    break;
                case 3:
                    this.d = str2;
                    break;
                case 4:
                    this.e = str2;
                    break;
                case 5:
                    this.f = str2;
                    break;
                case 6:
                    this.g = str2;
                    break;
                case 8:
                    this.i = str2;
                    break;
                case 9:
                    this.j = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
            this.a.add(Integer.valueOf(i2));
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 7) {
                this.h = z;
                this.a.add(Integer.valueOf(i2));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class PlacesLivedEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new yxd();
        private static final HashMap e;
        final Set a;
        final int b;
        boolean c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("primary", FastJsonResponse$Field.e("primary", 2));
            e.put("value", FastJsonResponse$Field.f("value", 3));
        }

        public PlacesLivedEntity() {
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
                return Boolean.valueOf(this.c);
            }
            if (i == 3) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PlacesLivedEntity)) {
                return false;
            }
            if (this != obj) {
                PlacesLivedEntity placesLivedEntity = (PlacesLivedEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!placesLivedEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(placesLivedEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (placesLivedEntity.a(fastJsonResponse$Field)) {
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
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.d = str2;
                this.a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
                ivx.a(parcel, 3, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public PlacesLivedEntity(Set set, int i, boolean z, String str) {
            this.a = set;
            this.b = i;
            this.c = z;
            this.d = str;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = z;
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class UrlsEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new yxe();
        private static final HashMap f;
        final Set a;
        final int b;
        String c;
        int d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("label", FastJsonResponse$Field.f("label", 5));
            HashMap hashMap2 = f;
            StringToIntConverter stringToIntConverter = new StringToIntConverter();
            stringToIntConverter.a("home", 0);
            stringToIntConverter.a("work", 1);
            stringToIntConverter.a("blog", 2);
            stringToIntConverter.a("profile", 3);
            stringToIntConverter.a("other", 4);
            stringToIntConverter.a("otherProfile", 5);
            stringToIntConverter.a("contributor", 6);
            stringToIntConverter.a("website", 7);
            hashMap2.put("type", FastJsonResponse$Field.a("type", 6, stringToIntConverter));
            f.put("value", FastJsonResponse$Field.f("value", 4));
        }

        public UrlsEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                return this.e;
            }
            if (i == 5) {
                return this.c;
            }
            if (i == 6) {
                return Integer.valueOf(this.d);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UrlsEntity)) {
                return false;
            }
            if (this != obj) {
                UrlsEntity urlsEntity = (UrlsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!urlsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(urlsEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (urlsEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
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
            if (set.contains(3)) {
                ivx.b(parcel, 3, 4);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.e, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.c, true);
            }
            if (set.contains(6)) {
                ivx.b(parcel, 6, this.d);
            }
            ivx.b(parcel, a2);
        }

        public UrlsEntity(Set set, int i, String str, int i2, String str2) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = i2;
            this.e = str2;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.e = str2;
            } else if (i == 5) {
                this.c = str2;
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
        A = hashMap;
        hashMap.put("aboutMe", FastJsonResponse$Field.f("aboutMe", 2));
        A.put("ageRange", FastJsonResponse$Field.a("ageRange", 3, AgeRangeEntity.class));
        A.put("birthday", FastJsonResponse$Field.f("birthday", 4));
        A.put("braggingRights", FastJsonResponse$Field.f("braggingRights", 5));
        A.put("circledByCount", FastJsonResponse$Field.a("circledByCount", 6));
        A.put("cover", FastJsonResponse$Field.a("cover", 7, CoverEntity.class));
        A.put("currentLocation", FastJsonResponse$Field.f("currentLocation", 8));
        A.put("displayName", FastJsonResponse$Field.f("displayName", 9));
        HashMap hashMap2 = A;
        StringToIntConverter stringToIntConverter = new StringToIntConverter();
        stringToIntConverter.a("male", 0);
        stringToIntConverter.a("female", 1);
        stringToIntConverter.a("other", 2);
        hashMap2.put("gender", FastJsonResponse$Field.a("gender", 12, stringToIntConverter));
        A.put("id", FastJsonResponse$Field.f("id", 14));
        A.put("image", FastJsonResponse$Field.a("image", 15, ImageEntity.class));
        A.put("isPlusUser", FastJsonResponse$Field.e("isPlusUser", 16));
        A.put("language", FastJsonResponse$Field.f("language", 18));
        A.put("name", FastJsonResponse$Field.a("name", 19, NameEntity.class));
        A.put("nickname", FastJsonResponse$Field.f("nickname", 20));
        HashMap hashMap3 = A;
        StringToIntConverter stringToIntConverter2 = new StringToIntConverter();
        stringToIntConverter2.a("person", 0);
        stringToIntConverter2.a("page", 1);
        hashMap3.put("objectType", FastJsonResponse$Field.a("objectType", 21, stringToIntConverter2));
        A.put("organizations", FastJsonResponse$Field.b("organizations", 22, OrganizationsEntity.class));
        A.put("placesLived", FastJsonResponse$Field.b("placesLived", 23, PlacesLivedEntity.class));
        A.put("plusOneCount", FastJsonResponse$Field.a("plusOneCount", 24));
        HashMap hashMap4 = A;
        StringToIntConverter stringToIntConverter3 = new StringToIntConverter();
        stringToIntConverter3.a("single", 0);
        stringToIntConverter3.a("in_a_relationship", 1);
        stringToIntConverter3.a("engaged", 2);
        stringToIntConverter3.a("married", 3);
        stringToIntConverter3.a("its_complicated", 4);
        stringToIntConverter3.a("open_relationship", 5);
        stringToIntConverter3.a("widowed", 6);
        stringToIntConverter3.a("in_domestic_partnership", 7);
        stringToIntConverter3.a("in_civil_union", 8);
        hashMap4.put("relationshipStatus", FastJsonResponse$Field.a("relationshipStatus", 25, stringToIntConverter3));
        A.put("tagline", FastJsonResponse$Field.f("tagline", 26));
        A.put("url", FastJsonResponse$Field.f("url", 27));
        A.put("urls", FastJsonResponse$Field.b("urls", 28, UrlsEntity.class));
        A.put("verified", FastJsonResponse$Field.e("verified", 29));
    }

    public PersonEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public static void c(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        PersonEntity personEntity = (PersonEntity) CREATOR.createFromParcel(obtain);
        obtain.recycle();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return A;
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
                return this.e;
            case 5:
                return this.f;
            case 6:
                return Integer.valueOf(this.g);
            case 7:
                return this.h;
            case 8:
                return this.i;
            case 9:
                return this.j;
            case 12:
                return Integer.valueOf(this.k);
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return this.l;
            case Service.START_CONTINUATION_MASK:
                return this.m;
            case 16:
                return Boolean.valueOf(this.n);
            case 18:
                return this.o;
            case 19:
                return this.p;
            case 20:
                return this.q;
            case 21:
                return Integer.valueOf(this.r);
            case 22:
                return this.s;
            case 23:
                return this.t;
            case 24:
                return Integer.valueOf(this.u);
            case 25:
                return Integer.valueOf(this.v);
            case 26:
                return this.w;
            case 27:
                return this.x;
            case 28:
                return this.y;
            case 29:
                return Boolean.valueOf(this.z);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final String b() {
        return this.j;
    }

    public final String c() {
        return this.l;
    }

    public final yxk d() {
        return this.m;
    }

    public final int e() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity)) {
            return false;
        }
        if (this != obj) {
            PersonEntity personEntity = (PersonEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : A.values()) {
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

    public final String f() {
        return this.x;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : A.values()) {
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
            this.g = i2;
        } else if (i3 == 12) {
            this.k = i2;
        } else if (i3 == 21) {
            this.r = i2;
        } else if (i3 == 24) {
            this.u = i2;
        } else if (i3 == 25) {
            this.v = i2;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i3);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i3));
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
            ivx.a(parcel, 3, this.d, i2, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f, true);
        }
        if (set.contains(6)) {
            ivx.b(parcel, 6, this.g);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.h, i2, true);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.i, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.j, true);
        }
        if (set.contains(12)) {
            ivx.b(parcel, 12, this.k);
        }
        if (set.contains(14)) {
            ivx.a(parcel, 14, this.l, true);
        }
        if (set.contains(15)) {
            ivx.a(parcel, 15, this.m, i2, true);
        }
        if (set.contains(16)) {
            ivx.a(parcel, 16, this.n);
        }
        if (set.contains(18)) {
            ivx.a(parcel, 18, this.o, true);
        }
        if (set.contains(19)) {
            ivx.a(parcel, 19, this.p, i2, true);
        }
        if (set.contains(20)) {
            ivx.a(parcel, 20, this.q, true);
        }
        if (set.contains(21)) {
            ivx.b(parcel, 21, this.r);
        }
        if (set.contains(22)) {
            ivx.c(parcel, 22, this.s, true);
        }
        if (set.contains(23)) {
            ivx.c(parcel, 23, this.t, true);
        }
        if (set.contains(24)) {
            ivx.b(parcel, 24, this.u);
        }
        if (set.contains(25)) {
            ivx.b(parcel, 25, this.v);
        }
        if (set.contains(26)) {
            ivx.a(parcel, 26, this.w, true);
        }
        if (set.contains(27)) {
            ivx.a(parcel, 27, this.x, true);
        }
        if (set.contains(28)) {
            ivx.c(parcel, 28, this.y, true);
        }
        if (set.contains(29)) {
            ivx.a(parcel, 29, this.z);
        }
        ivx.b(parcel, a2);
    }

    public PersonEntity(String str, String str2, ImageEntity imageEntity, String str3) {
        this.b = 1;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.j = str;
        hashSet.add(9);
        this.l = str2;
        this.a.add(14);
        this.m = imageEntity;
        this.a.add(15);
        this.r = 0;
        this.a.add(21);
        this.x = str3;
        this.a.add(27);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.d = (AgeRangeEntity) jag;
        } else if (i2 == 7) {
            this.h = (CoverEntity) jag;
        } else if (i2 == 15) {
            this.m = (ImageEntity) jag;
        } else if (i2 == 19) {
            this.p = (NameEntity) jag;
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

    public PersonEntity(Set set, int i2, String str, AgeRangeEntity ageRangeEntity, String str2, String str3, int i3, CoverEntity coverEntity, String str4, String str5, int i4, String str6, ImageEntity imageEntity, boolean z2, String str7, NameEntity nameEntity, String str8, int i5, List list, List list2, int i6, int i7, String str9, String str10, List list3, boolean z3) {
        this.a = set;
        this.b = i2;
        this.c = str;
        this.d = ageRangeEntity;
        this.e = str2;
        this.f = str3;
        this.g = i3;
        this.h = coverEntity;
        this.i = str4;
        this.j = str5;
        this.k = i4;
        this.l = str6;
        this.m = imageEntity;
        this.n = z2;
        this.o = str7;
        this.p = nameEntity;
        this.q = str8;
        this.r = i5;
        this.s = list;
        this.t = list2;
        this.u = i6;
        this.v = i7;
        this.w = str9;
        this.x = str10;
        this.y = list3;
        this.z = z3;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = str2;
        } else if (i2 == 14) {
            this.l = str2;
        } else if (i2 == 18) {
            this.o = str2;
        } else if (i2 == 20) {
            this.q = str2;
        } else if (i2 == 4) {
            this.e = str2;
        } else if (i2 == 5) {
            this.f = str2;
        } else if (i2 == 8) {
            this.i = str2;
        } else if (i2 == 9) {
            this.j = str2;
        } else if (i2 == 26) {
            this.w = str2;
        } else if (i2 == 27) {
            this.x = str2;
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
        if (i2 == 22) {
            this.s = arrayList;
        } else if (i2 == 23) {
            this.t = arrayList;
        } else if (i2 == 28) {
            this.y = arrayList;
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 16) {
            this.n = z2;
        } else if (i2 == 29) {
            this.z = z2;
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
