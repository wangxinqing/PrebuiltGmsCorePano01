package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.volley.VolleyError;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GunsIntentOperation extends IntentOperation {
    private static final jjg a = jjg.a(iyc.GUNS);
    private static final long b = TimeUnit.SECONDS.toMicros(10);

    public static String a(amen amen) {
        if (wjp.c(amen) && wjp.b(amen)) {
            amej amej = amen.c;
            if (amej == null) {
                amej = amej.g;
            }
            String str = amej.c;
            amer amer = amen.b;
            if (amer == null) {
                amer = amer.b;
            }
            String str2 = amer.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            return sb.toString();
        } else if (wjp.b(amen)) {
            amej amej2 = amen.c;
            if (amej2 == null) {
                amej2 = amej.g;
            }
            String str3 = amej2.f;
            amer amer2 = amen.b;
            if (amer2 == null) {
                amer2 = amer.b;
            }
            String str4 = amer2.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append(":");
            sb2.append(str4);
            return sb2.toString();
        } else {
            amej amej3 = amen.c;
            if (amej3 == null) {
                amej3 = amej.g;
            }
            return amej3.f;
        }
    }

    public final void onCreate() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        if (r4.equals(r9.c.toLowerCase()) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0209 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0210 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0221 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0222 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x022d A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x022e A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0239 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x023a A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0245 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0246 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0255 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0261 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0262 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0269 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x026a A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0270 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0272 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0277 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0278 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x027e A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x027f A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0288 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0289 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0291 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x029b A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02a2 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02a3 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02ab A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02ac A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x02f2 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02f3 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x02fa A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02fb A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0305 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0345 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0346 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0354 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x03c5 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c6 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x03d0 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x03d1 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x03e9 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x03ea A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x03f0 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0438 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0448 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0458 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0460 A[Catch:{ eif | IOException -> 0x0077, all -> 0x05ee }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "GunsService.serverTimeUsec"
            java.lang.String r0 = "com.google.android.gms.notifications.intents.accountName"
            java.lang.String r4 = r20.getAction()     // Catch:{ all -> 0x05ee }
            java.lang.String r5 = "com.google.android.gms.notifications.intents.LOAD_NOTIFICATIONS_FROM_DB"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x05ee }
            java.lang.String r6 = "GunsService.intentCallback"
            java.lang.String r7 = "GunsService.refetch"
            if (r5 != 0) goto L_0x0566
            amen r5 = defpackage.wjp.a((android.content.Intent) r20)     // Catch:{ all -> 0x05ee }
            if (r5 != 0) goto L_0x002f
            jjg r0 = a     // Catch:{ all -> 0x05ee }
            anie r0 = r0.c()     // Catch:{ all -> 0x05ee }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x05ee }
            java.lang.String r3 = "Failed to retrieve payload from intent."
            r0.a((java.lang.String) r3)     // Catch:{ all -> 0x05ee }
        L_0x002b:
            defpackage.acrm.b(r19, r20)
            return
        L_0x002f:
            boolean r9 = r2.hasExtra(r0)     // Catch:{ all -> 0x05ee }
            if (r9 == 0) goto L_0x003b
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch:{ all -> 0x05ee }
            goto L_0x008d
        L_0x003b:
            boolean r0 = defpackage.wjp.b((defpackage.amen) r5)     // Catch:{ all -> 0x05ee }
            if (r0 == 0) goto L_0x008c
            amer r0 = r5.b     // Catch:{ all -> 0x05ee }
            if (r0 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            amer r0 = defpackage.amer.b     // Catch:{ all -> 0x05ee }
        L_0x0048:
            java.lang.String r9 = r0.a     // Catch:{ all -> 0x05ee }
            android.content.Context r0 = r19.getApplicationContext()     // Catch:{ all -> 0x05ee }
            java.lang.String r11 = r0.getPackageName()     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            java.util.List r11 = defpackage.jgu.d(r0, r11)     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
        L_0x005a:
            boolean r12 = r11.hasNext()     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            if (r12 == 0) goto L_0x0075
            java.lang.Object r12 = r11.next()     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            android.accounts.Account r12 = (android.accounts.Account) r12     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            java.lang.String r13 = r12.name     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            java.lang.String r13 = defpackage.eig.c(r0, r13)     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            boolean r13 = r9.equals(r13)     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            if (r13 == 0) goto L_0x005a
            java.lang.String r0 = r12.name     // Catch:{ eif -> 0x0079, IOException -> 0x0077 }
            goto L_0x008d
        L_0x0075:
            r0 = 0
            goto L_0x008d
        L_0x0077:
            r0 = move-exception
            goto L_0x007a
        L_0x0079:
            r0 = move-exception
        L_0x007a:
            jjg r11 = a     // Catch:{ all -> 0x05ee }
            anie r11 = r11.c()     // Catch:{ all -> 0x05ee }
            anih r11 = (defpackage.anih) r11     // Catch:{ all -> 0x05ee }
            r11.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x05ee }
            java.lang.String r0 = "Failed to get account ID for OID: %s."
            r11.a((java.lang.String) r0, (java.lang.Object) r9)     // Catch:{ all -> 0x05ee }
            r0 = 0
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            boolean r9 = r5.d     // Catch:{ all -> 0x05ee }
            r12 = 1
            if (r9 != 0) goto L_0x050c
            java.lang.String r9 = "com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION"
            boolean r9 = r9.equals(r4)     // Catch:{ all -> 0x05ee }
            if (r9 != 0) goto L_0x050c
            java.lang.String r9 = "com.google.android.gms.notifications.intents.START_SERVICE"
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x002b
            boolean r4 = defpackage.wjp.d(r5)     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x04fb
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x00e9
            amet r4 = r5.g     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            amet r4 = defpackage.amet.h     // Catch:{ all -> 0x05ee }
        L_0x00b5:
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x05ee }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x00dc
            android.content.Context r4 = r19.getApplicationContext()     // Catch:{ all -> 0x05ee }
            java.lang.String r4 = defpackage.wja.a(r4)     // Catch:{ all -> 0x05ee }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ all -> 0x05ee }
            amet r9 = r5.g     // Catch:{ all -> 0x05ee }
            if (r9 == 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            amet r9 = defpackage.amet.h     // Catch:{ all -> 0x05ee }
        L_0x00d0:
            java.lang.String r9 = r9.c     // Catch:{ all -> 0x05ee }
            java.lang.String r9 = r9.toLowerCase()     // Catch:{ all -> 0x05ee }
            boolean r4 = r4.equals(r9)     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x00e9
        L_0x00dc:
            boolean r4 = r2.getBooleanExtra(r7, r12)     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x00e4
            goto L_0x00e9
        L_0x00e4:
            r1.a(r2, r5, r0)     // Catch:{ all -> 0x05ee }
            goto L_0x002b
        L_0x00e9:
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x0115
            android.content.Context r4 = r19.getApplicationContext()     // Catch:{ all -> 0x05ee }
            izw r7 = new izw     // Catch:{ all -> 0x05ee }
            com.google.android.gms.common.internal.ClientContext r9 = defpackage.wjm.a((android.content.Context) r4, (java.lang.String) r0)     // Catch:{ all -> 0x05ee }
            r7.<init>(r9)     // Catch:{ all -> 0x05ee }
            java.lang.String r4 = r7.a(r4)     // Catch:{ all -> 0x05ee }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0115
            jjg r3 = a     // Catch:{ all -> 0x05ee }
            anie r3 = r3.c()     // Catch:{ all -> 0x05ee }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x05ee }
            java.lang.String r4 = "Payload has a recipient [%s] without valid credentials - did the user sign out?"
            r3.a((java.lang.String) r4, (java.lang.Object) r0)     // Catch:{ all -> 0x05ee }
            goto L_0x002b
        L_0x0115:
            aynn r4 = defpackage.aynn.a     // Catch:{ all -> 0x05ee }
            ayno r4 = r4.a()     // Catch:{ all -> 0x05ee }
            boolean r4 = r4.a()     // Catch:{ all -> 0x05ee }
            r13 = 0
            if (r4 == 0) goto L_0x0164
            long r8 = r5.j     // Catch:{ all -> 0x05ee }
            int r7 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0164
            long r7 = r2.getLongExtra(r3, r13)     // Catch:{ all -> 0x05ee }
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0155
            long r7 = r5.j     // Catch:{ all -> 0x05ee }
            long r15 = r2.getLongExtra(r3, r13)     // Catch:{ all -> 0x05ee }
            long r7 = r7 - r15
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x05ee }
            long r7 = r3.longValue()     // Catch:{ all -> 0x05ee }
            long r15 = b     // Catch:{ all -> 0x05ee }
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 > 0) goto L_0x0165
            jjg r3 = a     // Catch:{ all -> 0x05ee }
            anie r3 = r3.c()     // Catch:{ all -> 0x05ee }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x05ee }
            java.lang.String r4 = "Received expired payload for [%s]. Notification not shown"
            r3.a((java.lang.String) r4, (java.lang.Object) r0)     // Catch:{ all -> 0x05ee }
            goto L_0x002b
        L_0x0155:
            jjg r3 = a     // Catch:{ all -> 0x05ee }
            anie r3 = r3.c()     // Catch:{ all -> 0x05ee }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x05ee }
            java.lang.String r4 = "Server time not available for payload with expiration [%s]. Notification not shown"
            r3.a((java.lang.String) r4, (java.lang.Object) r0)     // Catch:{ all -> 0x05ee }
            goto L_0x002b
        L_0x0164:
            r3 = 0
        L_0x0165:
            aynq r7 = defpackage.aynq.a     // Catch:{ all -> 0x05ee }
            aynr r7 = r7.a()     // Catch:{ all -> 0x05ee }
            boolean r7 = r7.a()     // Catch:{ all -> 0x05ee }
            if (r7 == 0) goto L_0x0193
            boolean r6 = r2.getBooleanExtra(r6, r12)     // Catch:{ all -> 0x05ee }
            if (r6 == 0) goto L_0x0193
            ameh r6 = r5.i     // Catch:{ all -> 0x05ee }
            if (r6 == 0) goto L_0x017c
            goto L_0x017e
        L_0x017c:
            ameh r6 = defpackage.ameh.c     // Catch:{ all -> 0x05ee }
        L_0x017e:
            int r6 = r6.a     // Catch:{ all -> 0x05ee }
            r6 = r6 & r12
            if (r6 == 0) goto L_0x0193
            ameh r6 = r5.i     // Catch:{ all -> 0x05ee }
            if (r6 == 0) goto L_0x0188
            goto L_0x018a
        L_0x0188:
            ameh r6 = defpackage.ameh.c     // Catch:{ all -> 0x05ee }
        L_0x018a:
            amek r6 = r6.b     // Catch:{ all -> 0x05ee }
            if (r6 != 0) goto L_0x0190
            amek r6 = defpackage.amek.g     // Catch:{ all -> 0x05ee }
        L_0x0190:
            defpackage.wjk.a(r1, r6)     // Catch:{ all -> 0x05ee }
        L_0x0193:
            android.content.Context r6 = r19.getApplicationContext()     // Catch:{ all -> 0x05ee }
            wjw r6 = defpackage.wjw.a(r6)     // Catch:{ all -> 0x05ee }
            boolean r7 = defpackage.wjp.d(r5)     // Catch:{ all -> 0x05ee }
            if (r7 == 0) goto L_0x04a0
            android.content.Context r7 = r6.b     // Catch:{ all -> 0x05ee }
            wjj r7 = defpackage.wjj.a((android.content.Context) r7)     // Catch:{ all -> 0x05ee }
            amev r15 = r5.e     // Catch:{ all -> 0x05ee }
            if (r15 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            amev r15 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x01ae:
            amei r15 = r15.c     // Catch:{ all -> 0x05ee }
            if (r15 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            amei r15 = defpackage.amei.b     // Catch:{ all -> 0x05ee }
        L_0x01b5:
            java.lang.String r15 = r15.a     // Catch:{ all -> 0x05ee }
            boolean r15 = r15.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r15 != 0) goto L_0x01ce
            amev r15 = r5.e     // Catch:{ all -> 0x05ee }
            if (r15 == 0) goto L_0x01c2
            goto L_0x01c4
        L_0x01c2:
            amev r15 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x01c4:
            amei r15 = r15.c     // Catch:{ all -> 0x05ee }
            if (r15 == 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            amei r15 = defpackage.amei.b     // Catch:{ all -> 0x05ee }
        L_0x01cb:
            java.lang.String r15 = r15.a     // Catch:{ all -> 0x05ee }
            goto L_0x01cf
        L_0x01ce:
            r15 = 0
        L_0x01cf:
            android.graphics.Bitmap r7 = r7.a((java.lang.String) r15)     // Catch:{ all -> 0x05ee }
            amev r15 = r5.e     // Catch:{ all -> 0x05ee }
            if (r15 == 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            amev r15 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x01da:
            int r15 = r15.a     // Catch:{ all -> 0x05ee }
            r15 = r15 & r12
            if (r15 == 0) goto L_0x0201
            amev r15 = r5.e     // Catch:{ all -> 0x05ee }
            if (r15 == 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            amev r15 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x01e6:
            int r15 = r15.b     // Catch:{ all -> 0x05ee }
            r4 = -2
            if (r15 < r4) goto L_0x0201
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x01f2:
            int r4 = r4.b     // Catch:{ all -> 0x05ee }
            r15 = 2
            if (r4 > r15) goto L_0x0201
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x01fc
            goto L_0x01fe
        L_0x01fc:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x01fe:
            int r4 = r4.b     // Catch:{ all -> 0x05ee }
            goto L_0x0202
        L_0x0201:
            r4 = 0
        L_0x0202:
            int r15 = defpackage.wjp.a((defpackage.amen) r5)     // Catch:{ all -> 0x05ee }
            r11 = -1
            if (r15 == r11) goto L_0x0210
            android.content.Context r11 = r6.b     // Catch:{ all -> 0x05ee }
            int r11 = defpackage.hdg.a(r11, r15)     // Catch:{ all -> 0x05ee }
            goto L_0x0213
        L_0x0210:
            r11 = 17301543(0x1080027, float:2.4979364E-38)
        L_0x0213:
            je r15 = new je     // Catch:{ all -> 0x05ee }
            android.content.Context r8 = r6.b     // Catch:{ all -> 0x05ee }
            r15.<init>(r8)     // Catch:{ all -> 0x05ee }
            r15.b((int) r11)     // Catch:{ all -> 0x05ee }
            amev r8 = r5.e     // Catch:{ all -> 0x05ee }
            if (r8 == 0) goto L_0x0222
            goto L_0x0224
        L_0x0222:
            amev r8 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0224:
            java.lang.String r8 = r8.d     // Catch:{ all -> 0x05ee }
            r15.e(r8)     // Catch:{ all -> 0x05ee }
            amev r8 = r5.e     // Catch:{ all -> 0x05ee }
            if (r8 == 0) goto L_0x022e
            goto L_0x0230
        L_0x022e:
            amev r8 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0230:
            java.lang.String r8 = r8.d     // Catch:{ all -> 0x05ee }
            r15.d(r8)     // Catch:{ all -> 0x05ee }
            amev r8 = r5.e     // Catch:{ all -> 0x05ee }
            if (r8 == 0) goto L_0x023a
            goto L_0x023c
        L_0x023a:
            amev r8 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x023c:
            java.lang.String r8 = r8.e     // Catch:{ all -> 0x05ee }
            r15.b((java.lang.CharSequence) r8)     // Catch:{ all -> 0x05ee }
            amev r8 = r5.e     // Catch:{ all -> 0x05ee }
            if (r8 == 0) goto L_0x0246
            goto L_0x0248
        L_0x0246:
            amev r8 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0248:
            boolean r8 = r8.k     // Catch:{ all -> 0x05ee }
            r15.b((boolean) r8)     // Catch:{ all -> 0x05ee }
            r15.j = r4     // Catch:{ all -> 0x05ee }
            long r9 = r5.h     // Catch:{ all -> 0x05ee }
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x025b
            r13 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r13
            r15.a((long) r9)     // Catch:{ all -> 0x05ee }
        L_0x025b:
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0262
            goto L_0x0265
        L_0x0262:
            r15.c((java.lang.CharSequence) r0)     // Catch:{ all -> 0x05ee }
        L_0x0265:
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x026a
            goto L_0x026c
        L_0x026a:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x026c:
            boolean r4 = r4.l     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x0272
            r4 = 4
            goto L_0x0273
        L_0x0272:
            r4 = 6
        L_0x0273:
            amev r9 = r5.e     // Catch:{ all -> 0x05ee }
            if (r9 == 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            amev r9 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x027a:
            boolean r9 = r9.m     // Catch:{ all -> 0x05ee }
            if (r9 != 0) goto L_0x027f
            goto L_0x0281
        L_0x027f:
            r4 = r4 | 1
        L_0x0281:
            r15.a((int) r4)     // Catch:{ all -> 0x05ee }
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0289
            goto L_0x028b
        L_0x0289:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x028b:
            int r4 = r4.a     // Catch:{ all -> 0x05ee }
            r4 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x029b
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0296
            goto L_0x0298
        L_0x0296:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0298:
            boolean r4 = r4.p     // Catch:{ all -> 0x05ee }
            goto L_0x029c
        L_0x029b:
            r4 = 1
        L_0x029c:
            r15.r = r4     // Catch:{ all -> 0x05ee }
            amew r4 = r5.f     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            amew r4 = defpackage.amew.d     // Catch:{ all -> 0x05ee }
        L_0x02a5:
            boolean r4 = defpackage.wjp.a((defpackage.amew) r4)     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x02ac
            goto L_0x02bb
        L_0x02ac:
            amew r4 = r5.f     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x02b1
            goto L_0x02b3
        L_0x02b1:
            amew r4 = defpackage.amew.d     // Catch:{ all -> 0x05ee }
        L_0x02b3:
            boolean r4 = defpackage.wjp.b((defpackage.amew) r4)     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x02bb
            r9 = 0
            goto L_0x02f0
        L_0x02bb:
            android.content.Context r4 = r6.b     // Catch:{ all -> 0x05ee }
            r8 = 0
            android.content.Intent r4 = defpackage.wjl.a(r4, r5, r0, r8)     // Catch:{ all -> 0x05ee }
            java.util.Random r9 = r6.c     // Catch:{ all -> 0x05ee }
            int r9 = r9.nextInt()     // Catch:{ all -> 0x05ee }
            android.content.Context r10 = r6.b     // Catch:{ all -> 0x05ee }
            r11 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r10, r9, r4, r11)     // Catch:{ all -> 0x05ee }
            r15.f = r4     // Catch:{ all -> 0x05ee }
            android.content.Context r9 = r6.b     // Catch:{ all -> 0x05ee }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x05ee }
            r8 = 6
            r13 = 0
            android.content.Intent r9 = defpackage.wjl.a(r9, r2, r8, r10, r13)     // Catch:{ all -> 0x05ee }
            java.util.Random r10 = r6.c     // Catch:{ all -> 0x05ee }
            int r10 = r10.nextInt()     // Catch:{ all -> 0x05ee }
            android.content.Context r13 = r6.b     // Catch:{ all -> 0x05ee }
            r11 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r13, r10, r9, r11)     // Catch:{ all -> 0x05ee }
            r15.b((android.app.PendingIntent) r9)     // Catch:{ all -> 0x05ee }
            r9 = r4
        L_0x02f0:
            if (r7 != 0) goto L_0x02f3
            goto L_0x02f6
        L_0x02f3:
            r15.a((android.graphics.Bitmap) r7)     // Catch:{ all -> 0x05ee }
        L_0x02f6:
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x02fb
            goto L_0x02fd
        L_0x02fb:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x02fd:
            java.lang.String r4 = r4.f     // Catch:{ all -> 0x05ee }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x0341
            jd r4 = new jd     // Catch:{ all -> 0x05ee }
            r4.<init>()     // Catch:{ all -> 0x05ee }
            amev r7 = r5.e     // Catch:{ all -> 0x05ee }
            if (r7 == 0) goto L_0x030f
            goto L_0x0311
        L_0x030f:
            amev r7 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0311:
            java.lang.String r7 = r7.f     // Catch:{ all -> 0x05ee }
            r4.a((java.lang.CharSequence) r7)     // Catch:{ all -> 0x05ee }
            amev r7 = r5.e     // Catch:{ all -> 0x05ee }
            if (r7 == 0) goto L_0x031b
            goto L_0x031d
        L_0x031b:
            amev r7 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x031d:
            java.lang.String r7 = r7.g     // Catch:{ all -> 0x05ee }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r7 != 0) goto L_0x0332
            amev r7 = r5.e     // Catch:{ all -> 0x05ee }
            if (r7 == 0) goto L_0x032a
            goto L_0x032c
        L_0x032a:
            amev r7 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x032c:
            java.lang.String r7 = r7.g     // Catch:{ all -> 0x05ee }
            r4.b(r7)     // Catch:{ all -> 0x05ee }
            goto L_0x033e
        L_0x0332:
            amev r7 = r5.e     // Catch:{ all -> 0x05ee }
            if (r7 == 0) goto L_0x0337
            goto L_0x0339
        L_0x0337:
            amev r7 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0339:
            java.lang.String r7 = r7.d     // Catch:{ all -> 0x05ee }
            r4.b(r7)     // Catch:{ all -> 0x05ee }
        L_0x033e:
            r15.a((defpackage.jh) r4)     // Catch:{ all -> 0x05ee }
        L_0x0341:
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0346
            goto L_0x0348
        L_0x0346:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0348:
            aucx r4 = r4.r     // Catch:{ all -> 0x05ee }
            java.util.Iterator r7 = r4.iterator()     // Catch:{ all -> 0x05ee }
        L_0x034e:
            boolean r4 = r7.hasNext()     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x03c1
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x05ee }
            ameu r4 = (defpackage.ameu) r4     // Catch:{ all -> 0x05ee }
            java.lang.String r10 = r4.b     // Catch:{ all -> 0x05ee }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r10 == 0) goto L_0x0376
            jjg r4 = defpackage.wjw.a     // Catch:{ all -> 0x05ee }
            anie r4 = r4.b()     // Catch:{ all -> 0x05ee }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x05ee }
            java.lang.String r10 = "Ignoring Secondary Action with no text with id: %s"
            amej r13 = r5.c     // Catch:{ all -> 0x05ee }
            if (r13 != 0) goto L_0x0372
            amej r13 = defpackage.amej.g     // Catch:{ all -> 0x05ee }
        L_0x0372:
            r4.a((java.lang.String) r10, (java.lang.Object) r13)     // Catch:{ all -> 0x05ee }
            goto L_0x034e
        L_0x0376:
            java.util.Random r10 = r6.c     // Catch:{ all -> 0x05ee }
            int r10 = r10.nextInt()     // Catch:{ all -> 0x05ee }
            int r13 = r4.a     // Catch:{ all -> 0x05ee }
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0391
            android.content.Context r13 = r6.b     // Catch:{ all -> 0x05ee }
            android.content.Intent r13 = defpackage.wjl.a(r13, r5, r0, r4)     // Catch:{ all -> 0x05ee }
            android.content.Context r14 = r6.b     // Catch:{ all -> 0x05ee }
            r11 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r14, r10, r13, r11)     // Catch:{ all -> 0x05ee }
            goto L_0x03b5
        L_0x0391:
            android.content.Context r14 = r6.b     // Catch:{ all -> 0x05ee }
            r13 = r13 & 32
            if (r13 == 0) goto L_0x03a0
            int r13 = r4.f     // Catch:{ all -> 0x05ee }
            int r13 = defpackage.amed.a(r13)     // Catch:{ all -> 0x05ee }
            if (r13 == 0) goto L_0x03a0
            goto L_0x03a1
        L_0x03a0:
            r13 = 1
        L_0x03a1:
            boolean r8 = r4.e     // Catch:{ all -> 0x05ee }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x05ee }
            java.lang.String r11 = r4.d     // Catch:{ all -> 0x05ee }
            android.content.Intent r8 = defpackage.wjl.a(r14, r2, r13, r8, r11)     // Catch:{ all -> 0x05ee }
            android.content.Context r11 = r6.b     // Catch:{ all -> 0x05ee }
            r13 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r10 = android.app.PendingIntent.getBroadcast(r11, r10, r8, r13)     // Catch:{ all -> 0x05ee }
        L_0x03b5:
            jc r8 = new jc     // Catch:{ all -> 0x05ee }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x05ee }
            r13 = 0
            r8.<init>(r13, r4, r10)     // Catch:{ all -> 0x05ee }
            r15.a((defpackage.jc) r8)     // Catch:{ all -> 0x05ee }
            goto L_0x034e
        L_0x03c1:
            amev r7 = r5.e     // Catch:{ all -> 0x05ee }
            if (r7 == 0) goto L_0x03c6
            goto L_0x03c8
        L_0x03c6:
            amev r7 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x03c8:
            java.lang.String r7 = r7.h     // Catch:{ all -> 0x05ee }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r7 == 0) goto L_0x03d1
            goto L_0x03e5
        L_0x03d1:
            if (r9 == 0) goto L_0x03e5
            jc r7 = new jc     // Catch:{ all -> 0x05ee }
            amev r8 = r5.e     // Catch:{ all -> 0x05ee }
            if (r8 == 0) goto L_0x03da
            goto L_0x03dc
        L_0x03da:
            amev r8 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x03dc:
            java.lang.String r8 = r8.h     // Catch:{ all -> 0x05ee }
            r4 = 0
            r7.<init>(r4, r8, r9)     // Catch:{ all -> 0x05ee }
            r15.a((defpackage.jc) r7)     // Catch:{ all -> 0x05ee }
        L_0x03e5:
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x03ea
            goto L_0x03ec
        L_0x03ea:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x03ec:
            boolean r4 = r4.n     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x0458
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x03f5
            goto L_0x03f7
        L_0x03f5:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x03f7:
            ameq r4 = r4.o     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x03fc
            goto L_0x03fe
        L_0x03fc:
            ameq r4 = defpackage.ameq.c     // Catch:{ all -> 0x05ee }
        L_0x03fe:
            je r7 = new je     // Catch:{ all -> 0x05ee }
            android.content.Context r8 = r6.b     // Catch:{ all -> 0x05ee }
            r7.<init>(r8)     // Catch:{ all -> 0x05ee }
            android.content.Context r8 = r6.b     // Catch:{ all -> 0x05ee }
            r9 = 2131231263(0x7f08021f, float:1.8078602E38)
            int r8 = defpackage.hdg.a(r8, r9)     // Catch:{ all -> 0x05ee }
            r7.b((int) r8)     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x0414
            goto L_0x0422
        L_0x0414:
            java.lang.String r8 = r4.a     // Catch:{ all -> 0x05ee }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r8 != 0) goto L_0x0422
            java.lang.String r8 = r4.a     // Catch:{ all -> 0x05ee }
            r7.e(r8)     // Catch:{ all -> 0x05ee }
            goto L_0x042e
        L_0x0422:
            android.content.Context r8 = r6.b     // Catch:{ all -> 0x05ee }
            r9 = 2131952982(0x7f130556, float:1.9542422E38)
            java.lang.String r8 = r8.getString(r9)     // Catch:{ all -> 0x05ee }
            r7.e(r8)     // Catch:{ all -> 0x05ee }
        L_0x042e:
            if (r4 == 0) goto L_0x0448
            java.lang.String r8 = r4.b     // Catch:{ all -> 0x05ee }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r8 != 0) goto L_0x0448
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x05ee }
            r7.b((java.lang.CharSequence) r4)     // Catch:{ all -> 0x05ee }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0444
            goto L_0x0451
        L_0x0444:
            r7.c((java.lang.CharSequence) r0)     // Catch:{ all -> 0x05ee }
            goto L_0x0451
        L_0x0448:
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x0451
            r7.b((java.lang.CharSequence) r0)     // Catch:{ all -> 0x05ee }
        L_0x0451:
            android.app.Notification r4 = r7.b()     // Catch:{ all -> 0x05ee }
            r15.w = r4     // Catch:{ all -> 0x05ee }
            goto L_0x045a
        L_0x0458:
            r15.v = r12     // Catch:{ all -> 0x05ee }
        L_0x045a:
            boolean r4 = defpackage.jkr.e()     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x049b
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0465
            goto L_0x0467
        L_0x0465:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0467:
            ameg r4 = r4.s     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x046c
            goto L_0x046e
        L_0x046c:
            ameg r4 = defpackage.ameg.h     // Catch:{ all -> 0x05ee }
        L_0x046e:
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x05ee }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x049b
            android.content.Context r4 = r6.b     // Catch:{ all -> 0x05ee }
            amev r6 = r5.e     // Catch:{ all -> 0x05ee }
            if (r6 == 0) goto L_0x047d
            goto L_0x047f
        L_0x047d:
            amev r6 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x047f:
            ameg r6 = r6.s     // Catch:{ all -> 0x05ee }
            if (r6 == 0) goto L_0x0484
            goto L_0x0486
        L_0x0484:
            ameg r6 = defpackage.ameg.h     // Catch:{ all -> 0x05ee }
        L_0x0486:
            defpackage.wjs.a(r4, r6)     // Catch:{ all -> 0x05ee }
            amev r4 = r5.e     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x048e
            goto L_0x0490
        L_0x048e:
            amev r4 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0490:
            ameg r4 = r4.s     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0495
            goto L_0x0497
        L_0x0495:
            ameg r4 = defpackage.ameg.h     // Catch:{ all -> 0x05ee }
        L_0x0497:
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x05ee }
            r15.z = r4     // Catch:{ all -> 0x05ee }
        L_0x049b:
            android.app.Notification r8 = r15.b()     // Catch:{ all -> 0x05ee }
            goto L_0x04a1
        L_0x04a0:
            r8 = 0
        L_0x04a1:
            if (r8 == 0) goto L_0x002b
            iwq r4 = defpackage.iwq.a((android.content.Context) r19)     // Catch:{ all -> 0x05ee }
            java.lang.String r6 = a(r5)     // Catch:{ all -> 0x05ee }
            r7 = 1000(0x3e8, float:1.401E-42)
            r4.a(r6, r7, r8)     // Catch:{ all -> 0x05ee }
            boolean r4 = defpackage.aynt.b()     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x04bd
            java.lang.String r4 = a(r5)     // Catch:{ all -> 0x05ee }
            defpackage.wjt.a(r1, r4, r5)     // Catch:{ all -> 0x05ee }
        L_0x04bd:
            if (r3 == 0) goto L_0x04f4
            long r3 = r3.longValue()     // Catch:{ all -> 0x05ee }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05ee }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05ee }
            long r3 = r8.toMillis(r3)     // Catch:{ all -> 0x05ee }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x05ee }
            r9 = 6
            r10 = 0
            android.content.Intent r9 = defpackage.wjl.a(r1, r2, r9, r8, r10)     // Catch:{ all -> 0x05ee }
            jbs r12 = new jbs     // Catch:{ all -> 0x05ee }
            r12.<init>(r1)     // Catch:{ all -> 0x05ee }
            java.lang.String r13 = "notifications_expiration"
            long r15 = r6 + r3
            r14 = 1
            java.lang.String r3 = a(r5)     // Catch:{ all -> 0x05ee }
            int r3 = r3.hashCode()     // Catch:{ all -> 0x05ee }
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r17 = android.app.PendingIntent.getBroadcast(r1, r3, r9, r4)     // Catch:{ all -> 0x05ee }
            java.lang.String r18 = "com.google.android.gms.notifications"
            r12.a((java.lang.String) r13, (int) r14, (long) r15, (android.app.PendingIntent) r17, (java.lang.String) r18)     // Catch:{ all -> 0x05ee }
        L_0x04f4:
            r3 = 5
            r4 = 0
            r1.a(r5, r0, r3, r4)     // Catch:{ all -> 0x05ee }
            goto L_0x002b
        L_0x04fb:
            int r3 = r5.a     // Catch:{ all -> 0x05ee }
            r3 = r3 & 8
            if (r3 != 0) goto L_0x002b
            boolean r3 = r2.getBooleanExtra(r7, r12)     // Catch:{ all -> 0x05ee }
            if (r3 == 0) goto L_0x002b
            r1.a(r2, r5, r0)     // Catch:{ all -> 0x05ee }
            goto L_0x002b
        L_0x050c:
            boolean r3 = defpackage.wjp.c(r5)     // Catch:{ all -> 0x05ee }
            if (r3 == 0) goto L_0x002b
            android.os.Bundle r3 = r20.getExtras()     // Catch:{ all -> 0x05ee }
            java.lang.String r6 = "com.google.android.gms.notifications.intents.removeFromSystemTray"
            boolean r6 = r3.getBoolean(r6, r12)     // Catch:{ all -> 0x05ee }
            java.lang.String r7 = "com.google.android.gms.notifications.intents.readState"
            r4 = 0
            int r4 = r3.getInt(r7, r4)     // Catch:{ all -> 0x05ee }
            int r4 = defpackage.amed.a(r4)     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x052b
            r12 = r4
            goto L_0x052c
        L_0x052b:
        L_0x052c:
            java.lang.String r4 = "com.google.android.gms.notifications.intents.actionId"
            r7 = 0
            java.lang.String r3 = r3.getString(r4, r7)     // Catch:{ all -> 0x05ee }
            amej r4 = r5.c     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x0539
            amej r4 = defpackage.amej.g     // Catch:{ all -> 0x05ee }
        L_0x0539:
            if (r6 != 0) goto L_0x053c
            goto L_0x0557
        L_0x053c:
            boolean r4 = defpackage.aynt.b()     // Catch:{ all -> 0x05ee }
            if (r4 == 0) goto L_0x0543
            goto L_0x054a
        L_0x0543:
            java.lang.String r4 = a(r5)     // Catch:{ all -> 0x05ee }
            defpackage.wjt.a(r1, r4)     // Catch:{ all -> 0x05ee }
        L_0x054a:
            iwq r4 = defpackage.iwq.a((android.content.Context) r19)     // Catch:{ all -> 0x05ee }
            java.lang.String r6 = a(r5)     // Catch:{ all -> 0x05ee }
            r7 = 1000(0x3e8, float:1.401E-42)
            r4.a((java.lang.String) r6, (int) r7)     // Catch:{ all -> 0x05ee }
        L_0x0557:
            boolean r4 = r5.d     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x002b
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05ee }
            if (r4 != 0) goto L_0x002b
            r1.a(r5, r0, r12, r3)     // Catch:{ all -> 0x05ee }
            goto L_0x002b
        L_0x0566:
            boolean r0 = defpackage.aynt.b()     // Catch:{ all -> 0x05ee }
            if (r0 != 0) goto L_0x002b
            java.util.List r0 = defpackage.wjt.a(r19)     // Catch:{ all -> 0x05ee }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x05ee }
        L_0x0574:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x05ee }
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x05ee }
            amen r3 = (defpackage.amen) r3     // Catch:{ all -> 0x05ee }
            int r5 = r3.a     // Catch:{ all -> 0x05ee }
            r5 = r5 & 8
            if (r5 != 0) goto L_0x0587
            goto L_0x05de
        L_0x0587:
            amen r5 = defpackage.amen.k     // Catch:{ all -> 0x05ee }
            aucd r5 = r5.a((defpackage.aucj) r3)     // Catch:{ all -> 0x05ee }
            amev r3 = r3.e     // Catch:{ all -> 0x05ee }
            if (r3 == 0) goto L_0x0592
            goto L_0x0594
        L_0x0592:
            amev r3 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
        L_0x0594:
            amev r8 = defpackage.amev.t     // Catch:{ all -> 0x05ee }
            aucd r3 = r8.a((defpackage.aucj) r3)     // Catch:{ all -> 0x05ee }
            boolean r8 = r3.c     // Catch:{ all -> 0x05ee }
            if (r8 != 0) goto L_0x059f
            goto L_0x05a5
        L_0x059f:
            r3.c()     // Catch:{ all -> 0x05ee }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x05ee }
        L_0x05a5:
            aucj r8 = r3.b     // Catch:{ all -> 0x05ee }
            amev r8 = (defpackage.amev) r8     // Catch:{ all -> 0x05ee }
            int r9 = r8.a     // Catch:{ all -> 0x05ee }
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r8.a = r9     // Catch:{ all -> 0x05ee }
            r4 = 0
            r8.l = r4     // Catch:{ all -> 0x05ee }
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r8.a = r9     // Catch:{ all -> 0x05ee }
            r8.m = r4     // Catch:{ all -> 0x05ee }
            boolean r8 = r5.c     // Catch:{ all -> 0x05ee }
            if (r8 != 0) goto L_0x05bd
            goto L_0x05c3
        L_0x05bd:
            r5.c()     // Catch:{ all -> 0x05ee }
            r4 = 0
            r5.c = r4     // Catch:{ all -> 0x05ee }
        L_0x05c3:
            aucj r8 = r5.b     // Catch:{ all -> 0x05ee }
            amen r8 = (defpackage.amen) r8     // Catch:{ all -> 0x05ee }
            aucj r3 = r3.i()     // Catch:{ all -> 0x05ee }
            amev r3 = (defpackage.amev) r3     // Catch:{ all -> 0x05ee }
            r3.getClass()     // Catch:{ all -> 0x05ee }
            r8.e = r3     // Catch:{ all -> 0x05ee }
            int r3 = r8.a     // Catch:{ all -> 0x05ee }
            r3 = r3 | 8
            r8.a = r3     // Catch:{ all -> 0x05ee }
            aucj r3 = r5.i()     // Catch:{ all -> 0x05ee }
            amen r3 = (defpackage.amen) r3     // Catch:{ all -> 0x05ee }
        L_0x05de:
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x05ee }
            r5.<init>()     // Catch:{ all -> 0x05ee }
            r4 = 0
            r5.putExtra(r7, r4)     // Catch:{ all -> 0x05ee }
            r5.putExtra(r6, r4)     // Catch:{ all -> 0x05ee }
            r1.a(r5, r3)     // Catch:{ all -> 0x05ee }
            goto L_0x0574
        L_0x05ee:
            r0 = move-exception
            defpackage.acrm.b(r19, r20)
            goto L_0x05f4
        L_0x05f3:
            throw r0
        L_0x05f4:
            goto L_0x05f3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.GunsIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    private final void a(Intent intent, amen amen) {
        Context applicationContext = getApplicationContext();
        Intent className = new Intent().setClassName(applicationContext, "com.google.android.gms.notifications.GcmBroadcastReceiver");
        className.setAction("com.google.android.gms.notifications.intents.SHOW_NOTIFICATION");
        className.putExtras(intent);
        className.putExtra("GunsService.refetch", false);
        className.putExtra("gms.gnots.payload", wjp.a((audx) amen));
        applicationContext.sendOrderedBroadcast(className, (String) null);
    }

    public final void a(amen amen, String str, int i, String str2) {
        amej amej;
        if (!TextUtils.isEmpty(str) && wjp.c(amen)) {
            Context applicationContext = getApplicationContext();
            amer amer = amen.b;
            if (amer == null) {
                amer = amer.b;
            }
            String str3 = amer.a;
            amej amej2 = amen.c;
            if (amej2 == null) {
                amej = amej.g;
            } else {
                amej = amej2;
            }
            wjq wjq = new wjq(applicationContext, str, str3, amej, i, str2);
            try {
                amej amej3 = wjq.e;
                int i2 = wjq.h;
                String str4 = wjq.f;
                aucd o = amhe.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amhe amhe = (amhe) o.b;
                amej3.getClass();
                amhe.b = amej3;
                int i3 = amhe.a | 1;
                amhe.a = i3;
                amhe.c = i2 - 1;
                int i4 = i3 | 4;
                amhe.a = i4;
                if (str4 != null) {
                    str4.getClass();
                    amhe.a = i4 | 8;
                    amhe.d = str4;
                }
                aucd o2 = amhf.b.o();
                o2.k(o);
                wjq.g.a(wjq.b, wjq.c, wjq.d, (amhf) o2.i());
            } catch (VolleyError | eif e) {
                anih anih = (anih) wjq.a.b();
                anih.a(e);
                anih.a("Failed to update the notification(s) read state.");
            }
        }
    }

    public final void a(Intent intent, amen amen, String str) {
        amhg amhg;
        int i;
        Intent intent2 = intent;
        amen amen2 = amen;
        if (TextUtils.isEmpty(str)) {
        } else if (!wjp.c(amen)) {
        } else if (wjp.b(amen)) {
            Context applicationContext = getApplicationContext();
            amer amer = amen2.b;
            if (amer == null) {
                amer = amer.b;
            }
            String str2 = amer.a;
            amej amej = amen2.c;
            if (amej == null) {
                amej = amej.g;
            }
            wji wji = new wji(applicationContext, str, str2, amej);
            try {
                wjm wjm = wji.f;
                Context context = wji.b;
                String str3 = wji.c;
                String str4 = wji.d;
                amej amej2 = wji.e;
                aucd o = amhd.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amhd amhd = (amhd) o.b;
                amej2.getClass();
                if (!amhd.b.a()) {
                    amhd.b = aucj.a(amhd.b);
                }
                amhd.b.add(amej2);
                aucd o2 = amet.h.o();
                String a2 = wja.a(wji.b);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                amet amet = (amet) o2.b;
                a2.getClass();
                amet.a |= 2;
                amet.c = a2;
                DisplayMetrics displayMetrics = wji.b.getResources().getDisplayMetrics();
                if (displayMetrics.densityDpi < 480) {
                    i = displayMetrics.densityDpi < 320 ? displayMetrics.densityDpi < 240 ? displayMetrics.densityDpi < 213 ? displayMetrics.densityDpi >= 160 ? 2 : 1 : 5 : 3 : 4;
                } else {
                    i = 6;
                }
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                amet amet2 = (amet) o2.b;
                amet2.b = i - 1;
                amet2.a |= 1;
                int i2 = Build.VERSION.SDK_INT;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                amet amet3 = (amet) o2.b;
                amet3.a |= 4;
                amet3.d = i2;
                float f = wji.b.getResources().getDisplayMetrics().density;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                amet amet4 = (amet) o2.b;
                amet4.a |= 8;
                amet4.e = f;
                String id = TimeZone.getDefault().getID();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                amet amet5 = (amet) o2.b;
                id.getClass();
                amet5.a |= 16;
                amet5.f = id;
                if (jkr.e()) {
                    ArrayList a3 = wjs.a(wji.b);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    amet amet6 = (amet) o2.b;
                    if (!amet6.g.a()) {
                        amet6.g = aucj.a(amet6.g);
                    }
                    auab.a((Iterable) a3, (List) amet6.g);
                }
                amet amet7 = (amet) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amhd amhd2 = (amhd) o.b;
                amet7.getClass();
                amhd2.c = amet7;
                amhd2.a |= 1;
                amhd amhd3 = (amhd) o.i();
                ClientContext a4 = wjm.a(context, str3);
                aucd o3 = amgz.d.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                amgz amgz = (amgz) o3.b;
                amhd3.getClass();
                amgz.c = amhd3;
                amgz.a |= 2;
                amgy a5 = wju.a(context, str4, auuv.a((int) aynt.d()));
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                amgz amgz2 = (amgz) o3.b;
                a5.getClass();
                amgz2.b = a5;
                amgz2.a |= 1;
                amhg = ((amha) wjm.a.a(a4, 1, wjm.a("/gmsgnotsfetchbyidentifier?alt=proto", aynw.a.a().h()), ((amgz) o3.i()).k(), (Object) amha.b)).a;
                if (amhg == null) {
                    amhg = amhg.c;
                }
            } catch (VolleyError | eif e) {
                anih anih = (anih) wji.a.b();
                anih.a(e);
                anih.a("Failed to fetch notification by identifier.");
                amhg = amhg.c;
            }
            long j = amhg.b;
            if (j > 0) {
                intent2.putExtra("GunsService.serverTimeUsec", j);
            }
            if (amhg.a.size() > 0) {
                aucx aucx = amhg.a;
                int size = aucx.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a(intent2, (amen) aucx.get(i3));
                }
                return;
            }
            a(intent, amen);
        }
    }
}
