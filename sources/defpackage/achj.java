package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import java.util.ArrayList;
import java.util.List;

/* renamed from: achj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class achj implements acvp {
    private final achr a;
    private final acjs b;

    public achj(achr achr, acjs acjs) {
        this.a = achr;
        this.b = acjs;
    }

    public final void a(acwa acwa) {
        achr achr = this.a;
        acjs acjs = this.b;
        Status status = Status.a;
        ArrayList arrayList = new ArrayList();
        for (acwa acwa2 : (List) acwa.d()) {
            if (acwa2.b()) {
                arrayList.add((Assertion) acwa2.d());
            }
        }
        if (arrayList.size() == 0) {
            achr.a.e("No assertion infos returned!", new Object[0]);
            status = new Status(10650);
            achr.e.a(status.i);
        }
        try {
            acjs.a(status, (Assertion[]) arrayList.toArray(new Assertion[0]));
        } catch (RemoteException e) {
            achr.a.a((Throwable) e);
        }
    }
}
