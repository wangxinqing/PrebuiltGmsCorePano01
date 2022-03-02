package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.net.wifi.WifiManager;
import android.provider.Settings;

/* renamed from: aixv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aixv extends aixu {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: aiaw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: aiaw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: aiar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: aiar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: aiag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: aiaw} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v24, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.aiaj a(java.util.List r28, long r29, java.util.Collection r31) {
        /*
            r27 = this;
            r13 = r29
            r0 = r31
            r1 = 0
            if (r28 == 0) goto L_0x0383
            java.util.Collection r2 = defpackage.aiaj.a
            java.util.Iterator r3 = r28.iterator()
            r4 = r1
            r5 = r4
            r6 = r5
            r11 = r6
            r12 = r11
            r15 = r12
            r16 = r15
        L_0x0015:
            boolean r7 = r3.hasNext()
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == 0) goto L_0x0135
            java.lang.Object r7 = r3.next()
            android.telephony.CellInfo r7 = (android.telephony.CellInfo) r7
            boolean r8 = r7 instanceof android.telephony.CellInfoLte
            if (r8 == 0) goto L_0x00b7
            android.telephony.CellInfoLte r7 = (android.telephony.CellInfoLte) r7
            android.telephony.CellIdentityLte r8 = r7.getCellIdentity()
            if (r8 == 0) goto L_0x0097
            int r9 = r8.getPci()
            if (r9 != r10) goto L_0x0037
            goto L_0x0097
        L_0x0037:
            boolean r9 = r7.isRegistered()
            if (r9 == 0) goto L_0x007d
            int r9 = r8.getCi()
            if (r9 == r10) goto L_0x005e
            int r9 = r8.getPci()
            if (r9 == r10) goto L_0x005e
            int r9 = r8.getMnc()
            if (r9 == r10) goto L_0x005e
            int r9 = r8.getMcc()
            if (r9 == r10) goto L_0x005e
            int r8 = r8.getTac()
            if (r8 != r10) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r4 = r7
            goto L_0x00b5
        L_0x005e:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 27
            r9.<init>(r8)
            java.lang.String r8 = "Rejecting LTE primary cell "
            r9.append(r8)
            r9.append(r7)
            r9.toString()
            goto L_0x00b5
        L_0x007d:
            java.util.Collection r8 = defpackage.aiaj.a
            if (r2 == r8) goto L_0x0082
            goto L_0x008b
        L_0x0082:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r8 = r28.size()
            r2.<init>(r8)
        L_0x008b:
            java.util.Collection r8 = defpackage.aiaj.a
            java.util.Collection r9 = defpackage.aiaj.a
            aiaw r7 = defpackage.aivv.a(r13, r7, r8, r9)
            r2.add(r7)
            goto L_0x00b5
        L_0x0097:
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 26
            r9.<init>(r8)
            java.lang.String r8 = "Rejecting CellIdentity of "
            r9.append(r8)
            r9.append(r7)
            r9.toString()
        L_0x00b5:
            goto L_0x0133
        L_0x00b7:
            boolean r8 = r7 instanceof android.telephony.CellInfoWcdma
            if (r8 == 0) goto L_0x00d7
            android.telephony.CellInfoWcdma r7 = (android.telephony.CellInfoWcdma) r7
            boolean r8 = r7.isRegistered()
            if (r8 == 0) goto L_0x00c6
            r16 = r7
            goto L_0x00d6
        L_0x00c6:
            if (r12 != 0) goto L_0x00d2
            java.util.ArrayList r12 = new java.util.ArrayList
            int r8 = r28.size()
            r12.<init>(r8)
            goto L_0x00d3
        L_0x00d2:
        L_0x00d3:
            r12.add(r7)
        L_0x00d6:
            goto L_0x0133
        L_0x00d7:
            boolean r8 = r7 instanceof android.telephony.CellInfoGsm
            if (r8 == 0) goto L_0x00f6
            android.telephony.CellInfoGsm r7 = (android.telephony.CellInfoGsm) r7
            boolean r8 = r7.isRegistered()
            if (r8 == 0) goto L_0x00e5
            r15 = r7
            goto L_0x00f5
        L_0x00e5:
            if (r11 != 0) goto L_0x00f1
            java.util.ArrayList r11 = new java.util.ArrayList
            int r8 = r28.size()
            r11.<init>(r8)
            goto L_0x00f2
        L_0x00f1:
        L_0x00f2:
            r11.add(r7)
        L_0x00f5:
            goto L_0x0133
        L_0x00f6:
            boolean r8 = r7 instanceof android.telephony.CellInfoCdma
            if (r8 == 0) goto L_0x0115
            android.telephony.CellInfoCdma r7 = (android.telephony.CellInfoCdma) r7
            boolean r8 = r7.isRegistered()
            if (r8 == 0) goto L_0x0104
            r5 = r7
            goto L_0x0114
        L_0x0104:
            if (r6 != 0) goto L_0x0110
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = r28.size()
            r6.<init>(r8)
            goto L_0x0111
        L_0x0110:
        L_0x0111:
            r6.add(r7)
        L_0x0114:
            goto L_0x0133
        L_0x0115:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 27
            r9.<init>(r8)
            java.lang.String r8 = "Ignoring non-LTE cellInfo: "
            r9.append(r8)
            r9.append(r7)
            r9.toString()
        L_0x0133:
            goto L_0x0015
        L_0x0135:
            r9 = -1
            r3 = 0
            if (r15 != 0) goto L_0x0279
            if (r16 != 0) goto L_0x0193
            if (r4 == 0) goto L_0x0143
            aiaw r1 = defpackage.aivv.a(r13, r4, r2, r0)
            goto L_0x0364
        L_0x0143:
            if (r5 == 0) goto L_0x0191
            boolean r2 = r31.isEmpty()
            if (r2 != 0) goto L_0x0158
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r31.size()
            r1.<init>(r2)
            r1.addAll(r0)
            goto L_0x0159
        L_0x0158:
        L_0x0159:
            if (r6 == 0) goto L_0x0186
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0162
            goto L_0x0186
        L_0x0162:
            if (r1 != 0) goto L_0x016e
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r1 = r0
        L_0x016e:
            int r0 = r6.size()
        L_0x0172:
            if (r3 >= r0) goto L_0x0186
            java.lang.Object r2 = r6.get(r3)
            android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2
            java.util.Collection r4 = defpackage.aiaj.a
            aiag r2 = defpackage.aivv.a((long) r13, (android.telephony.CellInfoCdma) r2, (java.util.Collection) r4)
            r1.add(r2)
            int r3 = r3 + 1
            goto L_0x0172
        L_0x0186:
            if (r1 == 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            java.util.Collection r1 = defpackage.aiaj.a
        L_0x018b:
            aiag r1 = defpackage.aivv.a((long) r13, (android.telephony.CellInfoCdma) r5, (java.util.Collection) r1)
            goto L_0x0364
        L_0x0191:
            goto L_0x0364
        L_0x0193:
            if (r16 == 0) goto L_0x0277
            android.telephony.CellIdentityWcdma r15 = r16.getCellIdentity()
            boolean r2 = r31.isEmpty()
            if (r2 != 0) goto L_0x01a8
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.addAll(r0)
            goto L_0x01a9
        L_0x01a8:
        L_0x01a9:
            if (r12 == 0) goto L_0x0240
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x01b3
            goto L_0x0240
        L_0x01b3:
            if (r1 != 0) goto L_0x01bc
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r11 = r0
            goto L_0x01bd
        L_0x01bc:
            r11 = r1
        L_0x01bd:
            int r8 = r12.size()
            r7 = 0
        L_0x01c2:
            if (r7 >= r8) goto L_0x023e
            java.lang.Object r0 = r12.get(r7)
            android.telephony.CellInfoWcdma r0 = (android.telephony.CellInfoWcdma) r0
            android.telephony.CellIdentityWcdma r1 = r0.getCellIdentity()
            int r6 = r1.getPsc()
            if (r6 != r10) goto L_0x01dc
            r18 = r7
            r19 = r8
            r0 = r11
            r17 = r12
            goto L_0x0232
        L_0x01dc:
            if (r6 == r9) goto L_0x022b
            aiar r5 = new aiar
            r3 = 3
            int r4 = r15.getCid()
            int r17 = r15.getMcc()
            int r18 = r15.getMnc()
            int r19 = r15.getLac()
            android.telephony.CellSignalStrengthWcdma r0 = r0.getCellSignalStrength()
            int r20 = r0.getDbm()
            java.util.Collection r21 = defpackage.aiaj.a
            r22 = 2147483647(0x7fffffff, float:NaN)
            r23 = 2147483647(0x7fffffff, float:NaN)
            r0 = r5
            r1 = r29
            r24 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            r18 = r7
            r7 = r19
            r19 = r8
            r8 = r17
            r9 = r20
            r10 = r21
            r25 = r11
            r11 = r22
            r17 = r12
            r12 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r24
            r0 = r25
            r0.add(r1)
            goto L_0x0232
        L_0x022b:
            r18 = r7
            r19 = r8
            r0 = r11
            r17 = r12
        L_0x0232:
            int r7 = r18 + 1
            r11 = r0
            r12 = r17
            r8 = r19
            r9 = -1
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x01c2
        L_0x023e:
            r0 = r11
            r1 = r0
        L_0x0240:
            if (r1 == 0) goto L_0x0244
            r10 = r1
            goto L_0x0247
        L_0x0244:
            java.util.Collection r0 = defpackage.aiaj.a
            r10 = r0
        L_0x0247:
            aiar r17 = new aiar
            r3 = 3
            int r4 = r15.getCid()
            int r5 = r15.getMcc()
            int r6 = r15.getMnc()
            int r7 = r15.getLac()
            int r8 = r15.getPsc()
            android.telephony.CellSignalStrengthWcdma r0 = r16.getCellSignalStrength()
            int r9 = r0.getDbm()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r0 = r17
            r1 = r29
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r17
            goto L_0x0364
        L_0x0277:
            goto L_0x0364
        L_0x0279:
            if (r15 == 0) goto L_0x0363
            android.telephony.CellIdentityGsm r16 = r15.getCellIdentity()
            boolean r2 = r31.isEmpty()
            if (r2 != 0) goto L_0x028e
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.addAll(r0)
            goto L_0x028f
        L_0x028e:
        L_0x028f:
            if (r11 == 0) goto L_0x0330
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0299
            goto L_0x0330
        L_0x0299:
            if (r1 != 0) goto L_0x02a2
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r12 = r0
            goto L_0x02a3
        L_0x02a2:
            r12 = r1
        L_0x02a3:
            int r10 = r11.size()
            r9 = 0
        L_0x02a8:
            if (r9 >= r10) goto L_0x032e
            java.lang.Object r0 = r11.get(r9)
            android.telephony.CellInfoGsm r0 = (android.telephony.CellInfoGsm) r0
            android.telephony.CellIdentityGsm r1 = r0.getCellIdentity()
            int r4 = r1.getCid()
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r8) goto L_0x02ca
            r19 = r9
            r20 = r10
            r21 = r11
            r13 = r12
            r17 = -1
            r18 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0323
        L_0x02ca:
            r7 = -1
            if (r4 == r7) goto L_0x0317
            aiar r6 = new aiar
            r3 = 1
            int r5 = r16.getMcc()
            int r17 = r16.getMnc()
            int r18 = r16.getLac()
            r19 = 2147483647(0x7fffffff, float:NaN)
            android.telephony.CellSignalStrengthGsm r0 = r0.getCellSignalStrength()
            int r20 = r0.getDbm()
            java.util.Collection r21 = defpackage.aiaj.a
            r22 = 2147483647(0x7fffffff, float:NaN)
            r23 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r29
            r26 = r6
            r6 = r17
            r17 = -1
            r7 = r18
            r18 = 2147483647(0x7fffffff, float:NaN)
            r8 = r19
            r19 = r9
            r9 = r20
            r20 = r10
            r10 = r21
            r21 = r11
            r11 = r22
            r13 = r12
            r12 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r26
            r13.add(r0)
            goto L_0x0323
        L_0x0317:
            r19 = r9
            r20 = r10
            r21 = r11
            r13 = r12
            r17 = -1
            r18 = 2147483647(0x7fffffff, float:NaN)
        L_0x0323:
            int r9 = r19 + 1
            r12 = r13
            r10 = r20
            r11 = r21
            r13 = r29
            goto L_0x02a8
        L_0x032e:
            r13 = r12
            r1 = r13
        L_0x0330:
            if (r1 == 0) goto L_0x0334
            r10 = r1
            goto L_0x0337
        L_0x0334:
            java.util.Collection r0 = defpackage.aiaj.a
            r10 = r0
        L_0x0337:
            aiar r13 = new aiar
            r3 = 1
            int r4 = r16.getCid()
            int r5 = r16.getMcc()
            int r6 = r16.getMnc()
            int r7 = r16.getLac()
            r8 = 2147483647(0x7fffffff, float:NaN)
            android.telephony.CellSignalStrengthGsm r0 = r15.getCellSignalStrength()
            int r9 = r0.getDbm()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r0 = r13
            r1 = r29
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r13
            goto L_0x0364
        L_0x0363:
        L_0x0364:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 19
            r3.<init>(r2)
            java.lang.String r2 = "newApiCellState is "
            r3.append(r2)
            r3.append(r0)
            r3.toString()
            return r1
        L_0x0383:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixv.a(java.util.List, long, java.util.Collection):aiaj");
    }

    public final boolean b(Location location) {
        return location.isFromMockProvider();
    }

    public final aizo a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            return new ajbn(bluetoothDevice);
        }
        return null;
    }

    public final ajbi a(SensorManager sensorManager, ajbg ajbg, aicn aicn) {
        return new ajbr(sensorManager, 17, true, axwx.o(), ajbg, aicn, aico.SIGNIFICANT_MOTION, "HardSigMotion");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: aiaj[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: aiaj[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: aiaj[]} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, aiaj] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r16v2, types: [aiar] */
    /* JADX WARNING: type inference failed for: r16v3, types: [aiag] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.telephony.TelephonyManager r30, int r31, long r32, defpackage.aivo r34, defpackage.aizx r35, java.util.concurrent.Executor r36) {
        /*
            r29 = this;
            r1 = r34
            java.lang.String r2 = "\""
            r3 = 0
            android.telephony.CellLocation r0 = r30.getCellLocation()     // Catch:{ SecurityException -> 0x000c, NumberFormatException -> 0x000a }
            goto L_0x000e
        L_0x000a:
            r0 = move-exception
            goto L_0x000d
        L_0x000c:
            r0 = move-exception
        L_0x000d:
            r0 = r3
        L_0x000e:
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0149
            java.lang.String r7 = r30.getSimOperator()
            int r8 = r30.getNetworkType()
            r9 = 4
            r10 = -1
            r11 = 3
            if (r8 != r6) goto L_0x0022
            r8 = 1
            goto L_0x0053
        L_0x0022:
            if (r8 != r5) goto L_0x0026
            r8 = 1
            goto L_0x0053
        L_0x0026:
            if (r8 == r11) goto L_0x0052
            r12 = 8
            if (r8 == r12) goto L_0x0052
            r12 = 9
            if (r8 == r12) goto L_0x0052
            r12 = 10
            if (r8 == r12) goto L_0x0052
            r12 = 15
            if (r8 != r12) goto L_0x0039
            goto L_0x0052
        L_0x0039:
            if (r8 == r9) goto L_0x0050
            r12 = 5
            if (r8 == r12) goto L_0x0050
            r12 = 6
            if (r8 == r12) goto L_0x0050
            r12 = 12
            if (r8 == r12) goto L_0x0050
            r12 = 7
            if (r8 == r12) goto L_0x0050
            r12 = 13
            if (r8 != r12) goto L_0x004e
            r8 = 4
            goto L_0x0053
        L_0x004e:
            r8 = -1
            goto L_0x0053
        L_0x0050:
            r8 = 2
            goto L_0x0053
        L_0x0052:
            r8 = 3
        L_0x0053:
            java.lang.String r12 = r30.getNetworkOperator()
            boolean r13 = r0 instanceof android.telephony.gsm.GsmCellLocation
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == 0) goto L_0x008b
            android.telephony.gsm.GsmCellLocation r0 = (android.telephony.gsm.GsmCellLocation) r0
            int r13 = r0.getLac()
            int r15 = r0.getCid()
            int r0 = r0.getPsc()
            if (r8 != r9) goto L_0x007b
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r15 < r8) goto L_0x0079
            r8 = 268435455(0xfffffff, float:2.5243547E-29)
            if (r15 > r8) goto L_0x0079
            r8 = 3
            goto L_0x007c
        L_0x0079:
            r8 = 1
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            r24 = r0
            r23 = r13
            r20 = r15
            r9 = -1
            r13 = 1
            r27 = 2147483647(0x7fffffff, float:NaN)
            r28 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b3
        L_0x008b:
            boolean r8 = r0 instanceof android.telephony.cdma.CdmaCellLocation
            if (r8 == 0) goto L_0x0149
            android.telephony.cdma.CdmaCellLocation r0 = (android.telephony.cdma.CdmaCellLocation) r0
            int r13 = r0.getNetworkId()
            int r15 = r0.getBaseStationId()
            int r8 = r0.getSystemId()
            int r14 = r0.getBaseStationLatitude()
            int r0 = r0.getBaseStationLongitude()
            r28 = r0
            r10 = r8
            r23 = r13
            r27 = r14
            r20 = r15
            r8 = 2
            r9 = 0
            r13 = 0
            r24 = -1
        L_0x00b3:
            if (r8 != r5) goto L_0x00b6
            goto L_0x011f
        L_0x00b6:
            if (r12 == 0) goto L_0x011e
            java.lang.String r14 = ""
            boolean r0 = r12.equals(r14)
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = r12.substring(r4, r11)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r15 = r12.substring(r11)     // Catch:{ Exception -> 0x00d2 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00d2 }
            int r10 = java.lang.Integer.parseInt(r15)     // Catch:{ Exception -> 0x00d2 }
            r9 = r0
            goto L_0x00ec
        L_0x00d2:
            r0 = move-exception
            int r0 = r12.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r0 = r0 + 38
            r15.<init>(r0)
            java.lang.String r0 = "Error parsing MCC/MNC from operator \""
            r15.append(r0)
            r15.append(r12)
            r15.append(r2)
            r15.toString()
        L_0x00ec:
            if (r7 == 0) goto L_0x011f
            boolean r0 = r7.equals(r14)
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = r7.substring(r4, r11)     // Catch:{ Exception -> 0x0103 }
            java.lang.String r11 = r7.substring(r11)     // Catch:{ Exception -> 0x0103 }
            java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0103 }
            java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x0103 }
            goto L_0x011e
        L_0x0103:
            r0 = move-exception
            int r0 = r7.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r0 = r0 + 43
            r11.<init>(r0)
            java.lang.String r0 = "Error parsing MCC/MNC from home operator \""
            r11.append(r0)
            r11.append(r7)
            r11.append(r2)
            r11.toString()
            goto L_0x011f
        L_0x011e:
        L_0x011f:
            r21 = r9
            r22 = r10
            if (r13 != 0) goto L_0x0139
            aiag r0 = new aiag
            java.util.Collection r25 = defpackage.aiaj.a
            r16 = r0
            r17 = r32
            r19 = r8
            r24 = r31
            r26 = r27
            r27 = r28
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x014a
        L_0x0139:
            aiar r0 = new aiar
            java.util.Collection r26 = defpackage.aiaj.a
            r16 = r0
            r17 = r32
            r19 = r8
            r25 = r31
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x014a
        L_0x0149:
            r0 = r3
        L_0x014a:
            java.util.List r2 = r30.getAllCellInfo()
            if (r2 == 0) goto L_0x0151
            goto L_0x015f
        L_0x0151:
            if (r0 == 0) goto L_0x015b
            aiaj[] r7 = new defpackage.aiaj[r6]
            r7[r4] = r0
            r1.a(r7)
            goto L_0x015f
        L_0x015b:
            r1.a(r3)
        L_0x015f:
            java.util.Collection r7 = defpackage.aiaj.a
            r8 = r29
            r9 = r32
            aiaj r2 = r8.a((java.util.List) r2, (long) r9, (java.util.Collection) r7)
            java.lang.String r7 = java.lang.String.valueOf(r2)
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r9 = r9 + 21
            r10.<init>(r9)
            java.lang.String r9 = "new API CellState is "
            r10.append(r9)
            r10.append(r7)
            r10.toString()
            if (r0 == 0) goto L_0x01c7
            if (r2 != 0) goto L_0x01ae
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 42
            r5.<init>(r3)
            java.lang.String r3 = "returning old-api singleton, cellState is "
            r5.append(r3)
            r5.append(r2)
            r5.toString()
            aiaj[] r3 = new defpackage.aiaj[r6]
            r3[r4] = r0
            goto L_0x01cd
        L_0x01ae:
            boolean r3 = r0.e()
            if (r3 != 0) goto L_0x01b5
        L_0x01b4:
            goto L_0x01c2
        L_0x01b5:
            boolean r3 = r2.b((defpackage.aiaj) r0)
            if (r3 != 0) goto L_0x01b4
            aiaj[] r3 = new defpackage.aiaj[r5]
            r3[r4] = r2
            r3[r6] = r0
            goto L_0x01cd
        L_0x01c2:
            aiaj[] r3 = new defpackage.aiaj[r6]
            r3[r4] = r2
            goto L_0x01cd
        L_0x01c7:
            if (r2 == 0) goto L_0x01cd
            aiaj[] r3 = new defpackage.aiaj[r6]
            r3[r4] = r2
        L_0x01cd:
            r1.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixv.a(android.telephony.TelephonyManager, int, long, aivo, aizx, java.util.concurrent.Executor):void");
    }

    public final boolean a(WifiManager wifiManager, Context context) {
        if (wifiManager.isWifiEnabled()) {
            return true;
        }
        if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 1) {
            return wifiManager.isScanAlwaysAvailable();
        }
        return false;
    }
}
