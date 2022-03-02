package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExchangeAssertionsForUserCredentialsRequest extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new achy();
    private static final HashMap j;
    final Set a;
    public ArrayList b;
    public DeviceSignals c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("assertions", FastJsonResponse$Field.b("assertions", 2, Assertion.class));
        j.put("targetDeviceSignals", FastJsonResponse$Field.a("targetDeviceSignals", 3, DeviceSignals.class));
        j.put("credentialType", FastJsonResponse$Field.a("credentialType", 4));
        j.put("clientId", FastJsonResponse$Field.f("clientId", 5));
        j.put("locale", FastJsonResponse$Field.f("locale", 6));
        j.put("sourceBackupAccountId", FastJsonResponse$Field.f("sourceBackupAccountId", 7));
        j.put("sourceAndroidDeviceId", FastJsonResponse$Field.f("sourceAndroidDeviceId", 8));
        j.put("deferCredentialsAfterFallback", FastJsonResponse$Field.e("deferCredentialsAfterFallback", 9));
    }

    public ExchangeAssertionsForUserCredentialsRequest() {
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
                return this.b;
            case 3:
                return this.c;
            case 4:
                return Integer.valueOf(this.d);
            case 5:
                return this.e;
            case 6:
                return this.f;
            case 7:
                return this.g;
            case 8:
                return this.h;
            case 9:
                return Boolean.valueOf(this.i);
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final void e(String str) {
        this.f = str;
        this.a.add(6);
    }

    public final void f(String str) {
        this.g = str;
        this.a.add(7);
    }

    public final void g(String str) {
        this.h = str;
        this.a.add(8);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 4) {
            this.d = i2;
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
            ivx.c(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, i2, true);
        }
        if (set.contains(4)) {
            ivx.b(parcel, 4, this.d);
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
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i);
        }
        ivx.b(parcel, a2);
    }

    public ExchangeAssertionsForUserCredentialsRequest(ArrayList arrayList, String str) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = arrayList;
        hashSet.add(2);
        a((DeviceSignals) null);
        this.d = 3;
        this.a.add(4);
        this.e = str;
        this.a.add(5);
        e((String) null);
        f((String) null);
        g((String) null);
        a(false);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = (DeviceSignals) jag;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i2), jag.getClass().getCanonicalName()}));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.e = str2;
        } else if (i2 == 6) {
            this.f = str2;
        } else if (i2 == 7) {
            this.g = str2;
        } else if (i2 == 8) {
            this.h = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    public ExchangeAssertionsForUserCredentialsRequest(Set set, ArrayList arrayList, DeviceSignals deviceSignals, int i2, String str, String str2, String str3, String str4, boolean z) {
        this.a = set;
        this.b = arrayList;
        this.c = deviceSignals;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z;
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
        if (i2 == 9) {
            this.i = z;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(DeviceSignals deviceSignals) {
        this.c = deviceSignals;
        this.a.add(3);
    }

    public final void a(boolean z) {
        this.i = z;
        this.a.add(9);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
