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
public final class AccountField extends FastSafeParcelableJsonResponse implements zea {
    public static final Parcelable.Creator CREATOR = new zdp();
    private static final HashMap l;
    final Set a;
    final int b;
    List c;
    boolean d;
    String e;
    LabelEntity f;
    boolean g;
    List h;
    String i;
    ValueEntity j;
    String k;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ErrorsEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, zds {
        public static final Parcelable.Creator CREATOR = new zeb();
        private static final HashMap f;
        final Set a;
        final int b;
        public String c;
        public List d;
        public String e;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class ReferencesEntity extends FastSafeParcelableJsonResponse implements zdr {
            public static final Parcelable.Creator CREATOR = new zec();
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

        public ErrorsEntity() {
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

        public final List d() {
            return this.d;
        }

        public final boolean e() {
            return this.a.contains(3);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ErrorsEntity)) {
                return false;
            }
            if (this != obj) {
                ErrorsEntity errorsEntity = (ErrorsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!errorsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(errorsEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (errorsEntity.a(fastJsonResponse$Field)) {
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

        public ErrorsEntity(Set set, int i, String str, List list, String str2) {
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
    public final class LabelEntity extends FastSafeParcelableJsonResponse implements zdu {
        public static final Parcelable.Creator CREATOR = new zed();
        private static final HashMap e;
        final Set a;
        final int b;
        List c;
        String d;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class ReferencesEntity extends FastSafeParcelableJsonResponse implements zdt {
            public static final Parcelable.Creator CREATOR = new zee();
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
            e = hashMap;
            hashMap.put("references", FastJsonResponse$Field.b("references", 2, ReferencesEntity.class));
            e.put("text", FastJsonResponse$Field.f("text", 3));
        }

        public LabelEntity() {
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

        public final List b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final boolean d() {
            return this.a.contains(3);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LabelEntity)) {
                return false;
            }
            if (this != obj) {
                LabelEntity labelEntity = (LabelEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!labelEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(labelEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (labelEntity.a(fastJsonResponse$Field)) {
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
                ivx.c(parcel, 2, this.c, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public LabelEntity(Set set, int i, List list, String str) {
            this.a = set;
            this.b = i;
            this.c = list;
            this.d = str;
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class OptionsEntity extends FastSafeParcelableJsonResponse implements zdv {
        public static final Parcelable.Creator CREATOR = new zef();
        private static final HashMap e;
        final Set a;
        final int b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("id", FastJsonResponse$Field.f("id", 2));
            e.put("text", FastJsonResponse$Field.f("text", 3));
        }

        public OptionsEntity() {
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
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OptionsEntity)) {
                return false;
            }
            if (this != obj) {
                OptionsEntity optionsEntity = (OptionsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!optionsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(optionsEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (optionsEntity.a(fastJsonResponse$Field)) {
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

        public OptionsEntity(Set set, int i, String str, String str2) {
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
    public final class ValueEntity extends FastSafeParcelableJsonResponse implements zdz {
        public static final Parcelable.Creator CREATOR = new zeg();
        private static final HashMap h;
        final Set a;
        final int b;
        boolean c;
        String d;
        NameEntity e;
        String f;
        String g;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class NameEntity extends FastSafeParcelableJsonResponse implements zdy {
            public static final Parcelable.Creator CREATOR = new zeh();
            private static final HashMap f;
            final Set a;
            final int b;
            String c;
            String d;
            boolean e;

            static {
                HashMap hashMap = new HashMap();
                f = hashMap;
                hashMap.put("family", FastJsonResponse$Field.f("family", 2));
                f.put("given", FastJsonResponse$Field.f("given", 3));
                f.put("readOnly", FastJsonResponse$Field.e("readOnly", 4));
            }

            public NameEntity() {
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
                    return Boolean.valueOf(this.e);
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
                return this.d;
            }

            public final boolean d() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof NameEntity)) {
                    return false;
                }
                if (this != obj) {
                    NameEntity nameEntity = (NameEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
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
                    ivx.a(parcel, 4, this.e);
                }
                ivx.b(parcel, a2);
            }

            public NameEntity(Set set, int i, String str, String str2, boolean z) {
                this.a = set;
                this.b = i;
                this.c = str;
                this.d = str2;
                this.e = z;
            }

            public NameEntity(Set set, String str, String str2) {
                this.a = set;
                this.b = 1;
                this.c = str;
                this.d = str2;
                this.e = false;
            }

            /* access modifiers changed from: protected */
            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                int i = fastJsonResponse$Field.g;
                if (i == 4) {
                    this.e = z;
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

        static {
            HashMap hashMap = new HashMap();
            h = hashMap;
            hashMap.put("check", FastJsonResponse$Field.e("check", 2));
            h.put("date", FastJsonResponse$Field.f("date", 3));
            h.put("name", FastJsonResponse$Field.a("name", 4, NameEntity.class));
            h.put("option", FastJsonResponse$Field.f("option", 5));
            h.put("string", FastJsonResponse$Field.f("string", 6));
        }

        public ValueEntity() {
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
                return Boolean.valueOf(this.c);
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
            if (i == 6) {
                return this.g;
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
            return this.a.contains(2);
        }

        public final String d() {
            return this.d;
        }

        public final zdy e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ValueEntity)) {
                return false;
            }
            if (this != obj) {
                ValueEntity valueEntity = (ValueEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!valueEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(valueEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (valueEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean f() {
            return this.a.contains(4);
        }

        public final String g() {
            return this.f;
        }

        public final String h() {
            return this.g;
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

        public final boolean i() {
            return this.a.contains(6);
        }

        public final /* bridge */ /* synthetic */ Object r() {
            return this;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.e = (NameEntity) jag;
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
                ivx.a(parcel, 2, this.c);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.d, true);
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

        public ValueEntity(Set set, int i, boolean z, String str, NameEntity nameEntity, String str2, String str3) {
            this.a = set;
            this.b = i;
            this.c = z;
            this.d = str;
            this.e = nameEntity;
            this.f = str2;
            this.g = str3;
        }

        public ValueEntity(Set set, boolean z, String str, NameEntity nameEntity, String str2, String str3) {
            this.a = set;
            this.b = 1;
            this.c = z;
            this.d = str;
            this.e = nameEntity;
            this.f = str2;
            this.g = str3;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.d = str2;
            } else if (i == 5) {
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

    static {
        HashMap hashMap = new HashMap();
        l = hashMap;
        hashMap.put("errors", FastJsonResponse$Field.b("errors", 2, ErrorsEntity.class));
        l.put("hidden", FastJsonResponse$Field.e("hidden", 3));
        l.put("id", FastJsonResponse$Field.f("id", 4));
        l.put("label", FastJsonResponse$Field.a("label", 6, LabelEntity.class));
        l.put("mandatory", FastJsonResponse$Field.e("mandatory", 7));
        l.put("options", FastJsonResponse$Field.b("options", 8, OptionsEntity.class));
        l.put("type", FastJsonResponse$Field.f("type", 9));
        l.put("value", FastJsonResponse$Field.a("value", 10, ValueEntity.class));
        l.put("version", FastJsonResponse$Field.f("version", 11));
    }

    public AccountField() {
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
                return Boolean.valueOf(this.d);
            case 4:
                return this.e;
            case 6:
                return this.f;
            case 7:
                return Boolean.valueOf(this.g);
            case 8:
                return this.h;
            case 9:
                return this.i;
            case 10:
                return this.j;
            case 11:
                return this.k;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final List b() {
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
        if (!(obj instanceof AccountField)) {
            return false;
        }
        if (this != obj) {
            AccountField accountField = (AccountField) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!accountField.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(accountField.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (accountField.a(fastJsonResponse$Field)) {
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

    public final zdu h() {
        return this.f;
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

    public final boolean i() {
        return this.a.contains(6);
    }

    public final boolean j() {
        return this.g;
    }

    public final boolean k() {
        return this.a.contains(7);
    }

    public final List l() {
        return this.h;
    }

    public final boolean m() {
        return this.a.contains(8);
    }

    public final String n() {
        return this.i;
    }

    public final zdz o() {
        return this.j;
    }

    public final boolean p() {
        return this.a.contains(10);
    }

    public final String q() {
        return this.k;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 6) {
            this.f = (LabelEntity) jag;
        } else if (i2 == 10) {
            this.j = (ValueEntity) jag;
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
            ivx.c(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f, i2, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g);
        }
        if (set.contains(8)) {
            ivx.c(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i, true);
        }
        if (set.contains(10)) {
            ivx.a(parcel, 10, this.j, i2, true);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.k, true);
        }
        ivx.b(parcel, a2);
    }

    public AccountField(Set set, int i2, List list, boolean z, String str, LabelEntity labelEntity, boolean z2, List list2, String str2, ValueEntity valueEntity, String str3) {
        this.a = set;
        this.b = i2;
        this.c = list;
        this.d = z;
        this.e = str;
        this.f = labelEntity;
        this.g = z2;
        this.h = list2;
        this.i = str2;
        this.j = valueEntity;
        this.k = str3;
    }

    public AccountField(Set set, String str, String str2, ValueEntity valueEntity, String str3) {
        this.a = set;
        this.b = 1;
        this.c = null;
        this.d = false;
        this.e = str;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = str2;
        this.j = valueEntity;
        this.k = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.e = str2;
        } else if (i2 == 9) {
            this.i = str2;
        } else if (i2 == 11) {
            this.k = str2;
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
            this.c = arrayList;
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
        if (i2 == 3) {
            this.d = z;
        } else if (i2 == 7) {
            this.g = z;
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
