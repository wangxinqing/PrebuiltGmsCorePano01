package defpackage;

import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;

/* renamed from: uyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uyu implements Runnable {
    private final uyv a;
    private final avch b;
    private final vgo c;

    public uyu(uyv uyv, avch avch, vgo vgo) {
        this.a = uyv;
        this.b = avch;
        this.c = vgo;
    }

    public final void run() {
        RemoteCallbackList remoteCallbackList;
        uyv uyv = this.a;
        avch avch = this.b;
        vgo vgo = this.c;
        vay vay = uyv.a;
        if (vay != null && (remoteCallbackList = vay.a.b) != null) {
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                try {
                    asne asne = (asne) vay.a.b.getBroadcastItem(i);
                    aucd o = auvb.b.o();
                    aucd o2 = auva.d.o();
                    String a2 = vgo.a.a();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    auva auva = (auva) o2.b;
                    a2.getClass();
                    int i2 = auva.a | 1;
                    auva.a = i2;
                    auva.b = a2;
                    auva.c = avch.k;
                    auva.a = i2 | 2;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auvb auvb = (auvb) o.b;
                    auva auva2 = (auva) o2.i();
                    auva2.getClass();
                    if (!auvb.a.a()) {
                        auvb.a = aucj.a(auvb.a);
                    }
                    auvb.a.add(auva2);
                    byte[] k = ((auvb) o.i()).k();
                    Parcel aQ = asne.aQ();
                    aQ.writeByteArray(k);
                    asne.c(3, aQ);
                } catch (RemoteException e) {
                } catch (Throwable th) {
                    vay.a.b.finishBroadcast();
                    throw th;
                }
            }
            vay.a.b.finishBroadcast();
        }
    }
}
