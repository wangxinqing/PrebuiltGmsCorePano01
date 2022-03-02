package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthenticatorTransferInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ett();
    private static final HashMap i;
    final Set a;
    final int b;
    public String c;
    public int d;
    public byte[] e;
    public PendingIntent f;
    public DeviceMetaData g;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("accountType", FastJsonResponse$Field.f("accountType", 2));
        i.put("status", FastJsonResponse$Field.a("status", 3));
        i.put("transferBytes", FastJsonResponse$Field.h("transferBytes", 4));
    }

    public AuthenticatorTransferInfo() {
        this.a = new ob(3);
        this.b = 1;
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return i;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 1) {
            return Integer.valueOf(this.b);
        }
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 3) {
            return Integer.valueOf(this.d);
        }
        if (i2 == 4) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public AuthenticatorTransferInfo(Set set, int i2, String str, int i3, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.a = set;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = deviceMetaData;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 3) {
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
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f, i2, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.g, i2, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = str2;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.e = bArr;
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
