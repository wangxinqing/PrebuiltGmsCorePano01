package com.google.android.gms.drive.internal.model;

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
public final class About extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new kxv();
    private static final HashMap f;
    public final Set a;
    public List b;
    public long c;
    public List d;
    public long e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class MaxUploadSizes extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new kxw();
        private static final HashMap d;
        final Set a;
        public long b;
        public String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("size", FastJsonResponse$Field.b("size", 2));
            d.put("type", FastJsonResponse$Field.f("type", 3));
        }

        public MaxUploadSizes() {
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
                return this.c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof MaxUploadSizes)) {
                return false;
            }
            if (this != obj) {
                MaxUploadSizes maxUploadSizes = (MaxUploadSizes) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!maxUploadSizes.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(maxUploadSizes.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (maxUploadSizes.a(fastJsonResponse$Field)) {
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

        public MaxUploadSizes(Set set, long j, String str) {
            this.a = set;
            this.b = j;
            this.c = str;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = j;
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
                ivx.a(parcel, 2, this.b);
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

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("folderColorPalette", FastJsonResponse$Field.g("folderColorPalette", 8));
        f.put("largestChangeId", FastJsonResponse$Field.b("largestChangeId", 13));
        f.put("maxUploadSizes", FastJsonResponse$Field.b("maxUploadSizes", 14, MaxUploadSizes.class));
        f.put("remainingChangeIds", FastJsonResponse$Field.b("remainingChangeIds", 24));
    }

    public About() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return f;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 8) {
            return this.b;
        }
        if (i == 24) {
            return Long.valueOf(this.e);
        }
        if (i == 13) {
            return Long.valueOf(this.c);
        }
        if (i == 14) {
            return this.d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof About)) {
            return false;
        }
        if (this != obj) {
            About about = (About) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!about.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(about.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (about.a(fastJsonResponse$Field)) {
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

    public About(Set set, List list, long j, List list2, long j2) {
        this.a = set;
        this.b = list;
        this.c = j;
        this.d = list2;
        this.e = j2;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 13) {
            this.c = j;
        } else if (i == 24) {
            this.e = j;
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
        if (set.contains(8)) {
            ivx.b(parcel, 8, this.b, true);
        }
        if (set.contains(13)) {
            ivx.a(parcel, 13, this.c);
        }
        if (set.contains(14)) {
            ivx.c(parcel, 14, this.d, true);
        }
        if (set.contains(24)) {
            ivx.a(parcel, 24, this.e);
        }
        ivx.b(parcel, a2);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 14) {
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
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 8) {
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

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
