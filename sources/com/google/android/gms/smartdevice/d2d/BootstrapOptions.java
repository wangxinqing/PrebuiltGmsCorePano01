package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BootstrapOptions extends BinarySerializableFastSafeParcelableJson {
    private static final Map A;
    public static final Parcelable.Creator CREATOR = new aboe();
    final Set a;
    public int b;
    public int c;
    public boolean d;
    public List e;
    public byte f;
    public String g;
    public CompanionApp h;
    public boolean i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public long r;
    public int s;
    public long t;
    public PostTransferAction u;
    public byte[] v;
    public EsimActivationInfo w;
    public AdvertisementOptions x;
    public int y;
    public boolean z;

    static {
        nz nzVar = new nz();
        nzVar.put("protocol", FastJsonResponse$Field.a("protocol", 2));
        nzVar.put("accountRequirement", FastJsonResponse$Field.a("accountRequirement", 3));
        nzVar.put("isWiFiBootstrappable", FastJsonResponse$Field.e("isWiFiBootstrappable", 4));
        nzVar.put("visibleWiFiSSIDs", FastJsonResponse$Field.g("visibleWiFiSSIDs", 5));
        nzVar.put("deviceType", FastJsonResponse$Field.a("deviceType", 6));
        nzVar.put("deviceName", FastJsonResponse$Field.f("deviceName", 7));
        nzVar.put("companionApp", FastJsonResponse$Field.a("companionApp", 8, CompanionApp.class));
        nzVar.put("isSourceSideChallengeRequired", FastJsonResponse$Field.e("isSourceSideChallengeRequired", 9));
        nzVar.put("flowType", FastJsonResponse$Field.a("flowType", 10));
        nzVar.put("transportMedium", FastJsonResponse$Field.a("transportMedium", 11));
        nzVar.put("sessionId", FastJsonResponse$Field.b("sessionId", 12));
        nzVar.put("supportsDevicePolicySetup", FastJsonResponse$Field.e("supportsDevicePolicySetup", 13));
        nzVar.put("supportsAccountTransferImport", FastJsonResponse$Field.e("supportsAccountTransferImport", 14));
        nzVar.put("isAccountTransferImportAllowed", FastJsonResponse$Field.e("isAccountTransferImportAllowed", 15));
        nzVar.put("supportsPacketMode", FastJsonResponse$Field.e("supportsPacketMode", 16));
        nzVar.put("maxPacketSize", FastJsonResponse$Field.a("maxPacketSize", 17));
        nzVar.put("optionFlags", FastJsonResponse$Field.b("optionFlags", 18));
        nzVar.put("gmsVersion", FastJsonResponse$Field.a("gmsVersion", 19));
        nzVar.put("optionFlagsSetIndicator", FastJsonResponse$Field.b("optionFlagsSetIndicator", 20));
        nzVar.put("PostTransferAction", FastJsonResponse$Field.a("PostTransferAction", 21, PostTransferAction.class));
        nzVar.put("SharedSecret", FastJsonResponse$Field.h("SharedSecret", 22));
        nzVar.put("esimActivationInfo", FastJsonResponse$Field.a("esimActivationInfo", 23, EsimActivationInfo.class));
        nzVar.put("advertisementOptions", FastJsonResponse$Field.a("advertisementOptions", 24, AdvertisementOptions.class));
        nzVar.put("moduleVersion", FastJsonResponse$Field.a("moduleVersion", 25));
        nzVar.put("nearbyDirectTransfer", FastJsonResponse$Field.e("nearbyDirectTransfer", 26));
        A = Collections.unmodifiableMap(nzVar);
    }

    public BootstrapOptions() {
        this.a = new HashSet();
    }

    public final Map a() {
        return A;
    }

    public final abpi b() {
        return new abpi(this.r, this.t);
    }

    public final void c(int i2) {
        this.q = i2;
        this.a.add(17);
    }

    public final boolean c() {
        return (this.c & 1) != 1;
    }

    public final void d(int i2) {
        this.s = i2;
        this.a.add(19);
    }

    public final boolean d() {
        return (this.c & 2) == 2;
    }

    public final void e(int i2) {
        this.y = i2;
        this.a.add(25);
    }

    public final boolean e() {
        return (this.c & 4) == 4;
    }

    public final void f() {
        this.w = null;
        this.a.add(23);
    }

    public final void g() {
        this.n = false;
        this.a.add(14);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BootstrapOptions(int i2, int i3, boolean z2, List list, byte b2, String str, CompanionApp companionApp, boolean z3, long j2, boolean z4, boolean z5, long j3, int i4, long j4, PostTransferAction postTransferAction, AdvertisementOptions advertisementOptions) {
        this();
        a(i2);
        this.c = i3;
        this.a.add(3);
        this.d = false;
        this.a.add(4);
        this.e = list;
        this.a.add(5);
        this.f = 0;
        this.a.add(6);
        String str2 = str;
        e(str);
        this.h = null;
        this.a.add(8);
        this.i = z3;
        this.a.add(9);
        b(-1);
        this.k = 1;
        this.a.add(11);
        long j5 = j2;
        a(j2);
        a(z4);
        g();
        b(z5);
        c(false);
        c(0);
        b(j3);
        d(i4);
        c(j4);
        a((PostTransferAction) null);
        c((byte[]) null);
        f();
        this.x = advertisementOptions;
        this.a.add(24);
        e(0);
        this.z = false;
        this.a.add(26);
    }

    public final void a(int i2) {
        this.b = i2;
        this.a.add(2);
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return Integer.valueOf(this.b);
            case 3:
                return Integer.valueOf(this.c);
            case 4:
                return Boolean.valueOf(this.d);
            case 5:
                return this.e;
            case 6:
                return Byte.valueOf(this.f);
            case 7:
                return this.g;
            case 8:
                return this.h;
            case 9:
                return Boolean.valueOf(this.i);
            case 10:
                return Integer.valueOf(this.j);
            case 11:
                return Integer.valueOf(this.k);
            case 12:
                return Long.valueOf(this.l);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return Boolean.valueOf(this.m);
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return Boolean.valueOf(this.n);
            case Service.START_CONTINUATION_MASK:
                return Boolean.valueOf(this.o);
            case 16:
                return Boolean.valueOf(this.p);
            case 17:
                return Integer.valueOf(this.q);
            case 18:
                return Long.valueOf(this.r);
            case 19:
                return Integer.valueOf(this.s);
            case 20:
                return Long.valueOf(this.t);
            case 21:
                return this.u;
            case 22:
                return this.v;
            case 23:
                return this.w;
            case 24:
                return this.x;
            case 25:
                return Integer.valueOf(this.y);
            case 26:
                return Boolean.valueOf(this.z);
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final void c(long j2) {
        this.t = j2;
        this.a.add(20);
    }

    public final void e(String str) {
        this.g = str;
        this.a.add(7);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.b(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            ivx.b(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.h, i2, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            ivx.b(parcel, 10, this.j);
        }
        if (set.contains(11)) {
            ivx.b(parcel, 11, this.k);
        }
        if (set.contains(12)) {
            ivx.a(parcel, 12, this.l);
        }
        if (set.contains(13)) {
            ivx.a(parcel, 13, this.m);
        }
        if (set.contains(14)) {
            ivx.a(parcel, 14, this.n);
        }
        if (set.contains(15)) {
            ivx.a(parcel, 15, this.o);
        }
        if (set.contains(16)) {
            ivx.a(parcel, 16, this.p);
        }
        if (set.contains(17)) {
            ivx.b(parcel, 17, this.q);
        }
        if (set.contains(18)) {
            ivx.a(parcel, 18, this.r);
        }
        if (set.contains(19)) {
            ivx.b(parcel, 19, this.s);
        }
        if (set.contains(20)) {
            ivx.a(parcel, 20, this.t);
        }
        if (set.contains(21)) {
            ivx.a(parcel, 21, this.u, i2, true);
        }
        if (set.contains(22)) {
            ivx.a(parcel, 22, this.v, true);
        }
        if (set.contains(23)) {
            ivx.a(parcel, 23, this.w, i2, true);
        }
        if (set.contains(24)) {
            ivx.a(parcel, 24, this.x, i2, true);
        }
        if (set.contains(25)) {
            ivx.b(parcel, 25, this.y);
        }
        if (set.contains(26)) {
            ivx.a(parcel, 26, this.z);
        }
        ivx.b(parcel, a2);
    }

    public final void a(long j2) {
        this.l = j2;
        this.a.add(12);
    }

    public final void c(boolean z2) {
        this.p = z2;
        this.a.add(16);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 2) {
            this.b = i2;
        } else if (i3 == 3) {
            this.c = i2;
        } else if (i3 == 6) {
            this.f = (byte) i2;
        } else if (i3 == 17) {
            this.q = i2;
        } else if (i3 == 19) {
            this.s = i2;
        } else if (i3 == 25) {
            this.y = i2;
        } else if (i3 == 10) {
            this.j = i2;
        } else if (i3 == 11) {
            this.k = i2;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i3);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i3));
    }

    public final void c(byte[] bArr) {
        this.v = bArr;
        this.a.add(22);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 12) {
            this.l = j2;
        } else if (i2 == 18) {
            this.r = j2;
        } else if (i2 == 20) {
            this.t = j2;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 8) {
            this.h = (CompanionApp) jag;
        } else if (i2 == 21) {
            this.u = (PostTransferAction) jag;
        } else if (i2 == 23) {
            this.w = (EsimActivationInfo) jag;
        } else if (i2 == 24) {
            this.x = (AdvertisementOptions) jag;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i2), jag.getClass().getCanonicalName()}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 7) {
            this.g = str2;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
    }

    public BootstrapOptions(Set set, int i2, int i3, boolean z2, List list, byte b2, String str, CompanionApp companionApp, boolean z3, int i4, int i5, long j2, boolean z4, boolean z5, boolean z6, boolean z7, int i6, long j3, int i7, long j4, PostTransferAction postTransferAction, byte[] bArr, EsimActivationInfo esimActivationInfo, AdvertisementOptions advertisementOptions, int i8, boolean z8) {
        this.a = set;
        this.b = i2;
        this.c = i3;
        this.d = z2;
        this.e = list;
        this.f = b2;
        this.g = str;
        this.h = companionApp;
        this.i = z3;
        this.j = i4;
        this.k = i5;
        this.l = j2;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = i6;
        this.r = j3;
        this.s = i7;
        this.t = j4;
        this.u = postTransferAction;
        this.v = bArr;
        this.w = esimActivationInfo;
        this.x = advertisementOptions;
        this.y = i8;
        this.z = z8;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.d = z2;
        } else if (i2 == 9) {
            this.i = z2;
        } else if (i2 != 26) {
            switch (i2) {
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    this.m = z2;
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    this.n = z2;
                    break;
                case Service.START_CONTINUATION_MASK:
                    this.o = z2;
                    break;
                case 16:
                    this.p = z2;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            this.z = z2;
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 22) {
            this.v = bArr;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void b(int i2) {
        this.j = i2;
        this.a.add(10);
    }

    public final void b(long j2) {
        this.r = j2;
        this.a.add(18);
    }

    public final void a(PostTransferAction postTransferAction) {
        this.u = postTransferAction;
        this.a.add(21);
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.e = arrayList;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(i2)}));
    }

    public final void a(boolean z2) {
        this.m = z2;
        this.a.add(13);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    public final void b(boolean z2) {
        this.o = z2;
        this.a.add(15);
    }
}
