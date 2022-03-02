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
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class File extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new kya();
    private static final HashMap Z;
    public String A;
    public String B;
    public String C;
    public String D;
    public List E;
    List F;
    public List G;
    public List H;
    public List I;
    public long J;
    public String K;
    public String L;
    public boolean M;
    public String N;
    public User O;
    public List P;
    public boolean Q;
    public Thumbnail R;
    public String S;
    public String T;
    public Permission U;
    public long V;
    public String W;
    public String X;
    public boolean Y;
    public final Set a;
    public String b;
    public boolean c;
    public List d;
    public boolean e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String l;
    public boolean m;
    public String n;
    public long o;
    public String p;
    public List q;
    public boolean r;
    public String s;
    public String t;
    public IndexableText u;
    public Labels v;
    public User w;
    public String x;
    public FileLocalId y;
    public String z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class IndexableText extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new kyd();
        private static final HashMap c;
        public final Set a;
        public String b;

        static {
            HashMap hashMap = new HashMap();
            c = hashMap;
            hashMap.put("text", FastJsonResponse$Field.f("text", 2));
        }

        public IndexableText() {
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
            if (!(obj instanceof IndexableText)) {
                return false;
            }
            if (this != obj) {
                IndexableText indexableText = (IndexableText) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!indexableText.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(indexableText.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (indexableText.a(fastJsonResponse$Field)) {
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

        public IndexableText(Set set, String str) {
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
    public final class Labels extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new kye();
        private static final HashMap f;
        public final Set a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("restricted", FastJsonResponse$Field.e("restricted", 3));
            f.put("starred", FastJsonResponse$Field.e("starred", 4));
            f.put("trashed", FastJsonResponse$Field.e("trashed", 5));
            f.put("viewed", FastJsonResponse$Field.e("viewed", 6));
        }

        public Labels() {
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return f;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                return Boolean.valueOf(this.b);
            }
            if (i == 4) {
                return Boolean.valueOf(this.c);
            }
            if (i == 5) {
                return Boolean.valueOf(this.d);
            }
            if (i == 6) {
                return Boolean.valueOf(this.e);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Labels)) {
                return false;
            }
            if (this != obj) {
                Labels labels = (Labels) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!labels.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(labels.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (labels.a(fastJsonResponse$Field)) {
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

        public Labels(Set set, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = set;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.b = z;
            } else if (i == 4) {
                this.c = z;
            } else if (i == 5) {
                this.d = z;
            } else if (i == 6) {
                this.e = z;
            } else {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a boolean.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.b);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.c);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.d);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.e);
            }
            ivx.b(parcel, a2);
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Thumbnail extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new kyf();
        private static final HashMap d;
        public final Set a;
        public String b;
        public String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("image", FastJsonResponse$Field.f("image", 2));
            d.put("mimeType", FastJsonResponse$Field.f("mimeType", 3));
        }

        public Thumbnail() {
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
            if (!(obj instanceof Thumbnail)) {
                return false;
            }
            if (this != obj) {
                Thumbnail thumbnail = (Thumbnail) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!thumbnail.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(thumbnail.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (thumbnail.a(fastJsonResponse$Field)) {
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

        public Thumbnail(Set set, String str, String str2) {
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
        Z = hashMap;
        hashMap.put("alternateLink", FastJsonResponse$Field.f("alternateLink", 2));
        Z.put("appDataContents", FastJsonResponse$Field.e("appDataContents", 3));
        Z.put("authorizedAppIds", FastJsonResponse$Field.g("authorizedAppIds", 4));
        Z.put("copyable", FastJsonResponse$Field.e("copyable", 6));
        Z.put("createdDate", FastJsonResponse$Field.f("createdDate", 7));
        Z.put("creatorAppId", FastJsonResponse$Field.f("creatorAppId", 8));
        Z.put("description", FastJsonResponse$Field.f("description", 11));
        Z.put("downloadUrl", FastJsonResponse$Field.f("downloadUrl", 12));
        Z.put("editable", FastJsonResponse$Field.e("editable", 14));
        Z.put("embedLink", FastJsonResponse$Field.f("embedLink", 16));
        Z.put("etag", FastJsonResponse$Field.f("etag", 17));
        Z.put("explicitlyTrashed", FastJsonResponse$Field.e("explicitlyTrashed", 18));
        Z.put("fileExtension", FastJsonResponse$Field.f("fileExtension", 20));
        Z.put("fileSize", FastJsonResponse$Field.b("fileSize", 21));
        Z.put("folderColorRgb", FastJsonResponse$Field.f("folderColorRgb", 24));
        Z.put("folderFeatures", FastJsonResponse$Field.g("folderFeatures", 25));
        Z.put("gplusMedia", FastJsonResponse$Field.e("gplusMedia", 26));
        Z.put("headRevisionId", FastJsonResponse$Field.f("headRevisionId", 30));
        Z.put("id", FastJsonResponse$Field.f("id", 32));
        Z.put("indexableText", FastJsonResponse$Field.a("indexableText", 34, IndexableText.class));
        Z.put("labels", FastJsonResponse$Field.a("labels", 36, Labels.class));
        Z.put("lastModifyingUser", FastJsonResponse$Field.a("lastModifyingUser", 37, User.class));
        Z.put("lastViewedByMeDate", FastJsonResponse$Field.f("lastViewedByMeDate", 39));
        Z.put("localId", FastJsonResponse$Field.a("localId", 40, FileLocalId.class));
        Z.put("md5Checksum", FastJsonResponse$Field.f("md5Checksum", 42));
        Z.put("mimeType", FastJsonResponse$Field.f("mimeType", 43));
        Z.put("modifiedByMeDate", FastJsonResponse$Field.f("modifiedByMeDate", 44));
        Z.put("modifiedDate", FastJsonResponse$Field.f("modifiedDate", 45));
        Z.put("originalFilename", FastJsonResponse$Field.f("originalFilename", 47));
        Z.put("ownerNames", FastJsonResponse$Field.g("ownerNames", 49));
        Z.put("owners", FastJsonResponse$Field.b("owners", 50, User.class));
        Z.put("parents", FastJsonResponse$Field.b("parents", 51, ParentReference.class));
        Z.put("permissions", FastJsonResponse$Field.b("permissions", 52, Permission.class));
        Z.put("properties", FastJsonResponse$Field.b("properties", 54, Property.class));
        Z.put("quotaBytesUsed", FastJsonResponse$Field.b("quotaBytesUsed", 55));
        Z.put("recency", FastJsonResponse$Field.f("recency", 57));
        Z.put("recencyReason", FastJsonResponse$Field.f("recencyReason", 58));
        Z.put("shared", FastJsonResponse$Field.e("shared", 63));
        Z.put("sharedWithMeDate", FastJsonResponse$Field.f("sharedWithMeDate", 64));
        Z.put("sharingUser", FastJsonResponse$Field.a("sharingUser", 65, User.class));
        Z.put("spaces", FastJsonResponse$Field.g("spaces", 68));
        Z.put("subscribed", FastJsonResponse$Field.e("subscribed", 69));
        Z.put("thumbnail", FastJsonResponse$Field.a("thumbnail", 71, Thumbnail.class));
        Z.put("thumbnailLink", FastJsonResponse$Field.f("thumbnailLink", 72));
        Z.put("title", FastJsonResponse$Field.f("title", 73));
        Z.put("userPermission", FastJsonResponse$Field.a("userPermission", 74, Permission.class));
        Z.put("version", FastJsonResponse$Field.b("version", 75));
        Z.put("webContentLink", FastJsonResponse$Field.f("webContentLink", 77));
        Z.put("webViewLink", FastJsonResponse$Field.f("webViewLink", 78));
        Z.put("writersCanShare", FastJsonResponse$Field.e("writersCanShare", 79));
    }

    public File() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return Z;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.b;
            case 3:
                return Boolean.valueOf(this.c);
            case 4:
                return this.d;
            case 6:
                return Boolean.valueOf(this.e);
            case 7:
                return this.f;
            case 8:
                return this.g;
            case 11:
                return this.h;
            case 12:
                return this.i;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return Boolean.valueOf(this.j);
            case 16:
                return this.k;
            case 17:
                return this.l;
            case 18:
                return Boolean.valueOf(this.m);
            case 20:
                return this.n;
            case 21:
                return Long.valueOf(this.o);
            case 24:
                return this.p;
            case 25:
                return this.q;
            case 26:
                return Boolean.valueOf(this.r);
            case 30:
                return this.s;
            case 32:
                return this.t;
            case 34:
                return this.u;
            case 36:
                return this.v;
            case 37:
                return this.w;
            case 39:
                return this.x;
            case 40:
                return this.y;
            case 42:
                return this.z;
            case 43:
                return this.A;
            case 44:
                return this.B;
            case 45:
                return this.C;
            case 47:
                return this.D;
            case 49:
                return this.E;
            case 50:
                return this.F;
            case 51:
                return this.G;
            case 52:
                return this.H;
            case 54:
                return this.I;
            case 55:
                return Long.valueOf(this.J);
            case 57:
                return this.K;
            case 58:
                return this.L;
            case 63:
                return Boolean.valueOf(this.M);
            case 64:
                return this.N;
            case 65:
                return this.O;
            case 68:
                return this.P;
            case 69:
                return Boolean.valueOf(this.Q);
            case 71:
                return this.R;
            case 72:
                return this.S;
            case 73:
                return this.T;
            case 74:
                return this.U;
            case 75:
                return Long.valueOf(this.V);
            case 77:
                return this.W;
            case 78:
                return this.X;
            case 79:
                return Boolean.valueOf(this.Y);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof File)) {
            return false;
        }
        if (this != obj) {
            File file = (File) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : Z.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!file.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(file.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (file.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : Z.values()) {
            if (a(fastJsonResponse$Field)) {
                i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i2;
    }

    public File(Set set, String str, boolean z2, List list, boolean z3, String str2, String str3, String str4, String str5, boolean z4, String str6, String str7, boolean z5, String str8, long j2, String str9, List list2, boolean z6, String str10, String str11, IndexableText indexableText, Labels labels, User user, String str12, FileLocalId fileLocalId, String str13, String str14, String str15, String str16, String str17, List list3, List list4, List list5, List list6, List list7, long j3, String str18, String str19, boolean z7, String str20, User user2, List list8, boolean z8, Thumbnail thumbnail, String str21, String str22, Permission permission, long j4, String str23, String str24, boolean z9) {
        this.a = set;
        this.b = str;
        this.c = z2;
        this.d = list;
        this.e = z3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = z4;
        this.k = str6;
        this.l = str7;
        this.m = z5;
        this.n = str8;
        this.o = j2;
        this.p = str9;
        this.q = list2;
        this.r = z6;
        this.s = str10;
        this.t = str11;
        this.u = indexableText;
        this.v = labels;
        this.w = user;
        this.x = str12;
        this.y = fileLocalId;
        this.z = str13;
        this.A = str14;
        this.B = str15;
        this.C = str16;
        this.D = str17;
        this.E = list3;
        this.F = list4;
        this.G = list5;
        this.H = list6;
        this.I = list7;
        this.J = j3;
        this.K = str18;
        this.L = str19;
        this.M = z7;
        this.N = str20;
        this.O = user2;
        this.P = list8;
        this.Q = z8;
        this.R = thumbnail;
        this.S = str21;
        this.T = str22;
        this.U = permission;
        this.V = j4;
        this.W = str23;
        this.X = str24;
        this.Y = z9;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 21) {
            this.o = j2;
        } else if (i2 == 55) {
            this.J = j2;
        } else if (i2 == 75) {
            this.V = j2;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            ivx.b(parcel, 4, this.d, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.e);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.f, true);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.g, true);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.h, true);
        }
        if (set.contains(12)) {
            ivx.a(parcel, 12, this.i, true);
        }
        if (set.contains(14)) {
            ivx.a(parcel, 14, this.j);
        }
        if (set.contains(16)) {
            ivx.a(parcel, 16, this.k, true);
        }
        if (set.contains(17)) {
            ivx.a(parcel, 17, this.l, true);
        }
        if (set.contains(18)) {
            ivx.a(parcel, 18, this.m);
        }
        if (set.contains(20)) {
            ivx.a(parcel, 20, this.n, true);
        }
        if (set.contains(21)) {
            ivx.a(parcel, 21, this.o);
        }
        if (set.contains(24)) {
            ivx.a(parcel, 24, this.p, true);
        }
        if (set.contains(25)) {
            ivx.b(parcel, 25, this.q, true);
        }
        if (set.contains(26)) {
            ivx.a(parcel, 26, this.r);
        }
        if (set.contains(30)) {
            ivx.a(parcel, 30, this.s, true);
        }
        if (set.contains(32)) {
            ivx.a(parcel, 32, this.t, true);
        }
        if (set.contains(34)) {
            ivx.a(parcel, 34, this.u, i2, true);
        }
        if (set.contains(36)) {
            ivx.a(parcel, 36, this.v, i2, true);
        }
        if (set.contains(37)) {
            ivx.a(parcel, 37, this.w, i2, true);
        }
        if (set.contains(39)) {
            ivx.a(parcel, 39, this.x, true);
        }
        if (set.contains(40)) {
            ivx.a(parcel, 40, this.y, i2, true);
        }
        if (set.contains(42)) {
            ivx.a(parcel, 42, this.z, true);
        }
        if (set.contains(43)) {
            ivx.a(parcel, 43, this.A, true);
        }
        if (set.contains(44)) {
            ivx.a(parcel, 44, this.B, true);
        }
        if (set.contains(45)) {
            ivx.a(parcel, 45, this.C, true);
        }
        if (set.contains(47)) {
            ivx.a(parcel, 47, this.D, true);
        }
        if (set.contains(49)) {
            ivx.b(parcel, 49, this.E, true);
        }
        if (set.contains(50)) {
            ivx.c(parcel, 50, this.F, true);
        }
        if (set.contains(51)) {
            ivx.c(parcel, 51, this.G, true);
        }
        if (set.contains(52)) {
            ivx.c(parcel, 52, this.H, true);
        }
        if (set.contains(54)) {
            ivx.c(parcel, 54, this.I, true);
        }
        if (set.contains(55)) {
            ivx.a(parcel, 55, this.J);
        }
        if (set.contains(57)) {
            ivx.a(parcel, 57, this.K, true);
        }
        if (set.contains(58)) {
            ivx.a(parcel, 58, this.L, true);
        }
        if (set.contains(63)) {
            ivx.a(parcel, 63, this.M);
        }
        if (set.contains(64)) {
            ivx.a(parcel, 64, this.N, true);
        }
        if (set.contains(65)) {
            ivx.a(parcel, 65, this.O, i2, true);
        }
        if (set.contains(68)) {
            ivx.b(parcel, 68, this.P, true);
        }
        if (set.contains(69)) {
            ivx.a(parcel, 69, this.Q);
        }
        if (set.contains(71)) {
            ivx.a(parcel, 71, this.R, i2, true);
        }
        if (set.contains(72)) {
            ivx.a(parcel, 72, this.S, true);
        }
        if (set.contains(73)) {
            ivx.a(parcel, 73, this.T, true);
        }
        if (set.contains(74)) {
            ivx.a(parcel, 74, this.U, i2, true);
        }
        if (set.contains(75)) {
            ivx.a(parcel, 75, this.V);
        }
        if (set.contains(77)) {
            ivx.a(parcel, 77, this.W, true);
        }
        if (set.contains(78)) {
            ivx.a(parcel, 78, this.X, true);
        }
        if (set.contains(79)) {
            ivx.a(parcel, 79, this.Y);
        }
        ivx.b(parcel, a2);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 34) {
            this.u = (IndexableText) jag;
        } else if (i2 == 40) {
            this.y = (FileLocalId) jag;
        } else if (i2 == 65) {
            this.O = (User) jag;
        } else if (i2 == 71) {
            this.R = (Thumbnail) jag;
        } else if (i2 == 74) {
            this.U = (Permission) jag;
        } else if (i2 == 36) {
            this.v = (Labels) jag;
        } else if (i2 == 37) {
            this.w = (User) jag;
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = str2;
        } else if (i2 == 20) {
            this.n = str2;
        } else if (i2 == 24) {
            this.p = str2;
        } else if (i2 == 30) {
            this.s = str2;
        } else if (i2 == 32) {
            this.t = str2;
        } else if (i2 == 39) {
            this.x = str2;
        } else if (i2 == 47) {
            this.D = str2;
        } else if (i2 == 64) {
            this.N = str2;
        } else if (i2 == 7) {
            this.f = str2;
        } else if (i2 == 8) {
            this.g = str2;
        } else if (i2 == 11) {
            this.h = str2;
        } else if (i2 == 12) {
            this.i = str2;
        } else if (i2 == 16) {
            this.k = str2;
        } else if (i2 == 17) {
            this.l = str2;
        } else if (i2 == 57) {
            this.K = str2;
        } else if (i2 == 58) {
            this.L = str2;
        } else if (i2 == 72) {
            this.S = str2;
        } else if (i2 == 73) {
            this.T = str2;
        } else if (i2 == 77) {
            this.W = str2;
        } else if (i2 != 78) {
            switch (i2) {
                case 42:
                    this.z = str2;
                    break;
                case 43:
                    this.A = str2;
                    break;
                case 44:
                    this.B = str2;
                    break;
                case 45:
                    this.C = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.X = str2;
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.d = arrayList;
        } else if (i2 == 25) {
            this.q = arrayList;
        } else if (i2 == 49) {
            this.E = arrayList;
        } else if (i2 == 68) {
            this.P = arrayList;
        } else {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an array of String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 50:
                this.F = arrayList;
                break;
            case 51:
                this.G = arrayList;
                break;
            case 52:
                this.H = arrayList;
                break;
            case 54:
                this.I = arrayList;
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = z2;
        } else if (i2 == 6) {
            this.e = z2;
        } else if (i2 == 14) {
            this.j = z2;
        } else if (i2 == 18) {
            this.m = z2;
        } else if (i2 == 26) {
            this.r = z2;
        } else if (i2 == 63) {
            this.M = z2;
        } else if (i2 == 69) {
            this.Q = z2;
        } else if (i2 == 79) {
            this.Y = z2;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void a(Labels labels) {
        this.v = labels;
        this.a.add(36);
    }

    public final void a(FileLocalId fileLocalId) {
        this.y = fileLocalId;
        this.a.add(40);
    }

    public final void a(List list) {
        this.G = list;
        this.a.add(51);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
