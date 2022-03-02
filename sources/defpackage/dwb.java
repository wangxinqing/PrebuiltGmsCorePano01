package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.appinvite.AppInviteIntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.List;
import java.util.Map;

/* renamed from: dwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwb extends jba {
    public final long a = AppInviteIntentOperation.a();
    private final Context d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final Map k;
    private final String l;
    private final String m;
    private final List n;
    private final String o;
    private final String p;
    private final Uri q;
    private final Bitmap r;
    private final String s;
    private final String t;
    private final int u;
    private final dwj v;
    private final dwd w;
    private dlc x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dwb(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map map, String str7, String str8, List list, String str9, String str10, Uri uri, Bitmap bitmap, String str11, String str12, int i2) {
        super(0, "AppInviteSend");
        PackageInfo packageInfo;
        String str13;
        String str14 = str7;
        dwd dwd = new dwd(context);
        dwj a2 = dwj.a(context);
        this.d = context;
        this.f = str;
        this.e = str2;
        this.g = str3;
        this.i = str4;
        this.h = str5;
        this.j = str6;
        this.k = map;
        this.l = str14;
        this.m = str8;
        this.n = list;
        this.o = str9;
        this.p = str10;
        this.q = uri;
        this.r = bitmap;
        this.s = str11;
        this.t = str12;
        this.u = i2;
        this.w = dwd;
        this.v = a2;
        if (!TextUtils.isEmpty(str7)) {
            dlc a3 = this.w.a();
            this.x = a3;
            dwd.a(a3, str14);
            PackageManager packageManager = this.d.getPackageManager();
            String str15 = null;
            try {
                packageInfo = packageManager.getPackageInfo(this.f, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                String str16 = packageInfo.versionName;
                str15 = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                str13 = str16;
            } else {
                str13 = null;
            }
            dlc dlc = this.x;
            String str17 = this.f;
            if (!TextUtils.isEmpty(str15)) {
                dlc.a("&an", str15);
            }
            if (!TextUtils.isEmpty(str17)) {
                dlc.a("&aid", str17);
            }
            if (!TextUtils.isEmpty(str13)) {
                dlc.a("&av", str13);
            }
        }
    }

    private final void a(Exception exc) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("appOperationCode", this.a);
        if (exc instanceof dvy) {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 1);
            intent.putExtra("com.google.android.gms.appinvite.errorCode", ((dvy) exc).a);
        } else if (exc instanceof VolleyError) {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 2);
        } else if (exc instanceof UserRecoverableAuthException) {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 3);
            intent.putExtra("com.google.android.gms.appinvite.authIntent", ((UserRecoverableAuthException) exc).a());
        } else if (exc instanceof eif) {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 3);
        } else {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 0);
        }
        AppInviteIntentOperation.a(this.a, intent);
        this.d.sendBroadcast(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0082 A[Catch:{ VolleyError | dvy | eif -> 0x033d }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x007b A[Catch:{ VolleyError | dvy | eif -> 0x033d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r29) {
        /*
            r28 = this;
            r1 = r28
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r2 = r1.e
            java.lang.String r3 = "com.google"
            r0.<init>(r2, r3)
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "https://www.googleapis.com/auth/plus.native"
            r5 = 0
            r3[r5] = r4
            com.google.android.gms.common.internal.ClientContext r7 = new com.google.android.gms.common.internal.ClientContext
            r7.<init>()
            int r4 = android.os.Process.myUid()
            r7.b = r4
            r7.d = r0
            r7.c = r0
            java.lang.String r0 = r1.f
            r7.e = r0
            android.content.Context r0 = r1.d
            java.lang.String r0 = r0.getPackageName()
            r7.f = r0
            r7.a((java.lang.String[]) r3)
            android.graphics.Bitmap r0 = r1.r
            if (r0 == 0) goto L_0x005d
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap r4 = r1.r
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG
            r8 = 100
            boolean r4 = r4.compress(r6, r8, r0)
            if (r4 == 0) goto L_0x005d
            byte[] r0 = r0.toByteArray()
            android.graphics.Bitmap r4 = r1.r
            int r4 = r4.getWidth()
            android.graphics.Bitmap r6 = r1.r
            int r6 = r6.getHeight()
            r21 = r0
            r23 = r4
            r22 = r6
            goto L_0x0063
        L_0x005d:
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0063:
            dwj r6 = r1.v     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.lang.String r8 = r1.g     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.lang.String r9 = r1.i     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.lang.String r10 = r1.h     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.lang.String r12 = r1.j     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.util.Map r13 = r1.k     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.util.List r0 = r1.n     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.lang.String r4 = r1.l     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.lang.String r15 = r1.o     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.lang.String r14 = r1.p     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            android.net.Uri r11 = r1.q     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            if (r11 == 0) goto L_0x0082
            java.lang.String r11 = r11.toString()     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            r20 = r11
            goto L_0x0084
        L_0x0082:
            r20 = 0
        L_0x0084:
            r11 = 0
            r16 = 0
            r17 = 0
            java.lang.String r3 = r1.s     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            java.lang.String r5 = r1.t     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            int r2 = r1.u     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            r18 = r15
            java.lang.String r15 = r1.m     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            r19 = r14
            r14 = r16
            r27 = r15
            r15 = r17
            r16 = r0
            r17 = r4
            r24 = r3
            r25 = r5
            r26 = r2
            avfk r0 = r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ eif -> 0x0341, VolleyError -> 0x033f, dvy -> 0x033d }
            if (r0 == 0) goto L_0x0337
            avga r2 = r0.b
            if (r2 != 0) goto L_0x00b1
            avga r2 = defpackage.avga.c
        L_0x00b1:
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            goto L_0x019b
        L_0x00b6:
            int r3 = r2.a
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x019a
            avft r3 = r2.b
            if (r3 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            avft r3 = defpackage.avft.c
        L_0x00c3:
            aucx r3 = r3.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0198
            avft r3 = r2.b
            if (r3 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            avft r3 = defpackage.avft.c
        L_0x00d2:
            r4 = 5
            java.lang.Object r5 = r3.c(r4)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r3)
            boolean r3 = r5.c
            if (r3 == 0) goto L_0x00e7
            r5.c()
            r3 = 0
            r5.c = r3
        L_0x00e7:
            aucj r3 = r5.b
            avft r3 = (defpackage.avft) r3
            aucx r6 = defpackage.aucj.s()
            r3.b = r6
            avft r3 = r2.b
            if (r3 == 0) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            avft r3 = defpackage.avft.c
        L_0x00f8:
            aucx r3 = r3.b
            int r6 = r3.size()
            r7 = 0
        L_0x00ff:
            if (r7 >= r6) goto L_0x0161
            java.lang.Object r8 = r3.get(r7)
            avfu r8 = (defpackage.avfu) r8
            aucx r9 = r8.f
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x0137
            aucx r9 = r8.f
            r10 = 0
            java.lang.Object r9 = r9.get(r10)
            avfs r9 = (defpackage.avfs) r9
            java.lang.String r9 = r9.b
            java.lang.String r10 = "Sms"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0137
            java.lang.String r9 = r8.c
            java.lang.String r10 = "Sent"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0137
            java.lang.String r9 = r8.b
            java.lang.String r10 = "Invitation"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0137
            goto L_0x015e
        L_0x0137:
            boolean r9 = r5.c
            if (r9 != 0) goto L_0x013c
            goto L_0x0142
        L_0x013c:
            r5.c()
            r9 = 0
            r5.c = r9
        L_0x0142:
            aucj r9 = r5.b
            avft r9 = (defpackage.avft) r9
            r8.getClass()
            aucx r10 = r9.b
            boolean r10 = r10.a()
            if (r10 != 0) goto L_0x0159
            aucx r10 = r9.b
            aucx r10 = defpackage.aucj.a((defpackage.aucx) r10)
            r9.b = r10
        L_0x0159:
            aucx r9 = r9.b
            r9.add(r8)
        L_0x015e:
            int r7 = r7 + 1
            goto L_0x00ff
        L_0x0161:
            java.lang.Object r3 = r2.c(r4)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r2)
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x0171
            r2 = 0
            goto L_0x0177
        L_0x0171:
            r3.c()
            r2 = 0
            r3.c = r2
        L_0x0177:
            aucj r4 = r3.b
            avga r4 = (defpackage.avga) r4
            aucj r5 = r5.i()
            avft r5 = (defpackage.avft) r5
            r5.getClass()
            r4.b = r5
            int r5 = r4.a
            r6 = 1
            r5 = r5 | r6
            r4.a = r5
            aucj r3 = r3.i()
            avga r3 = (defpackage.avga) r3
            dlc r4 = r1.x
            defpackage.dwd.a((defpackage.dlc) r4, (defpackage.avga) r3)
            goto L_0x019b
        L_0x0198:
            r2 = 0
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            aucx r3 = r0.a
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x01a8
            r2 = 0
            r1.a((java.lang.Exception) r2)
            return
        L_0x01a8:
            int r0 = r3.size()
            java.lang.String[] r4 = new java.lang.String[r0]
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L_0x01be:
            int r0 = r3.size()
            if (r8 >= r0) goto L_0x02d5
            java.lang.Object r0 = r3.get(r8)
            avfy r0 = (defpackage.avfy) r0
            avgm r0 = r0.c
            if (r0 != 0) goto L_0x01d2
            avgm r0 = defpackage.avgm.e
            r9 = r0
            goto L_0x01d3
        L_0x01d2:
            r9 = r0
        L_0x01d3:
            java.lang.Object r0 = r3.get(r8)
            avfy r0 = (defpackage.avfy) r0
            int r0 = r0.a
            r10 = 1
            r0 = r0 & r10
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r0 = r3.get(r8)
            avfy r0 = (defpackage.avfy) r0
            avge r0 = r0.b
            if (r0 == 0) goto L_0x01ea
            goto L_0x01ec
        L_0x01ea:
            avge r0 = defpackage.avge.d
        L_0x01ec:
            java.lang.String r0 = r0.b
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            r4[r8] = r0
            java.lang.Object r0 = r3.get(r8)
            avfy r0 = (defpackage.avfy) r0
            int r0 = r0.a
            r10 = 4
            r0 = r0 & r10
            if (r0 == 0) goto L_0x02d0
            int r0 = r9.a
            r0 = r0 & 2
            if (r0 != 0) goto L_0x0207
            r10 = 1
            goto L_0x02d1
        L_0x0207:
            avfn r0 = r9.c
            if (r0 == 0) goto L_0x020c
            goto L_0x020e
        L_0x020c:
            avfn r0 = defpackage.avfn.f
        L_0x020e:
            int r0 = r0.b
            int r0 = defpackage.avfm.a(r0)
            if (r0 == 0) goto L_0x02ce
            if (r0 != r10) goto L_0x02ce
            avfn r0 = r9.c
            if (r0 == 0) goto L_0x021d
            goto L_0x021f
        L_0x021d:
            avfn r0 = defpackage.avfn.f
        L_0x021f:
            java.lang.String r0 = r0.e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02cc
            java.lang.Object r0 = r3.get(r8)
            avfy r0 = (defpackage.avfy) r0
            avgj r0 = r0.d
            if (r0 == 0) goto L_0x0232
            goto L_0x0234
        L_0x0232:
            avgj r0 = defpackage.avgj.b
        L_0x0234:
            java.lang.String r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02ca
            java.lang.Object r0 = r3.get(r8)
            avfy r0 = (defpackage.avfy) r0
            int r0 = r0.a
            r10 = 1
            r0 = r0 & r10
            if (r0 == 0) goto L_0x02d1
            dwk r11 = defpackage.dwk.a()
            android.content.Context r0 = r1.d
            java.lang.Object r12 = r3.get(r8)
            avfy r12 = (defpackage.avfy) r12
            avge r12 = r12.b
            if (r12 == 0) goto L_0x0259
            goto L_0x025b
        L_0x0259:
            avge r12 = defpackage.avge.d
        L_0x025b:
            java.lang.String r12 = r12.b
            java.lang.String r13 = r1.m
            java.util.concurrent.locks.ReentrantLock r14 = r11.a
            r14.lock()
            dwl r0 = defpackage.dwl.a((android.content.Context) r0)     // Catch:{ SQLiteException -> 0x028b, all -> 0x0284 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x028b, all -> 0x0284 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x028b, all -> 0x0284 }
            r14.<init>()     // Catch:{ SQLiteException -> 0x028b, all -> 0x0284 }
            java.lang.String r15 = "invitation_id"
            r14.put(r15, r12)     // Catch:{ SQLiteException -> 0x028b, all -> 0x0284 }
            java.lang.String r12 = "operation_id"
            r14.put(r12, r13)     // Catch:{ SQLiteException -> 0x028b, all -> 0x0284 }
            java.lang.String r12 = "sms"
            r13 = 0
            r0.insert(r12, r13, r14)     // Catch:{ SQLiteException -> 0x028b, all -> 0x0284 }
            java.util.concurrent.locks.ReentrantLock r0 = r11.a
            goto L_0x028e
        L_0x0284:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = r11.a
            r2.unlock()
            throw r0
        L_0x028b:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r11.a
        L_0x028e:
            r0.unlock()
            avfn r0 = r9.c
            if (r0 == 0) goto L_0x0296
            goto L_0x0298
        L_0x0296:
            avfn r0 = defpackage.avfn.f
        L_0x0298:
            java.lang.String r0 = r0.e
            r5.add(r0)
            java.lang.Object r0 = r3.get(r8)
            avfy r0 = (defpackage.avfy) r0
            avgj r0 = r0.d
            if (r0 == 0) goto L_0x02a8
            goto L_0x02aa
        L_0x02a8:
            avgj r0 = defpackage.avgj.b
        L_0x02aa:
            java.lang.String r0 = r0.a
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r6.add(r0)
            java.lang.Object r0 = r3.get(r8)
            avfy r0 = (defpackage.avfy) r0
            avge r0 = r0.b
            if (r0 == 0) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            avge r0 = defpackage.avge.d
        L_0x02c4:
            java.lang.String r0 = r0.b
            r7.add(r0)
            goto L_0x02d1
        L_0x02ca:
            r10 = 1
            goto L_0x02d1
        L_0x02cc:
            r10 = 1
            goto L_0x02d1
        L_0x02ce:
            r10 = 1
            goto L_0x02d1
        L_0x02d0:
            r10 = 1
        L_0x02d1:
            int r8 = r8 + 1
            goto L_0x01be
        L_0x02d5:
        L_0x02d6:
            int r0 = r7.size()
            if (r2 >= r0) goto L_0x0311
            java.lang.Object r0 = r5.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r6.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r8 = r7.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            android.content.Context r9 = r1.d
            dxe r10 = new dxe
            android.content.Context r11 = r9.getApplicationContext()
            r10.<init>(r11)
            r10.a = r0
            r10.b = r3
            r10.c = r8
            java.lang.String r0 = r1.e
            r10.d = r0
            java.lang.String r0 = r1.m
            r10.e = r0
            android.content.Intent r0 = r10.a()
            r9.startService(r0)
            int r2 = r2 + 1
            goto L_0x02d6
        L_0x0311:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "com.google.android.gms.appinvite.intent.action.INVITE_SENT"
            r0.setAction(r2)
            java.lang.String r2 = "android.intent.category.DEFAULT"
            r0.addCategory(r2)
            java.lang.String r2 = "appInviteResult"
            r0.putExtra(r2, r4)
            long r2 = r1.a
            java.lang.String r4 = "appOperationCode"
            r0.putExtra(r4, r2)
            long r2 = r1.a
            com.google.android.gms.appinvite.AppInviteIntentOperation.a(r2, r0)
            android.content.Context r2 = r1.d
            r2.sendBroadcast(r0)
            return
        L_0x0337:
            r2 = 0
            r1.a((java.lang.Exception) r2)
            return
        L_0x033d:
            r0 = move-exception
            goto L_0x0342
        L_0x033f:
            r0 = move-exception
            goto L_0x0342
        L_0x0341:
            r0 = move-exception
        L_0x0342:
            r1.a((java.lang.Exception) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwb.a(android.content.Context):void");
    }
}
