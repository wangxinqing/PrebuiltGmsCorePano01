package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.common.api.Status;

/* renamed from: ery  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ery extends nis {
    private static final iwd a = ehv.a("AddWorkAccountAsyncOp");
    private final String b;
    private final fyg c;
    private final gbs d;
    private final epw e;
    private final int f;
    private final ejb g;

    public ery(ejb ejb, String str, fyg fyg, gbs gbs, epw epw, int i) {
        super(120, "AddWorkAccountAsyncOp");
        this.g = ejb;
        this.b = str;
        this.c = fyg;
        this.d = gbs;
        this.e = epw;
        this.f = i;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        this.c.a();
        AccountCredentials accountCredentials = new AccountCredentials("com.google.work");
        accountCredentials.e = this.b;
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.f = accountCredentials;
        TokenResponse a2 = this.d.a(accountSignInRequest);
        Account account = null;
        if (a2 == null) {
            a.e("Failed to add work account, response is null", new Object[0]);
        } else if (!gei.SUCCESS.equals(a2.b())) {
            iwd iwd = a;
            String valueOf = String.valueOf(a2.b());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Failed to add work account, status: ");
            sb.append(valueOf);
            iwd.e(sb.toString(), new Object[0]);
        } else {
            account = a2.u;
            epw epw = this.e;
            int i = this.f;
            if ("com.google.work".equals(account.type)) {
                SharedPreferences.Editor edit = epw.b.edit();
                edit.putInt(account.name, i);
                edit.apply();
                this.c.b();
            } else {
                throw new IllegalArgumentException("not a work account");
            }
        }
        ejb ejb = this.g;
        Parcel aQ = ejb.aQ();
        bhx.a(aQ, (Parcelable) account);
        ejb.c(1, aQ);
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
    }
}
