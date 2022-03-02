package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceSignals extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new achw();
    private static final HashMap i;
    final Set a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public UserPresence h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("deviceId", FastJsonResponse$Field.f("deviceId", 2));
        i.put("deviceName", FastJsonResponse$Field.f("deviceName", 3));
        i.put("deviceModel", FastJsonResponse$Field.f("deviceModel", 4));
        i.put("sdkVersion", FastJsonResponse$Field.f("sdkVersion", 5));
        i.put("googlePlayServicesVersion", FastJsonResponse$Field.f("googlePlayServicesVersion", 6));
        i.put("droidGuardResults", FastJsonResponse$Field.f("droidGuardResults", 7));
        i.put("userPresence", FastJsonResponse$Field.a("userPresence", 8, UserPresence.class));
    }

    public DeviceSignals() {
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
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 8) {
            this.h = (UserPresence) jag;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i2), jag.getClass().getCanonicalName()}));
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
        ivx.b(parcel, a2);
    }

    public DeviceSignals(String str, String str2, String str3, String str4, String str5, String str6) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        hashSet.add(2);
        this.c = str2;
        this.a.add(3);
        this.d = str3;
        this.a.add(4);
        this.e = str4;
        this.a.add(5);
        this.f = str5;
        this.a.add(6);
        this.g = str6;
        this.a.add(7);
        this.h = null;
        this.a.add(8);
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
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    public DeviceSignals(Set set, String str, String str2, String str3, String str4, String str5, String str6, UserPresence userPresence) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = userPresence;
    }
}
