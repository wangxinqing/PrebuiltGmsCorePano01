package defpackage;

/* renamed from: alkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkn {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0302, code lost:
        if (r0.equals("directionsStartPage") != false) goto L_0x0328;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atcv a(com.google.android.ulr.ApiPlaceReportPayload r21) {
        /*
            if (r21 == 0) goto L_0x0905
            atcv r1 = defpackage.atcv.d
            aucd r1 = r1.o()
            com.google.android.ulr.GmmPlaceReportPayload r2 = r21.getGmmPlaceReportPayload()
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 4
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x06be
            com.google.android.ulr.GmmPlaceReportPayload r2 = r21.getGmmPlaceReportPayload()
            if (r2 == 0) goto L_0x06a4
            atay r10 = defpackage.atay.j
            aucd r10 = r10.o()
            java.lang.String r11 = r2.e()
            r16 = 15
            r17 = 14
            r3 = 9
            r18 = 16
            r13 = 7
            r14 = 6
            r15 = 8
            if (r11 == 0) goto L_0x0223
            java.lang.String r11 = r2.e()
            int r20 = r11.hashCode()
            switch(r20) {
                case -2035376383: goto L_0x0113;
                case -1906603524: goto L_0x0108;
                case -1818645997: goto L_0x00fe;
                case -1808561682: goto L_0x00f3;
                case -1801832945: goto L_0x00e8;
                case -1354735856: goto L_0x00dd;
                case -1343228816: goto L_0x00d3;
                case -1073479836: goto L_0x00c8;
                case -950812254: goto L_0x00bd;
                case -896366576: goto L_0x00b2;
                case -292058943: goto L_0x00a7;
                case -236494164: goto L_0x009b;
                case 36600230: goto L_0x008f;
                case 618279126: goto L_0x0083;
                case 984714029: goto L_0x0077;
                case 1050898228: goto L_0x006c;
                case 1499951481: goto L_0x0061;
                case 1631683279: goto L_0x0056;
                case 1776143909: goto L_0x004b;
                case 2128366947: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x011e
        L_0x003f:
            java.lang.String r0 = "notHere"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 9
            goto L_0x011f
        L_0x004b:
            java.lang.String r0 = "UNKNOWN_EVENT"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 0
            goto L_0x011f
        L_0x0056:
            java.lang.String r0 = "PLACE_PICKER_CLICK"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 2
            goto L_0x011f
        L_0x0061:
            java.lang.String r0 = "placePickerSuggestClick"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 5
            goto L_0x011f
        L_0x006c:
            java.lang.String r0 = "PLACE_PICKER_SUGGEST_CLICK"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 4
            goto L_0x011f
        L_0x0077:
            java.lang.String r0 = "placeSheetPhotoUploadClick"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 11
            goto L_0x011f
        L_0x0083:
            java.lang.String r0 = "placeSheetSavePlaceClick"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 13
            goto L_0x011f
        L_0x008f:
            java.lang.String r0 = "PLACE_SHEET_SAVE_PLACE_CLICK"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 12
            goto L_0x011f
        L_0x009b:
            java.lang.String r0 = "hereNotificationClicked"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 17
            goto L_0x011f
        L_0x00a7:
            java.lang.String r0 = "placeClick"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 7
            goto L_0x011f
        L_0x00b2:
            java.lang.String r0 = "PLACE_CLICK"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 6
            goto L_0x011f
        L_0x00bd:
            java.lang.String r0 = "HERE_NOTIFICATION_CLICKED"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 16
            goto L_0x011f
        L_0x00c8:
            java.lang.String r0 = "HERE_NOTIFICATION_DISMISSED"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 18
            goto L_0x011f
        L_0x00d3:
            java.lang.String r0 = "unknownEvent"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 1
            goto L_0x011f
        L_0x00dd:
            java.lang.String r0 = "placeSheetOtherClick"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 15
            goto L_0x011f
        L_0x00e8:
            java.lang.String r0 = "PLACE_SHEET_PHOTO_UPLOAD_CLICK"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 10
            goto L_0x011f
        L_0x00f3:
            java.lang.String r0 = "hereNotificationDismissed"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 19
            goto L_0x011f
        L_0x00fe:
            java.lang.String r0 = "placePickerClick"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 3
            goto L_0x011f
        L_0x0108:
            java.lang.String r0 = "NOT_HERE"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 8
            goto L_0x011f
        L_0x0113:
            java.lang.String r0 = "PLACE_SHEET_OTHER_CLICK"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011e
            r0 = 14
            goto L_0x011f
        L_0x011e:
            r0 = -1
        L_0x011f:
            switch(r0) {
                case 0: goto L_0x0205;
                case 1: goto L_0x0205;
                case 2: goto L_0x01ef;
                case 3: goto L_0x01ef;
                case 4: goto L_0x01d9;
                case 5: goto L_0x01d9;
                case 6: goto L_0x01c3;
                case 7: goto L_0x01c3;
                case 8: goto L_0x01ad;
                case 9: goto L_0x01ad;
                case 10: goto L_0x0196;
                case 11: goto L_0x0196;
                case 12: goto L_0x017f;
                case 13: goto L_0x017f;
                case 14: goto L_0x0168;
                case 15: goto L_0x0168;
                case 16: goto L_0x0151;
                case 17: goto L_0x0151;
                case 18: goto L_0x013b;
                case 19: goto L_0x013b;
                default: goto L_0x0122;
            }
        L_0x0122:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.e()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.GmmPlaceReportPayload.user_event "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x021b
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x021f
        L_0x013b:
            boolean r0 = r10.c
            if (r0 == 0) goto L_0x0144
            r10.c()
            r10.c = r9
        L_0x0144:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r3
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x0151:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x0156
            goto L_0x015b
        L_0x0156:
            r10.c()
            r10.c = r9
        L_0x015b:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r15
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x0168:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x016d
            goto L_0x0172
        L_0x016d:
            r10.c()
            r10.c = r9
        L_0x0172:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r13
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x017f:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x0184
            goto L_0x0189
        L_0x0184:
            r10.c()
            r10.c = r9
        L_0x0189:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r14
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x0196:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x019b
            goto L_0x01a0
        L_0x019b:
            r10.c()
            r10.c = r9
        L_0x01a0:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r4
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x01ad:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            r10.c()
            r10.c = r9
        L_0x01b7:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r8
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x01c3:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x01c8
            goto L_0x01cd
        L_0x01c8:
            r10.c()
            r10.c = r9
        L_0x01cd:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r7
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x01d9:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x01de
            goto L_0x01e3
        L_0x01de:
            r10.c()
            r10.c = r9
        L_0x01e3:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r5
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x01ef:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x01f4
            goto L_0x01f9
        L_0x01f4:
            r10.c()
            r10.c = r9
        L_0x01f9:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r6
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x0205:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x020a
            goto L_0x020f
        L_0x020a:
            r10.c()
            r10.c = r9
        L_0x020f:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.b = r9
            int r11 = r0.a
            r11 = r11 | r8
            r0.a = r11
            goto L_0x0223
        L_0x021b:
            java.lang.String r1 = r2.concat(r1)
        L_0x021f:
            r0.<init>(r1)
            throw r0
        L_0x0223:
            java.lang.Integer r0 = r2.f()
            if (r0 == 0) goto L_0x0246
            java.lang.Integer r0 = r2.f()
            int r0 = r0.intValue()
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0236
            goto L_0x023b
        L_0x0236:
            r10.c()
            r10.c = r9
        L_0x023b:
            aucj r11 = r10.b
            atay r11 = (defpackage.atay) r11
            int r3 = r11.a
            r3 = r3 | r6
            r11.a = r3
            r11.c = r0
        L_0x0246:
            java.lang.String r0 = r2.b()
            if (r0 == 0) goto L_0x0415
            java.lang.String r0 = r2.b()
            int r3 = r0.hashCode()
            switch(r3) {
                case -2101268368: goto L_0x031b;
                case -2076560469: goto L_0x0310;
                case -1538534651: goto L_0x0305;
                case -763658339: goto L_0x02fc;
                case -753209043: goto L_0x02f1;
                case -515205961: goto L_0x02e6;
                case -194652550: goto L_0x02db;
                case -24667643: goto L_0x02d0;
                case 171963707: goto L_0x02c5;
                case 181903132: goto L_0x02b9;
                case 580074002: goto L_0x02ad;
                case 723670740: goto L_0x02a1;
                case 818142540: goto L_0x0295;
                case 818885846: goto L_0x0289;
                case 948293689: goto L_0x027d;
                case 1140131261: goto L_0x0271;
                case 1728998849: goto L_0x0265;
                case 2003505403: goto L_0x0259;
                default: goto L_0x0257;
            }
        L_0x0257:
            goto L_0x0326
        L_0x0259:
            java.lang.String r3 = "placePageSaveCurrentLocation"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 17
            goto L_0x0328
        L_0x0265:
            java.lang.String r3 = "placePickerButtonClick"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 5
            goto L_0x0328
        L_0x0271:
            java.lang.String r3 = "PLACE_PAGE_NOT_HERE_CLICK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 10
            goto L_0x0328
        L_0x027d:
            java.lang.String r3 = "blueDotClick"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 3
            goto L_0x0328
        L_0x0289:
            java.lang.String r3 = "hereNotificationShown"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 13
            goto L_0x0328
        L_0x0295:
            java.lang.String r3 = "HERE_NOTIFICATION_SHOWN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 12
            goto L_0x0328
        L_0x02a1:
            java.lang.String r3 = "PLACE_PICKER_BUTTON_CLICK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 4
            goto L_0x0328
        L_0x02ad:
            java.lang.String r3 = "GUIDE_PAGE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 6
            goto L_0x0328
        L_0x02b9:
            java.lang.String r3 = "highConfidenceClick"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 9
            goto L_0x0328
        L_0x02c5:
            java.lang.String r3 = "placePageNotHereClick"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 11
            goto L_0x0328
        L_0x02d0:
            java.lang.String r3 = "unknownContext"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 1
            goto L_0x0328
        L_0x02db:
            java.lang.String r3 = "UNKNOWN_CONTEXT"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 0
            goto L_0x0328
        L_0x02e6:
            java.lang.String r3 = "DIRECTIONS_START_PAGE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 14
            goto L_0x0328
        L_0x02f1:
            java.lang.String r3 = "BLUE_DOT_CLICK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 2
            goto L_0x0328
        L_0x02fc:
            java.lang.String r3 = "directionsStartPage"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            goto L_0x0328
        L_0x0305:
            java.lang.String r3 = "PLACE_PAGE_SAVE_CURRENT_LOCATION"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 16
            goto L_0x0328
        L_0x0310:
            java.lang.String r3 = "guidePage"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 7
            goto L_0x0328
        L_0x031b:
            java.lang.String r3 = "HIGH_CONFIDENCE_CLICK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0326
            r16 = 8
            goto L_0x0328
        L_0x0326:
            r16 = -1
        L_0x0328:
            switch(r16) {
                case 0: goto L_0x03f7;
                case 1: goto L_0x03f7;
                case 2: goto L_0x03e1;
                case 3: goto L_0x03e1;
                case 4: goto L_0x03cb;
                case 5: goto L_0x03cb;
                case 6: goto L_0x03b5;
                case 7: goto L_0x03b5;
                case 8: goto L_0x039f;
                case 9: goto L_0x039f;
                case 10: goto L_0x0388;
                case 11: goto L_0x0388;
                case 12: goto L_0x0371;
                case 13: goto L_0x0371;
                case 14: goto L_0x035a;
                case 15: goto L_0x035a;
                case 16: goto L_0x0344;
                case 17: goto L_0x0344;
                default: goto L_0x032b;
            }
        L_0x032b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.b()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.GmmPlaceReportPayload.context "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x040d
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0411
        L_0x0344:
            boolean r0 = r10.c
            if (r0 == 0) goto L_0x034d
            r10.c()
            r10.c = r9
        L_0x034d:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r15
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x035a:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x035f
            goto L_0x0364
        L_0x035f:
            r10.c()
            r10.c = r9
        L_0x0364:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r13
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x0371:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x0376
            goto L_0x037b
        L_0x0376:
            r10.c()
            r10.c = r9
        L_0x037b:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r14
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x0388:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x038d
            goto L_0x0392
        L_0x038d:
            r10.c()
            r10.c = r9
        L_0x0392:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r4
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x039f:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x03a4
            goto L_0x03a9
        L_0x03a4:
            r10.c()
            r10.c = r9
        L_0x03a9:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r7
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x03b5:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x03ba
            goto L_0x03bf
        L_0x03ba:
            r10.c()
            r10.c = r9
        L_0x03bf:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r5
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x03cb:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x03d0
            goto L_0x03d5
        L_0x03d0:
            r10.c()
            r10.c = r9
        L_0x03d5:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r6
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x03e1:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x03e6
            goto L_0x03eb
        L_0x03e6:
            r10.c()
            r10.c = r9
        L_0x03eb:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r8
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x03f7:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x03fc
            goto L_0x0401
        L_0x03fc:
            r10.c()
            r10.c = r9
        L_0x0401:
            aucj r0 = r10.b
            atay r0 = (defpackage.atay) r0
            r0.d = r9
            int r3 = r0.a
            r3 = r3 | r7
            r0.a = r3
            goto L_0x0415
        L_0x040d:
            java.lang.String r1 = r2.concat(r1)
        L_0x0411:
            r0.<init>(r1)
            throw r0
        L_0x0415:
            com.google.android.ulr.GmmPlaceReportPayloadSnapToPlaceRequest r0 = r2.getSnapToPlaceRequest()
            if (r0 == 0) goto L_0x046d
            com.google.android.ulr.GmmPlaceReportPayloadSnapToPlaceRequest r0 = r2.getSnapToPlaceRequest()
            if (r0 == 0) goto L_0x0454
            atav r3 = defpackage.atav.c
            aucd r3 = r3.o()
            com.google.android.ulr.LocationDescriptor r11 = r0.getQueryLocation()
            if (r11 == 0) goto L_0x044d
            com.google.android.ulr.LocationDescriptor r0 = r0.getQueryLocation()
            aujb r0 = defpackage.alku.a(r0)
            boolean r11 = r3.c
            if (r11 != 0) goto L_0x043a
            goto L_0x043f
        L_0x043a:
            r3.c()
            r3.c = r9
        L_0x043f:
            aucj r11 = r3.b
            atav r11 = (defpackage.atav) r11
            r0.getClass()
            r11.b = r0
            int r0 = r11.a
            r0 = r0 | r8
            r11.a = r0
        L_0x044d:
            aucj r0 = r3.i()
            atav r0 = (defpackage.atav) r0
            goto L_0x0455
        L_0x0454:
            r0 = 0
        L_0x0455:
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x045a
            goto L_0x045f
        L_0x045a:
            r10.c()
            r10.c = r9
        L_0x045f:
            aucj r3 = r10.b
            atay r3 = (defpackage.atay) r3
            r0.getClass()
            r3.e = r0
            int r0 = r3.a
            r0 = r0 | r15
            r3.a = r0
        L_0x046d:
            java.lang.String r0 = r2.c()
            if (r0 == 0) goto L_0x0490
            java.lang.String r0 = r2.c()
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x047c
            goto L_0x0481
        L_0x047c:
            r10.c()
            r10.c = r9
        L_0x0481:
            aucj r3 = r10.b
            atay r3 = (defpackage.atay) r3
            r0.getClass()
            int r11 = r3.a
            r11 = r11 | 16
            r3.a = r11
            r3.f = r0
        L_0x0490:
            java.util.ArrayList r0 = r2.getSnapToPlaceResults()
            if (r0 == 0) goto L_0x0528
            java.util.ArrayList r0 = r2.getSnapToPlaceResults()
            int r3 = r0.size()
            r11 = 0
        L_0x049f:
            if (r11 >= r3) goto L_0x0528
            java.lang.Object r13 = r0.get(r11)
            com.google.android.ulr.GmmPlaceReportPayloadSnapToPlaceResult r13 = (com.google.android.ulr.GmmPlaceReportPayloadSnapToPlaceResult) r13
            if (r13 == 0) goto L_0x0523
            ataw r14 = defpackage.ataw.d
            aucd r14 = r14.o()
            com.google.android.ulr.FeatureIdProto r15 = r13.getFeatureId()
            if (r15 == 0) goto L_0x04d4
            com.google.android.ulr.FeatureIdProto r15 = r13.getFeatureId()
            auip r15 = defpackage.alkq.a(r15)
            boolean r4 = r14.c
            if (r4 == 0) goto L_0x04c6
            r14.c()
            r14.c = r9
        L_0x04c6:
            aucj r4 = r14.b
            ataw r4 = (defpackage.ataw) r4
            r15.getClass()
            r4.b = r15
            int r15 = r4.a
            r15 = r15 | r8
            r4.a = r15
        L_0x04d4:
            java.lang.Integer r4 = r13.b()
            if (r4 == 0) goto L_0x04f7
            java.lang.Integer r4 = r13.b()
            int r4 = r4.intValue()
            boolean r13 = r14.c
            if (r13 != 0) goto L_0x04e7
            goto L_0x04ec
        L_0x04e7:
            r14.c()
            r14.c = r9
        L_0x04ec:
            aucj r13 = r14.b
            ataw r13 = (defpackage.ataw) r13
            int r15 = r13.a
            r15 = r15 | r6
            r13.a = r15
            r13.c = r4
        L_0x04f7:
            aucj r4 = r14.i()
            ataw r4 = (defpackage.ataw) r4
            boolean r13 = r10.c
            if (r13 != 0) goto L_0x0502
            goto L_0x0507
        L_0x0502:
            r10.c()
            r10.c = r9
        L_0x0507:
            aucj r13 = r10.b
            atay r13 = (defpackage.atay) r13
            r4.getClass()
            aucx r14 = r13.g
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x051e
            aucx r14 = r13.g
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r13.g = r14
        L_0x051e:
            aucx r13 = r13.g
            r13.add(r4)
        L_0x0523:
            int r11 = r11 + 1
            r4 = 5
            goto L_0x049f
        L_0x0528:
            com.google.android.ulr.GmmPlaceReportPayloadNotificationInfo r0 = r2.getNotificationInfo()
            if (r0 == 0) goto L_0x0666
            com.google.android.ulr.GmmPlaceReportPayloadNotificationInfo r0 = r2.getNotificationInfo()
            if (r0 == 0) goto L_0x064c
            atau r3 = defpackage.atau.d
            aucd r3 = r3.o()
            com.google.android.ulr.LocationDescriptor r4 = r0.getLocation()
            if (r4 == 0) goto L_0x0560
            com.google.android.ulr.LocationDescriptor r4 = r0.getLocation()
            aujb r4 = defpackage.alku.a(r4)
            boolean r11 = r3.c
            if (r11 != 0) goto L_0x054d
            goto L_0x0552
        L_0x054d:
            r3.c()
            r3.c = r9
        L_0x0552:
            aucj r11 = r3.b
            atau r11 = (defpackage.atau) r11
            r4.getClass()
            r11.b = r4
            int r4 = r11.a
            r4 = r4 | r8
            r11.a = r4
        L_0x0560:
            java.util.ArrayList r4 = r0.getNotificationDetails()
            if (r4 == 0) goto L_0x0645
            java.util.ArrayList r0 = r0.getNotificationDetails()
            int r4 = r0.size()
            r11 = 0
        L_0x056f:
            if (r11 < r4) goto L_0x0573
            goto L_0x0645
        L_0x0573:
            java.lang.Object r13 = r0.get(r11)
            com.google.android.ulr.GmmPlaceReportPayloadNotificationDetails r13 = (com.google.android.ulr.GmmPlaceReportPayloadNotificationDetails) r13
            if (r13 == 0) goto L_0x063d
            atat r14 = defpackage.atat.e
            aucd r14 = r14.o()
            com.google.android.ulr.FeatureIdProto r15 = r13.getFeatureId()
            if (r15 == 0) goto L_0x05a7
            com.google.android.ulr.FeatureIdProto r15 = r13.getFeatureId()
            auip r15 = defpackage.alkq.a(r15)
            boolean r7 = r14.c
            if (r7 != 0) goto L_0x0594
            goto L_0x0599
        L_0x0594:
            r14.c()
            r14.c = r9
        L_0x0599:
            aucj r7 = r14.b
            atat r7 = (defpackage.atat) r7
            r15.getClass()
            r7.b = r15
            int r15 = r7.a
            r15 = r15 | r8
            r7.a = r15
        L_0x05a7:
            java.util.ArrayList r7 = r13.c()
            if (r7 == 0) goto L_0x05ee
            java.util.ArrayList r7 = r13.c()
            int r15 = r7.size()
            r5 = 0
        L_0x05b6:
            if (r5 >= r15) goto L_0x05ee
            java.lang.Object r19 = r7.get(r5)
            r8 = r19
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x05c3
            goto L_0x05e9
        L_0x05c3:
            boolean r12 = r14.c
            if (r12 != 0) goto L_0x05c8
            goto L_0x05cd
        L_0x05c8:
            r14.c()
            r14.c = r9
        L_0x05cd:
            aucj r12 = r14.b
            atat r12 = (defpackage.atat) r12
            r8.getClass()
            aucx r6 = r12.c
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x05e4
            aucx r6 = r12.c
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r12.c = r6
        L_0x05e4:
            aucx r6 = r12.c
            r6.add(r8)
        L_0x05e9:
            int r5 = r5 + 1
            r6 = 2
            r8 = 1
            goto L_0x05b6
        L_0x05ee:
            java.lang.String r5 = r13.b()
            if (r5 == 0) goto L_0x0611
            java.lang.String r5 = r13.b()
            boolean r6 = r14.c
            if (r6 != 0) goto L_0x05fd
            goto L_0x0602
        L_0x05fd:
            r14.c()
            r14.c = r9
        L_0x0602:
            aucj r6 = r14.b
            atat r6 = (defpackage.atat) r6
            r5.getClass()
            int r7 = r6.a
            r8 = 2
            r7 = r7 | r8
            r6.a = r7
            r6.d = r5
        L_0x0611:
            aucj r5 = r14.i()
            atat r5 = (defpackage.atat) r5
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x061c
            goto L_0x0621
        L_0x061c:
            r3.c()
            r3.c = r9
        L_0x0621:
            aucj r6 = r3.b
            atau r6 = (defpackage.atau) r6
            r5.getClass()
            aucx r7 = r6.c
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0638
            aucx r7 = r6.c
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r6.c = r7
        L_0x0638:
            aucx r6 = r6.c
            r6.add(r5)
        L_0x063d:
            int r11 = r11 + 1
            r5 = 3
            r6 = 2
            r7 = 4
            r8 = 1
            goto L_0x056f
        L_0x0645:
            aucj r0 = r3.i()
            atau r0 = (defpackage.atau) r0
            goto L_0x064d
        L_0x064c:
            r0 = 0
        L_0x064d:
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x0652
            goto L_0x0657
        L_0x0652:
            r10.c()
            r10.c = r9
        L_0x0657:
            aucj r3 = r10.b
            atay r3 = (defpackage.atay) r3
            r0.getClass()
            r3.h = r0
            int r0 = r3.a
            r0 = r0 | 32
            r3.a = r0
        L_0x0666:
            java.lang.String r0 = r2.d()
            if (r0 == 0) goto L_0x069d
            java.lang.String r0 = r2.d()     // Catch:{ IllegalArgumentException -> 0x0694 }
            r2 = 10
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ IllegalArgumentException -> 0x0694 }
            auay r0 = defpackage.auay.a((byte[]) r0)     // Catch:{ IllegalArgumentException -> 0x0694 }
            boolean r2 = r10.c     // Catch:{ IllegalArgumentException -> 0x0694 }
            if (r2 != 0) goto L_0x067f
            goto L_0x0684
        L_0x067f:
            r10.c()     // Catch:{ IllegalArgumentException -> 0x0694 }
            r10.c = r9     // Catch:{ IllegalArgumentException -> 0x0694 }
        L_0x0684:
            aucj r2 = r10.b     // Catch:{ IllegalArgumentException -> 0x0694 }
            atay r2 = (defpackage.atay) r2     // Catch:{ IllegalArgumentException -> 0x0694 }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0694 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0694 }
            r3 = r3 | 64
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0694 }
            r2.i = r0     // Catch:{ IllegalArgumentException -> 0x0694 }
            goto L_0x069d
        L_0x0694:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Json2LiteBadBase64 userlocation.GmmPlaceReportPayload.experiment_info"
            r1.<init>(r2, r0)
            throw r1
        L_0x069d:
            aucj r0 = r10.i()
            atay r0 = (defpackage.atay) r0
            goto L_0x06a5
        L_0x06a4:
            r0 = 0
        L_0x06a5:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x06aa
            goto L_0x06af
        L_0x06aa:
            r1.c()
            r1.c = r9
        L_0x06af:
            aucj r2 = r1.b
            atcv r2 = (defpackage.atcv) r2
            r0.getClass()
            r2.b = r0
            int r0 = r2.a
            r3 = 1
            r0 = r0 | r3
            r2.a = r0
        L_0x06be:
            com.google.android.ulr.WalletPlaceReportPayload r0 = r21.getWalletPlaceReportPayload()
            if (r0 == 0) goto L_0x08fe
            com.google.android.ulr.WalletPlaceReportPayload r0 = r21.getWalletPlaceReportPayload()
            if (r0 == 0) goto L_0x08e4
            ates r2 = defpackage.ates.f
            aucd r2 = r2.o()
            java.lang.String r3 = r0.b()
            if (r3 == 0) goto L_0x0794
            java.lang.String r3 = r0.b()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1932830611: goto L_0x0714;
                case -1720327473: goto L_0x070a;
                case -1305665556: goto L_0x0700;
                case -1048528392: goto L_0x06f6;
                case -564776905: goto L_0x06ec;
                case -225423121: goto L_0x06e2;
                default: goto L_0x06e1;
            }
        L_0x06e1:
            goto L_0x071e
        L_0x06e2:
            java.lang.String r4 = "INSTORE_TRANSACTION_NOTIFICATION"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x071e
            r3 = 4
            goto L_0x071f
        L_0x06ec:
            java.lang.String r4 = "UNKNOWN_WALLET_USER_EVENT"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x071e
            r3 = 0
            goto L_0x071f
        L_0x06f6:
            java.lang.String r4 = "nfcTap"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x071e
            r3 = 3
            goto L_0x071f
        L_0x0700:
            java.lang.String r4 = "unknownWalletUserEvent"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x071e
            r3 = 1
            goto L_0x071f
        L_0x070a:
            java.lang.String r4 = "NFC_TAP"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x071e
            r3 = 2
            goto L_0x071f
        L_0x0714:
            java.lang.String r4 = "instoreTransactionNotification"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x071e
            r3 = 5
            goto L_0x071f
        L_0x071e:
            r3 = -1
        L_0x071f:
            if (r3 == 0) goto L_0x077e
            r4 = 1
            if (r3 == r4) goto L_0x077e
            r4 = 2
            if (r3 == r4) goto L_0x0767
            r4 = 3
            if (r3 == r4) goto L_0x0767
            r4 = 4
            if (r3 == r4) goto L_0x0750
            r4 = 5
            if (r3 == r4) goto L_0x0750
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.b()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.WalletPlaceReportPayload.user_event "
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0748
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x074c
        L_0x0748:
            java.lang.String r0 = r2.concat(r0)
        L_0x074c:
            r1.<init>(r0)
            throw r1
        L_0x0750:
            boolean r3 = r2.c
            if (r3 == 0) goto L_0x0759
            r2.c()
            r2.c = r9
        L_0x0759:
            aucj r3 = r2.b
            ates r3 = (defpackage.ates) r3
            r4 = 2
            r3.b = r4
            int r4 = r3.a
            r5 = 1
            r4 = r4 | r5
            r3.a = r4
            goto L_0x0794
        L_0x0767:
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x076c
            goto L_0x0771
        L_0x076c:
            r2.c()
            r2.c = r9
        L_0x0771:
            aucj r3 = r2.b
            ates r3 = (defpackage.ates) r3
            r4 = 1
            r3.b = r4
            int r5 = r3.a
            r5 = r5 | r4
            r3.a = r5
            goto L_0x0794
        L_0x077e:
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0783
            goto L_0x0788
        L_0x0783:
            r2.c()
            r2.c = r9
        L_0x0788:
            aucj r3 = r2.b
            ates r3 = (defpackage.ates) r3
            r3.b = r9
            int r4 = r3.a
            r5 = 1
            r4 = r4 | r5
            r3.a = r4
        L_0x0794:
            com.google.android.ulr.WalletUserEventId r3 = r0.getEventId()
            if (r3 == 0) goto L_0x07ea
            com.google.android.ulr.WalletUserEventId r3 = r0.getEventId()
            if (r3 == 0) goto L_0x07d0
            atet r4 = defpackage.atet.c
            aucd r4 = r4.o()
            java.lang.String r5 = r3.b()
            if (r5 == 0) goto L_0x07c9
            java.lang.String r3 = r3.b()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x07b5
            goto L_0x07ba
        L_0x07b5:
            r4.c()
            r4.c = r9
        L_0x07ba:
            aucj r5 = r4.b
            atet r5 = (defpackage.atet) r5
            r3.getClass()
            int r6 = r5.a
            r7 = 1
            r6 = r6 | r7
            r5.a = r6
            r5.b = r3
        L_0x07c9:
            aucj r3 = r4.i()
            atet r3 = (defpackage.atet) r3
            goto L_0x07d1
        L_0x07d0:
            r3 = 0
        L_0x07d1:
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x07d6
            goto L_0x07db
        L_0x07d6:
            r2.c()
            r2.c = r9
        L_0x07db:
            aucj r4 = r2.b
            ates r4 = (defpackage.ates) r4
            r3.getClass()
            r4.c = r3
            int r3 = r4.a
            r5 = 2
            r3 = r3 | r5
            r4.a = r3
        L_0x07ea:
            com.google.android.ulr.WalletPlaceReportPayloadInstoreTransactionDetails r3 = r0.getInstoreTransactionDetails()
            if (r3 == 0) goto L_0x0841
            com.google.android.ulr.WalletPlaceReportPayloadInstoreTransactionDetails r3 = r0.getInstoreTransactionDetails()
            if (r3 == 0) goto L_0x0827
            atep r4 = defpackage.atep.c
            aucd r4 = r4.o()
            java.lang.Long r5 = r3.b()
            if (r5 == 0) goto L_0x0820
            java.lang.Long r3 = r3.b()
            long r5 = r3.longValue()
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x080f
            goto L_0x0814
        L_0x080f:
            r4.c()
            r4.c = r9
        L_0x0814:
            aucj r3 = r4.b
            atep r3 = (defpackage.atep) r3
            int r7 = r3.a
            r8 = 1
            r7 = r7 | r8
            r3.a = r7
            r3.b = r5
        L_0x0820:
            aucj r3 = r4.i()
            atep r3 = (defpackage.atep) r3
            goto L_0x0828
        L_0x0827:
            r3 = 0
        L_0x0828:
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x082d
            goto L_0x0832
        L_0x082d:
            r2.c()
            r2.c = r9
        L_0x0832:
            aucj r4 = r2.b
            ates r4 = (defpackage.ates) r4
            r3.getClass()
            r4.d = r3
            int r3 = r4.a
            r5 = 4
            r3 = r3 | r5
            r4.a = r3
        L_0x0841:
            java.util.ArrayList r3 = r0.getPlaceLikelihoodBuffers()
            if (r3 == 0) goto L_0x08dd
            java.util.ArrayList r0 = r0.getPlaceLikelihoodBuffers()
            int r3 = r0.size()
            r4 = 0
        L_0x0850:
            if (r4 < r3) goto L_0x0854
            goto L_0x08dd
        L_0x0854:
            java.lang.Object r5 = r0.get(r4)
            com.google.android.ulr.WalletPlaceReportPayloadPlaceIdLikelihood r5 = (com.google.android.ulr.WalletPlaceReportPayloadPlaceIdLikelihood) r5
            if (r5 == 0) goto L_0x08d8
            ateq r6 = defpackage.ateq.d
            aucd r6 = r6.o()
            java.lang.String r7 = r5.c()
            if (r7 == 0) goto L_0x0886
            java.lang.String r7 = r5.c()
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x0871
            goto L_0x0876
        L_0x0871:
            r6.c()
            r6.c = r9
        L_0x0876:
            aucj r8 = r6.b
            ateq r8 = (defpackage.ateq) r8
            r7.getClass()
            int r10 = r8.a
            r11 = 1
            r10 = r10 | r11
            r8.a = r10
            r8.b = r7
            goto L_0x0887
        L_0x0886:
            r11 = 1
        L_0x0887:
            java.lang.Float r7 = r5.b()
            if (r7 == 0) goto L_0x08ab
            java.lang.Float r5 = r5.b()
            float r5 = r5.floatValue()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x089a
            goto L_0x089f
        L_0x089a:
            r6.c()
            r6.c = r9
        L_0x089f:
            aucj r7 = r6.b
            ateq r7 = (defpackage.ateq) r7
            int r8 = r7.a
            r10 = 2
            r8 = r8 | r10
            r7.a = r8
            r7.c = r5
        L_0x08ab:
            aucj r5 = r6.i()
            ateq r5 = (defpackage.ateq) r5
            boolean r6 = r2.c
            if (r6 != 0) goto L_0x08b6
            goto L_0x08bb
        L_0x08b6:
            r2.c()
            r2.c = r9
        L_0x08bb:
            aucj r6 = r2.b
            ates r6 = (defpackage.ates) r6
            r5.getClass()
            aucx r7 = r6.e
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x08d2
            aucx r7 = r6.e
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r6.e = r7
        L_0x08d2:
            aucx r6 = r6.e
            r6.add(r5)
            goto L_0x08d9
        L_0x08d8:
            r11 = 1
        L_0x08d9:
            int r4 = r4 + 1
            goto L_0x0850
        L_0x08dd:
            aucj r0 = r2.i()
            ates r0 = (defpackage.ates) r0
            goto L_0x08e5
        L_0x08e4:
            r0 = 0
        L_0x08e5:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x08ea
            goto L_0x08ef
        L_0x08ea:
            r1.c()
            r1.c = r9
        L_0x08ef:
            aucj r2 = r1.b
            atcv r2 = (defpackage.atcv) r2
            r0.getClass()
            r2.c = r0
            int r0 = r2.a
            r3 = 2
            r0 = r0 | r3
            r2.a = r0
        L_0x08fe:
            aucj r0 = r1.i()
            atcv r0 = (defpackage.atcv) r0
            return r0
        L_0x0905:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkn.a(com.google.android.ulr.ApiPlaceReportPayload):atcv");
    }
}
