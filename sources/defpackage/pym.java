package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.security.EncryptedAccountData;

/* renamed from: pym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pym extends nis {
    private final byte[] a;
    private final pyo b;

    public pym(pyo pyo, byte[] bArr) {
        super(9, "DecryptAccountData");
        this.b = pyo;
        this.a = bArr;
    }

    public final void a(Context context) {
        boolean z;
        EncryptedAccountData encryptedAccountData;
        pyb a2 = pyi.a(context);
        pyo pyo = this.b;
        byte[] bArr = this.a;
        iva.a((Object) bArr, (Object) "Encrypted bytes must not be null.");
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Encrypted bytes must not be empty.");
        AccountData accountData = null;
        try {
            encryptedAccountData = (EncryptedAccountData) ivy.a(bArr, EncryptedAccountData.CREATOR);
        } catch (ivv e) {
            encryptedAccountData = null;
        }
        if (encryptedAccountData != null && a2.a(encryptedAccountData)) {
            accountData = a2.b(encryptedAccountData);
        }
        pyo.a(accountData);
    }

    public final void a(Status status) {
        this.b.a((AccountData) null);
    }
}
