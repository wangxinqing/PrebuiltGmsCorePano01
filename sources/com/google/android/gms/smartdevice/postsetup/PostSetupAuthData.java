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
public class PostSetupAuthData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new acgg();
    private static final HashMap d;
    public final Set a;
    public byte[] b;
    public HandshakeData c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("key", FastJsonResponse$Field.h("key", 2));
        d.put("handshake", FastJsonResponse$Field.a("handshake", 3, HandshakeData.class));
    }

    public PostSetupAuthData() {
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

    public PostSetupAuthData(Set set, byte[] bArr, HandshakeData handshakeData) {
        this.a = set;
        this.b = bArr;
        this.c = handshakeData;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = (HandshakeData) jag;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i), jag.getClass().getCanonicalName()}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, i, true);
        }
        ivx.b(parcel, a2);
    }

    public PostSetupAuthData(byte[] bArr) {
        this();
        this.b = bArr;
        this.a.add(2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = bArr;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
