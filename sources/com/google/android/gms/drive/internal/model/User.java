package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class User extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new kyj();
    private static final HashMap g;
    final Set a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public Picture f;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Picture extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new kyk();
        private static final HashMap c;
        final Set a;
        public String b;

        static {
            HashMap hashMap = new HashMap();
            c = hashMap;
            hashMap.put("url", FastJsonResponse$Field.f("url", 2));
        }

        public Picture() {
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
            if (!(obj instanceof Picture)) {
                return false;
            }
            if (this != obj) {
                Picture picture = (Picture) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!picture.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(picture.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (picture.a(fastJsonResponse$Field)) {
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

        public Picture(Set set, String str) {
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
        g = hashMap;
        hashMap.put("displayName", FastJsonResponse$Field.f("displayName", 2));
        g.put("emailAddress", FastJsonResponse$Field.f("emailAddress", 5));
        g.put("isAuthenticatedUser", FastJsonResponse$Field.e("isAuthenticatedUser", 7));
        g.put("permissionId", FastJsonResponse$Field.f("permissionId", 9));
        g.put("picture", FastJsonResponse$Field.a("picture", 10, Picture.class));
    }

    public User() {
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
        if (i == 5) {
            return this.c;
        }
        if (i == 7) {
            return Boolean.valueOf(this.d);
        }
        if (i == 9) {
            return this.e;
        }
        if (i == 10) {
            return this.f;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        if (this != obj) {
            User user = (User) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!user.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(user.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (user.a(fastJsonResponse$Field)) {
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

    public User(Set set, String str, String str2, boolean z, String str3, Picture picture) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = picture;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 10) {
            this.f = (Picture) jag;
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
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.c, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.d);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.e, true);
        }
        if (set.contains(10)) {
            ivx.a(parcel, 10, this.f, i, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 5) {
            this.c = str2;
        } else if (i == 9) {
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
        if (i == 7) {
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
