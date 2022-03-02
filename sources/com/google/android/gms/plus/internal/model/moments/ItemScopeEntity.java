package com.google.android.gms.plus.internal.model.moments;

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
public final class ItemScopeEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new ywt();
    private static final HashMap ae;
    String A;
    String B;
    String C;
    ItemScopeEntity D;
    String E;
    String F;
    String G;
    String H;
    ItemScopeEntity I;
    double J;
    ItemScopeEntity K;
    double L;
    String M;
    ItemScopeEntity N;
    List O;
    String P;
    String Q;
    String R;
    String S;
    ItemScopeEntity T;
    String U;
    String V;
    String W;
    ItemScopeEntity X;
    String Y;
    String Z;
    final Set a;
    String aa;
    String ab;
    String ac;
    String ad;
    final int b;
    ItemScopeEntity c;
    List d;
    ItemScopeEntity e;
    String f;
    String g;
    String h;
    List i;
    int j;
    List k;
    ItemScopeEntity l;
    List m;
    String n;
    String o;
    ItemScopeEntity p;
    String q;
    String r;
    String s;
    List t;
    String u;
    String v;
    String w;
    String x;
    String y;
    String z;

    static {
        Class<ItemScopeEntity> cls = ItemScopeEntity.class;
        HashMap hashMap = new HashMap();
        ae = hashMap;
        hashMap.put("about", FastJsonResponse$Field.a("about", 2, (Class) cls));
        ae.put("additionalName", FastJsonResponse$Field.g("additionalName", 3));
        ae.put("address", FastJsonResponse$Field.a("address", 4, (Class) cls));
        ae.put("addressCountry", FastJsonResponse$Field.f("addressCountry", 5));
        ae.put("addressLocality", FastJsonResponse$Field.f("addressLocality", 6));
        ae.put("addressRegion", FastJsonResponse$Field.f("addressRegion", 7));
        ae.put("associated_media", FastJsonResponse$Field.b("associated_media", 8, cls));
        ae.put("attendeeCount", FastJsonResponse$Field.a("attendeeCount", 9));
        ae.put("attendees", FastJsonResponse$Field.b("attendees", 10, cls));
        ae.put("audio", FastJsonResponse$Field.a("audio", 11, (Class) cls));
        ae.put("author", FastJsonResponse$Field.b("author", 12, cls));
        ae.put("bestRating", FastJsonResponse$Field.f("bestRating", 13));
        ae.put("birthDate", FastJsonResponse$Field.f("birthDate", 14));
        ae.put("byArtist", FastJsonResponse$Field.a("byArtist", 15, (Class) cls));
        ae.put("caption", FastJsonResponse$Field.f("caption", 16));
        ae.put("contentSize", FastJsonResponse$Field.f("contentSize", 17));
        ae.put("contentUrl", FastJsonResponse$Field.f("contentUrl", 18));
        ae.put("contributor", FastJsonResponse$Field.b("contributor", 19, cls));
        ae.put("dateCreated", FastJsonResponse$Field.f("dateCreated", 20));
        ae.put("dateModified", FastJsonResponse$Field.f("dateModified", 21));
        ae.put("datePublished", FastJsonResponse$Field.f("datePublished", 22));
        ae.put("description", FastJsonResponse$Field.f("description", 23));
        ae.put("duration", FastJsonResponse$Field.f("duration", 24));
        ae.put("embedUrl", FastJsonResponse$Field.f("embedUrl", 25));
        ae.put("endDate", FastJsonResponse$Field.f("endDate", 26));
        ae.put("familyName", FastJsonResponse$Field.f("familyName", 27));
        ae.put("gender", FastJsonResponse$Field.f("gender", 28));
        ae.put("geo", FastJsonResponse$Field.a("geo", 29, (Class) cls));
        ae.put("givenName", FastJsonResponse$Field.f("givenName", 30));
        ae.put("height", FastJsonResponse$Field.f("height", 31));
        ae.put("id", FastJsonResponse$Field.f("id", 32));
        ae.put("image", FastJsonResponse$Field.f("image", 33));
        ae.put("inAlbum", FastJsonResponse$Field.a("inAlbum", 34, (Class) cls));
        ae.put("latitude", FastJsonResponse$Field.d("latitude", 36));
        ae.put("location", FastJsonResponse$Field.a("location", 37, (Class) cls));
        ae.put("longitude", FastJsonResponse$Field.d("longitude", 38));
        ae.put("name", FastJsonResponse$Field.f("name", 39));
        ae.put("partOfTVSeries", FastJsonResponse$Field.a("partOfTVSeries", 40, (Class) cls));
        ae.put("performers", FastJsonResponse$Field.b("performers", 41, cls));
        ae.put("playerType", FastJsonResponse$Field.f("playerType", 42));
        ae.put("postOfficeBoxNumber", FastJsonResponse$Field.f("postOfficeBoxNumber", 43));
        ae.put("postalCode", FastJsonResponse$Field.f("postalCode", 44));
        ae.put("ratingValue", FastJsonResponse$Field.f("ratingValue", 45));
        ae.put("reviewRating", FastJsonResponse$Field.a("reviewRating", 46, (Class) cls));
        ae.put("startDate", FastJsonResponse$Field.f("startDate", 47));
        ae.put("streetAddress", FastJsonResponse$Field.f("streetAddress", 48));
        ae.put("text", FastJsonResponse$Field.f("text", 49));
        ae.put("thumbnail", FastJsonResponse$Field.a("thumbnail", 50, (Class) cls));
        ae.put("thumbnailUrl", FastJsonResponse$Field.f("thumbnailUrl", 51));
        ae.put("tickerSymbol", FastJsonResponse$Field.f("tickerSymbol", 52));
        ae.put("type", FastJsonResponse$Field.f("type", 53));
        ae.put("url", FastJsonResponse$Field.f("url", 54));
        ae.put("width", FastJsonResponse$Field.f("width", 55));
        ae.put("worstRating", FastJsonResponse$Field.f("worstRating", 56));
    }

    public ItemScopeEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return ae;
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
            case 8:
                return this.i;
            case 9:
                return Integer.valueOf(this.j);
            case 10:
                return this.k;
            case 11:
                return this.l;
            case 12:
                return this.m;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return this.n;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return this.o;
            case Service.START_CONTINUATION_MASK:
                return this.p;
            case 16:
                return this.q;
            case 17:
                return this.r;
            case 18:
                return this.s;
            case 19:
                return this.t;
            case 20:
                return this.u;
            case 21:
                return this.v;
            case 22:
                return this.w;
            case 23:
                return this.x;
            case 24:
                return this.y;
            case 25:
                return this.z;
            case 26:
                return this.A;
            case 27:
                return this.B;
            case 28:
                return this.C;
            case 29:
                return this.D;
            case 30:
                return this.E;
            case 31:
                return this.F;
            case 32:
                return this.G;
            case 33:
                return this.H;
            case 34:
                return this.I;
            case 36:
                return Double.valueOf(this.J);
            case 37:
                return this.K;
            case 38:
                return Double.valueOf(this.L);
            case 39:
                return this.M;
            case 40:
                return this.N;
            case 41:
                return this.O;
            case 42:
                return this.P;
            case 43:
                return this.Q;
            case 44:
                return this.R;
            case 45:
                return this.S;
            case 46:
                return this.T;
            case 47:
                return this.U;
            case 48:
                return this.V;
            case 49:
                return this.W;
            case 50:
                return this.X;
            case 51:
                return this.Y;
            case 52:
                return this.Z;
            case 53:
                return this.aa;
            case 54:
                return this.ab;
            case 55:
                return this.ac;
            case 56:
                return this.ad;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ItemScopeEntity)) {
            return false;
        }
        if (this != obj) {
            ItemScopeEntity itemScopeEntity = (ItemScopeEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : ae.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!itemScopeEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(itemScopeEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (itemScopeEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : ae.values()) {
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 36) {
            this.J = d2;
        } else if (i2 == 38) {
            this.L = d2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a double.");
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
            ivx.a(parcel, 2, this.c, i2, true);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, i2, true);
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
        if (set.contains(8)) {
            ivx.c(parcel, 8, this.i, true);
        }
        if (set.contains(9)) {
            ivx.b(parcel, 9, this.j);
        }
        if (set.contains(10)) {
            ivx.c(parcel, 10, this.k, true);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.l, i2, true);
        }
        if (set.contains(12)) {
            ivx.c(parcel, 12, this.m, true);
        }
        if (set.contains(13)) {
            ivx.a(parcel, 13, this.n, true);
        }
        if (set.contains(14)) {
            ivx.a(parcel, 14, this.o, true);
        }
        if (set.contains(15)) {
            ivx.a(parcel, 15, this.p, i2, true);
        }
        if (set.contains(16)) {
            ivx.a(parcel, 16, this.q, true);
        }
        if (set.contains(17)) {
            ivx.a(parcel, 17, this.r, true);
        }
        if (set.contains(18)) {
            ivx.a(parcel, 18, this.s, true);
        }
        if (set.contains(19)) {
            ivx.c(parcel, 19, this.t, true);
        }
        if (set.contains(20)) {
            ivx.a(parcel, 20, this.u, true);
        }
        if (set.contains(21)) {
            ivx.a(parcel, 21, this.v, true);
        }
        if (set.contains(22)) {
            ivx.a(parcel, 22, this.w, true);
        }
        if (set.contains(23)) {
            ivx.a(parcel, 23, this.x, true);
        }
        if (set.contains(24)) {
            ivx.a(parcel, 24, this.y, true);
        }
        if (set.contains(25)) {
            ivx.a(parcel, 25, this.z, true);
        }
        if (set.contains(26)) {
            ivx.a(parcel, 26, this.A, true);
        }
        if (set.contains(27)) {
            ivx.a(parcel, 27, this.B, true);
        }
        if (set.contains(28)) {
            ivx.a(parcel, 28, this.C, true);
        }
        if (set.contains(29)) {
            ivx.a(parcel, 29, this.D, i2, true);
        }
        if (set.contains(30)) {
            ivx.a(parcel, 30, this.E, true);
        }
        if (set.contains(31)) {
            ivx.a(parcel, 31, this.F, true);
        }
        if (set.contains(32)) {
            ivx.a(parcel, 32, this.G, true);
        }
        if (set.contains(33)) {
            ivx.a(parcel, 33, this.H, true);
        }
        if (set.contains(34)) {
            ivx.a(parcel, 34, this.I, i2, true);
        }
        if (set.contains(36)) {
            ivx.a(parcel, 36, this.J);
        }
        if (set.contains(37)) {
            ivx.a(parcel, 37, this.K, i2, true);
        }
        if (set.contains(38)) {
            ivx.a(parcel, 38, this.L);
        }
        if (set.contains(39)) {
            ivx.a(parcel, 39, this.M, true);
        }
        if (set.contains(40)) {
            ivx.a(parcel, 40, this.N, i2, true);
        }
        if (set.contains(41)) {
            ivx.c(parcel, 41, this.O, true);
        }
        if (set.contains(42)) {
            ivx.a(parcel, 42, this.P, true);
        }
        if (set.contains(43)) {
            ivx.a(parcel, 43, this.Q, true);
        }
        if (set.contains(44)) {
            ivx.a(parcel, 44, this.R, true);
        }
        if (set.contains(45)) {
            ivx.a(parcel, 45, this.S, true);
        }
        if (set.contains(46)) {
            ivx.a(parcel, 46, this.T, i2, true);
        }
        if (set.contains(47)) {
            ivx.a(parcel, 47, this.U, true);
        }
        if (set.contains(48)) {
            ivx.a(parcel, 48, this.V, true);
        }
        if (set.contains(49)) {
            ivx.a(parcel, 49, this.W, true);
        }
        if (set.contains(50)) {
            ivx.a(parcel, 50, this.X, i2, true);
        }
        if (set.contains(51)) {
            ivx.a(parcel, 51, this.Y, true);
        }
        if (set.contains(52)) {
            ivx.a(parcel, 52, this.Z, true);
        }
        if (set.contains(53)) {
            ivx.a(parcel, 53, this.aa, true);
        }
        if (set.contains(54)) {
            ivx.a(parcel, 54, this.ab, true);
        }
        if (set.contains(55)) {
            ivx.a(parcel, 55, this.ac, true);
        }
        if (set.contains(56)) {
            ivx.a(parcel, 56, this.ad, true);
        }
        ivx.b(parcel, a2);
    }

    public ItemScopeEntity(Set set, int i2, ItemScopeEntity itemScopeEntity, List list, ItemScopeEntity itemScopeEntity2, String str, String str2, String str3, List list2, int i3, List list3, ItemScopeEntity itemScopeEntity3, List list4, String str4, String str5, ItemScopeEntity itemScopeEntity4, String str6, String str7, String str8, List list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ItemScopeEntity itemScopeEntity5, String str18, String str19, String str20, String str21, ItemScopeEntity itemScopeEntity6, double d2, ItemScopeEntity itemScopeEntity7, double d3, String str22, ItemScopeEntity itemScopeEntity8, List list6, String str23, String str24, String str25, String str26, ItemScopeEntity itemScopeEntity9, String str27, String str28, String str29, ItemScopeEntity itemScopeEntity10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.a = set;
        this.b = i2;
        this.c = itemScopeEntity;
        this.d = list;
        this.e = itemScopeEntity2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = list2;
        this.j = i3;
        this.k = list3;
        this.l = itemScopeEntity3;
        this.m = list4;
        this.n = str4;
        this.o = str5;
        this.p = itemScopeEntity4;
        this.q = str6;
        this.r = str7;
        this.s = str8;
        this.t = list5;
        this.u = str9;
        this.v = str10;
        this.w = str11;
        this.x = str12;
        this.y = str13;
        this.z = str14;
        this.A = str15;
        this.B = str16;
        this.C = str17;
        this.D = itemScopeEntity5;
        this.E = str18;
        this.F = str19;
        this.G = str20;
        this.H = str21;
        this.I = itemScopeEntity6;
        this.J = d2;
        this.K = itemScopeEntity7;
        this.L = d3;
        this.M = str22;
        this.N = itemScopeEntity8;
        this.O = list6;
        this.P = str23;
        this.Q = str24;
        this.R = str25;
        this.S = str26;
        this.T = itemScopeEntity9;
        this.U = str27;
        this.V = str28;
        this.W = str29;
        this.X = itemScopeEntity10;
        this.Y = str30;
        this.Z = str31;
        this.aa = str32;
        this.ab = str33;
        this.ac = str34;
        this.ad = str35;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 9) {
            this.j = i2;
            this.a.add(Integer.valueOf(i3));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i3);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.d = arrayList;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an array of String.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = (ItemScopeEntity) jag;
        } else if (i2 == 4) {
            this.e = (ItemScopeEntity) jag;
        } else if (i2 == 11) {
            this.l = (ItemScopeEntity) jag;
        } else if (i2 == 15) {
            this.p = (ItemScopeEntity) jag;
        } else if (i2 == 29) {
            this.D = (ItemScopeEntity) jag;
        } else if (i2 == 34) {
            this.I = (ItemScopeEntity) jag;
        } else if (i2 == 37) {
            this.K = (ItemScopeEntity) jag;
        } else if (i2 == 40) {
            this.N = (ItemScopeEntity) jag;
        } else if (i2 == 46) {
            this.T = (ItemScopeEntity) jag;
        } else if (i2 == 50) {
            this.X = (ItemScopeEntity) jag;
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
        switch (i2) {
            case 5:
                this.f = str2;
                break;
            case 6:
                this.g = str2;
                break;
            case 7:
                this.h = str2;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                this.n = str2;
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                this.o = str2;
                break;
            case 16:
                this.q = str2;
                break;
            case 17:
                this.r = str2;
                break;
            case 18:
                this.s = str2;
                break;
            case 20:
                this.u = str2;
                break;
            case 21:
                this.v = str2;
                break;
            case 22:
                this.w = str2;
                break;
            case 23:
                this.x = str2;
                break;
            case 24:
                this.y = str2;
                break;
            case 25:
                this.z = str2;
                break;
            case 26:
                this.A = str2;
                break;
            case 27:
                this.B = str2;
                break;
            case 28:
                this.C = str2;
                break;
            case 30:
                this.E = str2;
                break;
            case 31:
                this.F = str2;
                break;
            case 32:
                this.G = str2;
                break;
            case 33:
                this.H = str2;
                break;
            case 39:
                this.M = str2;
                break;
            case 42:
                this.P = str2;
                break;
            case 43:
                this.Q = str2;
                break;
            case 44:
                this.R = str2;
                break;
            case 45:
                this.S = str2;
                break;
            case 47:
                this.U = str2;
                break;
            case 48:
                this.V = str2;
                break;
            case 49:
                this.W = str2;
                break;
            case 51:
                this.Y = str2;
                break;
            case 52:
                this.Z = str2;
                break;
            case 53:
                this.aa = str2;
                break;
            case 54:
                this.ab = str2;
                break;
            case 55:
                this.ac = str2;
                break;
            case 56:
                this.ad = str2;
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

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 8) {
            this.i = arrayList;
        } else if (i2 == 10) {
            this.k = arrayList;
        } else if (i2 == 12) {
            this.m = arrayList;
        } else if (i2 == 19) {
            this.t = arrayList;
        } else if (i2 == 41) {
            this.O = arrayList;
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
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
