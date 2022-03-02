package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class D2DDevice extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abou();
    private static final HashMap i;
    final Set a;
    public int b;
    public String c;
    public String d;
    public byte e;
    @Deprecated
    public String f;
    @Deprecated
    public byte[] g;
    public int h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("protocol", FastJsonResponse$Field.a("protocol", 2));
        i.put("name", FastJsonResponse$Field.f("name", 3));
        i.put("deviceId", FastJsonResponse$Field.f("deviceId", 4));
        i.put("deviceType", FastJsonResponse$Field.a("deviceType", 5));
        i.put("btUuid", FastJsonResponse$Field.f("btUuid", 6));
        i.put("cryptAuthHello", FastJsonResponse$Field.h("cryptAuthHello", 7));
        i.put("bluetoothMacAddr", FastJsonResponse$Field.f("bluetoothMacAddr", 8));
        i.put("verificationStyle", FastJsonResponse$Field.a("verificationStyle", 9));
    }

    public D2DDevice() {
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
                return Integer.valueOf(this.b);
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return Byte.valueOf(this.e);
            case 6:
                return this.f;
            case 7:
                return this.g;
            case 9:
                return Integer.valueOf(this.h);
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final void e(String str) {
        this.c = str;
        this.a.add(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        D2DDevice d2DDevice = (D2DDevice) obj;
        String str = this.c;
        if (str == null ? d2DDevice.c != null : !str.equals(d2DDevice.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 != null) {
            return str2.equals(d2DDevice.d);
        }
        return d2DDevice.d == null;
    }

    public final void f(String str) {
        this.d = str;
        this.a.add(4);
    }

    public final int hashCode() {
        String str = this.c;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public D2DDevice(int i2, String str, String str2, byte b2, int i3) {
        this();
        a(i2);
        e(str);
        f(str2);
        a(b2);
        this.f = null;
        this.a.add(6);
        this.g = null;
        this.a.add(7);
        this.h = i3;
        this.a.add(9);
    }

    public final void a(byte b2) {
        this.e = b2;
        this.a.add(5);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.b(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.g, true);
        }
        if (set.contains(9)) {
            ivx.b(parcel, 9, this.h);
        }
        ivx.b(parcel, a2);
    }

    public final void a(int i2) {
        this.b = i2;
        this.a.add(2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 2) {
            this.b = i2;
        } else if (i3 == 5) {
            this.e = (byte) i2;
        } else if (i3 == 9) {
            this.h = i2;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i3);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i3));
    }

    public D2DDevice(Set set, int i2, String str, String str2, byte b2, String str3, byte[] bArr, int i3) {
        this.a = set;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = b2;
        this.f = str3;
        this.g = bArr;
        this.h = i3;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = str2;
        } else if (i2 == 4) {
            this.d = str2;
        } else if (i2 == 6) {
            this.f = str2;
        } else if (i2 != 8) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 7) {
            this.g = bArr;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
