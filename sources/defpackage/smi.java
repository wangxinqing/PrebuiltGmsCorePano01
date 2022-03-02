package defpackage;

import android.accounts.Account;
import com.android.volley.Response;
import com.google.android.gms.common.server.NetworkCallbacks;

/* renamed from: smi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smi extends cqz implements NetworkCallbacks {
    private smi(String str, Account account, Response.Listener listener, Response.ErrorListener errorListener, auef auef, audx audx) {
        super(ihs.b(), str, listener, errorListener, auef, audx, "https://www.googleapis.com/auth/android_device_manager", account);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.accounts.Account} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.smi a(java.lang.String r8, boolean r9, com.android.volley.Response.Listener r10, com.android.volley.Response.ErrorListener r11, defpackage.auef r12, defpackage.audx r13) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0028
            ihs r9 = defpackage.ihs.b()
            java.lang.String r1 = r9.getPackageName()
            java.util.List r9 = defpackage.jgu.d(r9, r1)
            boolean r1 = r9.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r1 = "want to send authenticated request, but no Google account on device"
            defpackage.snn.a(r1, r9)
            r3 = r0
            goto L_0x002a
        L_0x001f:
            java.lang.Object r9 = r9.get(r2)
            r0 = r9
            android.accounts.Account r0 = (android.accounts.Account) r0
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            r3 = r0
        L_0x002a:
            smi r9 = new smi
            r1 = r9
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smi.a(java.lang.String, boolean, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener, auef, audx):smi");
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public final void onPreNetworkDispatch() {
        izj.b(6150);
    }
}
