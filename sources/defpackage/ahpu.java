package defpackage;

/* renamed from: ahpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahpu {
    private long a = -1;

    private final void a() {
        this.a = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r9, long r10, long r12, boolean r14, boolean r15) {
        /*
            r8 = this;
            r0 = 0
            boolean r1 = com.google.android.gms.location.DetectedActivity.a(r9, r0)
            if (r1 != 0) goto L_0x000b
            r8.a()
            return r0
        L_0x000b:
            long r1 = r12 - r10
            axxa r3 = defpackage.axxa.a
            axxb r3 = r3.a()
            long r3 = r3.maxTimeWithoutInVehicleDetectionMillis()
            r5 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            axxa r4 = defpackage.axxa.a
            axxb r4 = r4.a()
            boolean r4 = r4.arTransitionVehicleBluetoothTimeoutOptimizations()
            if (r4 == 0) goto L_0x00da
            boolean r9 = defpackage.ahpp.a((int) r9)
            if (r9 == 0) goto L_0x00da
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r4 = 116(0x74, float:1.63E-43)
            r9.<init>(r4)
            java.lang.String r4 = "isVehicleActivityExpired. apply bluetooth optimized expiration., vehicle bluetooth = "
            r9.append(r4)
            r9.append(r14)
            java.lang.String r4 = ", expirationStatus = "
            r9.append(r4)
            r9.append(r3)
            r9.toString()
            if (r15 == 0) goto L_0x0071
            if (r14 != 0) goto L_0x0071
            axxa r9 = defpackage.axxa.a
            axxb r9 = r9.a()
            long r6 = r9.maxTimeWithoutInCarDetectionMillis()
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0071
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r12 = 168(0xa8, float:2.35E-43)
            r9.<init>(r12)
            java.lang.String r12 = "bluetoothOptimizedVehicleExpiration. apply bluetooth optimized expiration. isVehicleEnterDueToBluetooth = true, lastInRoadVehicleDetectionMillis = "
            r9.append(r12)
            r9.append(r10)
            r9.toString()
            r0 = 1
            goto L_0x00dc
        L_0x0071:
            if (r3 != 0) goto L_0x0074
            goto L_0x00c4
        L_0x0074:
            if (r14 == 0) goto L_0x00c4
            long r9 = r8.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r14 = 205(0xcd, float:2.87E-43)
            r11.<init>(r14)
            java.lang.String r14 = "bluetoothOptimizedVehicleExpiration. expirationStatus true, vehicleBluetoothConnected = true, elapsedTime = "
            r11.append(r14)
            r11.append(r12)
            java.lang.String r14 = ", connectedBluetoothVehicleExpirationMillisSinceBoot = "
            r11.append(r14)
            r11.append(r9)
            r11.toString()
            long r9 = r8.a
            r14 = -1
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x00af
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 113(0x71, float:1.58E-43)
            r9.<init>(r10)
            java.lang.String r10 = "bluetoothOptimizedVehicleExpiration.set connectedBluetoothVehicleExpirationMillisSinceBoot = "
            r9.append(r10)
            r9.append(r12)
            r9.toString()
            r8.a = r12
            goto L_0x00dc
        L_0x00af:
            long r12 = r12 - r9
            axxa r9 = defpackage.axxa.a
            axxb r9 = r9.a()
            long r9 = r9.maxTimeVehicleExitWithConnectedBluetoothMillis()
            int r11 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x00c3
            r8.a()
            r0 = 1
            goto L_0x00dc
        L_0x00c3:
            goto L_0x00dc
        L_0x00c4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 61
            r9.<init>(r10)
            java.lang.String r10 = "bluetoothOptimizedVehicleExpiration. Returning status = "
            r9.append(r10)
            r9.append(r3)
            r9.toString()
            r8.a()
            goto L_0x00db
        L_0x00da:
        L_0x00db:
            r0 = r3
        L_0x00dc:
            if (r0 != 0) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r8.a()
        L_0x00e2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 51
            r9.<init>(r10)
            java.lang.String r10 = "isVehicleActivityExpired. expiration status = "
            r9.append(r10)
            r9.append(r0)
            r9.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpu.a(int, long, long, boolean, boolean):boolean");
    }
}
