package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* renamed from: acun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acun extends jeu {
    public static final /* synthetic */ int a = 0;
    private final String b;

    public acun(Context context, String str) {
        super(context, true, "subscribedfeeds");
        this.b = str;
    }

    public static void a(Context context, Account account) {
        new ild(context);
        if (azpv.d()) {
            ild.a(account, "subscribedfeeds", Bundle.EMPTY, 86400);
            ild.a(account, "com.google.android.gms.subscribedfeeds", Bundle.EMPTY);
            return;
        }
        ild.a(account, "com.google.android.gms.subscribedfeeds", Bundle.EMPTY, 86400);
        ild.a(account, "subscribedfeeds", Bundle.EMPTY);
    }

    public static final String b() {
        return !azpv.d() ? "com.google.android.gms.subscribedfeeds" : "subscribedfeeds";
    }

    private static final void b(Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Soft failure: ");
        sb.append(valueOf);
        Log.w("SubscribedFeeds", sb.toString());
    }

    private static final void a(Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Hard error: ");
        sb.append(valueOf);
        Log.w("SubscribedFeeds", sb.toString());
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return !"com.google.android.gms.subscribedfeeds".equals(this.b) ? 8449 : 8450;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0301 A[Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318, all -> 0x0315 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.accounts.Account r26, android.os.Bundle r27, java.lang.String r28, android.content.ContentProviderClient r29, android.content.SyncResult r30) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r30
            java.lang.String r4 = r1.b
            java.lang.String r5 = "com.google.android.gms.subscribedfeeds"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x001e
            azpv r4 = defpackage.azpv.a
            azpw r4 = r4.a()
            boolean r4 = r4.h()
            if (r4 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            return
        L_0x001e:
            android.content.Context r4 = r25.getContext()
            a(r4, r2)
            acux r4 = new acux
            android.content.Context r6 = r25.getContext()
            r4.<init>(r6)
            acuq r14 = new acuq     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            android.content.Context r9 = r25.getContext()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r10 = r1.b     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            android.content.Context r8 = r25.getContext()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r11 = defpackage.nsi.a(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r12 != 0) goto L_0x030d
            long r12 = defpackage.jhg.a((android.content.Context) r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r15 = 0
            int r8 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r8 == 0) goto L_0x0305
            java.lang.String r8 = java.lang.Long.toHexString(r12)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r12 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            int r12 = r12.length()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r13 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            int r13 = r13.length()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            int r12 = r12 + 24
            int r12 = r12 + r13
            r6.<init>(r12)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r7 = "gcm://?regId="
            r6.append(r7)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r6.append(r11)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r7 = "&androidId="
            r6.append(r7)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r6.append(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r12 = r6.toString()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avwu r13 = new avwu     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avxg r6 = new avxg     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            acuy r7 = new acuy     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r7.<init>()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r13.<init>(r4, r6)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r8 = r14
            r11 = r29
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r4 = "20.12.16-000"
            azpv r6 = defpackage.azpv.a     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            azpw r6 = r6.a()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            long r6 = r6.f()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            int r8 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r8 > 0) goto L_0x00ad
            java.lang.String r6 = "mail"
            avww r7 = r14.c     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r8 = "gms_version"
            r7.a(r8, r4)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            goto L_0x00af
        L_0x00ad:
            java.lang.String r6 = "oauth2:https://www.googleapis.com/auth/gsync"
        L_0x00af:
            acud r4 = new acud     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            android.content.Context r7 = r14.b     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            qub r7 = defpackage.qub.a((android.content.Context) r7)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r4.<init>(r2, r6, r7)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r2 = r2.name     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r6.<init>()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r8 = r14.d     // Catch:{ all -> 0x02fb }
            java.lang.String r9 = "subscribedfeeds"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x02fb }
            java.lang.String r15 = "_id"
            java.lang.String r12 = "feed"
            java.lang.String r13 = "_sync_id"
            java.lang.String r11 = "service"
            r10 = 1
            r16 = 0
            if (r8 != 0) goto L_0x0152
            java.lang.String r8 = r14.d     // Catch:{ all -> 0x014d }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x014d }
            if (r5 == 0) goto L_0x0149
            android.content.ContentProviderClient r5 = r14.a     // Catch:{ all -> 0x014d }
            android.net.Uri r18 = defpackage.acuo.a     // Catch:{ all -> 0x014d }
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ all -> 0x014d }
            r8[r16] = r2     // Catch:{ all -> 0x014d }
            r19 = 0
            java.lang.String r20 = "_sync_account=?"
            r22 = 0
            r17 = r5
            r21 = r8
            android.database.Cursor r2 = r17.query(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x014d }
        L_0x00f4:
            if (r2 == 0) goto L_0x0146
            boolean r5 = r2.moveToNext()     // Catch:{ all -> 0x0141 }
            if (r5 == 0) goto L_0x013e
            int r5 = r2.getColumnIndex(r11)     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = r2.getString(r5)     // Catch:{ all -> 0x0141 }
            int r5 = r2.getColumnIndex(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ all -> 0x0141 }
            int r8 = r2.getColumnIndex(r12)     // Catch:{ all -> 0x0141 }
            java.lang.String r17 = r2.getString(r8)     // Catch:{ all -> 0x0141 }
            int r8 = r2.getColumnIndex(r15)     // Catch:{ all -> 0x0141 }
            long r18 = r2.getLong(r8)     // Catch:{ all -> 0x0141 }
            java.lang.Long r8 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0141 }
            long r18 = r8.longValue()     // Catch:{ all -> 0x0141 }
            r8 = r14
            r7 = 1
            r10 = r5
            r5 = r11
            r11 = r17
            r23 = r12
            r24 = r13
            r12 = r18
            avxe r8 = r8.a(r9, r10, r11, r12)     // Catch:{ all -> 0x0141 }
            r6.add(r8)     // Catch:{ all -> 0x0141 }
            r11 = r5
            r12 = r23
            r13 = r24
            r10 = 1
            goto L_0x00f4
        L_0x013e:
            r7 = 1
            goto L_0x01b5
        L_0x0141:
            r0 = move-exception
            r4 = r0
            r7 = r2
            goto L_0x02ff
        L_0x0146:
            r7 = 1
            goto L_0x01b5
        L_0x0149:
            r7 = 1
            r2 = 0
            goto L_0x01b5
        L_0x014d:
            r0 = move-exception
            r4 = r0
            r5 = 0
            goto L_0x02fe
        L_0x0152:
            r5 = r11
            r23 = r12
            r24 = r13
            r7 = 1
            android.content.ContentProviderClient r8 = r14.a     // Catch:{ all -> 0x02fb }
            android.net.Uri r9 = defpackage.aeel.a     // Catch:{ all -> 0x02fb }
            java.lang.String[] r12 = new java.lang.String[r7]     // Catch:{ all -> 0x02fb }
            r12[r16] = r2     // Catch:{ all -> 0x02fb }
            r10 = 0
            java.lang.String r11 = "_sync_account=?"
            r13 = 0
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x02fb }
        L_0x0168:
            if (r2 == 0) goto L_0x01b4
            boolean r8 = r2.moveToNext()     // Catch:{ all -> 0x01af }
            if (r8 == 0) goto L_0x01b4
            int r8 = r2.getColumnIndex(r5)     // Catch:{ all -> 0x01af }
            java.lang.String r9 = r2.getString(r8)     // Catch:{ all -> 0x01af }
            r12 = r24
            int r8 = r2.getColumnIndex(r12)     // Catch:{ all -> 0x01af }
            java.lang.String r10 = r2.getString(r8)     // Catch:{ all -> 0x01af }
            r13 = r23
            int r8 = r2.getColumnIndex(r13)     // Catch:{ all -> 0x01af }
            java.lang.String r11 = r2.getString(r8)     // Catch:{ all -> 0x01af }
            int r8 = r2.getColumnIndex(r15)     // Catch:{ all -> 0x01af }
            long r17 = r2.getLong(r8)     // Catch:{ all -> 0x01af }
            java.lang.Long r8 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x01af }
            long r17 = r8.longValue()     // Catch:{ all -> 0x01af }
            r8 = r14
            r20 = r12
            r19 = r13
            r12 = r17
            avxe r8 = r8.a(r9, r10, r11, r12)     // Catch:{ all -> 0x01af }
            r6.add(r8)     // Catch:{ all -> 0x01af }
            r23 = r19
            r24 = r20
            goto L_0x0168
        L_0x01af:
            r0 = move-exception
            r4 = r0
            r7 = r2
            goto L_0x02ff
        L_0x01b4:
        L_0x01b5:
            if (r2 != 0) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r2.close()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x01bb:
            avwu r2 = r14.e     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avww r5 = r14.c     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r8 = "https://android.clients.google.com/gsync/sub"
            java.lang.String r9 = "/null"
            r10 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r11 == 0) goto L_0x01d4
            java.util.Map r10 = r5.a     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            boolean r10 = r10.isEmpty()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r10 == 0) goto L_0x01d4
            goto L_0x0264
        L_0x01d4:
            r10 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r11 == 0) goto L_0x0242
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r9.<init>()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r9.append(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.util.Map r10 = r5.a     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.util.Set r10 = r10.keySet()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r11 = "?"
            boolean r8 = r8.contains(r11)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r8 != 0) goto L_0x01f9
            r8 = 63
            r9.append(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r8 = 1
            goto L_0x01fa
        L_0x01f9:
            r8 = 0
        L_0x01fa:
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x01fe:
            boolean r11 = r10.hasNext()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r11 == 0) goto L_0x023d
            java.lang.Object r11 = r10.next()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.util.Map r12 = r5.a     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r12 == 0) goto L_0x01fe
            if (r8 == 0) goto L_0x0217
            goto L_0x021c
        L_0x0217:
            r8 = 38
            r9.append(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x021c:
            r9.append(r11)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r8 = 61
            r9.append(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r8 = "UTF-8"
            java.lang.String r8 = java.net.URLEncoder.encode(r12, r8)     // Catch:{ UnsupportedEncodingException -> 0x022b }
            goto L_0x0238
        L_0x022b:
            r0 = move-exception
            r8 = r0
            java.lang.String r11 = "QueryParamsImpl"
            java.lang.String r13 = "UTF-8 not supported -- should not happen. Using default encoding."
            android.util.Log.w(r11, r13, r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r8 = java.net.URLEncoder.encode(r12)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x0238:
            r9.append(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r8 = 0
            goto L_0x01fe
        L_0x023d:
            java.lang.String r8 = r9.toString()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            goto L_0x0264
        L_0x0242:
            java.util.Map r5 = r5.a     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            boolean r5 = r5.isEmpty()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r5 == 0) goto L_0x02f3
            r5 = 0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            int r5 = r5.length()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            int r5 = r5 + 45
            r10.<init>(r5)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r10.append(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r10.append(r9)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r8 = r10.toString()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x0264:
            avxb[] r5 = new defpackage.avxb[r7]     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            acul r9 = new acul     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r9.<init>(r2, r5, r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r9.a((defpackage.acud) r4)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r2 = r5[r16]     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r2.e()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r2.<init>()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x0278:
            r8 = r5[r16]     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            boolean r8 = r8.b()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r8 == 0) goto L_0x028c
            r8 = r5[r16]     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avwx r8 = r8.g()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avxe r8 = (defpackage.avxe) r8     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r2.add(r8)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            goto L_0x0278
        L_0x028c:
            r5 = r5[r16]     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r5.d()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x0295:
            boolean r5 = r2.hasNext()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r5 == 0) goto L_0x02d7
            java.lang.Object r5 = r2.next()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avxe r5 = (defpackage.avxe) r5     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r5 == 0) goto L_0x02c9
            java.lang.String r8 = r5.p     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r8 == 0) goto L_0x02c9
            java.util.Iterator r8 = r6.iterator()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r10 = 0
        L_0x02ac:
            boolean r9 = r8.hasNext()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r9 == 0) goto L_0x02ca
            java.lang.Object r9 = r8.next()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avxe r9 = (defpackage.avxe) r9     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r9 == 0) goto L_0x02ac
            java.lang.String r11 = r5.p     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r9 = r9.p     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            boolean r9 = r11.equals(r9)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r9 == 0) goto L_0x02ac
            r8.remove()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r10 = 1
            goto L_0x02ac
        L_0x02c9:
            r10 = 0
        L_0x02ca:
            if (r10 != 0) goto L_0x0295
            avwu r8 = r14.e     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            acuk r9 = new acuk     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r9.<init>(r8, r5)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r9.a((defpackage.acud) r4)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            goto L_0x0295
        L_0x02d7:
            java.util.Iterator r2 = r6.iterator()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x02db:
            boolean r5 = r2.hasNext()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            if (r5 == 0) goto L_0x02f2
            java.lang.Object r5 = r2.next()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avxe r5 = (defpackage.avxe) r5     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            avwu r6 = r14.e     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            acuj r7 = new acuj     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r7.<init>(r6, r5)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            r7.a((defpackage.acud) r4)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            goto L_0x02db
        L_0x02f2:
            return
        L_0x02f3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r4 = "Cannot set both an entry ID and other query parameters"
            r2.<init>(r4)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            throw r2     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x02fb:
            r0 = move-exception
            r5 = 0
            r4 = r0
        L_0x02fe:
            r7 = r5
        L_0x02ff:
            if (r7 == 0) goto L_0x0304
            r7.close()     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x0304:
            throw r4     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x0305:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r4 = "No Android ID assigned to this device yet"
            r2.<init>(r4)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            throw r2     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x030d:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            java.lang.String r4 = "GmsCore hasn't registered with GCM yet"
            r2.<init>(r4)     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
            throw r2     // Catch:{ IOException -> 0x0361, RemoteException -> 0x035f, OperationCanceledException -> 0x035d, avwv -> 0x0336, AuthenticatorException -> 0x0327, avxa -> 0x0318 }
        L_0x0315:
            r0 = move-exception
            r2 = r0
            goto L_0x0370
        L_0x0318:
            r0 = move-exception
            r2 = r0
            a(r2)     // Catch:{ all -> 0x0315 }
            android.content.SyncStats r2 = r3.stats     // Catch:{ all -> 0x0315 }
            long r3 = r2.numParseExceptions     // Catch:{ all -> 0x0315 }
            r5 = 1
            long r3 = r3 + r5
            r2.numParseExceptions = r3     // Catch:{ all -> 0x0315 }
            return
        L_0x0327:
            r0 = move-exception
            r2 = r0
            a(r2)     // Catch:{ all -> 0x0315 }
            android.content.SyncStats r2 = r3.stats     // Catch:{ all -> 0x0315 }
            long r3 = r2.numAuthExceptions     // Catch:{ all -> 0x0315 }
            r5 = 1
            long r3 = r3 + r5
            r2.numAuthExceptions = r3     // Catch:{ all -> 0x0315 }
            return
        L_0x0336:
            r0 = move-exception
            r2 = r0
            int r4 = r2.a     // Catch:{ all -> 0x0315 }
            r5 = 401(0x191, float:5.62E-43)
            if (r4 != r5) goto L_0x033f
            goto L_0x0350
        L_0x033f:
            r5 = 403(0x193, float:5.65E-43)
            if (r4 == r5) goto L_0x0350
            b(r2)     // Catch:{ all -> 0x0315 }
            android.content.SyncStats r2 = r3.stats     // Catch:{ all -> 0x0315 }
            long r3 = r2.numIoExceptions     // Catch:{ all -> 0x0315 }
            r5 = 1
            long r3 = r3 + r5
            r2.numIoExceptions = r3     // Catch:{ all -> 0x0315 }
            return
        L_0x0350:
            a(r2)     // Catch:{ all -> 0x0315 }
            android.content.SyncStats r2 = r3.stats     // Catch:{ all -> 0x0315 }
            long r3 = r2.numAuthExceptions     // Catch:{ all -> 0x0315 }
            r5 = 1
            long r3 = r3 + r5
            r2.numAuthExceptions = r3     // Catch:{ all -> 0x0315 }
            return
        L_0x035d:
            r0 = move-exception
            goto L_0x0362
        L_0x035f:
            r0 = move-exception
            goto L_0x0362
        L_0x0361:
            r0 = move-exception
        L_0x0362:
            r2 = r0
            b(r2)     // Catch:{ all -> 0x0315 }
            android.content.SyncStats r2 = r3.stats     // Catch:{ all -> 0x0315 }
            long r3 = r2.numIoExceptions     // Catch:{ all -> 0x0315 }
            r5 = 1
            long r3 = r3 + r5
            r2.numIoExceptions = r3     // Catch:{ all -> 0x0315 }
            return
        L_0x0370:
            goto L_0x0372
        L_0x0371:
            throw r2
        L_0x0372:
            goto L_0x0371
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acun.a(android.accounts.Account, android.os.Bundle, java.lang.String, android.content.ContentProviderClient, android.content.SyncResult):void");
    }
}
