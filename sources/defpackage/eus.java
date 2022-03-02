package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: eus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eus extends ihb {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ Credential c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    public eus(Account account, String str, Credential credential, boolean z, String str2, String str3) {
        this.a = account;
        this.b = str;
        this.c = credential;
        this.d = z;
        this.e = str2;
        this.f = str3;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ((fgf) ((ffv) ibf).x()).a(new eva(acwd, Credential.class), this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
