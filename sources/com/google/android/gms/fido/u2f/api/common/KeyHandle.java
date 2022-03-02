package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class KeyHandle extends AbstractSafeParcelable implements myv {
    public static final Parcelable.Creator CREATOR = new nbu();
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.d = list;
        } catch (nbw e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final JSONObject a() {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r3 = r5.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 == r5) goto L_0x0040
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.KeyHandle
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.gms.fido.u2f.api.common.KeyHandle r5 = (com.google.android.gms.fido.u2f.api.common.KeyHandle) r5
            byte[] r1 = r4.b
            byte[] r3 = r5.b
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x003f
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r1 = r4.c
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r3 = r5.c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
            java.util.List r1 = r4.d
            if (r1 != 0) goto L_0x0028
            java.util.List r3 = r5.d
            if (r3 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            return r0
        L_0x0028:
            if (r1 == 0) goto L_0x003f
            java.util.List r3 = r5.d
            if (r3 == 0) goto L_0x003f
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L_0x003f
            java.util.List r5 = r5.d
            java.util.List r1 = r4.d
            boolean r5 = r5.containsAll(r1)
            if (r5 == 0) goto L_0x003f
            return r0
        L_0x003f:
            return r2
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.KeyHandle.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    public final String toString() {
        String str;
        List list = this.d;
        if (list != null) {
            str = list.toString();
        } else {
            str = "null";
        }
        return String.format("{keyHandle: %s, version: %s, transports: %s}", new Object[]{jhy.b(this.b), this.c, str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c.d, false);
        ivx.c(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }

    public KeyHandle(byte[] bArr, ProtocolVersion protocolVersion, List list) {
        this.a = 1;
        this.b = bArr;
        this.c = protocolVersion;
        this.d = list;
    }
}
