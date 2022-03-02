package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: prf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class prf extends pre {
    private final pxs b;

    public prf(dux dux, pxs pxs) {
        super(dux, "GetFileDescriptorAndDelete");
        this.b = pxs;
    }

    public final void a(Context context) {
        ParcelFileDescriptor a = this.b.a();
        try {
            this.a.a(Status.a, a);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e) {
                    e = e;
                    oso.a((Throwable) e, "Couldn't close ParcelFileDescriptor");
                }
            }
        } catch (RemoteException e2) {
            oso.c((Throwable) e2, "Client died during getFileDescriptorAndDelete", new Object[0]);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e3) {
                    e = e3;
                    oso.a((Throwable) e, "Couldn't close ParcelFileDescriptor");
                }
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e4) {
                    oso.a((Throwable) e4, "Couldn't close ParcelFileDescriptor");
                }
            }
            throw th;
        }
    }
}
