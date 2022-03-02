package com.google.android.gms.plus.service.v2whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
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
public final class Person extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new ziy();
    private static final HashMap M;
    public List A;
    public List B;
    List C;
    public List D;
    public List E;
    public String F;
    public List G;
    List H;
    public List I;
    public SortKeys J;
    public List K;
    public List L;
    public final Set a;
    public List b;
    public List c;
    public List d;
    public List e;
    List f;
    List g;
    public List h;
    public List i;
    public List j;
    public String k;
    public List l;
    ExtendedData m;
    List n;
    public List o;
    public String p;
    public List q;
    public List r;
    List s;
    public String t;
    List u;
    public LegacyFields v;
    public List w;
    public Metadata x;
    public List y;
    public List z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Abouts extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new ziz();
        private static final HashMap e;
        public final Set a;
        public Mergedpeoplemetadata b;
        public String c;
        public String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            e.put("type", FastJsonResponse$Field.f("type", 3));
            e.put("value", FastJsonResponse$Field.f("value", 4));
        }

        public Abouts() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return e;
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
            if (i == 4) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Abouts)) {
                return false;
            }
            if (this != obj) {
                Abouts abouts = (Abouts) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!abouts.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(abouts.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (abouts.a(fastJsonResponse$Field)) {
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

        public Abouts(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
            this.d = str2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Addresses extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zja();
        private static final HashMap l;
        public final Set a;
        public String b;
        public String c;
        String d;
        public Mergedpeoplemetadata e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;

        static {
            HashMap hashMap = new HashMap();
            l = hashMap;
            hashMap.put("city", FastJsonResponse$Field.f("city", 2));
            l.put("country", FastJsonResponse$Field.f("country", 3));
            l.put("extendedAddress", FastJsonResponse$Field.f("extendedAddress", 5));
            l.put("metadata", FastJsonResponse$Field.a("metadata", 7, Mergedpeoplemetadata.class));
            l.put("poBox", FastJsonResponse$Field.f("poBox", 8));
            l.put("postalCode", FastJsonResponse$Field.f("postalCode", 9));
            l.put("region", FastJsonResponse$Field.f("region", 10));
            l.put("streetAddress", FastJsonResponse$Field.f("streetAddress", 11));
            l.put("type", FastJsonResponse$Field.f("type", 12));
            l.put("value", FastJsonResponse$Field.f("value", 13));
        }

        public Addresses() {
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
                    return this.b;
                case 3:
                    return this.c;
                case 5:
                    return this.d;
                case 7:
                    return this.e;
                case 8:
                    return this.f;
                case 9:
                    return this.g;
                case 10:
                    return this.h;
                case 11:
                    return this.i;
                case 12:
                    return this.j;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    return this.k;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Addresses)) {
                return false;
            }
            if (this != obj) {
                Addresses addresses = (Addresses) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!addresses.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(addresses.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (addresses.a(fastJsonResponse$Field)) {
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

        public Addresses(Set set, String str, String str2, String str3, Mergedpeoplemetadata mergedpeoplemetadata, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = mergedpeoplemetadata;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = str8;
            this.k = str9;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 7) {
                this.e = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.d, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.e, i2, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.f, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.g, true);
            }
            if (set.contains(10)) {
                ivx.a(parcel, 10, this.h, true);
            }
            if (set.contains(11)) {
                ivx.a(parcel, 11, this.i, true);
            }
            if (set.contains(12)) {
                ivx.a(parcel, 12, this.j, true);
            }
            if (set.contains(13)) {
                ivx.a(parcel, 13, this.k, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 2) {
                this.b = str2;
            } else if (i2 == 3) {
                this.c = str2;
            } else if (i2 != 5) {
                switch (i2) {
                    case 8:
                        this.f = str2;
                        break;
                    case 9:
                        this.g = str2;
                        break;
                    case 10:
                        this.h = str2;
                        break;
                    case 11:
                        this.i = str2;
                        break;
                    case 12:
                        this.j = str2;
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                        this.k = str2;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i2);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.d = str2;
            }
            this.a.add(Integer.valueOf(i2));
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Birthdays extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjb();
        private static final HashMap d;
        public final Set a;
        public String b;
        public Mergedpeoplemetadata c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("date", FastJsonResponse$Field.f("date", 2));
            d.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
        }

        public Birthdays() {
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
            if (!(obj instanceof Birthdays)) {
                return false;
            }
            if (this != obj) {
                Birthdays birthdays = (Birthdays) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!birthdays.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(birthdays.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (birthdays.a(fastJsonResponse$Field)) {
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

        public Birthdays(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class BraggingRights extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjc();
        private static final HashMap d;
        public final Set a;
        public Mergedpeoplemetadata b;
        public String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            d.put("value", FastJsonResponse$Field.f("value", 3));
        }

        public BraggingRights() {
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
            if (!(obj instanceof BraggingRights)) {
                return false;
            }
            if (this != obj) {
                BraggingRights braggingRights = (BraggingRights) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!braggingRights.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(braggingRights.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (braggingRights.a(fastJsonResponse$Field)) {
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

        public BraggingRights(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Calendars extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjd();
        private static final HashMap f;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("formattedType", FastJsonResponse$Field.f("formattedType", 2));
            f.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
            f.put("type", FastJsonResponse$Field.f("type", 4));
            f.put("url", FastJsonResponse$Field.f("url", 5));
        }

        public Calendars() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
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
            if (!(obj instanceof Calendars)) {
                return false;
            }
            if (this != obj) {
                Calendars calendars = (Calendars) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!calendars.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(calendars.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (calendars.a(fastJsonResponse$Field)) {
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

        public Calendars(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.d = str2;
            } else if (i == 5) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ClientData extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zje();
        private static final HashMap f;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("key", FastJsonResponse$Field.f("key", 2));
            f.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
            f.put("namespace", FastJsonResponse$Field.f("namespace", 4));
            f.put("value", FastJsonResponse$Field.f("value", 5));
        }

        public ClientData() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
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
            if (!(obj instanceof ClientData)) {
                return false;
            }
            if (this != obj) {
                ClientData clientData = (ClientData) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!clientData.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(clientData.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (clientData.a(fastJsonResponse$Field)) {
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

        public ClientData(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.d = str2;
            } else if (i == 5) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class CoverPhotos extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjf();
        private static final HashMap h;
        public final Set a;
        public int b;
        public String c;
        public boolean d;
        Mergedpeoplemetadata e;
        public String f;
        public int g;

        static {
            HashMap hashMap = new HashMap();
            h = hashMap;
            hashMap.put("height", FastJsonResponse$Field.a("height", 2));
            h.put("id", FastJsonResponse$Field.f("id", 3));
            h.put("isDefault", FastJsonResponse$Field.e("isDefault", 5));
            h.put("metadata", FastJsonResponse$Field.a("metadata", 6, Mergedpeoplemetadata.class));
            h.put("url", FastJsonResponse$Field.f("url", 7));
            h.put("width", FastJsonResponse$Field.a("width", 8));
        }

        public CoverPhotos() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return h;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return Integer.valueOf(this.b);
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 5) {
                return Boolean.valueOf(this.d);
            }
            if (i == 6) {
                return this.e;
            }
            if (i == 7) {
                return this.f;
            }
            if (i == 8) {
                return Integer.valueOf(this.g);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CoverPhotos)) {
                return false;
            }
            if (this != obj) {
                CoverPhotos coverPhotos = (CoverPhotos) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!coverPhotos.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(coverPhotos.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (coverPhotos.a(fastJsonResponse$Field)) {
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

        public CoverPhotos(Set set, int i, String str, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str2, int i2) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = z;
            this.e = mergedpeoplemetadata;
            this.f = str2;
            this.g = i2;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 2) {
                this.b = i;
            } else if (i2 == 8) {
                this.g = i;
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
            if (set.contains(2)) {
                ivx.b(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.d);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.e, i, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.f, true);
            }
            if (set.contains(8)) {
                ivx.b(parcel, 8, this.g);
            }
            ivx.b(parcel, a2);
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 6) {
                this.e = (Mergedpeoplemetadata) jag;
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
            if (i == 3) {
                this.c = str2;
            } else if (i == 7) {
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

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i == 5) {
                this.d = z;
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
    public final class CustomFields extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjg();
        private static final HashMap e;
        public final Set a;
        public String b;
        Mergedpeoplemetadata c;
        public String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("key", FastJsonResponse$Field.f("key", 2));
            e.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
            e.put("value", FastJsonResponse$Field.f("value", 4));
        }

        public CustomFields() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return e;
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
            if (i == 4) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CustomFields)) {
                return false;
            }
            if (this != obj) {
                CustomFields customFields = (CustomFields) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!customFields.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(customFields.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (customFields.a(fastJsonResponse$Field)) {
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

        public CustomFields(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Emails extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjh();
        private static final HashMap g;
        public final Set a;
        public List b;
        public String c;
        public Mergedpeoplemetadata d;
        public String e;
        public String f;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class Certificates extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new zji();
            private static final HashMap d;
            final Set a;
            public Mergedpeoplemetadata b;
            public Status c;

            /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
            public final class Status extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new zjj();
                private static final HashMap e;
                final Set a;
                public String b;
                String c;
                public long d;

                static {
                    HashMap hashMap = new HashMap();
                    e = hashMap;
                    hashMap.put("code", FastJsonResponse$Field.f("code", 2));
                    e.put("expiration", FastJsonResponse$Field.f("expiration", 3));
                    e.put("expirationSeconds", FastJsonResponse$Field.b("expirationSeconds", 4));
                }

                public Status() {
                    this.a = new HashSet();
                }

                public final /* bridge */ /* synthetic */ Map a() {
                    return e;
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
                    if (i == 4) {
                        return Long.valueOf(this.d);
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Status)) {
                        return false;
                    }
                    if (this != obj) {
                        Status status = (Status) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!status.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(status.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (status.a(fastJsonResponse$Field)) {
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

                public Status(Set set, String str, String str2, long j) {
                    this.a = set;
                    this.b = str;
                    this.c = str2;
                    this.d = j;
                }

                /* access modifiers changed from: protected */
                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 4) {
                        this.d = j;
                        this.a.add(Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a long.");
                    throw new IllegalArgumentException(sb.toString());
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
                    if (set.contains(4)) {
                        ivx.a(parcel, 4, this.d);
                    }
                    ivx.b(parcel, a2);
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

                /* access modifiers changed from: protected */
                public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                d = hashMap;
                hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
                d.put("status", FastJsonResponse$Field.a("status", 4, Status.class));
            }

            public Certificates() {
                this.a = new HashSet();
            }

            public final /* bridge */ /* synthetic */ Map a() {
                return d;
            }

            /* access modifiers changed from: protected */
            public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 3) {
                    return this.b;
                }
                if (i == 4) {
                    return this.c;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Certificates)) {
                    return false;
                }
                if (this != obj) {
                    Certificates certificates = (Certificates) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!certificates.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(certificates.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (certificates.a(fastJsonResponse$Field)) {
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

            public Certificates(Set set, Mergedpeoplemetadata mergedpeoplemetadata, Status status) {
                this.a = set;
                this.b = mergedpeoplemetadata;
                this.c = status;
            }

            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
                int i = fastJsonResponse$Field.g;
                if (i == 3) {
                    this.b = (Mergedpeoplemetadata) jag;
                } else if (i == 4) {
                    this.c = (Status) jag;
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
                if (set.contains(3)) {
                    ivx.a(parcel, 3, this.b, i, true);
                }
                if (set.contains(4)) {
                    ivx.a(parcel, 4, this.c, i, true);
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
            g = hashMap;
            hashMap.put("certificates", FastJsonResponse$Field.b("certificates", 2, Certificates.class));
            g.put("formattedType", FastJsonResponse$Field.f("formattedType", 4));
            g.put("metadata", FastJsonResponse$Field.a("metadata", 5, Mergedpeoplemetadata.class));
            g.put("type", FastJsonResponse$Field.f("type", 6));
            g.put("value", FastJsonResponse$Field.f("value", 7));
        }

        public Emails() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return g;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 4) {
                return this.c;
            }
            if (i == 5) {
                return this.d;
            }
            if (i == 6) {
                return this.e;
            }
            if (i == 7) {
                return this.f;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Emails)) {
                return false;
            }
            if (this != obj) {
                Emails emails = (Emails) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!emails.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(emails.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (emails.a(fastJsonResponse$Field)) {
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

        public Emails(Set set, List list, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = list;
            this.c = str;
            this.d = mergedpeoplemetadata;
            this.e = str2;
            this.f = str3;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 5) {
                this.d = (Mergedpeoplemetadata) jag;
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
                ivx.c(parcel, 2, this.b, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.c, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.d, i, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.e, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.f, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.c = str2;
            } else if (i == 6) {
                this.e = str2;
            } else if (i == 7) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Events extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjk();
        private static final HashMap f;
        public final Set a;
        public String b;
        public String c;
        public Mergedpeoplemetadata d;
        public String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("date", FastJsonResponse$Field.f("date", 2));
            f.put("formattedType", FastJsonResponse$Field.f("formattedType", 3));
            f.put("metadata", FastJsonResponse$Field.a("metadata", 4, Mergedpeoplemetadata.class));
            f.put("type", FastJsonResponse$Field.f("type", 5));
        }

        public Events() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
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
            if (!(obj instanceof Events)) {
                return false;
            }
            if (this != obj) {
                Events events = (Events) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!events.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(events.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (events.a(fastJsonResponse$Field)) {
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

        public Events(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = mergedpeoplemetadata;
            this.e = str3;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.d = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, i, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 3) {
                this.c = str2;
            } else if (i == 5) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ExtendedData extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjl();
        private static final HashMap d;
        final Set a;
        HangoutsExtendedData b;
        List c;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class HangoutsExtendedData extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new zjm();
            private static final HashMap g;
            final Set a;
            String b;
            String c;
            boolean d;
            boolean e;
            boolean f;

            static {
                HashMap hashMap = new HashMap();
                g = hashMap;
                hashMap.put("hadPastHangoutState", FastJsonResponse$Field.f("hadPastHangoutState", 2));
                g.put("invitationStatus", FastJsonResponse$Field.f("invitationStatus", 3));
                g.put("isDismissed", FastJsonResponse$Field.e("isDismissed", 4));
                g.put("isFavorite", FastJsonResponse$Field.e("isFavorite", 5));
                g.put("isPinned", FastJsonResponse$Field.e("isPinned", 6));
            }

            public HangoutsExtendedData() {
                this.a = new HashSet();
            }

            public final /* bridge */ /* synthetic */ Map a() {
                return g;
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
                if (i == 4) {
                    return Boolean.valueOf(this.d);
                }
                if (i == 5) {
                    return Boolean.valueOf(this.e);
                }
                if (i == 6) {
                    return Boolean.valueOf(this.f);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof HangoutsExtendedData)) {
                    return false;
                }
                if (this != obj) {
                    HangoutsExtendedData hangoutsExtendedData = (HangoutsExtendedData) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!hangoutsExtendedData.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(hangoutsExtendedData.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (hangoutsExtendedData.a(fastJsonResponse$Field)) {
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

            public HangoutsExtendedData(Set set, String str, String str2, boolean z, boolean z2, boolean z3) {
                this.a = set;
                this.b = str;
                this.c = str2;
                this.d = z;
                this.e = z2;
                this.f = z3;
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
                if (set.contains(4)) {
                    ivx.a(parcel, 4, this.d);
                }
                if (set.contains(5)) {
                    ivx.a(parcel, 5, this.e);
                }
                if (set.contains(6)) {
                    ivx.a(parcel, 6, this.f);
                }
                ivx.b(parcel, a2);
            }

            /* access modifiers changed from: protected */
            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                int i = fastJsonResponse$Field.g;
                if (i == 4) {
                    this.d = z;
                } else if (i == 5) {
                    this.e = z;
                } else if (i == 6) {
                    this.f = z;
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
            hashMap.put("hangoutsExtendedData", FastJsonResponse$Field.a("hangoutsExtendedData", 2, HangoutsExtendedData.class));
            d.put("hd", FastJsonResponse$Field.g("hd", 3));
        }

        public ExtendedData() {
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
            if (!(obj instanceof ExtendedData)) {
                return false;
            }
            if (this != obj) {
                ExtendedData extendedData = (ExtendedData) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!extendedData.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(extendedData.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (extendedData.a(fastJsonResponse$Field)) {
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

        public ExtendedData(Set set, HangoutsExtendedData hangoutsExtendedData, List list) {
            this.a = set;
            this.b = hangoutsExtendedData;
            this.c = list;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (HangoutsExtendedData) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ExternalIds extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjn();
        private static final HashMap f;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("formattedType", FastJsonResponse$Field.f("formattedType", 2));
            f.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
            f.put("type", FastJsonResponse$Field.f("type", 4));
            f.put("value", FastJsonResponse$Field.f("value", 5));
        }

        public ExternalIds() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
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
            if (!(obj instanceof ExternalIds)) {
                return false;
            }
            if (this != obj) {
                ExternalIds externalIds = (ExternalIds) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!externalIds.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(externalIds.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (externalIds.a(fastJsonResponse$Field)) {
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

        public ExternalIds(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.d = str2;
            } else if (i == 5) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Genders extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjo();
        private static final HashMap e;
        public final Set a;
        public String b;
        public Mergedpeoplemetadata c;
        public String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("formattedValue", FastJsonResponse$Field.f("formattedValue", 3));
            e.put("metadata", FastJsonResponse$Field.a("metadata", 4, Mergedpeoplemetadata.class));
            e.put("value", FastJsonResponse$Field.f("value", 5));
        }

        public Genders() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return e;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                return this.b;
            }
            if (i == 4) {
                return this.c;
            }
            if (i == 5) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Genders)) {
                return false;
            }
            if (this != obj) {
                Genders genders = (Genders) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!genders.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(genders.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (genders.a(fastJsonResponse$Field)) {
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

        public Genders(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.c = (Mergedpeoplemetadata) jag;
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
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.b, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.c, i, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.b = str2;
            } else if (i == 5) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Images extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjp();
        private static final HashMap f;
        public final Set a;
        public boolean b;
        public Mergedpeoplemetadata c;
        String d;
        public String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("isDefault", FastJsonResponse$Field.e("isDefault", 2));
            f.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
            f.put("photoToken", FastJsonResponse$Field.f("photoToken", 4));
            f.put("url", FastJsonResponse$Field.f("url", 5));
        }

        public Images() {
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
                return this.c;
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
            if (!(obj instanceof Images)) {
                return false;
            }
            if (this != obj) {
                Images images = (Images) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!images.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(images.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (images.a(fastJsonResponse$Field)) {
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

        public Images(Set set, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = z;
            this.c = mergedpeoplemetadata;
            this.d = str;
            this.e = str2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        public final boolean b() {
            return this.a.contains(5);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.d = str2;
            } else if (i == 5) {
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
            if (i == 2) {
                this.b = z;
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
    public final class InstantMessaging extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjq();
        private static final HashMap h;
        public final Set a;
        public String b;
        public String c;
        public Mergedpeoplemetadata d;
        public String e;
        public String f;
        public String g;

        static {
            HashMap hashMap = new HashMap();
            h = hashMap;
            hashMap.put("formattedProtocol", FastJsonResponse$Field.f("formattedProtocol", 2));
            h.put("formattedType", FastJsonResponse$Field.f("formattedType", 3));
            h.put("metadata", FastJsonResponse$Field.a("metadata", 4, Mergedpeoplemetadata.class));
            h.put("protocol", FastJsonResponse$Field.f("protocol", 5));
            h.put("type", FastJsonResponse$Field.f("type", 6));
            h.put("value", FastJsonResponse$Field.f("value", 7));
        }

        public InstantMessaging() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return h;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            switch (i) {
                case 2:
                    return this.b;
                case 3:
                    return this.c;
                case 4:
                    return this.d;
                case 5:
                    return this.e;
                case 6:
                    return this.f;
                case 7:
                    return this.g;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InstantMessaging)) {
                return false;
            }
            if (this != obj) {
                InstantMessaging instantMessaging = (InstantMessaging) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!instantMessaging.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(instantMessaging.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (instantMessaging.a(fastJsonResponse$Field)) {
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

        public InstantMessaging(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3, String str4, String str5) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = mergedpeoplemetadata;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.d = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, i, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.g, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 3) {
                this.c = str2;
            } else if (i == 5) {
                this.e = str2;
            } else if (i == 6) {
                this.f = str2;
            } else if (i == 7) {
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Interests extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjr();
        private static final HashMap d;
        final Set a;
        Mergedpeoplemetadata b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            d.put("value", FastJsonResponse$Field.f("value", 3));
        }

        public Interests() {
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
            if (!(obj instanceof Interests)) {
                return false;
            }
            if (this != obj) {
                Interests interests = (Interests) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!interests.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(interests.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (interests.a(fastJsonResponse$Field)) {
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

        public Interests(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Languages extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjs();
        private static final HashMap d;
        final Set a;
        Mergedpeoplemetadata b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            d.put("value", FastJsonResponse$Field.f("value", 3));
        }

        public Languages() {
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
            if (!(obj instanceof Languages)) {
                return false;
            }
            if (this != obj) {
                Languages languages = (Languages) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!languages.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(languages.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (languages.a(fastJsonResponse$Field)) {
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

        public Languages(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class LegacyFields extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjt();
        private static final HashMap c;
        public final Set a;
        public String b;

        static {
            HashMap hashMap = new HashMap();
            c = hashMap;
            hashMap.put("mobileOwnerId", FastJsonResponse$Field.f("mobileOwnerId", 2));
        }

        public LegacyFields() {
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
            if (!(obj instanceof LegacyFields)) {
                return false;
            }
            if (this != obj) {
                LegacyFields legacyFields = (LegacyFields) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!legacyFields.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(legacyFields.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (legacyFields.a(fastJsonResponse$Field)) {
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

        public LegacyFields(Set set, String str) {
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Memberships extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zju();
        private static final HashMap f;
        public final Set a;
        public String b;
        public String c;
        public Mergedpeoplemetadata d;
        public String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("circle", FastJsonResponse$Field.f("circle", 2));
            f.put("contactGroup", FastJsonResponse$Field.f("contactGroup", 3));
            f.put("metadata", FastJsonResponse$Field.a("metadata", 4, Mergedpeoplemetadata.class));
            f.put("systemContactGroup", FastJsonResponse$Field.f("systemContactGroup", 5));
        }

        public Memberships() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
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
            if (!(obj instanceof Memberships)) {
                return false;
            }
            if (this != obj) {
                Memberships memberships = (Memberships) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!memberships.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(memberships.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (memberships.a(fastJsonResponse$Field)) {
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

        public Memberships(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = mergedpeoplemetadata;
            this.e = str3;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.d = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, i, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 3) {
                this.c = str2;
            } else if (i == 5) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Metadata extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjv();
        private static final HashMap t;
        public final Set a;
        public List b;
        public List c;
        public List d;
        public boolean e;
        public List f;
        public List g;
        public String h;
        public boolean i;
        public List j;
        IdentityInfo k;
        public boolean l;
        public List m;
        public long n;
        public String o;
        public String p;
        public List q;
        public String r;
        public ProfileOwnerStats s;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class IdentityInfo extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new zjw();
            private static final HashMap d;
            final Set a;
            List b;
            List c;

            /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
            public final class SourceIds extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new zjx();
                private static final HashMap h;
                final Set a;
                String b;
                boolean c;
                String d;
                String e;
                String f;
                long g;

                static {
                    HashMap hashMap = new HashMap();
                    h = hashMap;
                    hashMap.put("container", FastJsonResponse$Field.f("container", 2));
                    h.put("deleted", FastJsonResponse$Field.e("deleted", 3));
                    h.put("etag", FastJsonResponse$Field.f("etag", 4));
                    h.put("id", FastJsonResponse$Field.f("id", 5));
                    h.put("lastUpdated", FastJsonResponse$Field.f("lastUpdated", 6));
                    h.put("lastUpdatedMicros", FastJsonResponse$Field.b("lastUpdatedMicros", 7));
                }

                public SourceIds() {
                    this.a = new HashSet();
                }

                public final /* bridge */ /* synthetic */ Map a() {
                    return h;
                }

                /* access modifiers changed from: protected */
                public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    switch (i) {
                        case 2:
                            return this.b;
                        case 3:
                            return Boolean.valueOf(this.c);
                        case 4:
                            return this.d;
                        case 5:
                            return this.e;
                        case 6:
                            return this.f;
                        case 7:
                            return Long.valueOf(this.g);
                        default:
                            StringBuilder sb = new StringBuilder(38);
                            sb.append("Unknown safe parcelable id=");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                    }
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof SourceIds)) {
                        return false;
                    }
                    if (this != obj) {
                        SourceIds sourceIds = (SourceIds) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!sourceIds.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(sourceIds.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (sourceIds.a(fastJsonResponse$Field)) {
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

                public SourceIds(Set set, String str, boolean z, String str2, String str3, String str4, long j) {
                    this.a = set;
                    this.b = str;
                    this.c = z;
                    this.d = str2;
                    this.e = str3;
                    this.f = str4;
                    this.g = j;
                }

                /* access modifiers changed from: protected */
                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 7) {
                        this.g = j;
                        this.a.add(Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a long.");
                    throw new IllegalArgumentException(sb.toString());
                }

                public final void writeToParcel(Parcel parcel, int i) {
                    int a2 = ivx.a(parcel);
                    Set set = this.a;
                    if (set.contains(2)) {
                        ivx.a(parcel, 2, this.b, true);
                    }
                    if (set.contains(3)) {
                        ivx.a(parcel, 3, this.c);
                    }
                    if (set.contains(4)) {
                        ivx.a(parcel, 4, this.d, true);
                    }
                    if (set.contains(5)) {
                        ivx.a(parcel, 5, this.e, true);
                    }
                    if (set.contains(6)) {
                        ivx.a(parcel, 6, this.f, true);
                    }
                    if (set.contains(7)) {
                        ivx.a(parcel, 7, this.g);
                    }
                    ivx.b(parcel, a2);
                }

                /* access modifiers changed from: protected */
                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        this.b = str2;
                    } else if (i == 4) {
                        this.d = str2;
                    } else if (i == 5) {
                        this.e = str2;
                    } else if (i == 6) {
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

                /* access modifiers changed from: protected */
                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 3) {
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
                d = hashMap;
                hashMap.put("originalLookupToken", FastJsonResponse$Field.g("originalLookupToken", 2));
                d.put("sourceIds", FastJsonResponse$Field.b("sourceIds", 3, SourceIds.class));
            }

            public IdentityInfo() {
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
                if (!(obj instanceof IdentityInfo)) {
                    return false;
                }
                if (this != obj) {
                    IdentityInfo identityInfo = (IdentityInfo) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!identityInfo.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(identityInfo.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (identityInfo.a(fastJsonResponse$Field)) {
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

            public IdentityInfo(Set set, List list, List list2) {
                this.a = set;
                this.b = list;
                this.c = list2;
            }

            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.g;
                if (i == 3) {
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
            public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    this.b = arrayList;
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
                    ivx.b(parcel, 2, this.b, true);
                }
                if (set.contains(3)) {
                    ivx.c(parcel, 3, this.c, true);
                }
                ivx.b(parcel, a2);
            }

            /* access modifiers changed from: protected */
            public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }
        }

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class ProfileOwnerStats extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new zjy();
            private static final HashMap d;
            public final Set a;
            public long b;
            public long c;

            static {
                HashMap hashMap = new HashMap();
                d = hashMap;
                hashMap.put("incomingAnyCircleCount", FastJsonResponse$Field.b("incomingAnyCircleCount", 2));
                d.put("viewCount", FastJsonResponse$Field.b("viewCount", 3));
            }

            public ProfileOwnerStats() {
                this.a = new HashSet();
            }

            public final /* bridge */ /* synthetic */ Map a() {
                return d;
            }

            /* access modifiers changed from: protected */
            public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    return Long.valueOf(this.b);
                }
                if (i == 3) {
                    return Long.valueOf(this.c);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof ProfileOwnerStats)) {
                    return false;
                }
                if (this != obj) {
                    ProfileOwnerStats profileOwnerStats = (ProfileOwnerStats) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!profileOwnerStats.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(profileOwnerStats.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (profileOwnerStats.a(fastJsonResponse$Field)) {
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

            public ProfileOwnerStats(Set set, long j, long j2) {
                this.a = set;
                this.b = j;
                this.c = j2;
            }

            /* access modifiers changed from: protected */
            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    this.b = j;
                } else if (i == 3) {
                    this.c = j;
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
                if (set.contains(2)) {
                    ivx.a(parcel, 2, this.b);
                }
                if (set.contains(3)) {
                    ivx.a(parcel, 3, this.c);
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
            t = hashMap;
            hashMap.put("affinities", FastJsonResponse$Field.b("affinities", 2, Mergedpeopleaffinities.class));
            t.put("attributions", FastJsonResponse$Field.g("attributions", 3));
            t.put("blockTypes", FastJsonResponse$Field.g("blockTypes", 4));
            t.put("blocked", FastJsonResponse$Field.e("blocked", 5));
            t.put("circles", FastJsonResponse$Field.g("circles", 6));
            t.put("contacts", FastJsonResponse$Field.g("contacts", 7));
            t.put("customResponseMaskingType", FastJsonResponse$Field.f("customResponseMaskingType", 8));
            t.put("deleted", FastJsonResponse$Field.e("deleted", 9));
            t.put("groups", FastJsonResponse$Field.g("groups", 10));
            t.put("identityInfo", FastJsonResponse$Field.a("identityInfo", 11, IdentityInfo.class));
            t.put("inViewerDomain", FastJsonResponse$Field.e("inViewerDomain", 12));
            t.put("incomingBlockTypes", FastJsonResponse$Field.g("incomingBlockTypes", 13));
            t.put("lastUpdateTimeMicros", FastJsonResponse$Field.b("lastUpdateTimeMicros", 14));
            t.put("objectType", FastJsonResponse$Field.f("objectType", 15));
            t.put("ownerId", FastJsonResponse$Field.f("ownerId", 16));
            t.put("ownerUserTypes", FastJsonResponse$Field.g("ownerUserTypes", 17));
            t.put("plusPageType", FastJsonResponse$Field.f("plusPageType", 18));
            t.put("profileOwnerStats", FastJsonResponse$Field.a("profileOwnerStats", 19, ProfileOwnerStats.class));
        }

        public Metadata() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return t;
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
                    return Boolean.valueOf(this.e);
                case 6:
                    return this.f;
                case 7:
                    return this.g;
                case 8:
                    return this.h;
                case 9:
                    return Boolean.valueOf(this.i);
                case 10:
                    return this.j;
                case 11:
                    return this.k;
                case 12:
                    return Boolean.valueOf(this.l);
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    return this.m;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    return Long.valueOf(this.n);
                case Service.START_CONTINUATION_MASK:
                    return this.o;
                case 16:
                    return this.p;
                case 17:
                    return this.q;
                case 18:
                    return this.r;
                case 19:
                    return this.s;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Metadata)) {
                return false;
            }
            if (this != obj) {
                Metadata metadata = (Metadata) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : t.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!metadata.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(metadata.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (metadata.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i2 = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : t.values()) {
                if (a(fastJsonResponse$Field)) {
                    i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i2;
        }

        public Metadata(Set set, List list, List list2, List list3, boolean z, List list4, List list5, String str, boolean z2, List list6, IdentityInfo identityInfo, boolean z3, List list7, long j2, String str2, String str3, List list8, String str4, ProfileOwnerStats profileOwnerStats) {
            this.a = set;
            this.b = list;
            this.c = list2;
            this.d = list3;
            this.e = z;
            this.f = list4;
            this.g = list5;
            this.h = str;
            this.i = z2;
            this.j = list6;
            this.k = identityInfo;
            this.l = z3;
            this.m = list7;
            this.n = j2;
            this.o = str2;
            this.p = str3;
            this.q = list8;
            this.r = str4;
            this.s = profileOwnerStats;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j2) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 14) {
                this.n = j2;
                this.a.add(Integer.valueOf(i2));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.c(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                ivx.b(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.b(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e);
            }
            if (set.contains(6)) {
                ivx.b(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.b(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.h, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.i);
            }
            if (set.contains(10)) {
                ivx.b(parcel, 10, this.j, true);
            }
            if (set.contains(11)) {
                ivx.a(parcel, 11, this.k, i2, true);
            }
            if (set.contains(12)) {
                ivx.a(parcel, 12, this.l);
            }
            if (set.contains(13)) {
                ivx.b(parcel, 13, this.m, true);
            }
            if (set.contains(14)) {
                ivx.a(parcel, 14, this.n);
            }
            if (set.contains(15)) {
                ivx.a(parcel, 15, this.o, true);
            }
            if (set.contains(16)) {
                ivx.a(parcel, 16, this.p, true);
            }
            if (set.contains(17)) {
                ivx.b(parcel, 17, this.q, true);
            }
            if (set.contains(18)) {
                ivx.a(parcel, 18, this.r, true);
            }
            if (set.contains(19)) {
                ivx.a(parcel, 19, this.s, i2, true);
            }
            ivx.b(parcel, a2);
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 11) {
                this.k = (IdentityInfo) jag;
            } else if (i2 == 19) {
                this.s = (ProfileOwnerStats) jag;
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
        public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 3) {
                this.c = arrayList;
            } else if (i2 == 4) {
                this.d = arrayList;
            } else if (i2 == 6) {
                this.f = arrayList;
            } else if (i2 == 7) {
                this.g = arrayList;
            } else if (i2 == 10) {
                this.j = arrayList;
            } else if (i2 == 13) {
                this.m = arrayList;
            } else if (i2 == 17) {
                this.q = arrayList;
            } else {
                StringBuilder sb = new StringBuilder(64);
                sb.append("Field with id=");
                sb.append(i2);
                sb.append(" is not known to be an array of String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.add(Integer.valueOf(i2));
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 8) {
                this.h = str2;
            } else if (i2 == 18) {
                this.r = str2;
            } else if (i2 == 15) {
                this.o = str2;
            } else if (i2 == 16) {
                this.p = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i2);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.add(Integer.valueOf(i2));
        }

        public final boolean b() {
            return this.a.contains(17);
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 2) {
                this.b = arrayList;
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
            if (i2 == 5) {
                this.e = z;
            } else if (i2 == 9) {
                this.i = z;
            } else if (i2 == 12) {
                this.l = z;
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Names extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zjz();
        private static final HashMap o;
        public final Set a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public Mergedpeoplemetadata h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        String n;

        static {
            HashMap hashMap = new HashMap();
            o = hashMap;
            hashMap.put("displayName", FastJsonResponse$Field.f("displayName", 2));
            o.put("familyName", FastJsonResponse$Field.f("familyName", 3));
            o.put("formatted", FastJsonResponse$Field.f("formatted", 4));
            o.put("givenName", FastJsonResponse$Field.f("givenName", 5));
            o.put("honorificPrefix", FastJsonResponse$Field.f("honorificPrefix", 6));
            o.put("honorificSuffix", FastJsonResponse$Field.f("honorificSuffix", 7));
            o.put("metadata", FastJsonResponse$Field.a("metadata", 8, Mergedpeoplemetadata.class));
            o.put("middleName", FastJsonResponse$Field.f("middleName", 9));
            o.put("phoneticFamilyName", FastJsonResponse$Field.f("phoneticFamilyName", 10));
            o.put("phoneticGivenName", FastJsonResponse$Field.f("phoneticGivenName", 11));
            o.put("phoneticHonorificPrefix", FastJsonResponse$Field.f("phoneticHonorificPrefix", 12));
            o.put("phoneticHonorificSuffix", FastJsonResponse$Field.f("phoneticHonorificSuffix", 13));
            o.put("phoneticMiddleName", FastJsonResponse$Field.f("phoneticMiddleName", 14));
        }

        public Names() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return o;
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
                    return this.f;
                case 7:
                    return this.g;
                case 8:
                    return this.h;
                case 9:
                    return this.i;
                case 10:
                    return this.j;
                case 11:
                    return this.k;
                case 12:
                    return this.l;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    return this.m;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    return this.n;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Names)) {
                return false;
            }
            if (this != obj) {
                Names names = (Names) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : o.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!names.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(names.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (names.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i2 = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : o.values()) {
                if (a(fastJsonResponse$Field)) {
                    i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i2;
        }

        public Names(Set set, String str, String str2, String str3, String str4, String str5, String str6, Mergedpeoplemetadata mergedpeoplemetadata, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = mergedpeoplemetadata;
            this.i = str7;
            this.j = str8;
            this.k = str9;
            this.l = str10;
            this.m = str11;
            this.n = str12;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 8) {
                this.h = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, true);
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
                ivx.a(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.h, i2, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.i, true);
            }
            if (set.contains(10)) {
                ivx.a(parcel, 10, this.j, true);
            }
            if (set.contains(11)) {
                ivx.a(parcel, 11, this.k, true);
            }
            if (set.contains(12)) {
                ivx.a(parcel, 12, this.l, true);
            }
            if (set.contains(13)) {
                ivx.a(parcel, 13, this.m, true);
            }
            if (set.contains(14)) {
                ivx.a(parcel, 14, this.n, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i2 = fastJsonResponse$Field.g;
            switch (i2) {
                case 2:
                    this.b = str2;
                    break;
                case 3:
                    this.c = str2;
                    break;
                case 4:
                    this.d = str2;
                    break;
                case 5:
                    this.e = str2;
                    break;
                case 6:
                    this.f = str2;
                    break;
                case 7:
                    this.g = str2;
                    break;
                case 9:
                    this.i = str2;
                    break;
                case 10:
                    this.j = str2;
                    break;
                case 11:
                    this.k = str2;
                    break;
                case 12:
                    this.l = str2;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    this.m = str2;
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    this.n = str2;
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Nicknames extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zka();
        private static final HashMap e;
        public final Set a;
        public Mergedpeoplemetadata b;
        public String c;
        public String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            e.put("type", FastJsonResponse$Field.f("type", 3));
            e.put("value", FastJsonResponse$Field.f("value", 4));
        }

        public Nicknames() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return e;
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
            if (i == 4) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Nicknames)) {
                return false;
            }
            if (this != obj) {
                Nicknames nicknames = (Nicknames) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!nicknames.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(nicknames.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (nicknames.a(fastJsonResponse$Field)) {
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

        public Nicknames(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
            this.d = str2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Occupations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkb();
        private static final HashMap d;
        public final Set a;
        public Mergedpeoplemetadata b;
        public String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            d.put("value", FastJsonResponse$Field.f("value", 3));
        }

        public Occupations() {
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
            if (!(obj instanceof Occupations)) {
                return false;
            }
            if (this != obj) {
                Occupations occupations = (Occupations) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!occupations.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(occupations.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (occupations.a(fastJsonResponse$Field)) {
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

        public Occupations(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Organizations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkc();
        private static final HashMap o;
        public final Set a;
        public boolean b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public Mergedpeoplemetadata h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;

        static {
            HashMap hashMap = new HashMap();
            o = hashMap;
            hashMap.put("current", FastJsonResponse$Field.e("current", 2));
            o.put("department", FastJsonResponse$Field.f("department", 3));
            o.put("description", FastJsonResponse$Field.f("description", 4));
            o.put("domain", FastJsonResponse$Field.f("domain", 5));
            o.put("endDate", FastJsonResponse$Field.f("endDate", 6));
            o.put("location", FastJsonResponse$Field.f("location", 8));
            o.put("metadata", FastJsonResponse$Field.a("metadata", 9, Mergedpeoplemetadata.class));
            o.put("name", FastJsonResponse$Field.f("name", 10));
            o.put("phoneticName", FastJsonResponse$Field.f("phoneticName", 11));
            o.put("startDate", FastJsonResponse$Field.f("startDate", 12));
            o.put("symbol", FastJsonResponse$Field.f("symbol", 14));
            o.put("title", FastJsonResponse$Field.f("title", 15));
            o.put("type", FastJsonResponse$Field.f("type", 16));
        }

        public Organizations() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return o;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i2 = fastJsonResponse$Field.g;
            switch (i2) {
                case 2:
                    return Boolean.valueOf(this.b);
                case 3:
                    return this.c;
                case 4:
                    return this.d;
                case 5:
                    return this.e;
                case 6:
                    return this.f;
                case 8:
                    return this.g;
                case 9:
                    return this.h;
                case 10:
                    return this.i;
                case 11:
                    return this.j;
                case 12:
                    return this.k;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    return this.l;
                case Service.START_CONTINUATION_MASK:
                    return this.m;
                case 16:
                    return this.n;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Organizations)) {
                return false;
            }
            if (this != obj) {
                Organizations organizations = (Organizations) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : o.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!organizations.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(organizations.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (organizations.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i2 = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : o.values()) {
                if (a(fastJsonResponse$Field)) {
                    i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i2;
        }

        public Organizations(Set set, boolean z, String str, String str2, String str3, String str4, String str5, Mergedpeoplemetadata mergedpeoplemetadata, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.a = set;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = mergedpeoplemetadata;
            this.i = str6;
            this.j = str7;
            this.k = str8;
            this.l = str9;
            this.m = str10;
            this.n = str11;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 9) {
                this.h = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b);
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
                ivx.a(parcel, 6, this.f, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.g, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.h, i2, true);
            }
            if (set.contains(10)) {
                ivx.a(parcel, 10, this.i, true);
            }
            if (set.contains(11)) {
                ivx.a(parcel, 11, this.j, true);
            }
            if (set.contains(12)) {
                ivx.a(parcel, 12, this.k, true);
            }
            if (set.contains(14)) {
                ivx.a(parcel, 14, this.l, true);
            }
            if (set.contains(15)) {
                ivx.a(parcel, 15, this.m, true);
            }
            if (set.contains(16)) {
                ivx.a(parcel, 16, this.n, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i2 = fastJsonResponse$Field.g;
            switch (i2) {
                case 3:
                    this.c = str2;
                    break;
                case 4:
                    this.d = str2;
                    break;
                case 5:
                    this.e = str2;
                    break;
                case 6:
                    this.f = str2;
                    break;
                case 8:
                    this.g = str2;
                    break;
                case 10:
                    this.i = str2;
                    break;
                case 11:
                    this.j = str2;
                    break;
                case 12:
                    this.k = str2;
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    this.l = str2;
                    break;
                case Service.START_CONTINUATION_MASK:
                    this.m = str2;
                    break;
                case 16:
                    this.n = str2;
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
            if (i2 == 2) {
                this.b = z;
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
    public final class OtherKeywords extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkd();
        private static final HashMap e;
        final Set a;
        Mergedpeoplemetadata b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            e.put("type", FastJsonResponse$Field.f("type", 3));
            e.put("value", FastJsonResponse$Field.f("value", 4));
        }

        public OtherKeywords() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return e;
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
            if (i == 4) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OtherKeywords)) {
                return false;
            }
            if (this != obj) {
                OtherKeywords otherKeywords = (OtherKeywords) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!otherKeywords.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(otherKeywords.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (otherKeywords.a(fastJsonResponse$Field)) {
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

        public OtherKeywords(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
            this.d = str2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class PhoneNumbers extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zke();
        private static final HashMap g;
        public final Set a;
        public String b;
        public String c;
        public Mergedpeoplemetadata d;
        public String e;
        public String f;

        static {
            HashMap hashMap = new HashMap();
            g = hashMap;
            hashMap.put("canonicalizedForm", FastJsonResponse$Field.f("canonicalizedForm", 2));
            g.put("formattedType", FastJsonResponse$Field.f("formattedType", 4));
            g.put("metadata", FastJsonResponse$Field.a("metadata", 5, Mergedpeoplemetadata.class));
            g.put("type", FastJsonResponse$Field.f("type", 6));
            g.put("value", FastJsonResponse$Field.f("value", 8));
        }

        public PhoneNumbers() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return g;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 8) {
                return this.f;
            }
            if (i == 4) {
                return this.c;
            }
            if (i == 5) {
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

        public final boolean equals(Object obj) {
            if (!(obj instanceof PhoneNumbers)) {
                return false;
            }
            if (this != obj) {
                PhoneNumbers phoneNumbers = (PhoneNumbers) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!phoneNumbers.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(phoneNumbers.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (phoneNumbers.a(fastJsonResponse$Field)) {
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

        public PhoneNumbers(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3, String str4) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = mergedpeoplemetadata;
            this.e = str3;
            this.f = str4;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 5) {
                this.d = (Mergedpeoplemetadata) jag;
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
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.c, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.d, i, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.e, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.f, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.c = str2;
            } else if (i == 6) {
                this.e = str2;
            } else if (i == 8) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class PlacesLived extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkf();
        private static final HashMap e;
        public final Set a;
        public boolean b;
        public Mergedpeoplemetadata c;
        public String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("current", FastJsonResponse$Field.e("current", 2));
            e.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
            e.put("value", FastJsonResponse$Field.f("value", 4));
        }

        public PlacesLived() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return e;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return Boolean.valueOf(this.b);
            }
            if (i == 3) {
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

        public final boolean equals(Object obj) {
            if (!(obj instanceof PlacesLived)) {
                return false;
            }
            if (this != obj) {
                PlacesLived placesLived = (PlacesLived) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!placesLived.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(placesLived.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (placesLived.a(fastJsonResponse$Field)) {
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

        public PlacesLived(Set set, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = z;
            this.c = mergedpeoplemetadata;
            this.d = str;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
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
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = z;
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
    public final class Relations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkg();
        private static final HashMap f;
        public final Set a;
        public String b;
        public Mergedpeoplemetadata c;
        public String d;
        public String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("formattedType", FastJsonResponse$Field.f("formattedType", 2));
            f.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
            f.put("type", FastJsonResponse$Field.f("type", 4));
            f.put("value", FastJsonResponse$Field.f("value", 5));
        }

        public Relations() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
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
            if (!(obj instanceof Relations)) {
                return false;
            }
            if (this != obj) {
                Relations relations = (Relations) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!relations.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(relations.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (relations.a(fastJsonResponse$Field)) {
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

        public Relations(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.d = str2;
            } else if (i == 5) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class SipAddress extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkh();
        private static final HashMap e;
        final Set a;
        Mergedpeoplemetadata b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            e.put("type", FastJsonResponse$Field.f("type", 3));
            e.put("value", FastJsonResponse$Field.f("value", 4));
        }

        public SipAddress() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return e;
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
            if (i == 4) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SipAddress)) {
                return false;
            }
            if (this != obj) {
                SipAddress sipAddress = (SipAddress) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!sipAddress.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(sipAddress.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (sipAddress.a(fastJsonResponse$Field)) {
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

        public SipAddress(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
            this.d = str2;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Skills extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zki();
        private static final HashMap d;
        public final Set a;
        public Mergedpeoplemetadata b;
        public String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            d.put("value", FastJsonResponse$Field.f("value", 3));
        }

        public Skills() {
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
            if (!(obj instanceof Skills)) {
                return false;
            }
            if (this != obj) {
                Skills skills = (Skills) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!skills.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(skills.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (skills.a(fastJsonResponse$Field)) {
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

        public Skills(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class SortKeys extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkj();
        private static final HashMap g;
        public final Set a;
        List b;
        String c;
        public String d;
        String e;
        public String f;

        static {
            HashMap hashMap = new HashMap();
            g = hashMap;
            hashMap.put("affinities", FastJsonResponse$Field.b("affinities", 2, Mergedpeopleaffinities.class));
            g.put("firstName", FastJsonResponse$Field.f("firstName", 3));
            g.put("interactionRank", FastJsonResponse$Field.f("interactionRank", 4));
            g.put("lastName", FastJsonResponse$Field.f("lastName", 5));
            g.put("name", FastJsonResponse$Field.f("name", 6));
        }

        public SortKeys() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return g;
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
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            if (i == 6) {
                return this.f;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SortKeys)) {
                return false;
            }
            if (this != obj) {
                SortKeys sortKeys = (SortKeys) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!sortKeys.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(sortKeys.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (sortKeys.a(fastJsonResponse$Field)) {
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

        public SortKeys(Set set, List list, String str, String str2, String str3, String str4) {
            this.a = set;
            this.b = list;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = str2;
            } else if (i == 4) {
                this.d = str2;
            } else if (i == 5) {
                this.e = str2;
            } else if (i == 6) {
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
                ivx.a(parcel, 6, this.f, true);
            }
            ivx.b(parcel, a2);
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Taglines extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkk();
        private static final HashMap d;
        public final Set a;
        public Mergedpeoplemetadata b;
        public String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.a("metadata", 2, Mergedpeoplemetadata.class));
            d.put("value", FastJsonResponse$Field.f("value", 3));
        }

        public Taglines() {
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
            if (!(obj instanceof Taglines)) {
                return false;
            }
            if (this != obj) {
                Taglines taglines = (Taglines) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!taglines.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(taglines.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (taglines.a(fastJsonResponse$Field)) {
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

        public Taglines(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = (Mergedpeoplemetadata) jag;
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
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
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

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Urls extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new zkl();
        private static final HashMap f;
        public final Set a;
        public String b;
        public Mergedpeoplemetadata c;
        public String d;
        public String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("formattedType", FastJsonResponse$Field.f("formattedType", 2));
            f.put("metadata", FastJsonResponse$Field.a("metadata", 3, Mergedpeoplemetadata.class));
            f.put("type", FastJsonResponse$Field.f("type", 5));
            f.put("value", FastJsonResponse$Field.f("value", 6));
        }

        public Urls() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
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
            if (i == 5) {
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

        public final boolean equals(Object obj) {
            if (!(obj instanceof Urls)) {
                return false;
            }
            if (this != obj) {
                Urls urls = (Urls) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!urls.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(urls.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (urls.a(fastJsonResponse$Field)) {
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

        public Urls(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = (Mergedpeoplemetadata) jag;
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
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.d, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 5) {
                this.d = str2;
            } else if (i == 6) {
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        M = hashMap;
        hashMap.put("abouts", FastJsonResponse$Field.b("abouts", 2, Abouts.class));
        M.put("addresses", FastJsonResponse$Field.b("addresses", 3, Addresses.class));
        M.put("birthdays", FastJsonResponse$Field.b("birthdays", 5, Birthdays.class));
        M.put("braggingRights", FastJsonResponse$Field.b("braggingRights", 6, BraggingRights.class));
        M.put("calendars", FastJsonResponse$Field.b("calendars", 7, Calendars.class));
        M.put("clientData", FastJsonResponse$Field.b("clientData", 8, ClientData.class));
        M.put("coverPhotos", FastJsonResponse$Field.b("coverPhotos", 9, CoverPhotos.class));
        M.put("customFields", FastJsonResponse$Field.b("customFields", 10, CustomFields.class));
        M.put("emails", FastJsonResponse$Field.b("emails", 11, Emails.class));
        M.put("etag", FastJsonResponse$Field.f("etag", 12));
        M.put("events", FastJsonResponse$Field.b("events", 13, Events.class));
        M.put("extendedData", FastJsonResponse$Field.a("extendedData", 14, ExtendedData.class));
        M.put("externalIds", FastJsonResponse$Field.b("externalIds", 15, ExternalIds.class));
        M.put("genders", FastJsonResponse$Field.b("genders", 17, Genders.class));
        M.put("id", FastJsonResponse$Field.f("id", 18));
        M.put("images", FastJsonResponse$Field.b("images", 19, Images.class));
        M.put("instantMessaging", FastJsonResponse$Field.b("instantMessaging", 21, InstantMessaging.class));
        M.put("interests", FastJsonResponse$Field.b("interests", 22, Interests.class));
        M.put("language", FastJsonResponse$Field.f("language", 24));
        M.put("languages", FastJsonResponse$Field.b("languages", 25, Languages.class));
        M.put("legacyFields", FastJsonResponse$Field.a("legacyFields", 26, LegacyFields.class));
        M.put("memberships", FastJsonResponse$Field.b("memberships", 28, Memberships.class));
        M.put("metadata", FastJsonResponse$Field.a("metadata", 29, Metadata.class));
        M.put("names", FastJsonResponse$Field.b("names", 30, Names.class));
        M.put("nicknames", FastJsonResponse$Field.b("nicknames", 31, Nicknames.class));
        M.put("occupations", FastJsonResponse$Field.b("occupations", 32, Occupations.class));
        M.put("organizations", FastJsonResponse$Field.b("organizations", 33, Organizations.class));
        M.put("otherKeywords", FastJsonResponse$Field.b("otherKeywords", 34, OtherKeywords.class));
        M.put("phoneNumbers", FastJsonResponse$Field.b("phoneNumbers", 36, PhoneNumbers.class));
        M.put("placesLived", FastJsonResponse$Field.b("placesLived", 38, PlacesLived.class));
        M.put("profileUrl", FastJsonResponse$Field.f("profileUrl", 39));
        M.put("relations", FastJsonResponse$Field.b("relations", 40, Relations.class));
        M.put("sipAddress", FastJsonResponse$Field.b("sipAddress", 43, SipAddress.class));
        M.put("skills", FastJsonResponse$Field.b("skills", 44, Skills.class));
        M.put("sortKeys", FastJsonResponse$Field.a("sortKeys", 45, SortKeys.class));
        M.put("taglines", FastJsonResponse$Field.b("taglines", 46, Taglines.class));
        M.put("urls", FastJsonResponse$Field.b("urls", 47, Urls.class));
    }

    public Person() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return M;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 5:
                return this.d;
            case 6:
                return this.e;
            case 7:
                return this.f;
            case 8:
                return this.g;
            case 9:
                return this.h;
            case 10:
                return this.i;
            case 11:
                return this.j;
            case 12:
                return this.k;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return this.l;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return this.m;
            case Service.START_CONTINUATION_MASK:
                return this.n;
            case 17:
                return this.o;
            case 18:
                return this.p;
            case 19:
                return this.q;
            case 21:
                return this.r;
            case 22:
                return this.s;
            case 24:
                return this.t;
            case 25:
                return this.u;
            case 26:
                return this.v;
            case 28:
                return this.w;
            case 29:
                return this.x;
            case 30:
                return this.y;
            case 31:
                return this.z;
            case 32:
                return this.A;
            case 33:
                return this.B;
            case 34:
                return this.C;
            case 36:
                return this.D;
            case 38:
                return this.E;
            case 39:
                return this.F;
            case 40:
                return this.G;
            case 43:
                return this.H;
            case 44:
                return this.I;
            case 45:
                return this.J;
            case 46:
                return this.K;
            case 47:
                return this.L;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this != obj) {
            Person person = (Person) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : M.values()) {
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
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : M.values()) {
            if (a(fastJsonResponse$Field)) {
                i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i2;
    }

    public Person(Set set, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, String str, List list10, ExtendedData extendedData, List list11, List list12, String str2, List list13, List list14, List list15, String str3, List list16, LegacyFields legacyFields, List list17, Metadata metadata, List list18, List list19, List list20, List list21, List list22, List list23, List list24, String str4, List list25, List list26, List list27, SortKeys sortKeys, List list28, List list29) {
        this.a = set;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
        this.h = list7;
        this.i = list8;
        this.j = list9;
        this.k = str;
        this.l = list10;
        this.m = extendedData;
        this.n = list11;
        this.o = list12;
        this.p = str2;
        this.q = list13;
        this.r = list14;
        this.s = list15;
        this.t = str3;
        this.u = list16;
        this.v = legacyFields;
        this.w = list17;
        this.x = metadata;
        this.y = list18;
        this.z = list19;
        this.A = list20;
        this.B = list21;
        this.C = list22;
        this.D = list23;
        this.E = list24;
        this.F = str4;
        this.G = list25;
        this.H = list26;
        this.I = list27;
        this.J = sortKeys;
        this.K = list28;
        this.L = list29;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 14) {
            this.m = (ExtendedData) jag;
        } else if (i2 == 26) {
            this.v = (LegacyFields) jag;
        } else if (i2 == 29) {
            this.x = (Metadata) jag;
        } else if (i2 == 45) {
            this.J = (SortKeys) jag;
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
        if (set.contains(2)) {
            ivx.c(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.c(parcel, 3, this.c, true);
        }
        if (set.contains(5)) {
            ivx.c(parcel, 5, this.d, true);
        }
        if (set.contains(6)) {
            ivx.c(parcel, 6, this.e, true);
        }
        if (set.contains(7)) {
            ivx.c(parcel, 7, this.f, true);
        }
        if (set.contains(8)) {
            ivx.c(parcel, 8, this.g, true);
        }
        if (set.contains(9)) {
            ivx.c(parcel, 9, this.h, true);
        }
        if (set.contains(10)) {
            ivx.c(parcel, 10, this.i, true);
        }
        if (set.contains(11)) {
            ivx.c(parcel, 11, this.j, true);
        }
        if (set.contains(12)) {
            ivx.a(parcel, 12, this.k, true);
        }
        if (set.contains(13)) {
            ivx.c(parcel, 13, this.l, true);
        }
        if (set.contains(14)) {
            ivx.a(parcel, 14, this.m, i2, true);
        }
        if (set.contains(15)) {
            ivx.c(parcel, 15, this.n, true);
        }
        if (set.contains(17)) {
            ivx.c(parcel, 17, this.o, true);
        }
        if (set.contains(18)) {
            ivx.a(parcel, 18, this.p, true);
        }
        if (set.contains(19)) {
            ivx.c(parcel, 19, this.q, true);
        }
        if (set.contains(21)) {
            ivx.c(parcel, 21, this.r, true);
        }
        if (set.contains(22)) {
            ivx.c(parcel, 22, this.s, true);
        }
        if (set.contains(24)) {
            ivx.a(parcel, 24, this.t, true);
        }
        if (set.contains(25)) {
            ivx.c(parcel, 25, this.u, true);
        }
        if (set.contains(26)) {
            ivx.a(parcel, 26, this.v, i2, true);
        }
        if (set.contains(28)) {
            ivx.c(parcel, 28, this.w, true);
        }
        if (set.contains(29)) {
            ivx.a(parcel, 29, this.x, i2, true);
        }
        if (set.contains(30)) {
            ivx.c(parcel, 30, this.y, true);
        }
        if (set.contains(31)) {
            ivx.c(parcel, 31, this.z, true);
        }
        if (set.contains(32)) {
            ivx.c(parcel, 32, this.A, true);
        }
        if (set.contains(33)) {
            ivx.c(parcel, 33, this.B, true);
        }
        if (set.contains(34)) {
            ivx.c(parcel, 34, this.C, true);
        }
        if (set.contains(36)) {
            ivx.c(parcel, 36, this.D, true);
        }
        if (set.contains(38)) {
            ivx.c(parcel, 38, this.E, true);
        }
        if (set.contains(39)) {
            ivx.a(parcel, 39, this.F, true);
        }
        if (set.contains(40)) {
            ivx.c(parcel, 40, this.G, true);
        }
        if (set.contains(43)) {
            ivx.c(parcel, 43, this.H, true);
        }
        if (set.contains(44)) {
            ivx.c(parcel, 44, this.I, true);
        }
        if (set.contains(45)) {
            ivx.a(parcel, 45, this.J, i2, true);
        }
        if (set.contains(46)) {
            ivx.c(parcel, 46, this.K, true);
        }
        if (set.contains(47)) {
            ivx.c(parcel, 47, this.L, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 12) {
            this.k = str2;
        } else if (i2 == 18) {
            this.p = str2;
        } else if (i2 == 24) {
            this.t = str2;
        } else if (i2 == 39) {
            this.F = str2;
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
        switch (i2) {
            case 2:
                this.b = arrayList;
                break;
            case 3:
                this.c = arrayList;
                break;
            case 5:
                this.d = arrayList;
                break;
            case 6:
                this.e = arrayList;
                break;
            case 7:
                this.f = arrayList;
                break;
            case 8:
                this.g = arrayList;
                break;
            case 9:
                this.h = arrayList;
                break;
            case 10:
                this.i = arrayList;
                break;
            case 11:
                this.j = arrayList;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                this.l = arrayList;
                break;
            case Service.START_CONTINUATION_MASK:
                this.n = arrayList;
                break;
            case 17:
                this.o = arrayList;
                break;
            case 19:
                this.q = arrayList;
                break;
            case 21:
                this.r = arrayList;
                break;
            case 22:
                this.s = arrayList;
                break;
            case 25:
                this.u = arrayList;
                break;
            case 28:
                this.w = arrayList;
                break;
            case 30:
                this.y = arrayList;
                break;
            case 31:
                this.z = arrayList;
                break;
            case 32:
                this.A = arrayList;
                break;
            case 33:
                this.B = arrayList;
                break;
            case 34:
                this.C = arrayList;
                break;
            case 36:
                this.D = arrayList;
                break;
            case 38:
                this.E = arrayList;
                break;
            case 40:
                this.G = arrayList;
                break;
            case 43:
                this.H = arrayList;
                break;
            case 44:
                this.I = arrayList;
                break;
            case 46:
                this.K = arrayList;
                break;
            case 47:
                this.L = arrayList;
                break;
            default:
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
