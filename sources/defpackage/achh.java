package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: achh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class achh implements acvp {
    private final achr a;
    private final acjs b;

    public achh(achr achr, acjs acjs) {
        this.a = achr;
        this.b = acjs;
    }

    public final void a(acwa acwa) {
        int i;
        achr achr = this.a;
        acjs acjs = this.b;
        List list = (List) acwa.d();
        ArrayList arrayList = new ArrayList(list.size());
        Status status = Status.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            acwa acwa2 = (acwa) it.next();
            if (!acwa2.b()) {
                abna abna = achr.e;
                if (acwa2.e() instanceof ibr) {
                    i = ((ibr) acwa2.e()).a();
                } else {
                    i = 10656;
                }
                abna.a(i);
                if (!azjn.b()) {
                    status = new Status(10656);
                    break;
                }
                achr.a.d("GetUserBootstrapInfo failed.", acwa2.e(), new Object[0]);
            } else {
                arrayList.add((UserBootstrapInfo) acwa2.d());
            }
        }
        if (azjn.b()) {
            if (arrayList.isEmpty()) {
                status = new Status(10656);
            } else {
                status = Status.a;
            }
        }
        try {
            acjs.a(status, (UserBootstrapInfo[]) arrayList.toArray(new UserBootstrapInfo[0]));
        } catch (RemoteException e) {
            achr.a.a((Throwable) e);
        }
    }
}
