package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.uiflows.addaccount.AccountIntroChimeraActivity;
import java.util.List;

/* renamed from: eki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eki extends gdm {
    public eki(Context context) {
        super(context);
    }

    public final PendingIntent a(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        return null;
    }

    public final PendingIntent a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        return null;
    }

    public final PendingIntent a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        return null;
    }

    public final Intent b(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        SetupAccountWorkflowRequest setupAccountWorkflowRequest2 = setupAccountWorkflowRequest;
        PendingIntent pendingIntent = (PendingIntent) setupAccountWorkflowRequest.b().getParcelable("pendingIntent");
        String string = setupAccountWorkflowRequest.b().getString(eig.b);
        List a = setupAccountWorkflowRequest.a();
        return AccountIntroChimeraActivity.a(this.a, setupAccountWorkflowRequest2.i, setupAccountWorkflowRequest2.h, setupAccountWorkflowRequest2.c, setupAccountWorkflowRequest2.k, ijn.a(setupAccountWorkflowRequest2.e), true, setupAccountWorkflowRequest2.n, setupAccountWorkflowRequest2.l, setupAccountWorkflowRequest2.m, a != null ? (String[]) a.toArray(new String[a.size()]) : new String[0], pendingIntent, string, setupAccountWorkflowRequest2.o, setupAccountWorkflowRequest2.p, true, setupAccountWorkflowRequest2.r, setupAccountWorkflowRequest2.s, setupAccountWorkflowRequest2.t, D2dOptions.a(setupAccountWorkflowRequest2.e));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PendingIntent a(com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.h
            int r1 = r0.hashCode()
            r2 = -2011849543(0xffffffff88159cb9, float:-4.5022283E-34)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == r2) goto L_0x002d
            r2 = 816462108(0x30aa391c, float:1.2385359E-9)
            if (r1 == r2) goto L_0x0023
            r2 = 879034182(0x3464ff46, float:2.1327023E-7)
            if (r1 == r2) goto L_0x0019
            goto L_0x0037
        L_0x0019:
            java.lang.String r1 = "com.google"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 2
            goto L_0x0038
        L_0x0023:
            java.lang.String r1 = "cn.google"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x002d:
            java.lang.String r1 = "com.google.work"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0038
        L_0x0037:
            r0 = -1
        L_0x0038:
            if (r0 == 0) goto L_0x0047
            if (r0 == r5) goto L_0x0047
            if (r0 != r4) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "No account type."
            r7.<init>(r0)
            throw r7
        L_0x0047:
            android.content.Intent r7 = r6.b((com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest) r7)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "categoryhack:"
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0065
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0069
        L_0x0065:
            java.lang.String r0 = r1.concat(r0)
        L_0x0069:
            r7.addCategory(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r7.addCategory(r0)
            android.content.Context r0 = r6.a
            r1 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r7 = android.app.PendingIntent.getActivity(r0, r3, r7, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eki.a(com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest):android.app.PendingIntent");
    }
}
