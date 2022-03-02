package com.google.android.gms.auth.setup.notification;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PersistentNotificationIntentOperation extends IntentOperation {
    private static final String a = PersistentNotificationIntentOperation.class.getSimpleName();

    public static Intent a(Context context, String str, int i) {
        return IntentOperation.getStartIntent(context, PersistentNotificationIntentOperation.class, "com.google.android.gms.auth.setup.notification.CANCEL").addCategory(str).addCategory(String.valueOf(i)).putExtra("tag", str).putExtra("id", i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = java.lang.String.valueOf(r17)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 17
            r3.<init>(r2)
            java.lang.String r2 = "Received intent: "
            r3.append(r2)
            r3.append(r1)
            r3.toString()
            java.lang.String r1 = r17.getAction()
            int r2 = r1.hashCode()
            r3 = 798292259(0x2f94f923, float:2.7098065E-10)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x003f
            r3 = 855344238(0x32fb846e, float:2.9280468E-8)
            if (r2 == r3) goto L_0x0035
            goto L_0x0049
        L_0x0035:
            java.lang.String r2 = "com.google.android.gms.auth.setup.notification.CANCEL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x003f:
            java.lang.String r2 = "android.intent.action.BOOT_COMPLETED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0049
            r1 = 0
            goto L_0x004a
        L_0x0049:
            r1 = -1
        L_0x004a:
            if (r1 == 0) goto L_0x0079
            if (r1 == r5) goto L_0x004f
            return
        L_0x004f:
            java.lang.String r1 = "tag"
            boolean r2 = r0.hasExtra(r1)
            java.lang.String r3 = "id"
            if (r2 != 0) goto L_0x0069
            boolean r2 = r0.hasExtra(r3)
            if (r2 == 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            java.lang.String r0 = a
            java.lang.String r1 = "ACTION_CANCEL_NOTIFICATION intent found without tag or id."
            android.util.Log.w(r0, r1)
            return
        L_0x0069:
            gkw r2 = a(r16)
            java.lang.String r1 = r0.getStringExtra(r1)
            int r0 = r0.getIntExtra(r3, r4)
            r2.a((java.lang.String) r1, (int) r0)
            return
        L_0x0079:
            gkw r0 = a(r16)
            android.content.SharedPreferences r1 = defpackage.gkw.a()
            java.util.Map r1 = r1.getAll()
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0135
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r3 = r1.hasNext()
            r6 = 2
            java.lang.String r7 = ":"
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r8 = r3.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String[] r6 = r8.split(r7, r6)
            r7 = r6[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = r7.intValue()
            r6 = r6[r5]
            ihs r8 = defpackage.ihs.b()
            java.lang.Object r9 = r3.getValue()
            java.lang.String r9 = (java.lang.String) r9
            gkx r8 = defpackage.gkx.a((android.content.Context) r8, (java.lang.String) r9)
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = r8.b()
            long r11 = r9 - r11
            long r13 = r8.c()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0102
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Not showing expired notification with tag: "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00ef
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x00f3
        L_0x00ef:
            java.lang.String r6 = r7.concat(r6)
        L_0x00f3:
            java.lang.String r7 = "Auth"
            android.util.Log.i(r7, r6)
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L_0x0098
        L_0x0102:
            r8.b((long) r9)
            long r9 = r8.c()
            long r9 = r9 - r11
            r8.a((long) r9)
            r0.a(r6, r7, r8)
            goto L_0x0098
        L_0x0111:
            java.util.Iterator r1 = r2.iterator()
        L_0x0115:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0135
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String[] r2 = r2.split(r7, r6)
            r3 = r2[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
            r2 = r2[r5]
            r0.a((java.lang.String) r2, (int) r3)
            goto L_0x0115
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.setup.notification.PersistentNotificationIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    private static gkw a(Context context) {
        return new gkw(iwq.a(context), new jbs(context));
    }
}
