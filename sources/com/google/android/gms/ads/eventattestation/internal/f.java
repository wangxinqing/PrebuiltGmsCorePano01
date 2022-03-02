package com.google.android.gms.ads.eventattestation.internal;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class f extends bhw implements g {
    public f() {
        super("com.google.android.gms.ads.eventattestation.internal.IEventAttestationService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.gms.ads.eventattestation.internal.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.gms.ads.eventattestation.internal.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.gms.ads.eventattestation.internal.h} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r2, android.os.Parcel r3, android.os.Parcel r4) {
        /*
            r1 = this;
            r4 = 2
            r0 = 0
            if (r2 == r4) goto L_0x005a
            r4 = 3
            if (r2 == r4) goto L_0x0033
            r4 = 4
            if (r2 == r4) goto L_0x000c
            r2 = 0
            return r2
        L_0x000c:
            android.os.Parcelable$Creator r2 = com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel r2 = (com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 == 0) goto L_0x002e
            java.lang.String r4 = "com.google.android.gms.ads.eventattestation.internal.IImpressionAttestationTokenCallback"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.ads.eventattestation.internal.h
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.ads.eventattestation.internal.h r0 = (com.google.android.gms.ads.eventattestation.internal.h) r0
            goto L_0x002f
        L_0x0028:
            com.google.android.gms.ads.eventattestation.internal.h r0 = new com.google.android.gms.ads.eventattestation.internal.h
            r0.<init>(r3)
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            r1.a((com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel) r2, (com.google.android.gms.ads.eventattestation.internal.h) r0)
            goto L_0x0078
        L_0x0033:
            android.os.Parcelable$Creator r2 = com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel r2 = (com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 == 0) goto L_0x0055
            java.lang.String r4 = "com.google.android.gms.ads.eventattestation.internal.IAdRequestAttestationTokenCallback"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.ads.eventattestation.internal.d
            if (r0 == 0) goto L_0x004f
            r0 = r4
            com.google.android.gms.ads.eventattestation.internal.d r0 = (com.google.android.gms.ads.eventattestation.internal.d) r0
            goto L_0x0056
        L_0x004f:
            com.google.android.gms.ads.eventattestation.internal.d r0 = new com.google.android.gms.ads.eventattestation.internal.d
            r0.<init>(r3)
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            r1.a((com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel) r2, (com.google.android.gms.ads.eventattestation.internal.d) r0)
            goto L_0x0078
        L_0x005a:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0074
            java.lang.String r3 = "com.google.android.gms.ads.eventattestation.internal.IAdvertisingIdCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.eventattestation.internal.e
            if (r4 == 0) goto L_0x006e
            r0 = r3
            com.google.android.gms.ads.eventattestation.internal.e r0 = (com.google.android.gms.ads.eventattestation.internal.e) r0
            goto L_0x0075
        L_0x006e:
            com.google.android.gms.ads.eventattestation.internal.e r0 = new com.google.android.gms.ads.eventattestation.internal.e
            r0.<init>(r2)
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            r1.a(r0)
        L_0x0078:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.eventattestation.internal.f.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
