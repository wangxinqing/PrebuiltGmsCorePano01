package com.google.android.gms.auth.account;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthInitIntentOperation extends hec {
    protected static final String[] a = {"com.google.android.gms.auth.setup.devicesignals.LockScreenReceiver", "com.google.android.gms.auth.account.accounttransfer.AccountTransferReceiver", "com.google.android.gms.auth.account.data.WorkAccountStoreReceiver", "com.google.android.gms.auth.frp.FreUnlockActivity", "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity", "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity", "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity", "com.google.android.gms.auth.uiflows.consent.BrowserConsentActivity", "com.google.android.gms.auth.uiflows.factoryreset.PreFactoryResetActivity", "com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedActivity", "com.google.android.gms.auth.account.mdm.GcmReceiverService", "com.google.android.gms.auth.account.visibility.RequestAccountsAccessActivity"};
    protected static final String[] b = {"com.google.android.gms.auth.uiflows.addaccount.DmDownloadInstallActivity", "com.google.android.gms.auth.uiflows.addaccount.GoogleServicesActivity"};
    private static final eio[] c = {gku.a, gfm.a, ekk.a, elf.a, esa.a, elh.a, elo.a};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        eio[] eioArr = c;
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 59);
        sb.append("Initializing Auth, action is ");
        sb.append(action);
        sb.append(" ,InitRuntimeState=");
        sb.append(i);
        sb.toString();
        int i2 = i & 2;
        int i3 = i & 12;
        for (int i4 = 0; i4 < 7; i4++) {
            eio eio = eioArr[i4];
            if (i2 > 0) {
                eio.b(this);
            }
            if (i3 > 0) {
                eio.a(this);
            }
            if (i2 > 0 || i3 > 0) {
                eio.c(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        amre a2 = amre.a("; ").a();
        String[] strArr = a;
        String a3 = a2.a((Object[]) strArr);
        StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 33);
        sb.append("Enabling ");
        sb.append(strArr.length);
        sb.append(" components: ");
        sb.append(a3);
        sb.toString();
        for (String a4 : a) {
            jhg.a((Context) this, a4, true);
        }
        String[] strArr2 = b;
        String a5 = a2.a((Object[]) strArr2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(a5).length() + 34);
        sb2.append("Disabling ");
        sb2.append(strArr2.length);
        sb2.append(" components: ");
        sb2.append(a5);
        sb2.toString();
        for (String a6 : b) {
            jhg.a((Context) this, a6, false);
        }
    }
}
