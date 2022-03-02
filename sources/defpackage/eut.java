package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.IdToken;

/* renamed from: eut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eut extends ihb {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    public eut(Account account, String str, String str2, String str3) {
        this.a = account;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ((fgf) ((ffv) ibf).x()).a(new eva(acwd, IdToken.class), this.a, this.b, this.c, this.d);
    }
}
