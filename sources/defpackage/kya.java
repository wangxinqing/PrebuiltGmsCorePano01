package defpackage;

import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.File;

/* renamed from: kya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kya implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new File[i];
    }

    /* JADX WARNING: type inference failed for: r2v44, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v47, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v50, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v55, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v88, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v95, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v102, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r60) {
        /*
            r59 = this;
            r0 = r60
            int r1 = defpackage.ivw.b(r60)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 0
            r2 = 0
            r6 = 0
            r17 = r4
            r39 = r17
            r52 = r39
            r4 = r6
            r8 = r4
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r16 = r14
            r19 = r16
            r20 = r19
            r22 = r20
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
            r38 = r37
            r41 = r38
            r42 = r41
            r44 = r42
            r45 = r44
            r46 = r45
            r48 = r46
            r49 = r48
            r50 = r49
            r51 = r50
            r54 = r51
            r55 = r54
            r5 = 0
            r7 = 0
            r12 = 0
            r15 = 0
            r21 = 0
            r43 = 0
            r47 = 0
            r56 = 0
        L_0x0066:
            int r2 = r60.dataPosition()
            r57 = r15
            if (r2 >= r1) goto L_0x03f7
            int r2 = r60.readInt()
            int r58 = defpackage.ivw.a((int) r2)
            switch(r58) {
                case 2: goto L_0x03e7;
                case 3: goto L_0x03d8;
                case 4: goto L_0x03c9;
                case 5: goto L_0x0079;
                case 6: goto L_0x03ba;
                case 7: goto L_0x03ab;
                case 8: goto L_0x039b;
                case 9: goto L_0x0079;
                case 10: goto L_0x0079;
                case 11: goto L_0x038b;
                case 12: goto L_0x037a;
                case 13: goto L_0x0079;
                case 14: goto L_0x0369;
                case 15: goto L_0x0079;
                case 16: goto L_0x0358;
                case 17: goto L_0x0347;
                case 18: goto L_0x0338;
                case 19: goto L_0x0079;
                case 20: goto L_0x0327;
                case 21: goto L_0x0316;
                case 22: goto L_0x0079;
                case 23: goto L_0x0079;
                case 24: goto L_0x0305;
                case 25: goto L_0x02f4;
                case 26: goto L_0x02e3;
                case 27: goto L_0x0079;
                case 28: goto L_0x0079;
                case 29: goto L_0x0079;
                case 30: goto L_0x02d2;
                case 31: goto L_0x0079;
                case 32: goto L_0x02c1;
                case 33: goto L_0x0079;
                case 34: goto L_0x02aa;
                case 35: goto L_0x0079;
                case 36: goto L_0x0293;
                case 37: goto L_0x027c;
                case 38: goto L_0x0079;
                case 39: goto L_0x026b;
                case 40: goto L_0x0254;
                case 41: goto L_0x0079;
                case 42: goto L_0x0243;
                case 43: goto L_0x0232;
                case 44: goto L_0x0221;
                case 45: goto L_0x0210;
                case 46: goto L_0x0079;
                case 47: goto L_0x01ff;
                case 48: goto L_0x0079;
                case 49: goto L_0x01ee;
                case 50: goto L_0x01db;
                case 51: goto L_0x01c8;
                case 52: goto L_0x01b5;
                case 53: goto L_0x0079;
                case 54: goto L_0x01a2;
                case 55: goto L_0x0191;
                case 56: goto L_0x0079;
                case 57: goto L_0x0180;
                case 58: goto L_0x016f;
                case 59: goto L_0x0079;
                case 60: goto L_0x0079;
                case 61: goto L_0x0079;
                case 62: goto L_0x0079;
                case 63: goto L_0x015e;
                case 64: goto L_0x014d;
                case 65: goto L_0x0136;
                case 66: goto L_0x0079;
                case 67: goto L_0x0079;
                case 68: goto L_0x0125;
                case 69: goto L_0x0114;
                case 70: goto L_0x0079;
                case 71: goto L_0x00fd;
                case 72: goto L_0x00ec;
                case 73: goto L_0x00db;
                case 74: goto L_0x00c4;
                case 75: goto L_0x00b3;
                case 76: goto L_0x0079;
                case 77: goto L_0x00a2;
                case 78: goto L_0x0091;
                case 79: goto L_0x0080;
                default: goto L_0x0079;
            }
        L_0x0079:
            defpackage.ivw.b(r0, r2)
            r15 = r57
            goto L_0x03f5
        L_0x0080:
            boolean r56 = defpackage.ivw.c(r0, r2)
            r2 = 79
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0091:
            java.lang.String r55 = defpackage.ivw.q(r0, r2)
            r2 = 78
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x00a2:
            java.lang.String r54 = defpackage.ivw.q(r0, r2)
            r2 = 77
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x00b3:
            long r52 = defpackage.ivw.i(r0, r2)
            r2 = 75
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x00c4:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.Permission.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r51 = r2
            com.google.android.gms.drive.internal.model.Permission r51 = (com.google.android.gms.drive.internal.model.Permission) r51
            r2 = 74
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x00db:
            java.lang.String r50 = defpackage.ivw.q(r0, r2)
            r2 = 73
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x00ec:
            java.lang.String r49 = defpackage.ivw.q(r0, r2)
            r2 = 72
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x00fd:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.File.Thumbnail.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r48 = r2
            com.google.android.gms.drive.internal.model.File$Thumbnail r48 = (com.google.android.gms.drive.internal.model.File.Thumbnail) r48
            r2 = 71
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0114:
            boolean r47 = defpackage.ivw.c(r0, r2)
            r2 = 69
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0125:
            java.util.ArrayList r46 = defpackage.ivw.C(r0, r2)
            r2 = 68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0136:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.User.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r45 = r2
            com.google.android.gms.drive.internal.model.User r45 = (com.google.android.gms.drive.internal.model.User) r45
            r2 = 65
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x014d:
            java.lang.String r44 = defpackage.ivw.q(r0, r2)
            r2 = 64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x015e:
            boolean r43 = defpackage.ivw.c(r0, r2)
            r2 = 63
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x016f:
            java.lang.String r42 = defpackage.ivw.q(r0, r2)
            r2 = 58
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0180:
            java.lang.String r41 = defpackage.ivw.q(r0, r2)
            r2 = 57
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0191:
            long r39 = defpackage.ivw.i(r0, r2)
            r2 = 55
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x01a2:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.Property.CREATOR
            java.util.ArrayList r38 = defpackage.ivw.c(r0, r2, r15)
            r2 = 54
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x01b5:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.Permission.CREATOR
            java.util.ArrayList r37 = defpackage.ivw.c(r0, r2, r15)
            r2 = 52
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x01c8:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.ParentReference.CREATOR
            java.util.ArrayList r36 = defpackage.ivw.c(r0, r2, r15)
            r2 = 51
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x01db:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.User.CREATOR
            java.util.ArrayList r35 = defpackage.ivw.c(r0, r2, r15)
            r2 = 50
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x01ee:
            java.util.ArrayList r34 = defpackage.ivw.C(r0, r2)
            r2 = 49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x01ff:
            java.lang.String r33 = defpackage.ivw.q(r0, r2)
            r2 = 47
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0210:
            java.lang.String r32 = defpackage.ivw.q(r0, r2)
            r2 = 45
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0221:
            java.lang.String r31 = defpackage.ivw.q(r0, r2)
            r2 = 44
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0232:
            java.lang.String r30 = defpackage.ivw.q(r0, r2)
            r2 = 43
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0243:
            java.lang.String r29 = defpackage.ivw.q(r0, r2)
            r2 = 42
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0254:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.FileLocalId.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r28 = r2
            com.google.android.gms.drive.internal.model.FileLocalId r28 = (com.google.android.gms.drive.internal.model.FileLocalId) r28
            r2 = 40
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x026b:
            java.lang.String r27 = defpackage.ivw.q(r0, r2)
            r2 = 39
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x027c:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.User.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r26 = r2
            com.google.android.gms.drive.internal.model.User r26 = (com.google.android.gms.drive.internal.model.User) r26
            r2 = 37
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0293:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.File.Labels.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r25 = r2
            com.google.android.gms.drive.internal.model.File$Labels r25 = (com.google.android.gms.drive.internal.model.File.Labels) r25
            r2 = 36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x02aa:
            android.os.Parcelable$Creator r15 = com.google.android.gms.drive.internal.model.File.IndexableText.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r24 = r2
            com.google.android.gms.drive.internal.model.File$IndexableText r24 = (com.google.android.gms.drive.internal.model.File.IndexableText) r24
            r2 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x02c1:
            java.lang.String r23 = defpackage.ivw.q(r0, r2)
            r2 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x02d2:
            java.lang.String r22 = defpackage.ivw.q(r0, r2)
            r2 = 30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x02e3:
            boolean r21 = defpackage.ivw.c(r0, r2)
            r2 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x02f4:
            java.util.ArrayList r20 = defpackage.ivw.C(r0, r2)
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0305:
            java.lang.String r19 = defpackage.ivw.q(r0, r2)
            r2 = 24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0316:
            long r17 = defpackage.ivw.i(r0, r2)
            r2 = 21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0327:
            java.lang.String r16 = defpackage.ivw.q(r0, r2)
            r2 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0338:
            boolean r15 = defpackage.ivw.c(r0, r2)
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x03f5
        L_0x0347:
            java.lang.String r14 = defpackage.ivw.q(r0, r2)
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0358:
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x0369:
            boolean r12 = defpackage.ivw.c(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x037a:
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x038b:
            java.lang.String r10 = defpackage.ivw.q(r0, r2)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x039b:
            java.lang.String r9 = defpackage.ivw.q(r0, r2)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x03ab:
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x03ba:
            boolean r7 = defpackage.ivw.c(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x03c9:
            java.util.ArrayList r6 = defpackage.ivw.C(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x03d8:
            boolean r5 = defpackage.ivw.c(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
            goto L_0x03f5
        L_0x03e7:
            java.lang.String r4 = defpackage.ivw.q(r0, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r57
        L_0x03f5:
            goto L_0x0066
        L_0x03f7:
            int r2 = r60.dataPosition()
            if (r2 != r1) goto L_0x0406
            com.google.android.gms.drive.internal.model.File r0 = new com.google.android.gms.drive.internal.model.File
            r2 = r0
            r15 = r57
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r55, r56)
            return r0
        L_0x0406:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0420
        L_0x041f:
            throw r2
        L_0x0420:
            goto L_0x041f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kya.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
