package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;

/* renamed from: ywt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywt implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v13, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v28, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v37, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v66, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v77, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v82, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v89, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v102, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v111, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.gms.plus.internal.model.moments.ItemScopeEntity a(android.os.Parcel r63) {
        /*
            r0 = r63
            int r1 = defpackage.ivw.b(r63)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 0
            r2 = 0
            r6 = 0
            r38 = r4
            r41 = r38
            r5 = r6
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r40 = r37
            r43 = r40
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r4 = 0
            r12 = 0
        L_0x0070:
            int r2 = r63.dataPosition()
            r61 = r15
            if (r2 >= r1) goto L_0x0465
            int r2 = defpackage.ivw.a((android.os.Parcel) r63)
            int r62 = defpackage.ivw.a((int) r2)
            switch(r62) {
                case 1: goto L_0x0455;
                case 2: goto L_0x0441;
                case 3: goto L_0x0432;
                case 4: goto L_0x041e;
                case 5: goto L_0x040f;
                case 6: goto L_0x0400;
                case 7: goto L_0x03f1;
                case 8: goto L_0x03de;
                case 9: goto L_0x03cd;
                case 10: goto L_0x03ba;
                case 11: goto L_0x03a4;
                case 12: goto L_0x0393;
                case 13: goto L_0x0382;
                case 14: goto L_0x0371;
                case 15: goto L_0x035a;
                case 16: goto L_0x0349;
                case 17: goto L_0x0338;
                case 18: goto L_0x0327;
                case 19: goto L_0x0314;
                case 20: goto L_0x0303;
                case 21: goto L_0x02f2;
                case 22: goto L_0x02e1;
                case 23: goto L_0x02d0;
                case 24: goto L_0x02bf;
                case 25: goto L_0x02ae;
                case 26: goto L_0x029d;
                case 27: goto L_0x028c;
                case 28: goto L_0x027b;
                case 29: goto L_0x0264;
                case 30: goto L_0x0253;
                case 31: goto L_0x0242;
                case 32: goto L_0x0231;
                case 33: goto L_0x0220;
                case 34: goto L_0x0209;
                case 35: goto L_0x0083;
                case 36: goto L_0x01f8;
                case 37: goto L_0x01e1;
                case 38: goto L_0x01d0;
                case 39: goto L_0x01bf;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0195;
                case 42: goto L_0x0184;
                case 43: goto L_0x0173;
                case 44: goto L_0x0162;
                case 45: goto L_0x0151;
                case 46: goto L_0x013a;
                case 47: goto L_0x0129;
                case 48: goto L_0x0118;
                case 49: goto L_0x0107;
                case 50: goto L_0x00f0;
                case 51: goto L_0x00df;
                case 52: goto L_0x00ce;
                case 53: goto L_0x00bd;
                case 54: goto L_0x00ac;
                case 55: goto L_0x009b;
                case 56: goto L_0x008a;
                default: goto L_0x0083;
            }
        L_0x0083:
            defpackage.ivw.b(r0, r2)
            r15 = r61
            goto L_0x0463
        L_0x008a:
            java.lang.String r60 = defpackage.ivw.q(r0, r2)
            r2 = 56
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x009b:
            java.lang.String r59 = defpackage.ivw.q(r0, r2)
            r2 = 55
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x00ac:
            java.lang.String r58 = defpackage.ivw.q(r0, r2)
            r2 = 54
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x00bd:
            java.lang.String r57 = defpackage.ivw.q(r0, r2)
            r2 = 53
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x00ce:
            java.lang.String r56 = defpackage.ivw.q(r0, r2)
            r2 = 52
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x00df:
            java.lang.String r55 = defpackage.ivw.q(r0, r2)
            r2 = 51
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x00f0:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r54 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r54 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r54
            r2 = 50
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0107:
            java.lang.String r53 = defpackage.ivw.q(r0, r2)
            r2 = 49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0118:
            java.lang.String r52 = defpackage.ivw.q(r0, r2)
            r2 = 48
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0129:
            java.lang.String r51 = defpackage.ivw.q(r0, r2)
            r2 = 47
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x013a:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r50 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r50 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r50
            r2 = 46
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0151:
            java.lang.String r49 = defpackage.ivw.q(r0, r2)
            r2 = 45
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0162:
            java.lang.String r48 = defpackage.ivw.q(r0, r2)
            r2 = 44
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0173:
            java.lang.String r47 = defpackage.ivw.q(r0, r2)
            r2 = 43
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0184:
            java.lang.String r46 = defpackage.ivw.q(r0, r2)
            r2 = 42
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0195:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            java.util.ArrayList r45 = defpackage.ivw.c(r0, r2, r15)
            r2 = 41
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x01a8:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r44 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r44 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r44
            r2 = 40
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x01bf:
            java.lang.String r43 = defpackage.ivw.q(r0, r2)
            r2 = 39
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x01d0:
            double r41 = defpackage.ivw.n(r0, r2)
            r2 = 38
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x01e1:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r40 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r40 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r40
            r2 = 37
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x01f8:
            double r38 = defpackage.ivw.n(r0, r2)
            r2 = 36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0209:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r37 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r37 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r37
            r2 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0220:
            java.lang.String r36 = defpackage.ivw.q(r0, r2)
            r2 = 33
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0231:
            java.lang.String r35 = defpackage.ivw.q(r0, r2)
            r2 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0242:
            java.lang.String r34 = defpackage.ivw.q(r0, r2)
            r2 = 31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0253:
            java.lang.String r33 = defpackage.ivw.q(r0, r2)
            r2 = 30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0264:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r32 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r32 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r32
            r2 = 29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x027b:
            java.lang.String r31 = defpackage.ivw.q(r0, r2)
            r2 = 28
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x028c:
            java.lang.String r30 = defpackage.ivw.q(r0, r2)
            r2 = 27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x029d:
            java.lang.String r29 = defpackage.ivw.q(r0, r2)
            r2 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x02ae:
            java.lang.String r28 = defpackage.ivw.q(r0, r2)
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x02bf:
            java.lang.String r27 = defpackage.ivw.q(r0, r2)
            r2 = 24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x02d0:
            java.lang.String r26 = defpackage.ivw.q(r0, r2)
            r2 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x02e1:
            java.lang.String r25 = defpackage.ivw.q(r0, r2)
            r2 = 22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x02f2:
            java.lang.String r24 = defpackage.ivw.q(r0, r2)
            r2 = 21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0303:
            java.lang.String r23 = defpackage.ivw.q(r0, r2)
            r2 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0314:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            java.util.ArrayList r22 = defpackage.ivw.c(r0, r2, r15)
            r2 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0327:
            java.lang.String r21 = defpackage.ivw.q(r0, r2)
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0338:
            java.lang.String r20 = defpackage.ivw.q(r0, r2)
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0349:
            java.lang.String r19 = defpackage.ivw.q(r0, r2)
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x035a:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r18 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r18 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r18
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0371:
            java.lang.String r17 = defpackage.ivw.q(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0382:
            java.lang.String r16 = defpackage.ivw.q(r0, r2)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0393:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            java.util.ArrayList r15 = defpackage.ivw.c(r0, r2, r15)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0463
        L_0x03a4:
            android.os.Parcelable$Creator r14 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r14)
            r14 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r14 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r14
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x03ba:
            android.os.Parcelable$Creator r13 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            java.util.ArrayList r13 = defpackage.ivw.c(r0, r2, r13)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x03cd:
            int r12 = defpackage.ivw.g(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x03de:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            java.util.ArrayList r11 = defpackage.ivw.c(r0, r2, r11)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x03f1:
            java.lang.String r10 = defpackage.ivw.q(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0400:
            java.lang.String r9 = defpackage.ivw.q(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x040f:
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x041e:
            android.os.Parcelable$Creator r7 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r7)
            r7 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r7 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r7
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0432:
            java.util.ArrayList r6 = defpackage.ivw.C(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0441:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r5)
            r5 = r2
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r5 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r5
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
            goto L_0x0463
        L_0x0455:
            int r4 = defpackage.ivw.g(r0, r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r61
        L_0x0463:
            goto L_0x0070
        L_0x0465:
            int r2 = r63.dataPosition()
            if (r2 != r1) goto L_0x0474
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r0 = new com.google.android.gms.plus.internal.model.moments.ItemScopeEntity
            r2 = r0
            r15 = r61
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return r0
        L_0x0474:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x048e
        L_0x048d:
            throw r2
        L_0x048e:
            goto L_0x048d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywt.a(android.os.Parcel):com.google.android.gms.plus.internal.model.moments.ItemScopeEntity");
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ItemScopeEntity[i];
    }
}
