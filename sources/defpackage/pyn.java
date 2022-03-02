package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.security.EncryptedAccountData;

/* renamed from: pyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyn extends nis {
    private final AccountData a;
    private final pyo b;

    public pyn(pyo pyo, AccountData accountData) {
        super(9, "EncryptAccountData");
        this.a = accountData;
        this.b = pyo;
    }

    public final void a(Context context) {
        byte[] bArr;
        pyb a2 = pyi.a(context);
        pyo pyo = this.b;
        AccountData accountData = this.a;
        iva.a((Object) accountData, (Object) "Account data must not be null.");
        byte[] bArr2 = new byte[16];
        a2.a.nextBytes(bArr2);
        byte[] a3 = a2.a(accountData, bArr2);
        if (a3 != null) {
            bArr = ivy.a(new EncryptedAccountData(1, a3, bArr2, a2.a(bArr2, a3)));
        } else {
            bArr = null;
        }
        pyo.a(bArr);
    }

    public final void a(Status status) {
        this.b.a((byte[]) null);
    }
}
