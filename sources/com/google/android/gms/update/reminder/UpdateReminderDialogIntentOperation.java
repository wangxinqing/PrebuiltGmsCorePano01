package com.google.android.gms.update.reminder;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateReminderDialogIntentOperation extends IntentOperation {
    private static final iwd a = adnt.d("UpdateReminderDialogControl");
    private static final adrk b = new adrk("control.popupdialog.last_aggresive_dialog_displayed_at", 0L);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106 A[SYNTHETIC, Splitter:B:38:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void a() {
        /*
            adjz r0 = defpackage.adke.d
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x027c
            adqz r0 = defpackage.adla.h
            java.lang.Object r0 = r0.b()
            adla r0 = (defpackage.adla) r0
            com.google.android.gms.update.SystemUpdateStatus r1 = r0.d()
            int r0 = r1.c
            r2 = 0
            if (r0 == 0) goto L_0x0272
            com.google.android.gms.update.ActivityStatus r0 = r1.r
            boolean r0 = r0.a
            if (r0 != 0) goto L_0x0267
            java.lang.String r0 = defpackage.ayoi.c()
            boolean r0 = defpackage.amrk.a((java.lang.String) r0)
            r3 = 1
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = defpackage.ayoi.c()     // Catch:{ adju -> 0x003a }
            adkg r0 = defpackage.adkg.a((java.lang.String) r0)     // Catch:{ adju -> 0x003a }
            r4 = r0
            goto L_0x004d
        L_0x003a:
            r0 = move-exception
            iwd r0 = a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = defpackage.ayoi.c()
            r4[r2] = r5
            java.lang.String r5 = "Unable to parse display time window: %s."
            r0.e(r5, r4)
        L_0x004a:
            adkg r0 = defpackage.adkg.b
            r4 = r0
        L_0x004d:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r1.n
            long r7 = r7 - r9
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r0.toDays(r7)
            int r14 = defpackage.adkh.a(r7)
            adqz r0 = defpackage.adrn.a
            java.lang.Object r0 = r0.b()
            r11 = r0
            adrn r11 = (defpackage.adrn) r11
            adrk r0 = b
            java.lang.Object r0 = r11.b(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            if (r14 <= 0) goto L_0x0266
            int r7 = defpackage.adkh.a(r7)
            ayoi r0 = defpackage.ayoi.a
            ayoj r0 = r0.a()
            java.lang.String r0 = r0.b()
            boolean r8 = defpackage.amrk.a((java.lang.String) r0)
            r16 = 31104000000(0x73df16000, double:1.5367417848E-313)
            if (r8 != 0) goto L_0x00f9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r18 = 44
            amsk r15 = defpackage.amsk.a((char) r18)
            java.lang.Iterable r0 = r15.a((java.lang.CharSequence) r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x00a5:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x00d0
            java.lang.Object r15 = r0.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r18 = r15.trim()     // Catch:{ NumberFormatException -> 0x00c2 }
            long r19 = java.lang.Long.parseLong(r18)     // Catch:{ NumberFormatException -> 0x00c2 }
            java.lang.Long r2 = java.lang.Long.valueOf(r19)     // Catch:{ NumberFormatException -> 0x00c2 }
            r8.add(r2)     // Catch:{ NumberFormatException -> 0x00c2 }
            r2 = 0
            goto L_0x00a5
        L_0x00c2:
            r0 = move-exception
            iwd r0 = defpackage.adkh.a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r18 = 0
            r2[r18] = r15
            java.lang.String r15 = "Malformed retry delayed period string: %s."
            r0.b(r15, r2)
        L_0x00d0:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00f9
            int r0 = r8.size()
            if (r0 <= r7) goto L_0x00e8
            java.lang.Object r0 = r8.get(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r16 = r0.longValue()
            r2 = -1
            goto L_0x00fa
        L_0x00e8:
            int r0 = r8.size()
            r2 = -1
            int r0 = r0 + r2
            java.lang.Object r0 = r8.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r16 = r0.longValue()
            goto L_0x00fa
        L_0x00f9:
            r2 = -1
        L_0x00fa:
            long r12 = r12 + r16
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0266
            boolean r0 = r4.a((long) r5)
            if (r0 == 0) goto L_0x0266
            java.lang.String r0 = defpackage.aypa.c()     // Catch:{ adju -> 0x010f }
            adkg r0 = defpackage.adkg.a((java.lang.String) r0)     // Catch:{ adju -> 0x010f }
            goto L_0x0122
        L_0x010f:
            r0 = move-exception
            iwd r0 = a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r7 = defpackage.aypa.c()
            r8 = 0
            r4[r8] = r7
            java.lang.String r7 = "Unable to parse restart time window: %s."
            r0.e(r7, r4)
            adkg r0 = defpackage.adkg.a
        L_0x0122:
            adrc[] r4 = new defpackage.adrc[r3]
            adrk r7 = b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            adrc r5 = r7.b(r5)
            r6 = 0
            r4[r6] = r5
            r11.a((defpackage.adrc[]) r4)
            ihs r4 = defpackage.ihs.b()
            r5 = 2131954276(0x7f130a64, float:1.9545047E38)
            java.lang.CharSequence r5 = r4.getText(r5)
            java.lang.CharSequence[] r7 = new java.lang.CharSequence[r3]
            java.lang.String r8 = java.lang.String.valueOf(r9)
            r7[r6] = r8
            java.lang.CharSequence r5 = android.text.TextUtils.expandTemplate(r5, r7)
            java.lang.String r5 = r5.toString()
            int r6 = r1.c
            r6 = r6 & 31
            r7 = 11
            if (r6 != r7) goto L_0x01ce
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r6 = 2131954207(0x7f130a1f, float:1.9544907E38)
            java.lang.CharSequence r6 = r4.getText(r6)
            r7 = 0
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r7]
            java.lang.CharSequence r6 = android.text.TextUtils.expandTemplate(r6, r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r8 = 2131954253(0x7f130a4d, float:1.9545E38)
            java.lang.CharSequence r8 = r4.getText(r8)
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r7]
            java.lang.CharSequence r7 = android.text.TextUtils.expandTemplate(r8, r9)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            com.google.android.gms.update.UpdateDescription r8 = r1.x
            java.lang.String r8 = r8.c
            java.lang.String r9 = java.lang.String.valueOf(r5)
            int r9 = r9.length()
            java.lang.String r10 = java.lang.String.valueOf(r6)
            int r10 = r10.length()
            java.lang.String r11 = java.lang.String.valueOf(r7)
            int r11 = r11.length()
            java.lang.String r12 = java.lang.String.valueOf(r8)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r9 = r9 + 7
            int r9 = r9 + r10
            int r9 = r9 + r11
            int r9 = r9 + r12
            r13.<init>(r9)
            r13.append(r5)
            java.lang.String r5 = "\n\n"
            r13.append(r5)
            r13.append(r6)
            r13.append(r5)
            r13.append(r7)
            java.lang.String r6 = " "
            r13.append(r6)
            r13.append(r8)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            r11 = r5
            goto L_0x01cf
        L_0x01ce:
            r11 = r5
        L_0x01cf:
            java.lang.String r5 = "setupwizard.theme"
            java.lang.String r5 = android.os.SystemProperties.get(r5)
            int r6 = r5.hashCode()
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            switch(r6) {
                case -2128555920: goto L_0x0214;
                case -1241052239: goto L_0x020a;
                case 3175618: goto L_0x0200;
                case 115650329: goto L_0x01f6;
                case 115650330: goto L_0x01ec;
                case 767685465: goto L_0x01e2;
                default: goto L_0x01e1;
            }
        L_0x01e1:
            goto L_0x021e
        L_0x01e2:
            java.lang.String r6 = "glif_light"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x021e
            r15 = 0
            goto L_0x021f
        L_0x01ec:
            java.lang.String r6 = "glif_v3"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x021e
            r15 = 5
            goto L_0x021f
        L_0x01f6:
            java.lang.String r6 = "glif_v2"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x021e
            r15 = 3
            goto L_0x021f
        L_0x0200:
            java.lang.String r6 = "glif"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x021e
            r15 = 1
            goto L_0x021f
        L_0x020a:
            java.lang.String r6 = "glif_v3_light"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x021e
            r15 = 4
            goto L_0x021f
        L_0x0214:
            java.lang.String r6 = "glif_v2_light"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x021e
            r15 = 2
            goto L_0x021f
        L_0x021e:
            r15 = -1
        L_0x021f:
            if (r15 == 0) goto L_0x022e
            if (r15 == r3) goto L_0x022e
            if (r15 == r10) goto L_0x022e
            if (r15 == r9) goto L_0x022e
            if (r15 == r8) goto L_0x022e
            if (r15 == r7) goto L_0x022e
            r16 = 0
            goto L_0x0230
        L_0x022e:
            r16 = 1
        L_0x0230:
            boolean r2 = r0.a()
            if (r2 != 0) goto L_0x0237
            goto L_0x0256
        L_0x0237:
            boolean r2 = r1.y
            if (r2 == 0) goto L_0x0256
            java.lang.String r12 = defpackage.ayoi.b()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r0.a((android.content.Context) r4, (long) r2)
            int r13 = r1.c
            boolean r15 = r1.u
            android.content.Intent r1 = defpackage.adkk.a(r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "restart_window_start_time"
            android.content.Intent r0 = r1.putExtra(r2, r0)
            goto L_0x0262
        L_0x0256:
            java.lang.String r12 = defpackage.ayoi.b()
            int r13 = r1.c
            boolean r15 = r1.u
            android.content.Intent r0 = defpackage.adkk.a(r11, r12, r13, r14, r15, r16)
        L_0x0262:
            r4.startActivity(r0)
            return
        L_0x0266:
            return
        L_0x0267:
            iwd r0 = a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "SystemUpdate activity already foregrounded."
            r0.b(r2, r1)
            return
        L_0x0272:
            r1 = 0
            iwd r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No pending update."
            r0.b(r2, r1)
        L_0x027c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.reminder.UpdateReminderDialogIntentOperation.a():void");
    }

    public final void onHandleIntent(Intent intent) {
        String b2 = amrk.b(intent.getAction());
        a.b("Received action: %s", b2);
        if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(b2)) {
            if ("android.intent.action.USER_PRESENT".equals(b2) && !amrk.a(ayoi.c())) {
                a();
            }
        } else if (ayoi.a.a().e()) {
            a();
        }
    }
}
