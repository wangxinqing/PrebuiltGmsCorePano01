package defpackage;

/* renamed from: ahna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ahna {
    PHONE_ACTIVITY_DNN(1501260402953L, 1186103143, "phone_activity_dnn.model.uncompressed"),
    PHONE_TWO_WHEELER_DNN(1513124575461L, 2146722381, "two_wheeler_dnn.model.jpg"),
    PHONE_ACTIVITY_CNN(1539060079283L, 3380417373L, "phone_activity_cnn.model.uncompressed"),
    PHONE_ACTIVITY(1427499739686L, "phone_activity.model.jpg"),
    PHONE_BAR_GRU_FOR_CHRE_DNN(1540963941999L, "phone_bar_gru_for_chre_dnn.model.uncompressed"),
    PHONE_BAR_GRU_BATCH_FOR_OAR_DNN(1539020598205L, "phone_bar_gru_batch_for_oar_dnn.model.uncompressed"),
    PHONE_BAR_GRU_NON_BATCH_FOR_OAR_DNN(1539020353818L, "phone_bar_gru_non_batch_for_oar_dnn.model.uncompressed"),
    PHONE_BAR_GRU_BATCH_FOR_OAR_CNN(1539094352990L, "phone_bar_gru_batch_for_oar_cnn.model.uncompressed"),
    PHONE_BAR_GRU_NON_BATCH_FOR_OAR_CNN(1539094289514L, "phone_bar_gru_non_batch_for_oar_cnn.model.uncompressed"),
    WATCH_ACTIVITY(1474574629460L, "watch_activity.model.jpg"),
    PHONE_POSITION(1428630138407L, "phone_position.model.jpg"),
    PHONE_POSITION_IN_VEHICLE(1428630110146L, "phone_position_in_vehicle.model.jpg"),
    PHONE_POCKET_WALKING(1469566351197L, "phone_pocket_walking.model.jpg"),
    PHONE_FLOOR_CHANGE(1448472682338L, "floor_change.model.jpg"),
    PHONE_SLEEP_DNN(1569627785136L, 3817819787L, "sleep_activity_dnn.model.uncompressed"),
    WATCH_REP_SEGMENTATION(1448309879170L, "rep_segmentation.model.jpg"),
    WATCH_AUTOFIT_EXERCISE(1465344697439L, "autofit_exercise.model.jpg"),
    PHONE_ACTIVITY_CONTEXT_HUB(1464026440157L, "context_hub_phone_activity.model.jpg");
    
    public final long s;
    public final long t;
    public final String u;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ahna(long r3, long r5, java.lang.String r7) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.s = r3
            r0.t = r5
            int r1 = r7.length()
            java.lang.String r2 = "armodel/"
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0019
        L_0x0015:
            java.lang.String r1 = r2.concat(r7)
        L_0x0019:
            r0.u = r1
            int r1 = r7.hashCode()
            switch(r1) {
                case -2144462104: goto L_0x00e1;
                case -2069310744: goto L_0x00d6;
                case -1703158136: goto L_0x00cb;
                case -1675643643: goto L_0x00c0;
                case -1317404061: goto L_0x00b5;
                case -1096006425: goto L_0x00ab;
                case -908973999: goto L_0x00a0;
                case -813315602: goto L_0x0095;
                case -486060881: goto L_0x008a;
                case -479238890: goto L_0x007f;
                case -361818232: goto L_0x0073;
                case -198492280: goto L_0x0068;
                case -106405815: goto L_0x005d;
                case 263956145: goto L_0x0052;
                case 942049864: goto L_0x0047;
                case 1335451186: goto L_0x003b;
                case 1777672117: goto L_0x0030;
                case 2032475373: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x00eb
        L_0x0024:
            java.lang.String r1 = "watch_activity.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 13
            goto L_0x00ec
        L_0x0030:
            java.lang.String r1 = "phone_bar_gru_batch_for_oar_dnn.model.uncompressed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 4
            goto L_0x00ec
        L_0x003b:
            java.lang.String r1 = "rep_segmentation.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 12
            goto L_0x00ec
        L_0x0047:
            java.lang.String r1 = "phone_bar_gru_non_batch_for_oar_cnn.model.uncompressed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 7
            goto L_0x00ec
        L_0x0052:
            java.lang.String r1 = "floor_change.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 0
            goto L_0x00ec
        L_0x005d:
            java.lang.String r1 = "phone_activity_cnn.model.uncompressed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 1
            goto L_0x00ec
        L_0x0068:
            java.lang.String r1 = "phone_bar_gru_for_chre_dnn.model.uncompressed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 3
            goto L_0x00ec
        L_0x0073:
            java.lang.String r1 = "phone_position.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 8
            goto L_0x00ec
        L_0x007f:
            java.lang.String r1 = "phone_bar_gru_batch_for_oar_cnn.model.uncompressed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 6
            goto L_0x00ec
        L_0x008a:
            java.lang.String r1 = "phone_pocket_walking.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 17
            goto L_0x00ec
        L_0x0095:
            java.lang.String r1 = "phone_activity.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 16
            goto L_0x00ec
        L_0x00a0:
            java.lang.String r1 = "sleep_activity_dnn.model.uncompressed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 10
            goto L_0x00ec
        L_0x00ab:
            java.lang.String r1 = "phone_bar_gru_non_batch_for_oar_dnn.model.uncompressed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 5
            goto L_0x00ec
        L_0x00b5:
            java.lang.String r1 = "autofit_exercise.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 14
            goto L_0x00ec
        L_0x00c0:
            java.lang.String r1 = "phone_position_in_vehicle.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 9
            goto L_0x00ec
        L_0x00cb:
            java.lang.String r1 = "context_hub_phone_activity.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 15
            goto L_0x00ec
        L_0x00d6:
            java.lang.String r1 = "two_wheeler_dnn.model.jpg"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 11
            goto L_0x00ec
        L_0x00e1:
            java.lang.String r1 = "phone_activity_dnn.model.uncompressed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x00eb
            r1 = 2
            goto L_0x00ec
        L_0x00eb:
            r1 = -1
        L_0x00ec:
            switch(r1) {
                case 0: goto L_0x00f7;
                case 1: goto L_0x00f7;
                case 2: goto L_0x00f7;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00f7;
                case 5: goto L_0x00f7;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00f7;
                case 9: goto L_0x00f7;
                case 10: goto L_0x00f7;
                case 11: goto L_0x00f7;
                case 12: goto L_0x00f4;
                case 13: goto L_0x00f4;
                case 14: goto L_0x00f1;
                case 15: goto L_0x00f1;
                case 16: goto L_0x00f1;
                case 17: goto L_0x00f1;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            r1 = 0
            goto L_0x00f9
        L_0x00f1:
            java.lang.String r1 = "/com/google/location/lbs/activity/model/"
            goto L_0x00f9
        L_0x00f4:
            java.lang.String r1 = "/com/google/android/gmscore/integ/modules/location/wearable/assets/location/armodel/"
            goto L_0x00f9
        L_0x00f7:
            java.lang.String r1 = "/com/google/android/gmscore/integ/modules/location/nonwearable/assets/location/armodel/"
        L_0x00f9:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r7.length()
            if (r2 != 0) goto L_0x0109
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            return
        L_0x0109:
            r1.concat(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahna.<init>(java.lang.String, int, long, long, java.lang.String):void");
    }

    private ahna(long j, String str) {
        this(r9, r10, j, -1, str);
    }
}
