package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: gxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxt implements gxr {
    private static final iwd a = gzk.a("CheckinApiCallback");
    private final ifu b;

    public gxt(ifu ifu) {
        this.b = ifu;
    }

    public final void a() {
        try {
            this.b.a(new Status(21021));
        } catch (RemoteException e) {
            a.d("Remote object lost", new Object[0]);
        }
    }

    public final void b() {
        try {
            this.b.a(new Status(21041));
        } catch (RemoteException e) {
            a.d("Remote object lost", new Object[0]);
        }
    }

    public final void c() {
        try {
            this.b.a(new Status(21042));
        } catch (RemoteException e) {
            a.d("Remote object lost", new Object[0]);
        }
    }
}
