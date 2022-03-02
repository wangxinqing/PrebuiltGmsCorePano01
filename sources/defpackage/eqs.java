package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: eqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqs extends nis {
    private final eoy a;
    private final Account b;
    private final eqk c;

    public eqs(eoy eoy, eqk eqk, Account account) {
        super(153, "GetDeviceManagementInfo");
        this.a = eoy;
        this.b = account;
        this.c = eqk;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        try {
            this.a.a(Status.a, this.c.a(context).c(this.b));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            eqj eqj = new eqj(14);
            eqj.a = e;
            throw eqj.a();
        } catch (ExecutionException e2) {
            eqj eqj2 = new eqj(13);
            eqj2.a = e2;
            throw eqj2.a();
        } catch (emh e3) {
            eqj eqj3 = new eqj(10);
            eqj3.a = e3;
            throw eqj3.a();
        }
    }

    public final void a(Status status) {
        this.a.a(status, (DeviceManagementInfoResponse) null);
    }
}
