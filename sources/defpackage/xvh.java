package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: xvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvh extends xvd {
    private static xvh b = null;
    private final Context c;
    private final ContentResolver d;
    private final xpp e;
    private final xwr f;
    private final wss g;
    private xvp h;
    private final ydd i;
    private Account j;
    private final int k;

    private xvh(Context context, ContentResolver contentResolver, xpp xpp, wss wss, xwr xwr, ydd ydd, int i2) {
        this.c = context;
        this.d = contentResolver;
        this.e = xpp;
        this.g = wss;
        this.f = xwr;
        this.i = ydd;
        this.k = i2;
    }

    private final Exception a(Exception exc, SyncResult syncResult, yaz yaz, Bundle bundle, Account account) {
        xvp xvp;
        Exception exc2;
        if (!(!(exc instanceof InterruptedException) || (xvp = this.h) == null || (exc2 = xvp.a) == null)) {
            exc = exc2;
        }
        Log.e("FSA2_ContactsSyncAdapter", "Sync has been terminated.", exc);
        wus.a(this.c, "FSA2_ContactsSyncAdapter", "Sync has been terminated.", (Throwable) exc);
        if ((exc instanceof RemoteException) || (exc instanceof OperationApplicationException)) {
            syncResult.stats.numParseExceptions++;
            ((ybh) yaz).m = 5;
        } else if (exc instanceof xyb) {
            syncResult.stats.numIoExceptions++;
            ((ybh) yaz).m = 5;
        } else if (exc instanceof eif) {
            syncResult.stats.numAuthExceptions++;
            ((ybh) yaz).m = 3;
        } else if (exc instanceof babk) {
            syncResult.stats.numIoExceptions++;
            ((ybh) yaz).m = 7;
        } else if (exc instanceof xxy) {
            syncResult.stats.numIoExceptions++;
            ((ybh) yaz).m = 7;
        } else if (exc instanceof xyd) {
            int i2 = ((xyd) exc).a;
            int i3 = i2 - 1;
            if (i2 != 0) {
                switch (i3) {
                    case 0:
                        syncResult.stats.numIoExceptions++;
                        if (aysr.a.a().d() && this.k == 3) {
                            xwr.a(bundle, account);
                        }
                        ((ybh) yaz).m = 2;
                        break;
                    case 1:
                    case 2:
                    case 3:
                        ((ybh) yaz).m = 7;
                        syncResult.stats.numIoExceptions++;
                        break;
                    case 4:
                        ((ybh) yaz).m = 2;
                        break;
                    case 5:
                        ybh ybh = (ybh) yaz;
                        ybh.m = 7;
                        ybh.a.fullSyncRequested = true;
                        syncResult.stats.numIoExceptions++;
                        break;
                    case 6:
                        ((ybh) yaz).m = 4;
                        syncResult.stats.numIoExceptions++;
                        break;
                    default:
                        ((ybh) yaz).m = 100;
                        syncResult.stats.numIoExceptions++;
                        break;
                }
            } else {
                throw null;
            }
        } else {
            if (ayta.a.a().d() && a(exc)) {
                syncResult.stats.numAuthExceptions++;
                xwr.a(bundle, account);
            } else if (!ayta.a.a().b() || !a(exc)) {
                syncResult.stats.numIoExceptions++;
            } else {
                syncResult.stats.numAuthExceptions++;
            }
            ((ybh) yaz).m = 100;
        }
        return exc;
    }

    private static void b(Context context, String str, String str2) {
        Log.e("FSA2_ContactsSyncAdapter", str2);
        wus.a(context, "FSA2_ContactsSyncAdapter", str, (String) null, str2);
    }

    public static synchronized xvh a(Context context, ContentResolver contentResolver, xpp xpp, wss wss, ydd ydd) {
        xvh xvh;
        synchronized (xvh.class) {
            xvh = new xvh(context, contentResolver, xpp, wss, (xwr) null, ydd, 3);
        }
        return xvh;
    }

    private static void a(Context context, String str, String str2) {
        Log.w("FSA2_ContactsSyncAdapter", str2);
        wus.a(context, "FSA2_ContactsSyncAdapter", str, (String) null, str2);
    }

    public static synchronized void a(Context context, xwr xwr, xpp xpp) {
        synchronized (xvh.class) {
            if (b == null) {
                ContentResolver contentResolver = context.getContentResolver();
                wss a = wss.a(context);
                ydd ydd = new ydd(context);
                xvg.a();
                xvh xvh = new xvh(context, contentResolver, xpp, a, xwr, ydd, 2);
                b = xvh;
                xwr.c = xvh;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03e2, code lost:
        if (r5 == 7) goto L_0x03e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.SyncResult r22, defpackage.yaz r23, android.accounts.Account r24, android.os.Bundle r25, java.lang.Exception r26) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            java.lang.String r5 = r2.name
            r6 = r0
            ybh r6 = (defpackage.ybh) r6
            int r7 = r6.m
            int r7 = defpackage.xnx.a(r7)
            r8 = 0
            if (r7 == 0) goto L_0x0439
            r9 = 2
            r10 = 1
            switch(r7) {
                case 2: goto L_0x0077;
                case 3: goto L_0x006d;
                case 4: goto L_0x0063;
                case 5: goto L_0x0059;
                case 6: goto L_0x001d;
                case 7: goto L_0x004f;
                case 8: goto L_0x0045;
                case 9: goto L_0x003b;
                case 10: goto L_0x0027;
                default: goto L_0x001d;
            }
        L_0x001d:
            wss r7 = r1.g
            java.lang.String r11 = "com.android.contacts"
            java.lang.String r12 = "Sync failed. Reason unknown"
            r7.a(r5, r11, r9, r12)
            goto L_0x0080
        L_0x0027:
            wss r7 = r1.g
            boolean r11 = a((android.os.Bundle) r25)
            if (r11 != 0) goto L_0x0032
            java.lang.String r11 = "Sync skipped."
            goto L_0x0034
        L_0x0032:
            java.lang.String r11 = "Sync initialized."
        L_0x0034:
            java.lang.String r12 = "com.android.contacts"
            r7.a(r5, r12, r10, r11)
            goto L_0x0080
        L_0x003b:
            wss r7 = r1.g
            java.lang.String r11 = "com.android.contacts"
            java.lang.String r12 = "Sync succeeded."
            r7.a(r5, r11, r10, r12)
            goto L_0x0080
        L_0x0045:
            wss r7 = r1.g
            java.lang.String r11 = "com.android.contacts"
            java.lang.String r12 = "Sync completed with error."
            r7.a(r5, r11, r9, r12)
            goto L_0x0080
        L_0x004f:
            wss r7 = r1.g
            java.lang.String r11 = "com.android.contacts"
            java.lang.String r12 = "Sync failed. Grpc error."
            r7.a(r5, r11, r9, r12)
            goto L_0x0080
        L_0x0059:
            wss r7 = r1.g
            java.lang.String r11 = "com.android.contacts"
            java.lang.String r12 = "Sync failed. Contacts error."
            r7.a(r5, r11, r9, r12)
            goto L_0x0080
        L_0x0063:
            wss r7 = r1.g
            java.lang.String r11 = "com.android.contacts"
            java.lang.String r12 = "Sync failed. Network error."
            r7.a(r5, r11, r9, r12)
            goto L_0x0080
        L_0x006d:
            wss r7 = r1.g
            java.lang.String r11 = "com.android.contacts"
            java.lang.String r12 = "Sync failed. Auth error."
            r7.a(r5, r11, r9, r12)
            goto L_0x0080
        L_0x0077:
            wss r7 = r1.g
            java.lang.String r11 = "com.android.contacts"
            java.lang.String r12 = "Sync canceled."
            r7.a(r5, r11, r9, r12)
        L_0x0080:
            xwr r5 = r1.f
            if (r5 == 0) goto L_0x009b
            java.lang.Object r7 = r5.a
            monitor-enter(r7)
            java.lang.String r11 = r5.b     // Catch:{ all -> 0x0098 }
            if (r11 == 0) goto L_0x0096
            java.lang.String r12 = "done"
            r13 = r22
            r5.a(r11, r12, r13)     // Catch:{ all -> 0x0098 }
            r5.d = r8     // Catch:{ all -> 0x0098 }
            r5.b = r8     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r7)     // Catch:{ all -> 0x0098 }
            goto L_0x009b
        L_0x0098:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0098 }
            throw r0
        L_0x009b:
            xvp r5 = r1.h
            if (r5 != 0) goto L_0x00a0
            goto L_0x00a7
        L_0x00a0:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r5.b(r7)
        L_0x00a7:
            java.lang.String r5 = r2.name
            wss r7 = r1.g
            int r7 = r7.g(r5)
            wss r11 = r1.g
            android.content.SharedPreferences r11 = r11.a
            java.lang.String r12 = java.lang.String.valueOf(r5)
            java.lang.String r13 = "focus_sync_same_failures_"
            int r14 = r12.length()
            if (r14 != 0) goto L_0x00c5
            java.lang.String r12 = new java.lang.String
            r12.<init>(r13)
            goto L_0x00c9
        L_0x00c5:
            java.lang.String r12 = r13.concat(r12)
        L_0x00c9:
            r13 = 0
            int r11 = r11.getInt(r12, r13)
            int r12 = r6.m
            r14 = 9
            if (r12 == r14) goto L_0x010d
            r15 = 10
            if (r12 == r15) goto L_0x010c
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r7 >= r12) goto L_0x00e0
            int r7 = r7 + 1
            goto L_0x00e1
        L_0x00e0:
        L_0x00e1:
            wss r15 = r1.g
            android.content.SharedPreferences r15 = r15.a
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r14 = "focus_sync_failure_reason_"
            int r16 = r10.length()
            if (r16 != 0) goto L_0x00f7
            java.lang.String r10 = new java.lang.String
            r10.<init>(r14)
            goto L_0x00fb
        L_0x00f7:
            java.lang.String r10 = r14.concat(r10)
        L_0x00fb:
            int r10 = r15.getInt(r10, r13)
            int r14 = r6.m
            if (r10 == r14) goto L_0x0105
            r11 = 0
            goto L_0x0106
        L_0x0105:
        L_0x0106:
            if (r11 >= r12) goto L_0x010b
            int r11 = r11 + 1
            goto L_0x010f
        L_0x010b:
            goto L_0x010f
        L_0x010c:
            goto L_0x010f
        L_0x010d:
            r7 = 0
            r11 = 0
        L_0x010f:
            wss r10 = r1.g
            int r12 = r6.m
            defpackage.iva.b((java.lang.String) r8)
            android.content.SharedPreferences r10 = r10.a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r14 = java.lang.String.valueOf(r5)
            java.lang.String r15 = "focus_sync_failure_reason_"
            int r16 = r14.length()
            if (r16 != 0) goto L_0x012e
            java.lang.String r14 = new java.lang.String
            r14.<init>(r15)
            goto L_0x0132
        L_0x012e:
            java.lang.String r14 = r15.concat(r14)
        L_0x0132:
            android.content.SharedPreferences$Editor r10 = r10.putInt(r14, r12)
            r10.commit()
            wss r10 = r1.g
            defpackage.iva.b((java.lang.String) r8)
            android.content.SharedPreferences r10 = r10.a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r12 = java.lang.String.valueOf(r5)
            java.lang.String r14 = "focus_sync_failures_"
            int r15 = r12.length()
            if (r15 != 0) goto L_0x0156
            java.lang.String r12 = new java.lang.String
            r12.<init>(r14)
            goto L_0x015a
        L_0x0156:
            java.lang.String r12 = r14.concat(r12)
        L_0x015a:
            android.content.SharedPreferences$Editor r10 = r10.putInt(r12, r7)
            r10.commit()
            wss r10 = r1.g
            defpackage.iva.b((java.lang.String) r8)
            android.content.SharedPreferences r10 = r10.a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r12 = "focus_sync_same_failures_"
            int r14 = r5.length()
            if (r14 != 0) goto L_0x017e
            java.lang.String r5 = new java.lang.String
            r5.<init>(r12)
            goto L_0x0182
        L_0x017e:
            java.lang.String r5 = r12.concat(r5)
        L_0x0182:
            android.content.SharedPreferences$Editor r5 = r10.putInt(r5, r11)
            r5.commit()
            r6.j = r7
            r6.k = r11
            yap r5 = new yap
            wss r7 = r1.g
            java.lang.String r10 = r2.name
            r5.<init>(r7, r10)
            int r7 = defpackage.ybj.b(r25)
            int r10 = r6.m
            boolean r11 = r6.t
            defpackage.xip.a()
            r12 = 4
            r14 = 0
            if (r7 == r12) goto L_0x03a0
            wss r7 = r5.a
            java.lang.String r12 = r5.b
            boolean r7 = r7.a((java.lang.String) r12)
            if (r7 == 0) goto L_0x01f8
            long r8 = java.lang.System.currentTimeMillis()
            wss r7 = r5.a
            java.lang.String r12 = r5.b
            android.content.SharedPreferences r7 = r7.a
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r13 = "focus_timestamp_of_page_size_change_"
            int r17 = r12.length()
            if (r17 != 0) goto L_0x01cc
            java.lang.String r12 = new java.lang.String
            r12.<init>(r13)
            goto L_0x01d0
        L_0x01cc:
            java.lang.String r12 = r13.concat(r12)
        L_0x01d0:
            long r12 = r7.getLong(r12, r14)
            long r12 = r8 - r12
            ayrj r7 = defpackage.ayrj.a
            aytn r7 = r7.a()
            long r17 = r7.bh()
            java.lang.Long r7 = java.lang.Long.valueOf(r17)
            long r17 = r7.longValue()
            r19 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r19
            int r7 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r7 > 0) goto L_0x01f1
            goto L_0x01f8
        L_0x01f1:
            r7 = 0
            r5.a(r7, r8)
            goto L_0x03a0
        L_0x01f8:
            boolean r8 = defpackage.ayrk.b()
            r7 = 2
            if (r10 == r7) goto L_0x021a
            wss r7 = r5.a
            java.lang.String r9 = r5.b
            r7.b((java.lang.String) r9)
            if (r8 == 0) goto L_0x03a0
            r7 = 9
            if (r10 != r7) goto L_0x020d
            goto L_0x0211
        L_0x020d:
            r7 = 8
            if (r10 != r7) goto L_0x03a0
        L_0x0211:
            wss r7 = r5.a
            java.lang.String r5 = r5.b
            r7.d(r5)
            goto L_0x03a0
        L_0x021a:
            wss r9 = r5.a
            java.lang.String r10 = r5.b
            r7 = 0
            defpackage.iva.b((java.lang.String) r7)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r12 = "focus_continuous_cancel_count_since_page_size_change_"
            int r13 = r10.length()
            if (r13 != 0) goto L_0x0234
            java.lang.String r10 = new java.lang.String
            r10.<init>(r12)
            goto L_0x0238
        L_0x0234:
            java.lang.String r10 = r12.concat(r10)
        L_0x0238:
            android.content.SharedPreferences r12 = r9.a
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences r9 = r9.a
            r13 = 0
            int r9 = r9.getInt(r10, r13)
            r13 = 1
            int r9 = r9 + r13
            android.content.SharedPreferences$Editor r9 = r12.putInt(r10, r9)
            r9.commit()
            if (r8 == 0) goto L_0x0284
            wss r9 = r5.a
            java.lang.String r10 = r5.b
            r7 = 0
            defpackage.iva.b((java.lang.String) r7)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r12 = "focus_total_cancel_count_since_page_size_change_or_success_"
            int r13 = r10.length()
            if (r13 != 0) goto L_0x026a
            java.lang.String r10 = new java.lang.String
            r10.<init>(r12)
            goto L_0x026e
        L_0x026a:
            java.lang.String r10 = r12.concat(r10)
        L_0x026e:
            android.content.SharedPreferences r12 = r9.a
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences r9 = r9.a
            r13 = 0
            int r9 = r9.getInt(r10, r13)
            r13 = 1
            int r9 = r9 + r13
            android.content.SharedPreferences$Editor r9 = r12.putInt(r10, r9)
            r9.commit()
        L_0x0284:
            wss r9 = r5.a
            java.lang.String r10 = r5.b
            boolean r9 = r9.a((java.lang.String) r10)
            wss r10 = r5.a
            java.lang.String r12 = r5.b
            android.content.SharedPreferences r10 = r10.a
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r13 = "focus_continuous_cancel_count_since_page_size_change_"
            int r16 = r12.length()
            if (r16 != 0) goto L_0x02a4
            java.lang.String r12 = new java.lang.String
            r12.<init>(r13)
            goto L_0x02a8
        L_0x02a4:
            java.lang.String r12 = r13.concat(r12)
        L_0x02a8:
            r13 = 0
            int r10 = r10.getInt(r12, r13)
            if (r9 == 0) goto L_0x0329
            if (r8 != 0) goto L_0x02b2
            goto L_0x02f1
        L_0x02b2:
            boolean r8 = defpackage.ayrk.c()
            if (r8 == 0) goto L_0x02f1
            wss r8 = r5.a
            java.lang.String r9 = r5.b
            int r8 = r8.c((java.lang.String) r9)
            long r8 = (long) r8
            ayrk r10 = defpackage.ayrk.a
            ayrl r10 = r10.a()
            long r12 = r10.f()
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x02d7
            long r12 = java.lang.System.currentTimeMillis()
            r10 = 0
            r5.a(r10, r12)
        L_0x02d7:
            ayrk r10 = defpackage.ayrk.a
            ayrl r10 = r10.a()
            long r12 = r10.g()
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x03a0
            if (r11 == 0) goto L_0x03a0
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            r5.a(r10, r8)
            goto L_0x03a0
        L_0x02f1:
            ayrj r8 = defpackage.ayrj.a
            aytn r8 = r8.a()
            long r8 = r8.k()
            int r9 = (int) r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            int r8 = r8.intValue()
            if (r10 < r8) goto L_0x030e
            long r8 = java.lang.System.currentTimeMillis()
            r12 = 0
            r5.a(r12, r8)
        L_0x030e:
            long r8 = (long) r10
            ayrk r10 = defpackage.ayrk.a
            ayrl r10 = r10.a()
            long r12 = r10.c()
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x03a0
            if (r11 == 0) goto L_0x03a0
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            r5.a(r10, r8)
            goto L_0x03a0
        L_0x0329:
            if (r8 != 0) goto L_0x032c
            goto L_0x036a
        L_0x032c:
            boolean r8 = defpackage.ayrk.c()
            if (r8 == 0) goto L_0x036a
            wss r8 = r5.a
            java.lang.String r9 = r5.b
            int r8 = r8.c((java.lang.String) r9)
            long r8 = (long) r8
            ayrk r10 = defpackage.ayrk.a
            ayrl r10 = r10.a()
            long r12 = r10.d()
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0351
            long r12 = java.lang.System.currentTimeMillis()
            r10 = 1
            r5.a(r10, r12)
        L_0x0351:
            ayrk r10 = defpackage.ayrk.a
            ayrl r10 = r10.a()
            long r12 = r10.e()
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x03a0
            if (r11 == 0) goto L_0x03a0
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 1
            r5.a(r10, r8)
            goto L_0x03a0
        L_0x036a:
            ayrj r8 = defpackage.ayrj.a
            aytn r8 = r8.a()
            long r8 = r8.j()
            int r9 = (int) r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            int r8 = r8.intValue()
            if (r10 < r8) goto L_0x0387
            long r8 = java.lang.System.currentTimeMillis()
            r12 = 1
            r5.a(r12, r8)
        L_0x0387:
            long r8 = (long) r10
            ayrk r10 = defpackage.ayrk.a
            ayrl r10 = r10.a()
            long r12 = r10.b()
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x03a0
            if (r11 == 0) goto L_0x03a0
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 1
            r5.a(r10, r8)
        L_0x03a0:
            if (r4 == 0) goto L_0x042d
            int r5 = r6.m
            int r5 = defpackage.xnx.a(r5)
            int r6 = r6.k
            long r6 = (long) r6
            defpackage.xip.a()
            ayrj r8 = defpackage.ayrj.a
            aytn r8 = r8.a()
            boolean r8 = r8.aa()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0429
            r8 = 100
            if (r5 != r8) goto L_0x03c7
            goto L_0x03e4
        L_0x03c7:
            r8 = 5
            if (r5 == r8) goto L_0x03e4
            defpackage.xip.a()
            ayrj r8 = defpackage.ayrj.a
            aytn r8 = r8.a()
            boolean r8 = r8.bj()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0429
            r8 = 7
            if (r5 != r8) goto L_0x0429
        L_0x03e4:
            ayrj r5 = defpackage.ayrj.a
            aytn r5 = r5.a()
            long r8 = r5.aM()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            long r8 = r5.longValue()
            ayrj r5 = defpackage.ayrj.a
            aytn r5 = r5.a()
            long r10 = r5.aO()
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            long r10 = r5.longValue()
            r12 = 1
            long r10 = java.lang.Math.max(r10, r12)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0429
            long r6 = r6 - r8
            long r6 = r6 % r10
            int r5 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x0429
            ydd r5 = r1.i
            xfs r6 = defpackage.xii.a
            java.lang.Object r6 = r6.a()
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            r5.a(r4, r6)
        L_0x0429:
            r1.a((android.accounts.Account) r2, (android.os.Bundle) r3, (defpackage.yaz) r0, (java.lang.Exception) r4)
            return
        L_0x042d:
            ybg r4 = r6.r
            if (r4 == 0) goto L_0x0434
            java.lang.Exception r8 = r4.b
            goto L_0x0435
        L_0x0434:
            r8 = 0
        L_0x0435:
            r1.a((android.accounts.Account) r2, (android.os.Bundle) r3, (defpackage.yaz) r0, (java.lang.Exception) r8)
            return
        L_0x0439:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvh.a(android.content.SyncResult, yaz, android.accounts.Account, android.os.Bundle, java.lang.Exception):void");
    }

    private static boolean a(Bundle bundle) {
        return bundle != null && bundle.getBoolean("initialize", false);
    }

    private static boolean a(Exception exc) {
        return (exc instanceof SecurityException) && exc.getMessage() != null && exc.getMessage().contains(ayta.a.a().e());
    }

    public final void a() {
        if (this.h != null) {
            Account account = this.j;
            if (ayug.a.a().I() && account != null && !ContentResolver.getSyncAutomatically(account, "com.android.contacts")) {
                ((ybh) this.h.b).v = true;
            }
            this.h.a((Exception) new xyd(1));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v15, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v19, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v20, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v200, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v204, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v205, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v211, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v24, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v26, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v27, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v28, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v29, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v30, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v31, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v32, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v33, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v34, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v35, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v99, resolved type: xxv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v101, resolved type: xxv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v102, resolved type: xxv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v43, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v44, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v45, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v46, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v47, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v48, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v49, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v50, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v54, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v55, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v56, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v57, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v58, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v59, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v60, resolved type: ybh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v62, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v63, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v64, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v66, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v67, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v68, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v69, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v70, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v71, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v72, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v73, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v74, resolved type: android.content.ContentResolver} */
    /* JADX WARNING: type inference failed for: r5v20, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v20 */
    /* JADX WARNING: type inference failed for: r11v21 */
    /* JADX WARNING: type inference failed for: r5v65 */
    /* JADX WARNING: type inference failed for: r23v8 */
    /* JADX WARNING: type inference failed for: r23v10 */
    /* JADX WARNING: type inference failed for: r23v11 */
    /* JADX WARNING: type inference failed for: r9v202 */
    /* JADX WARNING: type inference failed for: r5v66 */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x062a, code lost:
        if (r8.m.startsWith(r2) == false) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0648, code lost:
        if (r2.startsWith(r8.m) != false) goto L_0x064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b75, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b79, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b7a, code lost:
        r10 = r0;
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b7e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b7f, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0b81, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b82, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b86, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b87, code lost:
        r8 = r6;
        r2 = r0;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b8b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0b8c, code lost:
        r8 = r6;
        r1 = r0;
        r9 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0bce, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0bd3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c55, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c56, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c59, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c5a, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c5c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0c5d, code lost:
        r9 = r1;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0ca4, code lost:
        if (r1 == 4) goto L_0x0ca6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0271, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0272, code lost:
        r10 = r0;
        r8 = r6;
        r9 = r23;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:425:0x0a0c, B:503:0x0b38] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:425:0x0a0c, B:515:0x0b57] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:425:0x0a0c, B:549:0x0bdc] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:515:0x0b57, B:533:0x0b9a] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r11v12, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x06c8 A[SYNTHETIC, Splitter:B:257:0x06c8] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0706 A[Catch:{ all -> 0x075b }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0707 A[Catch:{ all -> 0x075b }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0782 A[Catch:{ all -> 0x0b0a }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x08d6 A[SYNTHETIC, Splitter:B:350:0x08d6] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x08fd A[SYNTHETIC, Splitter:B:358:0x08fd] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0920 A[SYNTHETIC, Splitter:B:364:0x0920] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x098e A[SYNTHETIC, Splitter:B:384:0x098e] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x09a4  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x09a7 A[SYNTHETIC, Splitter:B:394:0x09a7] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x09c2 A[SYNTHETIC, Splitter:B:405:0x09c2] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x09cd A[Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0a06  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0a2a A[Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }] */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0aa2 A[SYNTHETIC, Splitter:B:461:0x0aa2] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0aed A[Catch:{ all -> 0x0ad2, all -> 0x0b08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0b2c A[SYNTHETIC, Splitter:B:499:0x0b2c] */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x0b3e A[Catch:{ xye -> 0x0b75, Exception -> 0x0bd3, all -> 0x0bce }] */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0b73 A[Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }] */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x0b79 A[ExcHandler: all (r0v29 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:120:0x0307] */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x0bce A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v31 ybh) = (r1v32 ybh), (r1v32 ybh), (r1v36 ybh), (r1v36 ybh), (r1v36 ybh), (r1v36 ybh), (r1v36 ybh), (r1v36 ybh) binds: [B:552:0x0be5, B:540:0x0ba8, B:503:0x0b38, B:515:0x0b57, B:499:0x0b2c, B:500:?, B:422:0x0a08, B:425:0x0a0c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:425:0x0a0c] */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x0bd3 A[ExcHandler: Exception (e java.lang.Exception), PHI: r1 
      PHI: (r1v29 ybh) = (r1v32 ybh), (r1v32 ybh), (r1v36 ybh), (r1v36 ybh), (r1v36 ybh), (r1v36 ybh), (r1v36 ybh), (r1v36 ybh) binds: [B:552:0x0be5, B:540:0x0ba8, B:503:0x0b38, B:515:0x0b57, B:499:0x0b2c, B:500:?, B:422:0x0a08, B:425:0x0a0c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:425:0x0a0c] */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0c55 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v21 ybh) = (r1v25 ybh), (r1v25 ybh), (r1v32 ybh), (r1v32 ybh) binds: [B:558:0x0c36, B:559:?, B:533:0x0b9a, B:549:0x0bdc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:533:0x0b9a] */
    /* JADX WARNING: Removed duplicated region for block: B:567:0x0c59 A[ExcHandler: Exception (e java.lang.Exception), PHI: r1 
      PHI: (r1v20 ybh) = (r1v25 ybh), (r1v25 ybh), (r1v32 ybh), (r1v32 ybh) binds: [B:558:0x0c36, B:559:?, B:533:0x0b9a, B:549:0x0bdc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:533:0x0b9a] */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0c5c A[ExcHandler: xye (e xye), PHI: r1 r7 r8 r17 
      PHI: (r1v27 ybh) = (r1v32 ybh), (r1v32 ybh), (r1v36 ybh) binds: [B:533:0x0b9a, B:540:0x0ba8, B:515:0x0b57] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v5 xvh) = (r7v0 xvh), (r7v0 xvh), (r7v8 xvh) binds: [B:533:0x0b9a, B:540:0x0ba8, B:515:0x0b57] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v22 android.accounts.Account) = (r8v23 android.accounts.Account), (r8v23 android.accounts.Account), (r8v32 android.accounts.Account) binds: [B:533:0x0b9a, B:540:0x0ba8, B:515:0x0b57] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v2 java.lang.String) = (r17v3 java.lang.String), (r17v3 java.lang.String), (r17v7 java.lang.String) binds: [B:533:0x0b9a, B:540:0x0ba8, B:515:0x0b57] A[DONT_GENERATE, DONT_INLINE], Splitter:B:515:0x0b57] */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x0ca2 A[Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f, all -> 0x0d58 }] */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0ca3 A[Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f, all -> 0x0d58 }] */
    /* JADX WARNING: Removed duplicated region for block: B:599:0x0cc0 A[Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f, all -> 0x0d58 }] */
    /* JADX WARNING: Removed duplicated region for block: B:600:0x0cc6 A[Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f, all -> 0x0d58 }] */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0d08 A[Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f, all -> 0x0d58 }] */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0d0e A[Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f, all -> 0x0d58 }] */
    /* JADX WARNING: Removed duplicated region for block: B:611:0x0d2d A[Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f, all -> 0x0d58 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0271 A[ExcHandler: all (r0v83 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r23 
      PHI: (r23v11 ?) = (r23v15 android.content.ContentResolver), (r23v24 android.content.ContentResolver), (r23v26 android.content.ContentResolver), (r23v29 android.content.ContentResolver), (r23v32 android.content.ContentResolver), (r23v35 android.content.ContentResolver), (r23v46 android.content.ContentResolver), (r23v49 android.content.ContentResolver), (r23v56 android.content.ContentResolver), (r23v59 android.content.ContentResolver), (r23v64 android.content.ContentResolver), (r23v68 android.content.ContentResolver), (r23v71 android.content.ContentResolver), (r23v74 android.content.ContentResolver) binds: [B:47:0x0195, B:107:0x02c0, B:117:0x02f5, B:111:0x02cf, B:101:0x02b1, B:102:?, B:94:0x0298, B:95:?, B:80:0x026a, B:81:?, B:59:0x01c5, B:52:0x01ad, B:54:0x01ba, B:55:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:54:0x01ba] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.accounts.Account r30, android.os.Bundle r31, java.lang.String r32, android.content.SyncResult r33) {
        /*
            r29 = this;
            r7 = r29
            r6 = r30
            r5 = r31
            java.lang.String r1 = "REQUESTER"
            java.lang.String r4 = "FSA2_ContactsSyncAdapter"
            android.content.Context r2 = r7.c
            java.lang.String r3 = r6.name
            java.lang.String r8 = "@onPerformSync Sync started"
            a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r8)
            java.lang.String r2 = "com.android.contacts"
            r3 = r32
            boolean r3 = r2.equals(r3)
            defpackage.iva.b((boolean) r3)
            r3 = 0
            if (r6 != 0) goto L_0x0029
            android.content.Context r1 = r7.c
            java.lang.String r2 = "@onPerformSync Unspecified account, bailing out"
            b(r1, r3, r2)
            return
        L_0x0029:
            r7.j = r6
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r9 = "periodic_sync"
            r15 = 1
            r8.putBoolean(r9, r15)
            ild r9 = new ild
            android.content.Context r10 = r7.c
            r9.<init>(r10)
            ayrj r9 = defpackage.ayrj.a
            aytn r9 = r9.a()
            long r9 = r9.aV()
            defpackage.ild.a(r6, r2, r8, r9)
            ybh r14 = new ybh
            r13 = r33
            r14.<init>(r13)
            int r8 = r7.k
            r14.A = r8
            jiu r16 = defpackage.jiu.a
            r21 = 1000(0x3e8, double:4.94E-321)
            android.content.Context r8 = r7.c     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            wss r9 = r7.g     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            defpackage.xip.a()     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            ayrj r10 = defpackage.ayrj.a     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            aytn r10 = r10.a()     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            boolean r10 = r10.z()     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            boolean r10 = r10.booleanValue()     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            boolean r17 = defpackage.xxb.a(r8)     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            java.lang.String r3 = "com.google.android.gms.people.sync.focus.notification.permission_denied.tag"
            r12 = 0
            java.lang.String r11 = "FSA2_CONTACTS_PERMISSION_NOTIFICATION"
            if (r17 != 0) goto L_0x00fa
            if (r10 == 0) goto L_0x00f2
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            android.content.SharedPreferences r10 = r9.a     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r15 = "focus_sync_permission_denied_notify_time"
            long r12 = r10.getLong(r15, r12)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            long r12 = r1 - r12
            defpackage.xip.a()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            ayrj r10 = defpackage.ayrj.a     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            aytn r10 = r10.a()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            long r15 = r10.aU()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.Long r10 = java.lang.Long.valueOf(r15)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            long r15 = r10.longValue()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            long r15 = r15 * r21
            java.lang.String r10 = "FSA2_ContactsPermissionReminder"
            int r20 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r20 < 0) goto L_0x00e1
            iwr r12 = defpackage.iwr.a(r8)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            defpackage.xip.a()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            xfs r13 = defpackage.xgq.a     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.Object r13 = r13.a()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            boolean r13 = r13.booleanValue()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            if (r13 == 0) goto L_0x00cc
            r13 = 1
            r12.a(r11, r13)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            android.app.Notification r8 = defpackage.xxf.a(r8)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r12.a(r3, r13, r8)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            goto L_0x00d5
        L_0x00cc:
            android.app.Notification r3 = defpackage.xxf.a(r8)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r8 = 1
            r12.a(r11, r8, r3)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
        L_0x00d5:
            java.lang.String r3 = "Sent contacts permission denied notification."
            android.util.Log.e(r10, r3)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r3 = 1
            r14.s = r3     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r9.b((long) r1)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            goto L_0x00f2
        L_0x00e1:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            long r12 = r12 / r21
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r3 = 0
            r2[r3] = r1     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r1 = "Contacts permission denied. Notification was lastly sent %d seconds ago."
            defpackage.xdt.b(r10, r1, r2)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
        L_0x00f2:
            android.os.RemoteException r1 = new android.os.RemoteException     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r2 = "Gms does not have contacts permission."
            r1.<init>(r2)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            throw r1     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
        L_0x00fa:
            if (r10 == 0) goto L_0x0131
            iwr r8 = defpackage.iwr.a(r8)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r10 = 1
            r8.a(r11, r10)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            defpackage.xip.a()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            xfs r10 = defpackage.xgq.a     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.Object r10 = r10.a()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            boolean r10 = r10.booleanValue()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            if (r10 == 0) goto L_0x0119
            r10 = 1
            r8.a(r3, r10)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
        L_0x0119:
            r9.b((long) r12)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            goto L_0x0131
        L_0x011e:
            r0 = move-exception
            r10 = r0
            r8 = r6
            r9 = r14
            goto L_0x0d5a
        L_0x0124:
            r0 = move-exception
            r2 = r0
            r8 = r6
            r9 = r14
            goto L_0x0c79
        L_0x012a:
            r0 = move-exception
            r1 = r0
            r8 = r6
            r9 = r14
        L_0x012e:
            r6 = 0
            goto L_0x0c8c
        L_0x0131:
            boolean r3 = defpackage.aytx.b()     // Catch:{ xye -> 0x0c87, Exception -> 0x0c75, all -> 0x0c6f }
            java.lang.String r8 = "cp"
            r11 = 2
            if (r3 != 0) goto L_0x0244
            android.content.ContentResolver r3 = r7.d     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            defpackage.xip.a()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            ayrj r9 = defpackage.ayrj.a     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            aytn r9 = r9.a()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            boolean r9 = r9.bv()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            boolean r9 = r9.booleanValue()     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r10 = "base2_property-android"
            java.lang.String r20 = "contacts"
            java.lang.String r12 = "/"
            java.lang.String r13 = "https://www.google.com/m8/feeds"
            if (r9 == 0) goto L_0x01ff
            r9 = 4
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r9 = 0
            r15[r9] = r13     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r9 = 1
            r15[r9] = r20     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r9 = r6.name     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r15[r11] = r9     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r9 = "base2_property-android_linksto-gprofiles_highresphotos"
            r20 = 3
            r15[r20] = r9     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.util.List r9 = java.util.Arrays.asList(r15)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r9 = android.text.TextUtils.join(r12, r9)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            android.net.Uri r24 = android.provider.ContactsContract.DisplayPhoto.CONTENT_MAX_DIMENSIONS_URI     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r15 = 1
            java.lang.String[] r11 = new java.lang.String[r15]     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            java.lang.String r15 = "display_max_dim"
            r19 = 0
            r11[r19] = r15     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            r26 = 0
            r27 = 0
            r28 = 0
            r23 = r3
            r25 = r11
            android.database.Cursor r3 = r23.query(r24, r25, r26, r27, r28)     // Catch:{ xye -> 0x012a, Exception -> 0x0124, all -> 0x011e }
            if (r3 == 0) goto L_0x01f2
            boolean r11 = r3.moveToNext()     // Catch:{ all -> 0x01ea }
            if (r11 != 0) goto L_0x01be
            java.lang.String r11 = "FSA2_FeedUtil"
            java.lang.String r15 = "CP2 returns empty cursor when querying photo max dimensions."
            android.util.Log.e(r11, r15)     // Catch:{ all -> 0x01ea }
            defpackage.xip.a()     // Catch:{ all -> 0x01ea }
            ayrj r11 = defpackage.ayrj.a     // Catch:{ all -> 0x01ea }
            aytn r11 = r11.a()     // Catch:{ all -> 0x01ea }
            r23 = r14
            long r14 = r11.n()     // Catch:{ all -> 0x01e8 }
            int r11 = (int) r14     // Catch:{ all -> 0x01e8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01e8 }
            int r11 = r11.intValue()     // Catch:{ all -> 0x01e8 }
            r3.close()     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            goto L_0x01c9
        L_0x01be:
            r23 = r14
            r11 = 0
            int r14 = r3.getInt(r11)     // Catch:{ all -> 0x01e8 }
            r3.close()     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r11 = r14
        L_0x01c9:
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            int r3 = r3.length()     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            int r3 = r3 + 15
            r14.<init>(r3)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r14.append(r9)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r3 = "?sz="
            r14.append(r3)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r14.append(r11)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r3 = r14.toString()     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            goto L_0x021a
        L_0x01e8:
            r0 = move-exception
            goto L_0x01ed
        L_0x01ea:
            r0 = move-exception
            r23 = r14
        L_0x01ed:
            r1 = r0
            r3.close()     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            throw r1     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
        L_0x01f2:
            r23 = r14
            xye r1 = new xye     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            xyb r2 = new xyb     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r2.<init>()     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r1.<init>(r2)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            throw r1     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
        L_0x01ff:
            r23 = r14
            r3 = 4
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r3 = 0
            r9[r3] = r13     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r3 = 1
            r9[r3] = r20     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r3 = r6.name     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r11 = 2
            r9[r11] = r3     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r3 = 3
            r9[r3] = r10     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.util.List r3 = java.util.Arrays.asList(r9)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r3 = android.text.TextUtils.join(r12, r3)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
        L_0x021a:
            r9 = 4
            java.lang.String[] r11 = new java.lang.String[r9]     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r9 = 0
            r11[r9] = r13     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r9 = "groups"
            r13 = 1
            r11[r13] = r9     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r9 = r6.name     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r13 = 2
            r11[r13] = r9     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r15 = 3
            r11[r15] = r10     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.util.List r9 = java.util.Arrays.asList(r11)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.String r9 = android.text.TextUtils.join(r12, r9)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            android.content.ContentResolver r10 = r7.d     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r11 = 2
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r13 = 0
            r12[r13] = r3     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r13 = 1
            r12[r13] = r9     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            defpackage.acup.a(r10, r6, r2, r8, r12)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            goto L_0x02a2
        L_0x0244:
            r23 = r14
            r15 = 3
            aytx r3 = defpackage.aytx.a     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            ayty r3 = r3.a()     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            boolean r3 = r3.c()     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            if (r3 != 0) goto L_0x0254
            goto L_0x025c
        L_0x0254:
            android.content.ContentResolver r3 = r7.d     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            r9 = 0
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            defpackage.acup.a(r3, r6, r2, r8, r10)     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
        L_0x025c:
            java.lang.String r3 = "contacts/"
            java.lang.String r8 = r6.name     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            int r9 = r8.length()     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            if (r9 != 0) goto L_0x0286
            java.lang.String r8 = new java.lang.String     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r8.<init>(r3)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r3 = r8
            goto L_0x028a
        L_0x0271:
            r0 = move-exception
            r10 = r0
            r8 = r6
            r9 = r23
            goto L_0x0d5a
        L_0x0278:
            r0 = move-exception
            r2 = r0
            r8 = r6
        L_0x027b:
            r9 = r23
            goto L_0x0c79
        L_0x027f:
            r0 = move-exception
            r1 = r0
            r8 = r6
            r9 = r23
            goto L_0x012e
        L_0x0286:
            java.lang.String r3 = r3.concat(r8)     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
        L_0x028a:
            java.lang.String r8 = "groups/"
            java.lang.String r9 = r6.name     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            int r10 = r9.length()     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            if (r10 != 0) goto L_0x029e
            java.lang.String r9 = new java.lang.String     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r9.<init>(r8)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            goto L_0x02a2
        L_0x029e:
            java.lang.String r9 = r8.concat(r9)     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
        L_0x02a2:
            xve r8 = new xve     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            r8.<init>(r3, r9)     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            android.content.Context r3 = r7.c     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            boolean r3 = defpackage.jgu.e(r3)     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            if (r3 == 0) goto L_0x02ba
            java.lang.String r1 = "Restricted user profile, bailing out"
            android.util.Log.w(r4, r1)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            r8 = r6
            r1 = r23
            r6 = 0
            goto L_0x0c36
        L_0x02ba:
            boolean r3 = a((android.os.Bundle) r31)     // Catch:{ xye -> 0x0c6a, Exception -> 0x0c65, all -> 0x0c61 }
            if (r3 != 0) goto L_0x0b93
            aytd r3 = defpackage.aytd.a     // Catch:{ xye -> 0x0b8b, Exception -> 0x0b86, all -> 0x0271 }
            ayte r3 = r3.a()     // Catch:{ xye -> 0x0b8b, Exception -> 0x0b86, all -> 0x0271 }
            boolean r3 = r3.g()     // Catch:{ xye -> 0x0b8b, Exception -> 0x0b86, all -> 0x0271 }
            if (r3 != 0) goto L_0x02cd
            goto L_0x02f5
        L_0x02cd:
            if (r5 == 0) goto L_0x02f5
            boolean r3 = r5.containsKey(r1)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            if (r3 == 0) goto L_0x02f5
            java.lang.String r3 = "SYNC_CORE_SHEEPDOG_UI"
            java.lang.Object r1 = r5.get(r1)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            boolean r1 = r3.equals(r1)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            if (r1 == 0) goto L_0x02f5
            java.lang.String r1 = "Sync requested by contacts sync settings. Sleep %d milliseconds"
            long r9 = defpackage.aytd.h()     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            defpackage.xdt.a((java.lang.String) r4, (java.lang.String) r1, (java.lang.Object) r3)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            long r9 = defpackage.aytd.h()     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
            java.lang.Thread.sleep(r9)     // Catch:{ xye -> 0x027f, Exception -> 0x0278, all -> 0x0271 }
        L_0x02f5:
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ xye -> 0x0b8b, Exception -> 0x0b86, all -> 0x0271 }
            r1.<init>()     // Catch:{ xye -> 0x0b8b, Exception -> 0x0b86, all -> 0x0271 }
            r3 = 4
            byte[] r9 = new byte[r3]     // Catch:{ xye -> 0x0b8b, Exception -> 0x0b86, all -> 0x0271 }
            r1.nextBytes(r9)     // Catch:{ xye -> 0x0b8b, Exception -> 0x0b86, all -> 0x0271 }
            r1 = 0
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r1)     // Catch:{ xye -> 0x0b8b, Exception -> 0x0b86, all -> 0x0271 }
            r1 = r23
            r1.q = r9     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            xwm r9 = defpackage.xwm.a     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            android.content.Context r10 = r7.c     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r9.a((android.content.Context) r10, (android.accounts.Account) r6, (defpackage.yaz) r1)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            xvp r14 = new xvp     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            xwr r9 = r7.f     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r14.<init>(r9, r1)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r7.h = r14     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            android.content.Context r12 = r7.c     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            android.content.ContentResolver r13 = r7.d     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            xpp r10 = r7.e     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            wss r9 = r7.g     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            ihs r18 = defpackage.ihs.b()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            java.lang.String r3 = defpackage.jhg.e((android.content.Context) r18)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            defpackage.xip.a()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            ayrj r18 = defpackage.ayrj.a     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aytn r18 = r18.a()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            java.lang.String r18 = r18.bb()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r23 = android.text.TextUtils.isEmpty(r3)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            if (r23 != 0) goto L_0x0350
            java.lang.String r11 = defpackage.ycm.b((java.lang.String) r18)     // Catch:{ xye -> 0x034b, Exception -> 0x0345, all -> 0x0b79 }
            java.lang.String r3 = r11.concat(r3)     // Catch:{ xye -> 0x034b, Exception -> 0x0345, all -> 0x0b79 }
            goto L_0x0352
        L_0x0345:
            r0 = move-exception
            r2 = r0
            r9 = r1
            r8 = r6
            goto L_0x0c79
        L_0x034b:
            r0 = move-exception
            r9 = r1
            r8 = r6
            goto L_0x0c8a
        L_0x0350:
            java.lang.String r3 = ""
        L_0x0352:
            aqwp r11 = defpackage.aqwp.d     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aucd r11 = r11.o()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aqur r18 = defpackage.aqur.c     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aucd r15 = r18.o()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            java.lang.String r5 = "GMS FSA2"
            r18 = r9
            boolean r9 = r15.c     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            if (r9 != 0) goto L_0x0367
            goto L_0x036d
        L_0x0367:
            r15.c()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r9 = 0
            r15.c = r9     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
        L_0x036d:
            aucj r9 = r15.b     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aqur r9 = (defpackage.aqur) r9     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r5.getClass()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r9.a = r5     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r3.getClass()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r9.b = r3     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r3 = r11.c     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            if (r3 != 0) goto L_0x0380
            goto L_0x0386
        L_0x0380:
            r11.c()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r3 = 0
            r11.c = r3     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
        L_0x0386:
            aucj r3 = r11.b     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aqwp r3 = (defpackage.aqwp) r3     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aucj r5 = r15.i()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aqur r5 = (defpackage.aqur) r5     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r5.getClass()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r3.a = r5     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            ayrj r3 = defpackage.ayrj.a     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aytn r3 = r3.a()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r3 = r3.bI()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r3 = r3.booleanValue()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            if (r3 != 0) goto L_0x03ac
            r5 = 0
            r15 = 1
            goto L_0x03df
        L_0x03ac:
            aqwo r3 = defpackage.aqwo.b     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aucd r3 = r3.o()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r5 = r3.c     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            if (r5 != 0) goto L_0x03b7
            goto L_0x03bd
        L_0x03b7:
            r3.c()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r5 = 0
            r3.c = r5     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
        L_0x03bd:
            aucj r5 = r3.b     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aqwo r5 = (defpackage.aqwo) r5     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r15 = 1
            r5.a = r15     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r5 = r11.c     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            if (r5 != 0) goto L_0x03ca
            r5 = 0
            goto L_0x03d0
        L_0x03ca:
            r11.c()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r5 = 0
            r11.c = r5     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
        L_0x03d0:
            aucj r9 = r11.b     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aqwp r9 = (defpackage.aqwp) r9     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aucj r3 = r3.i()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aqwo r3 = (defpackage.aqwo) r3     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r3.getClass()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r9.b = r3     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
        L_0x03df:
            ayrj r3 = defpackage.ayrj.a     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aytn r3 = r3.a()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r3 = r3.R()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r3.booleanValue()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aucj r3 = r11.i()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aqwp r3 = (defpackage.aqwp) r3     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            java.lang.String r11 = r8.a     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            java.lang.String r9 = r8.b     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            xxv r8 = new xxv     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r23 = r8
            r24 = r9
            r17 = r18
            r9 = r30
            r18 = r10
            r10 = r31
            r19 = r11
            r11 = r12
            r25 = 0
            r12 = r13
            r13 = r1
            r15 = r16
            r16 = r18
            r18 = r3
            r20 = r24
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            xkj r3 = defpackage.xkj.BEFORE_SYNC     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            defpackage.xxv.a((defpackage.xkj) r3)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            defpackage.xip.a()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            ayrj r3 = defpackage.ayrj.a     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            aytn r3 = r3.a()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r3 = r3.aA()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            boolean r3 = r3.booleanValue()     // Catch:{ xye -> 0x0b81, Exception -> 0x0b7e, all -> 0x0b79 }
            r8 = r23
            xxt r9 = r8.i     // Catch:{ all -> 0x0b22 }
            android.os.Bundle r10 = r8.f     // Catch:{ all -> 0x0b22 }
            if (r10 == 0) goto L_0x047b
            java.lang.String r11 = "upload"
            boolean r10 = r10.getBoolean(r11, r5)     // Catch:{ all -> 0x0471 }
            if (r10 == 0) goto L_0x046f
            xwn r9 = r9.b     // Catch:{ all -> 0x0471 }
            xwo r9 = r9.a     // Catch:{ all -> 0x0471 }
            xvk r9 = r9.a()     // Catch:{ all -> 0x0471 }
            int r10 = r9.a     // Catch:{ all -> 0x0471 }
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L_0x0455
            java.lang.String r9 = r9.b     // Catch:{ all -> 0x0471 }
            goto L_0x0456
        L_0x0455:
            r9 = 0
        L_0x0456:
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0471 }
            if (r9 != 0) goto L_0x047c
            android.content.Context r2 = r8.g     // Catch:{ all -> 0x0471 }
            java.lang.String r9 = "FSA2_Syncers"
            android.accounts.Account r10 = r8.e     // Catch:{ all -> 0x0471 }
            java.lang.String r10 = r10.name     // Catch:{ all -> 0x0471 }
            java.lang.String r12 = "@sync: Upload-only sync, skipping download"
            r13 = 0
            defpackage.wus.a((android.content.Context) r2, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r13, (java.lang.String) r12)     // Catch:{ all -> 0x0471 }
            r17 = r4
            r9 = r8
            goto L_0x0902
        L_0x046f:
            r11 = 1
            goto L_0x047c
        L_0x0471:
            r0 = move-exception
            r2 = r0
            r17 = r4
            r9 = r8
            r4 = 3
            r5 = 2
            r8 = r6
            goto L_0x0b2a
        L_0x047b:
            r11 = 1
        L_0x047c:
            xxt r9 = r8.i     // Catch:{ all -> 0x0b22 }
            defpackage.xip.a()     // Catch:{ all -> 0x0b22 }
            xfs r10 = defpackage.xih.a     // Catch:{ all -> 0x0b22 }
            java.lang.Object r10 = r10.a()     // Catch:{ all -> 0x0b22 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0b22 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0b22 }
            if (r10 == 0) goto L_0x05d8
            xwn r10 = r9.b     // Catch:{ all -> 0x0471 }
            long r12 = r10.a()     // Catch:{ all -> 0x0471 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0471 }
            long r14 = r14 - r12
            defpackage.xip.a()     // Catch:{ all -> 0x0471 }
            ayrj r10 = defpackage.ayrj.a     // Catch:{ all -> 0x0471 }
            aytn r10 = r10.a()     // Catch:{ all -> 0x0471 }
            long r12 = r10.aT()     // Catch:{ all -> 0x0471 }
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0471 }
            long r12 = r10.longValue()     // Catch:{ all -> 0x0471 }
            long r12 = r12 * r21
            int r10 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x05d8
            defpackage.xip.a()     // Catch:{ all -> 0x0471 }
            ayrj r10 = defpackage.ayrj.a     // Catch:{ all -> 0x0471 }
            aytn r10 = r10.a()     // Catch:{ all -> 0x0471 }
            boolean r10 = r10.bg()     // Catch:{ all -> 0x0471 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0471 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0471 }
            java.lang.String r12 = "FSA2_SyncAssistant"
            if (r10 != 0) goto L_0x04cf
            goto L_0x0525
        L_0x04cf:
            ybu r10 = r9.c     // Catch:{ all -> 0x0471 }
            boolean r13 = r10.b     // Catch:{ all -> 0x0471 }
            if (r13 != 0) goto L_0x0525
            int r10 = r10.c     // Catch:{ all -> 0x0471 }
            defpackage.xip.a()     // Catch:{ all -> 0x0471 }
            ayrj r13 = defpackage.ayrj.a     // Catch:{ all -> 0x0471 }
            aytn r13 = r13.a()     // Catch:{ all -> 0x0471 }
            long r13 = r13.bE()     // Catch:{ all -> 0x0471 }
            int r14 = (int) r13     // Catch:{ all -> 0x0471 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0471 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0471 }
            if (r10 >= r13) goto L_0x0525
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0471 }
            r13 = 24
            if (r10 < r13) goto L_0x051e
            java.lang.String r10 = "Delay periodic full sync until charging."
            android.util.Log.w(r12, r10)     // Catch:{ all -> 0x0471 }
            android.accounts.Account r9 = r9.a     // Catch:{ all -> 0x0471 }
            android.content.SyncRequest$Builder r10 = new android.content.SyncRequest$Builder     // Catch:{ all -> 0x0471 }
            r10.<init>()     // Catch:{ all -> 0x0471 }
            r10.setSyncAdapter(r9, r2)     // Catch:{ all -> 0x0471 }
            r10.setRequiresCharging(r11)     // Catch:{ all -> 0x0471 }
            r10.setIgnoreBackoff(r11)     // Catch:{ all -> 0x0471 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0471 }
            r2.<init>()     // Catch:{ all -> 0x0471 }
            r10.setExtras(r2)     // Catch:{ all -> 0x0471 }
            r10.syncOnce()     // Catch:{ all -> 0x0471 }
            android.content.SyncRequest r2 = r10.build()     // Catch:{ all -> 0x0471 }
            android.content.ContentResolver.requestSync(r2)     // Catch:{ all -> 0x0471 }
            goto L_0x05d8
        L_0x051e:
            java.lang.String r2 = "Skip periodic full sync since not charging."
            android.util.Log.w(r12, r2)     // Catch:{ all -> 0x0471 }
            goto L_0x05d8
        L_0x0525:
            java.lang.String r2 = "Trigger periodic full sync."
            android.util.Log.w(r12, r2)     // Catch:{ all -> 0x0471 }
            xwn r2 = r9.b     // Catch:{ all -> 0x0471 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0471 }
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x0471 }
            java.lang.Long r13 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0471 }
            r12[r5] = r13     // Catch:{ all -> 0x0471 }
            java.lang.String r13 = "FSA2_PeopleSyncState"
            java.lang.String r14 = "@resetToFullSync = %d"
            defpackage.xdt.a((java.lang.String) r13, (java.lang.String) r14, (java.lang.Object[]) r12)     // Catch:{ all -> 0x0471 }
            xwo r12 = r2.a     // Catch:{ all -> 0x0471 }
            xvk r12 = r12.a()     // Catch:{ all -> 0x0471 }
            r13 = 5
            java.lang.Object r13 = r12.c(r13)     // Catch:{ all -> 0x0471 }
            aucd r13 = (defpackage.aucd) r13     // Catch:{ all -> 0x0471 }
            r13.a((defpackage.aucj) r12)     // Catch:{ all -> 0x0471 }
            boolean r12 = r13.c     // Catch:{ all -> 0x0471 }
            if (r12 != 0) goto L_0x0554
            goto L_0x0559
        L_0x0554:
            r13.c()     // Catch:{ all -> 0x0471 }
            r13.c = r5     // Catch:{ all -> 0x0471 }
        L_0x0559:
            aucj r12 = r13.b     // Catch:{ all -> 0x0471 }
            xvk r12 = (defpackage.xvk) r12     // Catch:{ all -> 0x0471 }
            xvk r14 = defpackage.xvk.g     // Catch:{ all -> 0x0471 }
            int r14 = r12.a     // Catch:{ all -> 0x0471 }
            r14 = r14 & -5
            r12.a = r14     // Catch:{ all -> 0x0471 }
            xvk r14 = defpackage.xvk.g     // Catch:{ all -> 0x0471 }
            java.lang.String r14 = r14.d     // Catch:{ all -> 0x0471 }
            r12.d = r14     // Catch:{ all -> 0x0471 }
            boolean r12 = r13.c     // Catch:{ all -> 0x0471 }
            if (r12 != 0) goto L_0x0570
            goto L_0x0575
        L_0x0570:
            r13.c()     // Catch:{ all -> 0x0471 }
            r13.c = r5     // Catch:{ all -> 0x0471 }
        L_0x0575:
            aucj r12 = r13.b     // Catch:{ all -> 0x0471 }
            xvk r12 = (defpackage.xvk) r12     // Catch:{ all -> 0x0471 }
            int r14 = r12.a     // Catch:{ all -> 0x0471 }
            r14 = r14 & -9
            r12.a = r14     // Catch:{ all -> 0x0471 }
            xvk r14 = defpackage.xvk.g     // Catch:{ all -> 0x0471 }
            java.lang.String r14 = r14.e     // Catch:{ all -> 0x0471 }
            r12.e = r14     // Catch:{ all -> 0x0471 }
            boolean r12 = r13.c     // Catch:{ all -> 0x0471 }
            if (r12 != 0) goto L_0x058a
            goto L_0x058f
        L_0x058a:
            r13.c()     // Catch:{ all -> 0x0471 }
            r13.c = r5     // Catch:{ all -> 0x0471 }
        L_0x058f:
            aucj r12 = r13.b     // Catch:{ all -> 0x0471 }
            xvk r12 = (defpackage.xvk) r12     // Catch:{ all -> 0x0471 }
            int r14 = r12.a     // Catch:{ all -> 0x0471 }
            r14 = r14 & -2
            r12.a = r14     // Catch:{ all -> 0x0471 }
            xvk r14 = defpackage.xvk.g     // Catch:{ all -> 0x0471 }
            java.lang.String r14 = r14.b     // Catch:{ all -> 0x0471 }
            r12.b = r14     // Catch:{ all -> 0x0471 }
            boolean r12 = r13.c     // Catch:{ all -> 0x0471 }
            if (r12 != 0) goto L_0x05a4
            goto L_0x05a9
        L_0x05a4:
            r13.c()     // Catch:{ all -> 0x0471 }
            r13.c = r5     // Catch:{ all -> 0x0471 }
        L_0x05a9:
            aucj r12 = r13.b     // Catch:{ all -> 0x0471 }
            xvk r12 = (defpackage.xvk) r12     // Catch:{ all -> 0x0471 }
            int r14 = r12.a     // Catch:{ all -> 0x0471 }
            r14 = r14 & -3
            r12.a = r14     // Catch:{ all -> 0x0471 }
            xvk r14 = defpackage.xvk.g     // Catch:{ all -> 0x0471 }
            java.lang.String r14 = r14.c     // Catch:{ all -> 0x0471 }
            r12.c = r14     // Catch:{ all -> 0x0471 }
            boolean r12 = r13.c     // Catch:{ all -> 0x0471 }
            if (r12 != 0) goto L_0x05be
            goto L_0x05c3
        L_0x05be:
            r13.c()     // Catch:{ all -> 0x0471 }
            r13.c = r5     // Catch:{ all -> 0x0471 }
        L_0x05c3:
            aucj r12 = r13.b     // Catch:{ all -> 0x0471 }
            xvk r12 = (defpackage.xvk) r12     // Catch:{ all -> 0x0471 }
            int r14 = r12.a     // Catch:{ all -> 0x0471 }
            r14 = r14 | 32
            r12.a = r14     // Catch:{ all -> 0x0471 }
            r12.f = r9     // Catch:{ all -> 0x0471 }
            aucj r9 = r13.i()     // Catch:{ all -> 0x0471 }
            xvk r9 = (defpackage.xvk) r9     // Catch:{ all -> 0x0471 }
            r2.a((defpackage.xvk) r9)     // Catch:{ all -> 0x0471 }
        L_0x05d8:
            java.lang.String r2 = r8.h     // Catch:{ all -> 0x0b22 }
            if (r2 == 0) goto L_0x0613
            defpackage.xip.a()     // Catch:{ all -> 0x0609 }
            ayrj r9 = defpackage.ayrj.a     // Catch:{ all -> 0x0609 }
            aytn r9 = r9.a()     // Catch:{ all -> 0x0609 }
            long r9 = r9.bB()     // Catch:{ all -> 0x0609 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0609 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0609 }
            int r10 = (r12 > r25 ? 1 : (r12 == r25 ? 0 : -1))
            if (r10 <= 0) goto L_0x0613
            xvp r10 = r8.l     // Catch:{ InterruptedException -> 0x0607 }
            r10.a()     // Catch:{ InterruptedException -> 0x0607 }
            long r9 = r9.longValue()     // Catch:{ InterruptedException -> 0x0607 }
            java.lang.Thread.sleep(r9)     // Catch:{ InterruptedException -> 0x0607 }
            xvp r9 = r8.l     // Catch:{ InterruptedException -> 0x0607 }
            r9.a()     // Catch:{ InterruptedException -> 0x0607 }
            goto L_0x0613
        L_0x0607:
            r0 = move-exception
            goto L_0x0613
        L_0x0609:
            r0 = move-exception
            r2 = r0
            r17 = r4
            r9 = r8
            r4 = 3
            r5 = 2
            r8 = r6
            goto L_0x0b1b
        L_0x0613:
            boolean r9 = defpackage.aytx.b()     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x0637
            if (r2 != 0) goto L_0x061c
            goto L_0x062c
        L_0x061c:
            java.lang.String r9 = r8.n     // Catch:{ all -> 0x0609 }
            boolean r9 = r2.equals(r9)     // Catch:{ all -> 0x0609 }
            if (r9 != 0) goto L_0x062c
            java.lang.String r9 = r8.m     // Catch:{ all -> 0x0609 }
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x0609 }
            if (r2 == 0) goto L_0x0654
        L_0x062c:
            xxp r2 = defpackage.xxv.b     // Catch:{ all -> 0x0609 }
            r2.a()     // Catch:{ all -> 0x0609 }
            xxs r2 = defpackage.xxv.c     // Catch:{ all -> 0x0609 }
            r2.a()     // Catch:{ all -> 0x0609 }
            goto L_0x0654
        L_0x0637:
            if (r2 != 0) goto L_0x063a
            goto L_0x064a
        L_0x063a:
            java.lang.String r9 = r8.n     // Catch:{ all -> 0x0b13 }
            boolean r9 = r2.startsWith(r9)     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x064a
            java.lang.String r9 = r8.m     // Catch:{ all -> 0x0609 }
            boolean r2 = r2.startsWith(r9)     // Catch:{ all -> 0x0609 }
            if (r2 == 0) goto L_0x0654
        L_0x064a:
            xxp r2 = defpackage.xxv.b     // Catch:{ all -> 0x0b13 }
            r2.a()     // Catch:{ all -> 0x0b13 }
            xxs r2 = defpackage.xxv.c     // Catch:{ all -> 0x0b13 }
            r2.a()     // Catch:{ all -> 0x0b13 }
        L_0x0654:
            xxr r2 = defpackage.xxv.d     // Catch:{ all -> 0x0b13 }
            defpackage.xip.a()     // Catch:{ all -> 0x0b13 }
            ayrj r9 = defpackage.ayrj.a     // Catch:{ all -> 0x0b13 }
            aytn r9 = r9.a()     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.aF()     // Catch:{ all -> 0x0b13 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0694
            android.accounts.Account r9 = r2.i     // Catch:{ all -> 0x0609 }
            android.content.ContentResolver r10 = r2.h     // Catch:{ all -> 0x0609 }
            xvw r12 = r2.b     // Catch:{ all -> 0x0609 }
            xvp r13 = r2.k     // Catch:{ all -> 0x0609 }
            java.lang.String r14 = "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL AND starred=1"
            android.database.Cursor r9 = defpackage.xyv.a(r9, r10, r14)     // Catch:{ all -> 0x0609 }
            defpackage.xip.a()     // Catch:{ all -> 0x0609 }
            ayrj r10 = defpackage.ayrj.a     // Catch:{ all -> 0x0609 }
            aytn r10 = r10.a()     // Catch:{ all -> 0x0609 }
            long r14 = r10.bs()     // Catch:{ all -> 0x0609 }
            int r10 = (int) r14     // Catch:{ all -> 0x0609 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0609 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0609 }
            defpackage.xyv.a(r9, r12, r13, r10)     // Catch:{ all -> 0x0609 }
        L_0x0694:
            ayrj r9 = defpackage.ayrj.a     // Catch:{ all -> 0x0b13 }
            aytn r9 = r9.a()     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.bx()     // Catch:{ all -> 0x0b13 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x06b0
            ybu r9 = r2.a     // Catch:{ all -> 0x0609 }
            boolean r9 = r9.b     // Catch:{ all -> 0x0609 }
            if (r9 == 0) goto L_0x06b0
            r15 = 1
            goto L_0x06b1
        L_0x06b0:
            r15 = 0
        L_0x06b1:
            defpackage.xip.a()     // Catch:{ all -> 0x0b13 }
            ayrj r9 = defpackage.ayrj.a     // Catch:{ all -> 0x0b13 }
            aytn r9 = r9.a()     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.ac()     // Catch:{ all -> 0x0b13 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x06e2
            android.content.Context r9 = r2.e     // Catch:{ all -> 0x0609 }
            java.lang.String r10 = "connectivity"
            java.lang.Object r9 = r9.getSystemService(r10)     // Catch:{ all -> 0x0609 }
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9     // Catch:{ all -> 0x0609 }
            android.net.NetworkInfo r9 = r9.getActiveNetworkInfo()     // Catch:{ all -> 0x0609 }
            if (r9 == 0) goto L_0x06e2
            int r9 = r9.getType()     // Catch:{ all -> 0x0609 }
            if (r9 == r11) goto L_0x06e0
            r9 = 0
            goto L_0x06e3
        L_0x06e0:
            r9 = 1
            goto L_0x06e3
        L_0x06e2:
            r9 = 0
        L_0x06e3:
            java.lang.String r10 = "mimetype='vnd.android.cursor.item/photo' AND data15 IS NOT NULL"
            if (r15 == 0) goto L_0x06e8
            goto L_0x06ea
        L_0x06e8:
            if (r9 == 0) goto L_0x0766
        L_0x06ea:
            defpackage.xip.a()     // Catch:{ all -> 0x075b }
            ayrj r9 = defpackage.ayrj.a     // Catch:{ all -> 0x075b }
            aytn r9 = r9.a()     // Catch:{ all -> 0x075b }
            long r12 = r9.ba()     // Catch:{ all -> 0x075b }
            int r9 = (int) r12     // Catch:{ all -> 0x075b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x075b }
            int r9 = r9.intValue()     // Catch:{ all -> 0x075b }
            int r12 = r2.a(r10)     // Catch:{ all -> 0x075b }
            if (r12 >= 0) goto L_0x0707
            goto L_0x0766
        L_0x0707:
            if (r12 > r9) goto L_0x0766
            if (r15 != 0) goto L_0x0733
            android.accounts.Account r9 = r2.i     // Catch:{ all -> 0x075b }
            android.content.ContentResolver r12 = r2.h     // Catch:{ all -> 0x075b }
            xvw r13 = r2.b     // Catch:{ all -> 0x075b }
            xvp r14 = r2.k     // Catch:{ all -> 0x075b }
            java.lang.String r15 = "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL AND (data_sync3 IS NULL OR data_sync3!=data_sync2)"
            android.database.Cursor r9 = defpackage.xyv.a(r9, r12, r15)     // Catch:{ all -> 0x075b }
            defpackage.xip.a()     // Catch:{ all -> 0x075b }
            ayrj r12 = defpackage.ayrj.a     // Catch:{ all -> 0x075b }
            aytn r12 = r12.a()     // Catch:{ all -> 0x075b }
            long r5 = r12.aG()     // Catch:{ all -> 0x075b }
            int r6 = (int) r5     // Catch:{ all -> 0x075b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x075b }
            int r5 = r5.intValue()     // Catch:{ all -> 0x075b }
            defpackage.xyv.a(r9, r13, r14, r5)     // Catch:{ all -> 0x075b }
            goto L_0x0766
        L_0x0733:
            android.accounts.Account r5 = r2.i     // Catch:{ all -> 0x075b }
            android.content.ContentResolver r6 = r2.h     // Catch:{ all -> 0x075b }
            xvw r9 = r2.b     // Catch:{ all -> 0x075b }
            xvp r12 = r2.k     // Catch:{ all -> 0x075b }
            java.lang.String r13 = "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL"
            android.database.Cursor r5 = defpackage.xyv.a(r5, r6, r13)     // Catch:{ all -> 0x075b }
            defpackage.xip.a()     // Catch:{ all -> 0x075b }
            ayrj r6 = defpackage.ayrj.a     // Catch:{ all -> 0x075b }
            aytn r6 = r6.a()     // Catch:{ all -> 0x075b }
            long r13 = r6.aE()     // Catch:{ all -> 0x075b }
            int r6 = (int) r13     // Catch:{ all -> 0x075b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x075b }
            int r6 = r6.intValue()     // Catch:{ all -> 0x075b }
            defpackage.xyv.a(r5, r9, r12, r6)     // Catch:{ all -> 0x075b }
            goto L_0x0766
        L_0x075b:
            r0 = move-exception
            r2 = r0
            r17 = r4
            r9 = r8
            r4 = 3
            r5 = 2
            r8 = r30
            goto L_0x0b1b
        L_0x0766:
            android.content.ContentResolver r13 = r2.h     // Catch:{ all -> 0x0b0a }
            android.net.Uri r14 = r2.d     // Catch:{ all -> 0x0b0a }
            xwt r5 = r2.g     // Catch:{ all -> 0x0b0a }
            yaz r6 = r2.j     // Catch:{ all -> 0x0b0a }
            xvp r9 = r2.k     // Catch:{ all -> 0x0b0a }
            amri r12 = r2.f     // Catch:{ all -> 0x0b0a }
            java.lang.String[] r15 = defpackage.xwd.b     // Catch:{ all -> 0x0b0a }
            java.lang.String[] r16 = defpackage.xvw.a     // Catch:{ all -> 0x0b0a }
            java.lang.String r16 = "mimetype='vnd.android.cursor.item/photo' AND data_sync2 IS NOT NULL AND (data_sync3 IS NULL OR data_sync3!=data_sync2)"
            r17 = 0
            r18 = 0
            android.database.Cursor r24 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b0a }
            if (r24 == 0) goto L_0x0aed
            xwd r13 = new xwd     // Catch:{ all -> 0x0b0a }
            r23 = r13
            r25 = r5
            r26 = r6
            r27 = r9
            r28 = r12
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0b0a }
            r2.a((defpackage.xwa) r13, (boolean) r11)     // Catch:{ all -> 0x0ad2 }
            xfs r5 = defpackage.xfy.a     // Catch:{ all -> 0x0ac8 }
            java.lang.Object r5 = r5.a()     // Catch:{ all -> 0x0ac8 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0ac8 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0ac8 }
            if (r5 != 0) goto L_0x07a3
            goto L_0x07a6
        L_0x07a3:
            r13.f()     // Catch:{ all -> 0x0ac8 }
        L_0x07a6:
            xyx r5 = r2.c     // Catch:{ all -> 0x0ac8 }
            boolean r6 = defpackage.aysr.b()     // Catch:{ all -> 0x0ac8 }
            aysr r9 = defpackage.aysr.a     // Catch:{ all -> 0x0ac8 }
            ayss r9 = r9.a()     // Catch:{ all -> 0x0ac8 }
            boolean r9 = r9.a()     // Catch:{ all -> 0x0ac8 }
            if (r9 != 0) goto L_0x07bb
            java.lang.String r9 = "mimetype='vnd.android.cursor.item/photo' AND data_sync1 LIKE '%REGENERATE_HASH_KEY%'"
            goto L_0x07bd
        L_0x07bb:
            java.lang.String r9 = defpackage.xyw.a     // Catch:{ all -> 0x0ac8 }
        L_0x07bd:
            r15 = 0
        L_0x07be:
            long r12 = (long) r15     // Catch:{ all -> 0x0ac8 }
            aysr r14 = defpackage.aysr.a     // Catch:{ all -> 0x0ac8 }
            ayss r14 = r14.a()     // Catch:{ all -> 0x0ac8 }
            long r16 = r14.c()     // Catch:{ all -> 0x0ac8 }
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0aac
            android.content.ContentResolver r12 = r5.b     // Catch:{ all -> 0x0ac8 }
            android.net.Uri r13 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x0ac8 }
            android.accounts.Account r14 = r5.a     // Catch:{ all -> 0x0ac8 }
            android.net.Uri r13 = defpackage.xvw.a((android.net.Uri) r13, (android.accounts.Account) r14)     // Catch:{ all -> 0x0ac8 }
            boolean r14 = defpackage.aysr.b()     // Catch:{ all -> 0x0ac8 }
            if (r14 == 0) goto L_0x07fa
            aysr r14 = defpackage.aysr.a     // Catch:{ all -> 0x075b }
            ayss r14 = r14.a()     // Catch:{ all -> 0x075b }
            long r16 = r14.b()     // Catch:{ all -> 0x075b }
            android.net.Uri$Builder r13 = r13.buildUpon()     // Catch:{ all -> 0x075b }
            java.lang.String r14 = "limit"
            java.lang.String r11 = java.lang.Long.toString(r16)     // Catch:{ all -> 0x075b }
            android.net.Uri$Builder r11 = r13.appendQueryParameter(r14, r11)     // Catch:{ all -> 0x075b }
            android.net.Uri r11 = r11.build()     // Catch:{ all -> 0x075b }
            r13 = r11
        L_0x07fa:
            java.lang.String[] r14 = defpackage.xyw.b     // Catch:{ all -> 0x0ac8 }
            r16 = 0
            r17 = 0
            r11 = r15
            r15 = r9
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0ac8 }
            if (r12 == 0) goto L_0x0a8b
            if (r6 != 0) goto L_0x080b
            goto L_0x0819
        L_0x080b:
            int r13 = r12.getCount()     // Catch:{ all -> 0x0a83 }
            if (r13 != 0) goto L_0x0819
            r12.close()     // Catch:{ all -> 0x075b }
            r17 = r4
            r9 = r8
            goto L_0x08c2
        L_0x0819:
            boolean r13 = r12.moveToNext()     // Catch:{ all -> 0x0a83 }
            if (r13 == 0) goto L_0x08b3
            xvp r13 = r5.d     // Catch:{ all -> 0x08a7 }
            r13.a()     // Catch:{ all -> 0x08a7 }
            r13 = 0
            long r14 = r12.getLong(r13)     // Catch:{ all -> 0x08a7 }
            r32 = r9
            r13 = 1
            java.lang.String r9 = r12.getString(r13)     // Catch:{ all -> 0x08a7 }
            r13 = 2
            byte[] r16 = r12.getBlob(r13)     // Catch:{ all -> 0x08a7 }
            r17 = r4
            r23 = r14
            r4 = 3
            long r13 = r12.getLong(r4)     // Catch:{ all -> 0x08a1 }
            r15 = 4
            long r25 = r12.getLong(r15)     // Catch:{ all -> 0x08a1 }
            java.lang.Long r15 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x08a1 }
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x089f }
            boolean r4 = defpackage.yau.a(r4, r15)     // Catch:{ all -> 0x089f }
            if (r4 == 0) goto L_0x0866
            long r25 = defpackage.xyx.a(r16)     // Catch:{ all -> 0x085e }
            java.lang.String r4 = java.lang.Long.toString(r25)     // Catch:{ all -> 0x085e }
            java.lang.String r4 = defpackage.xwz.a((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ all -> 0x085e }
            goto L_0x086c
        L_0x085e:
            r0 = move-exception
            r2 = r0
            r9 = r8
            r4 = 3
            r8 = r30
            goto L_0x0aa0
        L_0x0866:
            java.lang.String r4 = "*"
            java.lang.String r4 = defpackage.xwz.a((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ all -> 0x089f }
        L_0x086c:
            r9 = r8
            r7 = r23
            android.content.ContentProviderOperation$Builder r7 = defpackage.xwc.a(r7, r13)     // Catch:{ all -> 0x089d }
            xvw r8 = r5.c     // Catch:{ all -> 0x089d }
            java.lang.String r13 = "data_sync1"
            android.content.ContentProviderOperation$Builder r4 = r7.withValue(r13, r4)     // Catch:{ all -> 0x089d }
            java.lang.String r7 = "data_sync4"
            long r13 = r15.longValue()     // Catch:{ all -> 0x089d }
            r15 = 1
            long r13 = r13 + r15
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x089d }
            android.content.ContentProviderOperation$Builder r4 = r4.withValue(r7, r13)     // Catch:{ all -> 0x089d }
            r8.a((android.content.ContentProviderOperation.Builder) r4)     // Catch:{ all -> 0x089d }
            xvw r4 = r5.c     // Catch:{ all -> 0x089d }
            r4.a()     // Catch:{ all -> 0x089d }
            r7 = r29
            r8 = r9
            r4 = r17
            r9 = r32
            goto L_0x0819
        L_0x089d:
            r0 = move-exception
            goto L_0x08ab
        L_0x089f:
            r0 = move-exception
            goto L_0x08aa
        L_0x08a1:
            r0 = move-exception
            r9 = r8
            r7 = r29
            goto L_0x0a88
        L_0x08a7:
            r0 = move-exception
            r17 = r4
        L_0x08aa:
            r9 = r8
        L_0x08ab:
            r7 = r29
            r8 = r30
            r2 = r0
            r4 = 3
            goto L_0x0aa0
        L_0x08b3:
            r17 = r4
            r32 = r9
            r9 = r8
            xvw r4 = r5.c     // Catch:{ all -> 0x0a7c }
            r4.b()     // Catch:{ all -> 0x0a7c }
            if (r6 != 0) goto L_0x0a6a
            r12.close()     // Catch:{ all -> 0x0a62 }
        L_0x08c2:
            ayrj r4 = defpackage.ayrj.a     // Catch:{ all -> 0x0a62 }
            aytn r4 = r4.a()     // Catch:{ all -> 0x0a62 }
            boolean r4 = r4.O()     // Catch:{ all -> 0x0a62 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0a62 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0a62 }
            if (r4 == 0) goto L_0x08ec
            xjo r4 = defpackage.xjo.PHOTO     // Catch:{ all -> 0x08e3 }
            r2.a((java.lang.String) r10, (defpackage.xjo) r4)     // Catch:{ all -> 0x08e3 }
            java.lang.String r4 = "mimetype='vnd.android.cursor.item/photo' AND data15 IS NOT NULL AND data14 IS NOT NULL"
            xjo r5 = defpackage.xjo.PHOTO_HIGH_RES     // Catch:{ all -> 0x08e3 }
            r2.a((java.lang.String) r4, (defpackage.xjo) r5)     // Catch:{ all -> 0x08e3 }
            goto L_0x08ec
        L_0x08e3:
            r0 = move-exception
            r7 = r29
            r8 = r30
            r2 = r0
            r4 = 3
            goto L_0x0ad0
        L_0x08ec:
            r2 = 1
            r9.a((boolean) r2)     // Catch:{ all -> 0x0a58 }
            ayso r2 = defpackage.ayso.a     // Catch:{ all -> 0x0a58 }
            aysp r2 = r2.a()     // Catch:{ all -> 0x0a58 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0a58 }
            if (r2 == 0) goto L_0x0902
            xkj r2 = defpackage.xkj.BETWEEN_SYNC_DOWN_AND_SYNC_UP     // Catch:{ all -> 0x097d }
            defpackage.xxv.a((defpackage.xkj) r2)     // Catch:{ all -> 0x097d }
        L_0x0902:
            defpackage.xip.a()     // Catch:{ all -> 0x0a58 }
            ayrj r2 = defpackage.ayrj.a     // Catch:{ all -> 0x0a58 }
            aytn r2 = r2.a()     // Catch:{ all -> 0x0a58 }
            long r4 = r2.aL()     // Catch:{ all -> 0x0a58 }
            int r2 = (int) r4     // Catch:{ all -> 0x0a58 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0a58 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0a58 }
            r4 = 1
            int r2 = java.lang.Math.max(r4, r2)     // Catch:{ all -> 0x0a58 }
            r11 = 0
        L_0x091e:
            if (r11 >= r2) goto L_0x0986
            android.content.SyncResult r4 = r9.k     // Catch:{ all -> 0x0965 }
            android.content.SyncStats r4 = r4.stats     // Catch:{ all -> 0x0965 }
            long r4 = r4.numInserts     // Catch:{ all -> 0x0965 }
            android.content.SyncResult r6 = r9.k     // Catch:{ all -> 0x0965 }
            android.content.SyncStats r6 = r6.stats     // Catch:{ all -> 0x0965 }
            long r6 = r6.numUpdates     // Catch:{ all -> 0x0965 }
            long r4 = r4 + r6
            android.content.SyncResult r6 = r9.k     // Catch:{ all -> 0x0965 }
            android.content.SyncStats r6 = r6.stats     // Catch:{ all -> 0x0965 }
            long r6 = r6.numDeletes     // Catch:{ all -> 0x0965 }
            long r4 = r4 + r6
            java.util.List r6 = defpackage.xxv.a     // Catch:{ all -> 0x0965 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0965 }
        L_0x093a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0965 }
            if (r7 != 0) goto L_0x095b
            android.content.SyncResult r6 = r9.k     // Catch:{ all -> 0x0965 }
            android.content.SyncStats r6 = r6.stats     // Catch:{ all -> 0x0965 }
            long r6 = r6.numInserts     // Catch:{ all -> 0x0965 }
            android.content.SyncResult r8 = r9.k     // Catch:{ all -> 0x0965 }
            android.content.SyncStats r8 = r8.stats     // Catch:{ all -> 0x0965 }
            long r12 = r8.numUpdates     // Catch:{ all -> 0x0965 }
            long r6 = r6 + r12
            android.content.SyncResult r8 = r9.k     // Catch:{ all -> 0x0965 }
            android.content.SyncStats r8 = r8.stats     // Catch:{ all -> 0x0965 }
            long r12 = r8.numDeletes     // Catch:{ all -> 0x0965 }
            long r6 = r6 + r12
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0986
            int r11 = r11 + 1
            goto L_0x091e
        L_0x095b:
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0965 }
            xxu r7 = (defpackage.xxu) r7     // Catch:{ all -> 0x0965 }
            r7.b()     // Catch:{ all -> 0x0965 }
            goto L_0x093a
        L_0x0965:
            r0 = move-exception
            r2 = r0
            amri r4 = r9.o     // Catch:{ all -> 0x097d }
            boolean r4 = r4.a()     // Catch:{ all -> 0x097d }
            if (r4 == 0) goto L_0x097c
            amri r4 = r9.o     // Catch:{ all -> 0x097d }
            java.lang.Object r4 = r4.b()     // Catch:{ all -> 0x097d }
            xxj r4 = (defpackage.xxj) r4     // Catch:{ all -> 0x097d }
            r5 = 3
            r6 = 1
            r4.b(r5, r6)     // Catch:{ all -> 0x097d }
        L_0x097c:
            throw r2     // Catch:{ all -> 0x097d }
        L_0x097d:
            r0 = move-exception
            r7 = r29
            r8 = r30
            r2 = r0
            r4 = 3
            goto L_0x0a5f
        L_0x0986:
            amri r2 = r9.o     // Catch:{ all -> 0x0a58 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x0a58 }
            if (r2 == 0) goto L_0x09a4
            amri r2 = r9.o     // Catch:{ all -> 0x099c }
            java.lang.Object r2 = r2.b()     // Catch:{ all -> 0x099c }
            xxj r2 = (defpackage.xxj) r2     // Catch:{ all -> 0x099c }
            r4 = 3
            r5 = 1
            r2.b(r4, r5)     // Catch:{ all -> 0x0a55 }
            goto L_0x09a5
        L_0x099c:
            r0 = move-exception
            r4 = 3
        L_0x099e:
            r7 = r29
            r8 = r30
            goto L_0x0a5e
        L_0x09a4:
            r4 = 3
        L_0x09a5:
            if (r3 == 0) goto L_0x09c2
            xkj r2 = defpackage.xkj.AFTER_SYNC     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            defpackage.xxv.a((defpackage.xkj) r2)     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            goto L_0x09c7
        L_0x09ad:
            r0 = move-exception
            r7 = r29
        L_0x09b0:
            r8 = r30
            goto L_0x0bcf
        L_0x09b4:
            r0 = move-exception
            r7 = r29
        L_0x09b7:
            r8 = r30
            goto L_0x0bd4
        L_0x09bb:
            r0 = move-exception
            r7 = r29
        L_0x09be:
            r8 = r30
            goto L_0x0b33
        L_0x09c2:
            xkj r2 = defpackage.xkj.AFTER_SYNC     // Catch:{ all -> 0x0a55 }
            defpackage.xxv.a((defpackage.xkj) r2)     // Catch:{ all -> 0x0a55 }
        L_0x09c7:
            boolean r2 = defpackage.ayrt.c()     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            if (r2 == 0) goto L_0x0a00
            xnb r2 = defpackage.xnb.c     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            aucd r2 = r2.o()     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            ybu r3 = r9.p     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            boolean r3 = r3.b     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            if (r3 != 0) goto L_0x09db
            r15 = 3
            goto L_0x09dc
        L_0x09db:
            r15 = 2
        L_0x09dc:
            boolean r3 = r2.c     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            if (r3 != 0) goto L_0x09e1
            goto L_0x09e7
        L_0x09e1:
            r2.c()     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            r3 = 0
            r2.c = r3     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
        L_0x09e7:
            aucj r3 = r2.b     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            xnb r3 = (defpackage.xnb) r3     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            int r15 = r15 + -1
            r3.b = r15     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            int r4 = r3.a     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            r5 = 1
            r4 = r4 | r5
            r3.a = r4     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            yaz r3 = r9.j     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            aucj r2 = r2.i()     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            xnb r2 = (defpackage.xnb) r2     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            r3.a((defpackage.xnb) r2)     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
        L_0x0a00:
            boolean r2 = r33.hasError()     // Catch:{ xye -> 0x09bb, Exception -> 0x09b4, all -> 0x09ad }
            if (r2 != 0) goto L_0x0a2a
            r7 = r29
            android.content.Context r2 = r7.c     // Catch:{ xye -> 0x0a28, Exception -> 0x0a26, all -> 0x0a24 }
            r8 = r30
            java.lang.String r3 = r8.name     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r4 = "@onPerformSync Sync finished successfully"
            a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            r2 = 9
            r1.m = r2     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r2 = r8.name     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            wss r3 = r7.g     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            r4 = 0
            r3.c((java.lang.String) r2, (int) r4)     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            goto L_0x0c43
        L_0x0a24:
            r0 = move-exception
            goto L_0x09b0
        L_0x0a26:
            r0 = move-exception
            goto L_0x09b7
        L_0x0a28:
            r0 = move-exception
            goto L_0x09be
        L_0x0a2a:
            r7 = r29
            r8 = r30
            android.content.Context r2 = r7.c     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r3 = r8.name     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r4 = "@onPerformSync Sync finished with errors. sync result: "
            java.lang.String r5 = r33.toDebugString()     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            int r6 = r5.length()     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            if (r6 != 0) goto L_0x0a48
            java.lang.String r5 = new java.lang.String     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            r5.<init>(r4)     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            goto L_0x0a4c
        L_0x0a48:
            java.lang.String r5 = r4.concat(r5)     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
        L_0x0a4c:
            b(r2, r3, r5)     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            r2 = 8
            r1.m = r2     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            goto L_0x0c43
        L_0x0a55:
            r0 = move-exception
            goto L_0x099e
        L_0x0a58:
            r0 = move-exception
            r7 = r29
            r8 = r30
            r4 = 3
        L_0x0a5e:
            r2 = r0
        L_0x0a5f:
            r5 = 2
            goto L_0x0b2a
        L_0x0a62:
            r0 = move-exception
            r7 = r29
            r8 = r30
            r4 = 3
            goto L_0x0acf
        L_0x0a6a:
            r7 = r29
            r8 = r30
            r4 = 3
            r12.close()     // Catch:{ all -> 0x0ac6 }
            int r15 = r11 + 1
            r8 = r9
            r4 = r17
            r11 = 1
            r9 = r32
            goto L_0x07be
        L_0x0a7c:
            r0 = move-exception
            r7 = r29
            r8 = r30
            r4 = 3
            goto L_0x0a9f
        L_0x0a83:
            r0 = move-exception
            r17 = r4
            r9 = r8
            r4 = 3
        L_0x0a88:
            r8 = r30
            goto L_0x0a9f
        L_0x0a8b:
            r17 = r4
            r9 = r8
            r4 = 3
            r8 = r30
            xye r2 = new xye     // Catch:{ all -> 0x0a9e }
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch:{ all -> 0x0a9e }
            java.lang.String r6 = "Cannot query CP2."
            r5.<init>(r6)     // Catch:{ all -> 0x0a9e }
            r2.<init>(r5)     // Catch:{ all -> 0x0a9e }
            throw r2     // Catch:{ all -> 0x0a9e }
        L_0x0a9e:
            r0 = move-exception
        L_0x0a9f:
            r2 = r0
        L_0x0aa0:
            if (r12 == 0) goto L_0x0aab
            r12.close()     // Catch:{ all -> 0x0aa6 }
            goto L_0x0aab
        L_0x0aa6:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0ac6 }
        L_0x0aab:
            throw r2     // Catch:{ all -> 0x0ac6 }
        L_0x0aac:
            r17 = r4
            r9 = r8
            r4 = 3
            r8 = r30
            java.lang.String r2 = "FSA2_PhotoHashKeyWriter"
            java.lang.String r5 = "There might still photos need to regenerate hash key. Will do in next sync."
            android.util.Log.e(r2, r5)     // Catch:{ all -> 0x0ac6 }
            xye r2 = new xye     // Catch:{ all -> 0x0ac6 }
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch:{ all -> 0x0ac6 }
            java.lang.String r6 = "Too many photos when generating hash key."
            r5.<init>(r6)     // Catch:{ all -> 0x0ac6 }
            r2.<init>(r5)     // Catch:{ all -> 0x0ac6 }
            throw r2     // Catch:{ all -> 0x0ac6 }
        L_0x0ac6:
            r0 = move-exception
            goto L_0x0acf
        L_0x0ac8:
            r0 = move-exception
            r17 = r4
            r9 = r8
            r4 = 3
            r8 = r30
        L_0x0acf:
            r2 = r0
        L_0x0ad0:
            r5 = 2
            goto L_0x0b1b
        L_0x0ad2:
            r0 = move-exception
            r17 = r4
            r9 = r8
            r4 = 3
            r5 = 2
            r8 = r30
            r2 = r0
            xfs r6 = defpackage.xfy.a     // Catch:{ all -> 0x0b08 }
            java.lang.Object r6 = r6.a()     // Catch:{ all -> 0x0b08 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0b08 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0b08 }
            if (r6 == 0) goto L_0x0aec
            r13.f()     // Catch:{ all -> 0x0b08 }
        L_0x0aec:
            throw r2     // Catch:{ all -> 0x0b08 }
        L_0x0aed:
            r17 = r4
            r9 = r8
            r4 = 3
            r5 = 2
            r8 = r30
            java.lang.String r2 = "FSA2_SyncDownPhotoCursor"
            java.lang.String r6 = "Failed to query photos need to sync down in CP2"
            android.util.Log.e(r2, r6)     // Catch:{ all -> 0x0b08 }
            xye r2 = new xye     // Catch:{ all -> 0x0b08 }
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch:{ all -> 0x0b08 }
            java.lang.String r10 = "Unable to query CP2."
            r6.<init>(r10)     // Catch:{ all -> 0x0b08 }
            r2.<init>(r6)     // Catch:{ all -> 0x0b08 }
            throw r2     // Catch:{ all -> 0x0b08 }
        L_0x0b08:
            r0 = move-exception
            goto L_0x0b1a
        L_0x0b0a:
            r0 = move-exception
            r17 = r4
            r9 = r8
            r4 = 3
            r5 = 2
            r8 = r30
            goto L_0x0b1a
        L_0x0b13:
            r0 = move-exception
            r17 = r4
            r9 = r8
            r4 = 3
            r5 = 2
            r8 = r6
        L_0x0b1a:
            r2 = r0
        L_0x0b1b:
            r6 = 0
            r9.a((boolean) r6)     // Catch:{ all -> 0x0b20 }
            throw r2     // Catch:{ all -> 0x0b20 }
        L_0x0b20:
            r0 = move-exception
            goto L_0x0b29
        L_0x0b22:
            r0 = move-exception
            r17 = r4
            r9 = r8
            r4 = 3
            r5 = 2
            r8 = r6
        L_0x0b29:
            r2 = r0
        L_0x0b2a:
            if (r3 == 0) goto L_0x0b38
            xkj r3 = defpackage.xkj.AFTER_SYNC     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            defpackage.xxv.a((defpackage.xkj) r3)     // Catch:{ xye -> 0x0b32, Exception -> 0x0bd3, all -> 0x0bce }
            goto L_0x0b38
        L_0x0b32:
            r0 = move-exception
        L_0x0b33:
            r9 = r1
            r4 = r17
            goto L_0x0c8a
        L_0x0b38:
            boolean r3 = defpackage.ayrt.c()     // Catch:{ xye -> 0x0b75, Exception -> 0x0bd3, all -> 0x0bce }
            if (r3 == 0) goto L_0x0b73
            xnb r3 = defpackage.xnb.c     // Catch:{ xye -> 0x0b75, Exception -> 0x0bd3, all -> 0x0bce }
            aucd r3 = r3.o()     // Catch:{ xye -> 0x0b75, Exception -> 0x0bd3, all -> 0x0bce }
            ybu r6 = r9.p     // Catch:{ xye -> 0x0b75, Exception -> 0x0bd3, all -> 0x0bce }
            boolean r6 = r6.b     // Catch:{ xye -> 0x0b75, Exception -> 0x0bd3, all -> 0x0bce }
            if (r6 != 0) goto L_0x0b4c
            r15 = 3
            goto L_0x0b4d
        L_0x0b4c:
            r15 = 2
        L_0x0b4d:
            boolean r4 = r3.c     // Catch:{ xye -> 0x0b75, Exception -> 0x0bd3, all -> 0x0bce }
            if (r4 != 0) goto L_0x0b53
            r6 = 0
            goto L_0x0b59
        L_0x0b53:
            r3.c()     // Catch:{ xye -> 0x0b75, Exception -> 0x0bd3, all -> 0x0bce }
            r6 = 0
            r3.c = r6     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
        L_0x0b59:
            aucj r4 = r3.b     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            xnb r4 = (defpackage.xnb) r4     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            int r15 = r15 + -1
            r4.b = r15     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            int r5 = r4.a     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            r10 = 1
            r5 = r5 | r10
            r4.a = r5     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            yaz r4 = r9.j     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            aucj r3 = r3.i()     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            xnb r3 = (defpackage.xnb) r3     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            r4.a((defpackage.xnb) r3)     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            goto L_0x0b74
        L_0x0b73:
            r6 = 0
        L_0x0b74:
            throw r2     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
        L_0x0b75:
            r0 = move-exception
            r6 = 0
            goto L_0x0c5d
        L_0x0b79:
            r0 = move-exception
            r10 = r0
            r9 = r1
            goto L_0x0c72
        L_0x0b7e:
            r0 = move-exception
            r8 = r6
            goto L_0x0bd4
        L_0x0b81:
            r0 = move-exception
            r8 = r6
            r6 = 0
            goto L_0x0c53
        L_0x0b86:
            r0 = move-exception
            r8 = r6
            r2 = r0
            goto L_0x027b
        L_0x0b8b:
            r0 = move-exception
            r8 = r6
            r6 = 0
            r1 = r0
            r9 = r23
            goto L_0x0c8c
        L_0x0b93:
            r17 = r4
            r8 = r6
            r1 = r23
            r5 = 2
            r6 = 0
            java.lang.String r3 = r8.name     // Catch:{ xye -> 0x0c5c, Exception -> 0x0c59, all -> 0x0c55 }
            if (r3 != 0) goto L_0x0b9f
            goto L_0x0bd8
        L_0x0b9f:
            java.lang.String r4 = "@youtube.com"
            boolean r3 = r3.endsWith(r4)     // Catch:{ xye -> 0x0c5c, Exception -> 0x0c59, all -> 0x0c55 }
            if (r3 != 0) goto L_0x0bd8
            r3 = 1
            android.content.ContentResolver.setIsSyncable(r8, r2, r3)     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            android.content.ContentResolver.setSyncAutomatically(r8, r2, r3)     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            ayta r3 = defpackage.ayta.a     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            aytb r3 = r3.a()     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            boolean r3 = r3.c()     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            if (r3 != 0) goto L_0x0bd8
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            r3.<init>()     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r4 = "force"
            r9 = 1
            r3.putBoolean(r4, r9)     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r4 = "expedited"
            r3.putBoolean(r4, r9)     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            android.content.ContentResolver.requestSync(r8, r2, r3)     // Catch:{ xye -> 0x0c5c, Exception -> 0x0bd3, all -> 0x0bce }
            goto L_0x0bd8
        L_0x0bce:
            r0 = move-exception
        L_0x0bcf:
            r10 = r0
            r9 = r1
            goto L_0x0d5a
        L_0x0bd3:
            r0 = move-exception
        L_0x0bd4:
            r2 = r0
            r9 = r1
            goto L_0x0c79
        L_0x0bd8:
            java.lang.String r2 = "Done initializing new account, sync neither attempted nor performed"
            r4 = r17
            android.util.Log.w(r4, r2)     // Catch:{ xye -> 0x0c52, Exception -> 0x0c59, all -> 0x0c55 }
            boolean r2 = defpackage.ayug.b()     // Catch:{ xye -> 0x0c52, Exception -> 0x0c59, all -> 0x0c55 }
            if (r2 == 0) goto L_0x0c36
            xwl r2 = new xwl     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            wss r3 = r7.g     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r9 = r8.name     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            r2.<init>(r3, r1, r9)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            wss r3 = r2.a     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r9 = r2.c     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            r3.d((java.lang.String) r9, (int) r5)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            wss r3 = r2.a     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r5 = r2.c     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            r11 = 0
            defpackage.iva.b((java.lang.String) r11)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            android.content.SharedPreferences r3 = r3.a     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r11 = "focus_first_full_sync_initial_timestamp_"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            int r12 = r5.length()     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            if (r12 != 0) goto L_0x0c19
            java.lang.String r5 = new java.lang.String     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            r5.<init>(r11)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            goto L_0x0c1d
        L_0x0c19:
            java.lang.String r5 = r11.concat(r5)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
        L_0x0c1d:
            android.content.SharedPreferences$Editor r3 = r3.putLong(r5, r9)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            r3.commit()     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            wss r3 = r2.a     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r5 = r2.c     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            r3.i(r5)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            wss r3 = r2.a     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            java.lang.String r5 = r2.c     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            r3.j(r5)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
            r3 = 1
            r2.a(r3)     // Catch:{ xye -> 0x0c52, Exception -> 0x0bd3, all -> 0x0bce }
        L_0x0c36:
            android.content.Context r2 = r7.c     // Catch:{ xye -> 0x0c52, Exception -> 0x0c59, all -> 0x0c55 }
            java.lang.String r3 = r8.name     // Catch:{ xye -> 0x0c52, Exception -> 0x0c59, all -> 0x0c55 }
            java.lang.String r5 = "@onPerformSync Sync is not required and hence skipped."
            a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r5)     // Catch:{ xye -> 0x0c52, Exception -> 0x0c59, all -> 0x0c55 }
            r2 = 10
            r1.m = r2     // Catch:{ xye -> 0x0c52, Exception -> 0x0c59, all -> 0x0c55 }
        L_0x0c43:
            r6 = 0
            r9 = r1
        L_0x0c45:
            r1 = r29
            r2 = r33
            r3 = r9
            r4 = r30
            r5 = r31
            r1.a((android.content.SyncResult) r2, (defpackage.yaz) r3, (android.accounts.Account) r4, (android.os.Bundle) r5, (java.lang.Exception) r6)
            return
        L_0x0c52:
            r0 = move-exception
        L_0x0c53:
            r9 = r1
            goto L_0x0c8b
        L_0x0c55:
            r0 = move-exception
            r9 = r1
            goto L_0x0d59
        L_0x0c59:
            r0 = move-exception
            r9 = r1
            goto L_0x0c78
        L_0x0c5c:
            r0 = move-exception
        L_0x0c5d:
            r9 = r1
            r4 = r17
            goto L_0x0c8b
        L_0x0c61:
            r0 = move-exception
            r9 = r23
            goto L_0x0c71
        L_0x0c65:
            r0 = move-exception
            r8 = r6
            r9 = r23
            goto L_0x0c78
        L_0x0c6a:
            r0 = move-exception
            r8 = r6
            r9 = r23
            goto L_0x0c8a
        L_0x0c6f:
            r0 = move-exception
            r9 = r14
        L_0x0c71:
            r10 = r0
        L_0x0c72:
            r8 = r6
            goto L_0x0d5a
        L_0x0c75:
            r0 = move-exception
            r8 = r6
            r9 = r14
        L_0x0c78:
            r2 = r0
        L_0x0c79:
            r1 = r29
            r3 = r33
            r4 = r9
            r5 = r31
            r6 = r30
            java.lang.Exception r6 = r1.a((java.lang.Exception) r2, (android.content.SyncResult) r3, (defpackage.yaz) r4, (android.os.Bundle) r5, (android.accounts.Account) r6)     // Catch:{ all -> 0x0d58 }
        L_0x0c86:
            goto L_0x0c45
        L_0x0c87:
            r0 = move-exception
            r8 = r6
            r9 = r14
        L_0x0c8a:
            r6 = 0
        L_0x0c8b:
            r1 = r0
        L_0x0c8c:
            java.lang.Exception r2 = r1.a     // Catch:{ all -> 0x0d58 }
            r1 = r29
            r3 = r33
            r10 = r4
            r4 = r9
            r11 = 0
            r5 = r31
            r6 = r30
            java.lang.Exception r6 = r1.a((java.lang.Exception) r2, (android.content.SyncResult) r3, (defpackage.yaz) r4, (android.os.Bundle) r5, (android.accounts.Account) r6)     // Catch:{ all -> 0x0d58 }
            int r1 = r9.m     // Catch:{ all -> 0x0d58 }
            r2 = 7
            if (r1 != r2) goto L_0x0ca3
            goto L_0x0ca6
        L_0x0ca3:
            r2 = 4
            if (r1 != r2) goto L_0x0c86
        L_0x0ca6:
            java.lang.String r1 = r8.name     // Catch:{ all -> 0x0d58 }
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ all -> 0x0d58 }
            defpackage.xip.a()     // Catch:{ all -> 0x0d58 }
            wss r1 = r7.g     // Catch:{ all -> 0x0d58 }
            java.lang.String r2 = r8.name     // Catch:{ all -> 0x0d58 }
            android.content.SharedPreferences r1 = r1.a     // Catch:{ all -> 0x0d58 }
            java.lang.String r3 = "focus_sync_backoff_sec_"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0d58 }
            int r4 = r2.length()     // Catch:{ all -> 0x0d58 }
            if (r4 != 0) goto L_0x0cc6
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0d58 }
            r2.<init>(r3)     // Catch:{ all -> 0x0d58 }
            goto L_0x0cca
        L_0x0cc6:
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0d58 }
        L_0x0cca:
            int r1 = r1.getInt(r2, r11)     // Catch:{ all -> 0x0d58 }
            ayrj r2 = defpackage.ayrj.a     // Catch:{ all -> 0x0d58 }
            aytn r2 = r2.a()     // Catch:{ all -> 0x0d58 }
            boolean r2 = r2.C()     // Catch:{ all -> 0x0d58 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0d58 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d58 }
            ayrj r3 = defpackage.ayrj.a     // Catch:{ all -> 0x0d58 }
            aytn r3 = r3.a()     // Catch:{ all -> 0x0d58 }
            long r3 = r3.aK()     // Catch:{ all -> 0x0d58 }
            int r4 = (int) r3     // Catch:{ all -> 0x0d58 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0d58 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0d58 }
            ayrj r4 = defpackage.ayrj.a     // Catch:{ all -> 0x0d58 }
            aytn r4 = r4.a()     // Catch:{ all -> 0x0d58 }
            long r4 = r4.c()     // Catch:{ all -> 0x0d58 }
            int r5 = (int) r4     // Catch:{ all -> 0x0d58 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d58 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0d58 }
            if (r1 > 0) goto L_0x0d0e
            if (r4 <= 0) goto L_0x0d0c
            r1 = r4
            goto L_0x0d16
        L_0x0d0c:
            r1 = r3
            goto L_0x0d16
        L_0x0d0e:
            if (r2 != 0) goto L_0x0d11
            goto L_0x0d16
        L_0x0d11:
            int r1 = r1 + r1
            int r1 = java.lang.Math.min(r3, r1)     // Catch:{ all -> 0x0d58 }
        L_0x0d16:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0d58 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0d58 }
            r3[r11] = r2     // Catch:{ all -> 0x0d58 }
            java.lang.String r2 = "backoff=%d"
            defpackage.xdt.a((java.lang.String) r10, (java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ all -> 0x0d58 }
            wss r2 = r7.g     // Catch:{ all -> 0x0d58 }
            java.lang.String r3 = r8.name     // Catch:{ all -> 0x0d58 }
            r2.c((java.lang.String) r3, (int) r1)     // Catch:{ all -> 0x0d58 }
            if (r1 <= 0) goto L_0x0c86
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0d58 }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0d58 }
            double r12 = (double) r1
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            java.lang.Double.isNaN(r12)
            double r12 = r12 / r14
            java.lang.Double r5 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x0d58 }
            r4[r11] = r5     // Catch:{ all -> 0x0d58 }
            java.lang.String r5 = " Delaying %f minutes."
            defpackage.xdt.a((java.lang.String) r10, (java.lang.String) r5, (java.lang.Object[]) r4)     // Catch:{ all -> 0x0d58 }
            android.content.SyncResult r4 = r9.a     // Catch:{ all -> 0x0d58 }
            long r10 = r4.delayUntil     // Catch:{ all -> 0x0d58 }
            long r2 = r2 / r21
            long r12 = (long) r1     // Catch:{ all -> 0x0d58 }
            long r2 = r2 + r12
            long r1 = java.lang.Math.max(r10, r2)     // Catch:{ all -> 0x0d58 }
            r4.delayUntil = r1     // Catch:{ all -> 0x0d58 }
            r9.p = r12     // Catch:{ all -> 0x0d58 }
            goto L_0x0c86
        L_0x0d58:
            r0 = move-exception
        L_0x0d59:
            r10 = r0
        L_0x0d5a:
            r6 = 0
            r1 = r29
            r2 = r33
            r3 = r9
            r4 = r30
            r5 = r31
            r1.a((android.content.SyncResult) r2, (defpackage.yaz) r3, (android.accounts.Account) r4, (android.os.Bundle) r5, (java.lang.Exception) r6)
            goto L_0x0d69
        L_0x0d68:
            throw r10
        L_0x0d69:
            goto L_0x0d68
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvh.a(android.accounts.Account, android.os.Bundle, java.lang.String, android.content.SyncResult):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.accounts.Account r26, android.os.Bundle r27, defpackage.yaz r28, java.lang.Exception r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            wml r2 = defpackage.wml.a()
            android.content.Context r4 = r0.c
            java.lang.String r5 = r1.name
            int r9 = defpackage.ybj.b(r27)
            int r18 = defpackage.ybi.a(r29)
            long r6 = android.os.SystemClock.elapsedRealtime()
            r15 = r28
            ybh r15 = (defpackage.ybh) r15
            long r10 = r15.l
            long r12 = r6 - r10
            xny r3 = defpackage.xny.w
            aucd r19 = r3.o()
            java.lang.String r3 = r15.q
            amri r6 = defpackage.amri.c(r3)
            int r7 = r15.n
            int r3 = r15.m
            int r11 = defpackage.xnx.a(r3)
            xnq r3 = defpackage.xnq.h
            aucd r3 = r3.o()
            xno r8 = defpackage.xno.o
            aucd r8 = r8.o()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            defpackage.xip.a()
            xfs r14 = defpackage.xgd.a
            java.lang.Object r14 = r14.a()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r20 = r2
            if (r14 != 0) goto L_0x006e
            defpackage.xip.a()
            xfs r14 = defpackage.xge.a
            java.lang.Object r14 = r14.a()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            r23 = r12
            goto L_0x017e
        L_0x006e:
            java.util.Map r14 = r15.d
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x017c
            java.util.Map r14 = r15.d
            java.util.Set r14 = r14.keySet()
            java.util.Map r2 = r15.b
            java.util.Set r2 = r2.keySet()
            angk r2 = defpackage.angm.a((java.util.Set) r14, (java.util.Set) r2)
            angc r2 = (defpackage.angc) r2
            anhj r2 = r2.iterator()
        L_0x008c:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x0162
            java.lang.Object r14 = r2.next()
            ybd r14 = (defpackage.ybd) r14
            xng r21 = defpackage.xng.l
            r22 = r2
            aucd r2 = r21.o()
            xnd r1 = r14.a
            boolean r0 = r2.c
            if (r0 == 0) goto L_0x00ac
            r2.c()
            r0 = 0
            r2.c = r0
        L_0x00ac:
            aucj r0 = r2.b
            xng r0 = (defpackage.xng) r0
            int r1 = r1.e
            r0.b = r1
            int r1 = r0.a
            r16 = 1
            r1 = r1 | 1
            r0.a = r1
            r23 = r12
            xjo r12 = r14.b
            int r12 = r12.h
            r0.c = r12
            r1 = r1 | 2
            r0.a = r1
            boolean r12 = r14.c
            r1 = r1 | 4
            r0.a = r1
            r0.d = r12
            java.util.Map r0 = r15.b
            boolean r0 = r0.containsKey(r14)
            if (r0 == 0) goto L_0x0111
            java.util.Map r0 = r15.b
            java.lang.Object r0 = r0.get(r14)
            xng r0 = (defpackage.xng) r0
            int r1 = r0.e
            boolean r12 = r2.c
            if (r12 != 0) goto L_0x00e7
            goto L_0x00ed
        L_0x00e7:
            r2.c()
            r12 = 0
            r2.c = r12
        L_0x00ed:
            aucj r12 = r2.b
            xng r12 = (defpackage.xng) r12
            int r13 = r12.a
            r13 = r13 | 8
            r12.a = r13
            r12.e = r1
            int r1 = r0.f
            r13 = r13 | 16
            r12.a = r13
            r12.f = r1
            int r1 = r0.g
            r13 = r13 | 32
            r12.a = r13
            r12.g = r1
            int r0 = r0.h
            r1 = r13 | 64
            r12.a = r1
            r12.h = r0
        L_0x0111:
            java.util.Map r0 = r15.d
            boolean r0 = r0.containsKey(r14)
            if (r0 == 0) goto L_0x014f
            java.util.Map r0 = r15.d
            java.lang.Object r0 = r0.get(r14)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            amqy r1 = defpackage.ybc.a
            java.lang.Iterable r0 = defpackage.anbs.a((java.lang.Iterable) r0, (defpackage.amqy) r1)
            boolean r1 = r2.c
            if (r1 != 0) goto L_0x0130
            goto L_0x0136
        L_0x0130:
            r2.c()
            r1 = 0
            r2.c = r1
        L_0x0136:
            aucj r1 = r2.b
            xng r1 = (defpackage.xng) r1
            aucx r12 = r1.i
            boolean r12 = r12.a()
            if (r12 != 0) goto L_0x014a
            aucx r12 = r1.i
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)
            r1.i = r12
        L_0x014a:
            aucx r1 = r1.i
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)
        L_0x014f:
            aucj r0 = r2.i()
            xng r0 = (defpackage.xng) r0
            r10.put(r14, r0)
            r0 = r25
            r1 = r26
            r2 = r22
            r12 = r23
            goto L_0x008c
        L_0x0162:
            r23 = r12
            java.util.Collection r0 = r10.values()
            int r1 = r10.size()
            xng[] r1 = new defpackage.xng[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            xng[] r0 = (defpackage.xng[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r8.ad(r0)
            goto L_0x0199
        L_0x017c:
            r23 = r12
        L_0x017e:
            java.util.Map r0 = r15.b
            java.util.Collection r0 = r0.values()
            java.util.Map r1 = r15.b
            int r1 = r1.size()
            xng[] r1 = new defpackage.xng[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            xng[] r0 = (defpackage.xng[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r8.ad(r0)
        L_0x0199:
            java.util.Map r0 = r15.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a2
            goto L_0x01f3
        L_0x01a2:
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x01a7
            goto L_0x01ad
        L_0x01a7:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x01ad:
            aucj r0 = r3.b
            xnq r0 = (defpackage.xnq) r0
            aucx r1 = defpackage.aucj.s()
            r0.g = r1
            java.util.Map r0 = r15.c
            java.util.Collection r0 = r0.values()
            java.util.Map r1 = r15.c
            int r1 = r1.size()
            xnp[] r1 = new defpackage.xnp[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            xnp[] r0 = (defpackage.xnp[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x01d4
            goto L_0x01da
        L_0x01d4:
            r3.c()
            r1 = 0
            r3.c = r1
        L_0x01da:
            aucj r1 = r3.b
            xnq r1 = (defpackage.xnq) r1
            aucx r2 = r1.g
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x01ee
            aucx r2 = r1.g
            aucx r2 = defpackage.aucj.a((defpackage.aucx) r2)
            r1.g = r2
        L_0x01ee:
            aucx r1 = r1.g
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)
        L_0x01f3:
            boolean r0 = r15.g
            if (r0 != 0) goto L_0x01f8
            goto L_0x0211
        L_0x01f8:
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x01fd
            goto L_0x0203
        L_0x01fd:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0203:
            aucj r0 = r3.b
            xnq r0 = (defpackage.xnq) r0
            int r1 = r0.a
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r2
            r0.a = r1
            r1 = 1
            r0.d = r1
        L_0x0211:
            boolean r0 = r15.i
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x0218
            goto L_0x021e
        L_0x0218:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x021e:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            int r2 = r1.a
            r10 = 1
            r2 = r2 | r10
            r1.a = r2
            r1.c = r0
            boolean r0 = r15.h
            r2 = r2 | 2
            r1.a = r2
            r1.d = r0
            int r0 = r15.A
            int r10 = r0 + -1
            r21 = 0
            if (r0 == 0) goto L_0x04a7
            r1.h = r10
            r0 = r2 | 8
            r1.a = r0
            boolean r0 = r15.s
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x0247
            goto L_0x024d
        L_0x0247:
            r3.c()
            r1 = 0
            r3.c = r1
        L_0x024d:
            aucj r1 = r3.b
            xnq r1 = (defpackage.xnq) r1
            int r2 = r1.a
            r10 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r10
            r1.a = r2
            r1.e = r0
            java.util.List r0 = r15.e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0288
            java.util.List r0 = r15.e
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x0269
            goto L_0x026f
        L_0x0269:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x026f:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            aucx r2 = r1.f
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0283
            aucx r2 = r1.f
            aucx r2 = defpackage.aucj.a((defpackage.aucx) r2)
            r1.f = r2
        L_0x0283:
            aucx r1 = r1.f
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)
        L_0x0288:
            java.util.List r0 = r15.f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02b6
            java.util.List r0 = r15.f
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x0297
            goto L_0x029d
        L_0x0297:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x029d:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            aucx r2 = r1.g
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x02b1
            aucx r2 = r1.g
            aucx r2 = defpackage.aucj.a((defpackage.aucx) r2)
            r1.g = r2
        L_0x02b1:
            aucx r1 = r1.g
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)
        L_0x02b6:
            int r0 = r15.o
            if (r0 > 0) goto L_0x02bb
            goto L_0x02d2
        L_0x02bb:
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x02c0
            goto L_0x02c6
        L_0x02c0:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x02c6:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            int r2 = r1.a
            r2 = r2 | 4
            r1.a = r2
            r1.e = r0
        L_0x02d2:
            ayug r0 = defpackage.ayug.a
            ayuh r0 = r0.a()
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0304
            boolean r0 = r15.t
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x02e5
            goto L_0x02eb
        L_0x02e5:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x02eb:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            int r2 = r1.a
            r2 = r2 | 16
            r1.a = r2
            r1.i = r0
            xnh r0 = r15.u
            if (r0 == 0) goto L_0x0304
            r0.getClass()
            r1.j = r0
            r0 = r2 | 32
            r1.a = r0
        L_0x0304:
            amri r0 = r15.w
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x032e
            amri r0 = r15.w
            java.lang.Object r0 = r0.b()
            xnb r0 = (defpackage.xnb) r0
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x0319
            goto L_0x031f
        L_0x0319:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x031f:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            r0.getClass()
            r1.k = r0
            int r0 = r1.a
            r0 = r0 | 64
            r1.a = r0
        L_0x032e:
            amri r0 = r15.x
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0358
            amri r0 = r15.x
            java.lang.Object r0 = r0.b()
            xna r0 = (defpackage.xna) r0
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x0343
            goto L_0x0349
        L_0x0343:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x0349:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            r0.getClass()
            r1.l = r0
            int r0 = r1.a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.a = r0
        L_0x0358:
            amri r0 = r15.y
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0381
            amri r0 = r15.y
            java.lang.Object r0 = r0.b()
            xkc r0 = (defpackage.xkc) r0
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x036d
            goto L_0x0373
        L_0x036d:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x0373:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            int r0 = r0.j
            r1.n = r0
            int r0 = r1.a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.a = r0
        L_0x0381:
            boolean r0 = defpackage.ayug.g()
            if (r0 == 0) goto L_0x0406
            java.util.Map r0 = r15.z
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0391:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0406
            java.lang.Object r1 = r0.next()
            ybf r1 = (defpackage.ybf) r1
            xnj r2 = defpackage.xnj.e
            aucd r2 = r2.o()
            int r10 = r1.a
            boolean r12 = r2.c
            if (r12 == 0) goto L_0x03af
            r2.c()
            r12 = 0
            r2.c = r12
        L_0x03af:
            aucj r12 = r2.b
            xnj r12 = (defpackage.xnj) r12
            int r13 = r12.a
            r14 = 1
            r13 = r13 | r14
            r12.a = r13
            r12.b = r10
            java.lang.String r10 = r1.b
            r10.getClass()
            r13 = r13 | 2
            r12.a = r13
            r12.c = r10
            java.util.Map r10 = r15.z
            java.lang.Object r1 = r10.get(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r10 = r2.c
            if (r10 != 0) goto L_0x03d3
            goto L_0x03d9
        L_0x03d3:
            r2.c()
            r10 = 0
            r2.c = r10
        L_0x03d9:
            aucj r10 = r2.b
            xnj r10 = (defpackage.xnj) r10
            r10.a()
            aucx r10 = r10.d
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r10)
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x03ea
            goto L_0x03f0
        L_0x03ea:
            r8.c()
            r1 = 0
            r8.c = r1
        L_0x03f0:
            aucj r1 = r8.b
            xno r1 = (defpackage.xno) r1
            aucj r2 = r2.i()
            xnj r2 = (defpackage.xnj) r2
            r2.getClass()
            r1.a()
            aucx r1 = r1.m
            r1.add(r2)
            goto L_0x0391
        L_0x0406:
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x040b
            goto L_0x0411
        L_0x040b:
            r3.c()
            r0 = 0
            r3.c = r0
        L_0x0411:
            aucj r0 = r3.b
            xnq r0 = (defpackage.xnq) r0
            aucj r1 = r8.i()
            xno r1 = (defpackage.xno) r1
            r1.getClass()
            r0.f = r1
            int r1 = r0.b
            r1 = r1 | 2
            r0.b = r1
            r10 = 3
            r14 = 0
            r0 = 0
            aucj r1 = r3.i()
            r16 = r1
            xnq r16 = (defpackage.xnq) r16
            r17 = 0
            java.lang.String r8 = "80"
            r3 = r19
            r12 = r23
            r1 = r15
            r15 = r0
            defpackage.wml.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            int r0 = r1.m
            int r11 = defpackage.xnx.a(r0)
            int r14 = r1.j
            int r15 = r1.k
            long r2 = r1.p
            ybg r0 = r1.r
            if (r0 == 0) goto L_0x0451
            java.lang.String r0 = r0.a
            goto L_0x0453
        L_0x0451:
            r0 = r21
        L_0x0453:
            r10 = r19
            r12 = r18
            r13 = r29
            r16 = r2
            r18 = r0
            defpackage.wml.a(r10, r11, r12, r13, r14, r15, r16, r18)
            aucj r0 = r19.i()
            r4 = r0
            xny r4 = (defpackage.xny) r4
            defpackage.xip.a()
            xfs r0 = defpackage.xgh.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0494
            java.lang.String r0 = "REQUESTER"
            java.lang.String r1 = "UNKNOWN"
            r2 = r27
            java.lang.String r6 = r2.getString(r0, r1)
            r0 = r25
            android.content.Context r2 = r0.c
            r1 = r26
            java.lang.String r3 = r1.name
            xli[] r5 = r28.d()
            r1 = r20
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x0494:
            r0 = r25
            r1 = r26
            android.content.Context r2 = r0.c
            java.lang.String r3 = r1.name
            xli[] r5 = r28.d()
            r6 = 0
            r1 = r20
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x04a7:
            r0 = r25
            goto L_0x04ab
        L_0x04aa:
            throw r21
        L_0x04ab:
            goto L_0x04aa
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvh.a(android.accounts.Account, android.os.Bundle, yaz, java.lang.Exception):void");
    }
}
