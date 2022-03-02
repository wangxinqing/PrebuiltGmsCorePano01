package defpackage;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;

/* renamed from: vta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vta implements igp {
    private final Account a;

    public vta(Account account) {
        this.a = account;
    }

    public final void a(Object obj, Object obj2) {
        Account account = this.a;
        int i = vts.a;
        wan wan = new wan();
        wan.a.a = account;
        ifu b = vts.b((acwd) obj2);
        SetAccountParams setAccountParams = wan.a;
        setAccountParams.b = b;
        ((vyk) ((waz) obj).x()).a(setAccountParams);
    }
}
