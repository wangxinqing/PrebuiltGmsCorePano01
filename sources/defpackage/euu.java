package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: euu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class euu extends ihb {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ Credential c;

    public euu(Account account, String str, Credential credential) {
        this.a = account;
        this.b = str;
        this.c = credential;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ((fgf) ((ffv) ibf).x()).a((fgb) new eva(acwd, Credential.class), this.a, this.b, this.c);
    }
}
