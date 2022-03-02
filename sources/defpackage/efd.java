package defpackage;

/* renamed from: efd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class efd extends bhw implements efe {
    public efd() {
        super("com.google.android.gms.audiomodem.internal.IAudioModemService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: efi} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [efb] */
    /* JADX WARNING: type inference failed for: r3v6, types: [efb] */
    /* JADX WARNING: type inference failed for: r3v10, types: [efb] */
    /* JADX WARNING: type inference failed for: r3v15, types: [efb] */
    /* JADX WARNING: type inference failed for: r3v19, types: [efb] */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: type inference failed for: r3v34 */
    /* JADX WARNING: type inference failed for: r3v35 */
    /* JADX WARNING: type inference failed for: r3v36 */
    /* JADX WARNING: type inference failed for: r3v37 */
    /* JADX WARNING: type inference failed for: r3v38 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener"
            java.lang.String r1 = "com.google.android.gms.audiomodem.internal.ITokenReceiverListener"
            java.lang.String r2 = "com.google.android.gms.audiomodem.internal.IAudioModemCallback"
            r3 = 0
            switch(r6) {
                case 1: goto L_0x0121;
                case 2: goto L_0x00ec;
                case 3: goto L_0x00aa;
                case 4: goto L_0x0074;
                case 5: goto L_0x0034;
                case 6: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            r6 = 0
            return r6
        L_0x000c:
            android.os.Parcelable$Creator r6 = com.google.android.gms.audiomodem.AudioStreamParams.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r6)
            com.google.android.gms.audiomodem.AudioStreamParams r6 = (com.google.android.gms.audiomodem.AudioStreamParams) r6
            android.os.IBinder r7 = r7.readStrongBinder()
            if (r7 == 0) goto L_0x002e
            java.lang.String r0 = "com.google.android.gms.audiomodem.internal.IStreamInputCallback"
            android.os.IInterface r0 = r7.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.efi
            if (r1 == 0) goto L_0x0028
            r3 = r0
            efi r3 = (defpackage.efi) r3
            goto L_0x002f
        L_0x0028:
            efi r3 = new efi
            r3.<init>(r7)
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            r5.a((com.google.android.gms.audiomodem.AudioStreamParams) r6, (defpackage.efi) r3)
            goto L_0x0161
        L_0x0034:
            android.os.Parcelable$Creator r6 = com.google.android.gms.audiomodem.Snoop$Params.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r6)
            com.google.android.gms.audiomodem.Snoop$Params r6 = (com.google.android.gms.audiomodem.Snoop$Params) r6
            android.os.IBinder r0 = r7.readStrongBinder()
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = "com.google.android.gms.audiomodem.internal.ISnoopCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r4 = r1 instanceof defpackage.efh
            if (r4 == 0) goto L_0x004f
            efh r1 = (defpackage.efh) r1
            goto L_0x0056
        L_0x004f:
            eff r1 = new eff
            r1.<init>(r0)
            goto L_0x0056
        L_0x0055:
            r1 = r3
        L_0x0056:
            android.os.IBinder r7 = r7.readStrongBinder()
            if (r7 == 0) goto L_0x006e
            android.os.IInterface r0 = r7.queryLocalInterface(r2)
            boolean r2 = r0 instanceof defpackage.efb
            if (r2 == 0) goto L_0x0068
            r3 = r0
            efb r3 = (defpackage.efb) r3
            goto L_0x006f
        L_0x0068:
            eez r3 = new eez
            r3.<init>(r7)
            goto L_0x006f
        L_0x006e:
        L_0x006f:
            r5.a(r6, r1, r3)
            goto L_0x0161
        L_0x0074:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x008b
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.efl
            if (r1 == 0) goto L_0x0085
            efl r0 = (defpackage.efl) r0
            goto L_0x008c
        L_0x0085:
            efj r0 = new efj
            r0.<init>(r6)
            goto L_0x008c
        L_0x008b:
            r0 = r3
        L_0x008c:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x00a4
            android.os.IInterface r7 = r6.queryLocalInterface(r2)
            boolean r1 = r7 instanceof defpackage.efb
            if (r1 == 0) goto L_0x009e
            r3 = r7
            efb r3 = (defpackage.efb) r3
            goto L_0x00a5
        L_0x009e:
            eez r3 = new eez
            r3.<init>(r6)
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            r5.a((defpackage.efl) r0, (defpackage.efb) r3)
            goto L_0x0161
        L_0x00aa:
            android.os.IBinder r6 = r7.readStrongBinder()
            android.os.IBinder r1 = r7.readStrongBinder()
            if (r1 == 0) goto L_0x00c5
            android.os.IInterface r0 = r1.queryLocalInterface(r0)
            boolean r4 = r0 instanceof defpackage.efl
            if (r4 == 0) goto L_0x00bf
            efl r0 = (defpackage.efl) r0
            goto L_0x00c6
        L_0x00bf:
            efj r0 = new efj
            r0.<init>(r1)
            goto L_0x00c6
        L_0x00c5:
            r0 = r3
        L_0x00c6:
            android.os.Parcelable$Creator r1 = com.google.android.gms.audiomodem.TokenBroadcaster$Params.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.audiomodem.TokenBroadcaster$Params r1 = (com.google.android.gms.audiomodem.TokenBroadcaster$Params) r1
            android.os.IBinder r7 = r7.readStrongBinder()
            if (r7 == 0) goto L_0x00e6
            android.os.IInterface r2 = r7.queryLocalInterface(r2)
            boolean r3 = r2 instanceof defpackage.efb
            if (r3 == 0) goto L_0x00e0
            r3 = r2
            efb r3 = (defpackage.efb) r3
            goto L_0x00e7
        L_0x00e0:
            eez r3 = new eez
            r3.<init>(r7)
            goto L_0x00e7
        L_0x00e6:
        L_0x00e7:
            r5.a((android.os.IBinder) r6, (defpackage.efl) r0, (com.google.android.gms.audiomodem.TokenBroadcaster$Params) r1, (defpackage.efb) r3)
            goto L_0x0161
        L_0x00ec:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x0103
            android.os.IInterface r0 = r6.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.efo
            if (r1 == 0) goto L_0x00fd
            efo r0 = (defpackage.efo) r0
            goto L_0x0104
        L_0x00fd:
            efm r0 = new efm
            r0.<init>(r6)
            goto L_0x0104
        L_0x0103:
            r0 = r3
        L_0x0104:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x011c
            android.os.IInterface r7 = r6.queryLocalInterface(r2)
            boolean r1 = r7 instanceof defpackage.efb
            if (r1 == 0) goto L_0x0116
            r3 = r7
            efb r3 = (defpackage.efb) r3
            goto L_0x011d
        L_0x0116:
            eez r3 = new eez
            r3.<init>(r6)
            goto L_0x011d
        L_0x011c:
        L_0x011d:
            r5.a((defpackage.efo) r0, (defpackage.efb) r3)
            goto L_0x0161
        L_0x0121:
            android.os.IBinder r6 = r7.readStrongBinder()
            android.os.IBinder r0 = r7.readStrongBinder()
            if (r0 == 0) goto L_0x013c
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r4 = r1 instanceof defpackage.efo
            if (r4 == 0) goto L_0x0136
            efo r1 = (defpackage.efo) r1
            goto L_0x013d
        L_0x0136:
            efm r1 = new efm
            r1.<init>(r0)
            goto L_0x013d
        L_0x013c:
            r1 = r3
        L_0x013d:
            android.os.Parcelable$Creator r0 = com.google.android.gms.audiomodem.TokenReceiver$Params.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.audiomodem.TokenReceiver$Params r0 = (com.google.android.gms.audiomodem.TokenReceiver$Params) r0
            android.os.IBinder r7 = r7.readStrongBinder()
            if (r7 == 0) goto L_0x015d
            android.os.IInterface r2 = r7.queryLocalInterface(r2)
            boolean r3 = r2 instanceof defpackage.efb
            if (r3 == 0) goto L_0x0157
            r3 = r2
            efb r3 = (defpackage.efb) r3
            goto L_0x015e
        L_0x0157:
            eez r3 = new eez
            r3.<init>(r7)
            goto L_0x015e
        L_0x015d:
        L_0x015e:
            r5.a((android.os.IBinder) r6, (defpackage.efo) r1, (com.google.android.gms.audiomodem.TokenReceiver$Params) r0, (defpackage.efb) r3)
        L_0x0161:
            r8.writeNoException()
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efd.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
