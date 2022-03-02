package defpackage;

import android.os.RemoteCallbackList;
import android.os.RemoteException;

/* renamed from: vau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vau {
    public final RemoteCallbackList a = new RemoteCallbackList();

    public final void a(boolean z) {
        try {
            int beginBroadcast = this.a.beginBroadcast();
            jjg jjg = tgc.a;
            for (int i = 0; i < beginBroadcast; i++) {
                ((vcn) this.a.getBroadcastItem(i)).a(z);
            }
            this.a.finishBroadcast();
        } catch (RemoteException e) {
            anih anih = (anih) tgc.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("vau", "a", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send onPermissionChange");
        } catch (Throwable th) {
            this.a.finishBroadcast();
            throw th;
        }
    }

    public final void b(vcn vcn) {
        jjg jjg = tgc.a;
        vcn.a.hashCode();
        if (!this.a.unregister(vcn)) {
            ((anih) ((anih) tgc.a.d()).a("vau", "b", 31, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No status callback found to unregister: %s", vcn.a.hashCode());
        }
    }

    public final boolean a(vcn vcn) {
        jjg jjg = tgc.a;
        vcn.a.hashCode();
        boolean register = this.a.register(vcn);
        if (!register) {
            ((anih) ((anih) tgc.a.d()).a("vau", "a", 22, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to register status callback: %s", vcn.a.hashCode());
        }
        return register;
    }
}
