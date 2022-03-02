package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: abzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abzu implements acvz {
    private final abzy a;

    public abzu(abzy abzy) {
        this.a = abzy;
    }

    public final acwa a(Object obj) {
        Void voidR = (Void) obj;
        acjv acjv = this.a.b.e;
        if (acjv == null) {
            return acws.a((Exception) new ibr(Status.c));
        }
        acwd acwd = new acwd();
        try {
            acjv.a(new acis(new abzp(acwd)));
        } catch (RemoteException e) {
            abzs.a.a((Throwable) e);
        }
        return acwd.a;
    }
}
