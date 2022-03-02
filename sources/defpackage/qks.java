package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: qks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qks {
    private static final qfn a = new qfn("UrlRouter");
    private static final qkt b = new qkt(0, (String) null, 0, 0, (String) null, (byte[]) null, (AppInfo) null, (Route) null, 1, false);
    private static final qkt c = new qkt(0, (String) null, 0, 0, (String) null, (byte[]) null, (AppInfo) null, (Route) null, 2, false);
    private final Context d;
    private final qjt e;
    private final qiz f;
    private final qlg g;
    private final qlc h;
    private final qjb i;
    private final qex j;
    private final qfg k;
    private final qkn l;
    private final int m;
    private final qeg n;
    private final qkb o;

    public qks(Context context, qjt qjt, qiz qiz, qlg qlg, qlc qlc, qjb qjb, qex qex, qfg qfg, int i2, qkn qkn, qeg qeg, qkb qkb) {
        this.d = context;
        this.e = qjt;
        this.f = qiz;
        this.g = qlg;
        this.h = qlc;
        this.i = qjb;
        this.j = qex;
        this.k = qfg;
        this.m = i2;
        this.l = qkn;
        this.n = qeg;
        this.o = qkb;
    }

    private static Route a(AppInfo appInfo, Uri uri) {
        for (Route route : appInfo.c) {
            String str = route.a;
            int i2 = route.b;
            String str2 = route.c;
            String str3 = route.d;
            String str4 = route.e;
            if (qlt.a(str, i2, str2, str3, str4, str4, uri)) {
                return route;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022a, code lost:
        if (defpackage.qfm.a(r1.d, a) != false) goto L_0x024d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.qkt b(java.lang.String r32, boolean r33, com.google.android.gms.instantapps.internal.RoutingOptions r34, defpackage.qlo r35, boolean r36) {
        /*
            r31 = this;
            r1 = r31
            r9 = r32
            r10 = r34
            r11 = r35
            qex r0 = r1.j
            qev r12 = r0.a()
            r13 = 5
            r14 = 2
            r15 = 1
            r8 = 0
            if (r36 != 0) goto L_0x0016
            goto L_0x00f8
        L_0x0016:
            qkb r0 = r1.o     // Catch:{ Exception -> 0x00ee }
            qjt r2 = r1.e     // Catch:{ Exception -> 0x00ee }
            qfg r3 = r1.k     // Catch:{ Exception -> 0x00ee }
            boolean r4 = defpackage.axvw.b()     // Catch:{ Exception -> 0x00ee }
            if (r4 == 0) goto L_0x00f8
            android.net.Uri r4 = android.net.Uri.parse(r32)     // Catch:{ Exception -> 0x00ee }
            if (r4 == 0) goto L_0x00e6
            java.lang.String r5 = r4.getHost()     // Catch:{ Exception -> 0x00ee }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00ee }
            if (r5 != 0) goto L_0x00e6
            java.lang.String r5 = r4.getHost()     // Catch:{ Exception -> 0x00ee }
            byte[][] r5 = defpackage.qlp.a(r5, r13)     // Catch:{ Exception -> 0x00ee }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ee }
            r6.<init>()     // Catch:{ Exception -> 0x00ee }
            int r7 = r5.length     // Catch:{ Exception -> 0x00ee }
            r13 = 0
        L_0x0041:
            if (r13 < r7) goto L_0x00ca
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x00ee }
            java.lang.String r4 = r4.getHost()     // Catch:{ Exception -> 0x00ee }
            r5[r8] = r4     // Catch:{ Exception -> 0x00ee }
            java.lang.String r4 = ","
            java.lang.String r4 = android.text.TextUtils.join(r4, r6)     // Catch:{ Exception -> 0x00ee }
            r5[r15] = r4     // Catch:{ Exception -> 0x00ee }
            ob r4 = new ob     // Catch:{ Exception -> 0x00ee }
            r4.<init>()     // Catch:{ Exception -> 0x00ee }
            ob r5 = new ob     // Catch:{ Exception -> 0x00ee }
            r5.<init>()     // Catch:{ Exception -> 0x00ee }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00ee }
        L_0x0061:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00ee }
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00ee }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x00ee }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x00ee }
            amri r13 = r0.a((int) r7)     // Catch:{ Exception -> 0x00ee }
            boolean r17 = r13.a()     // Catch:{ Exception -> 0x00ee }
            if (r17 == 0) goto L_0x0061
            java.lang.Object r13 = r13.b()     // Catch:{ Exception -> 0x00ee }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ Exception -> 0x00ee }
            boolean r13 = r13.isEmpty()     // Catch:{ Exception -> 0x00ee }
            if (r13 == 0) goto L_0x008f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00ee }
            r4.add(r7)     // Catch:{ Exception -> 0x00ee }
            goto L_0x0061
        L_0x008f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00ee }
            r5.add(r7)     // Catch:{ Exception -> 0x00ee }
            goto L_0x0061
        L_0x0097:
            boolean r0 = r4.isEmpty()     // Catch:{ Exception -> 0x00ee }
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x00ee }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "SecondPhaseIntentFilterFetcher.noMatchWithFullUrl"
            r12.a(r0)     // Catch:{ Exception -> 0x00ee }
            goto L_0x00f8
        L_0x00a9:
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x00ee }
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "SecondPhaseIntentFilterFetcher.possibleFirstPhaseMatchWithFullUrl"
            r12.a(r0)     // Catch:{ Exception -> 0x00ee }
        L_0x00b4:
            boolean r0 = r4.isEmpty()     // Catch:{ Exception -> 0x00ee }
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "SecondPhaseIntentFilterFetcher.secondPhaseMatchWithFullUrl"
            r12.a(r0)     // Catch:{ Exception -> 0x00ee }
        L_0x00bf:
            int r0 = r5.b     // Catch:{ Exception -> 0x00ee }
            int r6 = r4.b     // Catch:{ Exception -> 0x00ee }
            r3.b(r0, r6)     // Catch:{ Exception -> 0x00ee }
            defpackage.qko.a(r4, r5, r2)     // Catch:{ Exception -> 0x00ee }
            goto L_0x00f8
        L_0x00ca:
            r17 = r5[r13]     // Catch:{ Exception -> 0x00ee }
            java.nio.ByteBuffer r17 = java.nio.ByteBuffer.wrap(r17)     // Catch:{ Exception -> 0x00ee }
            java.nio.IntBuffer r14 = r17.asIntBuffer()     // Catch:{ Exception -> 0x00ee }
            int r14 = r14.get(r8)     // Catch:{ Exception -> 0x00ee }
            r14 = r14 & -4096(0xfffffffffffff000, float:NaN)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x00ee }
            r6.add(r14)     // Catch:{ Exception -> 0x00ee }
            int r13 = r13 + 1
            r14 = 2
            goto L_0x0041
        L_0x00e6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x00ee }
            java.lang.String r2 = "invalid url to fetch intent filters."
            r0.<init>(r2)     // Catch:{ Exception -> 0x00ee }
            throw r0     // Catch:{ Exception -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            android.content.Context r2 = r1.d
            qfn r3 = a
            java.lang.String r4 = "Error in scheduling GetIntentFilters."
            defpackage.qfp.a(r2, r4, r0, r3)
        L_0x00f8:
            java.lang.String r0 = r10.b
            java.lang.String r2 = ""
            r13 = 3
            r14 = 0
            if (r0 != 0) goto L_0x01e3
            boolean r0 = defpackage.axvt.b()
            if (r0 == 0) goto L_0x0175
            boolean r0 = defpackage.qlv.a(r32)
            if (r0 != 0) goto L_0x010f
            r13 = 0
            goto L_0x0176
        L_0x010f:
            boolean r0 = android.text.TextUtils.isEmpty(r32)
            if (r0 != 0) goto L_0x0163
            java.util.regex.Pattern r0 = defpackage.qlv.a
            java.util.regex.Matcher r3 = r0.matcher(r9)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L_0x0163
            java.lang.String r4 = r3.group(r15)
            r5 = 2
            java.lang.String r0 = r3.group(r5)     // Catch:{ NumberFormatException -> 0x0130 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0130 }
            r5 = r0
            goto L_0x0132
        L_0x0130:
            r0 = move-exception
            r5 = 0
        L_0x0132:
            java.lang.String r0 = r3.group(r13)     // Catch:{ NumberFormatException -> 0x013d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x013d }
            r6 = r0
            goto L_0x013f
        L_0x013d:
            r0 = move-exception
            r6 = 0
        L_0x013f:
            r0 = 4
            java.lang.String r0 = r3.group(r0)
            java.lang.String r7 = "-"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x014e
            r7 = r0
            goto L_0x014f
        L_0x014e:
            r7 = r2
        L_0x014f:
            r2 = 5
            java.lang.String r0 = r3.group(r2)
            qlu r17 = new qlu
            r2 = r17
            r3 = r32
            r13 = 0
            r8 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = r17
            goto L_0x0165
        L_0x0163:
            r13 = 0
            r0 = r14
        L_0x0165:
            java.lang.String r2 = r0.b
            int r3 = r0.c
            int r4 = r0.d
            java.lang.String r5 = r0.e
            java.lang.String r0 = r0.f
            qkq r0 = defpackage.qkq.a(r2, r3, r4, r5, r0)
            goto L_0x01e8
        L_0x0175:
            r13 = 0
        L_0x0176:
            r0 = 1410(0x582, float:1.976E-42)
            r11.a(r0)
            qjt r0 = r1.e
            r2 = r33
            qjw r0 = r0.a((java.lang.String) r9, (boolean) r2)
            r2 = 1411(0x583, float:1.977E-42)
            r11.a(r2)
            int r2 = r0.a
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r13] = r5
            r4[r15] = r9
            if (r2 != r3) goto L_0x01b6
            boolean r2 = r10.d
            if (r2 != 0) goto L_0x01cd
            qfn r0 = a
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r3 = "No match in domain filter due to mobile holdback"
            r0.c(r3, r2)
            qfg r0 = r1.k
            r0.a(r13)
            qkq r0 = new qkq
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x01e9
        L_0x01b6:
            if (r2 == 0) goto L_0x01cd
            qkq r0 = new qkq
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r2 = r0
            goto L_0x01e9
        L_0x01cd:
            java.lang.String r2 = r0.a()
            int r3 = r0.b()
            int r4 = r0.c()
            java.lang.String r0 = r0.d()
            qkq r0 = defpackage.qkq.a(r2, r3, r4, r0, r14)
            r2 = r0
            goto L_0x01e9
        L_0x01e3:
            r13 = 0
            qkq r0 = defpackage.qkq.a(r0, r13, r13, r2, r14)
        L_0x01e8:
            r2 = r0
        L_0x01e9:
            int r0 = r2.a
            r3 = 2
            if (r0 == r3) goto L_0x0590
            if (r0 == r15) goto L_0x0587
            java.lang.String r4 = r2.b
            int r5 = r2.c
            int r6 = r2.d
            java.lang.String r7 = r2.e
            boolean r0 = r10.c
            if (r0 == 0) goto L_0x0202
            qkr r0 = defpackage.qkr.a(r15)
            r3 = r0
            goto L_0x0252
        L_0x0202:
            qlg r0 = r1.g
            int r3 = r0.a()
            if (r3 != r15) goto L_0x020b
            goto L_0x024d
        L_0x020b:
            r8 = 2
            if (r3 == r8) goto L_0x024d
            r8 = 3
            if (r3 != r8) goto L_0x022e
            axuy r0 = defpackage.axuy.a     // Catch:{ NameNotFoundException -> 0x022d }
            axuz r0 = r0.a()     // Catch:{ NameNotFoundException -> 0x022d }
            boolean r0 = r0.b()     // Catch:{ NameNotFoundException -> 0x022d }
            if (r0 != 0) goto L_0x021e
            goto L_0x022e
        L_0x021e:
            int r0 = r1.m     // Catch:{ NameNotFoundException -> 0x022d }
            if (r0 != 0) goto L_0x022e
            android.content.Context r0 = r1.d     // Catch:{ NameNotFoundException -> 0x022d }
            qfn r8 = a     // Catch:{ NameNotFoundException -> 0x022d }
            boolean r0 = defpackage.qfm.a(r0, r8)     // Catch:{ NameNotFoundException -> 0x022d }
            if (r0 == 0) goto L_0x022e
            goto L_0x024d
        L_0x022d:
            r0 = move-exception
        L_0x022e:
            qlc r0 = r1.h
            android.accounts.Account[] r0 = r0.d()
            if (r0 != 0) goto L_0x0237
            goto L_0x0240
        L_0x0237:
            int r0 = r0.length
            if (r0 == 0) goto L_0x0240
            qfg r0 = r1.k
            r0.a(r15)
            goto L_0x0246
        L_0x0240:
            qfg r0 = r1.k
            r8 = 2
            r0.a(r8)
        L_0x0246:
            qkr r0 = new qkr
            r0.<init>(r3, r15)
            r3 = r0
            goto L_0x0252
        L_0x024d:
            qkr r0 = defpackage.qkr.a(r3)
            r3 = r0
        L_0x0252:
            boolean r0 = r3.b
            if (r0 != 0) goto L_0x057e
            boolean r0 = r10.f
            if (r0 == 0) goto L_0x0266
            qkp r0 = new qkp
            r0.<init>(r15, r14, r14, r14)
            r2 = r0
            r23 = r6
            r22 = r7
            goto L_0x03cb
        L_0x0266:
            int r0 = r3.a
            qkn r8 = r1.l
            boolean r8 = r8.a()
            java.lang.String r14 = "UrlRouter.disallowedNetwork"
            if (r0 != r15) goto L_0x036c
            qlh r0 = defpackage.qli.i()
            java.lang.String r13 = r2.b
            r0.a((java.lang.String) r13)
            int r13 = r2.c
            r0.b((int) r13)
            int r13 = r2.d
            r0.a((int) r13)
            r0.a = r11
            boolean r13 = r10.g
            r13 = r13 ^ r15
            r0.b((boolean) r13)
            boolean r13 = defpackage.axvt.b()
            if (r13 == 0) goto L_0x02a2
            java.lang.String r13 = r2.f
            r0.c = r13
            java.lang.String r13 = r2.e
            r0.b = r13
            boolean r13 = defpackage.qlv.a(r32)
            r0.a((boolean) r13)
        L_0x02a2:
            qli r0 = r0.a()
            boolean r13 = r10.a
            if (r13 != 0) goto L_0x02ab
            goto L_0x02ee
        L_0x02ab:
            if (r8 == 0) goto L_0x02ee
            r8 = 1412(0x584, float:1.979E-42)
            r11.a(r8)
            qex r8 = r1.j
            qev r8 = r8.a()
            qjb r13 = r1.i
            com.google.android.gms.instantapps.internal.AppInfo r0 = r13.a(r0)
            java.lang.String r13 = "UrlRouter.getAppInfo"
            r8.a(r13)
            r8 = 1413(0x585, float:1.98E-42)
            r11.a(r8)
            if (r0 != 0) goto L_0x02e9
            qfn r0 = a
            r2 = 0
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r2 = "Url resolved to instant app, but no app info is available"
            r0.b(r2, r8)
            qfg r0 = r1.k
            r2 = 6
            r0.a(r2)
            java.lang.String r0 = "UrlRouter.noAppInfo"
            r12.a(r0)
            qkp r0 = defpackage.qkp.a()
            r23 = r6
            r22 = r7
            goto L_0x03c3
        L_0x02e9:
            r23 = r6
            r22 = r7
            goto L_0x0339
        L_0x02ee:
            qex r13 = r1.j
            qev r13 = r13.a()
            qjb r15 = r1.i
            r22 = r7
            android.content.Context r7 = r15.a
            java.util.List r7 = defpackage.qlm.a(r7)
            r23 = r6
            android.content.Context r6 = r15.a
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.densityDpi
            com.google.android.gms.instantapps.internal.AppInfo r0 = r15.a(r0, r7, r6)
            java.lang.String r6 = "UrlRouter.getAppInfoFromCache"
            r13.a(r6)
            if (r0 == 0) goto L_0x0318
            goto L_0x0339
        L_0x0318:
            if (r8 != 0) goto L_0x0339
            qfn r0 = a
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r2 = "Unable to launch: disallowed network"
            r0.b(r2, r6)
            r0 = 1428(0x594, float:2.001E-42)
            r11.a(r0)
            qfg r0 = r1.k
            r2 = 19
            r0.a(r2)
            r12.a(r14)
            qkp r0 = defpackage.qkp.a()
            goto L_0x03c3
        L_0x0339:
            int r6 = r1.m
            if (r6 == 0) goto L_0x033f
            r6 = 0
            goto L_0x036b
        L_0x033f:
            if (r0 == 0) goto L_0x036a
            android.net.Uri r6 = android.net.Uri.parse(r32)
            com.google.android.gms.instantapps.internal.Route r6 = a(r0, r6)
            if (r6 != 0) goto L_0x036b
            qfn r0 = a
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r2 = r2.b
            r6 = 0
            r7[r6] = r2
            java.lang.String r2 = "Path didn't match for instant app %s"
            r0.c(r2, r7)
            qfg r0 = r1.k
            r2 = 7
            r0.a(r2)
            java.lang.String r0 = "UrlRouter.noPathMatch"
            r12.a(r0)
            qkp r0 = defpackage.qkp.a()
            goto L_0x03c3
        L_0x036a:
            r6 = 0
        L_0x036b:
            goto L_0x0388
        L_0x036c:
            r23 = r6
            r22 = r7
            if (r8 != 0) goto L_0x0386
            r0 = 1428(0x594, float:2.001E-42)
            r11.a(r0)
            qfg r0 = r1.k
            r2 = 19
            r0.a(r2)
            r12.a(r14)
            qkp r0 = defpackage.qkp.a()
            goto L_0x03c3
        L_0x0386:
            r0 = 0
            r6 = 0
        L_0x0388:
            qjt r7 = r1.e     // Catch:{ IOException -> 0x0398 }
            java.lang.String r8 = r2.b     // Catch:{ IOException -> 0x0398 }
            byte[] r2 = r7.b((java.lang.String) r8)     // Catch:{ IOException -> 0x0398 }
            qkp r7 = new qkp
            r8 = 1
            r7.<init>(r8, r0, r6, r2)
            r0 = r7
            goto L_0x03c3
        L_0x0398:
            r0 = move-exception
            android.content.Context r6 = r1.d
            java.lang.String r2 = r2.b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r7 = "Unable to fetch domain filter metadata for "
            int r8 = r2.length()
            if (r8 != 0) goto L_0x03af
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            goto L_0x03b3
        L_0x03af:
            java.lang.String r2 = r7.concat(r2)
        L_0x03b3:
            qfn r7 = a
            defpackage.qfp.a(r6, r2, r0, r7)
            qfg r0 = r1.k
            r2 = 14
            r0.a(r2)
            qkp r0 = defpackage.qkp.a()
        L_0x03c3:
            boolean r2 = r0.a
            if (r2 != 0) goto L_0x03ca
            qkt r0 = b
            return r0
        L_0x03ca:
            r2 = r0
        L_0x03cb:
            r0 = 1416(0x588, float:1.984E-42)
            r11.a(r0)
            android.content.Context r0 = r1.d
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = defpackage.qjz.a(r0, r4)
            r6 = 1417(0x589, float:1.986E-42)
            r11.a(r6)
            if (r0 != 0) goto L_0x0562
            boolean r0 = r10.e
            if (r0 == 0) goto L_0x03e7
            r13 = 0
            goto L_0x040b
        L_0x03e7:
            if (r4 == 0) goto L_0x040a
            qiz r0 = r1.f     // Catch:{ IOException -> 0x03fc }
            boolean r8 = r0.i(r4)     // Catch:{ IOException -> 0x03fc }
            if (r8 == 0) goto L_0x03fa
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x03f8 }
            r6 = 0
            r0[r6] = r4     // Catch:{ IOException -> 0x03f8 }
            goto L_0x03fa
        L_0x03f8:
            r0 = move-exception
            goto L_0x03fe
        L_0x03fa:
            r13 = r8
            goto L_0x040b
        L_0x03fc:
            r0 = move-exception
            r8 = 0
        L_0x03fe:
            qfn r6 = a
            r7 = 0
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.String r7 = "getUserPrefersBrowser"
            r6.a(r0, r7, r10)
            r13 = r8
            goto L_0x040b
        L_0x040a:
            r13 = 0
        L_0x040b:
            if (r13 == 0) goto L_0x0414
            qfg r0 = r1.k
            r6 = 3
            r0.a(r6)
            goto L_0x0415
        L_0x0414:
            r6 = 3
        L_0x0415:
            int r0 = r1.m
            if (r0 != 0) goto L_0x0458
            r0 = 1418(0x58a, float:1.987E-42)
            r11.a(r0)     // Catch:{ NameNotFoundException -> 0x0454 }
            android.content.Context r0 = r1.d     // Catch:{ NameNotFoundException -> 0x0454 }
            qfn r7 = a     // Catch:{ NameNotFoundException -> 0x0454 }
            boolean r0 = defpackage.qfm.a(r0, r7)     // Catch:{ NameNotFoundException -> 0x0454 }
            if (r0 == 0) goto L_0x0439
            android.content.Context r7 = r1.d     // Catch:{ NameNotFoundException -> 0x0454 }
            r14 = 0
            r8 = 0
            android.content.Intent r8 = defpackage.qfj.a(r9, r8, r14)     // Catch:{ NameNotFoundException -> 0x0454 }
            boolean r7 = defpackage.qfj.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x0454 }
            if (r7 == 0) goto L_0x0439
            r8 = 1
            goto L_0x043a
        L_0x0439:
            r8 = 0
        L_0x043a:
            if (r8 != 0) goto L_0x044d
            qfn r7 = a     // Catch:{ NameNotFoundException -> 0x0454 }
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ NameNotFoundException -> 0x0454 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0454 }
            r9 = 0
            r10[r9] = r0     // Catch:{ NameNotFoundException -> 0x0454 }
            java.lang.String r0 = "Unable to launch supervisor, compatible = %s"
            r7.b(r0, r10)     // Catch:{ NameNotFoundException -> 0x0454 }
        L_0x044d:
            r0 = 1419(0x58b, float:1.988E-42)
            r11.a(r0)     // Catch:{ NameNotFoundException -> 0x0454 }
            r0 = 1
            goto L_0x045a
        L_0x0454:
            r0 = move-exception
            r0 = 0
            r8 = 0
            goto L_0x045a
        L_0x0458:
            r0 = 0
            r8 = 0
        L_0x045a:
            int r7 = r1.m
            r9 = 1
            if (r7 != r9) goto L_0x0460
            goto L_0x04d0
        L_0x0460:
            if (r8 != 0) goto L_0x04d0
            if (r0 == 0) goto L_0x0465
            goto L_0x04a2
        L_0x0465:
            boolean r0 = defpackage.axvn.b()
            if (r0 == 0) goto L_0x04a2
            qfn r0 = a
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = "Target destination: Reinstall Runtime"
            r0.b(r2, r3)
            qfg r0 = r1.k
            r2 = 11
            r0.a(r2)
            java.lang.String r0 = "UrlRouter.reinstallRuntime"
            r12.a(r0)
            if (r13 != 0) goto L_0x0486
            r29 = 0
            goto L_0x0488
        L_0x0486:
            r29 = 3
        L_0x0488:
            qkt r0 = new qkt
            r21 = 3
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        L_0x04a2:
            qfn r0 = a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Target destination: Unavailable Runtime"
            r0.b(r3, r2)
            qfg r0 = r1.k
            r2 = 5
            r0.a(r2)
            java.lang.String r0 = "UrlRouter.noRuntime"
            r12.a(r0)
            qkt r0 = new qkt
            r14 = 4
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x04d0:
            int r0 = r3.a
            r3 = 1
            if (r0 == r3) goto L_0x0546
            r3 = 2
            if (r0 == r3) goto L_0x050f
            qfn r0 = a
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r3 = "Target destination: Opt-In Interception"
            r0.a(r3, r7)
            qfg r0 = r1.k
            r3 = 12
            r0.a(r3)
            java.lang.String r0 = "UrlRouter.optInIntercept"
            r12.a(r0)
            byte[] r0 = r2.d
            if (r13 != 0) goto L_0x04f5
            r26 = 0
            goto L_0x04f7
        L_0x04f5:
            r26 = 3
        L_0x04f7:
            qkt r2 = new qkt
            r18 = 0
            r24 = 0
            r25 = 0
            r27 = 1
            r17 = r2
            r19 = r4
            r20 = r5
            r21 = r23
            r23 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r2
        L_0x050f:
            qfn r0 = a
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r3 = "Target destination: Opt-in"
            r0.a(r3, r7)
            qfg r0 = r1.k
            r3 = 10
            r0.a(r3)
            java.lang.String r0 = "UrlRouter.optIn"
            r12.a(r0)
            byte[] r0 = r2.d
            if (r13 != 0) goto L_0x052c
            r26 = 0
            goto L_0x052e
        L_0x052c:
            r26 = 3
        L_0x052e:
            qkt r2 = new qkt
            r18 = 1
            r24 = 0
            r25 = 0
            r27 = 0
            r17 = r2
            r19 = r4
            r20 = r5
            r21 = r23
            r23 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r2
        L_0x0546:
            qfg r0 = r1.k
            r3 = 9
            r0.a(r3)
            java.lang.String r0 = "UrlRouter.instantApp"
            r12.a(r0)
            byte[] r8 = r2.d
            com.google.android.gms.instantapps.internal.AppInfo r9 = r2.b
            com.google.android.gms.instantapps.internal.Route r10 = r2.c
            r6 = r23
            r7 = r22
            r11 = r13
            qkt r0 = defpackage.qkt.a(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0562:
            qfn r0 = a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.String r3 = "Installed app present: %s"
            r0.c(r3, r2)
            qfg r0 = r1.k
            r2 = 8
            r0.a(r2)
            java.lang.String r0 = "UrlRouter.appInstalled"
            r12.a(r0)
            qkt r0 = b
            return r0
        L_0x057e:
            java.lang.String r0 = "UrlRouter.notOptedIn"
            r12.a(r0)
            qkt r0 = b
            return r0
        L_0x0587:
            java.lang.String r0 = "UrlRouter.noMatch"
            r12.a(r0)
            qkt r0 = b
            return r0
        L_0x0590:
            java.lang.String r0 = "UrlRouter.holdback"
            r12.a(r0)
            qkt r0 = c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qks.b(java.lang.String, boolean, com.google.android.gms.instantapps.internal.RoutingOptions, qlo, boolean):qkt");
    }

    public final qkt a(String str, boolean z, RoutingOptions routingOptions, qlo qlo, boolean z2) {
        AppInfo appInfo;
        Route route;
        if (!axuy.a.a().N() || !this.n.a()) {
            return b(str, z, routingOptions, qlo, z2);
        }
        qjw a2 = this.e.a(str, z);
        if (!a2.b) {
            return b(str, z, routingOptions, qlo, z2);
        }
        String a3 = a2.a();
        int b2 = a2.b();
        int c2 = a2.c();
        if (routingOptions.a) {
            qlh i2 = qli.i();
            i2.a(a3);
            i2.b(b2);
            i2.a(c2);
            i2.a = qlo;
            i2.b(!routingOptions.g);
            AppInfo a4 = this.i.a(i2.a());
            if (a4 == null) {
                String valueOf = String.valueOf(a3);
                String str2 = valueOf.length() == 0 ? new String("No app info for sideloaded app ") : "No app info for sideloaded app ".concat(valueOf);
                qfp.a(this.d, str2, new IllegalStateException(str2), a);
                this.k.a(18);
                return b;
            }
            appInfo = a4;
        } else {
            appInfo = null;
        }
        if (appInfo != null) {
            route = a(appInfo, Uri.parse(str));
        } else {
            route = null;
        }
        this.k.a(17);
        return qkt.a(a3, b2, c2, a2.d(), new byte[0], appInfo, route, false);
    }
}
