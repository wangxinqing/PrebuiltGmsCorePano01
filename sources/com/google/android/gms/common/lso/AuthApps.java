package com.google.android.gms.common.lso;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AuthApps extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new iwe();
    private static final HashMap d;
    public final Set a;
    public List b;
    public List c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Api_scopes extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new iwf();
        private static final HashMap f;
        final Set a;
        public String b;
        String c;
        public int d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("description", FastJsonResponse$Field.f("description", 2));
            f.put("detail", FastJsonResponse$Field.f("detail", 3));
            f.put("scope_id", FastJsonResponse$Field.a("scope_id", 4));
            f.put("summary", FastJsonResponse$Field.f("summary", 5));
        }

        public Api_scopes() {
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
                return Integer.valueOf(this.d);
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
            if (!(obj instanceof Api_scopes)) {
                return false;
            }
            if (this != obj) {
                Api_scopes api_scopes = (Api_scopes) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!api_scopes.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(api_scopes.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (api_scopes.a(fastJsonResponse$Field)) {
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

        public Api_scopes(Set set, String str, String str2, int i, String str3) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = str3;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 4) {
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
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.b(parcel, 4, this.d);
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
    public final class Apps extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new iwg();
        private static final HashMap i;
        public final Set a;
        public List b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public List h;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class Clients extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new iwh();
            private static final HashMap h;
            public final Set a;
            public String b;
            public String c;
            String d;
            String e;
            String f;
            String g;

            static {
                HashMap hashMap = new HashMap();
                h = hashMap;
                hashMap.put("android_package_name", FastJsonResponse$Field.f("android_package_name", 2));
                h.put("certificate", FastJsonResponse$Field.f("certificate", 3));
                h.put("client_id", FastJsonResponse$Field.f("client_id", 4));
                h.put("ios_app_store_id", FastJsonResponse$Field.f("ios_app_store_id", 5));
                h.put("ios_bundle_name", FastJsonResponse$Field.f("ios_bundle_name", 6));
                h.put("type", FastJsonResponse$Field.f("type", 7));
            }

            public Clients() {
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
                if (!(obj instanceof Clients)) {
                    return false;
                }
                if (this != obj) {
                    Clients clients = (Clients) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!clients.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(clients.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (clients.a(fastJsonResponse$Field)) {
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

            public Clients(Set set, String str, String str2, String str3, String str4, String str5, String str6) {
                this.a = set;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = str5;
                this.g = str6;
            }

            /* access modifiers changed from: protected */
            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                int i = fastJsonResponse$Field.g;
                switch (i) {
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
                    default:
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
                ivx.b(parcel, a2);
            }

            /* access modifiers changed from: protected */
            public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            i = hashMap;
            hashMap.put("clients", FastJsonResponse$Field.b("clients", 2, Clients.class));
            i.put("display_name", FastJsonResponse$Field.f("display_name", 3));
            i.put("icon_url", FastJsonResponse$Field.f("icon_url", 4));
            i.put("project_id", FastJsonResponse$Field.f("project_id", 5));
            i.put("revocation_handle", FastJsonResponse$Field.f("revocation_handle", 6));
            i.put("revocation_message", FastJsonResponse$Field.f("revocation_message", 7));
            i.put("scope_ids", new FastJsonResponse$Field(0, true, 0, true, "scope_ids", 8, (Class) null, (StringToIntConverter) null));
        }

        public Apps() {
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
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: protected */
        public final void c(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 8) {
                this.h = arrayList;
                this.a.add(Integer.valueOf(i2));
                return;
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an array of ints.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Apps)) {
                return false;
            }
            if (this != obj) {
                Apps apps = (Apps) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : i.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!apps.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(apps.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (apps.a(fastJsonResponse$Field)) {
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

        public Apps(Set set, List list, String str, String str2, String str3, String str4, String str5, List list2) {
            this.a = set;
            this.b = list;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = list2;
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
            } else if (i2 == 6) {
                this.f = str2;
            } else if (i2 == 7) {
                this.g = str2;
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
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.h, true);
            }
            ivx.b(parcel, a2);
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
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("api_scopes", FastJsonResponse$Field.b("api_scopes", 2, Api_scopes.class));
        d.put("apps", FastJsonResponse$Field.b("apps", 3, Apps.class));
    }

    public AuthApps() {
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
        if (!(obj instanceof AuthApps)) {
            return false;
        }
        if (this != obj) {
            AuthApps authApps = (AuthApps) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!authApps.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(authApps.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (authApps.a(fastJsonResponse$Field)) {
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

    public AuthApps(Set set, List list, List list2) {
        this.a = set;
        this.b = list;
        this.c = list2;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
        } else if (i == 3) {
            this.c = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
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
            ivx.c(parcel, 2, this.b, true);
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
