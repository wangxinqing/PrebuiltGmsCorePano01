package defpackage;

import android.os.IInterface;

/* renamed from: nbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nbh extends bhw implements IInterface {
    final /* synthetic */ gpq a;

    public nbh() {
        super("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
    }

    /* JADX WARNING: type inference failed for: r3v21, types: [android.os.IInterface] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0218 A[Catch:{ ncw -> 0x02d7, JSONException -> 0x02e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0219 A[Catch:{ ncw -> 0x02d7, JSONException -> 0x02e2 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r17, android.os.Parcel r18, android.os.Parcel r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "ViewOptions"
            java.lang.String r4 = "devicesList"
            java.lang.String r5 = "locationServiceEnabled"
            java.lang.String r6 = "recommendUsb"
            java.lang.String r7 = "alternateAvailableTransports"
            java.lang.String r8 = "tupNeeded"
            java.lang.String r9 = "previousPairingAttemptFailed"
            java.lang.String r10 = "bluetoothEnabled"
            java.lang.String r11 = "anyU2fDevicesPaired"
            java.lang.String r12 = "deviceRemovedTooSoon"
            r14 = 1
            r15 = 0
            if (r0 == r14) goto L_0x00ef
            r3 = 2
            if (r0 == r3) goto L_0x00d4
            r3 = 3
            if (r0 == r3) goto L_0x00b9
            r3 = 4
            if (r0 == r3) goto L_0x0060
            r2 = 5
            if (r0 == r2) goto L_0x002b
            return r15
        L_0x002b:
            gpq r0 = r1.a
            iwd r2 = defpackage.gqa.d
            java.lang.Object[] r3 = new java.lang.Object[r15]
            java.lang.String r4 = "onDisableNfcReaderMode is called"
            r2.a(r4, r3)
            gqa r2 = r0.b
            com.google.android.chimera.Activity r2 = r2.getActivity()
            android.content.Context r2 = r2.getApplicationContext()
            myx r2 = defpackage.myx.a((android.content.Context) r2)
            if (r2 == 0) goto L_0x0055
            gqa r0 = r0.b
            com.google.android.chimera.Activity r0 = r0.getActivity()
            android.app.Activity r0 = r0.getContainerActivity()
            r2.a((android.app.Activity) r0)
            goto L_0x02f4
        L_0x0055:
            iwd r0 = defpackage.gqa.d
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.String r3 = "onDisableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!"
            r0.e(r3, r2)
            goto L_0x02f4
        L_0x0060:
            android.os.IBinder r0 = r18.readStrongBinder()
            if (r0 == 0) goto L_0x007a
            java.lang.String r3 = "com.google.android.gms.fido.common.nfc.INfcReaderCallback"
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof defpackage.myw
            if (r4 == 0) goto L_0x0074
            r13 = r3
            myw r13 = (defpackage.myw) r13
            goto L_0x007b
        L_0x0074:
            myw r13 = new myw
            r13.<init>(r0)
            goto L_0x007b
        L_0x007a:
            r13 = 0
        L_0x007b:
            int r0 = r18.readInt()
            gpq r2 = r1.a
            iwd r3 = defpackage.gqa.d
            java.lang.Object[] r4 = new java.lang.Object[r15]
            java.lang.String r5 = "onEnableNfcReaderMode is called"
            r3.a(r5, r4)
            gpp r3 = new gpp
            r3.<init>(r13)
            gqa r4 = r2.b
            com.google.android.chimera.Activity r4 = r4.getActivity()
            android.content.Context r4 = r4.getApplicationContext()
            myx r4 = defpackage.myx.a((android.content.Context) r4)
            if (r4 == 0) goto L_0x00ae
            gqa r2 = r2.b
            com.google.android.chimera.Activity r2 = r2.getActivity()
            android.app.Activity r2 = r2.getContainerActivity()
            r4.a(r2, r3, r0)
            goto L_0x02f4
        L_0x00ae:
            iwd r0 = defpackage.gqa.d
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.String r3 = "onEnableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!"
            r0.e(r3, r2)
            goto L_0x02f4
        L_0x00b9:
            android.os.Parcelable$Creator r0 = com.google.android.gms.fido.u2f.api.common.SignResponseData.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.fido.u2f.api.common.SignResponseData r0 = (com.google.android.gms.fido.u2f.api.common.SignResponseData) r0
            gpq r2 = r1.a
            gqa r2 = r2.b
            ncl r3 = r2.C
            nci r0 = r3.a(r0)
            java.lang.String r0 = r0.toString()
            r2.e(r0)
            goto L_0x02f4
        L_0x00d4:
            android.os.Parcelable$Creator r0 = com.google.android.gms.fido.u2f.api.common.ErrorResponseData.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.fido.u2f.api.common.ErrorResponseData r0 = (com.google.android.gms.fido.u2f.api.common.ErrorResponseData) r0
            gpq r2 = r1.a
            gqa r2 = r2.b
            ncl r3 = r2.C
            nci r0 = r3.a(r0)
            java.lang.String r0 = r0.toString()
            r2.e(r0)
            goto L_0x02f4
        L_0x00ef:
            java.lang.String r0 = r18.readString()
            gpq r2 = r1.a
            iwd r13 = defpackage.gqa.d
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r15] = r0
            java.lang.String r15 = "onViewSelected is called with %s"
            r13.a(r15, r1)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02e2 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x02e2 }
            java.lang.String r0 = "viewName"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ ncw -> 0x02d7 }
            ncx[] r13 = defpackage.ncx.values()     // Catch:{ ncw -> 0x02d7 }
            int r15 = r13.length     // Catch:{ ncw -> 0x02d7 }
            r14 = 0
        L_0x0111:
            if (r14 >= r15) goto L_0x02d1
            r17 = r15
            r15 = r13[r14]     // Catch:{ ncw -> 0x02d7 }
            r18 = r13
            java.lang.String r13 = r15.k     // Catch:{ ncw -> 0x02d7 }
            boolean r13 = r0.equals(r13)     // Catch:{ ncw -> 0x02d7 }
            if (r13 != 0) goto L_0x0128
            int r14 = r14 + 1
            r15 = r17
            r13 = r18
            goto L_0x0111
        L_0x0128:
            int r0 = r15.ordinal()     // Catch:{ JSONException -> 0x02e2 }
            switch(r0) {
                case 0: goto L_0x01fa;
                case 1: goto L_0x01d9;
                case 2: goto L_0x01d2;
                case 3: goto L_0x01bf;
                case 4: goto L_0x019e;
                case 5: goto L_0x0192;
                case 6: goto L_0x017a;
                case 7: goto L_0x013b;
                case 8: goto L_0x0133;
                default: goto L_0x012f;
            }     // Catch:{ JSONException -> 0x02e2 }
        L_0x012f:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x02bf
        L_0x0133:
            com.google.android.gms.fido.u2f.api.view.UsbViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.UsbViewOptions     // Catch:{ JSONException -> 0x02e2 }
            r0.<init>()     // Catch:{ JSONException -> 0x02e2 }
            r4 = r0
            goto L_0x0211
        L_0x013b:
            boolean r0 = r1.has(r9)     // Catch:{ JSONException -> 0x02e2 }
            if (r0 == 0) goto L_0x0147
            boolean r0 = r1.getBoolean(r9)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x0148
        L_0x0147:
            r0 = 0
        L_0x0148:
            boolean r5 = r1.has(r4)     // Catch:{ JSONException -> 0x02e2 }
            if (r5 == 0) goto L_0x0172
            org.json.JSONArray r4 = r1.getJSONArray(r4)     // Catch:{ JSONException -> 0x02e2 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ JSONException -> 0x02e2 }
            int r5 = r4.length()     // Catch:{ JSONException -> 0x02e2 }
            r13.<init>(r5)     // Catch:{ JSONException -> 0x02e2 }
            r5 = 0
        L_0x015d:
            int r6 = r4.length()     // Catch:{ JSONException -> 0x02e2 }
            if (r5 >= r6) goto L_0x0171
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x02e2 }
            com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier r6 = com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier.a(r6)     // Catch:{ JSONException -> 0x02e2 }
            r13.add(r6)     // Catch:{ JSONException -> 0x02e2 }
            int r5 = r5 + 1
            goto L_0x015d
        L_0x0171:
            goto L_0x0173
        L_0x0172:
            r13 = 0
        L_0x0173:
            com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions r4 = new com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions     // Catch:{ JSONException -> 0x02e2 }
            r4.<init>(r0, r13)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x0211
        L_0x017a:
            com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier r0 = com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier.a(r1)     // Catch:{ JSONException -> 0x02e2 }
            boolean r4 = r1.has(r8)     // Catch:{ JSONException -> 0x02e2 }
            if (r4 == 0) goto L_0x0189
            boolean r4 = r1.getBoolean(r8)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x018a
        L_0x0189:
            r4 = 0
        L_0x018a:
            com.google.android.gms.fido.u2f.api.view.BleProcessRequestViewOptions r5 = new com.google.android.gms.fido.u2f.api.view.BleProcessRequestViewOptions     // Catch:{ JSONException -> 0x02e2 }
            r5.<init>(r0, r4)     // Catch:{ JSONException -> 0x02e2 }
            r4 = r5
            goto L_0x0211
        L_0x0192:
            com.google.android.gms.fido.u2f.api.view.BlePairViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.BlePairViewOptions     // Catch:{ JSONException -> 0x02e2 }
            com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier r4 = com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier.a(r1)     // Catch:{ JSONException -> 0x02e2 }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x02e2 }
            r4 = r0
            goto L_0x0211
        L_0x019e:
            boolean r0 = r1.has(r10)     // Catch:{ JSONException -> 0x02e2 }
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r1.getBoolean(r10)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x01ab
        L_0x01aa:
            r0 = 0
        L_0x01ab:
            boolean r4 = r1.has(r5)     // Catch:{ JSONException -> 0x02e2 }
            if (r4 == 0) goto L_0x01b7
            boolean r4 = r1.getBoolean(r5)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x01b8
        L_0x01b7:
            r4 = 0
        L_0x01b8:
            com.google.android.gms.fido.u2f.api.view.BleEnableViewOptions r5 = new com.google.android.gms.fido.u2f.api.view.BleEnableViewOptions     // Catch:{ JSONException -> 0x02e2 }
            r5.<init>(r0, r4)     // Catch:{ JSONException -> 0x02e2 }
            r4 = r5
            goto L_0x0211
        L_0x01bf:
            boolean r0 = r1.has(r11)     // Catch:{ JSONException -> 0x02e2 }
            if (r0 == 0) goto L_0x01cb
            boolean r0 = r1.getBoolean(r11)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x01cc
        L_0x01cb:
            r0 = 0
        L_0x01cc:
            com.google.android.gms.fido.u2f.api.view.BleViewOptions r4 = new com.google.android.gms.fido.u2f.api.view.BleViewOptions     // Catch:{ JSONException -> 0x02e2 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x0211
        L_0x01d2:
            com.google.android.gms.fido.u2f.api.view.NfcEnableViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.NfcEnableViewOptions     // Catch:{ JSONException -> 0x02e2 }
            r0.<init>()     // Catch:{ JSONException -> 0x02e2 }
            r4 = r0
            goto L_0x0211
        L_0x01d9:
            boolean r0 = r1.has(r12)     // Catch:{ JSONException -> 0x02e2 }
            if (r0 == 0) goto L_0x01e5
            boolean r0 = r1.getBoolean(r12)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x01e6
        L_0x01e5:
            r0 = 0
        L_0x01e6:
            boolean r4 = r1.has(r6)     // Catch:{ JSONException -> 0x02e2 }
            if (r4 == 0) goto L_0x01f2
            boolean r4 = r1.getBoolean(r6)     // Catch:{ JSONException -> 0x02e2 }
            goto L_0x01f3
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            com.google.android.gms.fido.u2f.api.view.NfcViewOptions r5 = new com.google.android.gms.fido.u2f.api.view.NfcViewOptions     // Catch:{ JSONException -> 0x02e2 }
            r5.<init>(r0, r4)     // Catch:{ JSONException -> 0x02e2 }
            r4 = r5
            goto L_0x0211
        L_0x01fa:
            java.lang.String r0 = "transports"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x02e2 }
            java.util.List r0 = com.google.android.gms.fido.common.Transport.a((org.json.JSONArray) r0)     // Catch:{ JSONException -> 0x02e2 }
            if (r0 == 0) goto L_0x02b7
            com.google.android.gms.fido.u2f.api.view.MultiTransportViewOptions r4 = new com.google.android.gms.fido.u2f.api.view.MultiTransportViewOptions     // Catch:{ JSONException -> 0x02e2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x02e2 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x02e2 }
            r6 = 1
            r4.<init>(r6, r5)     // Catch:{ JSONException -> 0x02e2 }
        L_0x0211:
            boolean r0 = r1.has(r7)     // Catch:{ JSONException -> 0x02e2 }
            if (r0 != 0) goto L_0x0219
            goto L_0x0258
        L_0x0219:
            java.lang.String r0 = "Alternate transport set is found"
            android.util.Log.i(r3, r0)     // Catch:{ JSONException -> 0x02e2 }
            java.lang.Class<com.google.android.gms.fido.common.Transport> r0 = com.google.android.gms.fido.common.Transport.class
            java.util.EnumSet r5 = java.util.EnumSet.noneOf(r0)     // Catch:{ JSONException -> 0x02e2 }
            org.json.JSONArray r0 = r1.getJSONArray(r7)     // Catch:{ myu -> 0x0240 }
            if (r0 != 0) goto L_0x022b
            goto L_0x0246
        L_0x022b:
            r1 = 0
        L_0x022c:
            int r6 = r0.length()     // Catch:{ myu -> 0x0240 }
            if (r1 >= r6) goto L_0x0246
            java.lang.String r6 = r0.getString(r1)     // Catch:{ myu -> 0x0240 }
            com.google.android.gms.fido.common.Transport r6 = com.google.android.gms.fido.common.Transport.a((java.lang.String) r6)     // Catch:{ myu -> 0x0240 }
            r5.add(r6)     // Catch:{ myu -> 0x0240 }
            int r1 = r1 + 1
            goto L_0x022c
        L_0x0240:
            r0 = move-exception
            java.lang.String r1 = "Ignoring transport"
            android.util.Log.e(r3, r1, r0)     // Catch:{ JSONException -> 0x02e2 }
        L_0x0246:
            boolean r0 = r5.isEmpty()     // Catch:{ JSONException -> 0x02e2 }
            if (r0 != 0) goto L_0x0258
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ JSONException -> 0x02e2 }
            r0.<init>()     // Catch:{ JSONException -> 0x02e2 }
            r4.c = r0     // Catch:{ JSONException -> 0x02e2 }
            java.util.Set r0 = r4.c     // Catch:{ JSONException -> 0x02e2 }
            r0.addAll(r5)     // Catch:{ JSONException -> 0x02e2 }
        L_0x0258:
            gqf r0 = r2.a
            iwd r1 = defpackage.gqf.a
            ncx r2 = r4.b()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 18
            r5.<init>(r3)
            java.lang.String r3 = "viewSelected(...) "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r1.b(r2, r5)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02b0 }
            r1.<init>()     // Catch:{ JSONException -> 0x02b0 }
            java.lang.String r2 = "type"
            java.lang.String r3 = "select_view"
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x02b0 }
            java.lang.String r2 = "data"
            org.json.JSONObject r3 = r4.a()     // Catch:{ JSONException -> 0x02b0 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x02b0 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3[r2] = r1
            java.lang.String r1 = "window.setSkUiEvent(%s);"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            gqa r0 = r0.b
            r0.f(r1)
            goto L_0x02f4
        L_0x02b0:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x02b7:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x02e2 }
            java.lang.String r1 = "null transports unexpected in MultiTransportViewOptions"
            r0.<init>(r1)     // Catch:{ JSONException -> 0x02e2 }
            throw r0     // Catch:{ JSONException -> 0x02e2 }
        L_0x02bf:
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ JSONException -> 0x02e2 }
            java.lang.String r1 = r15.k     // Catch:{ JSONException -> 0x02e2 }
            r4 = 0
            r3[r4] = r1     // Catch:{ JSONException -> 0x02e2 }
            java.lang.String r1 = "View %s unimplemented"
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ JSONException -> 0x02e2 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x02e2 }
            throw r0     // Catch:{ JSONException -> 0x02e2 }
        L_0x02d1:
            ncw r1 = new ncw     // Catch:{ ncw -> 0x02d7 }
            r1.<init>(r0)     // Catch:{ ncw -> 0x02d7 }
            throw r1     // Catch:{ ncw -> 0x02d7 }
        L_0x02d7:
            r0 = move-exception
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ JSONException -> 0x02e2 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x02e2 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x02e2 }
            throw r1     // Catch:{ JSONException -> 0x02e2 }
        L_0x02e2:
            r0 = move-exception
            iwd r1 = defpackage.gqa.d
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Invalid ViewOptions json."
            r1.e(r4, r0, r3)
            gqa r0 = r2.b
            com.google.android.gms.fido.u2f.api.common.ErrorCode r1 = com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR
            r0.a((com.google.android.gms.fido.u2f.api.common.ErrorCode) r1)
        L_0x02f4:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbh.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nbh(gpq gpq) {
        super("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
        this.a = gpq;
    }
}
