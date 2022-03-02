package defpackage;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: idf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class idf extends BasePendingResult implements idg {
    public final ibg d;
    public final ibq e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    protected idf(ibg ibg, icc icc) {
        super(icc);
        iva.a((Object) icc, (Object) "GoogleApiClient must not be null");
        iva.a((Object) ibg);
        this.d = ibg;
        this.e = null;
    }

    private final void a(RemoteException remoteException) {
        a(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    public abstract void a(ibf ibf);

    public /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public final void b(ibf ibf) {
        if (ibf instanceof ivq) {
            ibp ibp = ((ivq) ibf).a;
            ibf = null;
        }
        try {
            a(ibf);
        } catch (DeadObjectException e2) {
            a((RemoteException) e2);
            throw e2;
        } catch (RemoteException e3) {
            a(e3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected idf(ibq ibq, icc icc) {
        super(icc);
        iva.a((Object) icc, (Object) "GoogleApiClient must not be null");
        iva.a((Object) ibq, (Object) "Api must not be null");
        this.d = ibq.a();
        this.e = ibq;
    }

    public final void a(Status status) {
        iva.b(!status.c(), "Failed result must not be success");
        a(b(status));
    }
}
