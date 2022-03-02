package com.google.android.gms.smartdevice.postsetup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HandshakeData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new acgf();
    private static final HashMap d;
    final Set a;
    public byte[] b;
    public byte[] c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("message", FastJsonResponse$Field.h("message", 2));
        d.put("hmac", FastJsonResponse$Field.h("hmac", 3));
    }

    public HandshakeData() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return d;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void c(byte[] bArr) {
        this.b = bArr;
        this.a.add(2);
    }

    public HandshakeData(Set set, byte[] bArr, byte[] bArr2) {
        this.a = set;
        this.b = bArr;
        this.c = bArr2;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = bArr;
        } else if (i == 3) {
            this.c = bArr;
        } else {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an byte array.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, true);
        }
        ivx.b(parcel, a2);
    }

    public HandshakeData(byte[] bArr) {
        this();
        c(bArr);
    }

    public HandshakeData(byte[] bArr, byte[] bArr2) {
        this();
        c(bArr);
        this.c = bArr2;
        this.a.add(3);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
