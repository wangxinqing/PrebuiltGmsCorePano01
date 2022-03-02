package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* renamed from: fwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwy extends fwx {
    private final izb e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fwy(fwq fwq, GoogleSignInOptions googleSignInOptions, String str, izb izb) {
        super(fwq, googleSignInOptions, str, "GoogleRevokeAccess");
        iva.a((Object) googleSignInOptions);
        this.e = izb;
    }

    private final void a() {
        this.d.b(new Status(4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 0
            jnh r1 = defpackage.jni.b(r11)     // Catch:{ NameNotFoundException -> 0x00de }
            java.lang.String r2 = r10.b     // Catch:{ NameNotFoundException -> 0x00de }
            android.content.pm.PackageInfo r1 = r1.b(r2, r0)     // Catch:{ NameNotFoundException -> 0x00de }
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch:{ NameNotFoundException -> 0x00de }
            int r3 = r1.uid     // Catch:{ NameNotFoundException -> 0x00de }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r10.c
            java.lang.String r7 = r10.b
            android.accounts.Account r2 = r1.i
            if (r2 != 0) goto L_0x001d
            android.accounts.Account r2 = defpackage.jgu.b(r11, r7)
            r5 = r2
            goto L_0x001e
        L_0x001d:
            r5 = r2
        L_0x001e:
            r8 = 0
            if (r5 == 0) goto L_0x004a
            com.google.android.gms.common.internal.ClientContext r9 = new com.google.android.gms.common.internal.ClientContext
            r2 = r9
            r4 = r5
            r6 = r7
            r2.<init>((int) r3, (android.accounts.Account) r4, (android.accounts.Account) r5, (java.lang.String) r6, (java.lang.String) r7)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r3 = r1.a()
            r2.<init>(r3)
            int r3 = r2.size()
            if (r3 == 0) goto L_0x004a
            boolean r1 = defpackage.fxj.a((com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1)
            if (r1 == 0) goto L_0x0042
            java.util.Set r2 = defpackage.fxj.a((java.util.Set) r2)
        L_0x0042:
            java.lang.String[] r1 = defpackage.jkx.a((java.util.Set) r2)
            r9.a((java.lang.String[]) r1)
            goto L_0x004b
        L_0x004a:
            r9 = r8
        L_0x004b:
            if (r9 == 0) goto L_0x00da
            r9.b((android.content.Context) r11)
            izw r1 = new izw
            r1.<init>(r9)
            java.lang.String r1 = r1.a(r11)
            if (r1 == 0) goto L_0x00d6
            izb r2 = r10.e     // Catch:{ eif -> 0x0075, VolleyError -> 0x0073 }
            java.lang.String r3 = "/revoke?token="
            int r4 = r1.length()     // Catch:{ eif -> 0x0075, VolleyError -> 0x0073 }
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = new java.lang.String     // Catch:{ eif -> 0x0075, VolleyError -> 0x0073 }
            r4.<init>(r3)     // Catch:{ eif -> 0x0075, VolleyError -> 0x0073 }
            goto L_0x006f
        L_0x006b:
            java.lang.String r4 = r3.concat(r1)     // Catch:{ eif -> 0x0075, VolleyError -> 0x0073 }
        L_0x006f:
            r2.a(r9, r0, r4, r8)     // Catch:{ eif -> 0x0075, VolleyError -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r2 = move-exception
            goto L_0x0076
        L_0x0075:
            r2 = move-exception
        L_0x0076:
            iwd r3 = a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Revoke access request failed when calling LSO: "
            int r5 = r2.length()
            if (r5 != 0) goto L_0x008e
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x0092
        L_0x008e:
            java.lang.String r2 = r4.concat(r2)
        L_0x0092:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r3.d(r2, r4)
        L_0x0097:
            defpackage.eig.b(r11, r1)     // Catch:{ IOException -> 0x009d, eif -> 0x009b }
            goto L_0x00bf
        L_0x009b:
            r1 = move-exception
            goto L_0x009e
        L_0x009d:
            r1 = move-exception
        L_0x009e:
            iwd r2 = a
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Error clearing the tokens locally: "
            int r4 = r1.length()
            if (r4 != 0) goto L_0x00b6
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            goto L_0x00ba
        L_0x00b6:
            java.lang.String r1 = r3.concat(r1)
        L_0x00ba:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.d(r1, r0)
        L_0x00bf:
            fwz r0 = new fwz
            fxc r1 = new fxc
            r1.<init>()
            java.lang.String r2 = r10.b
            r0.<init>(r1, r2)
            r0.a((android.content.Context) r11)
            fwq r11 = r10.d
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
            r11.b(r0)
            return
        L_0x00d6:
            r10.a()
            return
        L_0x00da:
            r10.a()
            return
        L_0x00de:
            r11 = move-exception
            iwd r11 = a
            java.lang.String r1 = r10.b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " from ServiceBroker not recognized by BrokerService"
            java.lang.String r1 = r1.concat(r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r11.d(r1, r0)
            com.google.android.gms.common.api.Status r11 = com.google.android.gms.common.api.Status.c
            r10.a((com.google.android.gms.common.api.Status) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwy.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.d.b(status);
    }
}
