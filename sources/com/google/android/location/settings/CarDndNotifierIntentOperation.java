package com.google.android.location.settings;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CarDndNotifierIntentOperation extends IntentOperation {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.app.AutomaticZenRule} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "car_dnd_key"
            java.lang.String r1 = "CarDndNotifierIntOpr"
            boolean r2 = defpackage.axzm.b()
            if (r2 == 0) goto L_0x00ad
            if (r8 == 0) goto L_0x00ad
            java.lang.String r2 = r8.getAction()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r3 = "com.google.android.location.internal.CAR_DND_ACTION"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x00a6 }
            if (r2 == 0) goto L_0x00ad
            boolean r2 = r8.hasExtra(r0)     // Catch:{ Exception -> 0x00a6 }
            if (r2 == 0) goto L_0x00ad
            r2 = 0
            boolean r8 = r8.getBooleanExtra(r0, r2)     // Catch:{ Exception -> 0x00a6 }
            iwq r0 = defpackage.iwq.a((android.content.Context) r7)     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x00a5
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ Exception -> 0x00a6 }
            android.content.Context r3 = r7.getApplicationContext()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "com.google.android.location.settings.DrivingConditionProvider"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x00a6 }
            android.util.Pair r3 = defpackage.ltq.a(r0, r2)     // Catch:{ Exception -> 0x00a6 }
            r4 = 0
            if (r3 == 0) goto L_0x0044
            java.lang.Object r5 = r3.first     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0045
        L_0x0044:
            r5 = r4
        L_0x0045:
            if (r3 == 0) goto L_0x004d
            java.lang.Object r3 = r3.second     // Catch:{ Exception -> 0x00a6 }
            r4 = r3
            android.app.AutomaticZenRule r4 = (android.app.AutomaticZenRule) r4     // Catch:{ Exception -> 0x00a6 }
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            r3 = 1
            if (r5 == 0) goto L_0x0090
            if (r4 == 0) goto L_0x0090
            java.lang.String r6 = "rule already exist"
            android.util.Log.i(r1, r6)     // Catch:{ Exception -> 0x00a6 }
            android.net.Uri r6 = defpackage.ajom.a(r7, r8)     // Catch:{ Exception -> 0x00a6 }
            r4.setConditionId(r6)     // Catch:{ Exception -> 0x00a6 }
            boolean r6 = defpackage.jkr.h()     // Catch:{ Exception -> 0x00a6 }
            if (r6 != 0) goto L_0x0066
            goto L_0x0083
        L_0x0066:
            boolean r6 = defpackage.axzp.b()     // Catch:{ Exception -> 0x00a6 }
            if (r6 == 0) goto L_0x0083
            if (r8 != 0) goto L_0x0083
            aycw r8 = defpackage.aycw.a     // Catch:{ Exception -> 0x00a6 }
            aycx r8 = r8.a()     // Catch:{ Exception -> 0x00a6 }
            boolean r8 = r8.removeDndRuleUponDrivingModeTurnedOff()     // Catch:{ Exception -> 0x00a6 }
            if (r8 == 0) goto L_0x0083
            java.lang.String r8 = "Removing dnd rule upon driving mode turned off."
            android.util.Log.i(r1, r8)     // Catch:{ Exception -> 0x00a6 }
            r0.d(r5)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0095
        L_0x0083:
            boolean r8 = r4.isEnabled()     // Catch:{ Exception -> 0x00a6 }
            if (r8 != 0) goto L_0x008c
            r4.setEnabled(r3)     // Catch:{ Exception -> 0x00a6 }
        L_0x008c:
            r0.a((java.lang.String) r5, (android.app.AutomaticZenRule) r4)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0095
        L_0x0090:
            if (r8 == 0) goto L_0x0095
            defpackage.ajom.a(r7, r0, r3)     // Catch:{ Exception -> 0x00a6 }
        L_0x0095:
            boolean r8 = defpackage.jkr.e()     // Catch:{ Exception -> 0x00a6 }
            if (r8 == 0) goto L_0x00a4
            boolean r8 = defpackage.axzp.b()     // Catch:{ Exception -> 0x00a6 }
            if (r8 == 0) goto L_0x00a4
            com.google.android.chimera.ConditionProviderService.requestRebind(r2)     // Catch:{ Exception -> 0x00a6 }
        L_0x00a4:
            return
        L_0x00a5:
            return
        L_0x00a6:
            r8 = move-exception
            java.lang.String r0 = "Exception in OnHandleIntent in CarDndNotifierIntentOperation"
            android.util.Log.e(r1, r0, r8)
            return
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.settings.CarDndNotifierIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
