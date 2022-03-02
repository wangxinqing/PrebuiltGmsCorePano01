package defpackage;

import com.google.android.chimera.IntentOperation;

/* renamed from: lwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lwi extends IntentOperation {
    public lwf a;
    public lts b;

    public final void onCreate() {
        lww.a();
        this.b = lww.e(getApplicationContext());
        lww.a();
        this.a = lww.g(getApplicationContext());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r15) {
        /*
            r14 = this;
            java.lang.String r0 = r15.getAction()
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = r15.getAction()
            int r1 = r0.hashCode()
            r2 = -480690540(0xffffffffe3593e94, float:-4.0074527E21)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0025
            r2 = 1918395325(0x725863bd, float:4.2860377E30)
            if (r1 == r2) goto L_0x001b
            goto L_0x002f
        L_0x001b:
            java.lang.String r1 = "com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SNOOZE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            r0 = 0
            goto L_0x0030
        L_0x0025:
            java.lang.String r1 = "com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SHOW"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = -1
        L_0x0030:
            java.lang.String r1 = "CAR.DRIVINGMODE"
            if (r0 == 0) goto L_0x005f
            if (r0 == r4) goto L_0x0054
            java.lang.String r15 = r15.getAction()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "Unexpected notification intent action received: "
            int r2 = r15.length()
            if (r2 != 0) goto L_0x004c
            java.lang.String r15 = new java.lang.String
            r15.<init>(r0)
            goto L_0x0050
        L_0x004c:
            java.lang.String r15 = r0.concat(r15)
        L_0x0050:
            android.util.Log.w(r1, r15)
            return
        L_0x0054:
            lwf r15 = r14.a
            r15.b()
            lwf r15 = r14.a
            r15.a()
            return
        L_0x005f:
            java.lang.String r15 = "Snooze Driving Mode launch from notification."
            android.util.Log.i(r1, r15)
            lts r15 = r14.b
            anxx r0 = defpackage.anxx.DRIVING_MODE
            anxw r1 = defpackage.anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE
            r15.a((defpackage.anxx) r0, (defpackage.anxw) r1)
            lwf r15 = r14.a
            r15.k()
            long r0 = defpackage.awqy.c()
            long r5 = android.os.SystemClock.elapsedRealtime()
            jbs r7 = r15.a
            r9 = 3
            long r10 = r5 + r0
            android.app.PendingIntent r12 = r15.j()
            java.lang.String r8 = "CAR.DRIVINGMODE"
            java.lang.String r13 = ""
            r7.b((java.lang.String) r8, (int) r9, (long) r10, (android.app.PendingIntent) r12, (java.lang.String) r13)
            jc r2 = new jc
            android.content.Context r5 = r15.c
            r6 = 2131952011(0x7f13018b, float:1.9540453E38)
            java.lang.String r5 = r5.getString(r6)
            android.app.PendingIntent r6 = r15.h()
            r2.<init>(r3, r5, r6)
            jc r5 = new jc
            android.content.Context r6 = r15.c
            r7 = 2131952046(0x7f1301ae, float:1.9540524E38)
            java.lang.String r6 = r6.getString(r7)
            android.app.PendingIntent r7 = r15.i()
            r5.<init>(r3, r6, r7)
            r3 = 2131820551(0x7f110007, float:1.927382E38)
            r6 = 2131820552(0x7f110008, float:1.9273822E38)
            java.lang.String r0 = r15.a(r0, r3, r6)
            je r1 = r15.f()
            r1.b((java.lang.CharSequence) r0)
            jd r3 = new jd
            r3.<init>()
            r3.a((java.lang.CharSequence) r0)
            r1.a((defpackage.jh) r3)
            r1.b((boolean) r4)
            r1.a((defpackage.jc) r2)
            r1.a((defpackage.jc) r5)
            r0 = 50384636(0x300cefc, float:3.7853426E-37)
            android.app.Notification r1 = r1.b()
            r15.a(r0, r1)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwi.onHandleIntent(android.content.Intent):void");
    }
}
