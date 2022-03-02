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
public class DeviceRiskSignals extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new achv();
    private static final HashMap j;
    final Set a;
    public int b;
    public long c;
    public String d;
    public String e;
    public long f;
    public long g;
    public ScreenlockState h;
    public StarguardData i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("deviceType", FastJsonResponse$Field.a("deviceType", 2));
        j.put("androidDeviceId", FastJsonResponse$Field.b("androidDeviceId", 3));
        j.put("deviceModel", FastJsonResponse$Field.f("deviceModel", 4));
        j.put("deviceManufacturer", FastJsonResponse$Field.f("deviceManufacturer", 5));
        j.put("osMajorVersionCode", FastJsonResponse$Field.b("osMajorVersionCode", 6));
        j.put("softwareMajorVersionCode", FastJsonResponse$Field.b("softwareMajorVersionCode", 7));
        j.put("screenlockState", FastJsonResponse$Field.a("screenlockState", 8, ScreenlockState.class));
        j.put("starguardData", FastJsonResponse$Field.a("starguardData", 9, StarguardData.class));
    }

    public DeviceRiskSignals() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return j;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return Integer.valueOf(this.b);
            case 3:
                return Long.valueOf(this.c);
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return Long.valueOf(this.f);
            case 7:
                return Long.valueOf(this.g);
            case 8:
                return this.h;
            case 9:
                return this.i;
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
        if (i3 == 2) {
            this.b = i2;
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
            ivx.b(parcel, 2, this.b);
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
            ivx.a(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.h, i2, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i, i2, true);
        }
        ivx.b(parcel, a2);
    }

    public DeviceRiskSignals(long j2, String str, String str2, long j3, ScreenlockState screenlockState, StarguardData starguardData) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = 1;
        hashSet.add(2);
        this.c = j2;
        this.a.add(3);
        this.d = str;
        this.a.add(4);
        this.e = str2;
        this.a.add(5);
        this.f = j3;
        this.a.add(6);
        this.g = 201216073;
        this.a.add(7);
        this.h = screenlockState;
        this.a.add(8);
        this.i = starguardData;
        this.a.add(9);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = j2;
        } else if (i2 == 6) {
            this.f = j2;
        } else if (i2 == 7) {
            this.g = j2;
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 8) {
            this.h = (ScreenlockState) jag;
        } else if (i2 == 9) {
            this.i = (StarguardData) jag;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i2), jag.getClass().getCanonicalName()}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.d = str2;
        } else if (i2 == 5) {
            this.e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    public DeviceRiskSignals(Set set, int i2, long j2, String str, String str2, long j3, long j4, ScreenlockState screenlockState, StarguardData starguardData) {
        this.a = set;
        this.b = i2;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
        this.g = j4;
        this.h = screenlockState;
        this.i = starguardData;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
