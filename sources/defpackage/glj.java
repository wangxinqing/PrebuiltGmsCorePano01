package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: glj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class glj extends AsyncTask {
    private static final iwd a = ehv.a("AddAccountTask");
    private final Context b;
    private final fyk c;
    private final glh d;
    private final gck e;
    private final ghe f;
    private final String g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    public glj(Context context, fyk fyk, glh glh, gck gck, ghe ghe, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.b = context;
        this.c = fyk;
        this.d = glh;
        this.f = ghe;
        this.e = gck;
        this.i = str3;
        this.h = str2;
        this.j = z3;
        this.k = z;
        this.l = z2;
        this.g = str;
    }

    /* JADX WARNING: type inference failed for: r12v26, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r12) {
        /*
            r11 = this;
            java.lang.Void[] r12 = (java.lang.Void[]) r12
            java.util.UUID r12 = java.util.UUID.randomUUID()
            java.lang.String r12 = r12.toString()
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r0 = new com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest
            r0.<init>()
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r1 = new com.google.android.gms.auth.firstparty.shared.AccountCredentials
            java.lang.String r2 = r11.g
            r1.<init>((java.lang.String) r2)
            java.lang.String r2 = r11.h
            r1.e = r2
            java.lang.String r2 = r11.i
            r1.c = r2
            r0.f = r1
            com.google.android.gms.auth.firstparty.shared.AppDescription r1 = new com.google.android.gms.auth.firstparty.shared.AppDescription
            fyk r2 = r11.c
            java.lang.String r3 = r2.d
            int r2 = r2.f
            r1.<init>(r3, r2, r12, r12)
            r0.b = r1
            gck r1 = r11.e
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r0 = r1.a((com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest) r0)
            r1 = 0
            if (r0 == 0) goto L_0x003a
            android.accounts.Account r2 = r0.u
            r5 = r2
            goto L_0x003b
        L_0x003a:
            r5 = r1
        L_0x003b:
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x0041
            goto L_0x017c
        L_0x0041:
            gei r4 = r0.b()
            gei r6 = defpackage.gei.SUCCESS
            if (r4 != r6) goto L_0x017c
            boolean r4 = r11.j
            if (r4 == 0) goto L_0x007f
            gck r4 = r11.e
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r6 = new com.google.android.gms.auth.firstparty.dataservice.TokenRequest
            java.lang.String r7 = defpackage.ent.ab()
            r6.<init>(r5, r7)
            com.google.android.gms.auth.firstparty.shared.AppDescription r7 = new com.google.android.gms.auth.firstparty.shared.AppDescription
            fyk r8 = r11.c
            java.lang.String r9 = r8.d
            int r8 = r8.f
            r7.<init>(r9, r8, r12, r12)
            r6.j = r7
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r12 = r4.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r6)
            gei r4 = r12.b()
            gei r6 = defpackage.gei.SUCCESS
            if (r4 != r6) goto L_0x007f
            com.google.android.gms.auth.TokenData r12 = r12.w
            if (r12 == 0) goto L_0x007f
            java.lang.String r12 = r12.b
            gck r4 = r11.e
            java.lang.String r12 = r4.a((java.lang.String) r12)
            r9 = r12
            goto L_0x0080
        L_0x007f:
            r9 = r1
        L_0x0080:
            java.lang.String r7 = r0.v
            iwd r12 = a
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r4 = "DmStatus="
            int r6 = r0.length()
            if (r6 != 0) goto L_0x0096
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            goto L_0x009a
        L_0x0096:
            java.lang.String r0 = r4.concat(r0)
        L_0x009a:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r12.c(r0, r4)
            android.content.Context r12 = r11.b
            java.lang.String r0 = r5.name
            boolean r8 = defpackage.jgu.e(r12, r0)
            boolean r12 = r11.l
            if (r12 == 0) goto L_0x00d0
            ghe r12 = r11.f
            java.lang.String r0 = r5.name
            android.os.Bundle r12 = r12.a(r0)
            java.lang.String r0 = "showOffer"
            boolean r0 = r12.getBoolean(r0)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "offerIntent"
            android.os.Parcelable r12 = r12.getParcelable(r0)
            r1 = r12
            android.content.Intent r1 = (android.content.Intent) r1
            r6 = r1
            goto L_0x00d2
        L_0x00c6:
            iwd r12 = a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r4 = "No offers to show."
            r12.c(r4, r0)
            goto L_0x00d1
        L_0x00d0:
        L_0x00d1:
            r6 = r1
        L_0x00d2:
            boolean r12 = defpackage.jkr.b()
            if (r12 == 0) goto L_0x00fb
            boolean r12 = defpackage.ent.r()
            if (r12 == 0) goto L_0x00df
            goto L_0x00fb
        L_0x00df:
            java.lang.String r12 = defpackage.ent.v()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = ","
            java.lang.String[] r12 = r12.split(r0)
            int r0 = r12.length
            r1 = 0
        L_0x00f1:
            if (r1 >= r0) goto L_0x010d
            r4 = r12[r1]
            android.content.ContentResolver.setSyncAutomatically(r5, r4, r2)
            int r1 = r1 + 1
            goto L_0x00f1
        L_0x00fb:
            android.content.SyncAdapterType[] r12 = android.content.ContentResolver.getSyncAdapterTypes()
            int r0 = r12.length
            r1 = 0
        L_0x0101:
            if (r1 >= r0) goto L_0x010d
            r4 = r12[r1]
            java.lang.String r4 = r4.authority
            android.content.ContentResolver.setSyncAutomatically(r5, r4, r2)
            int r1 = r1 + 1
            goto L_0x0101
        L_0x010d:
            boolean r12 = r11.k
            if (r12 == 0) goto L_0x016a
            glh r12 = r11.d
            iwd r0 = defpackage.glg.a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Sending Google play TOS broadcast..."
            r0.b(r2, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.vending.TOS_ACKED"
            r0.<init>(r1)
            java.lang.String r2 = "com.android.vending"
            r0.setPackage(r2)
            java.lang.String r2 = r5.name
            java.lang.String r4 = "TosAckedReceiver.account"
            r0.putExtra(r4, r2)
            java.lang.String r2 = r5.type
            java.lang.String r10 = "TosAckedReceiver.account_type"
            r0.putExtra(r10, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
            glg r12 = (defpackage.glg) r12
            android.content.Context r12 = r12.c
            r12.sendBroadcast(r0, r1)
            glh r12 = r11.d
            iwd r0 = defpackage.glg.a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Sending Chrome TOS broadcast..."
            r0.b(r2, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.chrome.TOS_ACKED"
            r0.<init>(r1)
            java.lang.String r2 = "com.android.chrome"
            r0.setPackage(r2)
            java.lang.String r2 = r5.name
            r0.putExtra(r4, r2)
            java.lang.String r2 = r5.type
            r0.putExtra(r10, r2)
            glg r12 = (defpackage.glg) r12
            android.content.Context r12 = r12.c
            r12.sendBroadcast(r0, r1)
        L_0x016a:
            iwd r12 = a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Added account successfully."
            r12.c(r1, r0)
            gli r12 = new gli
            r4 = 0
            r10 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x019d
        L_0x017c:
            iwd r12 = a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = "[no response]"
            goto L_0x0189
        L_0x0185:
            gei r0 = r0.b()
        L_0x0189:
            r1[r3] = r0
            java.lang.String r0 = "Failed to sign in %s"
            r12.d(r0, r1)
            gli r12 = new gli
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x019d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glj.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        a.c("Delivering result.", new Object[0]);
        ((glg) this.d).deliverResult((gli) obj);
    }
}
