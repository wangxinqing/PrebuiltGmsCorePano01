package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import com.google.android.gms.nearby.messages.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ubv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubv {
    public final ttf a;
    public final udk b;
    public final arwg c;
    public final uap d;
    private final Context e;
    private final tyw f;
    private final udf g;
    private final udc h;
    private final jiq i;
    private final arwm j = new ubr(this, "timeoutUi");
    private final arwm k = new ubs(this, "updateUi");
    private long l = 0;
    private long m = 0;

    public ubv(Context context) {
        this.e = context;
        this.a = (ttf) thl.a(context, ttf.class);
        this.b = (udk) thl.a(context, udk.class);
        this.f = (tyw) thl.a(context, tyw.class);
        this.g = (udf) thl.a(context, udf.class);
        this.h = (udc) thl.a(context, udc.class);
        this.c = (arwg) thl.a(context, arwg.class);
        this.i = (jiq) thl.a(context, jiq.class);
        this.d = (uap) thl.a(context, uap.class);
    }

    private final Intent a(String str) {
        return this.g.a(str);
    }

    public final void a() {
        a(0);
    }

    public final void a(int i2) {
        a(i2, avbx.NEARBY_TYPE_UNKNOWN);
    }

    public final void a(int i2, avbx avbx) {
        amzy amzy;
        int i3 = i2;
        this.c.b();
        if (i3 != 1) {
            long a2 = this.i.a();
            long Z = (this.l + aymq.a.a().Z()) - a2;
            if (avbx == avbx.NEARBY_DEVICE) {
                Z = (this.l + aymq.a.a().Y()) - a2;
            }
            long j2 = this.m;
            if (j2 != 0) {
                long j3 = j2 - a2;
                if (j3 < Z) {
                    Z = j3;
                }
            }
            if (Z > 0) {
                this.c.e(this.k);
                this.c.a(this.k, Z);
                this.m = Z + a2;
                return;
            }
            this.m = 0;
            this.l = this.i.a();
        }
        List<ttg> c2 = this.a.c();
        Context context = this.e;
        if (!arxk.a(context, tfx.a(context))) {
            amzy = amzy.h();
        } else {
            ArrayList arrayList = new ArrayList(c2.size());
            for (ttg ttg : c2) {
                int a3 = uae.a(ttg.b.B);
                if (a3 == 0 || a3 != 5) {
                    if (!ttg.c()) {
                        ttg.a(4, String.format("Not in recent scans (Last seen %s)", new Object[]{DateUtils.getRelativeTimeSpanString(ttg.y().longValue(), this.i.a(), 0)}));
                    } else if (!ttg.e()) {
                        ttg.a(4, "Invalid title or URL");
                    } else {
                        ttg.b(1, (String) null);
                        arrayList.add(ttg);
                    }
                }
            }
            amzy = amzy.a((Collection) arrayList);
        }
        jjg jjg = tsp.a;
        c2.size();
        amzy.size();
        if (!aymq.a.a().s()) {
            this.c.c(new ubt(this, "updateUiWithItems", amzy, i3));
            return;
        }
        uao.a(amzy);
        a(i3, (Collection) amzy);
    }

    /* JADX WARNING: type inference failed for: r45v0, types: [java.util.List, java.util.Collection] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04e7  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r44, java.util.Collection r45) {
        /*
            r43 = this;
            r1 = r43
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r45.size()
            r3 = 0
            r4 = 0
        L_0x000d:
            r5 = 4
            if (r4 < r2) goto L_0x0871
            jjg r2 = defpackage.tsp.a
            r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Comparator r4 = defpackage.ubq.a
            java.util.Collections.sort(r2, r4)
            java.util.HashSet r4 = new java.util.HashSet
            int r6 = r0.size()
            r4.<init>(r6)
            java.util.HashSet r6 = new java.util.HashSet
            int r7 = r0.size()
            r6.<init>(r7)
            java.util.HashSet r7 = new java.util.HashSet
            int r8 = r0.size()
            r7.<init>(r8)
            java.util.Iterator r8 = r2.iterator()
        L_0x003e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00b7
            java.lang.Object r9 = r8.next()
            ttg r9 = (defpackage.ttg) r9
            java.lang.String r10 = r9.B()
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x005d
            java.lang.String r10 = "Member of group already present"
            r9.a((int) r5, (java.lang.String) r10)
            r8.remove()
            goto L_0x003e
        L_0x005d:
            avbx r10 = r9.j()
            avbx r11 = defpackage.avbx.NEARBY_DEVICE
            if (r10 == r11) goto L_0x007a
            java.lang.Integer r10 = r9.F()
            boolean r10 = r4.contains(r10)
            if (r10 != 0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            java.lang.String r10 = "Beacon already has attachment"
            r9.a((int) r5, (java.lang.String) r10)
            r8.remove()
            goto L_0x003e
        L_0x007a:
            int r10 = r9.h()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r10 = r7.contains(r10)
            if (r10 == 0) goto L_0x0091
            java.lang.String r10 = "Existing attachment with same text/URL"
            r9.a((int) r5, (java.lang.String) r10)
            r8.remove()
            goto L_0x003e
        L_0x0091:
            java.lang.String r10 = r9.G()
            if (r10 == 0) goto L_0x009e
            java.lang.Integer r10 = r9.F()
            r4.add(r10)
        L_0x009e:
            java.lang.String r10 = r9.B()
            if (r10 == 0) goto L_0x00ab
            java.lang.String r10 = r9.B()
            r6.add(r10)
        L_0x00ab:
            int r9 = r9.h()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.add(r9)
            goto L_0x003e
        L_0x00b7:
            java.util.Comparator r4 = java.util.Collections.reverseOrder()
            java.util.Collections.sort(r2, r4)
            r2.size()
            r0.size()
            r2.size()
            int r0 = r2.size()
            r4 = 0
        L_0x00cc:
            r6 = 2
            r7 = 0
            if (r4 >= r0) goto L_0x00dc
            java.lang.Object r8 = r2.get(r4)
            ttg r8 = (defpackage.ttg) r8
            r8.b((int) r6, (java.lang.String) r7)
            int r4 = r4 + 1
            goto L_0x00cc
        L_0x00dc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r4 = r2.size()
            r8 = 0
        L_0x00e6:
            r9 = 1
            if (r8 >= r4) goto L_0x0111
            java.lang.Object r10 = r2.get(r8)
            ttg r10 = (defpackage.ttg) r10
            int r11 = r10.J()
            if (r11 != r6) goto L_0x010e
            auzz r11 = r10.s()
            int r11 = r11.b
            int r11 = defpackage.avbj.b(r11)
            if (r11 == 0) goto L_0x0103
            r9 = r11
            goto L_0x0104
        L_0x0103:
        L_0x0104:
            int r9 = r9 + -1
            r11 = 700(0x2bc, float:9.81E-43)
            if (r9 >= r11) goto L_0x010b
            goto L_0x010e
        L_0x010b:
            r0.add(r10)
        L_0x010e:
            int r8 = r8 + 1
            goto L_0x00e6
        L_0x0111:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0185
            udf r4 = r1.g
            java.lang.Object r8 = r0.get(r3)
            ttg r8 = (defpackage.ttg) r8
            java.lang.String r10 = r8.t()
            android.content.Intent r10 = defpackage.uan.a(r10)
            if (r10 == 0) goto L_0x0142
            java.lang.String r11 = r10.getPackage()
            if (r11 == 0) goto L_0x0142
            java.lang.String r11 = r10.getPackage()
            android.content.Context r12 = r4.a     // Catch:{ NameNotFoundException -> 0x013d }
            android.content.pm.PackageManager r12 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x013d }
            r12.getPackageInfo(r11, r3)     // Catch:{ NameNotFoundException -> 0x013d }
            goto L_0x0142
        L_0x013d:
            r0 = move-exception
            r10.getPackage()
            goto L_0x0185
        L_0x0142:
            r8.i()
            r8.D()
            java.lang.String r10 = r4.b((defpackage.ttg) r8)
            tsu r4 = r4.b
            asom r11 = defpackage.asom.ITEM_AUTO_LAUNCHED
            r4.b(r11, r8, r10, r7)
            if (r10 == 0) goto L_0x0185
            int r4 = r0.size()
            r8 = 0
        L_0x015a:
            if (r8 < r4) goto L_0x0179
            arwg r4 = r1.c
            ubu r8 = new ubu
            java.lang.String r10 = "reenableSystemDisabledItems"
            r8.<init>(r10, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            aymt r10 = defpackage.aymt.a
            aymu r10 = r10.a()
            long r10 = r10.c()
            long r10 = r0.toMillis(r10)
            r4.a(r8, r10)
            goto L_0x0185
        L_0x0179:
            java.lang.Object r10 = r0.get(r8)
            ttg r10 = (defpackage.ttg) r10
            r10.a((boolean) r3)
            int r8 = r8 + 1
            goto L_0x015a
        L_0x0185:
            boolean r0 = defpackage.aymw.E()
            r4 = 3
            if (r0 == 0) goto L_0x023a
            tyw r0 = r1.f
            int r7 = r2.size()
            r8 = 0
        L_0x0193:
            if (r8 >= r7) goto L_0x0754
            java.lang.Object r10 = r2.get(r8)
            ttg r10 = (defpackage.ttg) r10
            android.util.LruCache r11 = r0.b
            monitor-enter(r11)
            android.util.LruCache r12 = r0.b     // Catch:{ all -> 0x0237 }
            java.lang.String r13 = r10.m()     // Catch:{ all -> 0x0237 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x0237 }
            if (r12 != 0) goto L_0x01b7
            android.util.LruCache r12 = r0.b     // Catch:{ all -> 0x0237 }
            java.lang.String r13 = r10.m()     // Catch:{ all -> 0x0237 }
            java.lang.Integer r14 = r0.a()     // Catch:{ all -> 0x0237 }
            r12.put(r13, r14)     // Catch:{ all -> 0x0237 }
        L_0x01b7:
            monitor-exit(r11)     // Catch:{ all -> 0x0237 }
            android.util.LruCache r11 = r0.b
            java.lang.String r12 = r10.m()
            java.lang.Object r11 = r11.get(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r8 = r8 + 1
            tyu r12 = r0.a
            android.util.LruCache r13 = r0.b
            java.lang.String r14 = r10.m()
            java.lang.Object r13 = r13.get(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            boolean r12 = r12.a((int) r13)
            if (r12 != 0) goto L_0x0193
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.content.Context r8 = r0.c
            java.lang.String r12 = "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity"
            android.content.Intent r7 = r7.setClassName(r8, r12)
            uaj r8 = r10.b
            tzf r8 = defpackage.tvq.b(r8)
            byte[] r8 = r8.k()
            java.lang.String r10 = "com.google.android.gms.nearby.discovery.HALF_SHEET"
            r7.putExtra(r10, r8)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r7.setFlags(r8)
            tyu r8 = r0.a
            int r10 = r11.intValue()
            r8.a(r10, r6)
            android.content.Context r6 = r0.c
            r6.startActivity(r7)
            android.content.Context r6 = r0.c
            java.lang.Class<arwg> r7 = defpackage.arwg.class
            java.lang.Object r6 = defpackage.thl.a((android.content.Context) r6, (java.lang.Class) r7)
            arwg r6 = (defpackage.arwg) r6
            arwm r7 = r0.d
            r6.e(r7)
            android.content.Context r6 = r0.c
            java.lang.Class<arwg> r7 = defpackage.arwg.class
            java.lang.Object r6 = defpackage.thl.a((android.content.Context) r6, (java.lang.Class) r7)
            arwg r6 = (defpackage.arwg) r6
            arwm r0 = r0.d
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r10 = defpackage.aymt.m()
            long r7 = r7.toMillis(r10)
            r6.a(r0, r7)
            goto L_0x0754
        L_0x0237:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0237 }
            throw r0
        L_0x023a:
            udk r0 = r1.b
            udc r8 = r1.h
            r2.size()
            android.content.Context r10 = r8.a
            java.lang.Class<com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService> r11 = com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService.class
            java.lang.Object r10 = defpackage.thl.a((android.content.Context) r10, (java.lang.Class) r11)
            com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService r10 = (com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService) r10
            ubj r10 = r10.m
            if (r10 == 0) goto L_0x0276
            boolean r10 = r10.d()
            if (r10 == 0) goto L_0x0276
            int r10 = r2.size()
            if (r10 <= r9) goto L_0x0268
            aymq r10 = defpackage.aymq.a
            aymr r10 = r10.a()
            boolean r10 = r10.x()
            if (r10 == 0) goto L_0x0268
            goto L_0x0276
        L_0x0268:
            java.lang.String r6 = "Notification not shown because Nearby Activity is in foreground"
            defpackage.udc.a((java.util.Collection) r2, (java.lang.String) r6)
            amzy r6 = defpackage.amzy.h()
            r17 = r0
            goto L_0x074f
        L_0x0276:
            aymq r10 = defpackage.aymq.a
            aymr r10 = r10.a()
            boolean r10 = r10.O()
            if (r10 == 0) goto L_0x0744
            boolean r10 = defpackage.arxk.a()
            if (r10 != 0) goto L_0x029d
            boolean r10 = defpackage.aymq.g()
            if (r10 == 0) goto L_0x028f
            goto L_0x029d
        L_0x028f:
            java.lang.String r6 = "Notification not shown because bluetooth is disabled."
            defpackage.udc.a((java.util.Collection) r2, (java.lang.String) r6)
            amzy r6 = defpackage.amzy.h()
            r17 = r0
            goto L_0x074f
        L_0x029d:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r2.size()
            r10.<init>(r11)
            int r11 = r2.size()
            r12 = 0
        L_0x02ab:
            if (r12 < r11) goto L_0x0714
            r2.size()
            r10.size()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.size()
            r11.<init>(r12)
            int r12 = r10.size()
            r13 = 0
        L_0x02c1:
            if (r13 < r12) goto L_0x06ba
            r10.size()
            r11.size()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r15 = r11.size()
            r6 = 0
        L_0x02d3:
            if (r6 < r15) goto L_0x069b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r10 = r14.size()
            int r10 = r10 + r9
            r6.<init>(r10)
            boolean r10 = r14.isEmpty()
            if (r10 != 0) goto L_0x0693
            arxg r10 = r8.c
            boolean r10 = r10.e()
            if (r10 == 0) goto L_0x068b
            int r10 = r14.size()
            r11 = 0
            r12 = 0
        L_0x02f3:
            if (r11 < r10) goto L_0x066b
            ob r10 = new ob
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r13 = r14.size()
            r15 = 0
        L_0x0304:
            if (r15 >= r13) goto L_0x05d2
            java.lang.Object r16 = r14.get(r15)
            r7 = r16
            ttg r7 = (defpackage.ttg) r7
            avbx r3 = r7.j()
            avbx r9 = defpackage.avbx.NEARBY_DEVICE
            if (r3 == r9) goto L_0x0323
            boolean r3 = r10.contains(r7)
            if (r3 != 0) goto L_0x031d
            goto L_0x0323
        L_0x031d:
            r17 = r0
            r18 = r13
            goto L_0x05c0
        L_0x0323:
            avbx r3 = r7.j()
            int r3 = r3.ordinal()
            if (r3 == r4) goto L_0x0568
            if (r3 == r5) goto L_0x0512
            r9 = 5
            if (r3 != r9) goto L_0x04ed
            auzz r3 = r7.s()
            avbx r17 = r7.j()
            int r9 = defpackage.ubw.a(r3)
            r5 = 400(0x190, float:5.6E-43)
            r4 = 200(0xc8, float:2.8E-43)
            if (r9 != r5) goto L_0x0345
            goto L_0x0362
        L_0x0345:
            if (r9 == r4) goto L_0x0362
            r5 = 300(0x12c, float:4.2E-43)
            if (r9 == r5) goto L_0x0362
            r4 = 100
            if (r9 == r4) goto L_0x0362
            if (r9 > r5) goto L_0x0362
            r4 = 200(0xc8, float:2.8E-43)
            if (r9 > r4) goto L_0x0362
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.b()
            anih r4 = (defpackage.anih) r4
            java.lang.String r5 = "Getting priority for item with unknown priority, defaulting to MIN priority"
            r4.a((java.lang.String) r5)
        L_0x0362:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r4.intValue()
            int r3 = defpackage.ubw.a(r3)
            int r4 = r17.ordinal()
            r5 = 3
            if (r4 == r5) goto L_0x037c
            r5 = 4
            if (r4 == r5) goto L_0x037c
            r5 = 5
            if (r4 == r5) goto L_0x037c
            r3 = 0
            goto L_0x038c
        L_0x037c:
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x0383
            java.lang.String r3 = "DEVICES_WITHIN_REACH_REBRANDED"
            goto L_0x038c
        L_0x0383:
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == r4) goto L_0x038a
            java.lang.String r3 = "DEVICES_REBRANDED"
            goto L_0x038c
        L_0x038a:
            java.lang.String r3 = "DEVICES_WITH_YOUR_ACCOUNT"
        L_0x038c:
            ubw r4 = new ubw
            r4.<init>(r3)
            java.lang.String r3 = r4.a
            java.lang.String r4 = "DEVICES_WITHIN_REACH_REBRANDED"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x039c
            goto L_0x03a5
        L_0x039c:
            int r4 = r7.I()
            r5 = 3
            if (r4 != r5) goto L_0x03a5
            java.lang.String r3 = "DEVICES_REBRANDED"
        L_0x03a5:
            android.content.Context r4 = r8.a
            java.lang.String r5 = r4.getPackageName()
            java.util.List r4 = defpackage.jgu.d(r4, r5)
            byte[] r5 = r7.n()
            if (r5 == 0) goto L_0x0412
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x03be
            r18 = r13
            goto L_0x0414
        L_0x03be:
            java.lang.String r5 = "DEVICES_WITH_YOUR_ACCOUNT"
            boolean r5 = r3.startsWith(r5)
            r9 = 2131952700(0x7f13043c, float:1.954185E38)
            if (r5 == 0) goto L_0x03d7
            android.content.Context r5 = r8.a
            java.lang.String r5 = r5.getString(r9)
            java.lang.String r9 = r7.k()
            r18 = r13
            goto L_0x0430
        L_0x03d7:
            java.lang.String r5 = r7.k()
            r17 = r5
            java.lang.String r5 = r7.k()
            r18 = r13
            android.content.Context r13 = r8.a
            java.lang.String r9 = r13.getString(r9)
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x040b
            android.content.Context r5 = r8.a
            r9 = 1
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r9 = 0
            java.lang.Object r16 = r4.get(r9)
            r1 = r16
            android.accounts.Account r1 = (android.accounts.Account) r1
            java.lang.String r1 = r1.name
            r13[r9] = r1
            r1 = 2131952655(0x7f13040f, float:1.9541759E38)
            java.lang.String r9 = r5.getString(r1, r13)
            r5 = r17
            goto L_0x0430
        L_0x040b:
            java.lang.String r9 = r7.l()
            r5 = r17
            goto L_0x0430
        L_0x0412:
            r18 = r13
        L_0x0414:
            java.lang.String r5 = r7.k()
            java.lang.String r1 = r7.l()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x042c
            android.content.Context r1 = r8.a
            r9 = 2131952277(0x7f130295, float:1.9540992E38)
            java.lang.String r9 = r1.getString(r9)
            goto L_0x0430
        L_0x042c:
            java.lang.String r9 = r7.l()
        L_0x0430:
            boolean r1 = defpackage.aymw.K()
            if (r1 == 0) goto L_0x0470
            byte[] r1 = r7.v()
            gti r1 = defpackage.gti.a((byte[]) r1)
            if (r1 == 0) goto L_0x045d
            java.lang.String r1 = r1.d
            boolean r13 = android.text.TextUtils.isEmpty(r1)
            if (r13 != 0) goto L_0x045d
            java.lang.String r13 = r1.trim()
            r17 = r0
            java.lang.String r0 = "^LE-[0-9]{4}"
            boolean r0 = r13.matches(r0)
            if (r0 == 0) goto L_0x045f
            r0 = 7
            r13 = 3
            java.lang.String r0 = r1.substring(r13, r0)
            goto L_0x0460
        L_0x045d:
            r17 = r0
        L_0x045f:
            r0 = 0
        L_0x0460:
            if (r0 == 0) goto L_0x0472
            jjg r1 = defpackage.tsp.a
            anie r1 = r1.d()
            anih r1 = (defpackage.anih) r1
            java.lang.String r13 = "FastPair: device serial number=%s, item=%s"
            r1.a((java.lang.String) r13, (java.lang.Object) r0, (java.lang.Object) r7)
            goto L_0x0473
        L_0x0470:
            r17 = r0
        L_0x0472:
            r0 = 0
        L_0x0473:
            udh r1 = new udh
            r1.<init>()
            java.lang.String r13 = r7.i()
            r1.a = r13
            java.lang.String r13 = r7.i()
            r1.b = r13
            r1.c = r5
            r1.d = r9
            r1.e = r0
            android.content.Context r0 = r8.a
            int r0 = defpackage.udc.a((android.content.Context) r0)
            r1.f = r0
            android.graphics.Bitmap r0 = r7.A()
            r1.g = r0
            udf r0 = r8.b
            java.lang.String r5 = r7.i()
            int r9 = defpackage.udl.a(r3)
            android.content.Intent r0 = r0.a((java.lang.String) r5, (int) r9)
            r1.h = r0
            udf r0 = r8.b
            java.lang.String r5 = r7.i()
            int r9 = defpackage.udl.a(r3)
            android.content.Intent r0 = r0.b(r5, r9)
            r1.i = r0
            int r0 = r7.I()
            r5 = 3
            if (r0 != r5) goto L_0x04c1
            r0 = 1
            goto L_0x04c2
        L_0x04c1:
            r0 = 0
        L_0x04c2:
            r1.j = r0
            r1.k = r3
            r1.b()
            byte[] r0 = r7.n()
            if (r0 == 0) goto L_0x04d7
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x04d7
            r0 = 1
            goto L_0x04d8
        L_0x04d7:
            r0 = 0
        L_0x04d8:
            r1.l = r0
            boolean r0 = r7.q()
            r1.m = r0
            udi r0 = r1.a()
            r1 = 1
            if (r12 <= r1) goto L_0x05bd
            java.lang.String r1 = "DEVICES_REBRANDED"
            r0.o = r1
            goto L_0x05bd
        L_0x04ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 34
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected type for device item %s"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0512:
            r17 = r0
            r18 = r13
            udh r0 = new udh
            r0.<init>()
            java.lang.String r1 = "wear_com.google.android.wearable.app"
            r0.a = r1
            java.lang.String r1 = "wear_com.google.android.wearable.app"
            r0.b = r1
            java.lang.String r1 = "Wear OS"
            java.lang.String r1 = r8.a((java.lang.String) r1)
            r0.c = r1
            java.lang.String r1 = "Wear OS"
            java.lang.String r3 = "com.google.android.wearable.app"
            java.lang.String r1 = r8.a((java.lang.String) r1, (java.lang.String) r3)
            r0.d = r1
            android.content.Context r1 = r8.a
            int r1 = defpackage.udc.a((android.content.Context) r1)
            r0.f = r1
            java.lang.String r1 = "DEVICES_REBRANDED"
            udf r3 = r8.b
            int r4 = defpackage.udl.a(r1)
            java.lang.String r5 = "wear_com.google.android.wearable.app"
            android.content.Intent r3 = r3.a((java.lang.String) r5, (int) r4)
            r0.h = r3
            udf r3 = r8.b
            int r4 = defpackage.udl.a(r1)
            java.lang.String r5 = "wear_com.google.android.wearable.app"
            android.content.Intent r3 = r3.b(r5, r4)
            r0.i = r3
            r3 = 1
            r0.j = r3
            r0.k = r1
            r0.b()
            udi r0 = r0.a()
            goto L_0x05bd
        L_0x0568:
            r17 = r0
            r18 = r13
            udh r0 = new udh
            r0.<init>()
            java.lang.String r1 = "cc_com.google.android.apps.chromecast.app"
            r0.a = r1
            java.lang.String r1 = "cc_com.google.android.apps.chromecast.app"
            r0.b = r1
            java.lang.String r1 = "Chromecast"
            java.lang.String r1 = r8.a((java.lang.String) r1)
            r0.c = r1
            java.lang.String r1 = "Google Home"
            java.lang.String r3 = "com.google.android.apps.chromecast.app"
            java.lang.String r1 = r8.a((java.lang.String) r1, (java.lang.String) r3)
            r0.d = r1
            android.content.Context r1 = r8.a
            int r1 = defpackage.udc.a((android.content.Context) r1)
            r0.f = r1
            java.lang.String r1 = "DEVICES_REBRANDED"
            udf r3 = r8.b
            int r4 = defpackage.udl.a(r1)
            java.lang.String r5 = "cc_com.google.android.apps.chromecast.app"
            android.content.Intent r3 = r3.a((java.lang.String) r5, (int) r4)
            r0.h = r3
            udf r3 = r8.b
            int r4 = defpackage.udl.a(r1)
            java.lang.String r5 = "cc_com.google.android.apps.chromecast.app"
            android.content.Intent r3 = r3.b(r5, r4)
            r0.i = r3
            r3 = 1
            r0.j = r3
            r0.k = r1
            r0.b()
            udi r0 = r0.a()
        L_0x05bd:
            r11.add(r0)
        L_0x05c0:
            r10.add(r7)
            int r15 = r15 + 1
            r3 = 0
            r4 = 3
            r5 = 4
            r7 = 0
            r1 = r43
            r0 = r17
            r13 = r18
            r9 = 1
            goto L_0x0304
        L_0x05d2:
            r17 = r0
            boolean r0 = defpackage.udl.a()
            if (r0 == 0) goto L_0x0602
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.size()
            r3 = 0
        L_0x05e4:
            if (r3 >= r1) goto L_0x0600
            java.lang.Object r4 = r11.get(r3)
            udi r4 = (defpackage.udi) r4
            udk r5 = r8.e
            java.lang.String r7 = r4.o
            android.content.Context r9 = r8.a
            java.lang.String r5 = r5.a((java.lang.String) r7, (android.content.Context) r9)
            if (r5 == 0) goto L_0x05fd
            r4.o = r5
            r0.add(r4)
        L_0x05fd:
            int r3 = r3 + 1
            goto L_0x05e4
        L_0x0600:
            r11 = r0
            goto L_0x0603
        L_0x0602:
        L_0x0603:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.size()
            r3 = 0
        L_0x060d:
            if (r3 >= r1) goto L_0x0626
            java.lang.Object r4 = r11.get(r3)
            udi r4 = (defpackage.udi) r4
            int r3 = r3 + 1
            java.lang.String r5 = r4.o
            java.lang.String r7 = "DEVICES_WITHIN_REACH_REBRANDED"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x060d
            r0.add(r4)
            r7 = r4
            goto L_0x0627
        L_0x0626:
            r7 = 0
        L_0x0627:
            if (r7 == 0) goto L_0x064c
            r11.remove(r7)
            java.util.Iterator r1 = r14.iterator()
        L_0x0630:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x064c
            java.lang.Object r3 = r1.next()
            ttg r3 = (defpackage.ttg) r3
            java.lang.String r3 = r3.i()
            java.lang.String r4 = r7.b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0630
            r1.remove()
            goto L_0x0630
        L_0x064c:
            int r1 = r11.size()
            r3 = 1
            if (r1 != r3) goto L_0x065e
            r1 = 0
            java.lang.Object r4 = r11.get(r1)
            udi r4 = (defpackage.udi) r4
            r0.add(r4)
            goto L_0x0667
        L_0x065e:
            int r1 = r11.size()
            if (r1 <= r3) goto L_0x0667
            r0.addAll(r11)
        L_0x0667:
            r6.addAll(r0)
            goto L_0x0695
        L_0x066b:
            r17 = r0
            java.lang.Object r0 = r14.get(r11)
            ttg r0 = (defpackage.ttg) r0
            avbx r0 = r0.j()
            avbx r1 = defpackage.avbx.NEARBY_DEVICE
            if (r0 == r1) goto L_0x067c
            goto L_0x067e
        L_0x067c:
            int r12 = r12 + 1
        L_0x067e:
            int r11 = r11 + 1
            r3 = 0
            r4 = 3
            r5 = 4
            r7 = 0
            r1 = r43
            r0 = r17
            r9 = 1
            goto L_0x02f3
        L_0x068b:
            r17 = r0
            java.lang.String r0 = "Device notification hidden in settings"
            defpackage.udc.a((java.util.Collection) r14, (java.lang.String) r0)
            goto L_0x0695
        L_0x0693:
            r17 = r0
        L_0x0695:
            amzy r6 = defpackage.amzy.a((java.util.Collection) r6)
            goto L_0x074f
        L_0x069b:
            r17 = r0
            java.lang.Object r0 = r11.get(r6)
            ttg r0 = (defpackage.ttg) r0
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x06aa
            goto L_0x06ad
        L_0x06aa:
            r14.add(r0)
        L_0x06ad:
            int r6 = r6 + 1
            r3 = 0
            r4 = 3
            r5 = 4
            r7 = 0
            r1 = r43
            r0 = r17
            r9 = 1
            goto L_0x02d3
        L_0x06ba:
            r17 = r0
            java.lang.Object r0 = r10.get(r13)
            ttg r0 = (defpackage.ttg) r0
            avbx r1 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
            int r1 = r0.J()
            int r3 = r1 + -1
            if (r1 == 0) goto L_0x0711
            r1 = 1
            if (r3 == r1) goto L_0x0701
            if (r3 == r6) goto L_0x06fa
            r1 = 3
            if (r3 == r1) goto L_0x06f3
            jjg r1 = defpackage.tsp.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            int r3 = r0.J()
            int r4 = r3 + -1
            if (r3 == 0) goto L_0x06f0
            java.lang.String r3 = "Unknown state=%d for item %s"
            r1.a((java.lang.String) r3, (int) r4, (java.lang.Object) r0)
            java.lang.String r1 = "Notification temporarily disabled"
            r3 = 3
            r0.a((int) r3, (java.lang.String) r1)
            goto L_0x0704
        L_0x06f0:
            r1 = 0
            throw r1
        L_0x06f3:
            r3 = 3
            java.lang.String r1 = "Notification temporarily disabled"
            r0.a((int) r3, (java.lang.String) r1)
            goto L_0x0704
        L_0x06fa:
            r3 = 3
            java.lang.String r1 = "Notification muted by user"
            r0.a((int) r3, (java.lang.String) r1)
            goto L_0x0704
        L_0x0701:
            r11.add(r0)
        L_0x0704:
            int r13 = r13 + 1
            r3 = 0
            r5 = 4
            r1 = r43
            r0 = r17
            r4 = 3
            r7 = 0
            r9 = 1
            goto L_0x02c1
        L_0x0711:
            r1 = 0
            throw r1
        L_0x0714:
            r17 = r0
            r1 = r7
            java.lang.Object r0 = r2.get(r12)
            ttg r0 = (defpackage.ttg) r0
            uap r3 = r8.d
            boolean r3 = r3.b()
            if (r3 != 0) goto L_0x0734
            boolean r3 = r0.f()
            if (r3 == 0) goto L_0x072c
            goto L_0x0734
        L_0x072c:
            java.lang.String r3 = "Notification temporarily disabled because recently dismissed"
            r4 = 3
            r0.a((int) r4, (java.lang.String) r3)
            goto L_0x0737
        L_0x0734:
            r10.add(r0)
        L_0x0737:
            int r12 = r12 + 1
            r7 = r1
            r0 = r17
            r3 = 0
            r4 = 3
            r5 = 4
            r9 = 1
            r1 = r43
            goto L_0x02ab
        L_0x0744:
            r17 = r0
            java.lang.String r0 = "Notification disabled by configuration"
            defpackage.udc.a((java.util.Collection) r2, (java.lang.String) r0)
            amzy r6 = defpackage.amzy.h()
        L_0x074f:
            r0 = r17
            r0.a((java.util.List) r6)
        L_0x0754:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0772
            r1 = r43
            arwg r0 = r1.c
            arwm r3 = r1.j
            r0.e(r3)
            arwg r0 = r1.c
            arwm r3 = r1.j
            long r4 = defpackage.aymq.k()
            r6 = 1
            long r4 = r4 + r6
            r0.a(r3, r4)
            goto L_0x0774
        L_0x0772:
            r1 = r43
        L_0x0774:
            boolean r0 = defpackage.aymw.ab()
            if (r0 != 0) goto L_0x0870
            android.content.Context r0 = r1.e
            java.lang.Class<com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService> r3 = com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r3)
            com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService r0 = (com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
            r5 = 0
            r6 = 0
            r9 = 0
        L_0x0794:
            if (r9 >= r4) goto L_0x086b
            java.lang.Object r7 = r2.get(r9)
            ttg r7 = (defpackage.ttg) r7
            avbx r8 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
            avbx r8 = r7.j()
            int r8 = r8.ordinal()
            r10 = 2131952467(0x7f130353, float:1.9541378E38)
            r11 = 3
            if (r8 == r11) goto L_0x082f
            r12 = 4
            if (r8 == r12) goto L_0x07f6
            int r8 = r7.J()
            if (r8 == r12) goto L_0x07f2
            avbx r8 = r7.j()
            avbx r10 = defpackage.avbx.NEARBY_DEVICE
            if (r8 != r10) goto L_0x07d2
            udf r8 = r1.g
            java.lang.String r10 = r7.i()
            android.content.Intent r8 = r8.a((java.lang.String) r10)
            com.google.location.nearby.common.fastpair.DiscoveryListItem r7 = r7.a((android.content.Intent) r8)
            r3.add(r7)
            r8 = 1
            r14 = 0
            goto L_0x0867
        L_0x07d2:
            udf r8 = r1.g
            java.lang.String r10 = r7.i()
            android.content.Context r8 = r8.a
            android.content.Intent r8 = com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService.a((android.content.Context) r8)
            java.lang.String r12 = "com.google.android.gms.nearby.discovery.ACTION_DISCOVERY_LIST_ACTIVITY_ITEM_CLICK"
            android.content.Intent r8 = r8.setAction(r12)
            java.lang.String r12 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID"
            android.content.Intent r8 = r8.putExtra(r12, r10)
            com.google.location.nearby.common.fastpair.DiscoveryListItem r7 = r7.a((android.content.Intent) r8)
            r3.add(r7)
            goto L_0x07f3
        L_0x07f2:
        L_0x07f3:
            r8 = 1
            r14 = 0
            goto L_0x0867
        L_0x07f6:
            if (r6 != 0) goto L_0x082e
            boolean r26 = r7.g()
            com.google.location.nearby.common.fastpair.DiscoveryListItem r6 = new com.google.location.nearby.common.fastpair.DiscoveryListItem
            android.content.Context r7 = r1.e
            r8 = 1
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.String r8 = "Wear OS"
            r13 = 0
            r12[r13] = r8
            java.lang.String r21 = r7.getString(r10, r12)
            r22 = 0
            r25 = -1082130432(0xffffffffbf800000, float:-1.0)
            avbx r27 = defpackage.avbx.NEARBY_WEAR
            java.lang.String r7 = "wear_com.google.android.wearable.app"
            android.content.Intent r28 = r1.a((java.lang.String) r7)
            r29 = 0
            r30 = 1
            java.lang.String r20 = "wear_com.google.android.wearable.app"
            java.lang.String r23 = "Wear OS"
            java.lang.String r24 = "com.google.android.wearable.app"
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3.add(r6)
            r6 = 1
        L_0x082b:
            r8 = 1
            r14 = 0
            goto L_0x0867
        L_0x082e:
            goto L_0x082b
        L_0x082f:
            if (r5 != 0) goto L_0x0865
            boolean r38 = r7.g()
            com.google.location.nearby.common.fastpair.DiscoveryListItem r5 = new com.google.location.nearby.common.fastpair.DiscoveryListItem
            android.content.Context r7 = r1.e
            r8 = 1
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.String r13 = "Chromecast"
            r14 = 0
            r12[r14] = r13
            java.lang.String r33 = r7.getString(r10, r12)
            r34 = 0
            r37 = -1082130432(0xffffffffbf800000, float:-1.0)
            avbx r39 = defpackage.avbx.NEARBY_CHROMECAST
            java.lang.String r7 = "cc_com.google.android.apps.chromecast.app"
            android.content.Intent r40 = r1.a((java.lang.String) r7)
            r41 = 0
            r42 = 1
            java.lang.String r32 = "cc_com.google.android.apps.chromecast.app"
            java.lang.String r35 = "Google Home"
            java.lang.String r36 = "com.google.android.apps.chromecast.app"
            r31 = r5
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r3.add(r5)
            r5 = 1
            goto L_0x0867
        L_0x0865:
            r8 = 1
            r14 = 0
        L_0x0867:
            int r9 = r9 + 1
            goto L_0x0794
        L_0x086b:
            r5 = r44
            r0.a(r5, r3)
        L_0x0870:
            return
        L_0x0871:
            r5 = r44
            r14 = 0
            r3 = r45
            java.lang.Object r6 = r3.get(r4)
            ttg r6 = (defpackage.ttg) r6
            auzz r7 = r6.s()
            int r7 = r7.b
            int r7 = defpackage.avbj.b(r7)
            if (r7 != 0) goto L_0x0889
            goto L_0x08a1
        L_0x0889:
            r8 = 101(0x65, float:1.42E-43)
            if (r7 != r8) goto L_0x08a1
            boolean r7 = r6.C()
            if (r7 == 0) goto L_0x089a
            java.lang.String r7 = "Targeting does not match"
            r8 = 4
            r6.a((int) r8, (java.lang.String) r7)
            goto L_0x08a4
        L_0x089a:
            r8 = 4
            java.lang.String r7 = "Rated poorly on server"
            r6.a((int) r8, (java.lang.String) r7)
            goto L_0x08a4
        L_0x08a1:
            r0.add(r6)
        L_0x08a4:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubv.a(int, java.util.Collection):void");
    }

    public final void a(Message message) {
        char c2;
        avbx avbx;
        ttg e2;
        this.c.b();
        ttf ttf = this.a;
        String str = message.d;
        if (str.hashCode() == -1002207107 && str.equals("com.google.nearby.discoverer")) {
            c2 = 0;
        } else {
            c2 = 65535;
        }
        auzv auzv = null;
        if (c2 == 0) {
            try {
                auzv auzv2 = (auzv) aucj.a((aucj) auzv.x, message.b, aubs.c());
                avbx a2 = avbx.a(auzv2.b);
                if (a2 == null) {
                    a2 = avbx.NEARBY_TYPE_UNKNOWN;
                }
                if (a2 == avbx.NEARBY_DEVICE && (e2 = ttf.e(auzv2.c)) != null) {
                    jjg jjg = tsp.a;
                    e2.a(ttf.a.a());
                }
                auzv = auzv2;
            } catch (Exception e3) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e3);
                anih.a("Could not parse NearbyItem from Nearby Message: %s", (Object) message);
            }
        }
        if (auzv != null) {
            avbx = avbx.a(auzv.b);
            if (avbx == null) {
                avbx = avbx.NEARBY_TYPE_UNKNOWN;
            }
        } else {
            avbx = avbx.NEARBY_TYPE_UNKNOWN;
        }
        a(0, avbx);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0681  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x068c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.nearby.messages.Message r19, java.lang.String r20, com.google.android.gms.nearby.messages.internal.BleSignalImpl r21, byte[] r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            r3 = r21
            arwg r4 = r1.c
            r4.b()
            ttf r4 = r1.a
            java.lang.String r5 = r2.d
            int r6 = r5.hashCode()
            r7 = -1002207107(0xffffffffc443887d, float:-782.1326)
            r9 = 1
            r10 = 0
            if (r6 == r7) goto L_0x002c
            r7 = 349494500(0x14d4dce4, float:2.1493656E-26)
            if (r6 == r7) goto L_0x0022
            goto L_0x0036
        L_0x0022:
            java.lang.String r6 = "__reserved_namespace"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0036
            r5 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r6 = "com.google.nearby.discoverer"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = -1
        L_0x0037:
            r7 = 3
            r11 = 5
            if (r5 == 0) goto L_0x04a6
            if (r5 == r9) goto L_0x004f
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = r2.d
            java.lang.String r3 = "Unexpected message namespace: %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            r14 = 0
            goto L_0x067f
        L_0x004f:
            byte[] r5 = r2.b     // Catch:{ Exception -> 0x0492 }
            aubs r15 = defpackage.aubs.c()     // Catch:{ Exception -> 0x0492 }
            auzv r14 = defpackage.auzv.x     // Catch:{ Exception -> 0x0492 }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r14, (byte[]) r5, (defpackage.aubs) r15)     // Catch:{ Exception -> 0x0492 }
            auzv r5 = (defpackage.auzv) r5     // Catch:{ Exception -> 0x0492 }
            auzw r14 = r5.o     // Catch:{ Exception -> 0x0492 }
            if (r14 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            auzw r14 = defpackage.auzw.b     // Catch:{ Exception -> 0x0492 }
        L_0x0064:
            aucx r14 = r14.a     // Catch:{ Exception -> 0x0492 }
            int r14 = r14.size()     // Catch:{ Exception -> 0x0492 }
            if (r14 <= 0) goto L_0x0099
            auzw r14 = r5.o     // Catch:{ Exception -> 0x0492 }
            if (r14 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            auzw r14 = defpackage.auzw.b     // Catch:{ Exception -> 0x0492 }
        L_0x0073:
            aucx r14 = r14.a     // Catch:{ Exception -> 0x0492 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x0492 }
        L_0x0079:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x0492 }
            if (r15 == 0) goto L_0x0099
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x0492 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0492 }
            jjg r16 = defpackage.tsp.a     // Catch:{ Exception -> 0x0492 }
            anie r16 = r16.c()     // Catch:{ Exception -> 0x0492 }
            r12 = r16
            anih r12 = (defpackage.anih) r12     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = "Disabled by server: %s, %s, %s"
            java.lang.String r8 = r5.t     // Catch:{ Exception -> 0x0492 }
            java.lang.String r13 = r5.c     // Catch:{ Exception -> 0x0492 }
            r12.a((java.lang.String) r6, (java.lang.Object) r8, (java.lang.Object) r13, (java.lang.Object) r15)     // Catch:{ Exception -> 0x0492 }
            goto L_0x0079
        L_0x0099:
            int r6 = r5.a     // Catch:{ Exception -> 0x0492 }
            r8 = r6 & 2
            if (r8 != 0) goto L_0x00ae
            jjg r0 = defpackage.tsp.a     // Catch:{ Exception -> 0x0492 }
            anie r0 = r0.b()     // Catch:{ Exception -> 0x0492 }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x0492 }
            java.lang.String r3 = "Server returns null ID: %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r5)     // Catch:{ Exception -> 0x0492 }
            goto L_0x048f
        L_0x00ae:
            r8 = 1048576(0x100000, float:1.469368E-39)
            r6 = r6 & r8
            if (r6 != 0) goto L_0x00d4
            aymq r6 = defpackage.aymq.a     // Catch:{ Exception -> 0x0492 }
            aymr r6 = r6.a()     // Catch:{ Exception -> 0x0492 }
            boolean r6 = r6.i()     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x00d4
            int r0 = r5.a     // Catch:{ Exception -> 0x0492 }
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L_0x00d2
            jjg r0 = defpackage.tsp.a     // Catch:{ Exception -> 0x0492 }
            anie r0 = r0.b()     // Catch:{ Exception -> 0x0492 }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x0492 }
            java.lang.String r3 = "Server returns null entity ID: %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r5)     // Catch:{ Exception -> 0x0492 }
        L_0x00d2:
            goto L_0x048f
        L_0x00d4:
            int r6 = r5.b     // Catch:{ Exception -> 0x0492 }
            avbx r6 = defpackage.avbx.a(r6)     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x00de
            avbx r6 = defpackage.avbx.NEARBY_TYPE_UNKNOWN     // Catch:{ Exception -> 0x0492 }
        L_0x00de:
            boolean r6 = defpackage.ttg.b((defpackage.avbx) r6)     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x0475
            tth r6 = r4.b     // Catch:{ Exception -> 0x0492 }
            java.lang.String r12 = r5.c     // Catch:{ Exception -> 0x0492 }
            java.lang.Object r6 = r6.a((java.lang.String) r12)     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            jiq r12 = r4.a     // Catch:{ Exception -> 0x0492 }
            long r12 = r12.a()     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x00f7
            goto L_0x0158
        L_0x00f7:
            uaj r6 = defpackage.ttg.a()     // Catch:{ Exception -> 0x0492 }
            java.lang.Object r14 = r6.c(r11)     // Catch:{ Exception -> 0x0492 }
            aucd r14 = (defpackage.aucd) r14     // Catch:{ Exception -> 0x0492 }
            r14.a((defpackage.aucj) r6)     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = r5.c     // Catch:{ Exception -> 0x0492 }
            boolean r15 = r14.c     // Catch:{ Exception -> 0x0492 }
            if (r15 != 0) goto L_0x010b
            goto L_0x0110
        L_0x010b:
            r14.c()     // Catch:{ Exception -> 0x0492 }
            r14.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x0110:
            aucj r15 = r14.b     // Catch:{ Exception -> 0x0492 }
            uaj r15 = (defpackage.uaj) r15     // Catch:{ Exception -> 0x0492 }
            uaj r17 = defpackage.uaj.K     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            int r8 = r15.a     // Catch:{ Exception -> 0x0492 }
            r8 = r8 | r9
            r15.a = r8     // Catch:{ Exception -> 0x0492 }
            r15.c = r6     // Catch:{ Exception -> 0x0492 }
            r6 = r8 | 512(0x200, float:7.175E-43)
            r15.a = r6     // Catch:{ Exception -> 0x0492 }
            r15.l = r12     // Catch:{ Exception -> 0x0492 }
            int r6 = r5.b     // Catch:{ Exception -> 0x0492 }
            avbx r6 = defpackage.avbx.a(r6)     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            avbx r6 = defpackage.avbx.NEARBY_TYPE_UNKNOWN     // Catch:{ Exception -> 0x0492 }
        L_0x0131:
            avbx r8 = defpackage.avbx.NEARBY_DEVICE     // Catch:{ Exception -> 0x0492 }
            if (r6 == r8) goto L_0x0136
            goto L_0x0152
        L_0x0136:
            boolean r6 = r4.h     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x0152
            jjg r6 = defpackage.tsp.a     // Catch:{ Exception -> 0x0492 }
            boolean r6 = r14.c     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x0141
            goto L_0x0146
        L_0x0141:
            r14.c()     // Catch:{ Exception -> 0x0492 }
            r14.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x0146:
            aucj r6 = r14.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            r6.m = r7     // Catch:{ Exception -> 0x0492 }
            int r7 = r6.a     // Catch:{ Exception -> 0x0492 }
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r6.a = r7     // Catch:{ Exception -> 0x0492 }
        L_0x0152:
            aucj r6 = r14.i()     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
        L_0x0158:
            java.lang.Object r7 = r6.c(r11)     // Catch:{ Exception -> 0x0492 }
            aucd r7 = (defpackage.aucd) r7     // Catch:{ Exception -> 0x0492 }
            r7.a((defpackage.aucj) r6)     // Catch:{ Exception -> 0x0492 }
            int r6 = r5.b     // Catch:{ Exception -> 0x0492 }
            avbx r6 = defpackage.avbx.a(r6)     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            avbx r6 = defpackage.avbx.NEARBY_TYPE_UNKNOWN     // Catch:{ Exception -> 0x0492 }
        L_0x016d:
            boolean r8 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r8 != 0) goto L_0x0172
            goto L_0x0177
        L_0x0172:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x0177:
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            int r6 = r6.h     // Catch:{ Exception -> 0x0492 }
            r8.d = r6     // Catch:{ Exception -> 0x0492 }
            int r6 = r8.a     // Catch:{ Exception -> 0x0492 }
            r11 = 2
            r6 = r6 | r11
            r8.a = r6     // Catch:{ Exception -> 0x0492 }
            aucx r6 = r5.k     // Catch:{ Exception -> 0x0492 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x019e
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            aucx r6 = r6.C     // Catch:{ Exception -> 0x0492 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ Exception -> 0x0492 }
            aucx r8 = r5.k     // Catch:{ Exception -> 0x0492 }
            java.util.List r6 = defpackage.tsr.a(r6, r8)     // Catch:{ Exception -> 0x0492 }
            goto L_0x01bb
        L_0x019e:
            int r6 = r5.a     // Catch:{ Exception -> 0x0492 }
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x01b1
            jjg r6 = defpackage.tsp.a     // Catch:{ Exception -> 0x0492 }
            anie r6 = r6.c()     // Catch:{ Exception -> 0x0492 }
            anih r6 = (defpackage.anih) r6     // Catch:{ Exception -> 0x0492 }
            java.lang.String r8 = "No relevances for item: %s"
            r6.a((java.lang.String) r8, (java.lang.Object) r5)     // Catch:{ Exception -> 0x0492 }
        L_0x01b1:
            int[] r6 = new int[r9]     // Catch:{ Exception -> 0x0492 }
            r8 = 101(0x65, float:1.42E-43)
            r6[r10] = r8     // Catch:{ Exception -> 0x0492 }
            java.util.List r6 = defpackage.tsr.a((int[]) r6)     // Catch:{ Exception -> 0x0492 }
        L_0x01bb:
            aymq r8 = defpackage.aymq.a     // Catch:{ Exception -> 0x0492 }
            aymr r8 = r8.a()     // Catch:{ Exception -> 0x0492 }
            boolean r8 = r8.l()     // Catch:{ Exception -> 0x0492 }
            if (r8 != 0) goto L_0x01c8
            goto L_0x01dc
        L_0x01c8:
            boolean r8 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r8 != 0) goto L_0x01cd
            goto L_0x01d2
        L_0x01cd:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x01d2:
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            aucx r11 = defpackage.aucj.s()     // Catch:{ Exception -> 0x0492 }
            r8.C = r11     // Catch:{ Exception -> 0x0492 }
        L_0x01dc:
            r7.ab(r6)     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = r5.l     // Catch:{ Exception -> 0x0492 }
            boolean r8 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r8 != 0) goto L_0x01e6
            goto L_0x01eb
        L_0x01e6:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x01eb:
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            int r11 = r8.a     // Catch:{ Exception -> 0x0492 }
            r14 = 32768(0x8000, float:4.5918E-41)
            r11 = r11 | r14
            r8.a = r11     // Catch:{ Exception -> 0x0492 }
            r8.r = r6     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = r5.h     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            r15 = 524288(0x80000, float:7.34684E-40)
            r11 = r11 | r15
            r8.a = r11     // Catch:{ Exception -> 0x0492 }
            r8.v = r6     // Catch:{ Exception -> 0x0492 }
            int r6 = r5.a     // Catch:{ Exception -> 0x0492 }
            r6 = r6 & r14
            if (r6 == 0) goto L_0x0214
            float r6 = r5.r     // Catch:{ Exception -> 0x0492 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x0492 }
            goto L_0x0215
        L_0x0214:
            r6 = 0
        L_0x0215:
            if (r6 != 0) goto L_0x0232
            boolean r6 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x021c
        L_0x021b:
            goto L_0x0222
        L_0x021c:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
            goto L_0x021b
        L_0x0222:
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            int r8 = r6.a     // Catch:{ Exception -> 0x0492 }
            r11 = -1048577(0xffffffffffefffff, float:NaN)
            r8 = r8 & r11
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r8 = 0
            r6.w = r8     // Catch:{ Exception -> 0x0492 }
            goto L_0x024d
        L_0x0232:
            float r6 = r6.floatValue()     // Catch:{ Exception -> 0x0492 }
            boolean r8 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r8 != 0) goto L_0x023b
            goto L_0x0240
        L_0x023b:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x0240:
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            int r11 = r8.a     // Catch:{ Exception -> 0x0492 }
            r14 = 1048576(0x100000, float:1.469368E-39)
            r11 = r11 | r14
            r8.a = r11     // Catch:{ Exception -> 0x0492 }
            r8.w = r6     // Catch:{ Exception -> 0x0492 }
        L_0x024d:
            java.lang.String r6 = r5.s     // Catch:{ Exception -> 0x0492 }
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            int r11 = r8.a     // Catch:{ Exception -> 0x0492 }
            r14 = 2097152(0x200000, float:2.938736E-39)
            r11 = r11 | r14
            r8.a = r11     // Catch:{ Exception -> 0x0492 }
            r8.x = r6     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = r5.i     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            r11 = r11 | 8
            r8.a = r11     // Catch:{ Exception -> 0x0492 }
            r8.f = r6     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = r5.e     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            r11 = r11 | 64
            r8.a = r11     // Catch:{ Exception -> 0x0492 }
            r8.i = r6     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = r5.f     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            r11 = r11 | 128(0x80, float:1.794E-43)
            r8.a = r11     // Catch:{ Exception -> 0x0492 }
            r8.j = r6     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = r5.d     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            r11 = r11 | 32
            r8.a = r11     // Catch:{ Exception -> 0x0492 }
            r8.h = r6     // Catch:{ Exception -> 0x0492 }
            int r6 = r5.j     // Catch:{ Exception -> 0x0492 }
            int r6 = defpackage.avcb.a(r6)     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x0295
            r9 = r6
            goto L_0x0296
        L_0x0295:
        L_0x0296:
            boolean r6 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x029b
            goto L_0x02a0
        L_0x029b:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x02a0:
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            r8 = -1
            int r9 = r9 + r8
            r6.n = r9     // Catch:{ Exception -> 0x0492 }
            int r8 = r6.a     // Catch:{ Exception -> 0x0492 }
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r8 = r8 | 256(0x100, float:3.59E-43)
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r6.k = r12     // Catch:{ Exception -> 0x0492 }
            int r9 = r5.a     // Catch:{ Exception -> 0x0492 }
            r9 = r9 & 2048(0x800, float:2.87E-42)
            if (r9 != 0) goto L_0x02bb
            goto L_0x02c7
        L_0x02bb:
            java.lang.String r9 = r5.n     // Catch:{ Exception -> 0x0492 }
            r9.getClass()     // Catch:{ Exception -> 0x0492 }
            r11 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r11
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r6.s = r9     // Catch:{ Exception -> 0x0492 }
        L_0x02c7:
            int r9 = r5.a     // Catch:{ Exception -> 0x0492 }
            r11 = 262144(0x40000, float:3.67342E-40)
            r9 = r9 & r11
            if (r9 == 0) goto L_0x02da
            java.lang.String r9 = r5.t     // Catch:{ Exception -> 0x0492 }
            r9.getClass()     // Catch:{ Exception -> 0x0492 }
            r12 = 4194304(0x400000, float:5.877472E-39)
            r8 = r8 | r12
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r6.y = r9     // Catch:{ Exception -> 0x0492 }
        L_0x02da:
            int r6 = r5.a     // Catch:{ Exception -> 0x0492 }
            r6 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x02e7
            long r8 = r5.p     // Catch:{ Exception -> 0x0492 }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0492 }
            goto L_0x02e8
        L_0x02e7:
            r6 = 0
        L_0x02e8:
            if (r6 != 0) goto L_0x0306
            boolean r6 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x02ef
        L_0x02ee:
            goto L_0x02f5
        L_0x02ef:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
            goto L_0x02ee
        L_0x02f5:
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            int r8 = r6.a     // Catch:{ Exception -> 0x0492 }
            r9 = -131073(0xfffffffffffdffff, float:NaN)
            r8 = r8 & r9
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r8 = 0
            r6.t = r8     // Catch:{ Exception -> 0x0492 }
            goto L_0x0321
        L_0x0306:
            long r8 = r6.longValue()     // Catch:{ Exception -> 0x0492 }
            boolean r6 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x030f
            goto L_0x0314
        L_0x030f:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x0314:
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            int r12 = r6.a     // Catch:{ Exception -> 0x0492 }
            r13 = 131072(0x20000, float:1.83671E-40)
            r12 = r12 | r13
            r6.a = r12     // Catch:{ Exception -> 0x0492 }
            r6.t = r8     // Catch:{ Exception -> 0x0492 }
        L_0x0321:
            int r6 = r5.a     // Catch:{ Exception -> 0x0492 }
            r6 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0349
            int r6 = r5.q     // Catch:{ Exception -> 0x0492 }
            avbe r6 = defpackage.avbe.a(r6)     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            avbe r6 = defpackage.avbe.DISCOVERY_ATTACHMENT_TYPE_UNKNOWN     // Catch:{ Exception -> 0x0492 }
        L_0x0332:
            boolean r8 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r8 != 0) goto L_0x0337
            goto L_0x033c
        L_0x0337:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x033c:
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            int r6 = r6.d     // Catch:{ Exception -> 0x0492 }
            r8.u = r6     // Catch:{ Exception -> 0x0492 }
            int r6 = r8.a     // Catch:{ Exception -> 0x0492 }
            r6 = r6 | r11
            r8.a = r6     // Catch:{ Exception -> 0x0492 }
        L_0x0349:
            auay r6 = r5.g     // Catch:{ Exception -> 0x0492 }
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            int r9 = r8.a     // Catch:{ Exception -> 0x0492 }
            r11 = 8388608(0x800000, float:1.17549435E-38)
            r9 = r9 | r11
            r8.a = r9     // Catch:{ Exception -> 0x0492 }
            r8.z = r6     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = r5.u     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            r9 = r9 | r11
            r8.a = r9     // Catch:{ Exception -> 0x0492 }
            r8.G = r6     // Catch:{ Exception -> 0x0492 }
            int r6 = r5.a     // Catch:{ Exception -> 0x0492 }
            r6 = r6 & r14
            if (r6 == 0) goto L_0x0378
            auay r6 = r5.v     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            r11 = 1073741824(0x40000000, float:2.0)
            r9 = r9 | r11
            r8.a = r9     // Catch:{ Exception -> 0x0492 }
            r8.H = r6     // Catch:{ Exception -> 0x0492 }
        L_0x0378:
            auzo r6 = r5.w     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x037d
            goto L_0x037f
        L_0x037d:
            auzo r6 = defpackage.auzo.j     // Catch:{ Exception -> 0x0492 }
        L_0x037f:
            boolean r8 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r8 != 0) goto L_0x0384
            goto L_0x0389
        L_0x0384:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x0389:
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            r8.I = r6     // Catch:{ Exception -> 0x0492 }
            int r6 = r8.a     // Catch:{ Exception -> 0x0492 }
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r9
            r8.a = r6     // Catch:{ Exception -> 0x0492 }
            auzw r6 = r5.o     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x039e
            goto L_0x03a0
        L_0x039e:
            auzw r6 = defpackage.auzw.b     // Catch:{ Exception -> 0x0492 }
        L_0x03a0:
            aucx r6 = r6.a     // Catch:{ Exception -> 0x0492 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x0492 }
            if (r6 > 0) goto L_0x03dc
            boolean r6 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x03ad
            goto L_0x03b2
        L_0x03ad:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x03b2:
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            int r8 = r6.a     // Catch:{ Exception -> 0x0492 }
            r9 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r8 = r8 & r9
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            uaj r8 = defpackage.uaj.K     // Catch:{ Exception -> 0x0492 }
            java.lang.String r8 = r8.A     // Catch:{ Exception -> 0x0492 }
            r6.A = r8     // Catch:{ Exception -> 0x0492 }
            boolean r6 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x03c9
            goto L_0x03ce
        L_0x03c9:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x03ce:
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            r6.B = r10     // Catch:{ Exception -> 0x0492 }
            int r8 = r6.a     // Catch:{ Exception -> 0x0492 }
            r9 = 33554432(0x2000000, float:9.403955E-38)
            r8 = r8 | r9
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            goto L_0x040d
        L_0x03dc:
            auzw r6 = r5.o     // Catch:{ Exception -> 0x0492 }
            if (r6 == 0) goto L_0x03e1
            goto L_0x03e3
        L_0x03e1:
            auzw r6 = defpackage.auzw.b     // Catch:{ Exception -> 0x0492 }
        L_0x03e3:
            aucx r6 = r6.a     // Catch:{ Exception -> 0x0492 }
            java.lang.Object r6 = r6.get(r10)     // Catch:{ Exception -> 0x0492 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0492 }
            boolean r8 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r8 != 0) goto L_0x03f0
            goto L_0x03f5
        L_0x03f0:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x03f5:
            aucj r8 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r8 = (defpackage.uaj) r8     // Catch:{ Exception -> 0x0492 }
            r6.getClass()     // Catch:{ Exception -> 0x0492 }
            int r9 = r8.a     // Catch:{ Exception -> 0x0492 }
            r11 = 16777216(0x1000000, float:2.3509887E-38)
            r9 = r9 | r11
            r8.a = r9     // Catch:{ Exception -> 0x0492 }
            r8.A = r6     // Catch:{ Exception -> 0x0492 }
            r6 = 4
            r8.B = r6     // Catch:{ Exception -> 0x0492 }
            r6 = 33554432(0x2000000, float:9.403955E-38)
            r6 = r6 | r9
            r8.a = r6     // Catch:{ Exception -> 0x0492 }
        L_0x040d:
            if (r0 == 0) goto L_0x041e
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            r20.getClass()     // Catch:{ Exception -> 0x0492 }
            int r8 = r6.a     // Catch:{ Exception -> 0x0492 }
            r9 = 4
            r8 = r8 | r9
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r6.e = r0     // Catch:{ Exception -> 0x0492 }
        L_0x041e:
            if (r22 == 0) goto L_0x043e
            auay r0 = defpackage.auay.a((byte[]) r22)     // Catch:{ Exception -> 0x0492 }
            boolean r6 = r7.c     // Catch:{ Exception -> 0x0492 }
            if (r6 != 0) goto L_0x0429
            goto L_0x042e
        L_0x0429:
            r7.c()     // Catch:{ Exception -> 0x0492 }
            r7.c = r10     // Catch:{ Exception -> 0x0492 }
        L_0x042e:
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            r0.getClass()     // Catch:{ Exception -> 0x0492 }
            int r8 = r6.a     // Catch:{ Exception -> 0x0492 }
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r8 = r8 | r9
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r6.F = r0     // Catch:{ Exception -> 0x0492 }
        L_0x043e:
            if (r3 != 0) goto L_0x0441
            goto L_0x045e
        L_0x0441:
            int r0 = r3.b     // Catch:{ Exception -> 0x0492 }
            aucj r6 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r6 = (defpackage.uaj) r6     // Catch:{ Exception -> 0x0492 }
            int r8 = r6.a     // Catch:{ Exception -> 0x0492 }
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r6.p = r0     // Catch:{ Exception -> 0x0492 }
            int r3 = r3.c     // Catch:{ Exception -> 0x0492 }
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r9) goto L_0x045e
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r6.a = r8     // Catch:{ Exception -> 0x0492 }
            r6.q = r3     // Catch:{ Exception -> 0x0492 }
            defpackage.guq.b(r0, r3)     // Catch:{ Exception -> 0x0492 }
        L_0x045e:
            tth r0 = r4.b     // Catch:{ Exception -> 0x0492 }
            aucj r3 = r7.i()     // Catch:{ Exception -> 0x0492 }
            uaj r3 = (defpackage.uaj) r3     // Catch:{ Exception -> 0x0492 }
            r0.e(r3)     // Catch:{ Exception -> 0x0492 }
            jjg r0 = defpackage.tsp.a     // Catch:{ Exception -> 0x0492 }
            aucj r0 = r7.b     // Catch:{ Exception -> 0x0492 }
            uaj r0 = (defpackage.uaj) r0     // Catch:{ Exception -> 0x0492 }
            aucx r0 = r0.C     // Catch:{ Exception -> 0x0492 }
            r0.size()     // Catch:{ Exception -> 0x0492 }
            goto L_0x048f
        L_0x0475:
            jjg r0 = defpackage.tsp.a     // Catch:{ Exception -> 0x0492 }
            anie r0 = r0.c()     // Catch:{ Exception -> 0x0492 }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x0492 }
            java.lang.String r3 = "Item skipped because type %s disabled"
            int r4 = r5.b     // Catch:{ Exception -> 0x0492 }
            avbx r4 = defpackage.avbx.a(r4)     // Catch:{ Exception -> 0x0492 }
            if (r4 == 0) goto L_0x0488
            goto L_0x048a
        L_0x0488:
            avbx r4 = defpackage.avbx.NEARBY_TYPE_UNKNOWN     // Catch:{ Exception -> 0x0492 }
        L_0x048a:
            int r4 = r4.h     // Catch:{ Exception -> 0x0492 }
            r0.a((java.lang.String) r3, (int) r4)     // Catch:{ Exception -> 0x0492 }
        L_0x048f:
            r14 = r5
            goto L_0x067f
        L_0x0492:
            r0 = move-exception
            jjg r3 = defpackage.tsp.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            java.lang.String r0 = "Could not parse NearbyItem from Nearby Message: %s"
            r3.a((java.lang.String) r0, (java.lang.Object) r2)
            r14 = 0
            goto L_0x067f
        L_0x04a6:
            java.lang.String r5 = r2.c
            java.lang.String r6 = "__ble_record"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x04c2
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = r2.c
            java.lang.String r3 = "Unknown message type: %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            r14 = 0
            goto L_0x067f
        L_0x04c2:
            jiq r5 = r4.a     // Catch:{ Exception -> 0x067b }
            long r5 = r5.a()     // Catch:{ Exception -> 0x067b }
            ual r8 = defpackage.ual.k     // Catch:{ Exception -> 0x067b }
            aucd r8 = r8.o()     // Catch:{ Exception -> 0x067b }
            boolean r12 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r12 != 0) goto L_0x04d3
            goto L_0x04d8
        L_0x04d3:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
        L_0x04d8:
            aucj r12 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r12 = (defpackage.ual) r12     // Catch:{ Exception -> 0x067b }
            int r13 = r12.a     // Catch:{ Exception -> 0x067b }
            r13 = r13 | 256(0x100, float:3.59E-43)
            r12.a = r13     // Catch:{ Exception -> 0x067b }
            r12.j = r5     // Catch:{ Exception -> 0x067b }
            r13 = r13 | 128(0x80, float:1.794E-43)
            r12.a = r13     // Catch:{ Exception -> 0x067b }
            r12.i = r5     // Catch:{ Exception -> 0x067b }
            if (r0 == 0) goto L_0x04f3
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ Exception -> 0x067b }
            java.lang.String r5 = r0.toUpperCase(r5)     // Catch:{ Exception -> 0x067b }
            goto L_0x04f4
        L_0x04f3:
            r5 = 0
        L_0x04f4:
            if (r5 == 0) goto L_0x050f
            boolean r6 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r6 != 0) goto L_0x04fb
            goto L_0x0500
        L_0x04fb:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
        L_0x0500:
            aucj r6 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r6 = (defpackage.ual) r6     // Catch:{ Exception -> 0x067b }
            r5.getClass()     // Catch:{ Exception -> 0x067b }
            int r12 = r6.a     // Catch:{ Exception -> 0x067b }
            r13 = 4
            r12 = r12 | r13
            r6.a = r12     // Catch:{ Exception -> 0x067b }
            r6.d = r5     // Catch:{ Exception -> 0x067b }
        L_0x050f:
            if (r3 == 0) goto L_0x0535
            int r5 = r3.b     // Catch:{ Exception -> 0x067b }
            boolean r6 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r6 != 0) goto L_0x0518
            goto L_0x051d
        L_0x0518:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
        L_0x051d:
            aucj r6 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r6 = (defpackage.ual) r6     // Catch:{ Exception -> 0x067b }
            int r12 = r6.a     // Catch:{ Exception -> 0x067b }
            r12 = r12 | 8
            r6.a = r12     // Catch:{ Exception -> 0x067b }
            r6.e = r5     // Catch:{ Exception -> 0x067b }
            int r3 = r3.c     // Catch:{ Exception -> 0x067b }
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L_0x0535
            r5 = r12 | 16
            r6.a = r5     // Catch:{ Exception -> 0x067b }
            r6.f = r3     // Catch:{ Exception -> 0x067b }
        L_0x0535:
            byte[] r3 = r2.b     // Catch:{ Exception -> 0x067b }
            gti r3 = defpackage.gti.a((byte[]) r3)     // Catch:{ Exception -> 0x067b }
            ttm r5 = new ttm     // Catch:{ Exception -> 0x067b }
            r5.<init>()     // Catch:{ Exception -> 0x067b }
            boolean r6 = defpackage.ttk.e(r3)     // Catch:{ Exception -> 0x067b }
            if (r6 != 0) goto L_0x0566
            r6 = 224(0xe0, float:3.14E-43)
            byte[] r6 = r3.a((int) r6)     // Catch:{ Exception -> 0x067b }
            if (r6 == 0) goto L_0x0564
            int r12 = r6.length     // Catch:{ Exception -> 0x067b }
            if (r12 != r7) goto L_0x0564
            r12 = 2
            byte r6 = r6[r12]     // Catch:{ Exception -> 0x067b }
            if (r6 != 0) goto L_0x0564
            ttn r6 = r5.a     // Catch:{ Exception -> 0x067b }
            if (r6 != 0) goto L_0x0561
            ttn r6 = new ttn     // Catch:{ Exception -> 0x067b }
            r6.<init>()     // Catch:{ Exception -> 0x067b }
            r5.a = r6     // Catch:{ Exception -> 0x067b }
        L_0x0561:
            ttn r5 = r5.a     // Catch:{ Exception -> 0x067b }
            goto L_0x0573
        L_0x0564:
            r5 = 0
            goto L_0x0573
        L_0x0566:
            ttk r6 = r5.b     // Catch:{ Exception -> 0x067b }
            if (r6 != 0) goto L_0x0571
            ttk r6 = new ttk     // Catch:{ Exception -> 0x067b }
            r6.<init>()     // Catch:{ Exception -> 0x067b }
            r5.b = r6     // Catch:{ Exception -> 0x067b }
        L_0x0571:
            ttk r5 = r5.b     // Catch:{ Exception -> 0x067b }
        L_0x0573:
            boolean r6 = r5 instanceof defpackage.ttk     // Catch:{ Exception -> 0x067b }
            if (r6 == 0) goto L_0x0600
            java.lang.String r2 = r3.d     // Catch:{ Exception -> 0x067b }
            java.lang.String r5 = "cc_"
            java.lang.String r0 = defpackage.ttf.b(r2, r0)     // Catch:{ Exception -> 0x067b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x067b }
            int r2 = r0.length()     // Catch:{ Exception -> 0x067b }
            if (r2 != 0) goto L_0x058f
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x067b }
            r0.<init>(r5)     // Catch:{ Exception -> 0x067b }
            goto L_0x0593
        L_0x058f:
            java.lang.String r0 = r5.concat(r0)     // Catch:{ Exception -> 0x067b }
        L_0x0593:
            boolean r2 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r2 != 0) goto L_0x0598
            goto L_0x059d
        L_0x0598:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
        L_0x059d:
            aucj r2 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r2 = (defpackage.ual) r2     // Catch:{ Exception -> 0x067b }
            r0.getClass()     // Catch:{ Exception -> 0x067b }
            int r5 = r2.a     // Catch:{ Exception -> 0x067b }
            r5 = r5 | r9
            r2.a = r5     // Catch:{ Exception -> 0x067b }
            r2.b = r0     // Catch:{ Exception -> 0x067b }
            avbx r0 = defpackage.avbx.NEARBY_CHROMECAST     // Catch:{ Exception -> 0x067b }
            boolean r2 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r2 != 0) goto L_0x05b2
            goto L_0x05b7
        L_0x05b2:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
        L_0x05b7:
            aucj r2 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r2 = (defpackage.ual) r2     // Catch:{ Exception -> 0x067b }
            int r0 = r0.h     // Catch:{ Exception -> 0x067b }
            r2.c = r0     // Catch:{ Exception -> 0x067b }
            int r0 = r2.a     // Catch:{ Exception -> 0x067b }
            r5 = 2
            r0 = r0 | r5
            r2.a = r0     // Catch:{ Exception -> 0x067b }
            java.lang.String r0 = defpackage.ttk.f(r3)     // Catch:{ Exception -> 0x067b }
            if (r0 == 0) goto L_0x05e5
            boolean r2 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r2 != 0) goto L_0x05d0
        L_0x05cf:
            goto L_0x05d6
        L_0x05d0:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
            goto L_0x05cf
        L_0x05d6:
            aucj r2 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r2 = (defpackage.ual) r2     // Catch:{ Exception -> 0x067b }
            r0.getClass()     // Catch:{ Exception -> 0x067b }
            int r5 = r2.a     // Catch:{ Exception -> 0x067b }
            r5 = r5 | 32
            r2.a = r5     // Catch:{ Exception -> 0x067b }
            r2.g = r0     // Catch:{ Exception -> 0x067b }
        L_0x05e5:
            int r0 = defpackage.ttk.g(r3)     // Catch:{ Exception -> 0x067b }
            boolean r2 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r2 != 0) goto L_0x05ee
            goto L_0x05f3
        L_0x05ee:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
        L_0x05f3:
            aucj r2 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r2 = (defpackage.ual) r2     // Catch:{ Exception -> 0x067b }
            int r3 = r2.a     // Catch:{ Exception -> 0x067b }
            r3 = r3 | 64
            r2.a = r3     // Catch:{ Exception -> 0x067b }
            r2.h = r0     // Catch:{ Exception -> 0x067b }
            goto L_0x0652
        L_0x0600:
            boolean r6 = r5 instanceof defpackage.ttn     // Catch:{ Exception -> 0x067b }
            if (r6 == 0) goto L_0x0666
            java.lang.String r2 = r3.d     // Catch:{ Exception -> 0x067b }
            java.lang.String r3 = "wear_"
            java.lang.String r0 = defpackage.ttf.b(r2, r0)     // Catch:{ Exception -> 0x067b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x067b }
            int r2 = r0.length()     // Catch:{ Exception -> 0x067b }
            if (r2 != 0) goto L_0x061c
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x067b }
            r0.<init>(r3)     // Catch:{ Exception -> 0x067b }
            goto L_0x0620
        L_0x061c:
            java.lang.String r0 = r3.concat(r0)     // Catch:{ Exception -> 0x067b }
        L_0x0620:
            boolean r2 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r2 != 0) goto L_0x0625
            goto L_0x062a
        L_0x0625:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
        L_0x062a:
            aucj r2 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r2 = (defpackage.ual) r2     // Catch:{ Exception -> 0x067b }
            r0.getClass()     // Catch:{ Exception -> 0x067b }
            int r3 = r2.a     // Catch:{ Exception -> 0x067b }
            r3 = r3 | r9
            r2.a = r3     // Catch:{ Exception -> 0x067b }
            r2.b = r0     // Catch:{ Exception -> 0x067b }
            avbx r0 = defpackage.avbx.NEARBY_WEAR     // Catch:{ Exception -> 0x067b }
            boolean r2 = r8.c     // Catch:{ Exception -> 0x067b }
            if (r2 != 0) goto L_0x063f
            goto L_0x0644
        L_0x063f:
            r8.c()     // Catch:{ Exception -> 0x067b }
            r8.c = r10     // Catch:{ Exception -> 0x067b }
        L_0x0644:
            aucj r2 = r8.b     // Catch:{ Exception -> 0x067b }
            ual r2 = (defpackage.ual) r2     // Catch:{ Exception -> 0x067b }
            int r0 = r0.h     // Catch:{ Exception -> 0x067b }
            r2.c = r0     // Catch:{ Exception -> 0x067b }
            int r0 = r2.a     // Catch:{ Exception -> 0x067b }
            r3 = 2
            r0 = r0 | r3
            r2.a = r0     // Catch:{ Exception -> 0x067b }
        L_0x0652:
            aucj r0 = r8.i()     // Catch:{ Exception -> 0x067b }
            ual r0 = (defpackage.ual) r0     // Catch:{ Exception -> 0x067b }
            java.lang.Object r2 = r0.c(r11)     // Catch:{ Exception -> 0x067b }
            aucd r2 = (defpackage.aucd) r2     // Catch:{ Exception -> 0x067b }
            r2.a((defpackage.aucj) r0)     // Catch:{ Exception -> 0x067b }
            r4.a((defpackage.aucd) r2)     // Catch:{ Exception -> 0x067b }
            r14 = 0
            goto L_0x067f
        L_0x0666:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x067b }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x067b }
            r4[r10] = r2     // Catch:{ Exception -> 0x067b }
            r4[r9] = r3     // Catch:{ Exception -> 0x067b }
            r2 = 2
            r4[r2] = r5     // Catch:{ Exception -> 0x067b }
            java.lang.String r2 = "Cannot parse BLE_SCAN_RECORD message: %s, ble record: %s, decoder: %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ Exception -> 0x067b }
            r0.<init>(r2)     // Catch:{ Exception -> 0x067b }
            throw r0     // Catch:{ Exception -> 0x067b }
        L_0x067b:
            r0 = move-exception
            jjg r0 = defpackage.tsp.a
            r14 = 0
        L_0x067f:
            if (r14 == 0) goto L_0x068c
            int r0 = r14.b
            avbx r0 = defpackage.avbx.a(r0)
            if (r0 != 0) goto L_0x068e
            avbx r0 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
            goto L_0x068e
        L_0x068c:
            avbx r0 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x068e:
            r1.a((int) r10, (defpackage.avbx) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubv.a(com.google.android.gms.nearby.messages.Message, java.lang.String, com.google.android.gms.nearby.messages.internal.BleSignalImpl, byte[]):void");
    }
}
