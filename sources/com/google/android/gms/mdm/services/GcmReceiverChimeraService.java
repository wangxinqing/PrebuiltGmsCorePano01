package com.google.android.gms.mdm.services;

import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.BatteryManager;
import android.os.Build;
import android.telephony.euicc.EuiccManager;
import com.android.volley.Response;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.mdm.receivers.ActivateDeviceAdminUponUnlockChimeraReceiver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmReceiverChimeraService extends smv {
    private boolean d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x030d, code lost:
        if (android.telephony.PhoneNumberUtils.isEmergencyNumber(r2) == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0310, code lost:
        r3.add(defpackage.avuj.LOCKSCREEN_PHONE_NUMBER_INVALID);
        r2 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Intent r18) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            java.lang.String r1 = "lock_message"
            java.lang.String r2 = "new_password"
            java.lang.String r3 = "email"
            java.lang.String r4 = "token"
            java.lang.String r5 = "action"
            java.lang.String r6 = "payload"
            java.lang.String r7 = "rp"
            r9 = 0
            r8.a = r9
            r10 = 0
            r8.b = r10
            r8.d = r10
            avuh r11 = defpackage.avuh.m
            aucd r11 = r11.o()
            r12 = 32
            r13 = 2
            r14 = 4
            r15 = 1
            boolean r16 = r0.hasExtra(r7)     // Catch:{ auda -> 0x0150 }
            if (r16 != 0) goto L_0x013d
            boolean r7 = r0.hasExtra(r6)     // Catch:{ auda -> 0x0150 }
            if (r7 == 0) goto L_0x003a
            byte[] r0 = r0.getByteArrayExtra(r6)     // Catch:{ auda -> 0x0150 }
            r11.b(r0)     // Catch:{ auda -> 0x0150 }
            goto L_0x0149
        L_0x003a:
            boolean r6 = r0.hasExtra(r5)     // Catch:{ auda -> 0x0150 }
            if (r6 == 0) goto L_0x0066
            int r5 = r0.getIntExtra(r5, r10)     // Catch:{ auda -> 0x0150 }
            avug r5 = defpackage.avug.a(r5)     // Catch:{ auda -> 0x0150 }
            if (r5 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            avug r5 = defpackage.avug.NOOP     // Catch:{ auda -> 0x0150 }
        L_0x004e:
            boolean r6 = r11.c     // Catch:{ auda -> 0x0150 }
            if (r6 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r11.c()     // Catch:{ auda -> 0x0150 }
            r11.c = r10     // Catch:{ auda -> 0x0150 }
        L_0x0058:
            aucj r6 = r11.b     // Catch:{ auda -> 0x0150 }
            avuh r6 = (defpackage.avuh) r6     // Catch:{ auda -> 0x0150 }
            int r5 = r5.m     // Catch:{ auda -> 0x0150 }
            r6.b = r5     // Catch:{ auda -> 0x0150 }
            int r5 = r6.a     // Catch:{ auda -> 0x0150 }
            r5 = r5 | r15
            r6.a = r5     // Catch:{ auda -> 0x0150 }
            goto L_0x007f
        L_0x0066:
            avug r5 = defpackage.avug.NOOP     // Catch:{ auda -> 0x0150 }
            boolean r6 = r11.c     // Catch:{ auda -> 0x0150 }
            if (r6 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r11.c()     // Catch:{ auda -> 0x0150 }
            r11.c = r10     // Catch:{ auda -> 0x0150 }
        L_0x0072:
            aucj r6 = r11.b     // Catch:{ auda -> 0x0150 }
            avuh r6 = (defpackage.avuh) r6     // Catch:{ auda -> 0x0150 }
            int r5 = r5.m     // Catch:{ auda -> 0x0150 }
            r6.b = r5     // Catch:{ auda -> 0x0150 }
            int r5 = r6.a     // Catch:{ auda -> 0x0150 }
            r5 = r5 | r15
            r6.a = r5     // Catch:{ auda -> 0x0150 }
        L_0x007f:
            boolean r5 = r0.hasExtra(r4)     // Catch:{ auda -> 0x0150 }
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x008d
            java.lang.String r4 = r0.getStringExtra(r4)     // Catch:{ auda -> 0x0150 }
            goto L_0x008e
        L_0x008d:
            r4 = r6
        L_0x008e:
            boolean r5 = r11.c     // Catch:{ auda -> 0x0150 }
            if (r5 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            r11.c()     // Catch:{ auda -> 0x0150 }
            r11.c = r10     // Catch:{ auda -> 0x0150 }
        L_0x0098:
            aucj r5 = r11.b     // Catch:{ auda -> 0x0150 }
            avuh r5 = (defpackage.avuh) r5     // Catch:{ auda -> 0x0150 }
            r4.getClass()     // Catch:{ auda -> 0x0150 }
            int r7 = r5.a     // Catch:{ auda -> 0x0150 }
            r7 = r7 | r13
            r5.a = r7     // Catch:{ auda -> 0x0150 }
            r5.c = r4     // Catch:{ auda -> 0x0150 }
            boolean r4 = r0.hasExtra(r3)     // Catch:{ auda -> 0x0150 }
            if (r4 == 0) goto L_0x00b1
            java.lang.String r3 = r0.getStringExtra(r3)     // Catch:{ auda -> 0x0150 }
            goto L_0x00b2
        L_0x00b1:
            r3 = r6
        L_0x00b2:
            java.lang.String r4 = "SHA-256"
            byte[] r3 = defpackage.jhg.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ auda -> 0x0150 }
            if (r3 != 0) goto L_0x00bb
            goto L_0x00d7
        L_0x00bb:
            auay r3 = defpackage.auay.a((byte[]) r3)     // Catch:{ auda -> 0x0150 }
            boolean r4 = r11.c     // Catch:{ auda -> 0x0150 }
            if (r4 != 0) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            r11.c()     // Catch:{ auda -> 0x0150 }
            r11.c = r10     // Catch:{ auda -> 0x0150 }
        L_0x00c9:
            aucj r4 = r11.b     // Catch:{ auda -> 0x0150 }
            avuh r4 = (defpackage.avuh) r4     // Catch:{ auda -> 0x0150 }
            r3.getClass()     // Catch:{ auda -> 0x0150 }
            int r5 = r4.a     // Catch:{ auda -> 0x0150 }
            r5 = r5 | r14
            r4.a = r5     // Catch:{ auda -> 0x0150 }
            r4.d = r3     // Catch:{ auda -> 0x0150 }
        L_0x00d7:
            java.lang.String r3 = "locate"
            boolean r3 = r0.getBooleanExtra(r3, r10)     // Catch:{ auda -> 0x0150 }
            boolean r4 = r11.c     // Catch:{ auda -> 0x0150 }
            if (r4 != 0) goto L_0x00e2
            goto L_0x00e7
        L_0x00e2:
            r11.c()     // Catch:{ auda -> 0x0150 }
            r11.c = r10     // Catch:{ auda -> 0x0150 }
        L_0x00e7:
            aucj r4 = r11.b     // Catch:{ auda -> 0x0150 }
            avuh r4 = (defpackage.avuh) r4     // Catch:{ auda -> 0x0150 }
            int r5 = r4.a     // Catch:{ auda -> 0x0150 }
            r5 = r5 | 8
            r4.a = r5     // Catch:{ auda -> 0x0150 }
            r4.e = r3     // Catch:{ auda -> 0x0150 }
            boolean r3 = r0.hasExtra(r2)     // Catch:{ auda -> 0x0150 }
            if (r3 == 0) goto L_0x00fe
            java.lang.String r2 = r0.getStringExtra(r2)     // Catch:{ auda -> 0x0150 }
            goto L_0x00ff
        L_0x00fe:
            r2 = r6
        L_0x00ff:
            boolean r3 = r11.c     // Catch:{ auda -> 0x0150 }
            if (r3 != 0) goto L_0x0104
            goto L_0x0109
        L_0x0104:
            r11.c()     // Catch:{ auda -> 0x0150 }
            r11.c = r10     // Catch:{ auda -> 0x0150 }
        L_0x0109:
            aucj r3 = r11.b     // Catch:{ auda -> 0x0150 }
            avuh r3 = (defpackage.avuh) r3     // Catch:{ auda -> 0x0150 }
            r2.getClass()     // Catch:{ auda -> 0x0150 }
            int r4 = r3.a     // Catch:{ auda -> 0x0150 }
            r4 = r4 | 16
            r3.a = r4     // Catch:{ auda -> 0x0150 }
            r3.f = r2     // Catch:{ auda -> 0x0150 }
            boolean r2 = r0.hasExtra(r1)     // Catch:{ auda -> 0x0150 }
            if (r2 == 0) goto L_0x0123
            java.lang.String r6 = r0.getStringExtra(r1)     // Catch:{ auda -> 0x0150 }
            goto L_0x0124
        L_0x0123:
        L_0x0124:
            boolean r0 = r11.c     // Catch:{ auda -> 0x0150 }
            if (r0 != 0) goto L_0x0129
            goto L_0x012e
        L_0x0129:
            r11.c()     // Catch:{ auda -> 0x0150 }
            r11.c = r10     // Catch:{ auda -> 0x0150 }
        L_0x012e:
            aucj r0 = r11.b     // Catch:{ auda -> 0x0150 }
            avuh r0 = (defpackage.avuh) r0     // Catch:{ auda -> 0x0150 }
            r6.getClass()     // Catch:{ auda -> 0x0150 }
            int r1 = r0.a     // Catch:{ auda -> 0x0150 }
            r1 = r1 | r12
            r0.a = r1     // Catch:{ auda -> 0x0150 }
            r0.g = r6     // Catch:{ auda -> 0x0150 }
            goto L_0x0149
        L_0x013d:
            java.lang.String r0 = r0.getStringExtra(r7)     // Catch:{ auda -> 0x0150 }
            byte[] r0 = android.util.Base64.decode(r0, r10)     // Catch:{ auda -> 0x0150 }
            r11.b(r0)     // Catch:{ auda -> 0x0150 }
        L_0x0149:
            aucj r0 = r11.i()
            avuh r0 = (defpackage.avuh) r0
            goto L_0x0159
        L_0x0150:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "Invalid remote policy proto. Ignoring"
            defpackage.snn.a(r1, r0)
            r0 = r9
        L_0x0159:
            if (r0 == 0) goto L_0x03b7
            java.lang.Object[] r1 = new java.lang.Object[r14]
            int r2 = r0.b
            avug r2 = defpackage.avug.a(r2)
            if (r2 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            avug r2 = defpackage.avug.NOOP
        L_0x0168:
            r1[r10] = r2
            java.lang.String r2 = r0.c
            r1[r15] = r2
            auay r2 = r0.d
            byte[] r2 = r2.k()
            java.lang.String r2 = defpackage.jhy.c((byte[]) r2)
            r1[r13] = r2
            r2 = 3
            boolean r3 = r0.e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "processing remote instruction: [%s, %s, %s, %s]"
            defpackage.snn.b(r2, r1)
            java.lang.String r1 = r0.c
            r8.a = r1
            cri r1 = defpackage.smo.l
            java.lang.String r2 = r8.a
            r1.a((java.lang.Object) r2)
            boolean r1 = r0.j
            r8.b = r1
            r8.b((defpackage.avuh) r0)
            auay r1 = r0.d
            byte[] r1 = r1.k()
            if (r1 != 0) goto L_0x01a4
            goto L_0x03b1
        L_0x01a4:
            int r2 = r1.length
            if (r2 == 0) goto L_0x03b1
            qub r2 = defpackage.qub.a((android.content.Context) r17)
            java.lang.String r3 = "com.google"
            android.accounts.Account[] r2 = r2.a((java.lang.String) r3)
            int r3 = r2.length
            r4 = 0
        L_0x01b3:
            if (r4 >= r3) goto L_0x03b1
            r5 = r2[r4]
            java.lang.String r5 = r5.name
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x03ac
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r6)
            boolean r6 = defpackage.smv.a(r5, r1)
            if (r6 != 0) goto L_0x01e8
            java.lang.String[] r6 = r8.c
            int r7 = r6.length
            r11 = 0
        L_0x01cf:
            if (r11 >= r7) goto L_0x03ac
            r13 = r6[r11]
            boolean r14 = r5.endsWith(r13)
            if (r14 == 0) goto L_0x01e5
            java.lang.String r14 = "@gmail.com"
            java.lang.String r13 = r5.replaceAll(r13, r14)
            boolean r13 = defpackage.smv.a(r13, r1)
            if (r13 != 0) goto L_0x01e8
        L_0x01e5:
            int r11 = r11 + 1
            goto L_0x01cf
        L_0x01e8:
            boolean r1 = defpackage.azfk.b()
            if (r1 != 0) goto L_0x01ef
            goto L_0x0203
        L_0x01ef:
            cri r1 = defpackage.smo.e
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0203
            avuj r0 = defpackage.avuj.LOCATION_DISABLED_IN_CONSOLE
            r8.b((defpackage.avuj) r0)
            return
        L_0x0203:
            boolean r11 = r0.e
            int r1 = r0.b
            avug r1 = defpackage.avug.a(r1)
            if (r1 == 0) goto L_0x020e
            goto L_0x0210
        L_0x020e:
            avug r1 = defpackage.avug.NOOP
        L_0x0210:
            int r1 = r1.ordinal()
            r13 = 60000(0xea60, double:2.9644E-319)
            switch(r1) {
                case 0: goto L_0x03a6;
                case 1: goto L_0x0383;
                case 2: goto L_0x037e;
                case 3: goto L_0x0375;
                case 4: goto L_0x0371;
                case 5: goto L_0x0263;
                case 6: goto L_0x0258;
                case 7: goto L_0x0253;
                case 8: goto L_0x024e;
                case 9: goto L_0x021a;
                case 10: goto L_0x024a;
                case 11: goto L_0x0227;
                default: goto L_0x021a;
            }
        L_0x021a:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "Unrecognized action passed with tickle. Ignoring."
            defpackage.snn.a(r1, r0)
            avuj r0 = defpackage.avuj.UNKNOWN_COMMAND
            r8.b((defpackage.avuj) r0)
            return
        L_0x0227:
            auay r0 = r0.l
            byte[] r0 = r0.k()
            java.lang.String r1 = r8.a
            int r2 = defpackage.smx.n
            java.lang.String r2 = "com.google.android.gms.mdm.services.RingService"
            android.content.Intent r2 = defpackage.aann.a((android.content.Context) r8, (java.lang.String) r2)
            java.lang.String r3 = "echoServerToken"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "com.google.android.gms.nearby.discovery.ACCOUNT_KEY"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "unpair"
            r2.setAction(r0)
            defpackage.acrm.c(r8, r2)
            return
        L_0x024a:
            r17.d()
            return
        L_0x024e:
            r8.a((boolean) r10)
            return
        L_0x0253:
            r8.a((boolean) r15)
            return
        L_0x0258:
            avup r0 = defpackage.avup.SITREP_REMOTE_INSTRUCTION
            r8.a((defpackage.avup) r0)
            avuj r0 = defpackage.avuj.SUCCESS
            r8.b((defpackage.avuj) r0)
            return
        L_0x0263:
            java.lang.String r1 = r0.f
            java.lang.String r15 = r0.g
            java.lang.String r2 = r0.h
            boolean r0 = r17.b()
            if (r0 == 0) goto L_0x03a5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r0 = defpackage.snh.a(r17)
            if (r0 == 0) goto L_0x028d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0285
            avuj r0 = defpackage.avuj.LOCKSCREEN_ALREADY_ENABLED
            r3.add(r0)
        L_0x0285:
            defpackage.snb.c(r17)
            defpackage.smv.a((android.content.Context) r17)
            r5 = r9
            goto L_0x02ee
        L_0x028d:
            java.lang.String r0 = "device_policy"
            java.lang.Object r0 = r8.getSystemService(r0)
            r4 = r0
            android.app.admin.DevicePolicyManager r4 = (android.app.admin.DevicePolicyManager) r4
            if (r1 == 0) goto L_0x02d0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02d0
            azfk r0 = defpackage.azfk.a
            azfl r0 = r0.a()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x02c3
            char[] r0 = r1.toCharArray()
            int r5 = r0.length
            r6 = 0
        L_0x02b1:
            if (r6 >= r5) goto L_0x02c3
            char r7 = r0[r6]
            if (r7 < r12) goto L_0x02c1
            r9 = 126(0x7e, float:1.77E-43)
            if (r7 > r9) goto L_0x02bf
            int r6 = r6 + 1
            r9 = 0
            goto L_0x02b1
        L_0x02bf:
            r0 = 0
            goto L_0x02d1
        L_0x02c1:
            r0 = 0
            goto L_0x02d1
        L_0x02c3:
            boolean r0 = r4.resetPassword(r1, r10)     // Catch:{ SecurityException -> 0x02cd, IllegalStateException -> 0x02cb, IllegalArgumentException -> 0x02c9 }
            goto L_0x02d1
        L_0x02c9:
            r0 = move-exception
            goto L_0x02ce
        L_0x02cb:
            r0 = move-exception
            goto L_0x02ce
        L_0x02cd:
            r0 = move-exception
        L_0x02ce:
            r0 = 0
            goto L_0x02d1
        L_0x02d0:
            r0 = 0
        L_0x02d1:
            defpackage.snb.c(r17)
            if (r0 != 0) goto L_0x02e2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "Unable to reset. Password was not strong enough"
            defpackage.snn.c(r1, r0)
            avue r0 = defpackage.snb.a((android.app.admin.DevicePolicyManager) r4)
            goto L_0x02e3
        L_0x02e2:
            r0 = 0
        L_0x02e3:
            defpackage.smv.a((android.content.Context) r17)
            if (r0 == 0) goto L_0x02ed
            avuj r1 = defpackage.avuj.PASSWORD_NOT_STRONG_ENOUGH
            r3.add(r1)
        L_0x02ed:
            r5 = r0
        L_0x02ee:
            char[] r0 = r2.toCharArray()
            r1 = 0
        L_0x02f3:
            int r4 = r0.length
            if (r1 >= r4) goto L_0x0309
            char r4 = r0[r1]
            boolean r4 = android.telephony.PhoneNumberUtils.isISODigit(r4)
            if (r4 == 0) goto L_0x02ff
        L_0x02fe:
            goto L_0x0306
        L_0x02ff:
            char r4 = r0[r1]
            r6 = 43
            if (r4 == r6) goto L_0x02fe
            goto L_0x0310
        L_0x0306:
            int r1 = r1 + 1
            goto L_0x02f3
        L_0x0309:
            boolean r0 = android.telephony.PhoneNumberUtils.isEmergencyNumber(r2)
            if (r0 != 0) goto L_0x0310
            goto L_0x0316
        L_0x0310:
            avuj r0 = defpackage.avuj.LOCKSCREEN_PHONE_NUMBER_INVALID
            r3.add(r0)
            r2 = 0
        L_0x0316:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0329
            boolean r0 = defpackage.jhg.c((android.content.Context) r17)
            if (r0 != 0) goto L_0x0329
            avuj r0 = defpackage.avuj.DEVICE_HAS_NO_TELEPHONY
            r3.add(r0)
            r9 = 0
            goto L_0x032a
        L_0x0329:
            r9 = r2
        L_0x032a:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0336
            avuj r0 = defpackage.avuj.SUCCESS
            r8.a((defpackage.avuj) r0)
            goto L_0x0357
        L_0x0336:
            int r0 = r3.size()
            avuj[] r2 = new defpackage.avuj[r0]
        L_0x033c:
            int r0 = r3.size()
            if (r10 >= r0) goto L_0x034d
            java.lang.Object r0 = r3.get(r10)
            avuj r0 = (defpackage.avuj) r0
            r2[r10] = r0
            int r10 = r10 + 1
            goto L_0x033c
        L_0x034d:
            r3 = 0
            java.lang.String r4 = r8.a
            r6 = 0
            r7 = 0
            r1 = r17
            r1.a(r2, r3, r4, r5, r6, r7)
        L_0x0357:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L_0x0368
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0364
            goto L_0x0368
        L_0x0364:
            defpackage.smu.a(r17)
            goto L_0x036b
        L_0x0368:
            defpackage.smu.a(r8, r15, r9)
        L_0x036b:
            if (r11 == 0) goto L_0x03a5
            r8.a((long) r13)
            return
        L_0x0371:
            r8.a((defpackage.avuh) r0)
            return
        L_0x0375:
            r17.c()
            if (r11 == 0) goto L_0x03a5
            r8.a((long) r13)
            return
        L_0x037e:
            r8.a((long) r13)
            return
        L_0x0383:
            boolean r0 = r17.b()
            if (r0 == 0) goto L_0x03a5
            if (r11 != 0) goto L_0x038c
            goto L_0x0394
        L_0x038c:
            r0 = 10000(0x2710, double:4.9407E-320)
            r8.a((long) r0)     // Catch:{ Exception -> 0x039f, all -> 0x039d }
            android.os.SystemClock.sleep(r0)     // Catch:{ Exception -> 0x039f, all -> 0x039d }
        L_0x0394:
            avuj r0 = defpackage.avuj.SUCCESS     // Catch:{ Exception -> 0x039f, all -> 0x039d }
            r8.b((defpackage.avuj) r0)     // Catch:{ Exception -> 0x039f, all -> 0x039d }
        L_0x0399:
            r17.a()
            return
        L_0x039d:
            r0 = move-exception
            goto L_0x03a1
        L_0x039f:
            r0 = move-exception
            goto L_0x0399
        L_0x03a1:
            r17.a()
            throw r0
        L_0x03a5:
            return
        L_0x03a6:
            avuj r0 = defpackage.avuj.SUCCESS
            r8.b((defpackage.avuj) r0)
            return
        L_0x03ac:
            int r4 = r4 + 1
            r9 = 0
            goto L_0x01b3
        L_0x03b1:
            avuj r0 = defpackage.avuj.MISSING_ACCOUNT
            r8.b((defpackage.avuj) r0)
            return
        L_0x03b7:
            avuj r0 = defpackage.avuj.INVALID_REMOTE_INSTRUCTION
            r8.b((defpackage.avuj) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.GcmReceiverChimeraService.b(android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public final void b(avuh avuh) {
        this.d = avuh.k;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        smx.a(this, this.a, this.b, Boolean.valueOf(this.d), false);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        smx.a(this, this.a, this.d, false, true);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        int i;
        boolean z;
        Method method;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        if (Build.VERSION.SDK_INT >= 26) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    Object systemService = getSystemService("euicc_service");
                    if (!(systemService == null || (method = systemService.getClass().getMethod("isEnabled", new Class[0])) == null)) {
                        z = ((Boolean) method.invoke(systemService, new Object[0])).booleanValue();
                    }
                    i = 0;
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("ReflectiveOperationException in isEuiccEnabled: ");
                    sb.append(valueOf);
                    snn.c(sb.toString(), new Object[0]);
                    i = 0;
                }
            } else {
                z = ((EuiccManager) getSystemService("euicc")).isEnabled();
            }
            if (z) {
                if (Build.VERSION.SDK_INT < 28) {
                    try {
                        Field field = devicePolicyManager.getClass().getField("WIPE_EUICC");
                        if (field != null) {
                            i = field.getInt((Object) null);
                        }
                    } catch (Exception e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                        sb2.append("ReflectiveOperationException: ");
                        sb2.append(valueOf2);
                        snn.c(sb2.toString(), new Object[0]);
                        i = 0;
                    }
                } else {
                    i = 4;
                }
            }
            i = 0;
        } else {
            i = 0;
        }
        StringBuilder sb3 = new StringBuilder(25);
        sb3.append("wipeEuiccFlag=");
        sb3.append(i);
        snn.b(sb3.toString(), new Object[0]);
        if (jkr.h()) {
            Intent intent = new Intent("android.intent.action.FACTORY_RESET");
            intent.addFlags(285212672);
            intent.putExtra("android.intent.extra.REASON", "Find My Device wiping device remotely");
            intent.putExtra("android.intent.extra.WIPE_EXTERNAL_STORAGE", true);
            intent.putExtra("com.android.internal.intent.extra.WIPE_ESIMS", true);
            sendBroadcast(intent);
            return;
        }
        try {
            devicePolicyManager.wipeData(i | 1);
        } catch (SecurityException e3) {
            snn.c("FMD does not own an active administrator that uses USES_POLICY_WIPE_DATA", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        snl a = snl.a();
        sna sna = new sna(this.a, this.b, this.d);
        if (a.a.size() < 10) {
            a.a.put(sna.a, sna);
        } else if (!a.a.containsKey(sna.a)) {
            snn.a("Too many pending locate requests, start throttling.", new Object[0]);
            b(avuj.LOCATION_TIME_OUT);
            return;
        }
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.d;
        if (smt.a.compareAndSet(false, true)) {
            Intent startIntent = IntentOperation.getStartIntent((Context) this, LocateChimeraService.class, "com.google.android.gms.mdm.services.LOCATE");
            startIntent.putExtra("echo_server_token", str);
            startIntent.putExtra("includeBatteryStatus", z);
            startIntent.putExtra("includeConnectivityStatus", z2);
            startIntent.putExtra("timeout", j);
            acrm.c(this, startIntent);
            return;
        }
        Location location = (Location) snl.a().b.get();
        if (location != null) {
            int i = crc.a;
            a(avuj.SUCCESS, location, this.a, (Response.Listener) null, (Response.ErrorListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(avuh avuh) {
        je jeVar;
        boolean z = avuh.i;
        if (snb.b(this)) {
            a(avup.DEVICE_ADMIN_ALREADY_ENABLED);
            a(avuj.REMIND_ALREADY_DEVICE_ADMINISTRATOR);
            snn.a("Device administrator is already enabled; not showing notification.", new Object[0]);
        } else if (!z) {
            Intent intent = new Intent("com.google.android.gms.settings.ADM_SETTINGS");
            intent.setPackage(getPackageName());
            intent.putExtra("show_device_admin", true);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 134217728);
            int a = hdg.a(this, R.drawable.mdm_ic_notification);
            snh.b(this);
            if (jkr.e()) {
                jeVar = new je(this, "find_my_device");
            } else {
                jeVar = new je(this);
            }
            jeVar.b(a);
            jeVar.e(getString(R.string.common_mdm_feature_name));
            jeVar.b((CharSequence) getString(R.string.mdm_reminder_notification_text));
            jeVar.f = activity;
            jeVar.a(true);
            jeVar.u = kf.b(this, R.color.mdm_accent_color);
            jeVar.s = "recommendation";
            jeVar.e();
            iwq.a((Context) this).a("mdm.notification_reminder", 1, jeVar.b());
            a(avuj.SUCCESS);
        } else {
            ActivateDeviceAdminUponUnlockChimeraReceiver.a(true);
            a(avuj.SUCCESS);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(avup avup) {
        smy.a();
        Intent a = smy.a(this, true, avup);
        if (a != null) {
            startService(a);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(avuj[] avujArr, Location location, String str, avue avue, Response.Listener listener, Response.ErrorListener errorListener) {
        avtx avtx;
        avuj[] avujArr2 = avujArr;
        int length = avujArr2.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                avuj avuj = avujArr2[i];
                if (avuj != avuj.USER_NOT_PRIVILEGED) {
                    if (avuj == avuj.LOCATION_DISABLED_IN_CONSOLE) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        BatteryManager batteryManager = (BatteryManager) getSystemService("batterymanager");
        avty avty = null;
        if (!this.b) {
            avtx = null;
        } else {
            avtx = !z ? sni.a(this) : null;
        }
        if (this.d) {
            avty = snh.c(this);
        }
        smh.a(avujArr, location, avtx, avty, str, avue, snh.a(this), snh.a(), listener, errorListener);
    }
}
