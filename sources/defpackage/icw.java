package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* renamed from: icw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class icw extends ics {
    private final ihb a;
    private final acwd b;
    private final igu d;

    public icw(int i, ihb ihb, acwd acwd, igu igu) {
        super(i);
        this.b = acwd;
        this.a = ihb;
        this.d = igu;
    }

    public final void a(Status status) {
        this.b.b(this.d.a(status));
    }

    public final void b(ifj ifj) {
        try {
            this.a.a(ifj.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(icy.a(e2));
        } catch (RuntimeException e3) {
            a((Exception) e3);
        }
    }

    public final void a(ied ied, boolean z) {
        acwd acwd = this.b;
        ied.b.put(acwd, Boolean.valueOf(z));
        acwd.a.a((acvp) new iec(ied, acwd));
    }

    public final void a(Exception exc) {
        this.b.b(exc);
    }

    public final Feature[] a(ifj ifj) {
        return this.a.a();
    }
}
