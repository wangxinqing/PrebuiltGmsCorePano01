package com.google.android.gms.auth.account.be.accountstate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CredentialRevocationIntentOperation extends IntentOperation {
    private static final iwd a = ehv.a("CredentialRevocationIntentOperation");
    private static BroadcastReceiver c = null;
    private eni b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ConnectivityActionBroadcastReceiver extends nla {
        public ConnectivityActionBroadcastReceiver() {
            super("auth_account");
        }

        public final void a(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                context.startService(IntentOperation.getStartIntent(context, CredentialRevocationIntentOperation.class, "com.google.android.gms.auth.account.be.accountstate.revoke_scheduled_credentials_action"));
            }
        }
    }

    public static Intent a(Context context, String str) {
        return new Intent("com.google.android.gms.auth.account.be.accountstate.revoke_credential_action").setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService").putExtra("accountId", str);
    }

    private final void b() {
        for (String a2 : c()) {
            a(a2);
        }
    }

    private final Set c() {
        HashSet hashSet = new HashSet(Arrays.asList(a().getString("key_revocation_set_string", "").split(",")));
        hashSet.remove("");
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r7) {
        /*
            r6 = this;
            boolean r0 = defpackage.ent.aa()
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r7.getAction()
            int r1 = r0.hashCode()
            r2 = -2143707069(0xffffffff8039a043, float:-5.292114E-39)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == r2) goto L_0x0035
            r2 = -226057370(0xfffffffff286a366, float:-5.3335716E30)
            if (r1 == r2) goto L_0x002b
            r2 = 798292259(0x2f94f923, float:2.7098065E-10)
            if (r1 == r2) goto L_0x0021
            goto L_0x003f
        L_0x0021:
            java.lang.String r1 = "android.intent.action.BOOT_COMPLETED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003f
            r1 = 1
            goto L_0x0040
        L_0x002b:
            java.lang.String r1 = "com.google.android.gms.auth.account.be.accountstate.revoke_scheduled_credentials_action"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003f
            r1 = 2
            goto L_0x0040
        L_0x0035:
            java.lang.String r1 = "com.google.android.gms.auth.account.be.accountstate.revoke_credential_action"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003f
            r1 = 0
            goto L_0x0040
        L_0x003f:
            r1 = -1
        L_0x0040:
            if (r1 == 0) goto L_0x005a
            if (r1 == r5) goto L_0x0056
            if (r1 == r4) goto L_0x0052
            iwd r7 = a
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r0
            java.lang.String r0 = "Received unknown action: %s"
            r7.d(r0, r1)
            return
        L_0x0052:
            r6.b()
            return
        L_0x0056:
            r6.b()
            return
        L_0x005a:
            java.lang.String r0 = "accountId"
            java.lang.String r7 = r7.getStringExtra(r0)
            if (r7 == 0) goto L_0x0065
            r6.a((java.lang.String) r7)
        L_0x0065:
            return
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.accountstate.CredentialRevocationIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    private final void b(String str) {
        Set c2 = c();
        c2.add(str);
        a(c2);
        if (c == null) {
            c = new ConnectivityActionBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getApplicationContext().registerReceiver(c, intentFilter);
        }
    }

    private final void c(String str) {
        Set c2 = c();
        c2.remove(str);
        a(c2);
        if (c2.isEmpty() && c != null) {
            try {
                getApplicationContext().unregisterReceiver(c);
            } catch (IllegalArgumentException e) {
            }
            c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r1 = "Network error - will repeat credentials revocation"
            r2 = 0
            android.content.Context r4 = r15.getApplicationContext()     // Catch:{ iiy -> 0x00d7 }
            eni r0 = new eni     // Catch:{ iiy -> 0x00d7 }
            android.content.Context r12 = r4.getApplicationContext()     // Catch:{ iiy -> 0x00d7 }
            era r13 = new era     // Catch:{ iiy -> 0x00d7 }
            izb r14 = new izb     // Catch:{ iiy -> 0x00d7 }
            amsv r3 = defpackage.iks.m     // Catch:{ iiy -> 0x00d7 }
            amsz r3 = (defpackage.amsz) r3     // Catch:{ iiy -> 0x00d7 }
            java.lang.Object r3 = r3.a     // Catch:{ iiy -> 0x00d7 }
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ iiy -> 0x00d7 }
            agvx r3 = defpackage.ent.D     // Catch:{ iiy -> 0x00d7 }
            java.lang.Object r3 = r3.c()     // Catch:{ iiy -> 0x00d7 }
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ iiy -> 0x00d7 }
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ iiy -> 0x00d7 }
            r13.<init>(r14)     // Catch:{ iiy -> 0x00d7 }
            eng r3 = new eng     // Catch:{ iiy -> 0x00d7 }
            r3.<init>(r13)     // Catch:{ iiy -> 0x00d7 }
            r4 = r16
            r0.<init>(r12, r3, r4)     // Catch:{ iiy -> 0x00d4 }
            r3 = r15
            r3.b = r0     // Catch:{ iiy -> 0x00d2 }
            android.content.Context r5 = r0.a     // Catch:{ iiy -> 0x00d2 }
            com.google.android.gms.common.internal.ClientContext r7 = new com.google.android.gms.common.internal.ClientContext     // Catch:{ iiy -> 0x00d2 }
            r7.<init>()     // Catch:{ iiy -> 0x00d2 }
            android.content.pm.ApplicationInfo r6 = r5.getApplicationInfo()     // Catch:{ iiy -> 0x00d2 }
            int r6 = r6.uid     // Catch:{ iiy -> 0x00d2 }
            r7.b = r6     // Catch:{ iiy -> 0x00d2 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ iiy -> 0x00d2 }
            r7.f = r5     // Catch:{ iiy -> 0x00d2 }
            java.lang.String r5 = r0.b     // Catch:{ iiy -> 0x00d2 }
            if (r5 == 0) goto L_0x00a4
            eng r0 = r0.c     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            era r0 = r0.a     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            java.lang.String r8 = "RevokeDevice"
            r6.<init>(r8)     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            java.lang.String r8 = "user_id"
            java.lang.String r5 = defpackage.iyv.a(r5)     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            defpackage.iyv.a((java.lang.StringBuilder) r6, (java.lang.String) r8, (java.lang.String) r5)     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            java.lang.String r9 = r6.toString()     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            izb r6 = r0.a     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            r8 = 1
            r10 = 0
            java.lang.Class<com.google.android.gms.auth.account.gencode.server.api.RevokeDevice> r11 = com.google.android.gms.auth.account.gencode.server.api.RevokeDevice.class
            jag r0 = r6.a((com.google.android.gms.common.internal.ClientContext) r7, (int) r8, (java.lang.String) r9, (java.lang.Object) r10, (java.lang.Class) r11)     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            com.google.android.gms.auth.account.gencode.server.api.RevokeDevice r0 = (com.google.android.gms.auth.account.gencode.server.api.RevokeDevice) r0     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            java.util.Set r0 = r0.a     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            boolean r0 = r0.contains(r5)     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            if (r0 == 0) goto L_0x0089
            gei r0 = defpackage.gei.SUCCESS     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            goto L_0x00a6
        L_0x0089:
            gei r0 = defpackage.gei.BAD_REQUEST     // Catch:{ eif -> 0x0099, AuthFailureError -> 0x0097, VolleyError -> 0x008c }
            goto L_0x00a6
        L_0x008c:
            r0 = move-exception
            iiy r5 = new iiy     // Catch:{ iiy -> 0x00d2 }
            gei r6 = defpackage.gei.NETWORK_ERROR     // Catch:{ iiy -> 0x00d2 }
            java.lang.String r7 = "Error communicating with LSO to revoke token."
            r5.<init>(r6, r7, r0)     // Catch:{ iiy -> 0x00d2 }
            throw r5     // Catch:{ iiy -> 0x00d2 }
        L_0x0097:
            r0 = move-exception
            goto L_0x009a
        L_0x0099:
            r0 = move-exception
        L_0x009a:
            iiy r5 = new iiy     // Catch:{ iiy -> 0x00d2 }
            gei r6 = defpackage.gei.BAD_AUTHENTICATION     // Catch:{ iiy -> 0x00d2 }
            java.lang.String r7 = "Unauthorized request to revoke token"
            r5.<init>(r6, r7, r0)     // Catch:{ iiy -> 0x00d2 }
            throw r5     // Catch:{ iiy -> 0x00d2 }
        L_0x00a4:
            gei r0 = defpackage.gei.BAD_REQUEST     // Catch:{ iiy -> 0x00d2 }
        L_0x00a6:
            gei r5 = defpackage.gei.SUCCESS     // Catch:{ iiy -> 0x00d2 }
            boolean r5 = r0.equals(r5)     // Catch:{ iiy -> 0x00d2 }
            if (r5 == 0) goto L_0x00bb
            iwd r0 = a     // Catch:{ iiy -> 0x00d2 }
            java.lang.String r5 = "Credential revocation succeeded."
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ iiy -> 0x00d2 }
            r0.b(r5, r6)     // Catch:{ iiy -> 0x00d2 }
            r15.c(r16)     // Catch:{ iiy -> 0x00d2 }
            return
        L_0x00bb:
            gei r5 = defpackage.gei.NETWORK_ERROR     // Catch:{ iiy -> 0x00d2 }
            boolean r0 = r5.equals(r0)     // Catch:{ iiy -> 0x00d2 }
            if (r0 == 0) goto L_0x00ce
            iwd r0 = a     // Catch:{ iiy -> 0x00d2 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ iiy -> 0x00d2 }
            r0.d(r1, r5)     // Catch:{ iiy -> 0x00d2 }
            r15.b(r16)     // Catch:{ iiy -> 0x00d2 }
            return
        L_0x00ce:
            r15.c(r16)     // Catch:{ iiy -> 0x00d2 }
            return
        L_0x00d2:
            r0 = move-exception
            goto L_0x00db
        L_0x00d4:
            r0 = move-exception
            r3 = r15
            goto L_0x00db
        L_0x00d7:
            r0 = move-exception
            r3 = r15
            r4 = r16
        L_0x00db:
            iwd r5 = a
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = r0.getMessage()
            gei r9 = r0.a
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r10 = r10 + r6
            int r10 = r10 + r11
            r12.<init>(r10)
            r12.append(r8)
            java.lang.String r6 = " "
            r12.append(r6)
            r12.append(r9)
            java.lang.String r6 = r12.toString()
            r7[r2] = r6
            java.lang.String r6 = "RevokeCredential -> %s"
            r5.d(r6, r7)
            gei r5 = defpackage.gei.NETWORK_ERROR
            gei r0 = r0.a
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x012c
            iwd r0 = a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.d(r1, r2)
            r15.b(r16)
            return
        L_0x012c:
            r15.c(r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.accountstate.CredentialRevocationIntentOperation.a(java.lang.String):void");
    }

    private final void a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z) {
                sb.append(",");
            }
            sb.append(str);
            z = false;
        }
        SharedPreferences.Editor edit = a().edit();
        edit.putString("key_revocation_set_string", sb.toString());
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences a() {
        return getApplicationContext().getSharedPreferences("credentials_revocation_storage", 0);
    }
}
