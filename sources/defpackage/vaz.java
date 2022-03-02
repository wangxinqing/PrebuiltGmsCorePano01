package defpackage;

import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* renamed from: vaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vaz implements vgr {
    final /* synthetic */ vbb a;

    public vaz(vbb vbb) {
        this.a = vbb;
    }

    public final void a(tgh tgh, aval aval) {
        List singletonList = Collections.singletonList(aval);
        RemoteCallbackList remoteCallbackList = this.a.a;
        if (remoteCallbackList != null) {
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                try {
                    asne asne = (asne) this.a.a.getBroadcastItem(i);
                    aucd o = auvn.b.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auvn auvn = (auvn) o.b;
                    if (!auvn.a.a()) {
                        auvn.a = aucj.a(auvn.a);
                    }
                    auab.a((Iterable) singletonList, (List) auvn.a);
                    byte[] k = ((auvn) o.i()).k();
                    Parcel aQ = asne.aQ();
                    aQ.writeByteArray(k);
                    asne.c(2, aQ);
                } catch (RemoteException e) {
                } catch (Throwable th) {
                    this.a.a.finishBroadcast();
                    throw th;
                }
            }
            this.a.a.finishBroadcast();
        }
    }
}
