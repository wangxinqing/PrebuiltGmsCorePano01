package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: dyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dyg implements dyd {
    final /* synthetic */ dxy a;

    public dyg(dxy dxy) {
        this.a = dxy;
    }

    public final void a(int i, int i2) {
        try {
            dxy dxy = this.a;
            Parcel aQ = dxy.aQ();
            aQ.writeInt(i);
            aQ.writeInt(i2);
            dxy.c(1, aQ);
        } catch (RemoteException e) {
            apev.a(e);
        }
    }

    public final void b(int i, int i2) {
        try {
            dxy dxy = this.a;
            Parcel aQ = dxy.aQ();
            aQ.writeInt(i);
            aQ.writeInt(i2);
            dxy.c(2, aQ);
        } catch (RemoteException e) {
            apev.a(e);
        }
    }

    public final void e() {
        try {
            dxy dxy = this.a;
            dxy.c(3, dxy.aQ());
        } catch (RemoteException e) {
            apev.a(e);
        }
    }
}
