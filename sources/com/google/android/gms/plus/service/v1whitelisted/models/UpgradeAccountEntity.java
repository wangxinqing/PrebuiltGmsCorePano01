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
public final class UpgradeAccountEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, zii {
    public static final Parcelable.Creator CREATOR = new zij();
    private static final HashMap f;
    final Set a;
    final int b;
    public DescriptionEntity c;
    public FormEntity d;
    public String e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class DescriptionEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, ilq {
        public static final Parcelable.Creator CREATOR = new zik();
        private static final HashMap f;
        public final Set a;
        final int b;
        public String c;
        public List d;
        public String e;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class ReferencesEntity extends FastSafeParcelableJsonResponse implements zif {
            public static final Parcelable.Creator CREATOR = new zil();
            private static final HashMap f;
            final Set a;
            final int b;
            String c;
            String d;
            String e;

            static {
                HashMap hashMap = new HashMap();
                f = hashMap;
                hashMap.put("id", FastJsonResponse$Field.f("id", 2));
                f.put("text", FastJsonResponse$Field.f("text", 3));
                f.put("title", FastJsonResponse$Field.f("title", 4));
            }

            public ReferencesEntity() {
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
                    return this.e;
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
                return this.a.contains(2);
            }

            public final String d() {
                return this.d;
            }

            public final boolean e() {
                return this.a.contains(3);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof ReferencesEntity)) {
                    return false;
                }
                if (this != obj) {
                    ReferencesEntity referencesEntity = (ReferencesEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!referencesEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(referencesEntity.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (referencesEntity.a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final String f() {
                return this.e;
            }

            public final boolean g() {
                return this.a.contains(4);
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
                ivx.b(parcel, a2);
            }

            public ReferencesEntity(Set set, int i, String str, String str2, String str3) {
                this.a = set;
                this.b = i;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            /* access modifiers changed from: protected */
            public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("id", FastJsonResponse$Field.f("id", 2));
            f.put("references", FastJsonResponse$Field.b("references", 3, ReferencesEntity.class));
            f.put("text", FastJsonResponse$Field.f("text", 4));
        }

        public DescriptionEntity() {
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
                return this.e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DescriptionEntity)) {
                return false;
            }
            if (this != obj) {
                DescriptionEntity descriptionEntity = (DescriptionEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!descriptionEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(descriptionEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (descriptionEntity.a(fastJsonResponse$Field)) {
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
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = str2;
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
                ivx.c(parcel, 3, this.d, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        public DescriptionEntity(Set set, int i, String str, List list, String str2) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = list;
            this.e = str2;
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class FormEntity extends FastSafeParcelableJsonResponse implements zih {
        public static final Parcelable.Creator CREATOR = new zim();
        private static final HashMap d;
        final Set a;
        final int b;
        public List c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("fields", FastJsonResponse$Field.b("fields", 2, AccountField.class));
        }

        public FormEntity() {
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

        public final boolean equals(Object obj) {
            if (!(obj instanceof FormEntity)) {
                return false;
            }
            if (this != obj) {
                FormEntity formEntity = (FormEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!formEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(formEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (formEntity.a(fastJsonResponse$Field)) {
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

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = arrayList;
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

        public final boolean b() {
            return this.a.contains(2);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            if (set.contains(2)) {
                ivx.c(parcel, 2, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public FormEntity(Set set, int i, List list) {
            this.a = set;
            this.b = i;
            this.c = list;
        }

        public FormEntity(Set set, List list) {
            this.a = set;
            this.b = 1;
            this.c = list;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("description", FastJsonResponse$Field.a("description", 2, DescriptionEntity.class));
        f.put("form", FastJsonResponse$Field.a("form", 4, FormEntity.class));
        f.put("state", FastJsonResponse$Field.f("state", 6));
    }

    public UpgradeAccountEntity() {
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
        if (i == 4) {
            return this.d;
        }
        if (i == 6) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean c() {
        return this.a.contains(6);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UpgradeAccountEntity)) {
            return false;
        }
        if (this != obj) {
            UpgradeAccountEntity upgradeAccountEntity = (UpgradeAccountEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!upgradeAccountEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(upgradeAccountEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (upgradeAccountEntity.a(fastJsonResponse$Field)) {
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

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = (DescriptionEntity) jag;
        } else if (i == 4) {
            this.d = (FormEntity) jag;
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

    public final boolean b() {
        return this.a.contains(4);
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
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, i, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.e, true);
        }
        ivx.b(parcel, a2);
    }

    public UpgradeAccountEntity(Set set, int i, DescriptionEntity descriptionEntity, FormEntity formEntity, String str) {
        this.a = set;
        this.b = i;
        this.c = descriptionEntity;
        this.d = formEntity;
        this.e = str;
    }

    public UpgradeAccountEntity(Set set, FormEntity formEntity, String str) {
        this.a = set;
        this.b = 1;
        this.c = null;
        this.d = formEntity;
        this.e = str;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 6) {
            this.e = str2;
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
