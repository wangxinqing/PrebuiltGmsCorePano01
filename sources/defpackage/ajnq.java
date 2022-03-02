package defpackage;

import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.ulr.ApiExperiment;
import com.google.android.ulr.ApiExperimentTokens;
import com.google.android.ulr.ApiLocation;
import com.google.android.ulr.ApiLocationReading;
import com.google.android.ulr.ApiRate;
import com.google.android.ulr.ApiUserData;
import java.util.Iterator;
import java.util.Random;

/* renamed from: ajnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnq {
    private static final Random a = new Random();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atbn a(com.google.android.ulr.ApiActivityReading r18) {
        /*
            java.lang.String r0 = "UlrApiActivityReadingConvertTriggered"
            defpackage.ajjb.a((java.lang.String) r0)
            if (r18 == 0) goto L_0x05d4
            atbn r0 = defpackage.atbn.f     // Catch:{ IllegalArgumentException -> 0x05aa }
            aucd r0 = r0.o()     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.Long r2 = r18.b()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            java.lang.Long r2 = r18.b()     // Catch:{ IllegalArgumentException -> 0x05aa }
            long r5 = r2.longValue()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r2 != 0) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r0.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0027:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbn r2 = (defpackage.atbn) r2     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r7 = r2.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r7 = r7 | r3
            r2.a = r7     // Catch:{ IllegalArgumentException -> 0x05aa }
            r2.b = r5     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0032:
            com.google.android.ulr.ApiReadingInfo r2 = r18.getReadingInfo()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5 = 2
            if (r2 == 0) goto L_0x0059
            com.google.android.ulr.ApiReadingInfo r2 = r18.getReadingInfo()     // Catch:{ IllegalArgumentException -> 0x05aa }
            atdd r2 = defpackage.alkp.a(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r6 = r0.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r6 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r0.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x004b:
            aucj r6 = r0.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbn r6 = (defpackage.atbn) r6     // Catch:{ IllegalArgumentException -> 0x05aa }
            r2.getClass()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r6.c = r2     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r2 = r6.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r2 = r2 | r5
            r6.a = r2     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0059:
            java.util.ArrayList r2 = r18.getActivities()     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.String r6 = "UNKNOWN"
            java.lang.String r7 = "unknown"
            if (r2 == 0) goto L_0x03bd
            java.util.ArrayList r2 = r18.getActivities()     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x006b:
            boolean r15 = r2.hasNext()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r15 == 0) goto L_0x03bd
            java.lang.Object r15 = r2.next()     // Catch:{ IllegalArgumentException -> 0x05aa }
            com.google.android.ulr.ApiActivity r15 = (com.google.android.ulr.ApiActivity) r15     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r15 == 0) goto L_0x03ba
            atbk r16 = defpackage.atbk.d     // Catch:{ IllegalArgumentException -> 0x05aa }
            aucd r1 = r16.o()     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.String r16 = r15.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r16 == 0) goto L_0x0374
            java.lang.String r8 = r15.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r17 = r8.hashCode()
            r5 = 14
            r14 = 12
            r12 = 9
            r13 = 10
            r11 = 13
            r10 = 11
            switch(r17) {
                case -2130108346: goto L_0x01e6;
                case -2130108006: goto L_0x01db;
                case -2026200673: goto L_0x01d0;
                case -1848623673: goto L_0x01c5;
                case -1584802318: goto L_0x01bb;
                case -1314394107: goto L_0x01b0;
                case -1312982983: goto L_0x01a5;
                case -1272596344: goto L_0x019a;
                case -1013348627: goto L_0x0190;
                case -866953016: goto L_0x0184;
                case -788012149: goto L_0x0178;
                case -596411419: goto L_0x016c;
                case -578681138: goto L_0x0161;
                case -361826745: goto L_0x0156;
                case -330673777: goto L_0x014a;
                case -284840886: goto L_0x0140;
                case -122960505: goto L_0x0134;
                case 79227272: goto L_0x0129;
                case 100313883: goto L_0x011d;
                case 100314223: goto L_0x0111;
                case 109765032: goto L_0x0106;
                case 433141802: goto L_0x00fc;
                case 821361846: goto L_0x00f0;
                case 878250929: goto L_0x00e4;
                case 1071255167: goto L_0x00d9;
                case 1118815609: goto L_0x00cd;
                case 1218519584: goto L_0x00c2;
                case 1550783935: goto L_0x00b6;
                case 1836798297: goto L_0x00aa;
                case 2111075541: goto L_0x009e;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x01f1
        L_0x009e:
            java.lang.String r9 = "inRailVehicle"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 21
            goto L_0x01f2
        L_0x00aa:
            java.lang.String r9 = "WALKING"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 14
            goto L_0x01f2
        L_0x00b6:
            java.lang.String r9 = "running"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 17
            goto L_0x01f2
        L_0x00c2:
            java.lang.String r9 = "onBicycle"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 3
            goto L_0x01f2
        L_0x00cd:
            java.lang.String r9 = "walking"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 15
            goto L_0x01f2
        L_0x00d9:
            java.lang.String r9 = "ON_BICYCLE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 2
            goto L_0x01f2
        L_0x00e4:
            java.lang.String r9 = "EXITING_VEHICLE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 12
            goto L_0x01f2
        L_0x00f0:
            java.lang.String r9 = "IN_FOUR_WHEELER_VEHICLE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 24
            goto L_0x01f2
        L_0x00fc:
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x01f1
            r8 = 8
            goto L_0x01f2
        L_0x0106:
            java.lang.String r9 = "still"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 7
            goto L_0x01f2
        L_0x0111:
            java.lang.String r9 = "inCar"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 27
            goto L_0x01f2
        L_0x011d:
            java.lang.String r9 = "inBus"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 29
            goto L_0x01f2
        L_0x0129:
            java.lang.String r9 = "STILL"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 6
            goto L_0x01f2
        L_0x0134:
            java.lang.String r9 = "inRoadVehicle"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 19
            goto L_0x01f2
        L_0x0140:
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x01f1
            r8 = 9
            goto L_0x01f2
        L_0x014a:
            java.lang.String r9 = "inFourWheelerVehicle"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 25
            goto L_0x01f2
        L_0x0156:
            java.lang.String r9 = "inVehicle"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 1
            goto L_0x01f2
        L_0x0161:
            java.lang.String r9 = "ON_FOOT"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 4
            goto L_0x01f2
        L_0x016c:
            java.lang.String r9 = "TILTING"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 10
            goto L_0x01f2
        L_0x0178:
            java.lang.String r9 = "inTwoWheelerVehicle"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 23
            goto L_0x01f2
        L_0x0184:
            java.lang.String r9 = "IN_TWO_WHEELER_VEHICLE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 22
            goto L_0x01f2
        L_0x0190:
            java.lang.String r9 = "onFoot"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 5
            goto L_0x01f2
        L_0x019a:
            java.lang.String r9 = "exitingVehicle"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 13
            goto L_0x01f2
        L_0x01a5:
            java.lang.String r9 = "IN_RAIL_VEHICLE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 20
            goto L_0x01f2
        L_0x01b0:
            java.lang.String r9 = "tilting"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 11
            goto L_0x01f2
        L_0x01bb:
            java.lang.String r9 = "IN_VEHICLE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 0
            goto L_0x01f2
        L_0x01c5:
            java.lang.String r9 = "IN_ROAD_VEHICLE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 18
            goto L_0x01f2
        L_0x01d0:
            java.lang.String r9 = "RUNNING"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 16
            goto L_0x01f2
        L_0x01db:
            java.lang.String r9 = "IN_CAR"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 26
            goto L_0x01f2
        L_0x01e6:
            java.lang.String r9 = "IN_BUS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f1
            r8 = 28
            goto L_0x01f2
        L_0x01f1:
            r8 = -1
        L_0x01f2:
            switch(r8) {
                case 0: goto L_0x0340;
                case 1: goto L_0x0340;
                case 2: goto L_0x032a;
                case 3: goto L_0x032a;
                case 4: goto L_0x0313;
                case 5: goto L_0x0313;
                case 6: goto L_0x02fc;
                case 7: goto L_0x02fc;
                case 8: goto L_0x02e4;
                case 9: goto L_0x02e4;
                case 10: goto L_0x02cc;
                case 11: goto L_0x02cc;
                case 12: goto L_0x02b4;
                case 13: goto L_0x02b4;
                case 14: goto L_0x029c;
                case 15: goto L_0x029c;
                case 16: goto L_0x0283;
                case 17: goto L_0x0283;
                case 18: goto L_0x026c;
                case 19: goto L_0x026c;
                case 20: goto L_0x0255;
                case 21: goto L_0x0255;
                case 22: goto L_0x023e;
                case 23: goto L_0x023e;
                case 24: goto L_0x0227;
                case 25: goto L_0x0227;
                case 26: goto L_0x0210;
                case 27: goto L_0x0210;
                case 28: goto L_0x01f9;
                case 29: goto L_0x01f9;
                default: goto L_0x01f5;
            }
        L_0x01f5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0356
        L_0x01f9:
            boolean r8 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 != 0) goto L_0x01fe
            goto L_0x0203
        L_0x01fe:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0203:
            aucj r8 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r8 = (defpackage.atbk) r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8.b = r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r5 = r8.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5 = r5 | r3
            r8.a = r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x0210:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x0215
            goto L_0x021a
        L_0x0215:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x021a:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.b = r11     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x0227:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x022c
            goto L_0x0231
        L_0x022c:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0231:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.b = r14     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x023e:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x0243
            goto L_0x0248
        L_0x0243:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0248:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.b = r10     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x0255:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x025a
            goto L_0x025f
        L_0x025a:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x025f:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.b = r13     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x026c:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x0271
            goto L_0x0276
        L_0x0271:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0276:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.b = r12     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x0283:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x0288
            goto L_0x028d
        L_0x0288:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x028d:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = 8
            r5.b = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x029c:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x02a1
            goto L_0x02a6
        L_0x02a1:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x02a6:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = 7
            r5.b = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x02b4:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x02b9
            goto L_0x02be
        L_0x02b9:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x02be:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = 6
            r5.b = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x02cc:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x02d1
            goto L_0x02d6
        L_0x02d1:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x02d6:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = 5
            r5.b = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x02e4:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x02e9
            goto L_0x02ee
        L_0x02e9:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x02ee:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = 4
            r5.b = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x02fc:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x0301
            goto L_0x0306
        L_0x0301:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0306:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = 3
            r5.b = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x0313:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x0318
            goto L_0x031d
        L_0x0318:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x031d:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = 2
            r5.b = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x032a:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x032f
            goto L_0x0334
        L_0x032f:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0334:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.b = r3     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x0340:
            boolean r5 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x0345
            goto L_0x034a
        L_0x0345:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x034a:
            aucj r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r5 = (defpackage.atbk) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.b = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r5.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8 = r8 | r3
            r5.a = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0374
        L_0x0356:
            java.lang.String r1 = "Json2LiteBadEnum userlocation.ApiActivity.type "
            java.lang.String r2 = r15.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r3 = r2.length()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r3 != 0) goto L_0x036c
            java.lang.String r2 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x05aa }
            r2.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0370
        L_0x036c:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0370:
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
            throw r0     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0374:
            java.lang.Integer r5 = r15.b()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 == 0) goto L_0x0398
            java.lang.Integer r5 = r15.b()     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r5 = r5.intValue()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r8 = r1.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 != 0) goto L_0x0387
            goto L_0x038c
        L_0x0387:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x038c:
            aucj r8 = r1.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r8 = (defpackage.atbk) r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r9 = r8.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r10 = 2
            r9 = r9 | r10
            r8.a = r9     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8.c = r5     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0398:
            aucj r1 = r1.i()     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbk r1 = (defpackage.atbk) r1     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r5 = r0.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x03a3
            goto L_0x03a8
        L_0x03a3:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r0.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x03a8:
            aucj r5 = r0.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbn r5 = (defpackage.atbn) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.a()     // Catch:{ IllegalArgumentException -> 0x05aa }
            aucx r5 = r5.d     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.add(r1)     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5 = 2
            goto L_0x006b
        L_0x03ba:
            r5 = 2
            goto L_0x006b
        L_0x03bd:
            java.util.ArrayList r1 = r18.getExtras()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r1 == 0) goto L_0x05a2
            java.util.ArrayList r1 = r18.getExtras()     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x03cb:
            boolean r2 = r1.hasNext()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r2 == 0) goto L_0x05a2
            java.lang.Object r2 = r1.next()     // Catch:{ IllegalArgumentException -> 0x05aa }
            com.google.android.ulr.ApiActivityExtraRow r2 = (com.google.android.ulr.ApiActivityExtraRow) r2     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r2 == 0) goto L_0x0598
            atbm r5 = defpackage.atbm.f     // Catch:{ IllegalArgumentException -> 0x05aa }
            aucd r5 = r5.o()     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.String r8 = r2.i()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 == 0) goto L_0x046b
            java.lang.String r8 = r2.i()     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r9 = r8.hashCode()
            switch(r9) {
                case -284840886: goto L_0x040d;
                case 81434961: goto L_0x0403;
                case 111972721: goto L_0x03f9;
                case 433141802: goto L_0x03f1;
                default: goto L_0x03f0;
            }
        L_0x03f0:
            goto L_0x0415
        L_0x03f1:
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x0415
            r8 = 0
            goto L_0x0416
        L_0x03f9:
            java.lang.String r9 = "value"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0415
            r8 = 3
            goto L_0x0416
        L_0x0403:
            java.lang.String r9 = "VALUE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0415
            r8 = 2
            goto L_0x0416
        L_0x040d:
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x0415
            r8 = 1
            goto L_0x0416
        L_0x0415:
            r8 = -1
        L_0x0416:
            if (r8 == 0) goto L_0x0456
            if (r8 == r3) goto L_0x0456
            r9 = 2
            if (r8 == r9) goto L_0x0440
            r9 = 3
            if (r8 == r9) goto L_0x0440
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.String r1 = "Json2LiteBadEnum userlocation.ApiActivityExtraRow.type "
            java.lang.String r2 = r2.i()     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r3 = r2.length()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r3 != 0) goto L_0x0438
            java.lang.String r2 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x05aa }
            r2.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x043c
        L_0x0438:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x043c:
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
            throw r0     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0440:
            boolean r8 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 != 0) goto L_0x0445
            goto L_0x044a
        L_0x0445:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x044a:
            aucj r8 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r8 = (defpackage.atbm) r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8.d = r3     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r9 = r8.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r9 = r9 | r3
            r8.a = r9     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x046b
        L_0x0456:
            boolean r8 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 != 0) goto L_0x045b
            goto L_0x0460
        L_0x045b:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0460:
            aucj r8 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r8 = (defpackage.atbm) r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8.d = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r9 = r8.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r9 = r9 | r3
            r8.a = r9     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x046b:
            java.lang.String r8 = r2.g()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 == 0) goto L_0x048f
            java.lang.String r8 = r2.g()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r9 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r9 != 0) goto L_0x047a
            goto L_0x047f
        L_0x047a:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x047f:
            aucj r9 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r9 = (defpackage.atbm) r9     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r10 = r9.a     // Catch:{ IllegalArgumentException -> 0x05aa }
            r11 = 2
            r10 = r10 | r11
            r9.a = r10     // Catch:{ IllegalArgumentException -> 0x05aa }
            r9.e = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0490
        L_0x048f:
            r11 = 2
        L_0x0490:
            java.lang.Integer r8 = r2.e()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 == 0) goto L_0x04b6
            java.lang.Integer r8 = r2.e()     // Catch:{ IllegalArgumentException -> 0x05aa }
            int r8 = r8.intValue()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r9 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r9 != 0) goto L_0x04a3
            goto L_0x04a8
        L_0x04a3:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x04a8:
            aucj r9 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r9 = (defpackage.atbm) r9     // Catch:{ IllegalArgumentException -> 0x05aa }
            r10 = 3
            r9.b = r10     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalArgumentException -> 0x05aa }
            r9.c = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x04b7
        L_0x04b6:
            r10 = 3
        L_0x04b7:
            java.lang.Long r8 = r2.f()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 == 0) goto L_0x04dd
            java.lang.Long r8 = r2.f()     // Catch:{ IllegalArgumentException -> 0x05aa }
            long r8 = r8.longValue()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r12 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r12 != 0) goto L_0x04ca
            goto L_0x04cf
        L_0x04ca:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x04cf:
            aucj r12 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r12 = (defpackage.atbm) r12     // Catch:{ IllegalArgumentException -> 0x05aa }
            r13 = 4
            r12.b = r13     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ IllegalArgumentException -> 0x05aa }
            r12.c = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x04de
        L_0x04dd:
            r13 = 4
        L_0x04de:
            java.lang.Float r8 = r2.d()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 == 0) goto L_0x0504
            java.lang.Float r8 = r2.d()     // Catch:{ IllegalArgumentException -> 0x05aa }
            float r8 = r8.floatValue()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r9 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r9 != 0) goto L_0x04f1
            goto L_0x04f6
        L_0x04f1:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x04f6:
            aucj r9 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r9 = (defpackage.atbm) r9     // Catch:{ IllegalArgumentException -> 0x05aa }
            r12 = 5
            r9.b = r12     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ IllegalArgumentException -> 0x05aa }
            r9.c = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0505
        L_0x0504:
            r12 = 5
        L_0x0505:
            java.lang.Double r8 = r2.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 == 0) goto L_0x052b
            java.lang.Double r8 = r2.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            double r8 = r8.doubleValue()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r14 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r14 != 0) goto L_0x0518
            goto L_0x051d
        L_0x0518:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x051d:
            aucj r14 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r14 = (defpackage.atbm) r14     // Catch:{ IllegalArgumentException -> 0x05aa }
            r15 = 6
            r14.b = r15     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ IllegalArgumentException -> 0x05aa }
            r14.c = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x052c
        L_0x052b:
            r15 = 6
        L_0x052c:
            java.lang.String r8 = r2.h()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 == 0) goto L_0x054d
            java.lang.String r8 = r2.h()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r9 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r9 != 0) goto L_0x053b
            goto L_0x0540
        L_0x053b:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0540:
            aucj r9 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r9 = (defpackage.atbm) r9     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r14 = 7
            r9.b = r14     // Catch:{ IllegalArgumentException -> 0x05aa }
            r9.c = r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x054e
        L_0x054d:
            r14 = 7
        L_0x054e:
            java.lang.Boolean r8 = r2.b()     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 == 0) goto L_0x0575
            java.lang.Boolean r2 = r2.b()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r2 = r2.booleanValue()     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r8 = r5.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r8 != 0) goto L_0x0561
            goto L_0x0566
        L_0x0561:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0566:
            aucj r8 = r5.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r8 = (defpackage.atbm) r8     // Catch:{ IllegalArgumentException -> 0x05aa }
            r9 = 8
            r8.b = r9     // Catch:{ IllegalArgumentException -> 0x05aa }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
            r8.c = r2     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x0577
        L_0x0575:
            r9 = 8
        L_0x0577:
            aucj r2 = r5.i()     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbm r2 = (defpackage.atbm) r2     // Catch:{ IllegalArgumentException -> 0x05aa }
            boolean r5 = r0.c     // Catch:{ IllegalArgumentException -> 0x05aa }
            if (r5 != 0) goto L_0x0582
            goto L_0x0587
        L_0x0582:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r0.c = r4     // Catch:{ IllegalArgumentException -> 0x05aa }
        L_0x0587:
            aucj r5 = r0.b     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbn r5 = (defpackage.atbn) r5     // Catch:{ IllegalArgumentException -> 0x05aa }
            r2.getClass()     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.b()     // Catch:{ IllegalArgumentException -> 0x05aa }
            aucx r5 = r5.e     // Catch:{ IllegalArgumentException -> 0x05aa }
            r5.add(r2)     // Catch:{ IllegalArgumentException -> 0x05aa }
            goto L_0x03cb
        L_0x0598:
            r9 = 8
            r10 = 3
            r11 = 2
            r12 = 5
            r13 = 4
            r14 = 7
            r15 = 6
            goto L_0x03cb
        L_0x05a2:
            aucj r0 = r0.i()     // Catch:{ IllegalArgumentException -> 0x05aa }
            atbn r0 = (defpackage.atbn) r0     // Catch:{ IllegalArgumentException -> 0x05aa }
            r1 = r0
            goto L_0x05d5
        L_0x05aa:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Convert ApiActivityReadingConvert Exception: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x05c1
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x05c5
        L_0x05c1:
            java.lang.String r1 = r2.concat(r1)
        L_0x05c5:
            java.lang.String r2 = "GCoreUlr"
            defpackage.ajix.c(r2, r1)
            r1 = 57
            defpackage.ajjb.a((int) r1)
            a((java.lang.IllegalArgumentException) r0)
            r1 = 0
            goto L_0x05d5
        L_0x05d4:
            r1 = 0
        L_0x05d5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnq.a(com.google.android.ulr.ApiActivityReading):atbn");
    }

    public static atcg a(ApiExperiment apiExperiment) {
        ajjb.a("UlrApiExperimentConvertTriggered");
        try {
            return alkl.a(apiExperiment);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e.getMessage());
            ajix.c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiExperimentConverter Exception: ") : "Convert ApiExperimentConverter Exception: ".concat(valueOf));
            ajjb.a(62);
            a(e);
            return null;
        }
    }

    public static atch a(ApiExperimentTokens apiExperimentTokens) {
        ajjb.a("UlrApiExperimentTokensConvertTriggered");
        if (apiExperimentTokens == null) {
            return null;
        }
        try {
            aucd o = atch.h.o();
            if (apiExperimentTokens.d() != null) {
                auay a2 = auay.a(Base64.decode(apiExperimentTokens.d(), 10));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atch atch = (atch) o.b;
                a2.getClass();
                atch.a |= 1;
                atch.b = a2;
            }
            if (apiExperimentTokens.e() != null) {
                Iterator it = apiExperimentTokens.e().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        auay a3 = auay.a(Base64.decode(str, 10));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atch atch2 = (atch) o.b;
                        a3.getClass();
                        if (!atch2.c.a()) {
                            atch2.c = aucj.a(atch2.c);
                        }
                        atch2.c.add(a3);
                    }
                }
            }
            if (apiExperimentTokens.g() != null) {
                Iterator it2 = apiExperimentTokens.g().iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (str2 != null) {
                        auay a4 = auay.a(Base64.decode(str2, 10));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atch atch3 = (atch) o.b;
                        a4.getClass();
                        if (!atch3.d.a()) {
                            atch3.d = aucj.a(atch3.d);
                        }
                        atch3.d.add(a4);
                    }
                }
            }
            if (apiExperimentTokens.c() != null) {
                Iterator it3 = apiExperimentTokens.c().iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    if (str3 != null) {
                        auay a5 = auay.a(Base64.decode(str3, 10));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atch atch4 = (atch) o.b;
                        a5.getClass();
                        if (!atch4.e.a()) {
                            atch4.e = aucj.a(atch4.e);
                        }
                        atch4.e.add(a5);
                    }
                }
            }
            if (apiExperimentTokens.f() != null) {
                Iterator it4 = apiExperimentTokens.f().iterator();
                while (it4.hasNext()) {
                    String str4 = (String) it4.next();
                    if (str4 != null) {
                        auay a6 = auay.a(Base64.decode(str4, 10));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atch atch5 = (atch) o.b;
                        a6.getClass();
                        if (!atch5.f.a()) {
                            atch5.f = aucj.a(atch5.f);
                        }
                        atch5.f.add(a6);
                    }
                }
            }
            if (apiExperimentTokens.b() != null) {
                Iterator it5 = apiExperimentTokens.b().iterator();
                while (it5.hasNext()) {
                    String str5 = (String) it5.next();
                    if (str5 != null) {
                        auay a7 = auay.a(Base64.decode(str5, 10));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atch atch6 = (atch) o.b;
                        a7.getClass();
                        if (!atch6.g.a()) {
                            atch6.g = aucj.a(atch6.g);
                        }
                        atch6.g.add(a7);
                    }
                }
            }
            return (atch) o.i();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.additional_direct_experiment_tokens", e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.other_cross_experiment_tokens", e2);
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.always_cross_experiment_tokens", e3);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.pseudonymous_cross_experiment_tokens", e4);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.gaia_cross_experiment_tokens", e5);
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiExperimentTokens.direct_experiment_token", e6);
        } catch (IllegalArgumentException e7) {
            String valueOf = String.valueOf(e7.getMessage());
            ajix.c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiExperimentTokensConverter Exception: ") : "Convert ApiExperimentTokensConverter Exception: ".concat(valueOf));
            ajjb.a(59);
            a(e7);
            return null;
        }
    }

    public static atck a(ApiLocationReading apiLocationReading) {
        atcj atcj;
        ajjb.a("UlrApiLocationReadingConvertTriggered");
        if (apiLocationReading == null) {
            return null;
        }
        try {
            aucd o = atck.j.o();
            if (apiLocationReading.f() != null) {
                long longValue = apiLocationReading.f().longValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atck atck = (atck) o.b;
                atck.a |= 1;
                atck.b = longValue;
            }
            if (apiLocationReading.getReadingInfo() != null) {
                atdd a2 = alkp.a(apiLocationReading.getReadingInfo());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atck atck2 = (atck) o.b;
                a2.getClass();
                atck2.c = a2;
                atck2.a |= 2;
            }
            if (apiLocationReading.getLocation() != null) {
                ApiLocation location = apiLocationReading.getLocation();
                if (location != null) {
                    aucd o2 = atcj.m.o();
                    if (location.i() != null) {
                        int intValue = location.i().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj2 = (atcj) o2.b;
                        atcj2.a |= 1;
                        atcj2.b = intValue;
                    }
                    if (location.j() != null) {
                        int intValue2 = location.j().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj3 = (atcj) o2.b;
                        atcj3.a |= 2;
                        atcj3.c = intValue2;
                    }
                    if (location.k() != null) {
                        int intValue3 = location.k().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj4 = (atcj) o2.b;
                        atcj4.a |= 4;
                        atcj4.d = intValue3;
                    }
                    if (location.e() != null) {
                        int intValue4 = location.e().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj5 = (atcj) o2.b;
                        atcj5.a |= 8;
                        atcj5.e = intValue4;
                    }
                    if (location.b() != null) {
                        int intValue5 = location.b().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj6 = (atcj) o2.b;
                        atcj6.a |= 16;
                        atcj6.f = intValue5;
                    }
                    if (location.g() != null) {
                        int intValue6 = location.g().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj7 = (atcj) o2.b;
                        atcj7.a |= 32;
                        atcj7.g = intValue6;
                    }
                    if (location.h() != null) {
                        String h = location.h();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj8 = (atcj) o2.b;
                        h.getClass();
                        atcj8.a |= 64;
                        atcj8.h = h;
                    }
                    if (location.f() != null) {
                        int intValue7 = location.f().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj9 = (atcj) o2.b;
                        atcj9.a |= 128;
                        atcj9.i = intValue7;
                    }
                    if (location.l() != null) {
                        int intValue8 = location.l().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj10 = (atcj) o2.b;
                        atcj10.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        atcj10.j = intValue8;
                    }
                    if (location.d() != null) {
                        int intValue9 = location.d().intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj11 = (atcj) o2.b;
                        atcj11.a |= 512;
                        atcj11.k = intValue9;
                    }
                    if (location.c() != null) {
                        boolean booleanValue = location.c().booleanValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atcj atcj12 = (atcj) o2.b;
                        atcj12.a |= 1024;
                        atcj12.l = booleanValue;
                    }
                    atcj = (atcj) o2.i();
                } else {
                    atcj = null;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atck atck3 = (atck) o.b;
                atcj.getClass();
                atck3.d = atcj;
                atck3.a |= 4;
            }
            if (apiLocationReading.getExperiments() != null) {
                Iterator it = apiLocationReading.getExperiments().iterator();
                while (it.hasNext()) {
                    ApiExperiment apiExperiment = (ApiExperiment) it.next();
                    if (apiExperiment != null) {
                        atcg a3 = alkl.a(apiExperiment);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atck atck4 = (atck) o.b;
                        a3.getClass();
                        atck4.a();
                        atck4.e.add(a3);
                    }
                }
            }
            if (apiLocationReading.d() != null) {
                int intValue10 = apiLocationReading.d().intValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atck atck5 = (atck) o.b;
                atck5.a |= 8;
                atck5.f = intValue10;
            }
            if (apiLocationReading.e() != null) {
                int intValue11 = apiLocationReading.e().intValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atck atck6 = (atck) o.b;
                atck6.a |= 16;
                atck6.g = intValue11;
            }
            if (apiLocationReading.b() != null) {
                long longValue2 = apiLocationReading.b().longValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atck atck7 = (atck) o.b;
                atck7.a |= 32;
                atck7.h = longValue2;
            }
            if (apiLocationReading.c() != null) {
                boolean booleanValue2 = apiLocationReading.c().booleanValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atck atck8 = (atck) o.b;
                atck8.a |= 64;
                atck8.i = booleanValue2;
            }
            return (atck) o.i();
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e.getMessage());
            ajix.c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiLocationReadingConverter Exception: ") : "Convert ApiLocationReadingConverter Exception: ".concat(valueOf));
            ajjb.a(58);
            a(e);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x028d, code lost:
        if (r8.equals("INFERRED_REVERSE_GEOCODING") != false) goto L_0x02ee;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atco a(com.google.android.ulr.ApiMetadata r17) {
        /*
            java.lang.String r1 = "UlrApiMetadataConvertTriggered"
            defpackage.ajjb.a((java.lang.String) r1)
            if (r17 == 0) goto L_0x0c57
            atco r2 = defpackage.atco.r     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r2 = r2.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.Long r3 = r17.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0032
            java.lang.Long r3 = r17.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            long r6 = r3.longValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0027:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r3.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.b = r6     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0032:
            com.google.android.ulr.ApiRate r3 = r17.getRate()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r6 = 2
            if (r3 == 0) goto L_0x0059
            com.google.android.ulr.ApiRate r3 = r17.getRate()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atda r3 = defpackage.alko.a(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r7 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x004b:
            aucj r7 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r7 = (defpackage.atco) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.c = r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r3 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3 = r3 | r6
            r7.a = r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0059:
            com.google.android.ulr.ApiPlaceReport r3 = r17.getPlaceReport()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7 = 11
            r11 = 5
            r12 = -1
            r13 = 8
            r14 = 3
            r15 = 4
            if (r3 == 0) goto L_0x03dd
            com.google.android.ulr.ApiPlaceReport r3 = r17.getPlaceReport()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 == 0) goto L_0x03c4
            atcu r16 = defpackage.atcu.h     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r1 = r16.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r16 = r3.d()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r16 == 0) goto L_0x0095
            java.lang.String r8 = r3.d()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0087:
            aucj r9 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r9 = (defpackage.atcu) r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r9.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | r4
            r9.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.b = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0095:
            java.lang.String r8 = r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x00b7
            java.lang.String r8 = r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x00a9:
            aucj r9 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r9 = (defpackage.atcu) r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r9.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | r6
            r9.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.c = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x00b7:
            java.lang.String r8 = r3.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x00d9
            java.lang.String r8 = r3.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x00cb:
            aucj r9 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r9 = (defpackage.atcu) r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r9.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | r15
            r9.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.d = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x00d9:
            com.google.android.ulr.ApiPlaceReportPayload r8 = r3.getPayload()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x00ff
            com.google.android.ulr.ApiPlaceReportPayload r8 = r3.getPayload()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcv r8 = defpackage.alkn.a(r8)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x00f1:
            aucj r9 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r9 = (defpackage.atcu) r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.e = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r9.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r13
            r9.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x00ff:
            java.lang.String r8 = r3.f()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9 = 10
            if (r8 == 0) goto L_0x0244
            java.lang.String r8 = r3.f()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r8.hashCode()
            switch(r10) {
                case -894448902: goto L_0x0188;
                case -797215086: goto L_0x017e;
                case -708279148: goto L_0x0173;
                case -569400013: goto L_0x0169;
                case -290141269: goto L_0x015f;
                case 248250742: goto L_0x0154;
                case 258736189: goto L_0x014a;
                case 1027576367: goto L_0x0140;
                case 1619688100: goto L_0x0136;
                case 1636860638: goto L_0x012c;
                case 1650399707: goto L_0x0120;
                case 1791765189: goto L_0x0114;
                default: goto L_0x0112;
            }
        L_0x0112:
            goto L_0x0192
        L_0x0114:
            java.lang.String r10 = "placeExit"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 9
            goto L_0x0193
        L_0x0120:
            java.lang.String r10 = "AT_PLACE"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 10
            goto L_0x0193
        L_0x012c:
            java.lang.String r10 = "NEARBY_EXIT"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 4
            goto L_0x0193
        L_0x0136:
            java.lang.String r10 = "unknownType"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 1
            goto L_0x0193
        L_0x0140:
            java.lang.String r10 = "UNKNOWN_TYPE"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 0
            goto L_0x0193
        L_0x014a:
            java.lang.String r10 = "nearbyExit"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 5
            goto L_0x0193
        L_0x0154:
            java.lang.String r10 = "PLACE_EXIT"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 8
            goto L_0x0193
        L_0x015f:
            java.lang.String r10 = "placeEntry"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 7
            goto L_0x0193
        L_0x0169:
            java.lang.String r10 = "nearbyEntry"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 3
            goto L_0x0193
        L_0x0173:
            java.lang.String r10 = "atPlace"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 11
            goto L_0x0193
        L_0x017e:
            java.lang.String r10 = "NEARBY_ENTRY"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 2
            goto L_0x0193
        L_0x0188:
            java.lang.String r10 = "PLACE_ENTRY"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0192
            r8 = 6
            goto L_0x0193
        L_0x0192:
            r8 = -1
        L_0x0193:
            switch(r8) {
                case 0: goto L_0x020f;
                case 1: goto L_0x020f;
                case 2: goto L_0x01f8;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01e1;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01ca;
                case 7: goto L_0x01ca;
                case 8: goto L_0x01b2;
                case 9: goto L_0x01b2;
                case 10: goto L_0x019a;
                case 11: goto L_0x019a;
                default: goto L_0x0196;
            }
        L_0x0196:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0226
        L_0x019a:
            boolean r8 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x019f
            goto L_0x01a4
        L_0x019f:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x01a4:
            aucj r8 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r8 = (defpackage.atcu) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.f = r11     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | 16
            r8.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0244
        L_0x01b2:
            boolean r8 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x01b7
            goto L_0x01bc
        L_0x01b7:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x01bc:
            aucj r8 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r8 = (defpackage.atcu) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.f = r15     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | 16
            r8.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0244
        L_0x01ca:
            boolean r8 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x01cf
            goto L_0x01d4
        L_0x01cf:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x01d4:
            aucj r8 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r8 = (defpackage.atcu) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.f = r14     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | 16
            r8.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0244
        L_0x01e1:
            boolean r8 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x01e6
            goto L_0x01eb
        L_0x01e6:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x01eb:
            aucj r8 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r8 = (defpackage.atcu) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.f = r6     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | 16
            r8.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0244
        L_0x01f8:
            boolean r8 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x01fd
            goto L_0x0202
        L_0x01fd:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0202:
            aucj r8 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r8 = (defpackage.atcu) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.f = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | 16
            r8.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0244
        L_0x020f:
            boolean r8 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x0214
            goto L_0x0219
        L_0x0214:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0219:
            aucj r8 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r8 = (defpackage.atcu) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.f = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | 16
            r8.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0244
        L_0x0226:
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiPlaceReport.type "
            java.lang.String r3 = r3.f()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r4 != 0) goto L_0x023c
            java.lang.String r3 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0240
        L_0x023c:
            java.lang.String r3 = r2.concat(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0240:
            r1.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0244:
            java.lang.String r8 = r3.e()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x024c
            goto L_0x039f
        L_0x024c:
            java.lang.String r8 = r3.e()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r8.hashCode()
            switch(r10) {
                case -1436706272: goto L_0x02e3;
                case -1194968642: goto L_0x02d9;
                case -978712437: goto L_0x02ce;
                case -773301127: goto L_0x02c4;
                case -284840886: goto L_0x02ba;
                case -262743844: goto L_0x02af;
                case -175044018: goto L_0x02a4;
                case 169606531: goto L_0x029a;
                case 433141802: goto L_0x0290;
                case 545688802: goto L_0x0287;
                case 735786695: goto L_0x027c;
                case 952233347: goto L_0x0271;
                case 1164924125: goto L_0x0265;
                case 1287171955: goto L_0x0259;
                default: goto L_0x0257;
            }
        L_0x0257:
            goto L_0x02ed
        L_0x0259:
            java.lang.String r9 = "inferredRadioSignals"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 9
            goto L_0x02ee
        L_0x0265:
            java.lang.String r9 = "inferredSnappedToRoad"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 13
            goto L_0x02ee
        L_0x0271:
            java.lang.String r9 = "INFERRED"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 4
            goto L_0x02ee
        L_0x027c:
            java.lang.String r9 = "USER_REPORTED"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 2
            goto L_0x02ee
        L_0x0287:
            java.lang.String r10 = "INFERRED_REVERSE_GEOCODING"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x02ed
            goto L_0x02ee
        L_0x0290:
            java.lang.String r9 = "UNKNOWN"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 0
            goto L_0x02ee
        L_0x029a:
            java.lang.String r9 = "inferred"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 5
            goto L_0x02ee
        L_0x02a4:
            java.lang.String r9 = "INFERRED_SNAPPED_TO_ROAD"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 12
            goto L_0x02ee
        L_0x02af:
            java.lang.String r9 = "inferredReverseGeocoding"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 11
            goto L_0x02ee
        L_0x02ba:
            java.lang.String r9 = "unknown"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 1
            goto L_0x02ee
        L_0x02c4:
            java.lang.String r9 = "INFERRED_GEOFENCING"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 6
            goto L_0x02ee
        L_0x02ce:
            java.lang.String r9 = "INFERRED_RADIO_SIGNALS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 8
            goto L_0x02ee
        L_0x02d9:
            java.lang.String r9 = "userReported"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 3
            goto L_0x02ee
        L_0x02e3:
            java.lang.String r9 = "inferredGeofencing"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x02ed
            r9 = 7
            goto L_0x02ee
        L_0x02ed:
            r9 = -1
        L_0x02ee:
            switch(r9) {
                case 0: goto L_0x0389;
                case 1: goto L_0x0389;
                case 2: goto L_0x0372;
                case 3: goto L_0x0372;
                case 4: goto L_0x035b;
                case 5: goto L_0x035b;
                case 6: goto L_0x0342;
                case 7: goto L_0x0342;
                case 8: goto L_0x0329;
                case 9: goto L_0x0329;
                case 10: goto L_0x030f;
                case 11: goto L_0x030f;
                case 12: goto L_0x02f5;
                case 13: goto L_0x02f5;
                default: goto L_0x02f1;
            }
        L_0x02f1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x03a6
        L_0x02f5:
            boolean r3 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x02fa
            goto L_0x02ff
        L_0x02fa:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x02ff:
            aucj r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r3 = (defpackage.atcu) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = 36
            r3.g = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | 32
            r3.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x039f
        L_0x030f:
            boolean r3 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0314
            goto L_0x0319
        L_0x0314:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0319:
            aucj r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r3 = (defpackage.atcu) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = 35
            r3.g = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | 32
            r3.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x039f
        L_0x0329:
            boolean r3 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x032e
            goto L_0x0333
        L_0x032e:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0333:
            aucj r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r3 = (defpackage.atcu) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = 34
            r3.g = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | 32
            r3.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x039f
        L_0x0342:
            boolean r3 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0347
            goto L_0x034c
        L_0x0347:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x034c:
            aucj r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r3 = (defpackage.atcu) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = 33
            r3.g = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | 32
            r3.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x039f
        L_0x035b:
            boolean r3 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0360
            goto L_0x0365
        L_0x0360:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0365:
            aucj r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r3 = (defpackage.atcu) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.g = r6     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | 32
            r3.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x039f
        L_0x0372:
            boolean r3 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0377
            goto L_0x037c
        L_0x0377:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x037c:
            aucj r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r3 = (defpackage.atcu) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.g = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | 32
            r3.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x039f
        L_0x0389:
            boolean r3 = r1.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x038e
            goto L_0x0393
        L_0x038e:
            r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0393:
            aucj r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r3 = (defpackage.atcu) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.g = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | 32
            r3.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x039f:
            aucj r1 = r1.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcu r1 = (defpackage.atcu) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x03c5
        L_0x03a6:
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiPlaceReport.source "
            java.lang.String r3 = r3.e()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r4 != 0) goto L_0x03bc
            java.lang.String r3 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x03c0
        L_0x03bc:
            java.lang.String r3 = r2.concat(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x03c0:
            r1.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x03c4:
            r1 = 0
        L_0x03c5:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x03ca
            goto L_0x03cf
        L_0x03ca:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x03cf:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.d = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | r15
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x03dd:
            com.google.android.ulr.ApiBurstRequest r1 = r17.getBurstRequest()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x04e1
            com.google.android.ulr.ApiBurstRequest r1 = r17.getBurstRequest()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x04c8
            atbx r3 = defpackage.atbx.h     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r3 = r3.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r8 = r1.e()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x0411
            java.lang.String r8 = r1.e()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x03fe
            goto L_0x0403
        L_0x03fe:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0403:
            aucj r9 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbx r9 = (defpackage.atbx) r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r9.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | r4
            r9.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.b = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0411:
            java.lang.Long r8 = r1.g()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x0434
            java.lang.Long r8 = r1.g()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            long r8 = r8.longValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r10 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r10 != 0) goto L_0x0424
            goto L_0x0429
        L_0x0424:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0429:
            aucj r10 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbx r10 = (defpackage.atbx) r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r11 = r10.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r11 = r11 | r6
            r10.a = r11     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10.c = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0434:
            java.lang.Long r8 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x0457
            java.lang.Long r8 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            long r8 = r8.longValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r10 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r10 != 0) goto L_0x0447
            goto L_0x044c
        L_0x0447:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x044c:
            aucj r10 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbx r10 = (defpackage.atbx) r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r11 = r10.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r11 = r11 | r15
            r10.a = r11     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10.d = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0457:
            java.lang.Long r8 = r1.d()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x047a
            java.lang.Long r8 = r1.d()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            long r8 = r8.longValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r10 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r10 != 0) goto L_0x046a
            goto L_0x046f
        L_0x046a:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x046f:
            aucj r10 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbx r10 = (defpackage.atbx) r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r11 = r10.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r11 = r11 | r13
            r10.a = r11     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10.e = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x047a:
            java.lang.Long r8 = r1.f()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x049e
            java.lang.Long r8 = r1.f()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            long r8 = r8.longValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r10 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r10 != 0) goto L_0x048d
            goto L_0x0492
        L_0x048d:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0492:
            aucj r10 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbx r10 = (defpackage.atbx) r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r11 = r10.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r11 = r11 | 16
            r10.a = r11     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10.f = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x049e:
            java.lang.String r8 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x04c1
            java.lang.String r1 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r8 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x04ad
            goto L_0x04b2
        L_0x04ad:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x04b2:
            aucj r8 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbx r8 = (defpackage.atbx) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r9 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9 = r9 | 32
            r8.a = r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.g = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x04c1:
            aucj r1 = r3.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbx r1 = (defpackage.atbx) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x04c9
        L_0x04c8:
            r1 = 0
        L_0x04c9:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x04ce
            goto L_0x04d3
        L_0x04ce:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x04d3:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.e = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | r13
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x04e1:
            com.google.android.ulr.ApiLocationStatus r1 = r17.getLocationStatus()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0508
            com.google.android.ulr.ApiLocationStatus r1 = r17.getLocationStatus()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcn r1 = defpackage.alkm.a(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x04f4
            goto L_0x04f9
        L_0x04f4:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x04f9:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.f = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 16
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0508:
            com.google.android.ulr.ApiActivationChange r1 = r17.getActivationChange()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x052f
            com.google.android.ulr.ApiActivationChange r1 = r17.getActivationChange()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbj r1 = defpackage.alki.a(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x051b
            goto L_0x0520
        L_0x051b:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0520:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.g = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 32
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x052f:
            com.google.android.ulr.ApiBleScanReport r1 = r17.getBleScanReport()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0556
            com.google.android.ulr.ApiBleScanReport r1 = r17.getBleScanReport()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbw r1 = defpackage.alkk.a(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0542
            goto L_0x0547
        L_0x0542:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0547:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.h = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 64
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0556:
            java.util.ArrayList r1 = r17.getWifiScans()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x059d
            java.util.ArrayList r1 = r17.getWifiScans()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0564:
            boolean r3 = r1.hasNext()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 == 0) goto L_0x059d
            java.lang.Object r3 = r1.next()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            com.google.android.ulr.WifiStrengthProto r3 = (com.google.android.ulr.WifiStrengthProto) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 == 0) goto L_0x0564
            aten r3 = defpackage.allb.a(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r8 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x057b
            goto L_0x0580
        L_0x057b:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0580:
            aucj r8 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r8 = (defpackage.atco) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucx r9 = r8.i     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r9.a()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x0597
            aucx r9 = r8.i     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucx r9 = defpackage.aucj.a((defpackage.aucx) r9)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.i = r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0597:
            aucx r8 = r8.i     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.add(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0564
        L_0x059d:
            com.google.android.ulr.LocationHistorianBatchData r1 = r17.getLocationHistorianBatchData()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x064a
            com.google.android.ulr.LocationHistorianBatchData r1 = r17.getLocationHistorianBatchData()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0630
            ataz r3 = defpackage.ataz.e     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r3 = r3.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.Integer r8 = r1.d()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x05d2
            java.lang.Integer r8 = r1.d()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r8.intValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x05c2
            goto L_0x05c7
        L_0x05c2:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x05c7:
            aucj r9 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            ataz r9 = (defpackage.ataz) r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r9.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | r4
            r9.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.b = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x05d2:
            java.lang.String r8 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x05f4
            java.lang.String r8 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x05e1
            goto L_0x05e6
        L_0x05e1:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x05e6:
            aucj r9 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            ataz r9 = (defpackage.ataz) r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r10 = r9.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10 = r10 | r6
            r9.a = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.c = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x05f4:
            java.lang.String r8 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x05fb
            goto L_0x061f
        L_0x05fb:
            java.lang.String r1 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0626 }
            byte[] r1 = android.util.Base64.decode(r1, r7)     // Catch:{ IllegalArgumentException -> 0x0626 }
            auay r1 = defpackage.auay.a((byte[]) r1)     // Catch:{ IllegalArgumentException -> 0x0626 }
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0626 }
            if (r7 != 0) goto L_0x060c
            goto L_0x0611
        L_0x060c:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0626 }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0626 }
        L_0x0611:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0626 }
            ataz r7 = (defpackage.ataz) r7     // Catch:{ IllegalArgumentException -> 0x0626 }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0626 }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0626 }
            r8 = r8 | r15
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0626 }
            r7.d = r1     // Catch:{ IllegalArgumentException -> 0x0626 }
        L_0x061f:
            aucj r1 = r3.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            ataz r1 = (defpackage.ataz) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0631
        L_0x0626:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r3 = "Json2LiteBadBase64 userlocation.LocationHistorianBatchData.data"
            r2.<init>(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0630:
            r1 = 0
        L_0x0631:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0636
            goto L_0x063b
        L_0x0636:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x063b:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.j = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x064a:
            com.google.android.ulr.ApiPlaceInferenceResult r1 = r17.getPlaceInferenceResult()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0849
            com.google.android.ulr.ApiPlaceInferenceResult r1 = r17.getPlaceInferenceResult()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x082f
            atcr r3 = defpackage.atcr.e     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r3 = r3.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.util.ArrayList r7 = r1.getInferences()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x06f7
            java.util.ArrayList r7 = r1.getInferences()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x066a:
            boolean r8 = r7.hasNext()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x06f7
            java.lang.Object r8 = r7.next()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            com.google.android.ulr.ApiPlaceInference r8 = (com.google.android.ulr.ApiPlaceInference) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 == 0) goto L_0x06f3
            atcq r9 = defpackage.atcq.d     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r9 = r9.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r10 = r8.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r10 == 0) goto L_0x06a0
            java.lang.String r10 = r8.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r11 = r9.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r11 != 0) goto L_0x068d
            goto L_0x0692
        L_0x068d:
            r9.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0692:
            aucj r11 = r9.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcq r11 = (defpackage.atcq) r11     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r13 = r11.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r13 = r13 | r4
            r11.a = r13     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r11.b = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x06a0:
            java.lang.Integer r10 = r8.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r10 == 0) goto L_0x06c3
            java.lang.Integer r8 = r8.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r8.intValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r10 = r9.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r10 != 0) goto L_0x06b3
            goto L_0x06b8
        L_0x06b3:
            r9.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x06b8:
            aucj r10 = r9.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcq r10 = (defpackage.atcq) r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r11 = r10.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r11 = r11 | r6
            r10.a = r11     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r10.c = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x06c3:
            aucj r8 = r9.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcq r8 = (defpackage.atcq) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r9 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r9 != 0) goto L_0x06ce
            goto L_0x06d3
        L_0x06ce:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x06d3:
            aucj r9 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcr r9 = (defpackage.atcr) r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucx r10 = r9.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r10 = r10.a()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r10 != 0) goto L_0x06ea
            aucx r10 = r9.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucx r10 = defpackage.aucj.a((defpackage.aucx) r10)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.b = r10     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x06ea:
            aucx r9 = r9.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9.add(r8)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r13 = 8
            goto L_0x066a
        L_0x06f3:
            r13 = 8
            goto L_0x066a
        L_0x06f7:
            java.lang.String r7 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x0805
            java.lang.String r7 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.hashCode()
            switch(r8) {
                case -1837176303: goto L_0x0766;
                case -1605310233: goto L_0x075c;
                case -1279990758: goto L_0x0752;
                case -787715346: goto L_0x0748;
                case -706875261: goto L_0x073d;
                case 140054749: goto L_0x0733;
                case 1027357848: goto L_0x0729;
                case 1393068040: goto L_0x071e;
                case 1619469581: goto L_0x0714;
                case 2096298948: goto L_0x070a;
                default: goto L_0x0708;
            }
        L_0x0708:
            goto L_0x0770
        L_0x070a:
            java.lang.String r8 = "noPower"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 3
            goto L_0x0771
        L_0x0714:
            java.lang.String r8 = "unknownMode"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 1
            goto L_0x0771
        L_0x071e:
            java.lang.String r8 = "HIGH_POWER"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 8
            goto L_0x0771
        L_0x0729:
            java.lang.String r8 = "UNKNOWN_MODE"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 0
            goto L_0x0771
        L_0x0733:
            java.lang.String r8 = "balancedPower"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 7
            goto L_0x0771
        L_0x073d:
            java.lang.String r8 = "highPower"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 9
            goto L_0x0771
        L_0x0748:
            java.lang.String r8 = "BALANCED_POWER"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 6
            goto L_0x0771
        L_0x0752:
            java.lang.String r8 = "LOW_POWER"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 4
            goto L_0x0771
        L_0x075c:
            java.lang.String r8 = "NO_POWER"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 2
            goto L_0x0771
        L_0x0766:
            java.lang.String r8 = "lowPower"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0770
            r7 = 5
            goto L_0x0771
        L_0x0770:
            r7 = -1
        L_0x0771:
            switch(r7) {
                case 0: goto L_0x07d1;
                case 1: goto L_0x07d1;
                case 2: goto L_0x07bb;
                case 3: goto L_0x07bb;
                case 4: goto L_0x07a5;
                case 5: goto L_0x07a5;
                case 6: goto L_0x078f;
                case 7: goto L_0x078f;
                case 8: goto L_0x0778;
                case 9: goto L_0x0778;
                default: goto L_0x0774;
            }
        L_0x0774:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x07e7
        L_0x0778:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x077d
            goto L_0x0782
        L_0x077d:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0782:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcr r7 = (defpackage.atcr) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.c = r15     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0805
        L_0x078f:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0794
            goto L_0x0799
        L_0x0794:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0799:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcr r7 = (defpackage.atcr) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.c = r14     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0805
        L_0x07a5:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x07aa
            goto L_0x07af
        L_0x07aa:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x07af:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcr r7 = (defpackage.atcr) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.c = r6     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0805
        L_0x07bb:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x07c0
            goto L_0x07c5
        L_0x07c0:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x07c5:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcr r7 = (defpackage.atcr) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.c = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0805
        L_0x07d1:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x07d6
            goto L_0x07db
        L_0x07d6:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x07db:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcr r7 = (defpackage.atcr) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0805
        L_0x07e7:
            java.lang.String r3 = "Json2LiteBadEnum userlocation.ApiPlaceInferenceResult.power_mode "
            java.lang.String r1 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r4 = r1.length()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r4 != 0) goto L_0x07fd
            java.lang.String r1 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0801
        L_0x07fd:
            java.lang.String r1 = r3.concat(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0801:
            r2.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0805:
            java.lang.Boolean r7 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x0828
            java.lang.Boolean r1 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r1 = r1.booleanValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0818
            goto L_0x081d
        L_0x0818:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x081d:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcr r7 = (defpackage.atcr) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r6
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.d = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0828:
            aucj r1 = r3.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcr r1 = (defpackage.atcr) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0830
        L_0x082f:
            r1 = 0
        L_0x0830:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0835
            goto L_0x083a
        L_0x0835:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x083a:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.k = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 256(0x100, float:3.59E-43)
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0849:
            com.google.android.ulr.ApiDeviceConnectivitySetting r1 = r17.getDeviceConnectivitySetting()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x08e5
            com.google.android.ulr.ApiDeviceConnectivitySetting r1 = r17.getDeviceConnectivitySetting()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x08cb
            atcb r3 = defpackage.atcb.e     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r3 = r3.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.Boolean r7 = r1.d()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x087e
            java.lang.Boolean r7 = r1.d()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r7 = r7.booleanValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r8 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x086e
            goto L_0x0873
        L_0x086e:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0873:
            aucj r8 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcb r8 = (defpackage.atcb) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r9 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9 = r9 | r4
            r8.a = r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.b = r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x087e:
            java.lang.Boolean r7 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x08a1
            java.lang.Boolean r7 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r7 = r7.booleanValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r8 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x0891
            goto L_0x0896
        L_0x0891:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0896:
            aucj r8 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcb r8 = (defpackage.atcb) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r9 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9 = r9 | r6
            r8.a = r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.c = r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x08a1:
            java.lang.Boolean r7 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x08c4
            java.lang.Boolean r1 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r1 = r1.booleanValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x08b4
            goto L_0x08b9
        L_0x08b4:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x08b9:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcb r7 = (defpackage.atcb) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r15
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.d = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x08c4:
            aucj r1 = r3.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcb r1 = (defpackage.atcb) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x08cc
        L_0x08cb:
            r1 = 0
        L_0x08cc:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x08d1
            goto L_0x08d6
        L_0x08d1:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x08d6:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.l = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 512(0x200, float:7.175E-43)
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x08e5:
            com.google.android.ulr.ApiWifiConnectivityStatus r1 = r17.getWifiConnectivityStatus()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x09c9
            com.google.android.ulr.ApiWifiConnectivityStatus r1 = r17.getWifiConnectivityStatus()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x09af
            atds r3 = defpackage.atds.d     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r3 = r3.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r7 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x0985
            java.lang.String r7 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.hashCode()
            switch(r8) {
                case -2087582999: goto L_0x0927;
                case -1381388741: goto L_0x091d;
                case -579210487: goto L_0x0913;
                case 935892539: goto L_0x0909;
                default: goto L_0x0908;
            }
        L_0x0908:
            goto L_0x0931
        L_0x0909:
            java.lang.String r8 = "DISCONNECTED"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0931
            r7 = 2
            goto L_0x0932
        L_0x0913:
            java.lang.String r8 = "connected"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0931
            r7 = 1
            goto L_0x0932
        L_0x091d:
            java.lang.String r8 = "disconnected"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0931
            r7 = 3
            goto L_0x0932
        L_0x0927:
            java.lang.String r8 = "CONNECTED"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0931
            r7 = 0
            goto L_0x0932
        L_0x0931:
            r7 = -1
        L_0x0932:
            if (r7 == 0) goto L_0x0970
            if (r7 == r4) goto L_0x0970
            if (r7 == r6) goto L_0x095a
            if (r7 == r14) goto L_0x095a
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r3 = "Json2LiteBadEnum userlocation.ApiWifiConnectivityStatus.wifi_connection_status "
            java.lang.String r1 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r4 = r1.length()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r4 != 0) goto L_0x0952
            java.lang.String r1 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0956
        L_0x0952:
            java.lang.String r1 = r3.concat(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0956:
            r2.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x095a:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x095f
            goto L_0x0964
        L_0x095f:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0964:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atds r7 = (defpackage.atds) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.b = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0985
        L_0x0970:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0975
            goto L_0x097a
        L_0x0975:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x097a:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atds r7 = (defpackage.atds) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.b = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0985:
            java.lang.Long r7 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x09a8
            java.lang.Long r1 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            long r7 = r1.longValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r1 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 != 0) goto L_0x0998
            goto L_0x099d
        L_0x0998:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x099d:
            aucj r1 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atds r1 = (defpackage.atds) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r9 = r1.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9 = r9 | r6
            r1.a = r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.c = r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x09a8:
            aucj r1 = r3.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atds r1 = (defpackage.atds) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x09b0
        L_0x09af:
            r1 = 0
        L_0x09b0:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x09b5
            goto L_0x09ba
        L_0x09b5:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x09ba:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.m = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x09c9:
            com.google.android.ulr.ApiModelState r1 = r17.getModelState()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0a42
            com.google.android.ulr.ApiModelState r1 = r17.getModelState()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0a28
            atcp r3 = defpackage.atcp.d     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r3 = r3.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.Integer r7 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x09fe
            java.lang.Integer r7 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r7 = r7.intValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r8 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r8 != 0) goto L_0x09ee
            goto L_0x09f3
        L_0x09ee:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x09f3:
            aucj r8 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcp r8 = (defpackage.atcp) r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r9 = r8.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r9 = r9 | r4
            r8.a = r9     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8.b = r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x09fe:
            java.lang.Integer r7 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x0a21
            java.lang.Integer r1 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r1.intValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0a11
            goto L_0x0a16
        L_0x0a11:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0a16:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcp r7 = (defpackage.atcp) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r6
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.c = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0a21:
            aucj r1 = r3.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atcp r1 = (defpackage.atcp) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0a29
        L_0x0a28:
            r1 = 0
        L_0x0a29:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0a2e
            goto L_0x0a33
        L_0x0a2e:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0a33:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.n = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0a42:
            com.google.android.ulr.ApiInternalState r1 = r17.getInternalState()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0a98
            com.google.android.ulr.ApiInternalState r1 = r17.getInternalState()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0a7e
            atci r3 = defpackage.atci.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r3 = r3.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.Integer r7 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x0a77
            java.lang.Integer r1 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r1.intValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0a67
            goto L_0x0a6c
        L_0x0a67:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0a6c:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atci r7 = (defpackage.atci) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r8 = r8 | r4
            r7.a = r8     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.b = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0a77:
            aucj r1 = r3.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atci r1 = (defpackage.atci) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0a7f
        L_0x0a7e:
            r1 = 0
        L_0x0a7f:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0a84
            goto L_0x0a89
        L_0x0a84:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0a89:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.o = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0a98:
            com.google.android.ulr.ApiActivityTransitionEventRecord r1 = r17.getActivityTransitionEventRecord()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0abf
            com.google.android.ulr.ApiActivityTransitionEventRecord r1 = r17.getActivityTransitionEventRecord()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atbp r1 = defpackage.alkj.a(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0aab
            goto L_0x0ab0
        L_0x0aab:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0ab0:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.p = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0abf:
            com.google.android.ulr.ApiStepCountsEntry r1 = r17.getStepCountsEntry()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 != 0) goto L_0x0ac7
            goto L_0x0c25
        L_0x0ac7:
            com.google.android.ulr.ApiStepCountsEntry r1 = r17.getStepCountsEntry()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r1 == 0) goto L_0x0c0b
            atdo r3 = defpackage.atdo.d     // Catch:{ IllegalArgumentException -> 0x0c2c }
            aucd r3 = r3.o()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r7 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 == 0) goto L_0x0be1
            java.lang.String r7 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.hashCode()
            switch(r8) {
                case -2103891200: goto L_0x0b41;
                case -1910307673: goto L_0x0b36;
                case -1715271366: goto L_0x0b2c;
                case 311961423: goto L_0x0b22;
                case 347778582: goto L_0x0b18;
                case 413219891: goto L_0x0b0e;
                case 492570543: goto L_0x0b04;
                case 1020431530: goto L_0x0afa;
                case 1229519187: goto L_0x0af0;
                case 1954531083: goto L_0x0ae6;
                default: goto L_0x0ae4;
            }
        L_0x0ae4:
            goto L_0x0b4c
        L_0x0ae6:
            java.lang.String r8 = "SENSOR_STATUS_UNRELIABLE"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 2
            goto L_0x0b4d
        L_0x0af0:
            java.lang.String r8 = "SENSOR_STATUS_ACCURACY_MEDIUM"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 6
            goto L_0x0b4d
        L_0x0afa:
            java.lang.String r8 = "SENSOR_STATUS_NO_CONTACT"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 0
            goto L_0x0b4d
        L_0x0b04:
            java.lang.String r8 = "sensorStatusAccuracyLow"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 5
            goto L_0x0b4d
        L_0x0b0e:
            java.lang.String r8 = "sensorStatusNoContact"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 1
            goto L_0x0b4d
        L_0x0b18:
            java.lang.String r8 = "SENSOR_STATUS_ACCURACY_LOW"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 4
            goto L_0x0b4d
        L_0x0b22:
            java.lang.String r8 = "sensorStatusUnreliable"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 3
            goto L_0x0b4d
        L_0x0b2c:
            java.lang.String r8 = "sensorStatusAccuracyMedium"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 7
            goto L_0x0b4d
        L_0x0b36:
            java.lang.String r8 = "sensorStatusAccuracyHigh"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 9
            goto L_0x0b4d
        L_0x0b41:
            java.lang.String r8 = "SENSOR_STATUS_ACCURACY_HIGH"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0b4c
            r8 = 8
            goto L_0x0b4d
        L_0x0b4c:
            r8 = -1
        L_0x0b4d:
            switch(r8) {
                case 0: goto L_0x0bad;
                case 1: goto L_0x0bad;
                case 2: goto L_0x0b97;
                case 3: goto L_0x0b97;
                case 4: goto L_0x0b81;
                case 5: goto L_0x0b81;
                case 6: goto L_0x0b6b;
                case 7: goto L_0x0b6b;
                case 8: goto L_0x0b54;
                case 9: goto L_0x0b54;
                default: goto L_0x0b50;
            }
        L_0x0b50:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0bc3
        L_0x0b54:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0b59
            goto L_0x0b5e
        L_0x0b59:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0b5e:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atdo r7 = (defpackage.atdo) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.b = r14     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r4 = r4 | r8
            r7.a = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0be1
        L_0x0b6b:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0b70
            goto L_0x0b75
        L_0x0b70:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0b75:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atdo r7 = (defpackage.atdo) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.b = r6     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r4 = r4 | r8
            r7.a = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0be1
        L_0x0b81:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0b86
            goto L_0x0b8b
        L_0x0b86:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0b8b:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atdo r7 = (defpackage.atdo) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.b = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r4 = r4 | r8
            r7.a = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0be1
        L_0x0b97:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0b9c
            goto L_0x0ba1
        L_0x0b9c:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0ba1:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atdo r7 = (defpackage.atdo) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.b = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r4 = r4 | r8
            r7.a = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0be1
        L_0x0bad:
            boolean r7 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r7 != 0) goto L_0x0bb2
            goto L_0x0bb7
        L_0x0bb2:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0bb7:
            aucj r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atdo r7 = (defpackage.atdo) r7     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r7.b = r12     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r8 = r7.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r4 = r4 | r8
            r7.a = r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0be1
        L_0x0bc3:
            java.lang.String r3 = "Json2LiteBadEnum userlocation.ApiStepCountsEntry.step_count_status "
            java.lang.String r1 = r1.b()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r4 = r1.length()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r4 != 0) goto L_0x0bd9
            java.lang.String r1 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0bdd
        L_0x0bd9:
            java.lang.String r1 = r3.concat(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0bdd:
            r2.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0c2c }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0be1:
            java.lang.Integer r4 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r4 == 0) goto L_0x0c04
            java.lang.Integer r1 = r1.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r1.intValue()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            boolean r4 = r3.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r4 != 0) goto L_0x0bf4
            goto L_0x0bf9
        L_0x0bf4:
            r3.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0bf9:
            aucj r4 = r3.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atdo r4 = (defpackage.atdo) r4     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r7 = r4.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r6 = r6 | r7
            r4.a = r6     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r4.c = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0c04:
            aucj r1 = r3.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atdo r1 = (defpackage.atdo) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0c0c
        L_0x0c0b:
            r1 = 0
        L_0x0c0c:
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0c2c }
            if (r3 != 0) goto L_0x0c11
            goto L_0x0c16
        L_0x0c11:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0c16:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r3 = (defpackage.atco) r3     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r3.q = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            int r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0c2c }
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            r3.a = r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
        L_0x0c25:
            aucj r1 = r2.i()     // Catch:{ IllegalArgumentException -> 0x0c2c }
            atco r1 = (defpackage.atco) r1     // Catch:{ IllegalArgumentException -> 0x0c2c }
            goto L_0x0c58
        L_0x0c2c:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = r1.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Convert ApiMetaDataException: "
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0c44
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x0c48
        L_0x0c44:
            java.lang.String r2 = r3.concat(r2)
        L_0x0c48:
            java.lang.String r3 = "GCoreUlr"
            defpackage.ajix.c(r3, r2)
            r2 = 54
            defpackage.ajjb.a((int) r2)
            a((java.lang.IllegalArgumentException) r1)
            r1 = 0
            goto L_0x0c58
        L_0x0c57:
            r1 = 0
        L_0x0c58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnq.a(com.google.android.ulr.ApiMetadata):atco");
    }

    public static atda a(ApiRate apiRate) {
        ajjb.a("UlrApiRateConvertTriggered");
        try {
            return alko.a(apiRate);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e.getMessage());
            ajix.c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiRateConverter Exception: ") : "Convert ApiRateConverter Exception: ".concat(valueOf));
            ajjb.a(60);
            a(e);
            return null;
        }
    }

    public static atdp a(ApiUserData apiUserData) {
        ajjb.a("UlrApiUserDataConvertTriggered");
        if (apiUserData == null) {
            return null;
        }
        try {
            aucd o = atdp.f.o();
            if (apiUserData.e() != null) {
                long longValue = apiUserData.e().longValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atdp atdp = (atdp) o.b;
                atdp.a |= 1;
                atdp.b = longValue;
            }
            if (apiUserData.d() != null) {
                String d = apiUserData.d();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atdp atdp2 = (atdp) o.b;
                d.getClass();
                atdp2.a |= 2;
                atdp2.c = d;
            }
            if (apiUserData.c() != null) {
                String c = apiUserData.c();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atdp atdp3 = (atdp) o.b;
                c.getClass();
                atdp3.a |= 4;
                atdp3.d = c;
            }
            if (apiUserData.b() != null) {
                auay a2 = auay.a(Base64.decode(apiUserData.b(), 11));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atdp atdp4 = (atdp) o.b;
                a2.getClass();
                atdp4.a |= 8;
                atdp4.e = a2;
            }
            return (atdp) o.i();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.ApiUserData.data_binary", e);
        } catch (IllegalArgumentException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            ajix.c("GCoreUlr", valueOf.length() == 0 ? new String("Convert ApiUserDataException: ") : "Convert ApiUserDataException: ".concat(valueOf));
            ajjb.a(56);
            a(e2);
            return null;
        }
    }

    private static void a(IllegalArgumentException illegalArgumentException) {
        if (a.nextDouble() <= azsy.a.a().i()) {
            ajjf.a(illegalArgumentException);
        }
    }
}
