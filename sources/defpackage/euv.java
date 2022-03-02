package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;

/* renamed from: euv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class euv extends ihb {
    final /* synthetic */ Account a;

    public euv(Account account) {
        this.a = account;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ((fgf) ((ffv) ibf).x()).a((fgb) new eva(acwd, AccountCredentialSettings.class), this.a);
    }
}
