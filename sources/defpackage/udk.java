package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: udk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udk {
    public boolean a = true;
    private final Context b;
    private final thb c;
    private final Map d;
    private final arxk e;
    private final jiq f;
    private final ttf g;
    private final tsu h;

    public udk(Context context) {
        this.b = context;
        this.d = new HashMap();
        this.c = (thb) thl.a(context, thb.class);
        this.e = (arxk) thl.a(context, arxk.class);
        this.f = (jiq) thl.a(context, jiq.class);
        this.g = (ttf) thl.a(context, ttf.class);
        this.h = (tsu) thl.a(context, tsu.class);
        if (udl.a()) {
            c();
        }
    }

    private final NotificationChannel a(String str, String str2, int i, String str3) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setGroup(str3);
        if (i >= 4) {
            notificationChannel.setSound(udg.a(this.b), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            notificationChannel.enableVibration(false);
        }
        return notificationChannel;
    }

    private static String b(String str) {
        return str == null ? "" : str;
    }

    private final void c() {
        this.c.a(new NotificationChannelGroup("NEARBY_CHANNEL_GROUP_ID", this.b.getString(R.string.common_nearby_title)));
        this.c.a(new NotificationChannelGroup("DEVICES_CHANNEL_GROUP_ID", this.b.getResources().getString(R.string.common_devices)));
        this.c.a(a("DEVICES_WITHIN_REACH_REBRANDED", this.b.getResources().getString(R.string.devices_within_reach_channel_name), 4, "DEVICES_CHANNEL_GROUP_ID"));
        this.c.a(a("DEVICES_REBRANDED", this.b.getResources().getString(R.string.common_devices), 2, "DEVICES_CHANNEL_GROUP_ID"));
        this.c.a(a("DEVICES_WITH_YOUR_ACCOUNT", this.b.getResources().getString(R.string.devices_with_your_account_channel_name), 1, "DEVICES_CHANNEL_GROUP_ID"));
    }

    public final void a() {
        this.a = true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.c.a("DEVICES_WITH_YOUR_ACCOUNT") == null || this.c.a("DEVICES_REBRANDED") == null || this.c.a("DEVICES_WITHIN_REACH_REBRANDED") == null) {
            c();
        }
    }

    private final PendingIntent a(Intent intent, int i) {
        return PendingIntent.getService(this.b, i, intent, 134217728);
    }

    private final void a(asom asom, udi udi) {
        int a2 = udl.a(udi.o);
        boolean z = udi.h;
        this.h.a(asom, this.g.e(udi.b), Integer.valueOf(a2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r6, android.content.Context r7) {
        /*
            r5 = this;
            boolean r0 = defpackage.udl.a()
            if (r0 == 0) goto L_0x0061
            java.lang.Class<udk> r0 = defpackage.udk.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r7, (java.lang.Class) r0)
            udk r0 = (defpackage.udk) r0
            r0.b()
            int r0 = r6.hashCode()
            r1 = -1724415528(0xffffffff993781d8, float:-9.4871E-24)
            r2 = 2
            r3 = 1
            java.lang.String r4 = "DEVICES_REBRANDED"
            if (r0 == r1) goto L_0x003b
            r1 = -618582347(0xffffffffdb212eb5, float:-4.5368826E16)
            if (r0 == r1) goto L_0x0031
            r1 = -292229199(0xffffffffee94efb1, float:-2.3046775E28)
            if (r0 == r1) goto L_0x0029
            goto L_0x0045
        L_0x0029:
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0031:
            java.lang.String r0 = "DEVICES_WITHIN_REACH_REBRANDED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0045
            r0 = 0
            goto L_0x0046
        L_0x003b:
            java.lang.String r0 = "DEVICES_WITH_YOUR_ACCOUNT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0045
            r0 = 2
            goto L_0x0046
        L_0x0045:
            r0 = -1
        L_0x0046:
            if (r0 == 0) goto L_0x0056
            r1 = 0
            if (r0 == r3) goto L_0x004e
            if (r0 == r2) goto L_0x004e
            return r1
        L_0x004e:
            boolean r7 = defpackage.udl.a(r7, r6)
            if (r7 == 0) goto L_0x0055
            return r6
        L_0x0055:
            return r1
        L_0x0056:
            boolean r0 = defpackage.udl.a(r7, r6)
            if (r0 != 0) goto L_0x0060
            java.lang.String r6 = r5.a((java.lang.String) r4, (android.content.Context) r7)
        L_0x0060:
            return r6
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udk.a(java.lang.String, android.content.Context):java.lang.String");
    }

    public final void a(String str) {
        this.c.a(str.hashCode());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List r17) {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            boolean r0 = r1.a     // Catch:{ all -> 0x02a5 }
            if (r0 == 0) goto L_0x007d
            jiq r0 = r1.f     // Catch:{ all -> 0x02a5 }
            long r2 = r0.a()     // Catch:{ all -> 0x02a5 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x02a5 }
            int r4 = r17.size()     // Catch:{ all -> 0x02a5 }
            r0.<init>(r4)     // Catch:{ all -> 0x02a5 }
            ob r4 = new ob     // Catch:{ all -> 0x02a5 }
            r4.<init>()     // Catch:{ all -> 0x02a5 }
            java.util.Iterator r5 = r17.iterator()     // Catch:{ all -> 0x02a5 }
        L_0x001f:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x02a5 }
            if (r6 == 0) goto L_0x004d
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x02a5 }
            udi r6 = (defpackage.udi) r6     // Catch:{ all -> 0x02a5 }
            java.lang.String r7 = r6.a     // Catch:{ all -> 0x02a5 }
            udj r8 = new udj     // Catch:{ all -> 0x02a5 }
            r8.<init>(r2, r6)     // Catch:{ all -> 0x02a5 }
            r0.put(r7, r8)     // Catch:{ all -> 0x02a5 }
            java.util.Map r7 = r1.d     // Catch:{ all -> 0x02a5 }
            java.lang.String r8 = r6.a     // Catch:{ all -> 0x02a5 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x02a5 }
            udj r7 = (defpackage.udj) r7     // Catch:{ all -> 0x02a5 }
            if (r7 == 0) goto L_0x0049
            udi r7 = r7.b     // Catch:{ all -> 0x02a5 }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x02a5 }
            if (r7 != 0) goto L_0x001f
        L_0x0049:
            r4.add(r6)     // Catch:{ all -> 0x02a5 }
            goto L_0x001f
        L_0x004d:
            ob r5 = new ob     // Catch:{ all -> 0x02a5 }
            java.util.Map r6 = r1.d     // Catch:{ all -> 0x02a5 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x02a5 }
            r5.<init>((java.util.Collection) r6)     // Catch:{ all -> 0x02a5 }
            java.util.Set r6 = r0.keySet()     // Catch:{ all -> 0x02a5 }
            r5.removeAll(r6)     // Catch:{ all -> 0x02a5 }
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x02a5 }
            if (r6 == 0) goto L_0x007f
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x02a5 }
            if (r6 != 0) goto L_0x006c
            goto L_0x007f
        L_0x006c:
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x02a5 }
            anie r0 = r0.d()     // Catch:{ all -> 0x02a5 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x02a5 }
            java.lang.String r2 = "Show notifications: %d total, no changes since last shown, no-op."
            int r3 = r17.size()     // Catch:{ all -> 0x02a5 }
            r0.a((java.lang.String) r2, (int) r3)     // Catch:{ all -> 0x02a5 }
        L_0x007d:
            monitor-exit(r16)
            return
        L_0x007f:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02a5 }
            jjg r6 = defpackage.tsp.a     // Catch:{ all -> 0x02a5 }
            anie r6 = r6.d()     // Catch:{ all -> 0x02a5 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x02a5 }
            java.lang.String r7 = "Show notifications: %d total, showing %d new or changed, removing %d old"
            int r8 = r17.size()     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x02a5 }
            int r9 = r4.b     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x02a5 }
            int r10 = r5.b     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02a5 }
            r6.a((java.lang.String) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10)     // Catch:{ all -> 0x02a5 }
            ob r6 = new ob     // Catch:{ all -> 0x02a5 }
            java.util.Set r7 = r0.keySet()     // Catch:{ all -> 0x02a5 }
            r6.<init>((java.util.Collection) r7)     // Catch:{ all -> 0x02a5 }
            java.util.Map r7 = r1.d     // Catch:{ all -> 0x02a5 }
            java.util.Set r7 = r7.keySet()     // Catch:{ all -> 0x02a5 }
            r6.removeAll(r7)     // Catch:{ all -> 0x02a5 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x02a5 }
        L_0x00b8:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x02a5 }
            if (r7 == 0) goto L_0x00d4
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x02a5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x02a5 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x02a5 }
            udj r7 = (defpackage.udj) r7     // Catch:{ all -> 0x02a5 }
            udi r7 = r7.b     // Catch:{ all -> 0x02a5 }
            int r8 = r7.n     // Catch:{ all -> 0x02a5 }
            asom r8 = defpackage.asom.NOTIFICATION_TRIGGERED     // Catch:{ all -> 0x02a5 }
            r1.a((defpackage.asom) r8, (defpackage.udi) r7)     // Catch:{ all -> 0x02a5 }
            goto L_0x00b8
        L_0x00d4:
            android.content.Context r6 = r1.b     // Catch:{ all -> 0x02a5 }
            java.lang.Class<udf> r7 = defpackage.udf.class
            java.lang.Object r6 = defpackage.thl.a((android.content.Context) r6, (java.lang.Class) r7)     // Catch:{ all -> 0x02a5 }
            udf r6 = (defpackage.udf) r6     // Catch:{ all -> 0x02a5 }
            java.util.Iterator r7 = r4.iterator()     // Catch:{ all -> 0x02a5 }
        L_0x00e2:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02a5 }
            if (r8 == 0) goto L_0x022f
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02a5 }
            udi r8 = (defpackage.udi) r8     // Catch:{ all -> 0x02a5 }
            boolean r9 = r8.q     // Catch:{ all -> 0x02a5 }
            if (r9 == 0) goto L_0x00fc
            twb r9 = new twb     // Catch:{ all -> 0x02a5 }
            android.content.Context r10 = r1.b     // Catch:{ all -> 0x02a5 }
            boolean r11 = r8.r     // Catch:{ all -> 0x02a5 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x02a5 }
            goto L_0x0103
        L_0x00fc:
            udg r9 = new udg     // Catch:{ all -> 0x02a5 }
            android.content.Context r10 = r1.b     // Catch:{ all -> 0x02a5 }
            r9.<init>(r10)     // Catch:{ all -> 0x02a5 }
        L_0x0103:
            java.lang.String r10 = r8.o     // Catch:{ all -> 0x02a5 }
            r9.a((java.lang.String) r10)     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = r8.c     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = b(r10)     // Catch:{ all -> 0x02a5 }
            java.lang.String r11 = r8.d     // Catch:{ all -> 0x02a5 }
            java.lang.String r11 = b(r11)     // Catch:{ all -> 0x02a5 }
            int r12 = r10.length()     // Catch:{ all -> 0x02a5 }
            int r13 = r11.length()     // Catch:{ all -> 0x02a5 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a5 }
            int r12 = r12 + 2
            int r12 = r12 + r13
            r14.<init>(r12)     // Catch:{ all -> 0x02a5 }
            r14.append(r10)     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = ": "
            r14.append(r10)     // Catch:{ all -> 0x02a5 }
            r14.append(r11)     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = r14.toString()     // Catch:{ all -> 0x02a5 }
            r9.b(r10)     // Catch:{ all -> 0x02a5 }
            boolean r10 = r8.p     // Catch:{ all -> 0x02a5 }
            r9.d(r10)     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = "recommendation"
            r9.s = r10     // Catch:{ all -> 0x02a5 }
            android.content.Context r10 = r1.b     // Catch:{ all -> 0x02a5 }
            r11 = 2131099911(0x7f060107, float:1.7812189E38)
            int r10 = defpackage.kf.b(r10, r11)     // Catch:{ all -> 0x02a5 }
            r9.u = r10     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = r8.c     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = b(r10)     // Catch:{ all -> 0x02a5 }
            r9.e(r10)     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = r8.d     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = b(r10)     // Catch:{ all -> 0x02a5 }
            r9.b((java.lang.CharSequence) r10)     // Catch:{ all -> 0x02a5 }
            int r10 = r8.f     // Catch:{ all -> 0x02a5 }
            r9.b((int) r10)     // Catch:{ all -> 0x02a5 }
            r10 = 0
            r9.q = r10     // Catch:{ all -> 0x02a5 }
            boolean r10 = r8.h     // Catch:{ all -> 0x02a5 }
            android.content.Intent r10 = r8.k     // Catch:{ all -> 0x02a5 }
            java.lang.String r11 = r8.a     // Catch:{ all -> 0x02a5 }
            int r11 = r11.hashCode()     // Catch:{ all -> 0x02a5 }
            android.app.PendingIntent r10 = r1.a((android.content.Intent) r10, (int) r11)     // Catch:{ all -> 0x02a5 }
            r9.b((android.app.PendingIntent) r10)     // Catch:{ all -> 0x02a5 }
            android.content.Intent r10 = r8.j     // Catch:{ all -> 0x02a5 }
            java.lang.String r11 = r8.a     // Catch:{ all -> 0x02a5 }
            int r11 = r11.hashCode()     // Catch:{ all -> 0x02a5 }
            android.app.PendingIntent r10 = r1.a((android.content.Intent) r10, (int) r11)     // Catch:{ all -> 0x02a5 }
            r9.a((android.app.PendingIntent) r10)     // Catch:{ all -> 0x02a5 }
            boolean r10 = r8.m     // Catch:{ all -> 0x02a5 }
            r10 = 1
            r9.a((boolean) r10)     // Catch:{ all -> 0x02a5 }
            r9.c()     // Catch:{ all -> 0x02a5 }
            android.graphics.Bitmap r11 = r8.g     // Catch:{ all -> 0x02a5 }
            if (r11 == 0) goto L_0x019f
            boolean r12 = r8.p     // Catch:{ all -> 0x02a5 }
            if (r12 == 0) goto L_0x019b
            android.content.Context r12 = r1.b     // Catch:{ all -> 0x02a5 }
            android.graphics.Bitmap r11 = defpackage.aryg.a(r12, r11)     // Catch:{ all -> 0x02a5 }
        L_0x019b:
            r9.a((android.graphics.Bitmap) r11)     // Catch:{ all -> 0x02a5 }
            goto L_0x01be
        L_0x019f:
            boolean r11 = defpackage.jkr.c()     // Catch:{ all -> 0x02a5 }
            if (r11 == 0) goto L_0x01b2
            arxk r11 = r1.e     // Catch:{ all -> 0x02a5 }
            r12 = 2131231973(0x7f0804e5, float:1.8080042E38)
            android.graphics.Bitmap r11 = r11.a((int) r12)     // Catch:{ all -> 0x02a5 }
            r9.a((android.graphics.Bitmap) r11)     // Catch:{ all -> 0x02a5 }
            goto L_0x01be
        L_0x01b2:
            arxk r11 = r1.e     // Catch:{ all -> 0x02a5 }
            r12 = 2131231120(0x7f080190, float:1.8078312E38)
            android.graphics.Bitmap r11 = r11.a((int) r12)     // Catch:{ all -> 0x02a5 }
            r9.a((android.graphics.Bitmap) r11)     // Catch:{ all -> 0x02a5 }
        L_0x01be:
            java.lang.String r11 = r8.e     // Catch:{ all -> 0x02a5 }
            if (r11 == 0) goto L_0x01c5
            r9.c((java.lang.CharSequence) r11)     // Catch:{ all -> 0x02a5 }
        L_0x01c5:
            boolean r11 = defpackage.jkr.c()     // Catch:{ all -> 0x02a5 }
            if (r11 == 0) goto L_0x01ce
            boolean r11 = r8.h     // Catch:{ all -> 0x02a5 }
            goto L_0x01d0
        L_0x01ce:
            boolean r11 = r8.h     // Catch:{ all -> 0x02a5 }
        L_0x01d0:
            boolean r11 = r8.l     // Catch:{ all -> 0x02a5 }
            if (r11 == 0) goto L_0x021c
            android.content.Context r11 = r1.b     // Catch:{ all -> 0x02a5 }
            r12 = 2131231987(0x7f0804f3, float:1.808007E38)
            int r11 = defpackage.hdg.a(r11, r12)     // Catch:{ all -> 0x02a5 }
            android.content.Context r12 = r1.b     // Catch:{ all -> 0x02a5 }
            r13 = 2131952477(0x7f13035d, float:1.9541398E38)
            java.lang.String r12 = r12.getString(r13)     // Catch:{ all -> 0x02a5 }
            java.lang.String r13 = r8.b     // Catch:{ all -> 0x02a5 }
            java.lang.String r14 = r8.o     // Catch:{ all -> 0x02a5 }
            int r14 = defpackage.udl.a(r14)     // Catch:{ all -> 0x02a5 }
            int r15 = r8.n     // Catch:{ all -> 0x02a5 }
            android.content.Context r15 = r6.a     // Catch:{ all -> 0x02a5 }
            android.content.Intent r15 = com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService.a((android.content.Context) r15)     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = "com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_DO_NOT_SHOW_AGAIN_CLICK"
            android.content.Intent r10 = r15.setAction(r10)     // Catch:{ all -> 0x02a5 }
            java.lang.String r15 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID"
            android.content.Intent r10 = r10.putExtra(r15, r13)     // Catch:{ all -> 0x02a5 }
            java.lang.String r13 = "com.google.android.gms.nearby.discovery.EXTRA_PRIORITY"
            android.content.Intent r10 = r10.putExtra(r13, r14)     // Catch:{ all -> 0x02a5 }
            java.lang.String r13 = "com.google.android.gms.nearby.discovery.EXTRA_EDUCATION_POLICY"
            r14 = 1
            android.content.Intent r10 = r10.putExtra(r13, r14)     // Catch:{ all -> 0x02a5 }
            java.lang.String r13 = r8.a     // Catch:{ all -> 0x02a5 }
            int r13 = r13.hashCode()     // Catch:{ all -> 0x02a5 }
            android.app.PendingIntent r10 = r1.a((android.content.Intent) r10, (int) r13)     // Catch:{ all -> 0x02a5 }
            r9.a((int) r11, (java.lang.CharSequence) r12, (android.app.PendingIntent) r10)     // Catch:{ all -> 0x02a5 }
        L_0x021c:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02a5 }
            thb r10 = r1.c     // Catch:{ all -> 0x02a5 }
            java.lang.String r8 = r8.a     // Catch:{ all -> 0x02a5 }
            int r8 = r8.hashCode()     // Catch:{ all -> 0x02a5 }
            android.app.Notification r9 = r9.b()     // Catch:{ all -> 0x02a5 }
            r10.a((int) r8, (android.app.Notification) r9)     // Catch:{ all -> 0x02a5 }
            goto L_0x00e2
        L_0x022f:
            aymw r6 = defpackage.aymw.a     // Catch:{ all -> 0x02a5 }
            aymx r6 = r6.a()     // Catch:{ all -> 0x02a5 }
            boolean r6 = r6.Y()     // Catch:{ all -> 0x02a5 }
            if (r6 == 0) goto L_0x025a
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x02a5 }
            if (r4 != 0) goto L_0x025a
            jjg r4 = defpackage.tsp.a     // Catch:{ all -> 0x02a5 }
            anie r4 = r4.d()     // Catch:{ all -> 0x02a5 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x02a5 }
            java.lang.String r6 = "FastPair: Increasing scan frequency for pairing notification."
            r4.a((java.lang.String) r6)     // Catch:{ all -> 0x02a5 }
            android.content.Context r4 = r1.b     // Catch:{ all -> 0x02a5 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x02a5 }
            java.lang.String r7 = "com.google.android.gms.nearby.ACTION_LOW_LATENCY_SCAN_BURST"
            r6.<init>(r7)     // Catch:{ all -> 0x02a5 }
            r4.sendBroadcast(r6)     // Catch:{ all -> 0x02a5 }
        L_0x025a:
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x02a5 }
        L_0x025e:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x02a5 }
            if (r5 == 0) goto L_0x0299
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x02a5 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02a5 }
            java.util.Map r6 = r1.d     // Catch:{ all -> 0x02a5 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x02a5 }
            udj r6 = (defpackage.udj) r6     // Catch:{ all -> 0x02a5 }
            long r6 = r6.a     // Catch:{ all -> 0x02a5 }
            java.util.Map r8 = r1.d     // Catch:{ all -> 0x02a5 }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x02a5 }
            udj r8 = (defpackage.udj) r8     // Catch:{ all -> 0x02a5 }
            udi r8 = r8.b     // Catch:{ all -> 0x02a5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02a5 }
            boolean r6 = defpackage.ttg.a((long) r2, (java.lang.Long) r6)     // Catch:{ all -> 0x02a5 }
            if (r6 == 0) goto L_0x028f
            int r6 = r8.n     // Catch:{ all -> 0x02a5 }
            asom r6 = defpackage.asom.NOTIFICATION_TIMED_OUT     // Catch:{ all -> 0x02a5 }
            r1.a((defpackage.asom) r6, (defpackage.udi) r8)     // Catch:{ all -> 0x02a5 }
        L_0x028f:
            thb r6 = r1.c     // Catch:{ all -> 0x02a5 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x02a5 }
            r6.a((int) r5)     // Catch:{ all -> 0x02a5 }
            goto L_0x025e
        L_0x0299:
            java.util.Map r2 = r1.d     // Catch:{ all -> 0x02a5 }
            r2.clear()     // Catch:{ all -> 0x02a5 }
            java.util.Map r2 = r1.d     // Catch:{ all -> 0x02a5 }
            r2.putAll(r0)     // Catch:{ all -> 0x02a5 }
            monitor-exit(r16)
            return
        L_0x02a5:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x02a9
        L_0x02a8:
            throw r0
        L_0x02a9:
            goto L_0x02a8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udk.a(java.util.List):void");
    }
}
