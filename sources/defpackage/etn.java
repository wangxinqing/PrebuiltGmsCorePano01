package defpackage;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: etn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class etn {
    public ArrayList a;
    public int b = 0;
    public AccountTransferProgress c;
    public final Set d = new HashSet(3);

    public final AccountTransferMsg a() {
        return new AccountTransferMsg(this.d, 1, this.a, this.b, this.c);
    }

    public final void a(int i) {
        this.b = i;
        this.d.add(3);
    }

    public final void a(AccountTransferProgress accountTransferProgress) {
        this.c = accountTransferProgress;
        this.d.add(4);
    }

    public final void a(ArrayList arrayList) {
        this.a = arrayList;
        this.d.add(2);
    }
}
