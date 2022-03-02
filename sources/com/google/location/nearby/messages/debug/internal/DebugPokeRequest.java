package com.google.location.nearby.messages.debug.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DebugPokeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asmz();
    final int a;
    public byte[] b;
    public final asne c;
    public final asnf d;
    public final asnf e;
    public final asnf f;
    public final asnf g;

    /* JADX WARNING: type inference failed for: r7v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DebugPokeRequest(int r5, byte[] r6, android.os.IBinder r7, android.os.IBinder r8, android.os.IBinder r9, android.os.IBinder r10, android.os.IBinder r11) {
        /*
            r4 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0016
            java.lang.String r1 = "com.google.location.nearby.messages.debug.internal.IDebugPokeTokenCallback"
            android.os.IInterface r1 = r7.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.asne
            if (r2 == 0) goto L_0x0010
            asne r1 = (defpackage.asne) r1
            goto L_0x0017
        L_0x0010:
            asne r1 = new asne
            r1.<init>(r7)
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            java.lang.String r7 = "com.google.location.nearby.messages.debug.internal.IProtoMessageCallback"
            if (r8 == 0) goto L_0x002c
            android.os.IInterface r2 = r8.queryLocalInterface(r7)
            boolean r3 = r2 instanceof defpackage.asnf
            if (r3 == 0) goto L_0x0026
            asnf r2 = (defpackage.asnf) r2
            goto L_0x002d
        L_0x0026:
            asnf r2 = new asnf
            r2.<init>(r8)
            goto L_0x002d
        L_0x002c:
            r2 = r0
        L_0x002d:
            if (r9 == 0) goto L_0x0040
            android.os.IInterface r8 = r9.queryLocalInterface(r7)
            boolean r3 = r8 instanceof defpackage.asnf
            if (r3 == 0) goto L_0x003a
            asnf r8 = (defpackage.asnf) r8
            goto L_0x0041
        L_0x003a:
            asnf r8 = new asnf
            r8.<init>(r9)
            goto L_0x0041
        L_0x0040:
            r8 = r0
        L_0x0041:
            if (r10 == 0) goto L_0x0054
            android.os.IInterface r9 = r10.queryLocalInterface(r7)
            boolean r3 = r9 instanceof defpackage.asnf
            if (r3 == 0) goto L_0x004e
            asnf r9 = (defpackage.asnf) r9
            goto L_0x0055
        L_0x004e:
            asnf r9 = new asnf
            r9.<init>(r10)
            goto L_0x0055
        L_0x0054:
            r9 = r0
        L_0x0055:
            if (r11 == 0) goto L_0x0069
            android.os.IInterface r7 = r11.queryLocalInterface(r7)
            boolean r10 = r7 instanceof defpackage.asnf
            if (r10 == 0) goto L_0x0063
            r0 = r7
            asnf r0 = (defpackage.asnf) r0
            goto L_0x006a
        L_0x0063:
            asnf r0 = new asnf
            r0.<init>(r11)
            goto L_0x006a
        L_0x0069:
        L_0x006a:
            r4.<init>()
            r4.a = r5
            r4.b = r6
            r4.c = r1
            r4.d = r2
            r4.e = r8
            r4.f = r9
            r4.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.location.nearby.messages.debug.internal.DebugPokeRequest.<init>(int, byte[], android.os.IBinder, android.os.IBinder, android.os.IBinder, android.os.IBinder, android.os.IBinder):void");
    }

    public final String toString() {
        Integer num;
        Object[] objArr = new Object[6];
        objArr[0] = this.g;
        objArr[1] = this.f;
        objArr[2] = this.e;
        objArr[3] = this.d;
        objArr[4] = this.c;
        byte[] bArr = this.b;
        if (bArr != null) {
            num = Integer.valueOf(bArr.length);
        } else {
            num = null;
        }
        objArr[5] = num;
        return String.format("DebugPokeRequest{operationCallback=%s, gcmCallback=%s, configurationCallback=%s, networkCallback=%s, tokenCallback=%s, protoData.length=%s}", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        IBinder iBinder3;
        IBinder iBinder4;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 4, this.b, false);
        asne asne = this.c;
        IBinder iBinder5 = null;
        if (asne != null) {
            iBinder = asne.a;
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 5, iBinder);
        asnf asnf = this.d;
        if (asnf != null) {
            iBinder2 = asnf.a;
        } else {
            iBinder2 = null;
        }
        ivx.a(parcel, 7, iBinder2);
        asnf asnf2 = this.e;
        if (asnf2 != null) {
            iBinder3 = asnf2.a;
        } else {
            iBinder3 = null;
        }
        ivx.a(parcel, 8, iBinder3);
        asnf asnf3 = this.f;
        if (asnf3 != null) {
            iBinder4 = asnf3.a;
        } else {
            iBinder4 = null;
        }
        ivx.a(parcel, 9, iBinder4);
        asnf asnf4 = this.g;
        if (asnf4 != null) {
            iBinder5 = asnf4.a;
        }
        ivx.a(parcel, 10, iBinder5);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
