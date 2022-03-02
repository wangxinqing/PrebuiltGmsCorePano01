package defpackage;

import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.plus.service.v2whitelisted.models.PeopleList;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: xen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xen {
    private static final iyu x;
    private static final iyu y;
    public final wmn a;
    public final String b;
    public final String c;
    public final xfb d;
    public final wmy e;
    public final boolean f;
    public amsn g;
    private final Context h;
    private final jiq i;
    private final SyncResult j;
    private final xsb k;
    private final boolean l;
    private final boolean m;
    private final Bundle n;
    private final wmr o;
    private final xpk p;
    private final xpr q;
    private final zin r;
    private final boolean s;
    private final ybu t;
    private final boolean u;
    private final boolean v;
    private final int w;

    static {
        iyu iyu = new iyu();
        iyu.a("etag");
        iyu.a("id");
        iyu.a("names");
        iyu.a("images");
        iyu.a("emails");
        iyu.a("phoneNumbers");
        iyu.a("addresses");
        iyu.a("metadata/ownerId");
        iyu.a("metadata/ownerUserTypes");
        iyu.a("coverPhotos");
        x = iyu;
        iyu iyu2 = new iyu();
        iyu2.a("items(id,metadata)");
        iyu2.a("nextPageToken");
        y = iyu2;
    }

    private static int a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return 4;
        }
        wtz a2 = wtz.a(context);
        return a2.d.a("SELECT is_active_plus_account FROM owners WHERE _id=?", new String[]{wtw.a(a2.b).b(str, (String) null)}, 0) != 1 ? 3 : 2;
    }

    private final long b() {
        return this.f ? this.g.a(TimeUnit.MILLISECONDS) : SystemClock.elapsedRealtime();
    }

    private xen(Context context, String str, String str2, int i2, SyncResult syncResult, xsb xsb, wmn wmn, Bundle bundle, boolean z, boolean z2, boolean z3, amri amri) {
        String str3;
        Context applicationContext = context.getApplicationContext();
        this.h = applicationContext;
        this.i = ycm.a(applicationContext);
        this.j = syncResult;
        this.k = xsb;
        this.a = wmn;
        wmn.a = str;
        wmn.b = str2;
        this.w = i2;
        this.l = z;
        this.m = z2;
        this.n = bundle;
        this.b = str;
        this.c = str2;
        xpk a2 = wmr.a(this.h, str, str2, a(bundle));
        this.p = a2;
        ClientContext clientContext = a2.a;
        int i3 = i2 - 1;
        if (i3 != 0) {
            str3 = i3 != 1 ? i3 != 2 ? null : "m" : "t";
        } else {
            str3 = "p";
        }
        xpr.a(clientContext, str3);
        this.d = new xfb(this.h, str, str2);
        this.e = wmy.a(this.h);
        this.o = wmr.a(this.h, 5403);
        xip.a();
        if (((Boolean) xhy.a.a()).booleanValue() && amri.a()) {
            xdt.a("PeopleSync", "Logging session id: %s", (Object) amri);
            xpq xpq = new xpq(this.o.a);
            xpq.n = (String) amri.b();
            this.q = xpq;
        } else {
            this.q = this.o.a;
        }
        this.r = new zin(this.q);
        this.s = z3;
        ybu a3 = ybv.a.a(this.h);
        this.t = a3;
        wmn.c = a3.b;
        wmn.d = a3.c;
        xip.a();
        this.u = ((Boolean) xhn.a.a()).booleanValue();
        this.v = Boolean.valueOf(aywy.a.a().by()).booleanValue();
        boolean booleanValue = ((Boolean) xhm.a.a()).booleanValue();
        this.f = booleanValue;
        if (booleanValue) {
            this.g = amsn.b(ampt.a);
        }
    }

    static final String a(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("gms.people.request_app_id");
        } else {
            str = null;
        }
        xip.a();
        if (Boolean.valueOf(aywy.a.a().bQ()).booleanValue() && bundle != null && "gmail_setup_wizard".equals(bundle.getString("trigger_source"))) {
            return "221265091";
        }
        return TextUtils.isEmpty(str) ? "80" : str;
    }

    private final void a(Context context) {
        if (ayws.h()) {
            this.a.ab = wmo.a(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009a, code lost:
        r4 = r52;
        r1 = r0;
        r9 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03a1, code lost:
        if (r9 == defpackage.wpc.c) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0931, code lost:
        r2 = r1.a;
        r3 = r1.d;
        r2.S = (int) r3.c.a("SELECT count(1) FROM people WHERE owner_id=?", new java.lang.String[]{r3.d}, 0);
        r2 = r1.a;
        r3 = r1.d;
        r2.T = (int) r3.c.a("SELECT count(1) FROM people WHERE owner_id=? AND gaia_id IS NOT NULL AND in_circle=1", new java.lang.String[]{r3.d}, 0);
        r2 = r1.a;
        r3 = r1.d;
        r2.U = (int) r3.c.a("SELECT count(1) FROM people WHERE owner_id=? AND in_circle=0", new java.lang.String[]{r3.d}, 0);
        r1.d.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:?, code lost:
        r1.d.e();
        r2 = r1.a;
        r2.R++;
        r2.a();
        r2 = r1.a;
        r3 = r2.T;
        r3 = r2.S;
        r3 = r2.V;
        r2 = r2.X;
        defpackage.wml.a();
        r2 = defpackage.aoim.a(r1.w - 1);
        r3 = r1.a;
        defpackage.iva.a((java.lang.Object) r3);
        r4 = defpackage.aoip.h.o();
        r5 = defpackage.aoin.r.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09b9, code lost:
        if (r5.c != false) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x09bc, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x09c2, code lost:
        r6 = (defpackage.aoin) r5.b;
        r7 = r6.a | 1;
        r6.a = r7;
        r6.b = true;
        r8 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x09d0, code lost:
        if (r2 == 0) goto L_0x0a7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x09d2, code lost:
        r6.c = r8;
        r6.a = r7 | 2;
        r2 = r3.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x09df, code lost:
        if (r5.c != false) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x09e2, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x09e8, code lost:
        r6 = (defpackage.aoin) r5.b;
        r7 = r6.a | 4;
        r6.a = r7;
        r6.d = r2;
        r2 = r3.U;
        r8 = r3.W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x09f8, code lost:
        if (r2 != r8) goto L_0x0a02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x09fc, code lost:
        if (r3.Y == 0) goto L_0x0a00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x09fe, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0a00, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a02, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a03, code lost:
        r7 = r7 | 8;
        r6.a = r7;
        r6.e = r10;
        r10 = r3.S;
        r7 = r7 | 16;
        r6.a = r7;
        r6.f = r10;
        r10 = r3.T;
        r7 = r7 | 32;
        r6.a = r7;
        r6.g = r10;
        r7 = r7 | 64;
        r6.a = r7;
        r6.h = r2;
        r11 = r3.V;
        r7 = r7 | 128;
        r6.a = r7;
        r6.i = r11;
        r7 = r7 | com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r6.a = r7;
        r6.j = r8;
        r7 = r7 | 512;
        r6.a = r7;
        r6.k = r10 - r11;
        r7 = r7 | 1024;
        r6.a = r7;
        r6.l = r2 - r8;
        r2 = r3.X;
        r7 = r7 | 2048;
        r6.a = r7;
        r6.m = r2;
        r2 = r3.Y;
        r7 = r7 | com.google.android.chimera.FragmentTransaction.TRANSIT_ENTER_MASK;
        r6.a = r7;
        r6.n = r2;
        r2 = r3.g;
        r6.a = r7 | com.google.android.chimera.FragmentTransaction.TRANSIT_EXIT_MASK;
        r6.o = r2;
        r2 = (defpackage.aoin) r5.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a5c, code lost:
        if (r4.c != false) goto L_0x0a5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a5f, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a65, code lost:
        r3 = (defpackage.aoip) r4.b;
        r2.getClass();
        r3.d = r2;
        r3.a |= 4;
        defpackage.wmm.a((defpackage.aoip) r4.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a80, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0c5b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0c5c, code lost:
        r4 = r52;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03cb A[SYNTHETIC, Splitter:B:205:0x03cb] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03dc A[Catch:{ all -> 0x04b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0425 A[Catch:{ all -> 0x0485, all -> 0x04eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0458 A[Catch:{ all -> 0x0485, all -> 0x04eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0464 A[Catch:{ all -> 0x0485, all -> 0x04eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0498 A[Catch:{ xsa -> 0x0515, all -> 0x0509 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04d3 A[Catch:{ all -> 0x0485, all -> 0x04eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04dc A[Catch:{ all -> 0x0485, all -> 0x04eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04f8 A[Catch:{ xsa -> 0x0515, all -> 0x0509 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0550 A[Catch:{ xsa -> 0x0bf4, all -> 0x0bea }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0554 A[Catch:{ xsa -> 0x0bf4, all -> 0x0bea }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x05fa A[Catch:{ all -> 0x0b75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0614 A[SYNTHETIC, Splitter:B:342:0x0614] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0662  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x069c  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x06d7 A[SYNTHETIC, Splitter:B:383:0x06d7] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0755 A[SYNTHETIC, Splitter:B:402:0x0755] */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x0aab A[Catch:{ izv -> 0x0b38, all -> 0x0c5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0aaf A[Catch:{ izv -> 0x0b38, all -> 0x0c5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0b24  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x0b63  */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0b89 A[SYNTHETIC, Splitter:B:551:0x0b89] */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0c2c A[Catch:{ izv -> 0x0c59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:599:0x0c5b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:19:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:617:0x0c8c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0177 A[Catch:{ all -> 0x016e, xsa -> 0x0536, all -> 0x052b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:258:0x04b3=Splitter:B:258:0x04b3, B:243:0x047f=Splitter:B:243:0x047f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r46, java.lang.String r47, java.lang.String r48, int r49, android.content.SyncResult r50, defpackage.xsb r51, defpackage.wmn r52, android.os.Bundle r53, boolean r54, boolean r55, boolean r56, defpackage.amri r57) {
        /*
            r14 = r52
            java.lang.String r15 = "ac_index"
            java.lang.String r13 = "ac_item"
            java.lang.String r12 = "Sync finished, successful=%b, took %d ms"
            java.lang.String r11 = "ac_container"
            java.lang.String r10 = "ac_people"
            java.lang.String r9 = "PeopleSync"
            long r16 = android.os.SystemClock.elapsedRealtime()
            xen r8 = new xen
            r1 = r8
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r7 = r51
            r14 = r8
            r8 = r52
            r18 = r15
            r15 = r9
            r9 = r53
            r19 = r10
            r10 = r54
            r20 = r11
            r11 = r55
            r21 = r12
            r12 = r56
            r22 = r13
            r13 = r57
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "me%"
            boolean r3 = r14.l     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            if (r3 != 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            java.lang.String r3 = r14.c     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            java.lang.String r4 = "isPageExistenceCheckOnly=true is not used with pages"
            defpackage.iva.b(r3, r4)     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
        L_0x004e:
            java.lang.String r3 = "Sync start: cannotHavePeople=%b isPageExistenceCheckOnly=%b"
            boolean r4 = r14.m     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            boolean r5 = r14.l     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            defpackage.xdt.a((java.lang.String) r15, (java.lang.String) r3, (java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            jiq r3 = r14.i     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            long r3 = r3.a()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            defpackage.xip.a()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            aywy r5 = defpackage.aywy.a     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            ayxk r5 = r5.a()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            boolean r5 = r5.bf()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            boolean r5 = r5.booleanValue()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            r6 = 0
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x00a0
            wmn r5 = r14.a     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            xfb r10 = r14.d     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            long r10 = r10.b()     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x008e
            r10 = 1
            goto L_0x008f
        L_0x008e:
            r10 = 0
        L_0x008f:
            r5.h = r10     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            goto L_0x00a0
        L_0x0092:
            r0 = move-exception
            r5 = r46
            r4 = r52
            goto L_0x0c60
        L_0x0099:
            r0 = move-exception
            r4 = r52
            r1 = r0
            r9 = r15
            goto L_0x0c67
        L_0x00a0:
            android.content.Context r5 = r14.h     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            boolean r10 = defpackage.ayws.h()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            if (r10 != 0) goto L_0x00a9
            goto L_0x00b1
        L_0x00a9:
            wmn r10 = r14.a     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            int r5 = defpackage.wmo.a(r5)     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            r10.aa = r5     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
        L_0x00b1:
            android.content.Context r5 = r14.h     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            java.lang.String r10 = r14.b     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            boolean r11 = defpackage.ayws.g()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            if (r11 == 0) goto L_0x00c7
            wmn r11 = r14.a     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            wtz r12 = defpackage.wtz.a((android.content.Context) r5)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            long r12 = r12.a((java.lang.String) r10)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            r11.O = r12     // Catch:{ izv -> 0x0099, all -> 0x0092 }
        L_0x00c7:
            boolean r11 = defpackage.ayws.e()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            java.lang.String r12 = "last_full_people_sync_time"
            if (r11 == 0) goto L_0x00de
            wmn r11 = r14.a     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            wtz r13 = defpackage.wtz.a((android.content.Context) r5)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            r50 = r3
            long r2 = r13.c(r10, r12)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            r11.P = r2     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            goto L_0x00e0
        L_0x00de:
            r50 = r3
        L_0x00e0:
            boolean r2 = defpackage.ayws.f()     // Catch:{ izv -> 0x0c62, all -> 0x0c5b }
            java.lang.String r3 = "menagerie_last_successful_periodic_sync_timestamp_"
            if (r2 == 0) goto L_0x010a
            wss r2 = defpackage.wss.a((android.content.Context) r5)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            wmn r4 = r14.a     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            android.content.SharedPreferences r2 = r2.a     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            int r10 = r5.length()     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            if (r10 != 0) goto L_0x0100
            java.lang.String r5 = new java.lang.String     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            r5.<init>(r3)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            goto L_0x0104
        L_0x0100:
            java.lang.String r5 = r3.concat(r5)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
        L_0x0104:
            long r10 = r2.getLong(r5, r6)     // Catch:{ izv -> 0x0099, all -> 0x0092 }
            r4.Q = r10     // Catch:{ izv -> 0x0099, all -> 0x0092 }
        L_0x010a:
            boolean r2 = r14.l     // Catch:{ xsa -> 0x0c14, all -> 0x0c08 }
            r4 = 16
            if (r2 == 0) goto L_0x0113
            r10 = r50
            goto L_0x0129
        L_0x0113:
            xfb r2 = r14.d     // Catch:{ xsa -> 0x0c14, all -> 0x0c08 }
            r10 = r50
            r5 = 0
            r2.a(r8, r10, r5)     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            wmy r2 = r14.e     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            java.lang.String r5 = r14.b     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            java.lang.String r13 = r14.c     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            r2.a(r5, r13, r4)     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            wmy r2 = r14.e     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            r2.b()     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
        L_0x0129:
            r14.a()     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            r14.a()     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            java.lang.String r2 = r14.c     // Catch:{ xsa -> 0x0c03, all -> 0x0bfe }
            r13 = 2
            if (r2 != 0) goto L_0x0542
            boolean r2 = r14.l     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            if (r2 == 0) goto L_0x018f
            android.content.Context r2 = r14.h     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            wtw r2 = defpackage.wtw.a(r2)     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            java.lang.String r4 = r14.b     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            java.util.concurrent.ConcurrentHashMap r5 = r2.c     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            if (r5 != 0) goto L_0x017d
            wtz r5 = r2.a     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            wtx r5 = r5.b()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            if (r5 == 0) goto L_0x0174
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            r6[r8] = r4     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            java.lang.String r7 = "SELECT gaia_id FROM owners WHERE (account_name = ?1) AND (page_gaia_id IS NULL)"
            android.database.Cursor r5 = r5.a((java.lang.String) r7, (java.lang.String[]) r6)     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x016a
            java.lang.String r6 = r5.getString(r8)     // Catch:{ all -> 0x016e }
            r5.close()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            goto L_0x0175
        L_0x016a:
            r5.close()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            goto L_0x0174
        L_0x016e:
            r0 = move-exception
            r1 = r0
            r5.close()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            throw r1     // Catch:{ xsa -> 0x0536, all -> 0x052b }
        L_0x0174:
            r6 = 0
        L_0x0175:
            if (r6 == 0) goto L_0x017c
            java.util.concurrent.ConcurrentHashMap r2 = r2.c     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            r2.put(r4, r6)     // Catch:{ xsa -> 0x0536, all -> 0x052b }
        L_0x017c:
            r5 = r6
        L_0x017d:
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            if (r2 == 0) goto L_0x0184
            goto L_0x018f
        L_0x0184:
            r31 = r3
            r29 = r10
            r24 = r12
            r1 = r14
            r25 = r15
            goto L_0x054c
        L_0x018f:
            defpackage.xip.a()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            aywy r2 = defpackage.aywy.a     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            ayxk r2 = r2.a()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            boolean r2 = r2.bR()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            boolean r2 = r2.booleanValue()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            if (r2 == 0) goto L_0x0520
            java.lang.String r2 = r14.c     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            if (r2 != 0) goto L_0x01ac
            r2 = 1
            goto L_0x01ad
        L_0x01ac:
            r2 = 0
        L_0x01ad:
            defpackage.iva.a((boolean) r2)     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            r14.a()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            long r4 = r14.b()     // Catch:{ xsa -> 0x0536, all -> 0x052b }
            boolean r2 = r14.v     // Catch:{ all -> 0x04ed }
            java.lang.String r6 = "me"
            if (r2 == 0) goto L_0x01fa
            wmn r2 = r14.a     // Catch:{ all -> 0x01f1 }
            xfb r7 = r14.d     // Catch:{ all -> 0x01f1 }
            wtx r9 = r7.c     // Catch:{ all -> 0x01f1 }
            r9.f()     // Catch:{ all -> 0x01f1 }
            defpackage.iva.c(r6)     // Catch:{ all -> 0x01f1 }
            wtx r9 = r7.c     // Catch:{ all -> 0x01f1 }
            java.lang.String[] r8 = new java.lang.String[r13]     // Catch:{ all -> 0x01f1 }
            java.lang.String r7 = r7.d     // Catch:{ all -> 0x01f1 }
            r23 = 0
            r8[r23] = r7     // Catch:{ all -> 0x01f1 }
            r7 = 1
            r8[r7] = r1     // Catch:{ all -> 0x01f1 }
            java.lang.String r1 = "SELECT COUNT(1) FROM sync_tokens WHERE owner_id = ? AND name LIKE ? "
            r7 = r14
            r13 = 0
            long r8 = r9.a((java.lang.String) r1, (java.lang.String[]) r8, (long) r13)     // Catch:{ all -> 0x01eb }
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x01e5
            r1 = 1
            goto L_0x01e6
        L_0x01e5:
            r1 = 0
        L_0x01e6:
            r8 = 1
            r1 = r1 ^ r8
            r2.i = r1     // Catch:{ all -> 0x01eb }
            goto L_0x01fb
        L_0x01eb:
            r0 = move-exception
            r2 = r0
            r1 = r7
            r29 = r10
            goto L_0x01f6
        L_0x01f1:
            r0 = move-exception
            r2 = r0
            r29 = r10
            r1 = r14
        L_0x01f6:
            r25 = r15
            goto L_0x04f4
        L_0x01fa:
            r7 = r14
        L_0x01fb:
            r1 = r7
            zin r2 = r1.r     // Catch:{ all -> 0x04bd }
            xpk r7 = r1.p     // Catch:{ all -> 0x04bd }
            com.google.android.gms.common.internal.ClientContext r7 = r7.a     // Catch:{ all -> 0x04bd }
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04bd }
            r13 = 2
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ all -> 0x04bd }
            java.lang.String r13 = "disabled"
            r14[r8] = r13     // Catch:{ all -> 0x04bd }
            java.lang.String r8 = "blocked"
            r13 = 1
            r14[r13] = r8     // Catch:{ all -> 0x04bd }
            java.util.List r8 = java.util.Arrays.asList(r14)     // Catch:{ all -> 0x04bd }
            iyu r13 = x     // Catch:{ all -> 0x04bd }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x04bd }
            r14.<init>()     // Catch:{ all -> 0x04bd }
            r29 = r10
            java.util.Formatter r10 = new java.util.Formatter     // Catch:{ all -> 0x04bb }
            r10.<init>(r14)     // Catch:{ all -> 0x04bb }
            r31 = r3
            r11 = 1
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ all -> 0x04bb }
            java.lang.String r11 = defpackage.iyv.a(r6)     // Catch:{ all -> 0x04bb }
            r23 = 0
            r3[r23] = r11     // Catch:{ all -> 0x04bb }
            java.lang.String r11 = "people/%1$s"
            r10.format(r11, r3)     // Catch:{ all -> 0x04bb }
            if (r13 != 0) goto L_0x023a
            goto L_0x023d
        L_0x023a:
            r13.a((java.lang.StringBuilder) r14)     // Catch:{ all -> 0x04bb }
        L_0x023d:
            java.lang.String r3 = "includeLinkedPeople"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04bb }
            defpackage.iyv.a((java.lang.StringBuilder) r14, (java.lang.String) r3, (java.lang.String) r9)     // Catch:{ all -> 0x04bb }
            if (r8 != 0) goto L_0x0249
            goto L_0x0254
        L_0x0249:
            java.lang.String r3 = "includeProfilesWithState"
            java.lang.String r9 = "&includeProfilesWithState="
            java.lang.String r8 = android.text.TextUtils.join(r9, r8)     // Catch:{ all -> 0x04bb }
            defpackage.iyv.a((java.lang.StringBuilder) r14, (java.lang.String) r3, (java.lang.String) r8)     // Catch:{ all -> 0x04bb }
        L_0x0254:
            java.lang.String r26 = r14.toString()     // Catch:{ all -> 0x04bb }
            izb r2 = r2.a     // Catch:{ all -> 0x04bb }
            r25 = 0
            r27 = 0
            java.lang.Class<com.google.android.gms.plus.service.v2whitelisted.models.Person> r28 = com.google.android.gms.plus.service.v2whitelisted.models.Person.class
            r23 = r2
            r24 = r7
            jag r2 = r23.a((com.google.android.gms.common.internal.ClientContext) r24, (int) r25, (java.lang.String) r26, (java.lang.Object) r27, (java.lang.Class) r28)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.plus.service.v2whitelisted.models.Person r2 = (com.google.android.gms.plus.service.v2whitelisted.models.Person) r2     // Catch:{ all -> 0x04bb }
            long r7 = r1.b()     // Catch:{ all -> 0x04b9 }
            long r7 = r7 - r4
            wmn r3 = r1.a     // Catch:{ all -> 0x04b9 }
            long r9 = r3.G     // Catch:{ all -> 0x04b9 }
            long r9 = r9 + r7
            r3.G = r9     // Catch:{ all -> 0x04b9 }
            boolean r9 = r1.f     // Catch:{ all -> 0x04b9 }
            if (r9 == 0) goto L_0x0284
            long r9 = r3.H     // Catch:{ all -> 0x0280 }
            long r9 = r9 + r7
            r3.H = r9     // Catch:{ all -> 0x0280 }
            goto L_0x0284
        L_0x0280:
            r0 = move-exception
            r2 = r0
            goto L_0x01f6
        L_0x0284:
            boolean r7 = r1.u     // Catch:{ all -> 0x04b9 }
            if (r7 == 0) goto L_0x0295
            android.util.SparseIntArray r3 = r3.u     // Catch:{ all -> 0x0280 }
            r7 = 1
            r3.put(r7, r7)     // Catch:{ all -> 0x0280 }
            wmn r3 = r1.a     // Catch:{ all -> 0x0280 }
            android.util.SparseIntArray r3 = r3.v     // Catch:{ all -> 0x0280 }
            r3.put(r7, r7)     // Catch:{ all -> 0x0280 }
        L_0x0295:
            r1.a()     // Catch:{ all -> 0x04b9 }
            xfb r3 = r1.d     // Catch:{ all -> 0x04b9 }
            r3.d()     // Catch:{ all -> 0x04b9 }
            xfb r3 = r1.d     // Catch:{ all -> 0x04af }
            java.lang.String r3 = r3.a((java.lang.String) r6)     // Catch:{ all -> 0x04af }
            boolean r7 = r1.u     // Catch:{ all -> 0x04af }
            if (r7 == 0) goto L_0x02bc
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x02b6 }
            if (r7 != 0) goto L_0x02bc
            wmn r7 = r1.a     // Catch:{ all -> 0x02b6 }
            android.util.SparseArray r7 = r7.t     // Catch:{ all -> 0x02b6 }
            r8 = 1
            r7.put(r8, r3)     // Catch:{ all -> 0x02b6 }
            goto L_0x02bc
        L_0x02b6:
            r0 = move-exception
            r2 = r0
            r25 = r15
            goto L_0x04b3
        L_0x02bc:
            java.lang.String r7 = r2.k     // Catch:{ all -> 0x04af }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x04af }
            if (r3 != 0) goto L_0x02f4
            xfb r3 = r1.d     // Catch:{ all -> 0x02b6 }
            r3.a((com.google.android.gms.plus.service.v2whitelisted.models.Person) r2)     // Catch:{ all -> 0x02b6 }
            android.content.SyncResult r3 = r1.j     // Catch:{ all -> 0x02b6 }
            android.content.SyncStats r3 = r3.stats     // Catch:{ all -> 0x02b6 }
            long r7 = r3.numUpdates     // Catch:{ all -> 0x02b6 }
            r9 = 1
            long r7 = r7 + r9
            r3.numUpdates = r7     // Catch:{ all -> 0x02b6 }
            boolean r3 = r1.v     // Catch:{ all -> 0x02b6 }
            if (r3 != 0) goto L_0x02d9
            goto L_0x02e1
        L_0x02d9:
            wmn r3 = r1.a     // Catch:{ all -> 0x02b6 }
            int r7 = r3.j     // Catch:{ all -> 0x02b6 }
            r8 = 1
            int r7 = r7 + r8
            r3.j = r7     // Catch:{ all -> 0x02b6 }
        L_0x02e1:
            wmy r3 = r1.e     // Catch:{ all -> 0x02b6 }
            java.lang.String r7 = r1.b     // Catch:{ all -> 0x02b6 }
            java.lang.String r8 = r1.c     // Catch:{ all -> 0x02b6 }
            r9 = 1
            r3.a(r7, r8, r9)     // Catch:{ all -> 0x02b6 }
            xfb r3 = r1.d     // Catch:{ all -> 0x02b6 }
            java.lang.String r7 = r2.k     // Catch:{ all -> 0x02b6 }
            r3.a((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x02b6 }
            r3 = 1
            goto L_0x02f5
        L_0x02f4:
            r3 = 0
        L_0x02f5:
            xfb r6 = r1.d     // Catch:{ all -> 0x04af }
            r6.f()     // Catch:{ all -> 0x04af }
            xfb r6 = r1.d     // Catch:{ all -> 0x04b9 }
            r6.e()     // Catch:{ all -> 0x04b9 }
            r1.a()     // Catch:{ all -> 0x04b9 }
            boolean r6 = r1.l     // Catch:{ all -> 0x04b9 }
            if (r6 != 0) goto L_0x048d
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x04b9 }
            xdv r6 = defpackage.xdv.a(r6)     // Catch:{ all -> 0x04b9 }
            java.lang.String r7 = r1.b     // Catch:{ all -> 0x04b9 }
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ all -> 0x04b9 }
            defpackage.iva.a((java.lang.Object) r7)     // Catch:{ all -> 0x04b9 }
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Images r8 = defpackage.xeg.c((com.google.android.gms.plus.service.v2whitelisted.models.Person) r2)     // Catch:{ all -> 0x04b9 }
            java.lang.String r9 = "none"
            java.lang.String r10 = "Error retrieving image at URL %s: %s [%s]"
            java.lang.String r11 = "PeopleIS"
            if (r8 == 0) goto L_0x03a7
            boolean r13 = r8.b()     // Catch:{ all -> 0x0280 }
            if (r13 == 0) goto L_0x03a4
            boolean r13 = r8.b     // Catch:{ all -> 0x0280 }
            if (r13 != 0) goto L_0x03a4
            java.lang.String r8 = r8.e     // Catch:{ all -> 0x0280 }
            ybt r13 = r6.b     // Catch:{ all -> 0x0280 }
            java.lang.String r14 = defpackage.ycc.a((java.lang.String) r8)     // Catch:{ all -> 0x0280 }
            r23 = r9
            r9 = 0
            boolean r13 = r13.a((java.lang.String) r7, (java.lang.String) r9, (java.lang.String) r14)     // Catch:{ all -> 0x0280 }
            if (r13 == 0) goto L_0x033d
            goto L_0x03af
        L_0x033d:
            android.content.Context r9 = r6.a     // Catch:{ all -> 0x0280 }
            wmz r9 = defpackage.wmz.a((android.content.Context) r9)     // Catch:{ all -> 0x0280 }
            defpackage.amrl.a((java.lang.Object) r8)     // Catch:{ all -> 0x0280 }
            android.content.Context r13 = r9.a     // Catch:{ all -> 0x0280 }
            r14 = 0
            java.lang.String r13 = defpackage.ybt.a((java.lang.String) r8, (boolean) r14, (android.content.Context) r13)     // Catch:{ all -> 0x0280 }
            byte[] r9 = r9.a((java.lang.String) r13)     // Catch:{ VolleyError -> 0x0352 }
            goto L_0x0380
        L_0x0352:
            r0 = move-exception
            r9 = r0
            boolean r13 = defpackage.ycc.a((java.lang.Throwable) r9)     // Catch:{ all -> 0x0280 }
            if (r13 != 0) goto L_0x037e
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0280 }
            r13 = 0
            r14[r13] = r8     // Catch:{ all -> 0x0280 }
            java.lang.String r13 = r9.getMessage()     // Catch:{ all -> 0x0280 }
            r24 = 1
            r14[r24] = r13     // Catch:{ all -> 0x0280 }
            com.android.volley.NetworkResponse r9 = r9.networkResponse     // Catch:{ all -> 0x0280 }
            if (r9 == 0) goto L_0x0373
            int r9 = r9.statusCode     // Catch:{ all -> 0x0280 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0280 }
            goto L_0x0375
        L_0x0373:
            r9 = r23
        L_0x0375:
            r13 = 2
            r14[r13] = r9     // Catch:{ all -> 0x0280 }
            defpackage.xdt.b(r11, r10, r14)     // Catch:{ all -> 0x0280 }
            byte[] r9 = defpackage.wpc.d     // Catch:{ all -> 0x0280 }
            goto L_0x0380
        L_0x037e:
            byte[] r9 = defpackage.wpc.c     // Catch:{ all -> 0x0280 }
        L_0x0380:
            if (r9 == 0) goto L_0x039f
            byte[] r13 = defpackage.wpc.c     // Catch:{ all -> 0x0280 }
            if (r9 == r13) goto L_0x039f
            byte[] r13 = defpackage.wpc.d     // Catch:{ all -> 0x0280 }
            if (r9 == r13) goto L_0x039f
            ybt r13 = r6.b     // Catch:{ RuntimeException -> 0x0395 }
            java.lang.String r8 = defpackage.ycc.a((java.lang.String) r8)     // Catch:{ RuntimeException -> 0x0395 }
            r14 = 0
            r13.a((java.lang.String) r7, (java.lang.String) r14, (java.lang.String) r8, (byte[]) r9)     // Catch:{ RuntimeException -> 0x0395 }
            goto L_0x03af
        L_0x0395:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "AvatarSyncManager"
            java.lang.String r13 = "updateAvatarImage threw an exception."
            android.util.Log.w(r9, r13, r8)     // Catch:{ all -> 0x0280 }
            goto L_0x03a9
        L_0x039f:
            byte[] r8 = defpackage.wpc.c     // Catch:{ all -> 0x0280 }
            if (r9 != r8) goto L_0x03af
            goto L_0x03a9
        L_0x03a4:
            r23 = r9
            goto L_0x03a9
        L_0x03a7:
            r23 = r9
        L_0x03a9:
            ybt r6 = r6.b     // Catch:{ all -> 0x04b9 }
            r8 = 0
            r6.a(r7, r8)     // Catch:{ all -> 0x04b9 }
        L_0x03af:
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x04b9 }
            xdw r6 = defpackage.xdw.a((android.content.Context) r6)     // Catch:{ all -> 0x04b9 }
            java.lang.String r7 = r1.b     // Catch:{ all -> 0x04b9 }
            defpackage.iva.a((java.lang.Object) r7)     // Catch:{ all -> 0x04b9 }
            r6.a()     // Catch:{ all -> 0x04b9 }
            xfb r8 = new xfb     // Catch:{ all -> 0x04b9 }
            android.content.Context r9 = r6.a     // Catch:{ all -> 0x04b9 }
            r13 = 0
            r8.<init>(r9, r7, r13)     // Catch:{ all -> 0x04b9 }
            boolean r9 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x04b9 }
            if (r9 == 0) goto L_0x03d0
            java.lang.String r8 = r8.c()     // Catch:{ all -> 0x0280 }
            goto L_0x03d6
        L_0x03d0:
            r9 = 0
            java.lang.String r8 = r8.c(r9)     // Catch:{ all -> 0x04b9 }
        L_0x03d6:
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x04b9 }
            if (r9 != 0) goto L_0x0458
            java.lang.String r8 = defpackage.ycc.b((java.lang.String) r8)     // Catch:{ all -> 0x04b9 }
            android.content.Context r9 = r6.a     // Catch:{ all -> 0x04b9 }
            int r9 = defpackage.wsq.a(r9)     // Catch:{ all -> 0x04b9 }
            yck r13 = r6.b     // Catch:{ all -> 0x04b9 }
            java.lang.String r14 = defpackage.xdw.a((java.lang.String) r8)     // Catch:{ all -> 0x04b9 }
            r24 = r12
            r12 = 0
            boolean r13 = r13.a(r7, r12, r14, r9)     // Catch:{ all -> 0x04b9 }
            if (r13 != 0) goto L_0x0455
            java.lang.String r12 = defpackage.ycc.a((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x04b9 }
            android.content.Context r13 = r6.a     // Catch:{ all -> 0x04b9 }
            wmz r13 = defpackage.wmz.a((android.content.Context) r13)     // Catch:{ all -> 0x04b9 }
            defpackage.amrl.a((java.lang.Object) r12)     // Catch:{ all -> 0x04b9 }
            izb r14 = r13.b     // Catch:{ VolleyError -> 0x0410 }
            android.content.Context r13 = r13.a     // Catch:{ VolleyError -> 0x0410 }
            r25 = r15
            r15 = 0
            byte[] r10 = r14.a((android.content.Context) r13, (android.net.Uri) r15, (java.lang.String) r12)     // Catch:{ VolleyError -> 0x040e }
            goto L_0x0437
        L_0x040e:
            r0 = move-exception
            goto L_0x0413
        L_0x0410:
            r0 = move-exception
            r25 = r15
        L_0x0413:
            r13 = r0
            r14 = 3
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x04eb }
            r14 = 0
            r15[r14] = r12     // Catch:{ all -> 0x04eb }
            java.lang.String r12 = r13.getMessage()     // Catch:{ all -> 0x04eb }
            r14 = 1
            r15[r14] = r12     // Catch:{ all -> 0x04eb }
            com.android.volley.NetworkResponse r12 = r13.networkResponse     // Catch:{ all -> 0x04eb }
            if (r12 == 0) goto L_0x042e
            int r12 = r12.statusCode     // Catch:{ all -> 0x04eb }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x04eb }
            r23 = r12
            goto L_0x042f
        L_0x042e:
        L_0x042f:
            r12 = 2
            r15[r12] = r23     // Catch:{ all -> 0x04eb }
            defpackage.xdt.b(r11, r10, r15)     // Catch:{ all -> 0x04eb }
            byte[] r10 = defpackage.wpc.d     // Catch:{ all -> 0x04eb }
        L_0x0437:
            if (r10 == 0) goto L_0x0462
            byte[] r11 = defpackage.wpc.c     // Catch:{ all -> 0x04eb }
            if (r10 == r11) goto L_0x0462
            byte[] r11 = defpackage.wpc.d     // Catch:{ all -> 0x04eb }
            if (r10 == r11) goto L_0x0462
            yck r6 = r6.b     // Catch:{ all -> 0x04eb }
            r34 = 0
            java.lang.String r35 = defpackage.xdw.a((java.lang.String) r8)     // Catch:{ all -> 0x04eb }
            r32 = r6
            r33 = r7
            r36 = r10
            r37 = r9
            r32.a(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x04eb }
            goto L_0x0462
        L_0x0455:
            r25 = r15
            goto L_0x0462
        L_0x0458:
            r24 = r12
            r25 = r15
            yck r6 = r6.b     // Catch:{ all -> 0x04eb }
            r8 = 0
            r6.a(r7, r8)     // Catch:{ all -> 0x04eb }
        L_0x0462:
            if (r3 != 0) goto L_0x0491
            xfb r3 = r1.d     // Catch:{ all -> 0x04eb }
            r3.d()     // Catch:{ all -> 0x04eb }
            xfb r3 = r1.d     // Catch:{ all -> 0x0485 }
            r3.a((com.google.android.gms.plus.service.v2whitelisted.models.Person) r2)     // Catch:{ all -> 0x0485 }
            xfb r3 = r1.d     // Catch:{ all -> 0x0485 }
            r3.f()     // Catch:{ all -> 0x0485 }
            boolean r3 = r1.v     // Catch:{ all -> 0x0485 }
            if (r3 == 0) goto L_0x047f
            wmn r3 = r1.a     // Catch:{ all -> 0x0485 }
            int r6 = r3.j     // Catch:{ all -> 0x0485 }
            r7 = 1
            int r6 = r6 + r7
            r3.j = r6     // Catch:{ all -> 0x0485 }
        L_0x047f:
            xfb r3 = r1.d     // Catch:{ all -> 0x04eb }
            r3.e()     // Catch:{ all -> 0x04eb }
            goto L_0x0491
        L_0x0485:
            r0 = move-exception
            r2 = r0
            xfb r3 = r1.d     // Catch:{ all -> 0x04eb }
            r3.e()     // Catch:{ all -> 0x04eb }
            throw r2     // Catch:{ all -> 0x04eb }
        L_0x048d:
            r24 = r12
            r25 = r15
        L_0x0491:
            r1.a()     // Catch:{ all -> 0x04eb }
            boolean r3 = r1.f     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            if (r3 == 0) goto L_0x04a8
            wmn r3 = r1.a     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            long r6 = r3.x     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            amsn r8 = r1.g     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            long r8 = r8.a((java.util.concurrent.TimeUnit) r9)     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            long r8 = r8 - r4
            long r6 = r6 + r8
            r3.x = r6     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
        L_0x04a8:
            boolean r2 = defpackage.xeg.a((com.google.android.gms.plus.service.v2whitelisted.models.Person) r2)     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            r9 = r2
            goto L_0x054c
        L_0x04af:
            r0 = move-exception
            r25 = r15
            r2 = r0
        L_0x04b3:
            xfb r3 = r1.d     // Catch:{ all -> 0x04eb }
            r3.e()     // Catch:{ all -> 0x04eb }
            throw r2     // Catch:{ all -> 0x04eb }
        L_0x04b9:
            r0 = move-exception
            goto L_0x04f1
        L_0x04bb:
            r0 = move-exception
            goto L_0x04c0
        L_0x04bd:
            r0 = move-exception
            r29 = r10
        L_0x04c0:
            r25 = r15
            r2 = r0
            long r6 = r1.b()     // Catch:{ all -> 0x04eb }
            long r6 = r6 - r4
            wmn r3 = r1.a     // Catch:{ all -> 0x04eb }
            long r8 = r3.G     // Catch:{ all -> 0x04eb }
            long r8 = r8 + r6
            r3.G = r8     // Catch:{ all -> 0x04eb }
            boolean r8 = r1.f     // Catch:{ all -> 0x04eb }
            if (r8 == 0) goto L_0x04d8
            long r8 = r3.H     // Catch:{ all -> 0x04eb }
            long r8 = r8 + r6
            r3.H = r8     // Catch:{ all -> 0x04eb }
        L_0x04d8:
            boolean r6 = r1.u     // Catch:{ all -> 0x04eb }
            if (r6 == 0) goto L_0x04ea
            android.util.SparseIntArray r3 = r3.u     // Catch:{ all -> 0x04eb }
            r6 = 0
            r7 = 1
            r3.put(r7, r6)     // Catch:{ all -> 0x04eb }
            wmn r3 = r1.a     // Catch:{ all -> 0x04eb }
            android.util.SparseIntArray r3 = r3.v     // Catch:{ all -> 0x04eb }
            r3.put(r7, r6)     // Catch:{ all -> 0x04eb }
        L_0x04ea:
            throw r2     // Catch:{ all -> 0x04eb }
        L_0x04eb:
            r0 = move-exception
            goto L_0x04f3
        L_0x04ed:
            r0 = move-exception
            r29 = r10
            r1 = r14
        L_0x04f1:
            r25 = r15
        L_0x04f3:
            r2 = r0
        L_0x04f4:
            boolean r3 = r1.f     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            if (r3 == 0) goto L_0x0508
            wmn r3 = r1.a     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            long r6 = r3.x     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            amsn r8 = r1.g     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            long r8 = r8.a((java.util.concurrent.TimeUnit) r9)     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
            long r8 = r8 - r4
            long r6 = r6 + r8
            r3.x = r6     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
        L_0x0508:
            throw r2     // Catch:{ xsa -> 0x0515, all -> 0x0509 }
        L_0x0509:
            r0 = move-exception
            r4 = r52
            r2 = r0
            r3 = r21
            r9 = r25
        L_0x0511:
            r11 = r29
            goto L_0x0c12
        L_0x0515:
            r0 = move-exception
            r4 = r52
            r2 = r0
            r3 = r21
            r9 = r25
        L_0x051d:
            r11 = r29
            goto L_0x053f
        L_0x0520:
            r31 = r3
            r29 = r10
            r24 = r12
            r1 = r14
            r25 = r15
            r9 = 0
            goto L_0x054c
        L_0x052b:
            r0 = move-exception
            r4 = r52
            r2 = r0
            r11 = r10
            r1 = r14
            r9 = r15
            r3 = r21
            goto L_0x0c12
        L_0x0536:
            r0 = move-exception
            r4 = r52
            r2 = r0
            r11 = r10
            r1 = r14
            r9 = r15
            r3 = r21
        L_0x053f:
            r13 = 1
            goto L_0x0c1f
        L_0x0542:
            r31 = r3
            r29 = r10
            r24 = r12
            r1 = r14
            r25 = r15
            r9 = 1
        L_0x054c:
            boolean r2 = r1.l     // Catch:{ xsa -> 0x0bf4, all -> 0x0bea }
            if (r2 == 0) goto L_0x0554
            r9 = r25
            goto L_0x0aa1
        L_0x0554:
            boolean r2 = r1.m     // Catch:{ xsa -> 0x0bf4, all -> 0x0bea }
            if (r2 == 0) goto L_0x055a
            r2 = 0
            goto L_0x055f
        L_0x055a:
            if (r9 == 0) goto L_0x055e
            r2 = 1
            goto L_0x055f
        L_0x055e:
            r2 = 0
        L_0x055f:
            defpackage.xip.a()     // Catch:{ xsa -> 0x0bf4, all -> 0x0bea }
            r3 = 1000(0x3e8, double:4.94E-321)
            xfb r5 = r1.d     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            aywy r6 = defpackage.aywy.a     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            ayxk r6 = r6.a()     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            boolean r6 = r6.aj()     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            if (r6 == 0) goto L_0x05ad
            wtx r6 = r5.c     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            java.lang.String r7 = r5.d     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            r9 = 0
            r8[r9] = r7     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            java.lang.String r7 = "SELECT last_full_people_sync_time FROM owners WHERE _id=?"
            r9 = -1
            long r6 = r6.a((java.lang.String) r7, (java.lang.String[]) r8, (long) r9)     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            jiq r5 = r5.a     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            long r8 = r5.a()     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            long r8 = r8 - r6
            aywy r5 = defpackage.aywy.a     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            ayxk r5 = r5.a()     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            long r5 = r5.cj()     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            long r5 = r5 * r3
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x05aa
            android.content.Context r5 = r1.h     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            java.lang.String r6 = r1.b     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            java.lang.String r7 = r1.c     // Catch:{ VolleyError -> 0x05ec, all -> 0x05d7 }
            java.lang.String r8 = "Periodic full sync"
            r9 = r25
            defpackage.wus.a((android.content.Context) r5, (java.lang.String) r9, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            r5 = 0
            goto L_0x05ca
        L_0x05aa:
            r9 = r25
            goto L_0x05af
        L_0x05ad:
            r9 = r25
        L_0x05af:
            xfb r5 = r1.d     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            java.lang.String r6 = "autocomplete"
            java.lang.String r5 = r5.a((java.lang.String) r6)     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            ob r6 = new ob     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            r7 = 3
            r6.<init>((int) r7)     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            r6.add(r5)     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            java.lang.Object r5 = r5.next()     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
        L_0x05ca:
            r1.a((java.lang.String) r5, (boolean) r2)     // Catch:{ VolleyError -> 0x05d5, all -> 0x05d3 }
            if (r5 == 0) goto L_0x05d1
            r2 = 0
            goto L_0x0610
        L_0x05d1:
            r2 = 1
            goto L_0x0610
        L_0x05d3:
            r0 = move-exception
            goto L_0x05da
        L_0x05d5:
            r0 = move-exception
            goto L_0x05ef
        L_0x05d7:
            r0 = move-exception
            r9 = r25
        L_0x05da:
            r4 = r52
            r5 = r0
            r7 = r18
            r10 = r19
            r8 = r20
            r3 = r21
            r6 = r22
            r11 = r29
            r13 = 1
            goto L_0x0b86
        L_0x05ec:
            r0 = move-exception
            r9 = r25
        L_0x05ef:
            r5 = r0
            com.android.volley.NetworkResponse r6 = r5.networkResponse     // Catch:{ all -> 0x0b75 }
            if (r6 == 0) goto L_0x0b63
            int r6 = r6.statusCode     // Catch:{ all -> 0x0b75 }
            r7 = 410(0x19a, float:5.75E-43)
            if (r6 != r7) goto L_0x0b63
            java.lang.String r5 = "Sync Token out of date, syncing full data."
            android.util.Log.i(r9, r5)     // Catch:{ all -> 0x0b75 }
            wmn r5 = r1.a     // Catch:{ all -> 0x0b75 }
            r6 = 1
            r5.e = r6     // Catch:{ all -> 0x0b75 }
            xfb r5 = r1.d     // Catch:{ all -> 0x0b75 }
            java.lang.String r6 = "people_page"
            r5.b((java.lang.String) r6)     // Catch:{ all -> 0x0b75 }
            r5 = 0
            r1.a((java.lang.String) r5, (boolean) r2)     // Catch:{ all -> 0x0b75 }
            r2 = 1
        L_0x0610:
            java.lang.String r5 = "owners"
            if (r2 == 0) goto L_0x064c
            jiq r6 = r1.i     // Catch:{ all -> 0x0639 }
            long r6 = r6.a()     // Catch:{ all -> 0x0639 }
            xfb r8 = r1.d     // Catch:{ all -> 0x0639 }
            android.content.ContentValues r10 = r8.a()     // Catch:{ all -> 0x0639 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0639 }
            r7 = r24
            r10.put(r7, r6)     // Catch:{ all -> 0x0639 }
            wtx r6 = r8.c     // Catch:{ all -> 0x0639 }
            r7 = 1
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch:{ all -> 0x0639 }
            java.lang.String r7 = r8.d     // Catch:{ all -> 0x0639 }
            r8 = 0
            r11[r8] = r7     // Catch:{ all -> 0x0639 }
            java.lang.String r7 = "_id = ?"
            r6.a((java.lang.String) r5, (android.content.ContentValues) r10, (java.lang.String) r7, (java.lang.String[]) r11)     // Catch:{ all -> 0x0639 }
            goto L_0x064c
        L_0x0639:
            r0 = move-exception
            r4 = r52
            r5 = r0
            r7 = r18
            r10 = r19
        L_0x0641:
            r8 = r20
        L_0x0643:
            r3 = r21
            r6 = r22
            r11 = r29
            r13 = 1
            goto L_0x0b87
        L_0x064c:
            aywy r6 = defpackage.aywy.a     // Catch:{ all -> 0x0b51 }
            ayxk r6 = r6.a()     // Catch:{ all -> 0x0b51 }
            boolean r6 = r6.aS()     // Catch:{ all -> 0x0b51 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0b51 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0b51 }
            java.lang.String r7 = "_id"
            if (r6 != 0) goto L_0x0665
            r10 = r19
            goto L_0x0688
        L_0x0665:
            if (r2 != 0) goto L_0x067f
            aywy r6 = defpackage.aywy.a     // Catch:{ all -> 0x0639 }
            ayxk r6 = r6.a()     // Catch:{ all -> 0x0639 }
            boolean r6 = r6.aT()     // Catch:{ all -> 0x0639 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0639 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0639 }
            if (r6 == 0) goto L_0x067c
            goto L_0x067f
        L_0x067c:
            r10 = r19
            goto L_0x0688
        L_0x067f:
            xfb r6 = r1.d     // Catch:{ all -> 0x0b51 }
            java.lang.String r8 = "owner_id"
            r10 = r19
            r6.a((java.lang.String) r10, (java.lang.String) r5, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x0b4b }
        L_0x0688:
            aywy r5 = defpackage.aywy.a     // Catch:{ all -> 0x0b4b }
            ayxk r5 = r5.a()     // Catch:{ all -> 0x0b4b }
            boolean r5 = r5.aQ()     // Catch:{ all -> 0x0b4b }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0b4b }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0b4b }
            if (r5 == 0) goto L_0x06d3
            if (r2 != 0) goto L_0x06bd
            aywy r5 = defpackage.aywy.a     // Catch:{ all -> 0x06b6 }
            ayxk r5 = r5.a()     // Catch:{ all -> 0x06b6 }
            boolean r5 = r5.aR()     // Catch:{ all -> 0x06b6 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x06b6 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x06b6 }
            if (r5 == 0) goto L_0x06b3
            goto L_0x06bd
        L_0x06b3:
            r8 = r20
            goto L_0x06d5
        L_0x06b6:
            r0 = move-exception
            r4 = r52
            r5 = r0
            r7 = r18
            goto L_0x0641
        L_0x06bd:
            xfb r5 = r1.d     // Catch:{ all -> 0x06c9 }
            java.lang.String r6 = "people_id"
            r8 = r20
            r5.a((java.lang.String) r8, (java.lang.String) r10, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x06c7 }
            goto L_0x06d5
        L_0x06c7:
            r0 = move-exception
            goto L_0x06cc
        L_0x06c9:
            r0 = move-exception
            r8 = r20
        L_0x06cc:
            r4 = r52
            r5 = r0
            r7 = r18
            goto L_0x0643
        L_0x06d3:
            r8 = r20
        L_0x06d5:
            if (r2 == 0) goto L_0x0749
            xfs r2 = defpackage.xhj.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.Object r2 = r2.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            boolean r2 = r2.booleanValue()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            if (r2 != 0) goto L_0x06e6
            goto L_0x0749
        L_0x06e6:
            java.security.SecureRandom r2 = defpackage.ycm.f     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            double r5 = r2.nextDouble()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            xfs r2 = defpackage.xhl.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.Object r2 = r2.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            double r11 = r2.doubleValue()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0749
            android.content.Context r2 = r1.h     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            wtz r2 = defpackage.wtz.a((android.content.Context) r2)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            xfs r5 = defpackage.xhk.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.Object r5 = r5.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            boolean r5 = r5.booleanValue()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            if (r5 == 0) goto L_0x0717
            int r5 = r2.f()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r42 = r5
            goto L_0x0719
        L_0x0717:
            r42 = 0
        L_0x0719:
            wml r32 = defpackage.wml.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            long r33 = r2.c((java.lang.String) r10)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            long r35 = r2.c((java.lang.String) r8)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6 = r22
            long r37 = r2.c((java.lang.String) r6)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r7 = r18
            long r39 = r2.c((java.lang.String) r7)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r41 = r2.e()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r32.a(r33, r35, r37, r39, r41, r42)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            goto L_0x0749
        L_0x0739:
            r0 = move-exception
            r4 = r52
            r2 = r0
            r3 = r21
            goto L_0x0511
        L_0x0741:
            r0 = move-exception
            r4 = r52
            r2 = r0
            r3 = r21
            goto L_0x051d
        L_0x0749:
            xfb r2 = r1.d     // Catch:{ xsa -> 0x0b44, all -> 0x0b3d }
            long r5 = r2.b()     // Catch:{ xsa -> 0x0b44, all -> 0x0b3d }
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0aa1
            android.content.Context r2 = r1.h     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            wss r2 = defpackage.wss.a((android.content.Context) r2)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.String r5 = r1.b     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.String r6 = r1.c     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            android.content.SharedPreferences r7 = r2.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.String r5 = defpackage.wss.a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r10 = 0
            long r5 = r7.getLong(r5, r10)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aywy r7 = defpackage.aywy.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            ayxk r7 = r7.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            long r7 = r7.cW()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            jiq r10 = r1.i     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            long r10 = r10.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.Long.signum(r7)
            long r7 = r7 * r3
            long r5 = r5 + r7
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0aa1
            java.lang.String r3 = r1.b     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.String r4 = r1.c     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r5 = 0
            defpackage.iva.b((java.lang.String) r5)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            android.content.SharedPreferences r2 = r2.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.lang.String r3 = defpackage.wss.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            android.content.SharedPreferences$Editor r2 = r2.putLong(r3, r10)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r2.commit()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            java.security.SecureRandom r2 = defpackage.ycm.f     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            float r2 = r2.nextFloat()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            double r2 = (double) r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aywy r4 = defpackage.aywy.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            ayxk r4 = r4.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            double r4 = r4.cX()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0aa1
            xfb r2 = r1.d     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r2.d()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r43 = 0
        L_0x07ba:
            r1.a()     // Catch:{ all -> 0x0a99 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0a99 }
            zin r4 = r1.r     // Catch:{ all -> 0x0a8a }
            xpk r5 = r1.p     // Catch:{ all -> 0x0a8a }
            com.google.android.gms.common.internal.ClientContext r5 = r5.a     // Catch:{ all -> 0x0a8a }
            java.lang.String r34 = "me"
            java.lang.String r35 = "all"
            r6 = 0
            java.lang.Boolean r39 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0a8a }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x0a8a }
            boolean r6 = defpackage.wsq.b(r6)     // Catch:{ all -> 0x0a8a }
            if (r6 == 0) goto L_0x07e4
            aywy r6 = defpackage.aywy.a     // Catch:{ all -> 0x0a8a }
            ayxk r6 = r6.a()     // Catch:{ all -> 0x0a8a }
            long r6 = r6.cR()     // Catch:{ all -> 0x0a8a }
            int r7 = (int) r6     // Catch:{ all -> 0x0a8a }
            goto L_0x07ef
        L_0x07e4:
            aywy r6 = defpackage.aywy.a     // Catch:{ all -> 0x0a8a }
            ayxk r6 = r6.a()     // Catch:{ all -> 0x0a8a }
            long r6 = r6.cS()     // Catch:{ all -> 0x0a8a }
            int r7 = (int) r6     // Catch:{ all -> 0x0a8a }
        L_0x07ef:
            java.lang.Integer r40 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0a8a }
            xpk r6 = r1.p     // Catch:{ all -> 0x0a8a }
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x0a8a }
            r36 = 0
            r38 = 0
            r42 = 0
            r44 = 0
            iyu r45 = y     // Catch:{ all -> 0x0a8a }
            r32 = r4
            r33 = r5
            r37 = r39
            r41 = r6
            com.google.android.gms.plus.service.v2whitelisted.models.PeopleList r4 = r32.a(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x0a8a }
            wmn r5 = r1.a     // Catch:{ all -> 0x0a99 }
            long r6 = r5.G     // Catch:{ all -> 0x0a99 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0a99 }
            long r10 = r10 - r2
            long r6 = r6 + r10
            r5.G = r6     // Catch:{ all -> 0x0a99 }
            r1.a()     // Catch:{ all -> 0x0a99 }
            java.util.List r2 = r4.c     // Catch:{ all -> 0x0a99 }
            int r3 = defpackage.xeg.a((java.util.List) r2)     // Catch:{ all -> 0x0a99 }
            r5 = 0
        L_0x0823:
            if (r5 >= r3) goto L_0x092d
            xfb r6 = r1.d     // Catch:{ all -> 0x0a99 }
            java.lang.Object r7 = r2.get(r5)     // Catch:{ all -> 0x0a99 }
            com.google.android.gms.plus.service.v2whitelisted.models.Person r7 = (com.google.android.gms.plus.service.v2whitelisted.models.Person) r7     // Catch:{ all -> 0x0a99 }
            wmn r8 = r1.a     // Catch:{ all -> 0x0a99 }
            java.lang.String r10 = defpackage.xeg.m(r7)     // Catch:{ all -> 0x0a99 }
            boolean r11 = defpackage.xeg.f(r7)     // Catch:{ all -> 0x0a99 }
            if (r11 != 0) goto L_0x083b
            goto L_0x0923
        L_0x083b:
            boolean r11 = defpackage.xfb.b((com.google.android.gms.plus.service.v2whitelisted.models.Person) r7)     // Catch:{ all -> 0x0a99 }
            if (r11 == 0) goto L_0x0848
            int r11 = r8.V     // Catch:{ all -> 0x0a99 }
            r12 = 1
            int r11 = r11 + r12
            r8.V = r11     // Catch:{ all -> 0x0a99 }
            goto L_0x084e
        L_0x0848:
            int r11 = r8.W     // Catch:{ all -> 0x0a99 }
            r12 = 1
            int r11 = r11 + r12
            r8.W = r11     // Catch:{ all -> 0x0a99 }
        L_0x084e:
            java.util.Set r11 = r6.g     // Catch:{ all -> 0x0a99 }
            if (r11 != 0) goto L_0x0859
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x0a99 }
            r11.<init>()     // Catch:{ all -> 0x0a99 }
            r6.g = r11     // Catch:{ all -> 0x0a99 }
        L_0x0859:
            java.util.Set r11 = r6.h     // Catch:{ all -> 0x0a99 }
            if (r11 == 0) goto L_0x085e
            goto L_0x0865
        L_0x085e:
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x0a99 }
            r11.<init>()     // Catch:{ all -> 0x0a99 }
            r6.h = r11     // Catch:{ all -> 0x0a99 }
        L_0x0865:
            java.util.Set r11 = r6.g     // Catch:{ all -> 0x0a99 }
            r11.clear()     // Catch:{ all -> 0x0a99 }
            java.util.Set r11 = r6.h     // Catch:{ all -> 0x0a99 }
            r11.clear()     // Catch:{ all -> 0x0a99 }
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Metadata r11 = r7.x     // Catch:{ all -> 0x0a99 }
            if (r11 != 0) goto L_0x0874
            goto L_0x088b
        L_0x0874:
            java.util.List r11 = r11.f     // Catch:{ all -> 0x0a99 }
            int r12 = defpackage.xeg.a((java.util.List) r11)     // Catch:{ all -> 0x0a99 }
            r13 = 0
        L_0x087b:
            if (r13 >= r12) goto L_0x088b
            java.util.Set r14 = r6.g     // Catch:{ all -> 0x0a99 }
            java.lang.Object r15 = r11.get(r13)     // Catch:{ all -> 0x0a99 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0a99 }
            r14.add(r15)     // Catch:{ all -> 0x0a99 }
            int r13 = r13 + 1
            goto L_0x087b
        L_0x088b:
            wtx r11 = r6.c     // Catch:{ all -> 0x0a99 }
            r12 = 2
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ all -> 0x0a99 }
            java.lang.String r12 = r6.d     // Catch:{ all -> 0x0a99 }
            r14 = 0
            r13[r14] = r12     // Catch:{ all -> 0x0a99 }
            java.lang.String r10 = defpackage.ycm.f(r10)     // Catch:{ all -> 0x0a99 }
            r12 = 1
            r13[r12] = r10     // Catch:{ all -> 0x0a99 }
            java.lang.String r10 = "SELECT circle_id FROM circle_members WHERE owner_id=?  AND qualified_id=?"
            android.database.Cursor r10 = r11.a((java.lang.String) r10, (java.lang.String[]) r13)     // Catch:{ all -> 0x0a99 }
        L_0x08a2:
            boolean r11 = r10.moveToNext()     // Catch:{ all -> 0x0927 }
            if (r11 == 0) goto L_0x08b3
            java.util.Set r11 = r6.h     // Catch:{ all -> 0x0927 }
            r12 = 0
            java.lang.String r13 = r10.getString(r12)     // Catch:{ all -> 0x0927 }
            r11.add(r13)     // Catch:{ all -> 0x0927 }
            goto L_0x08a2
        L_0x08b3:
            r10.close()     // Catch:{ all -> 0x0a99 }
            java.lang.String r10 = defpackage.xeg.o(r7)     // Catch:{ all -> 0x0a99 }
            if (r10 != 0) goto L_0x08da
            xeh r2 = new xeh     // Catch:{ all -> 0x0a99 }
            java.lang.String r3 = "Unable to get qualifed ID.  v2id="
            java.lang.String r4 = r7.p     // Catch:{ all -> 0x0a99 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0a99 }
            int r5 = r4.length()     // Catch:{ all -> 0x0a99 }
            if (r5 != 0) goto L_0x08d2
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0a99 }
            r4.<init>(r3)     // Catch:{ all -> 0x0a99 }
            goto L_0x08d6
        L_0x08d2:
            java.lang.String r4 = r3.concat(r4)     // Catch:{ all -> 0x0a99 }
        L_0x08d6:
            r2.<init>(r4)     // Catch:{ all -> 0x0a99 }
            throw r2     // Catch:{ all -> 0x0a99 }
        L_0x08da:
            java.util.Set r11 = r6.g     // Catch:{ all -> 0x0a99 }
            java.util.Set r12 = r6.h     // Catch:{ all -> 0x0a99 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0a99 }
            if (r11 == 0) goto L_0x0910
            wtz r11 = r6.b     // Catch:{ all -> 0x0a99 }
            java.lang.String r6 = r6.e     // Catch:{ all -> 0x0a99 }
            defpackage.iva.c(r6)     // Catch:{ all -> 0x0a99 }
            java.lang.String r12 = "qualifiedId"
            defpackage.ycm.a(r10, r12)     // Catch:{ all -> 0x0a99 }
            wtw r12 = r11.f     // Catch:{ all -> 0x0a99 }
            r13 = 0
            java.lang.String r6 = r12.b(r6, r13)     // Catch:{ all -> 0x0a99 }
            wtx r11 = r11.b()     // Catch:{ all -> 0x0a99 }
            r12 = 2
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ all -> 0x0a99 }
            r12 = 0
            r13[r12] = r6     // Catch:{ all -> 0x0a99 }
            r6 = 1
            r13[r6] = r10     // Catch:{ all -> 0x0a99 }
            java.lang.String r6 = "SELECT count(1) FROM people WHERE owner_id=? AND qualified_id=?"
            long r10 = r11.b(r6, r13)     // Catch:{ all -> 0x0a99 }
            r12 = 0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x0923
        L_0x0910:
            boolean r6 = defpackage.xfb.b((com.google.android.gms.plus.service.v2whitelisted.models.Person) r7)     // Catch:{ all -> 0x0a99 }
            if (r6 == 0) goto L_0x091d
            int r6 = r8.X     // Catch:{ all -> 0x0a99 }
            r7 = 1
            int r6 = r6 + r7
            r8.X = r6     // Catch:{ all -> 0x0a99 }
            goto L_0x0923
        L_0x091d:
            int r6 = r8.Y     // Catch:{ all -> 0x0a99 }
            r7 = 1
            int r6 = r6 + r7
            r8.Y = r6     // Catch:{ all -> 0x0a99 }
        L_0x0923:
            int r5 = r5 + 1
            goto L_0x0823
        L_0x0927:
            r0 = move-exception
            r2 = r0
            r10.close()     // Catch:{ all -> 0x0a99 }
            throw r2     // Catch:{ all -> 0x0a99 }
        L_0x092d:
            java.lang.String r2 = r4.d     // Catch:{ all -> 0x0a99 }
            if (r2 != 0) goto L_0x0a81
            wmn r2 = r1.a     // Catch:{ all -> 0x0a99 }
            xfb r3 = r1.d     // Catch:{ all -> 0x0a99 }
            wtx r4 = r3.c     // Catch:{ all -> 0x0a99 }
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x0a99 }
            java.lang.String r3 = r3.d     // Catch:{ all -> 0x0a99 }
            r5 = 0
            r6[r5] = r3     // Catch:{ all -> 0x0a99 }
            java.lang.String r3 = "SELECT count(1) FROM people WHERE owner_id=?"
            r7 = 0
            long r3 = r4.a((java.lang.String) r3, (java.lang.String[]) r6, (long) r7)     // Catch:{ all -> 0x0a99 }
            int r4 = (int) r3     // Catch:{ all -> 0x0a99 }
            r2.S = r4     // Catch:{ all -> 0x0a99 }
            wmn r2 = r1.a     // Catch:{ all -> 0x0a99 }
            xfb r3 = r1.d     // Catch:{ all -> 0x0a99 }
            wtx r4 = r3.c     // Catch:{ all -> 0x0a99 }
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x0a99 }
            java.lang.String r3 = r3.d     // Catch:{ all -> 0x0a99 }
            r5 = 0
            r6[r5] = r3     // Catch:{ all -> 0x0a99 }
            java.lang.String r3 = "SELECT count(1) FROM people WHERE owner_id=? AND gaia_id IS NOT NULL AND in_circle=1"
            r7 = 0
            long r3 = r4.a((java.lang.String) r3, (java.lang.String[]) r6, (long) r7)     // Catch:{ all -> 0x0a99 }
            int r4 = (int) r3     // Catch:{ all -> 0x0a99 }
            r2.T = r4     // Catch:{ all -> 0x0a99 }
            wmn r2 = r1.a     // Catch:{ all -> 0x0a99 }
            xfb r3 = r1.d     // Catch:{ all -> 0x0a99 }
            wtx r4 = r3.c     // Catch:{ all -> 0x0a99 }
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x0a99 }
            java.lang.String r3 = r3.d     // Catch:{ all -> 0x0a99 }
            r5 = 0
            r6[r5] = r3     // Catch:{ all -> 0x0a99 }
            java.lang.String r3 = "SELECT count(1) FROM people WHERE owner_id=? AND in_circle=0"
            r7 = 0
            long r3 = r4.a((java.lang.String) r3, (java.lang.String[]) r6, (long) r7)     // Catch:{ all -> 0x0a99 }
            int r4 = (int) r3     // Catch:{ all -> 0x0a99 }
            r2.U = r4     // Catch:{ all -> 0x0a99 }
            xfb r2 = r1.d     // Catch:{ all -> 0x0a99 }
            r2.f()     // Catch:{ all -> 0x0a99 }
            xfb r2 = r1.d     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r2.e()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            wmn r2 = r1.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r3 = r2.R     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r4 = 1
            int r3 = r3 + r4
            r2.R = r3     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r2.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            wmn r2 = r1.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r3 = r2.T     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r3 = r2.S     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r3 = r2.V     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = r2.X     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            defpackage.wml.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = r1.w     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = r2 + -1
            int r2 = defpackage.aoim.a(r2)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            wmn r3 = r1.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aoip r4 = defpackage.aoip.h     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aucd r4 = r4.o()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aoin r5 = defpackage.aoin.r     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aucd r5 = r5.o()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            boolean r6 = r5.c     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            if (r6 != 0) goto L_0x09bc
            goto L_0x09c2
        L_0x09bc:
            r5.c()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6 = 0
            r5.c = r6     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
        L_0x09c2:
            aucj r6 = r5.b     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aoin r6 = (defpackage.aoin) r6     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r7 = r6.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r8 = 1
            r7 = r7 | r8
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.b = r8     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r8 = r2 + -1
            if (r2 == 0) goto L_0x0a7e
            r6.c = r8     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r10 = 2
            r2 = r7 | 2
            r6.a = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            boolean r2 = r3.a()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            boolean r6 = r5.c     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            if (r6 != 0) goto L_0x09e2
            goto L_0x09e8
        L_0x09e2:
            r5.c()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6 = 0
            r5.c = r6     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
        L_0x09e8:
            aucj r6 = r5.b     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aoin r6 = (defpackage.aoin) r6     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r7 = r6.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r7 = r7 | 4
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.d = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = r3.U     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r8 = r3.W     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            if (r2 != r8) goto L_0x0a02
            int r10 = r3.Y     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            if (r10 == 0) goto L_0x0a00
            r10 = 0
            goto L_0x0a03
        L_0x0a00:
            r10 = 1
            goto L_0x0a03
        L_0x0a02:
            r10 = 0
        L_0x0a03:
            r7 = r7 | 8
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.e = r10     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r10 = r3.S     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r11 = 16
            r7 = r7 | r11
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.f = r10     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r10 = r3.T     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r7 = r7 | 32
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.g = r10     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r7 = r7 | 64
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.h = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r11 = r3.V     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r7 = r7 | 128(0x80, float:1.794E-43)
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.i = r11     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r7 = r7 | 256(0x100, float:3.59E-43)
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.j = r8     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r10 = r10 - r11
            r7 = r7 | 512(0x200, float:7.175E-43)
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.k = r10     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = r2 - r8
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.l = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = r3.X     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.m = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = r3.Y     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
            r6.a = r7     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.n = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            boolean r2 = r3.g     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r3 = r7 | 8192(0x2000, float:1.14794E-41)
            r6.a = r3     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r6.o = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aucj r2 = r5.i()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aoin r2 = (defpackage.aoin) r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            boolean r3 = r4.c     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            if (r3 != 0) goto L_0x0a5f
            goto L_0x0a65
        L_0x0a5f:
            r4.c()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r3 = 0
            r4.c = r3     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
        L_0x0a65:
            aucj r3 = r4.b     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aoip r3 = (defpackage.aoip) r3     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r2.getClass()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r3.d = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            int r2 = r3.a     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r2 = r2 | 4
            r3.a = r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aucj r2 = r4.i()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            aoip r2 = (defpackage.aoip) r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            defpackage.wmm.a(r2)     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            goto L_0x0aa1
        L_0x0a7e:
            r2 = 0
            throw r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
        L_0x0a81:
            r7 = 0
            r10 = 2
            r11 = 16
            r43 = r2
            goto L_0x07ba
        L_0x0a8a:
            r0 = move-exception
            r4 = r0
            wmn r5 = r1.a     // Catch:{ all -> 0x0a99 }
            long r6 = r5.G     // Catch:{ all -> 0x0a99 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0a99 }
            long r10 = r10 - r2
            long r6 = r6 + r10
            r5.G = r6     // Catch:{ all -> 0x0a99 }
            throw r4     // Catch:{ all -> 0x0a99 }
        L_0x0a99:
            r0 = move-exception
            r2 = r0
            xfb r3 = r1.d     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            r3.e()     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
            throw r2     // Catch:{ xsa -> 0x0741, all -> 0x0739 }
        L_0x0aa1:
            jiq r2 = r1.i     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            long r2 = r2.a()     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            boolean r4 = r1.l     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            if (r4 == 0) goto L_0x0aaf
            r11 = r29
            r13 = 1
            goto L_0x0aff
        L_0x0aaf:
            boolean r4 = defpackage.ayws.f()     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            if (r4 != 0) goto L_0x0ab6
            goto L_0x0aef
        L_0x0ab6:
            int r4 = r1.w     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            boolean r4 = defpackage.xej.a((int) r4)     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            if (r4 == 0) goto L_0x0aef
            android.content.Context r4 = r1.h     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            wss r4 = defpackage.wss.a((android.content.Context) r4)     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            java.lang.String r5 = r1.b     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            r6 = 0
            defpackage.iva.b((java.lang.String) r6)     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            android.content.SharedPreferences r4 = r4.a     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            int r6 = r5.length()     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            if (r6 != 0) goto L_0x0ae2
            java.lang.String r5 = new java.lang.String     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            r6 = r31
            r5.<init>(r6)     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            goto L_0x0ae8
        L_0x0ae2:
            r6 = r31
            java.lang.String r5 = r6.concat(r5)     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
        L_0x0ae8:
            android.content.SharedPreferences$Editor r4 = r4.putLong(r5, r2)     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
            r4.commit()     // Catch:{ izv -> 0x0b38, all -> 0x0092 }
        L_0x0aef:
            xfb r4 = r1.d     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            r11 = r29
            r13 = 1
            r4.a(r13, r11, r5)     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            r4 = 0
            r1.a((boolean) r13, (boolean) r4)     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
        L_0x0aff:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r13)     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            long r2 = r2 - r11
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            r3 = r21
            defpackage.xdt.a((java.lang.String) r9, (java.lang.String) r3, (java.lang.Object) r4, (java.lang.Object) r2)     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            android.content.Context r2 = r1.h     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            r1.a((android.content.Context) r2)     // Catch:{ izv -> 0x0b38, all -> 0x0c5b }
            defpackage.xip.a()
            xfs r1 = defpackage.xhu.a
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0b2d
            int r1 = a((android.content.Context) r46, (java.lang.String) r47, (java.lang.String) r48)
            r4 = r52
            r4.Z = r1
            goto L_0x0b2f
        L_0x0b2d:
            r4 = r52
        L_0x0b2f:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r16
            r4.w = r1
            return
        L_0x0b38:
            r0 = move-exception
            r4 = r52
            goto L_0x0c66
        L_0x0b3d:
            r0 = move-exception
            r4 = r52
            r3 = r21
            goto L_0x0bf1
        L_0x0b44:
            r0 = move-exception
            r4 = r52
            r3 = r21
            goto L_0x0bfb
        L_0x0b4b:
            r0 = move-exception
            r4 = r52
            r7 = r18
            goto L_0x0b58
        L_0x0b51:
            r0 = move-exception
            r4 = r52
            r7 = r18
            r10 = r19
        L_0x0b58:
            r8 = r20
            r3 = r21
            r6 = r22
            r11 = r29
            r13 = 1
            r5 = r0
            goto L_0x0b87
        L_0x0b63:
            r4 = r52
            r7 = r18
            r10 = r19
            r8 = r20
            r3 = r21
            r6 = r22
            r11 = r29
            r13 = 1
            throw r5     // Catch:{ all -> 0x0b73 }
        L_0x0b73:
            r0 = move-exception
            goto L_0x0b85
        L_0x0b75:
            r0 = move-exception
            r4 = r52
            r7 = r18
            r10 = r19
            r8 = r20
            r3 = r21
            r6 = r22
            r11 = r29
            r13 = 1
        L_0x0b85:
            r5 = r0
        L_0x0b86:
            r2 = 0
        L_0x0b87:
            if (r2 == 0) goto L_0x0be5
            xfs r2 = defpackage.xhj.a     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            java.lang.Object r2 = r2.a()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            boolean r2 = r2.booleanValue()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            if (r2 == 0) goto L_0x0be5
            java.security.SecureRandom r2 = defpackage.ycm.f     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            double r14 = r2.nextDouble()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            xfs r2 = defpackage.xhl.a     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            java.lang.Object r2 = r2.a()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            double r16 = r2.doubleValue()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0be5
            android.content.Context r2 = r1.h     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            wtz r2 = defpackage.wtz.a((android.content.Context) r2)     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            xfs r14 = defpackage.xhk.a     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            java.lang.Object r14 = r14.a()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            boolean r14 = r14.booleanValue()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            if (r14 == 0) goto L_0x0bc8
            int r14 = r2.f()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            r25 = r14
            goto L_0x0bca
        L_0x0bc8:
            r25 = 0
        L_0x0bca:
            wml r15 = defpackage.wml.a()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            long r16 = r2.c((java.lang.String) r10)     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            long r18 = r2.c((java.lang.String) r8)     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            long r20 = r2.c((java.lang.String) r6)     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            long r22 = r2.c((java.lang.String) r7)     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            int r24 = r2.e()     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
            r15.a(r16, r18, r20, r22, r24, r25)     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
        L_0x0be5:
            throw r5     // Catch:{ xsa -> 0x0be8, all -> 0x0be6 }
        L_0x0be6:
            r0 = move-exception
            goto L_0x0c11
        L_0x0be8:
            r0 = move-exception
            goto L_0x0c1e
        L_0x0bea:
            r0 = move-exception
            r4 = r52
            r3 = r21
            r9 = r25
        L_0x0bf1:
            r11 = r29
            goto L_0x0c11
        L_0x0bf4:
            r0 = move-exception
            r4 = r52
            r3 = r21
            r9 = r25
        L_0x0bfb:
            r11 = r29
            goto L_0x0c1d
        L_0x0bfe:
            r0 = move-exception
            r4 = r52
            r11 = r10
            goto L_0x0c0d
        L_0x0c03:
            r0 = move-exception
            r4 = r52
            r11 = r10
            goto L_0x0c19
        L_0x0c08:
            r0 = move-exception
            r11 = r50
            r4 = r52
        L_0x0c0d:
            r1 = r14
            r9 = r15
            r3 = r21
        L_0x0c11:
            r2 = r0
        L_0x0c12:
            r13 = 0
            goto L_0x0c22
        L_0x0c14:
            r0 = move-exception
            r11 = r50
            r4 = r52
        L_0x0c19:
            r1 = r14
            r9 = r15
            r3 = r21
        L_0x0c1d:
            r13 = 1
        L_0x0c1e:
            r2 = r0
        L_0x0c1f:
            throw r2     // Catch:{ all -> 0x0c20 }
        L_0x0c20:
            r0 = move-exception
            r2 = r0
        L_0x0c22:
            jiq r5 = r1.i     // Catch:{ izv -> 0x0c59 }
            long r5 = r5.a()     // Catch:{ izv -> 0x0c59 }
            boolean r7 = r1.l     // Catch:{ izv -> 0x0c59 }
            if (r7 != 0) goto L_0x0c45
            boolean r7 = defpackage.ayws.f()     // Catch:{ izv -> 0x0c59 }
            if (r7 != 0) goto L_0x0c33
            goto L_0x0c38
        L_0x0c33:
            int r7 = r1.w     // Catch:{ izv -> 0x0c59 }
            defpackage.xej.a((int) r7)     // Catch:{ izv -> 0x0c59 }
        L_0x0c38:
            xfb r7 = r1.d     // Catch:{ izv -> 0x0c59 }
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch:{ izv -> 0x0c59 }
            r10 = 0
            r7.a(r10, r11, r8)     // Catch:{ izv -> 0x0c59 }
            r1.a((boolean) r10, (boolean) r13)     // Catch:{ izv -> 0x0c59 }
        L_0x0c45:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ izv -> 0x0c59 }
            long r5 = r5 - r11
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ izv -> 0x0c59 }
            defpackage.xdt.a((java.lang.String) r9, (java.lang.String) r3, (java.lang.Object) r7, (java.lang.Object) r5)     // Catch:{ izv -> 0x0c59 }
            android.content.Context r3 = r1.h     // Catch:{ izv -> 0x0c59 }
            r1.a((android.content.Context) r3)     // Catch:{ izv -> 0x0c59 }
            throw r2     // Catch:{ izv -> 0x0c59 }
        L_0x0c59:
            r0 = move-exception
            goto L_0x0c66
        L_0x0c5b:
            r0 = move-exception
            r4 = r52
        L_0x0c5e:
            r5 = r46
        L_0x0c60:
            r1 = r0
            goto L_0x0c7b
        L_0x0c62:
            r0 = move-exception
            r4 = r52
            r9 = r15
        L_0x0c66:
            r1 = r0
        L_0x0c67:
            java.lang.String r2 = "Cancelled in volley"
            r3 = 0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0c79 }
            r5 = r46
            defpackage.wus.a((android.content.Context) r5, (java.lang.String) r9, (java.lang.String) r3, (java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0c77 }
            xsa r1 = new xsa     // Catch:{ all -> 0x0c77 }
            r1.<init>()     // Catch:{ all -> 0x0c77 }
            throw r1     // Catch:{ all -> 0x0c77 }
        L_0x0c77:
            r0 = move-exception
            goto L_0x0c60
        L_0x0c79:
            r0 = move-exception
            goto L_0x0c5e
        L_0x0c7b:
            defpackage.xip.a()
            xfs r2 = defpackage.xhu.a
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0c92
            int r2 = a((android.content.Context) r46, (java.lang.String) r47, (java.lang.String) r48)
            r4.Z = r2
        L_0x0c92:
            goto L_0x0c94
        L_0x0c93:
            throw r1
        L_0x0c94:
            goto L_0x0c93
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xen.a(android.content.Context, java.lang.String, java.lang.String, int, android.content.SyncResult, xsb, wmn, android.os.Bundle, boolean, boolean, boolean, amri):void");
    }

    private final void a(String str, boolean z) {
        String str2;
        xem xem;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!aywy.a.a().cx()) {
            this.d.b("people_page");
        }
        if (isEmpty) {
            str2 = this.d.a("people_page");
        } else {
            str2 = null;
        }
        boolean z2 = !TextUtils.isEmpty(str2);
        if (isEmpty) {
            xem = new xel(this, z, z2);
        } else {
            xem = new xek(this, z, z2);
        }
        wmn wmn = this.a;
        wmn.k = true;
        if (isEmpty) {
            wmn.g = true;
            xfb xfb = this.d;
            xfb.a("people", (String) null);
            xfb.a("gaiamap", (String) null);
            xfb.a("autocomplete", (String) null);
            this.a.f = !TextUtils.isEmpty(str2);
            a(xem, str, str2);
            return;
        }
        a(xem, str, (String) null);
    }

    private final void a(xem xem, String str, String str2) {
        xdx xdx;
        ArrayList arrayList;
        String str3;
        int i2;
        xdx xdx2;
        Boolean bool;
        xva xva;
        String str4;
        String str5;
        boolean z;
        xem xem2 = xem;
        String str6 = str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!TextUtils.isEmpty(str2)) {
            wus.a(this.h, "PeopleSync", this.b, this.c, "Resume");
        }
        xip.a();
        boolean booleanValue = Boolean.valueOf(aywy.a.a().bO()).booleanValue();
        if (booleanValue) {
            xem.a();
        }
        a();
        zin zin = this.r;
        xpk xpk = this.p;
        if (aywy.a.a().cJ()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("gplusAutocomplete");
            arrayList2.add("chatAutocomplete");
            arrayList2.add("emailAutocomplete");
            if (aywy.a.a().cY()) {
                arrayList2.add("peopleAutocompleteSocial");
                arrayList2.add("fieldAutocompleteSocial");
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (aywy.p()) {
            str3 = "menagerie";
        } else {
            str3 = null;
        }
        if (wsq.b(this.h)) {
            i2 = (int) aywy.a.a().cP();
        } else {
            i2 = (int) aywy.a.a().cQ();
        }
        String c2 = ycm.c(aywy.a.a().m0do());
        if (aywy.a.a().cl()) {
            ybu ybu = this.t;
            if (ybu.b) {
                xdx2 = xdx;
                if (((long) ybu.c) >= aywy.a.a().ck()) {
                    z = false;
                    bool = Boolean.valueOf(z);
                }
            } else {
                xdx2 = xdx;
            }
            z = true;
            bool = Boolean.valueOf(z);
        } else {
            xdx2 = xdx;
            bool = null;
        }
        new xdx(zin, xpk, arrayList, str3, i2, c2, str, bool);
        if (!this.s) {
            xva = new xvb(xdx2, str6);
        } else {
            xva = new xuy(xdx2, str6);
        }
        do {
            a();
            long b2 = b();
            try {
                PeopleList peopleList = (PeopleList) xva.a();
                long b3 = b() - b2;
                wmn wmn = this.a;
                wmn.G += b3;
                if (this.f) {
                    wmn.N += b3;
                }
                a();
                if (booleanValue) {
                    xen xen = xem2.d;
                    long a2 = xen.f ? xen.g.a(TimeUnit.MILLISECONDS) : 0;
                    xem2.d.d.d();
                    try {
                        List list = peopleList.c;
                        int a3 = xeg.a(list);
                        for (int i3 = 0; i3 < a3; i3++) {
                            xem2.a((Person) list.get(i3));
                        }
                        xen xen2 = xem2.d;
                        xen2.e.a(xen2.b, xen2.c, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        xem2.d.d.f();
                        xem2.d.d.e();
                        xen xen3 = xem2.d;
                        if (xen3.f) {
                            xen3.a.D += xen3.g.a(TimeUnit.MILLISECONDS) - a2;
                        }
                        xem2.d.a();
                    } catch (Throwable th) {
                        xem2.d.d.e();
                        xen xen4 = xem2.d;
                        if (xen4.f) {
                            xen4.a.D += xen4.g.a(TimeUnit.MILLISECONDS) - a2;
                        }
                        throw th;
                    }
                }
                str4 = peopleList.e;
                str5 = peopleList.d;
                if (isEmpty) {
                    this.d.a("people_page", str5);
                    continue;
                }
            } catch (InterruptedException e2) {
                throw new xsa();
            } catch (Throwable th2) {
                long b4 = b() - b2;
                wmn wmn2 = this.a;
                wmn2.G += b4;
                if (this.f) {
                    wmn2.N += b4;
                }
                throw th2;
            }
        } while (str5 != null);
        if (booleanValue) {
            xem.b();
            xem2.d.d.a("autocomplete", str4);
        }
    }

    private final void a(boolean z, boolean z2) {
        if (z) {
            this.e.a(this.b, this.c, 32);
        } else if (!z2) {
            this.e.a(this.b, this.c, 64);
        } else {
            this.e.a(this.b, this.c, 128);
        }
        this.e.b();
    }

    public final void a() {
        this.k.b();
    }
}
