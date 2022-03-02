package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.setup.accounts.AccountsChimeraService;

/* renamed from: ache  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ache extends irf {
    final /* synthetic */ AccountsChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ache(AccountsChimeraService accountsChimeraService) {
        super(accountsChimeraService, 81, new int[0]);
        this.a = accountsChimeraService;
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        AccountsChimeraService accountsChimeraService = this.a;
        try {
            iwd iwd = AccountsChimeraService.a;
            if (accountsChimeraService.b == null) {
                accountsChimeraService.b = new achr(accountsChimeraService, accountsChimeraService.c);
            }
            achr achr = this.a.b;
            achr.asBinder();
            isv.a(0, (IBinder) achr, (Bundle) null);
        } catch (RemoteException e) {
            AccountsChimeraService.a.e("Client died while brokering service", e, new Object[0]);
        }
    }
}
