package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ict  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ict extends ics {
    protected final acwd a;

    public ict(int i, acwd acwd) {
        super(i);
        this.a = acwd;
    }

    public final void a(Status status) {
        this.a.b((Exception) new ibr(status));
    }

    public void a(ied ied, boolean z) {
    }

    public final void b(ifj ifj) {
        try {
            c(ifj);
        } catch (DeadObjectException e) {
            a(icy.a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            a(icy.a(e2));
        } catch (RuntimeException e3) {
            a((Exception) e3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(ifj ifj);

    public final void a(Exception exc) {
        this.a.b(exc);
    }
}
