package defpackage;

/* renamed from: wsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wsp {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.ContentValues r23) {
        /*
            r0 = r23
            if (r0 == 0) goto L_0x0187
            java.lang.String r2 = "mimetype"
            java.lang.String r3 = r0.getAsString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0185
            java.lang.String r2 = r0.getAsString(r2)
            int r3 = r2.hashCode()
            r4 = 10
            r5 = 6
            r6 = 18
            r7 = 11
            r8 = 22
            r9 = 9
            r10 = 17
            r11 = 15
            r12 = 16
            r13 = 23
            r14 = 7
            r15 = 19
            r16 = 21
            r17 = 12
            r18 = 14
            r19 = 20
            r20 = 4
            r21 = 2
            r22 = 5
            r1 = 3
            switch(r3) {
                case -1729791444: goto L_0x0146;
                case -1569536764: goto L_0x013c;
                case -1328682538: goto L_0x0132;
                case -1207225626: goto L_0x0128;
                case -1079224304: goto L_0x011d;
                case -1079210633: goto L_0x0112;
                case -828105739: goto L_0x0107;
                case -601229436: goto L_0x00fc;
                case -335220302: goto L_0x00f2;
                case 3430506: goto L_0x00e7;
                case 94070761: goto L_0x00dc;
                case 456415478: goto L_0x00d0;
                case 684173810: goto L_0x00c4;
                case 689862072: goto L_0x00b8;
                case 905843021: goto L_0x00ac;
                case 950831081: goto L_0x00a0;
                case 1238509849: goto L_0x0094;
                case 1332665825: goto L_0x0088;
                case 1409846529: goto L_0x007c;
                case 1464444786: goto L_0x0071;
                case 1464725403: goto L_0x0066;
                case 1635852198: goto L_0x005a;
                case 1828520899: goto L_0x004e;
                case 2034973555: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0150
        L_0x0042:
            java.lang.String r3 = "vnd.android.cursor.item/nickname"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 13
            goto L_0x0151
        L_0x004e:
            java.lang.String r3 = "vnd.android.cursor.item/identity"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 8
            goto L_0x0151
        L_0x005a:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_jot"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 10
            goto L_0x0151
        L_0x0066:
            java.lang.String r3 = "vnd.android.cursor.item/group_membership"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 6
            goto L_0x0151
        L_0x0071:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_calendar_link"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 0
            goto L_0x0151
        L_0x007c:
            java.lang.String r3 = "vnd.android.cursor.item/relation"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 18
            goto L_0x0151
        L_0x0088:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_language"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 11
            goto L_0x0151
        L_0x0094:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_user_defined_field"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 22
            goto L_0x0151
        L_0x00a0:
            java.lang.String r3 = "vnd.android.cursor.item/im"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 9
            goto L_0x0151
        L_0x00ac:
            java.lang.String r3 = "vnd.android.cursor.item/photo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 17
            goto L_0x0151
        L_0x00b8:
            java.lang.String r3 = "vnd.android.cursor.item/organization"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 15
            goto L_0x0151
        L_0x00c4:
            java.lang.String r3 = "vnd.android.cursor.item/phone_v2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 16
            goto L_0x0151
        L_0x00d0:
            java.lang.String r3 = "vnd.android.cursor.item/website"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 23
            goto L_0x0151
        L_0x00dc:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_hobby"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 7
            goto L_0x0151
        L_0x00e7:
            java.lang.String r3 = "vnd.android.cursor.item/sip_address"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 19
            goto L_0x0151
        L_0x00f2:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_extended_property"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 3
            goto L_0x0151
        L_0x00fc:
            java.lang.String r3 = "vnd.android.cursor.item/postal-address_v2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 21
            goto L_0x0151
        L_0x0107:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_misc"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 12
            goto L_0x0151
        L_0x0112:
            java.lang.String r3 = "vnd.android.cursor.item/note"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 14
            goto L_0x0151
        L_0x011d:
            java.lang.String r3 = "vnd.android.cursor.item/name"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 20
            goto L_0x0151
        L_0x0128:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_external_id"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 4
            goto L_0x0151
        L_0x0132:
            java.lang.String r3 = "vnd.android.cursor.item/contact_event"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 2
            goto L_0x0151
        L_0x013c:
            java.lang.String r3 = "vnd.android.cursor.item/email_v2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 1
            goto L_0x0151
        L_0x0146:
            java.lang.String r3 = "vnd.com.google.cursor.item/contact_file_as"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0150
            r2 = 5
            goto L_0x0151
        L_0x0150:
            r2 = -1
        L_0x0151:
            switch(r2) {
                case 0: goto L_0x0184;
                case 1: goto L_0x0183;
                case 2: goto L_0x0175;
                case 3: goto L_0x0174;
                case 4: goto L_0x0171;
                case 5: goto L_0x0170;
                case 6: goto L_0x016f;
                case 7: goto L_0x016e;
                case 8: goto L_0x016d;
                case 9: goto L_0x016a;
                case 10: goto L_0x0169;
                case 11: goto L_0x0168;
                case 12: goto L_0x0167;
                case 13: goto L_0x0166;
                case 14: goto L_0x0165;
                case 15: goto L_0x0164;
                case 16: goto L_0x0163;
                case 17: goto L_0x0162;
                case 18: goto L_0x015f;
                case 19: goto L_0x015c;
                case 20: goto L_0x015b;
                case 21: goto L_0x015a;
                case 22: goto L_0x0159;
                case 23: goto L_0x0156;
                default: goto L_0x0154;
            }
        L_0x0154:
            r0 = 1
            return r0
        L_0x0156:
            r0 = 26
            return r0
        L_0x0159:
            return r20
        L_0x015a:
            return r13
        L_0x015b:
            return r10
        L_0x015c:
            r0 = 25
            return r0
        L_0x015f:
            r0 = 24
            return r0
        L_0x0162:
            return r8
        L_0x0163:
            return r16
        L_0x0164:
            return r19
        L_0x0165:
            return r15
        L_0x0166:
            return r6
        L_0x0167:
            return r12
        L_0x0168:
            return r11
        L_0x0169:
            return r18
        L_0x016a:
            r0 = 13
            return r0
        L_0x016d:
            return r17
        L_0x016e:
            return r7
        L_0x016f:
            return r4
        L_0x0170:
            return r9
        L_0x0171:
            r0 = 8
            return r0
        L_0x0174:
            return r14
        L_0x0175:
            java.lang.String r2 = "data2"
            java.lang.Integer r0 = r0.getAsInteger(r2)
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0182
            return r21
        L_0x0182:
            return r5
        L_0x0183:
            return r22
        L_0x0184:
            return r1
        L_0x0185:
            r0 = 1
            goto L_0x0188
        L_0x0187:
            r0 = 1
        L_0x0188:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsp.a(android.content.ContentValues):int");
    }
}
