package defpackage;

import android.os.IInterface;

/* renamed from: mzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mzd extends bhw implements IInterface {
    final /* synthetic */ gps a;

    public mzd() {
        super("com.google.android.gms.fido.fido2.api.IResponseHandler");
    }

    /* JADX WARNING: type inference failed for: r3v46, types: [android.os.IInterface] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r22, android.os.Parcel r23, android.os.Parcel r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            java.lang.String r2 = "dataToSign"
            java.lang.String r3 = "signedData"
            java.lang.String r4 = "ViewOptions"
            java.lang.String r5 = "devicesList"
            java.lang.String r6 = "locationServiceEnabled"
            java.lang.String r7 = "recommendUsb"
            java.lang.String r8 = "tupNeeded"
            java.lang.String r9 = "alternateAvailableTransports"
            java.lang.String r10 = "rpId"
            java.lang.String r11 = "previousPairingAttemptFailed"
            java.lang.String r12 = "bluetoothEnabled"
            java.lang.String r13 = "anyFido2DevicesPaired"
            java.lang.String r14 = "deviceRemovedTooSoon"
            java.lang.String r15 = "statusCode"
            r24 = r4
            java.lang.String r4 = "keyHandle"
            r16 = 0
            r17 = r9
            r9 = 0
            switch(r22) {
                case 1: goto L_0x014e;
                case 2: goto L_0x0139;
                case 3: goto L_0x00c8;
                case 4: goto L_0x006b;
                case 5: goto L_0x0036;
                case 6: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r1 = 0
            return r1
        L_0x002e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "hideFingerprintOption should never be called for Fido2 request."
            r0.<init>(r2)
            throw r0
        L_0x0036:
            gps r0 = r1.a
            iwd r2 = defpackage.gqa.d
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r4 = "onDisableNfcReaderMode is called"
            r2.a(r4, r3)
            gqa r2 = r0.b
            com.google.android.chimera.Activity r2 = r2.getActivity()
            android.content.Context r2 = r2.getApplicationContext()
            myx r2 = defpackage.myx.a((android.content.Context) r2)
            if (r2 == 0) goto L_0x0060
            gqa r0 = r0.b
            com.google.android.chimera.Activity r0 = r0.getActivity()
            android.app.Activity r0 = r0.getContainerActivity()
            r2.a((android.app.Activity) r0)
            goto L_0x0406
        L_0x0060:
            iwd r0 = defpackage.gqa.d
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = "onDisableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!"
            r0.e(r3, r2)
            goto L_0x0406
        L_0x006b:
            android.os.IBinder r2 = r23.readStrongBinder()
            if (r2 == 0) goto L_0x0088
            java.lang.String r3 = "com.google.android.gms.fido.common.nfc.INfcReaderCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof defpackage.myw
            if (r4 == 0) goto L_0x0082
            r16 = r3
            myw r16 = (defpackage.myw) r16
            r3 = r16
            goto L_0x008a
        L_0x0082:
            myw r3 = new myw
            r3.<init>(r2)
            goto L_0x008a
        L_0x0088:
            r3 = r16
        L_0x008a:
            int r0 = r23.readInt()
            gps r2 = r1.a
            iwd r4 = defpackage.gqa.d
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r6 = "onEnableNfcReaderMode is called"
            r4.a(r6, r5)
            gpr r4 = new gpr
            r4.<init>(r3)
            gqa r3 = r2.b
            com.google.android.chimera.Activity r3 = r3.getActivity()
            android.content.Context r3 = r3.getApplicationContext()
            myx r3 = defpackage.myx.a((android.content.Context) r3)
            if (r3 == 0) goto L_0x00bd
            gqa r2 = r2.b
            com.google.android.chimera.Activity r2 = r2.getActivity()
            android.app.Activity r2 = r2.getContainerActivity()
            r3.a(r2, r4, r0)
            goto L_0x0406
        L_0x00bd:
            iwd r0 = defpackage.gqa.d
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = "onEnableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!"
            r0.e(r3, r2)
            goto L_0x0406
        L_0x00c8:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r0 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) r0
            gps r2 = r1.a
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r3 = r0.d
            if (r3 != 0) goto L_0x00e7
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r3 = r0.e
            if (r3 != 0) goto L_0x00e7
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r3 = r0.f
            if (r3 == 0) goto L_0x00df
            goto L_0x00e7
        L_0x00df:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "No response set."
            r0.<init>(r2)
            throw r0
        L_0x00e7:
            boolean r0 = r3 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse
            if (r0 == 0) goto L_0x0406
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r3 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) r3
            gqa r0 = r2.b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0130 }
            r2.<init>()     // Catch:{ JSONException -> 0x0130 }
            byte[] r5 = r3.a     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r5 = r3.a(r5)     // Catch:{ JSONException -> 0x0130 }
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r4 = "clientDataJSON"
            byte[] r5 = r3.b     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r5 = r3.a(r5)     // Catch:{ JSONException -> 0x0130 }
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r4 = "authenticatorData"
            byte[] r5 = r3.c     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r5 = r3.a(r5)     // Catch:{ JSONException -> 0x0130 }
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r4 = "signature"
            byte[] r5 = r3.d     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r5 = r3.a(r5)     // Catch:{ JSONException -> 0x0130 }
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0130 }
            byte[] r4 = r3.e     // Catch:{ JSONException -> 0x0130 }
            if (r4 == 0) goto L_0x012b
            java.lang.String r5 = "userHandle"
            java.lang.String r3 = r3.a(r4)     // Catch:{ JSONException -> 0x0130 }
            r2.put(r5, r3)     // Catch:{ JSONException -> 0x0130 }
        L_0x012b:
            r0.a((org.json.JSONObject) r2)
            goto L_0x0406
        L_0x0130:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error encoding AuthenticatorAssertionResponse to JSON object"
            r2.<init>(r3, r0)
            throw r2
        L_0x0139:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r0 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) r0
            gps r2 = r1.a
            gqa r2 = r2.b
            org.json.JSONObject r0 = r0.a()
            r2.a((org.json.JSONObject) r0)
            goto L_0x0406
        L_0x014e:
            java.lang.String r0 = r23.readString()
            gps r9 = r1.a
            iwd r1 = defpackage.gqa.d
            r18 = r7
            r22 = r9
            r9 = 1
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r9 = 0
            r7[r9] = r0
            java.lang.String r9 = "onViewSelected is called with %s"
            r1.a(r9, r7)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03f2 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x03f2 }
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            java.lang.String r0 = "viewName"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ naw -> 0x03e3 }
            nax[] r7 = defpackage.nax.values()     // Catch:{ naw -> 0x03e3 }
            int r9 = r7.length     // Catch:{ naw -> 0x03e3 }
            r19 = r14
            r14 = 0
        L_0x017b:
            if (r14 >= r9) goto L_0x03d9
            r23 = r9
            r9 = r7[r14]     // Catch:{ naw -> 0x03e3 }
            r20 = r7
            java.lang.String r7 = r9.n     // Catch:{ naw -> 0x03e3 }
            boolean r7 = r0.equals(r7)     // Catch:{ naw -> 0x03e3 }
            if (r7 != 0) goto L_0x0192
            int r14 = r14 + 1
            r9 = r23
            r7 = r20
            goto L_0x017b
        L_0x0192:
            int r0 = r9.ordinal()     // Catch:{ JSONException -> 0x03f2 }
            switch(r0) {
                case 0: goto L_0x02f9;
                case 1: goto L_0x02d3;
                case 2: goto L_0x02cc;
                case 3: goto L_0x02b6;
                case 4: goto L_0x0294;
                case 5: goto L_0x0285;
                case 6: goto L_0x026b;
                case 7: goto L_0x0228;
                case 8: goto L_0x0220;
                case 9: goto L_0x0218;
                case 10: goto L_0x01d6;
                case 11: goto L_0x01a7;
                case 12: goto L_0x019f;
                default: goto L_0x0199;
            }
        L_0x0199:
            r1 = r22
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x03f0 }
            goto L_0x03c7
        L_0x019f:
            com.google.android.gms.fido.fido2.api.view.RequestValidationViewOptions r0 = new com.google.android.gms.fido.fido2.api.view.RequestValidationViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r0.<init>()     // Catch:{ JSONException -> 0x03f2 }
            r3 = r0
            goto L_0x0314
        L_0x01a7:
            boolean r0 = r1.has(r15)     // Catch:{ JSONException -> 0x03f2 }
            if (r0 == 0) goto L_0x01ce
            int r0 = r1.getInt(r15)     // Catch:{ JSONException -> 0x03f2 }
            boolean r2 = r1.has(r3)     // Catch:{ JSONException -> 0x03f2 }
            if (r2 == 0) goto L_0x01c5
            java.lang.String r2 = r1.getString(r3)     // Catch:{ JSONException -> 0x03f2 }
            anml r3 = defpackage.anml.e     // Catch:{ JSONException -> 0x03f2 }
            byte[] r16 = r3.b((java.lang.CharSequence) r2)     // Catch:{ JSONException -> 0x03f2 }
            r2 = r16
            goto L_0x01c7
        L_0x01c5:
            r2 = r16
        L_0x01c7:
            com.google.android.gms.fido.fido2.api.view.InternalTransportChallengeCompletedViewOptions r3 = new com.google.android.gms.fido.fido2.api.view.InternalTransportChallengeCompletedViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r3.<init>(r0, r2)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x0314
        L_0x01ce:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x03f2 }
            java.lang.String r1 = "Null statusCode unexpected in InternalTransportChallengeCompletedViewOptions"
            r0.<init>(r1)     // Catch:{ JSONException -> 0x03f2 }
            throw r0     // Catch:{ JSONException -> 0x03f2 }
        L_0x01d6:
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            boolean r0 = r1.has(r10)     // Catch:{ JSONException -> 0x03f2 }
            if (r0 == 0) goto L_0x0210
            java.lang.String r0 = r1.getString(r10)     // Catch:{ JSONException -> 0x03f2 }
            boolean r3 = r1.has(r4)     // Catch:{ JSONException -> 0x03f2 }
            if (r3 == 0) goto L_0x01f2
            java.lang.String r3 = r1.getString(r4)     // Catch:{ JSONException -> 0x03f2 }
            byte[] r3 = com.google.android.gms.fido.fido2.api.view.InternalTransportChallengeViewOptions.a((java.lang.String) r3)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x01f4
        L_0x01f2:
            r3 = r16
        L_0x01f4:
            boolean r4 = r1.has(r2)     // Catch:{ JSONException -> 0x03f2 }
            if (r4 == 0) goto L_0x0206
            java.lang.String r2 = r1.getString(r2)     // Catch:{ JSONException -> 0x03f2 }
            byte[] r16 = com.google.android.gms.fido.fido2.api.view.InternalTransportChallengeViewOptions.a((java.lang.String) r2)     // Catch:{ JSONException -> 0x03f2 }
            r2 = r16
            goto L_0x0208
        L_0x0206:
            r2 = r16
        L_0x0208:
            com.google.android.gms.fido.fido2.api.view.InternalTransportChallengeViewOptions r4 = new com.google.android.gms.fido.fido2.api.view.InternalTransportChallengeViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r4.<init>(r0, r3, r2)     // Catch:{ JSONException -> 0x03f2 }
            r3 = r4
            goto L_0x0314
        L_0x0210:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x03f2 }
            java.lang.String r1 = "Null rpId unexpected in InternalTransportChallengeViewOptions"
            r0.<init>(r1)     // Catch:{ JSONException -> 0x03f2 }
            throw r0     // Catch:{ JSONException -> 0x03f2 }
        L_0x0218:
            com.google.android.gms.fido.fido2.api.view.InternalTransportUserSelectedViewOptions r0 = new com.google.android.gms.fido.fido2.api.view.InternalTransportUserSelectedViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r0.<init>()     // Catch:{ JSONException -> 0x03f2 }
            r3 = r0
            goto L_0x0314
        L_0x0220:
            com.google.android.gms.fido.fido2.api.view.UsbViewOptions r0 = new com.google.android.gms.fido.fido2.api.view.UsbViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r0.<init>()     // Catch:{ JSONException -> 0x03f2 }
            r3 = r0
            goto L_0x0314
        L_0x0228:
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            boolean r0 = r1.has(r11)     // Catch:{ JSONException -> 0x03f2 }
            if (r0 == 0) goto L_0x0236
            boolean r0 = r1.getBoolean(r11)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x0237
        L_0x0236:
            r0 = 0
        L_0x0237:
            boolean r2 = r1.has(r5)     // Catch:{ JSONException -> 0x03f2 }
            if (r2 == 0) goto L_0x0261
            org.json.JSONArray r2 = r1.getJSONArray(r5)     // Catch:{ JSONException -> 0x03f2 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ JSONException -> 0x03f2 }
            int r4 = r2.length()     // Catch:{ JSONException -> 0x03f2 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x03f2 }
            r4 = 0
        L_0x024c:
            int r5 = r2.length()     // Catch:{ JSONException -> 0x03f2 }
            if (r4 >= r5) goto L_0x0260
            org.json.JSONObject r5 = r2.getJSONObject(r4)     // Catch:{ JSONException -> 0x03f2 }
            com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier r5 = com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier.a(r5)     // Catch:{ JSONException -> 0x03f2 }
            r3.add(r5)     // Catch:{ JSONException -> 0x03f2 }
            int r4 = r4 + 1
            goto L_0x024c
        L_0x0260:
            goto L_0x0263
        L_0x0261:
            r3 = r16
        L_0x0263:
            com.google.android.gms.fido.fido2.api.view.BleSelectViewOptions r2 = new com.google.android.gms.fido.fido2.api.view.BleSelectViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r2.<init>(r0, r3)     // Catch:{ JSONException -> 0x03f2 }
            r3 = r2
            goto L_0x0314
        L_0x026b:
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier r0 = com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier.a(r1)     // Catch:{ JSONException -> 0x03f2 }
            boolean r2 = r1.has(r8)     // Catch:{ JSONException -> 0x03f2 }
            if (r2 == 0) goto L_0x027d
            boolean r2 = r1.getBoolean(r8)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x027e
        L_0x027d:
            r2 = 0
        L_0x027e:
            com.google.android.gms.fido.fido2.api.view.BleProcessRequestViewOptions r3 = new com.google.android.gms.fido.fido2.api.view.BleProcessRequestViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r3.<init>(r0, r2)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x0314
        L_0x0285:
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            com.google.android.gms.fido.fido2.api.view.BlePairViewOptions r0 = new com.google.android.gms.fido.fido2.api.view.BlePairViewOptions     // Catch:{ JSONException -> 0x03f2 }
            com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier r2 = com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier.a(r1)     // Catch:{ JSONException -> 0x03f2 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x03f2 }
            r3 = r0
            goto L_0x0314
        L_0x0294:
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            boolean r0 = r1.has(r12)     // Catch:{ JSONException -> 0x03f2 }
            if (r0 == 0) goto L_0x02a2
            boolean r0 = r1.getBoolean(r12)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x02a3
        L_0x02a2:
            r0 = 0
        L_0x02a3:
            boolean r2 = r1.has(r6)     // Catch:{ JSONException -> 0x03f2 }
            if (r2 == 0) goto L_0x02af
            boolean r2 = r1.getBoolean(r6)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x02b0
        L_0x02af:
            r2 = 0
        L_0x02b0:
            com.google.android.gms.fido.fido2.api.view.BleEnableViewOptions r3 = new com.google.android.gms.fido.fido2.api.view.BleEnableViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r3.<init>(r0, r2)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x0314
        L_0x02b6:
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            boolean r0 = r1.has(r13)     // Catch:{ JSONException -> 0x03f2 }
            if (r0 == 0) goto L_0x02c4
            boolean r0 = r1.getBoolean(r13)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x02c5
        L_0x02c4:
            r0 = 0
        L_0x02c5:
            com.google.android.gms.fido.fido2.api.view.BleViewOptions r2 = new com.google.android.gms.fido.fido2.api.view.BleViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x03f2 }
            r3 = r2
            goto L_0x0314
        L_0x02cc:
            com.google.android.gms.fido.fido2.api.view.NfcEnableViewOptions r0 = new com.google.android.gms.fido.fido2.api.view.NfcEnableViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r0.<init>()     // Catch:{ JSONException -> 0x03f2 }
            r3 = r0
            goto L_0x0314
        L_0x02d3:
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            r0 = r19
            boolean r2 = r1.has(r0)     // Catch:{ JSONException -> 0x03f2 }
            if (r2 == 0) goto L_0x02e3
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x02e4
        L_0x02e3:
            r0 = 0
        L_0x02e4:
            r2 = r18
            boolean r3 = r1.has(r2)     // Catch:{ JSONException -> 0x03f2 }
            if (r3 == 0) goto L_0x02f2
            boolean r2 = r1.getBoolean(r2)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x02f3
        L_0x02f2:
            r2 = 0
        L_0x02f3:
            com.google.android.gms.fido.fido2.api.view.NfcViewOptions r3 = new com.google.android.gms.fido.fido2.api.view.NfcViewOptions     // Catch:{ JSONException -> 0x03f2 }
            r3.<init>(r0, r2)     // Catch:{ JSONException -> 0x03f2 }
            goto L_0x0314
        L_0x02f9:
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x03f2 }
            java.lang.String r0 = "transports"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x03f2 }
            java.util.List r0 = com.google.android.gms.fido.common.Transport.a((org.json.JSONArray) r0)     // Catch:{ JSONException -> 0x03f2 }
            if (r0 == 0) goto L_0x03bd
            com.google.android.gms.fido.fido2.api.view.MultiTransportViewOptions r2 = new com.google.android.gms.fido.fido2.api.view.MultiTransportViewOptions     // Catch:{ JSONException -> 0x03f2 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ JSONException -> 0x03f2 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x03f2 }
            r4 = 1
            r2.<init>(r4, r3)     // Catch:{ JSONException -> 0x03f2 }
            r3 = r2
        L_0x0314:
            r0 = r17
            boolean r2 = r1.has(r0)     // Catch:{ JSONException -> 0x03f2 }
            if (r2 != 0) goto L_0x031e
            goto L_0x0360
        L_0x031e:
            java.lang.String r2 = "Alternate transport set is found"
            r4 = r24
            android.util.Log.i(r4, r2)     // Catch:{ JSONException -> 0x03f2 }
            java.lang.Class<com.google.android.gms.fido.common.Transport> r2 = com.google.android.gms.fido.common.Transport.class
            java.util.EnumSet r2 = java.util.EnumSet.noneOf(r2)     // Catch:{ JSONException -> 0x03f2 }
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ myu -> 0x0347 }
            if (r0 != 0) goto L_0x0332
            goto L_0x034d
        L_0x0332:
            r1 = 0
        L_0x0333:
            int r5 = r0.length()     // Catch:{ myu -> 0x0347 }
            if (r1 >= r5) goto L_0x034d
            java.lang.String r5 = r0.getString(r1)     // Catch:{ myu -> 0x0347 }
            com.google.android.gms.fido.common.Transport r5 = com.google.android.gms.fido.common.Transport.a((java.lang.String) r5)     // Catch:{ myu -> 0x0347 }
            r2.add(r5)     // Catch:{ myu -> 0x0347 }
            int r1 = r1 + 1
            goto L_0x0333
        L_0x0347:
            r0 = move-exception
            java.lang.String r1 = "Ignoring transport"
            android.util.Log.e(r4, r1, r0)     // Catch:{ JSONException -> 0x03f2 }
        L_0x034d:
            boolean r0 = r2.isEmpty()     // Catch:{ JSONException -> 0x03f2 }
            if (r0 != 0) goto L_0x0360
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ JSONException -> 0x03f2 }
            java.util.Set r0 = r3.d     // Catch:{ JSONException -> 0x03f2 }
            r0.clear()     // Catch:{ JSONException -> 0x03f2 }
            java.util.Set r0 = r3.d     // Catch:{ JSONException -> 0x03f2 }
            r0.addAll(r2)     // Catch:{ JSONException -> 0x03f2 }
        L_0x0360:
            r1 = r22
            goq r0 = r1.a
            iwd r1 = defpackage.goq.a
            nax r2 = r3.b()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 23
            r5.<init>(r4)
            java.lang.String r4 = "fido2viewSelected(...) "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r1.b(r2, r5)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03b6 }
            r1.<init>()     // Catch:{ JSONException -> 0x03b6 }
            java.lang.String r2 = "type"
            java.lang.String r4 = "select_view"
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x03b6 }
            java.lang.String r2 = "data"
            org.json.JSONObject r3 = r3.a()     // Catch:{ JSONException -> 0x03b6 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x03b6 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r1
            java.lang.String r1 = "window.setFido2SkUiEvent(%s);"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            gqa r0 = r0.b
            r0.f(r1)
            goto L_0x0406
        L_0x03b6:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x03bd:
            r1 = r22
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x03f0 }
            java.lang.String r2 = "null transports unexpected in MultiTransportViewOptions"
            r0.<init>(r2)     // Catch:{ JSONException -> 0x03f0 }
            throw r0     // Catch:{ JSONException -> 0x03f0 }
        L_0x03c7:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x03f0 }
            java.lang.String r2 = r9.n     // Catch:{ JSONException -> 0x03f0 }
            r4 = 0
            r3[r4] = r2     // Catch:{ JSONException -> 0x03f0 }
            java.lang.String r2 = "View %s unimplemented"
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ JSONException -> 0x03f0 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x03f0 }
            throw r0     // Catch:{ JSONException -> 0x03f0 }
        L_0x03d9:
            r1 = r22
            naw r2 = new naw     // Catch:{ naw -> 0x03e1 }
            r2.<init>(r0)     // Catch:{ naw -> 0x03e1 }
            throw r2     // Catch:{ naw -> 0x03e1 }
        L_0x03e1:
            r0 = move-exception
            goto L_0x03e6
        L_0x03e3:
            r0 = move-exception
            r1 = r22
        L_0x03e6:
            org.json.JSONException r2 = new org.json.JSONException     // Catch:{ JSONException -> 0x03f0 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x03f0 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x03f0 }
            throw r2     // Catch:{ JSONException -> 0x03f0 }
        L_0x03f0:
            r0 = move-exception
            goto L_0x03f5
        L_0x03f2:
            r0 = move-exception
            r1 = r22
        L_0x03f5:
            iwd r2 = defpackage.gqa.d
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Invalid ViewOptions json."
            r2.e(r4, r0, r3)
            gqa r0 = r1.b
            com.google.android.gms.fido.fido2.api.common.ErrorCode r1 = com.google.android.gms.fido.fido2.api.common.ErrorCode.ENCODING_ERR
            r0.a((com.google.android.gms.fido.fido2.api.common.ErrorCode) r1)
        L_0x0406:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzd.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mzd(gps gps) {
        super("com.google.android.gms.fido.fido2.api.IResponseHandler");
        this.a = gps;
    }
}
