package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BootstrapConfigurations extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abnz();
    public static String a = "directTransferTransitionTitle";
    public static String b = "directTransferConfirmationButton";
    private static final Map r;
    final Set c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public ArrayList h;
    public Bundle i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public long n;
    public DeviceDetails o;
    public boolean p;
    public boolean q;

    static {
        nz nzVar = new nz();
        nzVar.put("wifiNetworkSsid", FastJsonResponse$Field.f("wifiNetworkSsid", 2));
        nzVar.put("wifiNetworkPassword", FastJsonResponse$Field.f("wifiNetworkPassword", 3));
        nzVar.put("wifiNetworkSecurity", FastJsonResponse$Field.f("wifiNetworkSecurity", 4));
        nzVar.put("isLockScreenShown", FastJsonResponse$Field.e("isLockScreenShown", 5));
        nzVar.put("bootstrapAccounts", FastJsonResponse$Field.b("bootstrapAccounts", 6, BootstrapAccount.class));
        nzVar.put("extraParameters", new FastJsonResponse$Field(10, false, 10, false, "extraParameters", 7, (Class) null, (StringToIntConverter) null));
        nzVar.put("hasUserConfirmed", FastJsonResponse$Field.e("hasUserConfirmed", 8));
        nzVar.put("supportsUnencryptedCommunication", FastJsonResponse$Field.e("supportsUnencryptedCommunication", 9));
        nzVar.put("maxPacketSize", FastJsonResponse$Field.a("maxPacketSize", 10));
        nzVar.put("optionFlags", FastJsonResponse$Field.b("optionFlags", 11));
        nzVar.put("optionFlagSetIndicators", FastJsonResponse$Field.b("optionFlagSetIndicators", 12));
        nzVar.put("deviceDetails", FastJsonResponse$Field.a("deviceDetails", 13, DeviceDetails.class));
        nzVar.put("nearbyDirectTransfer", FastJsonResponse$Field.e("nearbyDirectTransfer", 14));
        nzVar.put("targetNearbyDirectTransfer", FastJsonResponse$Field.e("targetNearbyDirectTransfer", 15));
        r = Collections.unmodifiableMap(nzVar);
    }

    public BootstrapConfigurations() {
        this.c = new HashSet();
    }

    public final Map a() {
        return r;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.d;
            case 3:
                return this.e;
            case 4:
                return this.f;
            case 5:
                return Boolean.valueOf(this.g);
            case 6:
                return this.h;
            case 7:
                return b();
            case 8:
                return Boolean.valueOf(this.j);
            case 9:
                return Boolean.valueOf(this.k);
            case 10:
                return Integer.valueOf(this.l);
            case 11:
                return Long.valueOf(this.m);
            case 12:
                return Long.valueOf(this.n);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return this.o;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return Boolean.valueOf(this.p);
            case Service.START_CONTINUATION_MASK:
                return Boolean.valueOf(this.q);
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final abpi c() {
        return new abpi(this.m, this.n);
    }

    public BootstrapConfigurations(String str, String str2, String str3, boolean z, ArrayList arrayList, Map map, long j2, long j3) {
        this();
        this.d = str;
        this.c.add(2);
        this.e = str2;
        this.c.add(3);
        this.f = str3;
        this.c.add(4);
        this.g = z;
        this.c.add(5);
        a(arrayList);
        a(map);
        this.j = false;
        this.c.add(8);
        this.k = false;
        this.c.add(9);
        a(0);
        a(j2);
        b(j3);
    }

    public final void a(int i2) {
        this.l = i2;
        this.c.add(10);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.c;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.d, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.e, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.f, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.g);
        }
        if (set.contains(6)) {
            ivx.c(parcel, 6, this.h, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.i, true);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.j);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.k);
        }
        if (set.contains(10)) {
            ivx.b(parcel, 10, this.l);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.m);
        }
        if (set.contains(12)) {
            ivx.a(parcel, 12, this.n);
        }
        if (set.contains(13)) {
            ivx.a(parcel, 13, this.o, i2, true);
        }
        if (set.contains(14)) {
            ivx.a(parcel, 14, this.p);
        }
        if (set.contains(15)) {
            ivx.a(parcel, 15, this.q);
        }
        ivx.b(parcel, a2);
    }

    public final void a(long j2) {
        this.m = j2;
        this.c.add(11);
    }

    public final void a(abpi abpi) {
        a(abpi.a);
        b(abpi.b);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 10) {
            this.l = i2;
            this.c.add(Integer.valueOf(i3));
            return;
        }
        throw new IllegalStateException(String.format("Field with id=%d  is not known to be an integer.", new Object[]{Integer.valueOf(i3)}));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 11) {
            this.m = j2;
        } else if (i2 == 12) {
            this.n = j2;
        } else {
            throw new IllegalStateException(String.format("Field id %d is not a known long", new Object[]{Integer.valueOf(i2)}));
        }
        this.c.add(Integer.valueOf(i2));
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 13) {
            this.o = (DeviceDetails) jag;
            this.c.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d not a concrete type", new Object[]{Integer.valueOf(i2)}));
    }

    public BootstrapConfigurations(Set set, String str, String str2, String str3, boolean z, ArrayList arrayList, Bundle bundle, boolean z2, boolean z3, int i2, long j2, long j3, DeviceDetails deviceDetails, boolean z4, boolean z5) {
        this.c = set;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = arrayList;
        this.i = bundle;
        this.j = z2;
        this.k = z3;
        this.l = i2;
        this.m = j2;
        this.n = j3;
        this.o = deviceDetails;
        this.p = z4;
        this.q = z5;
    }

    public final Map b() {
        if (this.i == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.i.keySet()) {
            hashMap.put(str, this.i.getString(str));
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.d = str2;
        } else if (i2 == 3) {
            this.e = str2;
        } else if (i2 == 4) {
            this.f = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
        }
        this.c.add(Integer.valueOf(i2));
    }

    public final void b(long j2) {
        this.n = j2;
        this.c.add(12);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 6) {
            this.h = arrayList;
            this.c.add(Integer.valueOf(i2));
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
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 7) {
            a(map);
            this.c.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string map.", new Object[]{Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.g = z;
        } else if (i2 == 8) {
            this.j = z;
        } else if (i2 == 9) {
            this.k = z;
        } else if (i2 == 14) {
            this.p = z;
        } else if (i2 == 15) {
            this.q = z;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", new Object[]{Integer.valueOf(i2)}));
        }
        this.c.add(Integer.valueOf(i2));
    }

    public final void a(DeviceDetails deviceDetails) {
        this.o = deviceDetails;
        this.c.add(13);
    }

    public final void a(ArrayList arrayList) {
        this.h = arrayList;
        this.c.add(6);
    }

    public final void a(Map map) {
        if (map != null) {
            this.i = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                this.i.putString((String) entry.getKey(), (String) entry.getValue());
            }
        } else {
            this.i = null;
        }
        this.c.add(7);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.c.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
