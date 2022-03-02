package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Log;

/* renamed from: xxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxr extends xxu {
    private static final String[] m = {"_id"};
    public final ybu a;
    public final xvw b;
    public final xyx c;
    public final Uri d;
    public final Context e;
    public final amri f;
    public final xwt g;
    private final xyt n;
    private final amri o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xxr(Context context, xwt xwt, ContentResolver contentResolver, Account account, yaz yaz, xvp xvp, xyt xyt, yav yav, ybu ybu, amri amri, amri amri2) {
        super(contentResolver, account, yaz, yav, xvp);
        Account account2 = account;
        this.e = context;
        this.g = xwt;
        this.n = xyt;
        yaz yaz2 = yaz;
        this.b = new xvw(account, contentResolver, yaz);
        xvp xvp2 = xvp;
        this.c = new xyx(account, this.h, this.b, xvp);
        this.a = ybu;
        this.d = xvw.a(ContactsContract.Data.CONTENT_URI, account);
        this.f = amri;
        this.o = amri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "FSA2_PhotoSyncer"
            r1 = -1
            r2 = 0
            android.content.ContentResolver r3 = r9.h     // Catch:{ Exception -> 0x0027, all -> 0x0025 }
            android.net.Uri r4 = r9.d     // Catch:{ Exception -> 0x0027, all -> 0x0025 }
            java.lang.String[] r5 = m     // Catch:{ Exception -> 0x0027, all -> 0x0025 }
            java.lang.String[] r6 = defpackage.xvw.a     // Catch:{ Exception -> 0x0027, all -> 0x0025 }
            r7 = 0
            r8 = 0
            r6 = r10
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0027, all -> 0x0025 }
            if (r2 != 0) goto L_0x001b
            java.lang.String r10 = "Couldn't get the photo cursor."
            android.util.Log.e(r0, r10)     // Catch:{ Exception -> 0x0023 }
            return r1
        L_0x001b:
            int r10 = r2.getCount()     // Catch:{ Exception -> 0x0023 }
            r2.close()
            return r10
        L_0x0023:
            r10 = move-exception
            goto L_0x0028
        L_0x0025:
            r10 = move-exception
            goto L_0x0034
        L_0x0027:
            r10 = move-exception
        L_0x0028:
            java.lang.String r3 = "Exception found when query photo count"
            android.util.Log.e(r0, r3, r10)     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0032
            r2.close()
        L_0x0032:
            return r1
        L_0x0033:
            r10 = move-exception
        L_0x0034:
            if (r2 == 0) goto L_0x0039
            r2.close()
        L_0x0039:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxr.a(java.lang.String):int");
    }

    public final void b() {
        ContentResolver contentResolver = this.h;
        Uri uri = this.d;
        xwt xwt = this.g;
        yaz yaz = this.j;
        xvp xvp = this.k;
        xyt xyt = this.n;
        amri amri = this.o;
        String[] strArr = xwf.b;
        String[] strArr2 = xvw.a;
        Cursor query = contentResolver.query(uri, strArr, "mimetype='vnd.android.cursor.item/photo' AND sourceid IS NOT NULL AND (data_sync4 IS NULL OR data_sync4!=(data_version+10)) ", (String[]) null, (String) null);
        if (query != null) {
            xwf xwf = new xwf(query, xwt, yaz, xvp, xyt, amri);
            try {
                a((xwa) xwf, false);
                xip.a();
                if (((Boolean) xfy.a.a()).booleanValue()) {
                    xwf.f();
                }
            } catch (Throwable th) {
                xip.a();
                if (((Boolean) xfy.a.a()).booleanValue()) {
                    xwf.f();
                }
                throw th;
            }
        } else {
            Log.e("FSA2_SyncUpPhotoCursor", "Failed to query photos need to sync up in CP2.");
            throw new xye(new RemoteException("Unable to query CP2."));
        }
    }

    public final void a(String str, xjo xjo) {
        this.j.a(xjo, xkj.AFTER_SYNC, xjm.CP2, a(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.xwa r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "FSA_photoSyncUp"
            java.lang.String r1 = "FSA_photoSyncDown"
            yav r2 = r7.l
            r2.a()
            defpackage.xip.a()
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L_0x0028
            xfs r4 = defpackage.xgk.a
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0028
            amri r4 = r7.f
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            if (r9 != 0) goto L_0x0042
            xfs r5 = defpackage.xgn.a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0042
            amri r5 = r7.o
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x0055
            amri r5 = r7.f
            java.lang.Object r5 = r5.b()
            xxg r5 = (defpackage.xxg) r5
            int r6 = r8.c()
            r5.c(r6)
            goto L_0x0066
        L_0x0055:
            if (r2 == 0) goto L_0x0066
            amri r5 = r7.o
            java.lang.Object r5 = r5.b()
            xxj r5 = (defpackage.xxj) r5
            int r6 = r8.c()
            r5.c(r6)
        L_0x0066:
            java.lang.Object r5 = r8.b()     // Catch:{ all -> 0x00ba }
            android.content.ContentProviderOperation$Builder r5 = (android.content.ContentProviderOperation.Builder) r5     // Catch:{ all -> 0x00ba }
        L_0x006c:
            if (r5 == 0) goto L_0x008b
            xvw r6 = r7.b     // Catch:{ all -> 0x0089 }
            r6.a((android.content.ContentProviderOperation.Builder) r5)     // Catch:{ all -> 0x0089 }
            if (r9 != 0) goto L_0x007b
            xvw r5 = r7.b     // Catch:{ all -> 0x0089 }
            r5.a()     // Catch:{ all -> 0x0089 }
            goto L_0x0080
        L_0x007b:
            xvw r5 = r7.b     // Catch:{ all -> 0x0089 }
            r5.b()     // Catch:{ all -> 0x0089 }
        L_0x0080:
            int r3 = r3 + 1
            java.lang.Object r5 = r8.b()     // Catch:{ all -> 0x0089 }
            android.content.ContentProviderOperation$Builder r5 = (android.content.ContentProviderOperation.Builder) r5     // Catch:{ all -> 0x0089 }
            goto L_0x006c
        L_0x0089:
            r5 = move-exception
            goto L_0x00bb
        L_0x008b:
            if (r9 != 0) goto L_0x0092
            xvw r5 = r7.b     // Catch:{ all -> 0x0089 }
            r5.b()     // Catch:{ all -> 0x0089 }
        L_0x0092:
            if (r4 == 0) goto L_0x00a0
            amri r2 = r7.f
            java.lang.Object r2 = r2.b()
            xxg r2 = (defpackage.xxg) r2
            r2.g()
            goto L_0x00ad
        L_0x00a0:
            if (r2 == 0) goto L_0x00ad
            amri r2 = r7.o
            java.lang.Object r2 = r2.b()
            xxj r2 = (defpackage.xxj) r2
            r2.g()
        L_0x00ad:
            if (r9 != 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r0 = r1
        L_0x00b1:
            yav r9 = r7.l
            r9.a(r0, r3)
            r8.f()
            return
        L_0x00ba:
            r5 = move-exception
        L_0x00bb:
            if (r4 == 0) goto L_0x00c9
            amri r2 = r7.f
            java.lang.Object r2 = r2.b()
            xxg r2 = (defpackage.xxg) r2
            r2.g()
            goto L_0x00d6
        L_0x00c9:
            if (r2 == 0) goto L_0x00d6
            amri r2 = r7.o
            java.lang.Object r2 = r2.b()
            xxj r2 = (defpackage.xxj) r2
            r2.g()
        L_0x00d6:
            if (r9 != 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r0 = r1
        L_0x00da:
            yav r9 = r7.l
            r9.a(r0, r3)
            r8.f()
            goto L_0x00e4
        L_0x00e3:
            throw r5
        L_0x00e4:
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxr.a(xwa, boolean):void");
    }
}
