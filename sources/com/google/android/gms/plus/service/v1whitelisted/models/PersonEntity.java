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
public final class PersonEntity extends FastSafeParcelableJsonResponse implements zhr {
    public static final Parcelable.Creator CREATOR = new zhs();
    private static final HashMap m;
    final Set a;
    final int b;
    public String c;
    List d;
    String e;
    public String f;
    public ImageEntity g;
    NameEntity h;
    String i;
    StatusForViewerEntity j;
    String k;
    public String l;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class EmailsEntity extends FastSafeParcelableJsonResponse implements zho {
        public static final Parcelable.Creator CREATOR = new zht();
        private static final HashMap e;
        final Set a;
        final int b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("type", FastJsonResponse$Field.f("type", 2));
            e.put("value", FastJsonResponse$Field.f("value", 3));
        }

        public EmailsEntity() {
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
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final String b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof EmailsEntity)) {
                return false;
            }
            if (this != obj) {
                EmailsEntity emailsEntity = (EmailsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!emailsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(emailsEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (emailsEntity.a(fastJsonResponse$Field)) {
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
            if (i == 2) {
                this.c = str2;
            } else if (i == 3) {
                this.d = str2;
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
            ivx.b(parcel, a2);
        }

        public EmailsEntity(Set set, int i, String str, String str2) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ImageEntity extends FastSafeParcelableJsonResponse implements zhp {
        public static final Parcelable.Creator CREATOR = new zhu();
        private static final HashMap e;
        final Set a;
        final int b;
        String c;
        public String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("id", FastJsonResponse$Field.f("id", 2));
            e.put("url", FastJsonResponse$Field.f("url", 4));
        }

        public ImageEntity() {
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
            if (i == 4) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final String b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ImageEntity)) {
                return false;
            }
            if (this != obj) {
                ImageEntity imageEntity = (ImageEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
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
            if (i == 2) {
                this.c = str2;
            } else if (i == 4) {
                this.d = str2;
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
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public ImageEntity(Set set, int i, String str, String str2) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class NameEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new zhv();
        private static final HashMap c = new HashMap();
        final Set a;
        final int b;

        public NameEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return c;
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
            if (!(obj instanceof NameEntity)) {
                return false;
            }
            if (this != obj) {
                NameEntity nameEntity = (NameEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
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
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            if (this.a.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            ivx.b(parcel, a2);
        }

        public NameEntity(Set set, int i) {
            this.a = set;
            this.b = i;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class StatusForViewerEntity extends FastSafeParcelableJsonResponse implements zhq {
        public static final Parcelable.Creator CREATOR = new zhw();
        private static final HashMap d;
        final Set a;
        final int b;
        boolean c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("isCircled", FastJsonResponse$Field.e("isCircled", 4));
        }

        public StatusForViewerEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return d;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                return Boolean.valueOf(this.c);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean b() {
            return this.c;
        }

        public final boolean c() {
            return this.a.contains(4);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof StatusForViewerEntity)) {
                return false;
            }
            if (this != obj) {
                StatusForViewerEntity statusForViewerEntity = (StatusForViewerEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!statusForViewerEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(statusForViewerEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (statusForViewerEntity.a(fastJsonResponse$Field)) {
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
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
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

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.c);
            }
            ivx.b(parcel, a2);
        }

        public StatusForViewerEntity(Set set, int i, boolean z) {
            this.a = set;
            this.b = i;
            this.c = z;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        m = hashMap;
        hashMap.put("displayName", FastJsonResponse$Field.f("displayName", 9));
        m.put("emails", FastJsonResponse$Field.b("emails", 11, EmailsEntity.class));
        m.put("etag", FastJsonResponse$Field.f("etag", 12));
        m.put("id", FastJsonResponse$Field.f("id", 15));
        m.put("image", FastJsonResponse$Field.a("image", 16, ImageEntity.class));
        m.put("name", FastJsonResponse$Field.a("name", 20, NameEntity.class));
        m.put("objectType", FastJsonResponse$Field.f("objectType", 22));
        m.put("statusForViewer", FastJsonResponse$Field.a("statusForViewer", 29, StatusForViewerEntity.class));
        m.put("suggestionId", FastJsonResponse$Field.f("suggestionId", 30));
        m.put("url", FastJsonResponse$Field.f("url", 32));
    }

    public PersonEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return m;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 9) {
            return this.c;
        }
        if (i2 == 20) {
            return this.h;
        }
        if (i2 == 22) {
            return this.i;
        }
        if (i2 == 32) {
            return this.l;
        }
        if (i2 == 11) {
            return this.d;
        }
        if (i2 == 12) {
            return this.e;
        }
        if (i2 == 15) {
            return this.f;
        }
        if (i2 == 16) {
            return this.g;
        }
        if (i2 == 29) {
            return this.j;
        }
        if (i2 == 30) {
            return this.k;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public final String b() {
        return this.c;
    }

    public final List c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public final zhp e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity)) {
            return false;
        }
        if (this != obj) {
            PersonEntity personEntity = (PersonEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : m.values()) {
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

    public final boolean f() {
        return this.a.contains(16);
    }

    public final String g() {
        return this.i;
    }

    public final boolean h() {
        return this.a.contains(22);
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

    public final zhq i() {
        return this.j;
    }

    public final boolean j() {
        return this.a.contains(29);
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 16) {
            this.g = (ImageEntity) jag;
        } else if (i2 == 20) {
            this.h = (NameEntity) jag;
        } else if (i2 == 29) {
            this.j = (StatusForViewerEntity) jag;
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
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.c, true);
        }
        if (set.contains(11)) {
            ivx.c(parcel, 11, this.d, true);
        }
        if (set.contains(12)) {
            ivx.a(parcel, 12, this.e, true);
        }
        if (set.contains(15)) {
            ivx.a(parcel, 15, this.f, true);
        }
        if (set.contains(16)) {
            ivx.a(parcel, 16, this.g, i2, true);
        }
        if (set.contains(20)) {
            ivx.a(parcel, 20, this.h, i2, true);
        }
        if (set.contains(22)) {
            ivx.a(parcel, 22, this.i, true);
        }
        if (set.contains(29)) {
            ivx.a(parcel, 29, this.j, i2, true);
        }
        if (set.contains(30)) {
            ivx.a(parcel, 30, this.k, true);
        }
        if (set.contains(32)) {
            ivx.a(parcel, 32, this.l, true);
        }
        ivx.b(parcel, a2);
    }

    public PersonEntity(Set set, int i2, String str, List list, String str2, String str3, ImageEntity imageEntity, NameEntity nameEntity, String str4, StatusForViewerEntity statusForViewerEntity, String str5, String str6) {
        this.a = set;
        this.b = i2;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = str3;
        this.g = imageEntity;
        this.h = nameEntity;
        this.i = str4;
        this.j = statusForViewerEntity;
        this.k = str5;
        this.l = str6;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 9) {
            this.c = str2;
        } else if (i2 == 12) {
            this.e = str2;
        } else if (i2 == 15) {
            this.f = str2;
        } else if (i2 == 22) {
            this.i = str2;
        } else if (i2 == 30) {
            this.k = str2;
        } else if (i2 == 32) {
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
        if (i2 == 11) {
            this.d = arrayList;
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
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
