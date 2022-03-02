package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.auth.managed.DownloadStatusResponse;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: gjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gjh {
    public static final iwd a = ehv.a("AuthManaged", "AuthManagedHelper");
    private static gjh b;

    public static gje a(Context context, String str, avwi avwi, Account account, Bundle bundle, Boolean bool, boolean z, String str2) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return new gje(new Status(21518, "getApplicationInfo returns null."), (Intent) null);
            }
            if (!applicationInfo.enabled) {
                try {
                    packageManager.setApplicationEnabledSetting(str, 1, 1);
                } catch (SecurityException e) {
                    return new gje(new Status(21519, "Failed to enable device management app."), (Intent) null);
                }
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return new gje(new Status(21520, "Failed to create launch intent."), (Intent) null);
            }
            Bundle bundle2 = new Bundle();
            if (account != null) {
                bundle2.putParcelable("account", account);
            }
            if (bool != null) {
                bundle2.putBoolean("is_setup_wizard", bool.booleanValue());
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putBoolean("is_from_google_settings", z);
            if (!TextUtils.isEmpty(str2)) {
                bundle2.putString("enrollment_link", str2);
            }
            if (avwi != null) {
                aucx aucx = avwi.l;
                int size = aucx.size();
                for (int i = 0; i < size; i++) {
                    avwh avwh = (avwh) aucx.get(i);
                    bundle2.putString(avwh.a, avwh.b);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            launchIntentForPackage.setFlags(0);
            return new gje(Status.a, launchIntentForPackage);
        } catch (PackageManager.NameNotFoundException e2) {
            return new gje(new Status(21518, "Package does not exist."), (Intent) null);
        }
    }

    public final void b(Context context, Account account) {
        iva.a((Object) account);
        try {
            ((Boolean) qub.a(context).a(account, new String[]{aeea.a("uca")}, (AccountManagerCallback) null).getResult()).booleanValue();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            a.d("Exception when checking account features for Unicorn.", e, new Object[0]);
        }
    }

    public static synchronized gjh a() {
        gjh gjh;
        synchronized (gjh.class) {
            if (b == null) {
                b = new gjh();
            }
            gjh = b;
        }
        return gjh;
    }

    public final int a(Context context, avwi avwi) {
        iva.a((Object) avwi);
        if ((avwi.a & 64) != 0) {
            try {
                return context.getPackageManager().getPackageInfo(avwi.b, 0).versionCode < avwi.g ? 2 : 3;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return 1;
    }

    public final avwi a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (avwi) aucj.a((aucj) avwi.n, bArr, aubs.c());
        } catch (auda e) {
            a.e("Failed to parse PackageInformation data: ", e, new Object[0]);
            return null;
        }
    }

    public final DownloadStatusResponse a(Context context, long j) {
        Cursor query;
        int i = 0;
        DownloadManager.Query filterById = new DownloadManager.Query().setFilterById(new long[]{j});
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        DownloadStatusResponse downloadStatusResponse = new DownloadStatusResponse(1, 0, 0);
        try {
            query = downloadManager.query(filterById);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i2 = query.getInt(query.getColumnIndex("status"));
                    if (i2 == 2) {
                        downloadStatusResponse.b = 21510;
                        long j2 = query.getLong(query.getColumnIndex("total_size"));
                        if (j2 > 0) {
                            i = (int) ((query.getLong(query.getColumnIndex("bytes_so_far")) * 100) / j2);
                        }
                    } else if (i2 == 4) {
                        downloadStatusResponse.b = 21509;
                    } else if (i2 == 8) {
                        downloadStatusResponse.b = 21508;
                    } else if (i2 != 16) {
                        downloadStatusResponse.b = 21512;
                    } else {
                        downloadStatusResponse.b = 21511;
                    }
                    query.close();
                    downloadStatusResponse.c = i;
                    return downloadStatusResponse;
                }
            }
            downloadStatusResponse.b = 21507;
            if (query != null) {
                query.close();
            }
            return downloadStatusResponse;
        } catch (SQLException | IllegalArgumentException e) {
            downloadStatusResponse.b = 21507;
            return downloadStatusResponse;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f6 A[Catch:{ InterruptedException | ExecutionException -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f7 A[Catch:{ InterruptedException | ExecutionException -> 0x0239 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gjd a(android.content.Context r8, android.accounts.Account r9) {
        /*
            r7 = this;
            java.lang.String r0 = "No device data version in the client."
            int r1 = android.os.Build.VERSION.SDK_INT
            defpackage.iva.a((java.lang.Object) r9)
            long r1 = defpackage.jhg.a((android.content.Context) r8)
            r3 = 0
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x002a
            iwd r8 = a
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r0 = "Checkin has not happened yet."
            r8.e(r0, r9)
            gjd r8 = new gjd
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status
            r0 = 21500(0x53fc, float:3.0128E-41)
            java.lang.String r1 = "Checkin not happened yet."
            r9.<init>(r0, r1)
            r8.<init>(r9)
            return r8
        L_0x002a:
            qub r4 = defpackage.qub.a((android.content.Context) r8)
            java.lang.String r9 = r4.a((android.accounts.Account) r9)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 == 0) goto L_0x004e
            iwd r8 = a
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r0 = "No token found for the account."
            r8.e(r0, r9)
            gjd r8 = new gjd
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status
            r1 = 21501(0x53fd, float:3.013E-41)
            r9.<init>(r1, r0)
            r8.<init>(r9)
            return r8
        L_0x004e:
            avpo r4 = defpackage.avpo.e
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 == 0) goto L_0x005d
            r4.c()
            r4.c = r3
        L_0x005d:
            aucj r5 = r4.b
            avpo r5 = (defpackage.avpo) r5
            r9.getClass()
            int r6 = r5.a
            r6 = r6 | 1
            r5.a = r6
            r5.b = r9
            java.lang.String r9 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x025b }
            boolean r5 = r4.c     // Catch:{ NameNotFoundException -> 0x025b }
            if (r5 != 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r4.c()     // Catch:{ NameNotFoundException -> 0x025b }
            r4.c = r3     // Catch:{ NameNotFoundException -> 0x025b }
        L_0x007a:
            aucj r5 = r4.b     // Catch:{ NameNotFoundException -> 0x025b }
            avpo r5 = (defpackage.avpo) r5     // Catch:{ NameNotFoundException -> 0x025b }
            r9.getClass()     // Catch:{ NameNotFoundException -> 0x025b }
            int r6 = r5.a     // Catch:{ NameNotFoundException -> 0x025b }
            r6 = r6 | 2
            r5.a = r6     // Catch:{ NameNotFoundException -> 0x025b }
            r5.c = r9     // Catch:{ NameNotFoundException -> 0x025b }
            java.lang.String r9 = defpackage.jhg.e(r8, r9)     // Catch:{ NameNotFoundException -> 0x025b }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x025b }
            java.lang.String r9 = r9.toLowerCase(r5)     // Catch:{ NameNotFoundException -> 0x025b }
            boolean r5 = r4.c     // Catch:{ NameNotFoundException -> 0x025b }
            if (r5 != 0) goto L_0x0098
            goto L_0x009d
        L_0x0098:
            r4.c()     // Catch:{ NameNotFoundException -> 0x025b }
            r4.c = r3     // Catch:{ NameNotFoundException -> 0x025b }
        L_0x009d:
            aucj r5 = r4.b     // Catch:{ NameNotFoundException -> 0x025b }
            avpo r5 = (defpackage.avpo) r5     // Catch:{ NameNotFoundException -> 0x025b }
            r9.getClass()     // Catch:{ NameNotFoundException -> 0x025b }
            int r6 = r5.a     // Catch:{ NameNotFoundException -> 0x025b }
            r6 = r6 | 4
            r5.a = r6     // Catch:{ NameNotFoundException -> 0x025b }
            r5.d = r9     // Catch:{ NameNotFoundException -> 0x025b }
            avwf r9 = defpackage.avwf.e
            aucd r9 = r9.o()
            boolean r5 = r9.c
            if (r5 != 0) goto L_0x00b7
            goto L_0x00bc
        L_0x00b7:
            r9.c()
            r9.c = r3
        L_0x00bc:
            aucj r5 = r9.b
            avwf r5 = (defpackage.avwf) r5
            int r6 = r5.a
            r6 = r6 | 2
            r5.a = r6
            r5.c = r1
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = r1.toLanguageTag()
            boolean r2 = r9.c
            if (r2 != 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            r9.c()
            r9.c = r3
        L_0x00dc:
            aucj r2 = r9.b
            avwf r2 = (defpackage.avwf) r2
            r1.getClass()
            int r5 = r2.a
            r5 = r5 | 1
            r2.a = r5
            r2.b = r1
            aucj r9 = r9.i()
            avwf r9 = (defpackage.avwf) r9
            r1 = 5
            java.lang.Object r1 = r9.c(r1)
            aucd r1 = (defpackage.aucd) r1
            r1.a((defpackage.aucj) r9)
            r9 = 21503(0x53ff, float:3.0132E-41)
            java.lang.String r2 = defpackage.gwc.b(r8)     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            if (r2 != 0) goto L_0x0128
            awot r5 = defpackage.awot.a     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            awou r5 = r5.a()     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            boolean r5 = r5.a()     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            if (r5 == 0) goto L_0x0128
            iwd r2 = a     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            r2.e(r0, r5)     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            boolean r2 = defpackage.awox.c()     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            if (r2 == 0) goto L_0x011d
            goto L_0x0161
        L_0x011d:
            gjd r2 = new gjd     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            r5.<init>(r9, r0)     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            return r2
        L_0x0128:
            boolean r0 = r1.c     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            if (r0 != 0) goto L_0x012d
            goto L_0x0132
        L_0x012d:
            r1.c()     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            r1.c = r3     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
        L_0x0132:
            aucj r0 = r1.b     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            avwf r0 = (defpackage.avwf) r0     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            r2.getClass()     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            int r5 = r0.a     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            r5 = r5 | 8
            r0.a = r5     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            r0.d = r2     // Catch:{ IOException -> 0x0146, hxw -> 0x0144, hxx -> 0x0142 }
            goto L_0x0161
        L_0x0142:
            r0 = move-exception
            goto L_0x0147
        L_0x0144:
            r0 = move-exception
            goto L_0x0147
        L_0x0146:
            r0 = move-exception
        L_0x0147:
            iwd r2 = a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "No device data version info."
            r2.e(r6, r0, r5)
            boolean r0 = defpackage.awox.c()
            if (r0 != 0) goto L_0x0161
            gjd r8 = new gjd
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r9, r6)
            r8.<init>(r0)
            return r8
        L_0x0161:
            avpp r9 = defpackage.avpp.d
            aucd r9 = r9.o()
            boolean r0 = r9.c
            if (r0 == 0) goto L_0x0170
            r9.c()
            r9.c = r3
        L_0x0170:
            aucj r0 = r9.b
            avpp r0 = (defpackage.avpp) r0
            aucj r2 = r4.i()
            avpo r2 = (defpackage.avpo) r2
            r2.getClass()
            r0.c = r2
            int r2 = r0.a
            r2 = r2 | 2
            r0.a = r2
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x018a
            goto L_0x018f
        L_0x018a:
            r9.c()
            r9.c = r3
        L_0x018f:
            aucj r0 = r9.b
            avpp r0 = (defpackage.avpp) r0
            aucj r1 = r1.i()
            avwf r1 = (defpackage.avwf) r1
            r1.getClass()
            r0.b = r1
            int r1 = r0.a
            r1 = r1 | 1
            r0.a = r1
            aucj r9 = r9.i()
            avpp r9 = (defpackage.avpp) r9
            ihs r0 = defpackage.ihs.b()
            com.android.volley.RequestQueue r0 = r0.getRequestQueue()
            gjc r1 = new gjc
            r1.<init>()
            awow r2 = defpackage.awow.a
            awpa r2 = r2.a()
            java.lang.String r2 = r2.e()
            avpq r4 = defpackage.avpq.c
            iiw r8 = defpackage.iiw.a(r8, r2, r9, r4, r1)
            r0.add(r8)
            avpq r8 = r1.get()     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            iwd r9 = a     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            int r1 = r1.length()     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            int r1 = r1 + 14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            r2.<init>(r1)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            java.lang.String r1 = "Got response: "
            r2.append(r1)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            r2.append(r0)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            java.lang.String r0 = r2.toString()     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            r9.c(r0, r1)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            if (r8 != 0) goto L_0x01f7
            goto L_0x0221
        L_0x01f7:
            int r9 = r8.a     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            r9 = r9 & 1
            if (r9 == 0) goto L_0x0221
            avwg r9 = r8.b     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            if (r9 == 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            avwg r9 = defpackage.avwg.c     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
        L_0x0204:
            aucx r9 = r9.a     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            java.lang.Object r9 = r9.get(r3)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            avwi r9 = (defpackage.avwi) r9     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            byte[] r9 = r9.k()     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            avwg r8 = r8.b     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            if (r8 == 0) goto L_0x0215
            goto L_0x0217
        L_0x0215:
            avwg r8 = defpackage.avwg.c     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
        L_0x0217:
            boolean r8 = r8.b     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            gjd r0 = new gjd
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.a
            r0.<init>(r1, r9, r8)
            return r0
        L_0x0221:
            iwd r8 = a     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            java.lang.String r9 = "Null response from sever."
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            r8.e(r9, r0)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            gjd r8 = new gjd     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            r0 = 21504(0x5400, float:3.0134E-41)
            java.lang.String r1 = "Null response from server."
            r9.<init>(r0, r1)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            r8.<init>(r9)     // Catch:{ InterruptedException -> 0x023b, ExecutionException -> 0x0239 }
            return r8
        L_0x0239:
            r8 = move-exception
            goto L_0x023c
        L_0x023b:
            r8 = move-exception
        L_0x023c:
            iwd r9 = a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Error from server"
            r9.e(r1, r8, r0)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
            gjd r8 = new gjd
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status
            r0 = 21505(0x5401, float:3.0135E-41)
            java.lang.String r1 = "Error from server."
            r9.<init>(r0, r1)
            r8.<init>(r9)
            return r8
        L_0x025b:
            r8 = move-exception
            iwd r8 = a
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r0 = "Invalid calling package."
            r8.e(r0, r9)
            gjd r8 = new gjd
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status
            r1 = 21502(0x53fe, float:3.0131E-41)
            r9.<init>(r1, r0)
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjh.a(android.content.Context, android.accounts.Account):gjd");
    }

    public final boolean a(String str) {
        return str != null && !gei.DM_SCREENLOCK_REQUIRED.b(str);
    }

    public final boolean a(byte[] bArr, avwi avwi) {
        return Base64.encodeToString(bArr, 11).equals(avwi.d);
    }
}
