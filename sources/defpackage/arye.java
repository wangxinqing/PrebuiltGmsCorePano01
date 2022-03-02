package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: arye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arye extends bhw implements IInterface, aehx {
    private final udb a;
    private final IBinder.DeathRecipient b;
    private aryf c;

    public arye() {
        super("com.google.location.nearby.common.fastpair.IPairingService");
    }

    public final synchronized void a() {
        aryf aryf = this.c;
        if (aryf != null) {
            aryf.a.unlinkToDeath(this.b, 1);
        }
        this.c = null;
    }

    public final synchronized void a(int i, String str) {
        aryf aryf = this.c;
        if (aryf != null) {
            int i2 = i - 1;
            try {
                Parcel aQ = aryf.aQ();
                aQ.writeInt(i2);
                aQ.writeString(str);
                aryf.c(1, aQ);
            } catch (RemoteException e) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e);
                anih.a("PairingServiceBinder.onPairingProgressUpdating meet exception!");
            }
        } else {
            ((anih) tsp.a.c()).a("PairingServiceBinder.onPairingProgressUpdating failed because callback is null!");
        }
    }

    public arye(udb udb) {
        super("com.google.location.nearby.common.fastpair.IPairingService");
        this.b = new ubm(this);
        this.a = udb;
    }

    public final synchronized void a(String str, String str2, aryf aryf) {
        this.c = aryf;
        try {
            aryf.a.linkToDeath(this.b, 1);
        } catch (RemoteException e) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e);
            anih.a("DiscoveryService failed to register.");
        }
        a(1, "");
        udb udb = this.a;
        udb.a.c(new uct(udb, "pairWithRemoteProgressListener", str, this, str2));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        aryf aryf;
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IPairingServiceCallback");
                aryf = queryLocalInterface instanceof aryf ? (aryf) queryLocalInterface : new aryf(readStrongBinder);
            } else {
                aryf = null;
            }
            a(readString, readString2, aryf);
        } else if (i != 2) {
            return false;
        } else {
            a();
        }
        return true;
    }
}
