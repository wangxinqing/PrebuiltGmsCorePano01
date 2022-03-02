package com.google.android.location.contexthub;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsHelperNyc$2 extends nla {
    final /* synthetic */ ahzh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsHelperNyc$2(ahzh ahzh, String str) {
        super(str);
        this.a = ahzh;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            ahzh r8 = r7.a
            java.lang.String r0 = r9.getAction()
            if (r0 == 0) goto L_0x00f3
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 1
            switch(r1) {
                case -1875733435: goto L_0x0032;
                case -1184851779: goto L_0x0028;
                case -1076576821: goto L_0x001e;
                case -511271086: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x003c
        L_0x0014:
            java.lang.String r1 = "android.location.MODE_CHANGED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = 2
            goto L_0x003d
        L_0x001e:
            java.lang.String r1 = "android.intent.action.AIRPLANE_MODE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = 0
            goto L_0x003d
        L_0x0028:
            java.lang.String r1 = "android.location.PROVIDERS_CHANGED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = 3
            goto L_0x003d
        L_0x0032:
            java.lang.String r1 = "android.net.wifi.WIFI_STATE_CHANGED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = -1
        L_0x003d:
            r6 = 4
            if (r1 == 0) goto L_0x00c7
            if (r1 == r5) goto L_0x00b7
            if (r1 == r2) goto L_0x005e
            if (r1 == r4) goto L_0x005e
            java.lang.String r8 = "received unknown event action: "
            int r9 = r0.length()
            if (r9 != 0) goto L_0x0054
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            goto L_0x0058
        L_0x0054:
            java.lang.String r9 = r8.concat(r0)
        L_0x0058:
            java.lang.String r8 = "SettingsHelperNyc"
            android.util.Log.e(r8, r9)
            return
        L_0x005e:
            boolean r9 = r8.h()
            aucd r0 = r8.b
            aucj r1 = r0.b
            armv r1 = (defpackage.armv) r1
            boolean r1 = r1.e
            if (r1 == r9) goto L_0x0085
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r0.c()
            r0.c = r3
        L_0x0076:
            aucj r0 = r0.b
            armv r0 = (defpackage.armv) r0
            armv r1 = defpackage.armv.g
            int r1 = r0.a
            r1 = r1 | 8
            r0.a = r1
            r0.e = r9
            goto L_0x0086
        L_0x0085:
            r5 = 0
        L_0x0086:
            boolean r9 = r8.i()
            aucd r0 = r8.b
            aucj r1 = r0.b
            armv r1 = (defpackage.armv) r1
            boolean r1 = r1.f
            if (r1 == r9) goto L_0x00ad
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0099
            goto L_0x009e
        L_0x0099:
            r0.c()
            r0.c = r3
        L_0x009e:
            aucj r0 = r0.b
            armv r0 = (defpackage.armv) r0
            armv r1 = defpackage.armv.g
            int r1 = r0.a
            r1 = r1 | 16
            r0.a = r1
            r0.f = r9
            goto L_0x00b0
        L_0x00ad:
            if (r5 != 0) goto L_0x00b0
            goto L_0x00f3
        L_0x00b0:
            aucd r9 = r8.b
            r8.a(r4, r9)
            return
        L_0x00b7:
            java.lang.String r0 = "wifi_state"
            int r9 = r9.getIntExtra(r0, r6)
            if (r9 == r5) goto L_0x00c3
            if (r9 == r4) goto L_0x00c3
            goto L_0x00f3
        L_0x00c3:
            r8.d()
            return
        L_0x00c7:
            boolean r9 = r8.g()
            aucd r0 = r8.b
            aucj r1 = r0.b
            armv r1 = (defpackage.armv) r1
            boolean r1 = r1.d
            if (r1 != r9) goto L_0x00f3
            r9 = r9 ^ r5
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            r0.c()
            r0.c = r3
        L_0x00e0:
            aucj r0 = r0.b
            armv r0 = (defpackage.armv) r0
            armv r1 = defpackage.armv.g
            int r1 = r0.a
            r1 = r1 | r6
            r0.a = r1
            r0.d = r9
            aucd r9 = r8.b
            r8.a(r4, r9)
            return
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.contexthub.SettingsHelperNyc$2.a(android.content.Context, android.content.Intent):void");
    }
}
