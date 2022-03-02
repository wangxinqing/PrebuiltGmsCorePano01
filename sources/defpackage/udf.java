package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: udf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udf extends arza {
    public final Context a;
    public final tsu b;
    private final ttf c;
    private final jiq d;
    private final uan e;
    private final arxg f;
    private final tst g;
    private final arwg h;

    public udf(Context context) {
        this.a = context;
        this.h = (arwg) thl.a(context, arwg.class);
        this.c = (ttf) thl.a(context, ttf.class);
        this.e = (uan) thl.a(context, uan.class);
        this.b = (tsu) thl.a(context, tsu.class);
        this.f = (arxg) thl.a(context, arxg.class);
        this.g = (tst) thl.a(context, tst.class);
        this.d = (jiq) thl.a(context, jiq.class);
    }

    private final void a() {
        jjg jjg = tsp.a;
        this.h.b();
        this.c.a();
        Context context = this.a;
        if (!arxk.a(context, tfx.a(context))) {
            ((anih) tsp.a.c()).a("UserActionHandler: no refresh because of permission");
        }
        ((ubv) thl.a(this.a, ubv.class)).a();
    }

    private static asom b(Intent intent) {
        return (asom) amri.c(asom.a(intent.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", 0))).a((Object) asom.UNKNOWN_DISCOVERY_EVENT);
    }

    private static avbh c(Intent intent) {
        return (avbh) amri.c(avbh.a(intent.getIntExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", 0))).a((Object) avbh.ENTRY_POINT_UNKNOWN);
    }

    private final void d(Intent intent) {
        tzi e2 = e(intent);
        if (e2 == null) {
            ((anih) tsp.a.d()).a("logSliceEvent: Can't get cached Fast Pair device from neither address nor account key.");
            return;
        }
        tsu tsu = this.b;
        asom b2 = b(intent);
        String str = e2.k;
        avbh c2 = c(intent);
        String str2 = (String) amri.c(intent.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP")).a((Object) "unknown");
        if (!aymw.p()) {
            tsu.a(b2);
            return;
        }
        aucd b3 = tsu.b(b2);
        aucd o = auwl.e.o();
        int a2 = tsu.a(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwl auwl = (auwl) o.b;
        int i = auwl.a | 1;
        auwl.a = i;
        auwl.b = a2;
        auwl.c = c2.e;
        int i2 = i | 2;
        auwl.a = i2;
        str2.getClass();
        auwl.a = i2 | 4;
        auwl.d = str2;
        auwl auwl2 = (auwl) o.i();
        if (b3.c) {
            b3.c();
            b3.c = false;
        }
        auwy auwy = (auwy) b3.b;
        auwy auwy2 = auwy.u;
        auwl2.getClass();
        auwy.r = auwl2;
        auwy.a |= 131072;
        tsu.a((auwy) b3.i());
    }

    private final tzi e(Intent intent) {
        if (intent.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS") != null) {
            return this.c.a(intent.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS"));
        }
        if (intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY") != null) {
            return this.c.a(auay.a(intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY")));
        }
        return null;
    }

    private final boolean f(Intent intent) {
        try {
            this.a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e2) {
            return false;
        }
    }

    private final boolean g(Intent intent) {
        return this.a.startService(intent) != null;
    }

    /* access modifiers changed from: package-private */
    public final Intent b(String str, int i) {
        return DiscoveryChimeraService.a(this.a).setAction("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_ITEM_DISMISS").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", i);
    }

    private final void a(ttg ttg, Integer num, udc udc) {
        if (ttg != null) {
            ttg.a(3);
        }
        this.b.a(asom.NOTIFICATION_ITEM_DISMISSED, ttg, num);
        udc.a(ttg);
    }

    public final String b(ttg ttg) {
        return a(ttg, true);
    }

    /* access modifiers changed from: package-private */
    public final Intent a(String str) {
        return DiscoveryChimeraService.a(this.a).setAction("com.google.android.gms.nearby.discovery.ACTION_DEVICES_LIST_ACTIVITY_ITEM_CLICK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str);
    }

    /* access modifiers changed from: package-private */
    public final Intent a(String str, int i) {
        return DiscoveryChimeraService.a(this.a).setAction("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_ITEM_CLICK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", i);
    }

    /* access modifiers changed from: package-private */
    public final String a(ttg ttg) {
        return a(ttg, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0120, code lost:
        if (r13 == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        return r1.a.toUri(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012a, code lost:
        ((defpackage.anih) defpackage.tsp.a.c()).a("Failed to launch intent %s for %s", (java.lang.Object) r1, (java.lang.Object) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0137, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(defpackage.ttg r12, boolean r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0138
            jjg r1 = defpackage.tsp.a
            r12.i()
            avbx r1 = r12.j()
            avbx r2 = defpackage.avbx.NEARBY_CHROMECAST
            r3 = 1
            if (r1 != r2) goto L_0x0089
            aymq r1 = defpackage.aymq.a
            aymr r1 = r1.a()
            boolean r1 = r1.ab()
            if (r1 != 0) goto L_0x001f
            goto L_0x0089
        L_0x001f:
            ttf r1 = r11.c
            ttj r1 = r1.c
            java.util.Collection r1 = r1.f()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r5 = r0
            r4 = 0
        L_0x002e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x006f
            java.lang.Object r6 = r1.next()
            ual r6 = (defpackage.ual) r6
            jiq r7 = r11.d
            long r7 = r7.a()
            int r9 = r6.a
            r9 = r9 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x004d
            long r9 = r6.j
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x004e
        L_0x004d:
            r9 = r0
        L_0x004e:
            boolean r7 = defpackage.ttg.a((long) r7, (java.lang.Long) r9)
            if (r7 != 0) goto L_0x006d
            int r7 = r6.c
            avbx r7 = defpackage.avbx.a(r7)
            if (r7 != 0) goto L_0x005e
            avbx r7 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x005e:
            avbx r8 = defpackage.avbx.NEARBY_CHROMECAST
            if (r7 != r8) goto L_0x006d
            int r7 = r6.a
            r7 = r7 & 32
            if (r7 == 0) goto L_0x006d
            int r4 = r4 + 1
            java.lang.String r5 = r6.g
            goto L_0x002e
        L_0x006d:
            goto L_0x002e
        L_0x006f:
            if (r4 != r3) goto L_0x0084
            aymq r1 = defpackage.aymq.a
            aymr r1 = r1.a()
            java.lang.String r1 = r1.b()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r5
            java.lang.String r1 = java.lang.String.format(r1, r4)
            goto L_0x008d
        L_0x0084:
            java.lang.String r1 = defpackage.aymq.b()
            goto L_0x008d
        L_0x0089:
            java.lang.String r1 = r12.t()
        L_0x008d:
            uan r2 = r11.e
            uam r1 = r2.a((java.lang.String) r1, (defpackage.ttg) r12)
            int r2 = r1.b
            if (r2 != 0) goto L_0x00a9
            jjg r13 = defpackage.tsp.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            java.lang.String r12 = r12.i()
            java.lang.String r1 = "UserActionHandler action URL type unknown for ID %s"
            r13.a((java.lang.String) r1, (java.lang.Object) r12)
            return r0
        L_0x00a9:
            r4 = 4
            if (r2 != r4) goto L_0x00cc
            tst r2 = r11.g
            arwg r4 = r2.b
            r4.b()
            jiq r4 = r2.d
            long r4 = r4.a()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r12.a((java.lang.Long) r4)
            arxg r2 = r2.e
            r2.b(r3)
            tsu r2 = r11.b
            asom r4 = defpackage.asom.REDIRECTED_TO_PLAYSTORE
            r2.a((defpackage.asom) r4, (defpackage.ttg) r12)
        L_0x00cc:
            android.content.Intent r2 = r1.a
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r4)
            if (r13 == 0) goto L_0x00dd
            android.content.Intent r13 = r1.a
            r2 = 32768(0x8000, float:4.5918E-41)
            r13.addFlags(r2)
        L_0x00dd:
            avbx r13 = r12.j()
            avbx r2 = defpackage.avbx.NEARBY_DEVICE
            if (r13 != r2) goto L_0x00f0
            android.content.Intent r4 = r1.a
            java.lang.String r5 = r12.i()
            java.lang.String r6 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID"
            r4.putExtra(r6, r5)
        L_0x00f0:
            int r4 = r1.b
            switch(r4) {
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0110;
                case 4: goto L_0x0109;
                case 5: goto L_0x0100;
                case 6: goto L_0x00f6;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            goto L_0x012a
        L_0x00f6:
            if (r13 != r2) goto L_0x012a
            android.content.Intent r12 = r1.a
            android.content.Context r13 = r11.a
            r13.sendBroadcast(r12)
            goto L_0x0123
        L_0x0100:
            if (r13 != r2) goto L_0x012a
            android.content.Intent r13 = r1.a
            boolean r13 = r11.g(r13)
            goto L_0x0120
        L_0x0109:
            android.content.Intent r13 = r1.a
            boolean r13 = r11.f(r13)
            goto L_0x0120
        L_0x0110:
            android.content.Intent r13 = r1.a
            boolean r13 = r11.f(r13)
            if (r13 != 0) goto L_0x011f
            android.content.Intent r13 = r1.a
            boolean r13 = r11.g(r13)
            goto L_0x0120
        L_0x011f:
        L_0x0120:
            if (r13 != 0) goto L_0x0123
            goto L_0x012a
        L_0x0123:
            android.content.Intent r12 = r1.a
            java.lang.String r12 = r12.toUri(r3)
            return r12
        L_0x012a:
            jjg r13 = defpackage.tsp.a
            anie r13 = r13.c()
            anih r13 = (defpackage.anih) r13
            java.lang.String r2 = "Failed to launch intent %s for %s"
            r13.a((java.lang.String) r2, (java.lang.Object) r1, (java.lang.Object) r12)
            return r0
        L_0x0138:
            jjg r12 = defpackage.tsp.a
            anie r12 = r12.b()
            anih r12 = (defpackage.anih) r12
            java.lang.String r13 = "UserActionHandler.launchItem() failed due to nonexistent item"
            r12.a((java.lang.String) r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udf.a(ttg, boolean):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            arwg r2 = r1.h
            r2.b()
            java.lang.String r2 = r23.getAction()
            jjg r3 = defpackage.tsp.a
            if (r2 != 0) goto L_0x001f
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "UserActionHandler action is null. (Invoked from an explicit action)"
            r0.a((java.lang.String) r2)
            return
        L_0x001f:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.EXTRA_PRIORITY"
            boolean r4 = r0.hasExtra(r3)
            r6 = 0
            if (r4 == 0) goto L_0x0032
            int r3 = r0.getIntExtra(r3, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID"
            java.lang.String r4 = r0.getStringExtra(r4)
            java.lang.String r7 = "Got invalid item ID %s"
            if (r4 == 0) goto L_0x0052
            ttf r8 = r1.c
            ttg r8 = r8.e(r4)
            if (r8 != 0) goto L_0x0053
            jjg r9 = defpackage.tsp.a
            anie r9 = r9.b()
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.String) r7, (java.lang.Object) r4)
            goto L_0x0053
        L_0x0052:
            r8 = 0
        L_0x0053:
            java.lang.String r9 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_IDS"
            java.util.ArrayList r9 = r0.getStringArrayListExtra(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r9 == 0) goto L_0x0090
            int r11 = r9.size()
            r10.ensureCapacity(r11)
            int r11 = r9.size()
            r12 = 0
        L_0x006d:
            if (r12 < r11) goto L_0x0070
            goto L_0x0090
        L_0x0070:
            java.lang.Object r13 = r9.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            ttf r14 = r1.c
            ttg r13 = r14.e(r13)
            if (r13 != 0) goto L_0x008a
            jjg r13 = defpackage.tsp.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            r13.a((java.lang.String) r7, (java.lang.Object) r4)
            goto L_0x008d
        L_0x008a:
            r10.add(r13)
        L_0x008d:
            int r12 = r12 + 1
            goto L_0x006d
        L_0x0090:
            udd r7 = new udd
            java.lang.String r11 = "enable_certain_device"
            r7.<init>(r1, r11, r4)
            ude r11 = new ude
            java.lang.String r12 = "disable_certain_device"
            r11.<init>(r1, r12, r4)
            java.lang.String r12 = "com.google.android.gms.nearby.discovery.EXTRA_EDUCATION_POLICY"
            r13 = 1
            r0.getIntExtra(r12, r13)
            android.content.Context r12 = r1.a
            java.lang.Class<udc> r14 = defpackage.udc.class
            java.lang.Object r12 = defpackage.thl.a((android.content.Context) r12, (java.lang.Class) r14)
            udc r12 = (defpackage.udc) r12
            int r14 = r2.hashCode()
            switch(r14) {
                case -2122686684: goto L_0x0203;
                case -2009311105: goto L_0x01f8;
                case -1849521411: goto L_0x01ed;
                case -1759314675: goto L_0x01e3;
                case -1686246004: goto L_0x01d8;
                case -1621693364: goto L_0x01ce;
                case -1582561631: goto L_0x01c3;
                case -971464229: goto L_0x01b8;
                case -529691762: goto L_0x01ad;
                case -479424124: goto L_0x01a1;
                case -463575145: goto L_0x0195;
                case -209719977: goto L_0x0189;
                case -64709038: goto L_0x017d;
                case 48867774: goto L_0x0172;
                case 201750478: goto L_0x0167;
                case 266148446: goto L_0x015c;
                case 292447751: goto L_0x0150;
                case 292902778: goto L_0x0144;
                case 379222929: goto L_0x0138;
                case 589591761: goto L_0x012d;
                case 646648716: goto L_0x0121;
                case 663976884: goto L_0x0115;
                case 900193546: goto L_0x0109;
                case 1274921945: goto L_0x00fd;
                case 1401833397: goto L_0x00f1;
                case 1436955726: goto L_0x00e5;
                case 1445757256: goto L_0x00da;
                case 1487727224: goto L_0x00ce;
                case 1638558651: goto L_0x00c3;
                case 2131315984: goto L_0x00b7;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            goto L_0x020e
        L_0x00b7:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_QS_TILE_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 17
            goto L_0x020f
        L_0x00c3:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_DEVICES_LIST_ACTIVITY_ITEM_VIEWED"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 5
            goto L_0x020f
        L_0x00ce:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_GROUP_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 10
            goto L_0x020f
        L_0x00da:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_REFRESH"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 0
            goto L_0x020f
        L_0x00e5:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_ITEM_DISMISS"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 8
            goto L_0x020f
        L_0x00f1:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_USER_FEEDBACK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 22
            goto L_0x020f
        L_0x00fd:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LIST_ITEM_DISABLE"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 20
            goto L_0x020f
        L_0x0109:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_OPT_IN_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 13
            goto L_0x020f
        L_0x0115:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_LAUNCH_INTENT"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 27
            goto L_0x020f
        L_0x0121:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BATTERY_NOTIFICATION_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 16
            goto L_0x020f
        L_0x012d:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_DEVICES_LIST_ACTIVITY_ITEM_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 3
            goto L_0x020f
        L_0x0138:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LAUNCH_WEB_URL_IN_BROWSER"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 21
            goto L_0x020f
        L_0x0144:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_GROUP_DISMISS"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 11
            goto L_0x020f
        L_0x0150:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_SEND_PENDING_INTENT"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 28
            goto L_0x020f
        L_0x015c:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_DISCOVERY_LIST_ACTIVITY_ITEM_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 4
            goto L_0x020f
        L_0x0167:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_DISCOVERY_LIST_ACTIVITY_ITEM_VIEWED"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 6
            goto L_0x020f
        L_0x0172:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_AUTO_REFRESH"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 1
            goto L_0x020f
        L_0x017d:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LIST_ITEM_ENABLE"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 19
            goto L_0x020f
        L_0x0189:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_GOOGLE_SETTING_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 18
            goto L_0x020f
        L_0x0195:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_DO_NOT_SHOW_AGAIN_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 12
            goto L_0x020f
        L_0x01a1:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_CANCEL_BISTO_SETUP"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 24
            goto L_0x020f
        L_0x01ad:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BATTERY_NOTIFICATION_DISMISS"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 15
            goto L_0x020f
        L_0x01b8:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LOG_EVENT"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 25
            goto L_0x020f
        L_0x01c3:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRED_NOTIFICATION_DISMISSED"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 23
            goto L_0x020f
        L_0x01ce:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_ITEM_CLICK"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 7
            goto L_0x020f
        L_0x01d8:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_OPT_IN_DISMISS"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 9
            goto L_0x020f
        L_0x01e3:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_REQUEST_DATA"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 2
            goto L_0x020f
        L_0x01ed:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_LOG_FIND_MY_DEVICE_EVENT"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 29
            goto L_0x020f
        L_0x01f8:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_FOOTPRINTS_ANALYTICS"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 26
            goto L_0x020f
        L_0x0203:
            java.lang.String r14 = "com.google.android.gms.nearby.discovery.ACTION_MAGIC_PAIR_PAIRING_DISMISS"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x020e
            r2 = 14
            goto L_0x020f
        L_0x020e:
            r2 = -1
        L_0x020f:
            java.lang.String r14 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            java.lang.String r5 = "com.google.android.gms.nearby.discovery.EXTRA_BLE_ADDRESS"
            java.lang.String r15 = "com.google.android.gms.nearby.discovery.EXTRA_TRIGGER_ID"
            java.lang.String r13 = "com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS"
            java.lang.String r6 = "com.google.android.gms.nearby.discovery.fastpair.MODEL_ID"
            r21 = r7
            java.lang.String r7 = "com.google.android.gms.nearby.discovery.EXTRA_LIST_POSITION"
            switch(r2) {
                case 0: goto L_0x0707;
                case 1: goto L_0x06fc;
                case 2: goto L_0x06ed;
                case 3: goto L_0x06cf;
                case 4: goto L_0x06b1;
                case 5: goto L_0x06a9;
                case 6: goto L_0x06a1;
                case 7: goto L_0x0655;
                case 8: goto L_0x0651;
                case 9: goto L_0x0646;
                case 10: goto L_0x061b;
                case 11: goto L_0x05f3;
                case 12: goto L_0x059c;
                case 13: goto L_0x0588;
                case 14: goto L_0x0580;
                case 15: goto L_0x0559;
                case 16: goto L_0x050a;
                case 17: goto L_0x0504;
                case 18: goto L_0x0504;
                case 19: goto L_0x04e9;
                case 20: goto L_0x04ce;
                case 21: goto L_0x049e;
                case 22: goto L_0x044a;
                case 23: goto L_0x042e;
                case 24: goto L_0x036c;
                case 25: goto L_0x0362;
                case 26: goto L_0x0318;
                case 27: goto L_0x02ee;
                case 28: goto L_0x02b5;
                case 29: goto L_0x0232;
                default: goto L_0x0220;
            }
        L_0x0220:
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.b()
            anih r2 = (defpackage.anih) r2
            java.lang.String r0 = r23.getAction()
            java.lang.String r3 = "Action not found: %s."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)
            return
        L_0x0232:
            tzi r2 = r22.e(r23)
            if (r2 != 0) goto L_0x0246
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "logFindMyDevice: Can't get cached Fast Pair device from neither address nor account key."
            r0.a((java.lang.String) r2)
            return
        L_0x0246:
            tsu r3 = r1.b
            asom r4 = b((android.content.Intent) r23)
            java.lang.String r2 = r2.k
            avbh r0 = c(r23)
            boolean r5 = defpackage.aymw.p()
            if (r5 != 0) goto L_0x025c
            r3.a((defpackage.asom) r4)
            return
        L_0x025c:
            aucd r4 = r3.b(r4)
            auwj r5 = defpackage.auwj.d
            aucd r5 = r5.o()
            int r2 = defpackage.tsu.a((java.lang.String) r2)
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x0274
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x0274:
            aucj r6 = r5.b
            auwj r6 = (defpackage.auwj) r6
            int r7 = r6.a
            r8 = 1
            r7 = r7 | r8
            r6.a = r7
            r6.b = r2
            int r0 = r0.e
            r6.c = r0
            r0 = 2
            r0 = r0 | r7
            r6.a = r0
            aucj r0 = r5.i()
            auwj r0 = (defpackage.auwj) r0
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0293
            goto L_0x0299
        L_0x0293:
            r4.c()
            r2 = 0
            r4.c = r2
        L_0x0299:
            aucj r2 = r4.b
            auwy r2 = (defpackage.auwy) r2
            auwy r5 = defpackage.auwy.u
            r0.getClass()
            r2.s = r0
            int r0 = r2.a
            r5 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r5
            r2.a = r0
            aucj r0 = r4.i()
            auwy r0 = (defpackage.auwy) r0
            r3.a((defpackage.auwy) r0)
            return
        L_0x02b5:
            r22.d(r23)
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_PENDING_INTENT"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)
            r2 = r0
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            if (r2 == 0) goto L_0x06a0
            r2.send()     // Catch:{ CanceledException -> 0x02d8 }
            jjg r0 = defpackage.tsp.a     // Catch:{ CanceledException -> 0x02d8 }
            anie r0 = r0.d()     // Catch:{ CanceledException -> 0x02d8 }
            anih r0 = (defpackage.anih) r0     // Catch:{ CanceledException -> 0x02d8 }
            java.lang.String r3 = "Sent pending intent after logging: %s"
            java.lang.String r4 = r2.getTargetPackage()     // Catch:{ CanceledException -> 0x02d8 }
            r0.a((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ CanceledException -> 0x02d8 }
            return
        L_0x02d8:
            r0 = move-exception
            jjg r3 = defpackage.tsp.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            java.lang.String r0 = r2.getTargetPackage()
            java.lang.String r2 = "Failed to send pending intent: %s"
            r3.a((java.lang.String) r2, (java.lang.Object) r0)
            return
        L_0x02ee:
            r22.d(r23)
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_INTENT"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 == 0) goto L_0x06a0
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r2)
            android.content.Context r2 = r1.a
            r2.startActivity(r0)
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r3 = 1
            java.lang.String r0 = r0.toUri(r3)
            java.lang.String r3 = "Launched intent after logging: %s"
            r2.a((java.lang.String) r3, (java.lang.Object) r0)
            return
        L_0x0318:
            ttu r2 = new ttu
            java.lang.String r3 = r0.getStringExtra(r15)
            java.lang.String r4 = r0.getStringExtra(r5)
            android.content.Context r5 = r1.a
            r2.<init>(r3, r4, r5)
            tts r3 = defpackage.ttt.f()
            aspb r4 = defpackage.aspb.WRITE_TO_FOOTPRINTS
            r3.a((defpackage.aspb) r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            r6 = 0
            java.lang.String r8 = "com.google.android.gms.nearby.discovery.EXTRA_DURATION_MILLIS"
            long r6 = r0.getLongExtra(r8, r6)
            long r4 = r4 - r6
            r3.a((long) r4)
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.EXTRA_NUMBER_DEVICES"
            r5 = -1
            int r4 = r0.getIntExtra(r4, r5)
            r3.b(r4)
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.EXTRA_UPLOAD_FAIL_REASON"
            boolean r5 = r0.hasExtra(r4)
            if (r5 == 0) goto L_0x035a
            java.io.Serializable r0 = r0.getSerializableExtra(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3.a = r0
        L_0x035a:
            ttt r0 = r3.a()
            r2.a((defpackage.ttt) r0)
            return
        L_0x0362:
            tsu r2 = r1.b
            asom r0 = b((android.content.Intent) r23)
            r2.a((defpackage.asom) r0, (defpackage.ttg) r8)
            return
        L_0x036c:
            java.lang.String r2 = r0.getStringExtra(r6)
            boolean r3 = defpackage.aymz.b()
            if (r3 == 0) goto L_0x03b7
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.fastpair.CONNECTION_ID"
            boolean r4 = r0.hasExtra(r3)
            if (r4 == 0) goto L_0x039b
            android.content.Context r4 = r1.a
            java.lang.Class<tuh> r5 = defpackage.tuh.class
            java.lang.Object r4 = defpackage.thl.a((android.content.Context) r4, (java.lang.Class) r5)
            tuh r4 = (defpackage.tuh) r4
            r5 = 0
            int r0 = r0.getIntExtra(r3, r5)
            amxe r3 = r4.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x039c
        L_0x039b:
            r0 = 0
        L_0x039c:
            boolean r3 = defpackage.amrk.a((java.lang.String) r0)
            if (r3 == 0) goto L_0x03bc
            boolean r3 = defpackage.amrk.a((java.lang.String) r2)
            if (r3 != 0) goto L_0x03a9
            goto L_0x03bc
        L_0x03a9:
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "FastPair: bisto does not send back valid information"
            r0.a((java.lang.String) r2)
            return
        L_0x03b7:
            java.lang.String r0 = r0.getStringExtra(r5)
        L_0x03bc:
            boolean r3 = defpackage.aymw.D()
            if (r3 == 0) goto L_0x06a0
            boolean r3 = defpackage.amrk.a((java.lang.String) r0)
            if (r3 != 0) goto L_0x03d7
            android.content.Context r2 = r1.a
            tzf r0 = defpackage.tvq.a((android.content.Context) r2, (java.lang.String) r0)
            if (r0 == 0) goto L_0x03d5
            uaj r5 = defpackage.tvq.a((defpackage.tzf) r0)
            goto L_0x040c
        L_0x03d5:
            r5 = 0
            goto L_0x040c
        L_0x03d7:
            ttf r0 = r1.c
            java.util.List r0 = r0.c()
            java.util.Iterator r0 = r0.iterator()
        L_0x03e1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x040b
            java.lang.Object r3 = r0.next()
            ttg r3 = (defpackage.ttg) r3
            java.lang.String r4 = r3.G()
            java.lang.String r4 = defpackage.amrk.b(r4)
            boolean r4 = defpackage.ampw.a(r2, r4)
            if (r4 == 0) goto L_0x03e1
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r4 = "OOBE setup: CachedItem for %s found"
            r0.a((java.lang.String) r4, (java.lang.Object) r2)
            uaj r5 = r3.b
            goto L_0x040c
        L_0x040b:
            r5 = 0
        L_0x040c:
            if (r5 == 0) goto L_0x06a0
            ttg r0 = new ttg
            android.content.Context r2 = r1.a
            r0.<init>(r2, r5)
            tvo r2 = new tvo
            android.content.Context r3 = r1.a
            r4 = 1
            r2.<init>(r3, r0, r4)
            java.lang.String r3 = defpackage.tvq.a((defpackage.uaj) r5)
            java.lang.String r4 = r0.k()
            java.lang.String r0 = r0.m()
            r5 = 0
            r2.a((java.lang.String) r3, (int) r5, (java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x042e:
            tsu r2 = r1.b
            r3 = 56
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT"
            int r3 = r0.getIntExtra(r4, r3)
            asom r3 = defpackage.asom.a(r3)
            java.lang.String r4 = r0.getStringExtra(r15)
            java.lang.String r5 = "com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP"
            java.lang.String r0 = r0.getStringExtra(r5)
            r2.a((defpackage.asom) r3, (java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x044a:
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_IS_INITIAL_PAIRING"
            r3 = 1
            boolean r0 = r0.getBooleanExtra(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r0 != 0) goto L_0x045c
            java.lang.String r0 = "Subsequent"
            goto L_0x045e
        L_0x045c:
            java.lang.String r0 = "Initial"
        L_0x045e:
            r2.append(r0)
            java.lang.String r0 = " pairing failure.\nPlease attach a bugreport.zip on buganizer."
            r2.append(r0)
            iby r0 = new iby
            android.content.Context r3 = r1.a
            r4 = 0
            r0.<init>((android.content.Context) r3, (byte[]) r4)
            mwc r3 = new mwc
            android.content.Context r4 = r1.a
            r3.<init>((android.content.Context) r4)
            java.lang.String r4 = "com.google.android.apps.wearables.maestro.companion.USER_INITIATED_FEEDBACK_REPORT"
            r3.c = r4
            java.lang.String r2 = r2.toString()
            r3.b = r2
            com.google.android.gms.feedback.FeedbackOptions r2 = r3.a()
            r0.a((com.google.android.gms.feedback.FeedbackOptions) r2)
            android.content.Context r0 = r1.a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r14)
            r0.sendBroadcast(r2)
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "FastPair: start user feedback"
            r0.a((java.lang.String) r2)
            return
        L_0x049e:
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_URL"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r0 = r0.getParcelableExtra(r3)
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            tsu r3 = r1.b
            asom r4 = defpackage.asom.WEB_URL_LAUNCHED_IN_BROWSER
            r3.a((defpackage.asom) r4, (defpackage.ttg) r8)
            android.content.Context r3 = r1.a
            android.content.Intent r4 = new android.content.Intent
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r5 = "android.intent.action.VIEW"
            r4.<init>(r5, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r2 = r4.addFlags(r2)
            defpackage.uan.a((android.content.Intent) r2, (android.bluetooth.BluetoothDevice) r0)
            r3.startActivity(r2)
            return
        L_0x04ce:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.LIST_ITEMS_DISABLED
            r0.a((defpackage.asom) r2, (java.util.List) r10)
            ttf r0 = r1.c
            r2 = 3
            r0.a((java.util.List) r9, (int) r2)
            android.content.Context r0 = r1.a
            java.lang.Class<ubv> r2 = defpackage.ubv.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            ubv r0 = (defpackage.ubv) r0
            r0.a()
            return
        L_0x04e9:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.LIST_ITEMS_ENABLED
            r0.a((defpackage.asom) r2, (java.util.List) r10)
            ttf r0 = r1.c
            r2 = 2
            r0.a((java.util.List) r9, (int) r2)
            android.content.Context r0 = r1.a
            java.lang.Class<ubv> r2 = defpackage.ubv.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            ubv r0 = (defpackage.ubv) r0
            r0.a()
            return
        L_0x0504:
            arxg r0 = r1.f
            r0.f()
            return
        L_0x050a:
            java.lang.String r9 = r0.getStringExtra(r13)
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY"
            byte[] r10 = r0.getByteArrayExtra(r2)
            if (r9 != 0) goto L_0x0518
            goto L_0x054b
        L_0x0518:
            if (r10 == 0) goto L_0x054b
            tsu r2 = r1.b
            asom r3 = defpackage.asom.FAST_PAIR_BATTERY_NOTIFICATION_CLICKED
            java.lang.String r4 = r0.getStringExtra(r6)
            r6 = 0
            r8 = 0
            r5 = r9
            r2.a((defpackage.asom) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (int) r8)
            android.content.Context r0 = r1.a
            android.content.Intent r0 = defpackage.arym.a(r0, r9, r10)
            if (r0 != 0) goto L_0x053f
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "FastPair: Couldn't create device details intent."
            r0.a((java.lang.String) r2)
            return
        L_0x053f:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r2)
            android.content.Context r2 = r1.a
            r2.startActivity(r0)
            return
        L_0x054b:
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "FastPair: Failed to launch battery notification from click."
            r0.a((java.lang.String) r2)
            return
        L_0x0559:
            android.content.Context r2 = r1.a
            java.lang.Class<txd> r3 = defpackage.txd.class
            java.lang.Object r2 = defpackage.thl.a((android.content.Context) r2, (java.lang.Class) r3)
            txd r2 = (defpackage.txd) r2
            java.util.Map r3 = r2.e
            java.lang.String r4 = r2.f
            com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset r2 = r2.g
            r3.put(r4, r2)
            tsu r14 = r1.b
            asom r15 = defpackage.asom.FAST_PAIR_BATTERY_NOTIFICATION_DISMISSED
            java.lang.String r16 = r0.getStringExtra(r6)
            java.lang.String r17 = r0.getStringExtra(r13)
            r18 = 0
            r20 = 0
            r14.a((defpackage.asom) r15, (java.lang.String) r16, (java.lang.String) r17, (long) r18, (int) r20)
            return
        L_0x0580:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.MAGIC_PAIR_PAIRING_NOTIFICATION_DISMISSED
            r0.a((defpackage.asom) r2, (defpackage.ttg) r8, (java.lang.Integer) r3)
            return
        L_0x0588:
            r12.a()
            tsu r0 = r1.b
            asom r2 = defpackage.asom.BEACON_OPT_IN_NOTIFICATION_CLICKED
            r0.a((defpackage.asom) r2, (defpackage.ttg) r8, (java.lang.Integer) r3)
            android.content.Context r0 = r1.a
            android.content.Intent r2 = defpackage.aryn.a(r0)
            r0.startActivity(r2)
            return
        L_0x059c:
            if (r8 != 0) goto L_0x05ac
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "The item ID is either missing or invalid %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r4)
            return
        L_0x05ac:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.NOTIFICATION_DO_NOT_SHOW_AGAIN_CLICKED
            r0.a((defpackage.asom) r2, (defpackage.ttg) r8, (java.lang.Integer) r3)
            if (r8 != 0) goto L_0x05c3
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "Muted item cannot be null"
            r0.a((java.lang.String) r2)
            goto L_0x05db
        L_0x05c3:
            ttf r0 = r1.c
            java.lang.String r2 = r8.i()
            r3 = 3
            r0.a((java.lang.String) r2, (int) r3)
            android.content.Context r0 = r1.a
            java.lang.Class<ubv> r2 = defpackage.ubv.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            ubv r0 = (defpackage.ubv) r0
            r2 = 1
            r0.a((int) r2)
        L_0x05db:
            android.content.Context r0 = r1.a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r14)
            r0.sendBroadcast(r2)
            android.content.Context r0 = r1.a
            r2 = 2131952478(0x7f13035e, float:1.95414E38)
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r3)
            r0.show()
            return
        L_0x05f3:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 >= r2) goto L_0x060c
            int r0 = r10.size()
            r6 = 0
        L_0x05fe:
            if (r6 >= r0) goto L_0x060c
            java.lang.Object r2 = r10.get(r6)
            ttg r2 = (defpackage.ttg) r2
            r1.a(r2, r3, r12)
            int r6 = r6 + 1
            goto L_0x05fe
        L_0x060c:
            int r0 = r10.size()
            r2 = 1
            if (r0 <= r2) goto L_0x06a0
            tsu r0 = r1.b
            asom r2 = defpackage.asom.NOTIFICATION_GROUP_DISMISSED
            r0.a((defpackage.asom) r2, (java.util.List) r10, (java.lang.Integer) r3)
            return
        L_0x061b:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.NOTIFICATION_GROUP_CLICKED
            r0.a((defpackage.asom) r2, (java.util.List) r10, (java.lang.Integer) r3)
            r12.a()
            int r0 = r10.size()
            r2 = 1
            if (r0 != r2) goto L_0x0637
            r0 = 0
            java.lang.Object r0 = r10.get(r0)
            ttg r0 = (defpackage.ttg) r0
            r1.b((defpackage.ttg) r0)
            return
        L_0x0637:
            arxg r0 = r1.f
            r0.f()
            android.content.Context r0 = r1.a
            android.content.Intent r2 = defpackage.aryn.a(r0)
            r0.startActivity(r2)
            return
        L_0x0646:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.BEACON_OPT_IN_NOTIFICATION_DISMISSED
            r0.a((defpackage.asom) r2, (defpackage.ttg) r8, (java.lang.Integer) r3)
            r12.a((defpackage.ttg) r8)
            return
        L_0x0651:
            r1.a(r8, r3, r12)
            return
        L_0x0655:
            r12.a()
            java.lang.String r0 = r1.b((defpackage.ttg) r8)
            tsu r2 = r1.b
            asom r4 = defpackage.asom.NOTIFICATION_ITEM_CLICKED
            r2.b(r4, r8, r0, r3)
            aymq r0 = defpackage.aymq.a
            aymr r0 = r0.a()
            boolean r0 = r0.u()
            if (r0 == 0) goto L_0x06a0
            android.content.Context r0 = r1.a
            java.lang.Class<arwg> r2 = defpackage.arwg.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            arwg r0 = (defpackage.arwg) r0
            aymt r2 = defpackage.aymt.a
            aymu r2 = r2.a()
            long r2 = r2.L()
            r0.a(r11, r2)
            android.content.Context r0 = r1.a
            java.lang.Class<arwg> r2 = defpackage.arwg.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            arwg r0 = (defpackage.arwg) r0
            aymq r2 = defpackage.aymq.a
            aymr r2 = r2.a()
            long r2 = r2.v()
            r4 = r21
            r0.a(r4, r2)
            return
        L_0x06a0:
            return
        L_0x06a1:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.LIST_ITEM_VIEWED
            r0.a((defpackage.asom) r2, (defpackage.ttg) r8)
            return
        L_0x06a9:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.DEVICES_LIST_ITEM_VIEWED
            r0.a((defpackage.asom) r2, (defpackage.ttg) r8)
            return
        L_0x06b1:
            r4 = 0
            tsu r2 = r1.b
            asom r3 = defpackage.asom.LIST_ITEM_CLICKED
            java.lang.String r5 = r1.a((defpackage.ttg) r8)
            boolean r6 = r0.hasExtra(r7)
            if (r6 == 0) goto L_0x06ca
            r4 = -1
            int r0 = r0.getIntExtra(r7, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x06cb
        L_0x06ca:
            r0 = r4
        L_0x06cb:
            r2.a((defpackage.asom) r3, (defpackage.ttg) r8, (java.lang.String) r5, (java.lang.Integer) r0)
            return
        L_0x06cf:
            r4 = 0
            tsu r2 = r1.b
            asom r3 = defpackage.asom.DEVICES_LIST_ITEM_CLICKED
            java.lang.String r5 = r1.a((defpackage.ttg) r8)
            boolean r6 = r0.hasExtra(r7)
            if (r6 == 0) goto L_0x06e8
            r4 = -1
            int r0 = r0.getIntExtra(r7, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x06e9
        L_0x06e8:
            r0 = r4
        L_0x06e9:
            r2.a((defpackage.asom) r3, (defpackage.ttg) r8, (java.lang.String) r5, (java.lang.Integer) r0)
            return
        L_0x06ed:
            android.content.Context r0 = r1.a
            java.lang.Class<ubv> r2 = defpackage.ubv.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            ubv r0 = (defpackage.ubv) r0
            r2 = 1
            r0.a((int) r2)
            return
        L_0x06fc:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.LIST_VIEW_AUTO_REFRESHED
            r0.a((defpackage.asom) r2)
            r22.a()
            return
        L_0x0707:
            tsu r0 = r1.b
            asom r2 = defpackage.asom.LIST_VIEW_REFRESHED
            r0.a((defpackage.asom) r2)
            r22.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udf.a(android.content.Intent):void");
    }

    public final void a(boolean z, String str) {
        if (this.c.e(str) == null) {
            ((anih) tsp.a.d()).a("UserActionHandler: cache manager does not have item id %s", (Object) str);
            return;
        }
        this.c.e(str).a(z);
        ((ubv) thl.a(this.a, ubv.class)).a(1);
    }
}
