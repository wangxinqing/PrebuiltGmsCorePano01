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

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Mergedpeoplefieldacl extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new zip();
    private static final HashMap d;
    final Set a;
    List b;
    List c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Entries extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new ziq();
        private static final HashMap d;
        final Set a;
        String b;
        Scope c;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class Scope extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new zir();
            private static final HashMap f;
            final Set a;
            boolean b;
            boolean c;
            Membership d;
            Person e;

            /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
            public final class Membership extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new zis();
                private static final HashMap c;
                final Set a;
                Circle b;

                /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
                public final class Circle extends FastSafeParcelableJsonResponse {
                    public static final Parcelable.Creator CREATOR = new zit();
                    private static final HashMap d;
                    final Set a;
                    String b;
                    String c;

                    static {
                        HashMap hashMap = new HashMap();
                        d = hashMap;
                        hashMap.put("circleId", FastJsonResponse$Field.f("circleId", 2));
                        d.put("circleSet", FastJsonResponse$Field.f("circleSet", 3));
                    }

                    public Circle() {
                        this.a = new HashSet();
                    }

                    public final /* bridge */ /* synthetic */ Map a() {
                        return d;
                    }

                    /* access modifiers changed from: protected */
                    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                        int i = fastJsonResponse$Field.g;
                        if (i == 2) {
                            return this.b;
                        }
                        if (i == 3) {
                            return this.c;
                        }
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unknown safe parcelable id=");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Circle)) {
                            return false;
                        }
                        if (this != obj) {
                            Circle circle = (Circle) obj;
                            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                                if (a(fastJsonResponse$Field)) {
                                    if (!circle.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(circle.b(fastJsonResponse$Field))) {
                                        return false;
                                    }
                                } else if (circle.a(fastJsonResponse$Field)) {
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

                    public Circle(Set set, String str, String str2) {
                        this.a = set;
                        this.b = str;
                        this.c = str2;
                    }

                    /* access modifiers changed from: protected */
                    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                        int i = fastJsonResponse$Field.g;
                        if (i == 2) {
                            this.b = str2;
                        } else if (i == 3) {
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

                    public final void writeToParcel(Parcel parcel, int i) {
                        int a2 = ivx.a(parcel);
                        Set set = this.a;
                        if (set.contains(2)) {
                            ivx.a(parcel, 2, this.b, true);
                        }
                        if (set.contains(3)) {
                            ivx.a(parcel, 3, this.c, true);
                        }
                        ivx.b(parcel, a2);
                    }

                    /* access modifiers changed from: protected */
                    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                    }
                }

                static {
                    HashMap hashMap = new HashMap();
                    c = hashMap;
                    hashMap.put("circle", FastJsonResponse$Field.a("circle", 2, Circle.class));
                }

                public Membership() {
                    this.a = new HashSet();
                }

                public final /* bridge */ /* synthetic */ Map a() {
                    return c;
                }

                /* access modifiers changed from: protected */
                public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        return this.b;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Membership)) {
                        return false;
                    }
                    if (this != obj) {
                        Membership membership = (Membership) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!membership.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(membership.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (membership.a(fastJsonResponse$Field)) {
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

                public Membership(Set set, Circle circle) {
                    this.a = set;
                    this.b = circle;
                }

                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        this.b = (Circle) jag;
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
                    if (this.a.contains(2)) {
                        ivx.a(parcel, 2, this.b, i, true);
                    }
                    ivx.b(parcel, a2);
                }

                /* access modifiers changed from: protected */
                public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }
            }

            /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
            public final class Person extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new ziu();
                private static final HashMap c;
                final Set a;
                String b;

                static {
                    HashMap hashMap = new HashMap();
                    c = hashMap;
                    hashMap.put("personId", FastJsonResponse$Field.f("personId", 2));
                }

                public Person() {
                    this.a = new HashSet();
                }

                public final /* bridge */ /* synthetic */ Map a() {
                    return c;
                }

                /* access modifiers changed from: protected */
                public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        return this.b;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Person)) {
                        return false;
                    }
                    if (this != obj) {
                        Person person = (Person) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!person.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(person.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (person.a(fastJsonResponse$Field)) {
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

                public Person(Set set, String str) {
                    this.a = set;
                    this.b = str;
                }

                /* access modifiers changed from: protected */
                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        this.b = str2;
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
                    if (this.a.contains(2)) {
                        ivx.a(parcel, 2, this.b, true);
                    }
                    ivx.b(parcel, a2);
                }

                /* access modifiers changed from: protected */
                public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                f = hashMap;
                hashMap.put("allUsers", FastJsonResponse$Field.e("allUsers", 2));
                f.put("domainUsers", FastJsonResponse$Field.e("domainUsers", 3));
                f.put("membership", FastJsonResponse$Field.a("membership", 4, Membership.class));
                f.put("person", FastJsonResponse$Field.a("person", 5, Person.class));
            }

            public Scope() {
                this.a = new HashSet();
            }

            public final /* bridge */ /* synthetic */ Map a() {
                return f;
            }

            /* access modifiers changed from: protected */
            public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    return Boolean.valueOf(this.b);
                }
                if (i == 3) {
                    return Boolean.valueOf(this.c);
                }
                if (i == 4) {
                    return this.d;
                }
                if (i == 5) {
                    return this.e;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Scope)) {
                    return false;
                }
                if (this != obj) {
                    Scope scope = (Scope) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!scope.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(scope.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (scope.a(fastJsonResponse$Field)) {
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

            public Scope(Set set, boolean z, boolean z2, Membership membership, Person person) {
                this.a = set;
                this.b = z;
                this.c = z2;
                this.d = membership;
                this.e = person;
            }

            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
                int i = fastJsonResponse$Field.g;
                if (i == 4) {
                    this.d = (Membership) jag;
                } else if (i == 5) {
                    this.e = (Person) jag;
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

            public final void writeToParcel(Parcel parcel, int i) {
                int a2 = ivx.a(parcel);
                Set set = this.a;
                if (set.contains(2)) {
                    ivx.a(parcel, 2, this.b);
                }
                if (set.contains(3)) {
                    ivx.a(parcel, 3, this.c);
                }
                if (set.contains(4)) {
                    ivx.a(parcel, 4, this.d, i, true);
                }
                if (set.contains(5)) {
                    ivx.a(parcel, 5, this.e, i, true);
                }
                ivx.b(parcel, a2);
            }

            /* access modifiers changed from: protected */
            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    this.b = z;
                } else if (i == 3) {
                    this.c = z;
                } else {
                    StringBuilder sb = new StringBuilder(55);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a boolean.");
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
            d = hashMap;
            hashMap.put("role", FastJsonResponse$Field.f("role", 2));
            d.put("scope", FastJsonResponse$Field.a("scope", 3, Scope.class));
        }

        public Entries() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return d;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entries)) {
                return false;
            }
            if (this != obj) {
                Entries entries = (Entries) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!entries.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(entries.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (entries.a(fastJsonResponse$Field)) {
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

        public Entries(Set set, String str, Scope scope) {
            this.a = set;
            this.b = str;
            this.c = scope;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Scope) jag;
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
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, i, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
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
        d = hashMap;
        hashMap.put("entries", FastJsonResponse$Field.b("entries", 2, Entries.class));
        d.put("predefinedEntries", FastJsonResponse$Field.g("predefinedEntries", 3));
    }

    public Mergedpeoplefieldacl() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return d;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Mergedpeoplefieldacl)) {
            return false;
        }
        if (this != obj) {
            Mergedpeoplefieldacl mergedpeoplefieldacl = (Mergedpeoplefieldacl) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!mergedpeoplefieldacl.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(mergedpeoplefieldacl.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (mergedpeoplefieldacl.a(fastJsonResponse$Field)) {
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

    public Mergedpeoplefieldacl(Set set, List list, List list2) {
        this.a = set;
        this.b = list;
        this.c = list2;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
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
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = arrayList;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an array of String.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.c(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.c, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
