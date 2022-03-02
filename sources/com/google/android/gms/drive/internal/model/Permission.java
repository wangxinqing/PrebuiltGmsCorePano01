package com.google.android.gms.drive.internal.model;

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
public final class Permission extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new kyh();
    private static final HashMap l;
    public final Set a;
    public List b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    String j;
    public boolean k;

    static {
        HashMap hashMap = new HashMap();
        l = hashMap;
        hashMap.put("additionalRoles", FastJsonResponse$Field.g("additionalRoles", 2));
        l.put("domain", FastJsonResponse$Field.f("domain", 4));
        l.put("emailAddress", FastJsonResponse$Field.f("emailAddress", 5));
        l.put("id", FastJsonResponse$Field.f("id", 7));
        l.put("name", FastJsonResponse$Field.f("name", 9));
        l.put("photoLink", FastJsonResponse$Field.f("photoLink", 10));
        l.put("role", FastJsonResponse$Field.f("role", 11));
        l.put("type", FastJsonResponse$Field.f("type", 13));
        l.put("value", FastJsonResponse$Field.f("value", 15));
        l.put("withLink", FastJsonResponse$Field.e("withLink", 16));
    }

    public Permission() {
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
            case 4:
                return this.c;
            case 5:
                return this.d;
            case 7:
                return this.e;
            case 9:
                return this.f;
            case 10:
                return this.g;
            case 11:
                return this.h;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return this.i;
            case Service.START_CONTINUATION_MASK:
                return this.j;
            case 16:
                return Boolean.valueOf(this.k);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final void e(String str) {
        this.h = str;
        this.a.add(11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Permission)) {
            return false;
        }
        if (this != obj) {
            Permission permission = (Permission) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!permission.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(permission.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (permission.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(String str) {
        this.i = str;
        this.a.add(13);
    }

    public final void g(String str) {
        this.j = str;
        this.a.add(15);
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

    public Permission(Set set, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        this.a = set;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = z;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 4:
                this.c = str2;
                break;
            case 5:
                this.d = str2;
                break;
            case 7:
                this.e = str2;
                break;
            case 9:
                this.f = str2;
                break;
            case 10:
                this.g = str2;
                break;
            case 11:
                this.h = str2;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                this.i = str2;
                break;
            case Service.START_CONTINUATION_MASK:
                this.j = str2;
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

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.b(parcel, 2, this.b, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.c, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.d, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.e, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.f, true);
        }
        if (set.contains(10)) {
            ivx.a(parcel, 10, this.g, true);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.h, true);
        }
        if (set.contains(13)) {
            ivx.a(parcel, 13, this.i, true);
        }
        if (set.contains(15)) {
            ivx.a(parcel, 15, this.j, true);
        }
        if (set.contains(16)) {
            ivx.a(parcel, 16, this.k);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = arrayList;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an array of String.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 16) {
            this.k = z;
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
