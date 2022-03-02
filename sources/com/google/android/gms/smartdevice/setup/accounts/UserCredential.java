package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserCredential extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new acik();
    private static final HashMap i;
    final Set a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("accountIdentifier", FastJsonResponse$Field.f("accountIdentifier", 2));
        i.put("status", FastJsonResponse$Field.a("status", 3));
        i.put("reason", FastJsonResponse$Field.f("reason", 4));
        i.put("fallbackUrl", FastJsonResponse$Field.f("fallbackUrl", 5));
        i.put("credential", FastJsonResponse$Field.f("credential", 6));
        i.put("firstName", FastJsonResponse$Field.f("firstName", 7));
        i.put("lastName", FastJsonResponse$Field.f("lastName", 8));
    }

    public UserCredential() {
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
                return Integer.valueOf(this.c);
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
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 3) {
            this.c = i2;
            this.a.add(Integer.valueOf(i3));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i3);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.c);
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

    public UserCredential(String str, int i2, String str2, String str3, String str4, String str5, String str6) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        hashSet.add(2);
        this.c = i2;
        this.a.add(3);
        this.d = str2;
        this.a.add(4);
        this.e = str3;
        this.a.add(5);
        this.f = str4;
        this.a.add(6);
        this.g = str5;
        this.a.add(7);
        this.h = str6;
        this.a.add(8);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                this.b = str2;
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
            case 8:
                this.h = str2;
                break;
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    public UserCredential(Set set, String str, int i2, String str2, String str3, String str4, String str5, String str6) {
        this.a = set;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }
}
