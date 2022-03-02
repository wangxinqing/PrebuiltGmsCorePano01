package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: qbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qbf extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;
    public final amri b;

    public qbf(String str, Throwable th, int i, amri amri) {
        super(str, th);
        this.a = i;
        this.b = amri;
    }

    public static qbe a() {
        return new qbe();
    }

    public final Status b() {
        return new Status(this.a, getMessage(), (PendingIntent) this.b.c());
    }

    public final aosq c() {
        return new aosq(this);
    }

    public static qbf a(int i) {
        return new qbf((String) null, (Throwable) null, i, ampu.a);
    }

    public static qbf a(eif eif) {
        int i;
        qbe a2 = a();
        a2.a = "Authentication failure.";
        gei c = gei.c(eif.getMessage());
        if (!gei.a(c)) {
            i = gei.b(c) ? 23001 : 23002;
        } else {
            i = 23000;
        }
        a2.c = i;
        a2.b = eif;
        return a2.a();
    }

    public static qbf a(icl icl) {
        return new qbf(icl.aO().j, (Throwable) null, icl.aO().i, amri.c(icl.aO().k));
    }

    public static qbf a(String str, int i) {
        return new qbf(str, (Throwable) null, i, ampu.a);
    }

    public static qbf a(Throwable th) {
        if (th instanceof qbf) {
            return (qbf) th;
        }
        if (th instanceof ibr) {
            if (th instanceof icj) {
                icj icj = (icj) th;
                return a((icl) new Status(icj.a(), icj.getMessage(), icj.c()));
            }
            ibr ibr = (ibr) th;
            return a((icl) new Status(ibr.a(), ibr.getMessage()));
        } else if ((th instanceof aosq) || (th instanceof ExecutionException)) {
            return a(th.getCause());
        } else {
            return new qbf("Unknown error.", th, 8, ampu.a);
        }
    }
}
