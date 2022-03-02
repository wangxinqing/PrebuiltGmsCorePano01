package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzExtensionEntity;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: zaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zaq extends jeu {
    public static zaq a;
    private final yrr b;
    private final PackageManager c;

    public zaq(Context context, yrr yrr, PackageManager packageManager) {
        super(context, "plus");
        this.b = yrr;
        this.c = packageManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099 A[ExcHandler: eif (e eif), Splitter:B:15:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.accounts.Account r20, android.content.ContentProviderClient r21, android.content.SyncResult r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r22
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.net.Uri r6 = defpackage.yty.a     // Catch:{ all -> 0x00ef }
            java.lang.String[] r7 = defpackage.zao.a     // Catch:{ all -> 0x00ef }
            r11 = 1
            java.lang.String[] r9 = new java.lang.String[r11]     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r2.name     // Catch:{ all -> 0x00ef }
            r12 = 0
            r9[r12] = r0     // Catch:{ all -> 0x00ef }
            java.lang.String r8 = "accountName=?"
            java.lang.String r10 = "_id"
            r5 = r21
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00ef }
        L_0x0021:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x004a
            zan r0 = new zan     // Catch:{ all -> 0x00ed }
            r0.<init>()     // Catch:{ all -> 0x00ed }
            long r6 = r5.getLong(r12)     // Catch:{ all -> 0x00ed }
            r0.a = r6     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = r5.getString(r11)     // Catch:{ all -> 0x00ed }
            r0.b = r6     // Catch:{ all -> 0x00ed }
            r6 = 2
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x00ed }
            r0.c = r6     // Catch:{ all -> 0x00ed }
            r6 = 3
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x00ed }
            r0.d = r6     // Catch:{ all -> 0x00ed }
            r4.add(r0)     // Catch:{ all -> 0x00ed }
            goto L_0x0021
        L_0x004a:
            if (r5 != 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            r5.close()
        L_0x0050:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r4.size()
            r7 = 0
        L_0x005a:
            if (r7 >= r6) goto L_0x00d4
            java.lang.Object r0 = r4.get(r7)
            r8 = r0
            zan r8 = (defpackage.zan) r8
            android.content.pm.PackageManager r0 = r1.c     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r9 = r8.d     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r9, r12)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.common.internal.ClientContext r9 = new com.google.android.gms.common.internal.ClientContext
            int r14 = r0.uid
            java.lang.String r15 = r2.name
            java.lang.String r0 = r2.name
            java.lang.String r10 = r8.d
            r13 = r9
            r16 = r0
            r17 = r10
            r18 = r10
            r13.<init>((int) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18)
            java.lang.String r0 = "https://www.googleapis.com/auth/plus.login"
            r9.d(r0)
            java.lang.String r0 = "application_name"
            java.lang.String r10 = "100"
            r9.a((java.lang.String) r0, (java.lang.String) r10)
            yrr r0 = r1.b     // Catch:{ VolleyError -> 0x009b, eif -> 0x0099 }
            java.lang.String r10 = r8.b     // Catch:{ VolleyError -> 0x009b, eif -> 0x0099 }
            java.lang.String r13 = r8.c     // Catch:{ VolleyError -> 0x009b, eif -> 0x0099 }
            yrs r0 = r0.e     // Catch:{ VolleyError -> 0x0097, eif -> 0x0099 }
            r0.a((com.google.android.gms.common.internal.ClientContext) r9, (java.lang.String) r10, (java.lang.String) r13)     // Catch:{ VolleyError -> 0x0097, eif -> 0x0099 }
            goto L_0x00a9
        L_0x0097:
            r0 = move-exception
            throw r0     // Catch:{ VolleyError -> 0x009b, eif -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            goto L_0x00a9
        L_0x009b:
            r0 = move-exception
            com.android.volley.NetworkResponse r0 = r0.networkResponse
            if (r0 == 0) goto L_0x00d4
            android.content.SyncStats r0 = r3.stats
            long r9 = r0.numIoExceptions
            r13 = 1
            long r9 = r9 + r13
            r0.numIoExceptions = r9
        L_0x00a9:
            android.net.Uri r0 = defpackage.yty.a
            long r8 = r8.a
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r8)
            android.content.ContentProviderOperation$Builder r0 = android.content.ContentProviderOperation.newDelete(r0)
            android.content.ContentProviderOperation r0 = r0.build()
            r5.add(r0)
            goto L_0x00d1
        L_0x00bd:
            r0 = move-exception
            android.net.Uri r0 = defpackage.yty.a
            long r8 = r8.a
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r8)
            android.content.ContentProviderOperation$Builder r0 = android.content.ContentProviderOperation.newDelete(r0)
            android.content.ContentProviderOperation r0 = r0.build()
            r5.add(r0)
        L_0x00d1:
            int r7 = r7 + 1
            goto L_0x005a
        L_0x00d4:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x00ec
            r2 = r21
            r2.applyBatch(r5)     // Catch:{ OperationApplicationException -> 0x00e0 }
            return
        L_0x00e0:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "OASyncAdapter"
            java.lang.String r4 = "Failed to delete"
            android.util.Log.e(r0, r4, r2)
            r3.databaseError = r11
            return
        L_0x00ec:
            return
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r0 = move-exception
            r5 = 0
        L_0x00f1:
            if (r5 == 0) goto L_0x00f6
            r5.close()
        L_0x00f6:
            goto L_0x00f8
        L_0x00f7:
            throw r0
        L_0x00f8:
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zaq.a(android.accounts.Account, android.content.ContentProviderClient, android.content.SyncResult):void");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 9217;
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        ClientOzEventEntity clientOzEventEntity;
        ByteArrayInputStream byteArrayInputStream;
        zaq zaq = this;
        Account account2 = account;
        ContentProviderClient contentProviderClient2 = contentProviderClient;
        SyncResult syncResult2 = syncResult;
        if ("com.google.android.gms.plus.action".equals(str)) {
            try {
                zaq.a(account2, contentProviderClient2, syncResult2);
                contentProviderClient2.delete(ytx.a, "timestamp<?", new String[]{Long.toString(System.currentTimeMillis() - 172800000)});
                Cursor query = contentProviderClient.query(ytx.a, zam.a, "accountName=? AND type=?", new String[]{account2.name, Integer.toString(1)}, "onBehalfOf, timestamp");
                try {
                    HashMap hashMap = new HashMap();
                    while (query.moveToNext()) {
                        ContentProviderClient contentProviderClient3 = contentProviderClient2;
                        String string = query.getString(0);
                        clientOzEventEntity = new ClientOzEventEntity();
                        byteArrayInputStream = new ByteArrayInputStream(string.getBytes());
                        new jas().a((InputStream) byteArrayInputStream, (jag) clientOzEventEntity);
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e) {
                        }
                        String string2 = query.getString(1);
                        zap zap = (zap) hashMap.get(string2);
                        if (clientOzEventEntity == null) {
                            syncResult2.stats.numParseExceptions++;
                            zaq = this;
                            contentProviderClient2 = contentProviderClient3;
                        } else {
                            if (zap == null) {
                                zap = new zap();
                                hashMap.put(string2, zap);
                            }
                            long j = clientOzEventEntity.d;
                            if (j > zap.a) {
                                zap.a = j;
                            }
                            zap.b.add(clientOzEventEntity);
                            zaq = this;
                            account2 = account;
                            contentProviderClient2 = contentProviderClient3;
                        }
                    }
                    query.close();
                    hashMap.size();
                    int myUid = Process.myUid();
                    String str2 = account2.name;
                    String str3 = account2.name;
                    String packageName = getContext().getPackageName();
                    ClientContext clientContext = new ClientContext(myUid, str2, str3, packageName, packageName);
                    clientContext.d("https://www.googleapis.com/auth/plus.me");
                    clientContext.d("https://www.googleapis.com/auth/plus.pages.manage");
                    clientContext.a("application_name", "80");
                    long j2 = 0;
                    for (String str4 : hashMap.keySet()) {
                        zap zap2 = (zap) hashMap.get(str4);
                        long j3 = zap2.a;
                        if (j3 > j2) {
                            j2 = j3;
                        }
                        ArrayList arrayList = zap2.b;
                        try {
                            yrr yrr = zaq.b;
                            int d = jhg.d(getContext());
                            boolean z = getContext().getResources().getBoolean(R.bool.plus_is_tablet);
                            ysd ysd = yrr.c;
                            String str5 = !z ? "4" : "10";
                            long currentTimeMillis = System.currentTimeMillis();
                            zgm zgm = new zgm();
                            zgm.a = clientContext.e;
                            zgm.f.add(2);
                            zgm.b = arrayList;
                            zgm.f.add(3);
                            zgm.c = str5;
                            zgm.f.add(4);
                            zgm.d = Integer.toString(d);
                            zgm.f.add(5);
                            zgm.e = currentTimeMillis;
                            zgm.f.add(6);
                            ClientOzExtensionEntity clientOzExtensionEntity = new ClientOzExtensionEntity(zgm.f, zgm.a, zgm.b, zgm.c, zgm.d, zgm.e);
                            zdn zdn = ysd.g;
                            StringBuilder sb = new StringBuilder("rpc/insertLog");
                            if (str4 != null) {
                                iyv.a(sb, "onBehalfOf", iyv.a(str4));
                            }
                            zdn.a.a(clientContext, 1, sb.toString(), clientOzExtensionEntity);
                        } catch (VolleyError e2) {
                            if (e2.networkResponse != null) {
                                syncResult2.stats.numIoExceptions++;
                            }
                        } catch (eif | IOException e3) {
                        }
                        zaq = this;
                        ContentProviderClient contentProviderClient4 = contentProviderClient;
                    }
                    contentProviderClient.delete(ytx.a, "accountName=? AND type=? AND timestamp<=?", new String[]{account2.name, Integer.toString(1), Long.toString(j2)});
                } catch (jaq e4) {
                    try {
                        byteArrayInputStream.close();
                        clientOzEventEntity = null;
                    } catch (IOException e5) {
                        clientOzEventEntity = null;
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } catch (RemoteException e6) {
                Log.e("OASyncAdapter", "Sync Failed", e6);
                syncResult2.databaseError = true;
            }
        }
    }
}
