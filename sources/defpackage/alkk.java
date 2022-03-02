package defpackage;

/* renamed from: alkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkk {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atbw a(com.google.android.ulr.ApiBleScanReport r21) {
        /*
            if (r21 == 0) goto L_0x04af
            atbw r0 = defpackage.atbw.c
            aucd r0 = r0.o()
            java.util.ArrayList r1 = r21.getBleScans()
            java.lang.String r2 = "UNKNOWN"
            java.lang.String r3 = "type1"
            java.lang.String r4 = "unknown"
            java.lang.String r5 = "TYPE_1"
            r8 = 3
            r9 = 5
            r10 = 4
            r12 = 1
            r13 = 0
            if (r1 == 0) goto L_0x0333
            java.util.ArrayList r1 = r21.getBleScans()
            int r14 = r1.size()
            r15 = 0
        L_0x0024:
            if (r15 >= r14) goto L_0x0333
            java.lang.Object r16 = r1.get(r15)
            com.google.android.ulr.BleStrengthProto r16 = (com.google.android.ulr.BleStrengthProto) r16
            if (r16 == 0) goto L_0x032d
            atdw r17 = defpackage.atdw.g
            aucd r6 = r17.o()
            java.lang.String r17 = r16.f()
            r18 = 16
            r19 = 8
            if (r17 == 0) goto L_0x025d
            java.lang.String r7 = r16.f()
            int r20 = r7.hashCode()
            switch(r20) {
                case -2138866993: goto L_0x0134;
                case -1976457779: goto L_0x012a;
                case -1506303187: goto L_0x011f;
                case -553912305: goto L_0x0115;
                case -553912303: goto L_0x010a;
                case -284840886: goto L_0x0102;
                case -172064954: goto L_0x00f8;
                case -172064952: goto L_0x00ed;
                case 433141802: goto L_0x00e5;
                case 1280291597: goto L_0x00da;
                case 1557064501: goto L_0x00ce;
                case 1600526829: goto L_0x00c3;
                default: goto L_0x0049;
            }
        L_0x0049:
            switch(r20) {
                case -1805472660: goto L_0x00ba;
                case -1805472659: goto L_0x00ae;
                case -1805472658: goto L_0x00a2;
                case -1805472657: goto L_0x0096;
                case -1805472656: goto L_0x008a;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r20) {
                case 110843959: goto L_0x0081;
                case 110843960: goto L_0x0075;
                case 110843961: goto L_0x0069;
                case 110843962: goto L_0x005d;
                case 110843963: goto L_0x0051;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x013f
        L_0x0051:
            java.lang.String r11 = "type5"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 21
            goto L_0x0140
        L_0x005d:
            java.lang.String r11 = "type4"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 17
            goto L_0x0140
        L_0x0069:
            java.lang.String r11 = "type3"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 13
            goto L_0x0140
        L_0x0075:
            java.lang.String r11 = "type2"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 9
            goto L_0x0140
        L_0x0081:
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x013f
            r7 = 5
            goto L_0x0140
        L_0x008a:
            java.lang.String r11 = "TYPE_5"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 20
            goto L_0x0140
        L_0x0096:
            java.lang.String r11 = "TYPE_4"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 16
            goto L_0x0140
        L_0x00a2:
            java.lang.String r11 = "TYPE_3"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 12
            goto L_0x0140
        L_0x00ae:
            java.lang.String r11 = "TYPE_2"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 8
            goto L_0x0140
        L_0x00ba:
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x013f
            r7 = 4
            goto L_0x0140
        L_0x00c3:
            java.lang.String r11 = "ibeacon"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 3
            goto L_0x0140
        L_0x00ce:
            java.lang.String r11 = "gbeaconV3Ephemeral"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 19
            goto L_0x0140
        L_0x00da:
            java.lang.String r11 = "ALTBEACON"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 14
            goto L_0x0140
        L_0x00e5:
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x013f
            r7 = 0
            goto L_0x0140
        L_0x00ed:
            java.lang.String r11 = "gbeaconV3"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 11
            goto L_0x0140
        L_0x00f8:
            java.lang.String r11 = "gbeaconV1"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 7
            goto L_0x0140
        L_0x0102:
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x013f
            r7 = 1
            goto L_0x0140
        L_0x010a:
            java.lang.String r11 = "GBEACON_V3"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 10
            goto L_0x0140
        L_0x0115:
            java.lang.String r11 = "GBEACON_V1"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 6
            goto L_0x0140
        L_0x011f:
            java.lang.String r11 = "altbeacon"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 15
            goto L_0x0140
        L_0x012a:
            java.lang.String r11 = "IBEACON"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 2
            goto L_0x0140
        L_0x0134:
            java.lang.String r11 = "GBEACON_V3_EPHEMERAL"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x013f
            r7 = 18
            goto L_0x0140
        L_0x013f:
            r7 = -1
        L_0x0140:
            switch(r7) {
                case 0: goto L_0x023f;
                case 1: goto L_0x023f;
                case 2: goto L_0x0229;
                case 3: goto L_0x0229;
                case 4: goto L_0x0213;
                case 5: goto L_0x0213;
                case 6: goto L_0x01fc;
                case 7: goto L_0x01fc;
                case 8: goto L_0x01e5;
                case 9: goto L_0x01e5;
                case 10: goto L_0x01ce;
                case 11: goto L_0x01ce;
                case 12: goto L_0x01b7;
                case 13: goto L_0x01b7;
                case 14: goto L_0x01a0;
                case 15: goto L_0x01a0;
                case 16: goto L_0x0189;
                case 17: goto L_0x0189;
                case 18: goto L_0x0172;
                case 19: goto L_0x0172;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                default: goto L_0x0143;
            }
        L_0x0143:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r16.f()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.BleStrengthProto.type "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0255
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0259
        L_0x015c:
            boolean r7 = r6.c
            if (r7 == 0) goto L_0x0165
            r6.c()
            r6.c = r13
        L_0x0165:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r9
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x0172:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0177
            goto L_0x017c
        L_0x0177:
            r6.c()
            r6.c = r13
        L_0x017c:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r9
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x0189:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x018e
            goto L_0x0193
        L_0x018e:
            r6.c()
            r6.c = r13
        L_0x0193:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r10
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x01a0:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x01a5
            goto L_0x01aa
        L_0x01a5:
            r6.c()
            r6.c = r13
        L_0x01aa:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r10
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x01b7:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            r6.c()
            r6.c = r13
        L_0x01c1:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r8
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x01ce:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x01d3
            goto L_0x01d8
        L_0x01d3:
            r6.c()
            r6.c = r13
        L_0x01d8:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r8
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x01e5:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x01ea
            goto L_0x01ef
        L_0x01ea:
            r6.c()
            r6.c = r13
        L_0x01ef:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r11 = 2
            r7.b = r11
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x01fc:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0201
            goto L_0x0206
        L_0x0201:
            r6.c()
            r6.c = r13
        L_0x0206:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r11 = 2
            r7.b = r11
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x0213:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0218
            goto L_0x021d
        L_0x0218:
            r6.c()
            r6.c = r13
        L_0x021d:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r12
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x0229:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x022e
            goto L_0x0233
        L_0x022e:
            r6.c()
            r6.c = r13
        L_0x0233:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r12
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x023f:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0244
            goto L_0x0249
        L_0x0244:
            r6.c()
            r6.c = r13
        L_0x0249:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            r7.b = r13
            int r11 = r7.a
            r11 = r11 | r12
            r7.a = r11
            goto L_0x025d
        L_0x0255:
            java.lang.String r1 = r2.concat(r1)
        L_0x0259:
            r0.<init>(r1)
            throw r0
        L_0x025d:
            java.lang.String r7 = r16.b()
            if (r7 == 0) goto L_0x0296
            java.lang.String r7 = r16.b()     // Catch:{ IllegalArgumentException -> 0x028d }
            r11 = 10
            byte[] r7 = android.util.Base64.decode(r7, r11)     // Catch:{ IllegalArgumentException -> 0x028d }
            auay r7 = defpackage.auay.a((byte[]) r7)     // Catch:{ IllegalArgumentException -> 0x028d }
            boolean r11 = r6.c     // Catch:{ IllegalArgumentException -> 0x028d }
            if (r11 != 0) goto L_0x0276
            goto L_0x027b
        L_0x0276:
            r6.c()     // Catch:{ IllegalArgumentException -> 0x028d }
            r6.c = r13     // Catch:{ IllegalArgumentException -> 0x028d }
        L_0x027b:
            aucj r11 = r6.b     // Catch:{ IllegalArgumentException -> 0x028d }
            atdw r11 = (defpackage.atdw) r11     // Catch:{ IllegalArgumentException -> 0x028d }
            r7.getClass()     // Catch:{ IllegalArgumentException -> 0x028d }
            int r9 = r11.a     // Catch:{ IllegalArgumentException -> 0x028d }
            r20 = 2
            r9 = r9 | 2
            r11.a = r9     // Catch:{ IllegalArgumentException -> 0x028d }
            r11.c = r7     // Catch:{ IllegalArgumentException -> 0x028d }
            goto L_0x0296
        L_0x028d:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Json2LiteBadBase64 userlocation.BleStrengthProto.id"
            r1.<init>(r2, r0)
            throw r1
        L_0x0296:
            java.lang.Long r7 = r16.c()
            if (r7 == 0) goto L_0x02b9
            java.lang.Long r7 = r16.c()
            long r8 = r7.longValue()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x02a9
            goto L_0x02ae
        L_0x02a9:
            r6.c()
            r6.c = r13
        L_0x02ae:
            aucj r7 = r6.b
            atdw r7 = (defpackage.atdw) r7
            int r11 = r7.a
            r11 = r11 | r10
            r7.a = r11
            r7.d = r8
        L_0x02b9:
            java.lang.Integer r7 = r16.d()
            if (r7 == 0) goto L_0x02dd
            java.lang.Integer r7 = r16.d()
            int r7 = r7.intValue()
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x02cc
            goto L_0x02d1
        L_0x02cc:
            r6.c()
            r6.c = r13
        L_0x02d1:
            aucj r8 = r6.b
            atdw r8 = (defpackage.atdw) r8
            int r9 = r8.a
            r9 = r9 | 8
            r8.a = r9
            r8.e = r7
        L_0x02dd:
            java.lang.Integer r7 = r16.e()
            if (r7 == 0) goto L_0x0301
            java.lang.Integer r7 = r16.e()
            int r7 = r7.intValue()
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x02f0
            goto L_0x02f5
        L_0x02f0:
            r6.c()
            r6.c = r13
        L_0x02f5:
            aucj r8 = r6.b
            atdw r8 = (defpackage.atdw) r8
            int r9 = r8.a
            r9 = r9 | 16
            r8.a = r9
            r8.f = r7
        L_0x0301:
            aucj r6 = r6.i()
            atdw r6 = (defpackage.atdw) r6
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x030c
            goto L_0x0311
        L_0x030c:
            r0.c()
            r0.c = r13
        L_0x0311:
            aucj r7 = r0.b
            atbw r7 = (defpackage.atbw) r7
            r6.getClass()
            aucx r8 = r7.a
            boolean r8 = r8.a()
            if (r8 != 0) goto L_0x0328
            aucx r8 = r7.a
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)
            r7.a = r8
        L_0x0328:
            aucx r7 = r7.a
            r7.add(r6)
        L_0x032d:
            int r15 = r15 + 1
            r8 = 3
            r9 = 5
            goto L_0x0024
        L_0x0333:
            java.util.ArrayList r1 = r21.getBleSensorDatas()
            if (r1 == 0) goto L_0x04a8
            java.util.ArrayList r1 = r21.getBleSensorDatas()
            int r6 = r1.size()
            r7 = 0
        L_0x0342:
            if (r7 >= r6) goto L_0x04a8
            java.lang.Object r8 = r1.get(r7)
            com.google.android.ulr.BleSensorData r8 = (com.google.android.ulr.BleSensorData) r8
            if (r8 == 0) goto L_0x049c
            atdu r9 = defpackage.atdu.e
            aucd r9 = r9.o()
            java.lang.String r11 = r8.d()
            if (r11 == 0) goto L_0x040b
            java.lang.String r11 = r8.d()
            int r14 = r11.hashCode()
            switch(r14) {
                case -1805472660: goto L_0x0390;
                case -755349785: goto L_0x0386;
                case -284840886: goto L_0x037e;
                case 110843959: goto L_0x0376;
                case 429257668: goto L_0x036c;
                case 433141802: goto L_0x0364;
                default: goto L_0x0363;
            }
        L_0x0363:
            goto L_0x0398
        L_0x0364:
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x0398
            r11 = 0
            goto L_0x0399
        L_0x036c:
            java.lang.String r14 = "eddystoneTlm"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0398
            r11 = 3
            goto L_0x0399
        L_0x0376:
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x0398
            r11 = 5
            goto L_0x0399
        L_0x037e:
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x0398
            r11 = 1
            goto L_0x0399
        L_0x0386:
            java.lang.String r14 = "EDDYSTONE_TLM"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0398
            r11 = 2
            goto L_0x0399
        L_0x0390:
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0398
            r11 = 4
            goto L_0x0399
        L_0x0398:
            r11 = -1
        L_0x0399:
            if (r11 == 0) goto L_0x03f4
            if (r11 == r12) goto L_0x03f4
            r14 = 2
            if (r11 == r14) goto L_0x03dd
            r14 = 3
            if (r11 == r14) goto L_0x03dd
            r15 = 5
            if (r11 == r10) goto L_0x03c8
            if (r11 == r15) goto L_0x03c8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.d()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.BleSensorData.type "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x03c0
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x03c4
        L_0x03c0:
            java.lang.String r1 = r2.concat(r1)
        L_0x03c4:
            r0.<init>(r1)
            throw r0
        L_0x03c8:
            boolean r11 = r9.c
            if (r11 == 0) goto L_0x03d1
            r9.c()
            r9.c = r13
        L_0x03d1:
            aucj r11 = r9.b
            atdu r11 = (defpackage.atdu) r11
            r11.b = r12
            int r14 = r11.a
            r14 = r14 | r12
            r11.a = r14
            goto L_0x040c
        L_0x03dd:
            r15 = 5
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x03e3
            goto L_0x03e8
        L_0x03e3:
            r9.c()
            r9.c = r13
        L_0x03e8:
            aucj r11 = r9.b
            atdu r11 = (defpackage.atdu) r11
            r11.b = r12
            int r14 = r11.a
            r14 = r14 | r12
            r11.a = r14
            goto L_0x040c
        L_0x03f4:
            r15 = 5
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x03fa
            goto L_0x03ff
        L_0x03fa:
            r9.c()
            r9.c = r13
        L_0x03ff:
            aucj r11 = r9.b
            atdu r11 = (defpackage.atdu) r11
            r11.b = r13
            int r14 = r11.a
            r14 = r14 | r12
            r11.a = r14
            goto L_0x040c
        L_0x040b:
            r15 = 5
        L_0x040c:
            java.lang.Long r11 = r8.c()
            if (r11 == 0) goto L_0x0433
            java.lang.Long r11 = r8.c()
            long r10 = r11.longValue()
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x041f
            goto L_0x0424
        L_0x041f:
            r9.c()
            r9.c = r13
        L_0x0424:
            aucj r12 = r9.b
            atdu r12 = (defpackage.atdu) r12
            int r14 = r12.a
            r18 = 2
            r14 = r14 | 2
            r12.a = r14
            r12.c = r10
            goto L_0x0435
        L_0x0433:
            r18 = 2
        L_0x0435:
            java.lang.String r10 = r8.b()
            if (r10 == 0) goto L_0x046c
            java.lang.String r8 = r8.b()     // Catch:{ IllegalArgumentException -> 0x0463 }
            r10 = 10
            byte[] r8 = android.util.Base64.decode(r8, r10)     // Catch:{ IllegalArgumentException -> 0x0463 }
            auay r8 = defpackage.auay.a((byte[]) r8)     // Catch:{ IllegalArgumentException -> 0x0463 }
            boolean r11 = r9.c     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r11 != 0) goto L_0x044e
            goto L_0x0453
        L_0x044e:
            r9.c()     // Catch:{ IllegalArgumentException -> 0x0463 }
            r9.c = r13     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x0453:
            aucj r11 = r9.b     // Catch:{ IllegalArgumentException -> 0x0463 }
            atdu r11 = (defpackage.atdu) r11     // Catch:{ IllegalArgumentException -> 0x0463 }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0463 }
            int r12 = r11.a     // Catch:{ IllegalArgumentException -> 0x0463 }
            r14 = 4
            r12 = r12 | r14
            r11.a = r12     // Catch:{ IllegalArgumentException -> 0x0463 }
            r11.d = r8     // Catch:{ IllegalArgumentException -> 0x0463 }
            goto L_0x046f
        L_0x0463:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Json2LiteBadBase64 userlocation.BleSensorData.data"
            r1.<init>(r2, r0)
            throw r1
        L_0x046c:
            r10 = 10
            r14 = 4
        L_0x046f:
            aucj r8 = r9.i()
            atdu r8 = (defpackage.atdu) r8
            boolean r9 = r0.c
            if (r9 != 0) goto L_0x047a
            goto L_0x047f
        L_0x047a:
            r0.c()
            r0.c = r13
        L_0x047f:
            aucj r9 = r0.b
            atbw r9 = (defpackage.atbw) r9
            r8.getClass()
            aucx r11 = r9.b
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x0496
            aucx r11 = r9.b
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)
            r9.b = r11
        L_0x0496:
            aucx r9 = r9.b
            r9.add(r8)
            goto L_0x04a2
        L_0x049c:
            r10 = 10
            r14 = 4
            r15 = 5
            r18 = 2
        L_0x04a2:
            int r7 = r7 + 1
            r10 = 4
            r12 = 1
            goto L_0x0342
        L_0x04a8:
            aucj r0 = r0.i()
            atbw r0 = (defpackage.atbw) r0
            return r0
        L_0x04af:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkk.a(com.google.android.ulr.ApiBleScanReport):atbw");
    }
}
