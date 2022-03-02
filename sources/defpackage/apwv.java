package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.cast.JGCastService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: apwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apwv {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private static int a() {
        return a.incrementAndGet();
    }

    private static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, a(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0343 A[SYNTHETIC, Splitter:B:116:0x0343] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x039d A[SYNTHETIC, Splitter:B:125:0x039d] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.apwu a(android.content.Context r17, java.lang.String r18, defpackage.apwx r19, java.lang.String r20, android.content.res.Resources r21, android.content.pm.PackageManager r22, android.os.Bundle r23) {
        /*
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            java.lang.String r7 = ". Skipping setting LightSettings"
            java.lang.String r8 = "LightSettings is invalid: "
            je r9 = new je
            r0 = r20
            r9.<init>(r1, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r3.b(r4, r2, r0)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x0026
            r9.e(r0)
        L_0x0026:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r3.b(r4, r2, r0)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x0041
            r9.b((java.lang.CharSequence) r0)
            jd r10 = new jd
            r10.<init>()
            r10.a((java.lang.CharSequence) r0)
            r9.a((defpackage.jh) r10)
        L_0x0041:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = r3.a(r0)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            r11 = 17301651(0x1080093, float:2.4979667E-38)
            java.lang.String r12 = "FirebaseMessaging"
            r13 = 0
            if (r10 != 0) goto L_0x0098
            java.lang.String r10 = "drawable"
            int r10 = r4.getIdentifier(r0, r10, r2)
            if (r10 == 0) goto L_0x0066
            boolean r14 = a((android.content.res.Resources) r4, (int) r10)
            if (r14 != 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            r11 = r10
            goto L_0x00dd
        L_0x0066:
            java.lang.String r10 = "mipmap"
            int r10 = r4.getIdentifier(r0, r10, r2)
            if (r10 == 0) goto L_0x0075
            boolean r14 = a((android.content.res.Resources) r4, (int) r10)
            if (r14 != 0) goto L_0x0063
        L_0x0075:
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r10 = r10.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r10 = r10 + 61
            r14.<init>(r10)
            java.lang.String r10 = "Icon resource "
            r14.append(r10)
            r14.append(r0)
            java.lang.String r0 = " not found. Notification will use default icon."
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            android.util.Log.w(r12, r0)
        L_0x0098:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r10 = r6.getInt(r0, r13)
            if (r10 == 0) goto L_0x00a7
            boolean r0 = a((android.content.res.Resources) r4, (int) r10)
            if (r0 != 0) goto L_0x00d2
        L_0x00a7:
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo(r2, r13)     // Catch:{ NameNotFoundException -> 0x00af }
            int r10 = r0.icon     // Catch:{ NameNotFoundException -> 0x00af }
            goto L_0x00d2
        L_0x00af:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r14 = java.lang.String.valueOf(r0)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 35
            r15.<init>(r14)
            java.lang.String r14 = "Couldn't get own application info: "
            r15.append(r14)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            android.util.Log.w(r12, r0)
        L_0x00d2:
            if (r10 == 0) goto L_0x00dc
            boolean r0 = a((android.content.res.Resources) r4, (int) r10)
            if (r0 == 0) goto L_0x00dc
            r11 = r10
            goto L_0x00dd
        L_0x00dc:
        L_0x00dd:
            r9.b((int) r11)
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r3.a(r0)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 == 0) goto L_0x00f2
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r3.a(r0)
        L_0x00f2:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            r11 = 2
            r14 = 0
            if (r10 != 0) goto L_0x0142
            java.lang.String r10 = "default"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x013c
            java.lang.String r10 = "raw"
            int r4 = r4.getIdentifier(r0, r10, r2)
            if (r4 != 0) goto L_0x010b
            goto L_0x013c
        L_0x010b:
            java.lang.String r4 = java.lang.String.valueOf(r18)
            int r4 = r4.length()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r10 = r10.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r4 = r4 + 24
            int r4 = r4 + r10
            r15.<init>(r4)
            java.lang.String r4 = "android.resource://"
            r15.append(r4)
            r15.append(r2)
            java.lang.String r4 = "/raw/"
            r15.append(r4)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0143
        L_0x013c:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r11)
            goto L_0x0143
        L_0x0142:
            r0 = r14
        L_0x0143:
            if (r0 != 0) goto L_0x0146
            goto L_0x0149
        L_0x0146:
            r9.a((android.net.Uri) r0)
        L_0x0149:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r3.a(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0164
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setPackage(r2)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r4.setFlags(r0)
            goto L_0x019e
        L_0x0164:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r3.a(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0177
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r3.a(r0)
        L_0x0177:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0182
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0183
        L_0x0182:
            r0 = r14
        L_0x0183:
            if (r0 == 0) goto L_0x0193
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r4.<init>(r5)
            r4.setPackage(r2)
            r4.setData(r0)
            goto L_0x019e
        L_0x0193:
            android.content.Intent r4 = r5.getLaunchIntentForPackage(r2)
            if (r4 != 0) goto L_0x019e
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r12, r0)
        L_0x019e:
            if (r4 == 0) goto L_0x020b
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r4.addFlags(r0)
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r2 = r3.a
            r0.<init>(r2)
            android.os.Bundle r2 = r3.a
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x01b6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x01de
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r10 = "google.c."
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01da
            java.lang.String r10 = "gcm.n."
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01da
            java.lang.String r10 = "gcm.notification."
            boolean r10 = r5.startsWith(r10)
            if (r10 == 0) goto L_0x01b6
        L_0x01da:
            r0.remove(r5)
            goto L_0x01b6
        L_0x01de:
            r4.putExtras(r0)
            int r0 = a()
            r2 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r0, r4, r2)
            boolean r2 = a(r19)
            if (r2 == 0) goto L_0x020c
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r2.<init>(r4)
            android.os.Bundle r4 = r19.a()
            android.content.Intent r2 = r2.putExtras(r4)
            java.lang.String r4 = "pending_intent"
            android.content.Intent r0 = r2.putExtra(r4, r0)
            android.app.PendingIntent r0 = a((android.content.Context) r1, (android.content.Intent) r0)
            goto L_0x020c
        L_0x020b:
            r0 = r14
        L_0x020c:
            r9.f = r0
            boolean r0 = a(r19)
            if (r0 == 0) goto L_0x0228
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r0.<init>(r2)
            android.os.Bundle r2 = r19.a()
            android.content.Intent r0 = r0.putExtras(r2)
            android.app.PendingIntent r0 = a((android.content.Context) r1, (android.content.Intent) r0)
            goto L_0x0229
        L_0x0228:
            r0 = r14
        L_0x0229:
            if (r0 != 0) goto L_0x022c
            goto L_0x022f
        L_0x022c:
            r9.b((android.app.PendingIntent) r0)
        L_0x022f:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r3.a(r0)
            java.lang.Integer r0 = a(r1, r0, r6)
            if (r0 == 0) goto L_0x0242
            int r0 = r0.intValue()
            r9.u = r0
        L_0x0242:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r3.b(r0)
            r1 = 1
            r0 = r0 ^ r1
            r9.a((boolean) r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r3.b(r0)
            r9.r = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r3.a(r0)
            if (r0 == 0) goto L_0x0261
            r9.d(r0)
        L_0x0261:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r3.c(r0)
            r2 = -2
            if (r0 == 0) goto L_0x02a0
            int r4 = r0.intValue()
            if (r4 < r2) goto L_0x0277
            int r4 = r0.intValue()
            if (r4 <= r11) goto L_0x02a1
        L_0x0277:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 72
            r5.<init>(r4)
            java.lang.String r4 = "notificationPriority is invalid "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ". Skipping setting notificationPriority."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r12, r0)
            r0 = r14
            goto L_0x02a1
        L_0x02a0:
            r0 = r14
        L_0x02a1:
            if (r0 != 0) goto L_0x02a4
            goto L_0x02aa
        L_0x02a4:
            int r0 = r0.intValue()
            r9.j = r0
        L_0x02aa:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r3.c(r0)
            java.lang.String r4 = "NotificationParams"
            if (r0 == 0) goto L_0x02eb
            int r5 = r0.intValue()
            r6 = -1
            if (r5 < r6) goto L_0x02c2
            int r5 = r0.intValue()
            if (r5 <= r1) goto L_0x02ec
        L_0x02c2:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 53
            r6.<init>(r5)
            java.lang.String r5 = "visibility is invalid: "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = ". Skipping setting visibility."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r4, r0)
            r0 = r14
            goto L_0x02ec
        L_0x02eb:
            r0 = r14
        L_0x02ec:
            if (r0 != 0) goto L_0x02ef
            goto L_0x02f5
        L_0x02ef:
            int r0 = r0.intValue()
            r9.v = r0
        L_0x02f5:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r3.c(r0)
            if (r0 == 0) goto L_0x032d
            int r5 = r0.intValue()
            if (r5 >= 0) goto L_0x032e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 67
            r6.<init>(r5)
            java.lang.String r5 = "notificationCount is invalid: "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = ". Skipping setting notificationCount."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r12, r0)
            r0 = r14
            goto L_0x032e
        L_0x032d:
            r0 = r14
        L_0x032e:
            if (r0 != 0) goto L_0x0331
            goto L_0x0337
        L_0x0331:
            int r0 = r0.intValue()
            r9.i = r0
        L_0x0337:
            java.lang.String r5 = "gcm.n.event_time"
            java.lang.String r6 = r3.a(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0387
            long r15 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x034c }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ NumberFormatException -> 0x034c }
            goto L_0x0388
        L_0x034c:
            r0 = move-exception
            java.lang.String r0 = defpackage.apwx.e(r5)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r10 = java.lang.String.valueOf(r6)
            int r10 = r10.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r5 = r5 + 38
            int r5 = r5 + r10
            r12.<init>(r5)
            java.lang.String r5 = "Couldn't parse value of "
            r12.append(r5)
            r12.append(r0)
            java.lang.String r0 = "("
            r12.append(r0)
            r12.append(r6)
            java.lang.String r0 = ") into a long"
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            android.util.Log.w(r4, r0)
            r0 = r14
            goto L_0x0388
        L_0x0387:
            r0 = r14
        L_0x0388:
            if (r0 != 0) goto L_0x038b
            goto L_0x0394
        L_0x038b:
            r9.k = r1
            long r5 = r0.longValue()
            r9.a((long) r5)
        L_0x0394:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r5 = r3.d(r0)
            if (r5 == 0) goto L_0x03ea
            int r0 = r5.length()     // Catch:{ JSONException -> 0x03c0, NumberFormatException -> 0x03be }
            if (r0 <= r1) goto L_0x03b6
            int r0 = r5.length()     // Catch:{ JSONException -> 0x03c0, NumberFormatException -> 0x03be }
            long[] r6 = new long[r0]     // Catch:{ JSONException -> 0x03c0, NumberFormatException -> 0x03be }
            r10 = 0
        L_0x03aa:
            if (r10 >= r0) goto L_0x03b5
            long r15 = r5.optLong(r10)     // Catch:{ JSONException -> 0x03c0, NumberFormatException -> 0x03be }
            r6[r10] = r15     // Catch:{ JSONException -> 0x03c0, NumberFormatException -> 0x03be }
            int r10 = r10 + 1
            goto L_0x03aa
        L_0x03b5:
            goto L_0x03eb
        L_0x03b6:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x03c0, NumberFormatException -> 0x03be }
            java.lang.String r6 = "vibrateTimings have invalid length"
            r0.<init>(r6)     // Catch:{ JSONException -> 0x03c0, NumberFormatException -> 0x03be }
            throw r0     // Catch:{ JSONException -> 0x03c0, NumberFormatException -> 0x03be }
        L_0x03be:
            r0 = move-exception
            goto L_0x03c1
        L_0x03c0:
            r0 = move-exception
        L_0x03c1:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 74
            r6.<init>(r5)
            java.lang.String r5 = "User defined vibrateTimings is invalid: "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = ". Skipping setting vibrateTimings."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r4, r0)
            r6 = r14
            goto L_0x03eb
        L_0x03ea:
            r6 = r14
        L_0x03eb:
            if (r6 != 0) goto L_0x03ee
            goto L_0x03f1
        L_0x03ee:
            r9.a((long[]) r6)
        L_0x03f1:
            java.lang.String r0 = "gcm.n.light_settings"
            org.json.JSONArray r5 = r3.d(r0)
            if (r5 == 0) goto L_0x048f
            r0 = 3
            int[] r6 = new int[r0]
            int r10 = r5.length()     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            if (r10 != r0) goto L_0x0428
            java.lang.String r0 = r5.optString(r13)     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == r10) goto L_0x0420
            r6[r13] = r0     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            int r0 = r5.optInt(r1)     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            r6[r1] = r0     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            int r0 = r5.optInt(r11)     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            r6[r11] = r0     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            r14 = r6
            goto L_0x0490
        L_0x0420:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            java.lang.String r6 = "Transparent color is invalid"
            r0.<init>(r6)     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            throw r0     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
        L_0x0428:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            java.lang.String r6 = "lightSettings don't have all three fields"
            r0.<init>(r6)     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
            throw r0     // Catch:{ JSONException -> 0x046a, IllegalArgumentException -> 0x0430 }
        L_0x0430:
            r0 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r10 = r10.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r6 = r6 + 60
            int r6 = r6 + r10
            r12.<init>(r6)
            r12.append(r8)
            r12.append(r5)
            java.lang.String r5 = ". "
            r12.append(r5)
            r12.append(r0)
            r12.append(r7)
            java.lang.String r0 = r12.toString()
            android.util.Log.w(r4, r0)
            goto L_0x0490
        L_0x046a:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 58
            r6.<init>(r5)
            r6.append(r8)
            r6.append(r0)
            r6.append(r7)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r4, r0)
            goto L_0x0490
        L_0x048f:
        L_0x0490:
            if (r14 == 0) goto L_0x04bb
            r0 = r14[r13]
            r4 = r14[r1]
            r5 = r14[r11]
            android.app.Notification r6 = r9.C
            r6.ledARGB = r0
            android.app.Notification r0 = r9.C
            r0.ledOnMS = r4
            android.app.Notification r0 = r9.C
            r0.ledOffMS = r5
            android.app.Notification r0 = r9.C
            int r0 = r0.ledOnMS
            if (r0 == 0) goto L_0x04b2
            android.app.Notification r0 = r9.C
            int r0 = r0.ledOffMS
            if (r0 == 0) goto L_0x04b2
            r13 = 1
            goto L_0x04b3
        L_0x04b2:
        L_0x04b3:
            android.app.Notification r0 = r9.C
            int r1 = r0.flags
            r1 = r1 & r2
            r1 = r1 | r13
            r0.flags = r1
        L_0x04bb:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r3.b(r0)
            java.lang.String r1 = "gcm.n.default_vibrate_timings"
            boolean r1 = r3.b(r1)
            if (r1 != 0) goto L_0x04cb
            goto L_0x04cd
        L_0x04cb:
            r0 = r0 | 2
        L_0x04cd:
            java.lang.String r1 = "gcm.n.default_light_settings"
            boolean r1 = r3.b(r1)
            if (r1 != 0) goto L_0x04d7
            goto L_0x04d9
        L_0x04d7:
            r0 = r0 | 4
        L_0x04d9:
            r9.a((int) r0)
            apwu r0 = new apwu
            java.lang.String r1 = "gcm.n.tag"
            java.lang.String r1 = r3.a(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0501
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "FCM-Notification:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x0501:
            r0.<init>(r9, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apwv.a(android.content.Context, java.lang.String, apwx, java.lang.String, android.content.res.Resources, android.content.pm.PackageManager, android.os.Bundle):apwu");
    }

    private static Integer a(Context context, String str, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(kf.b(context, i2));
        } catch (Resources.NotFoundException e2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static boolean a(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException e) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    static boolean a(apwx apwx) {
        return apwx.b("google.c.a.e");
    }
}
