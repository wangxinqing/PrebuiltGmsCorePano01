package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* renamed from: nta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nta extends bhw implements ntb {
    final /* synthetic */ aacm a;
    private final aacm b;

    public nta() {
        super("com.google.android.gms.gcm.IMessengerProxyCallback");
    }

    public final void a(ComponentName componentName) {
        aacm aacm = this.b;
        int i = aacm.i;
        aacm.a();
    }

    public final void b() {
        this.a.close();
    }

    public final void c() {
        aacm aacm = this.b;
        int i = aacm.i;
        aacm.a();
    }

    public final void d() {
        aacm aacm = this.b;
        int i = aacm.i;
        aacm.a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nta(aacm aacm, aacm aacm2) {
        super("com.google.android.gms.gcm.IMessengerProxyCallback");
        this.a = aacm;
        this.b = aacm2;
    }

    public final void a(ComponentName componentName, nsy nsy) {
        synchronized (this.a.h.a) {
            this.b.a(nsy);
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        nsy nsy;
        switch (i) {
            case 1:
                b();
                return true;
            case 2:
                c();
                return true;
            case 3:
                a((ComponentName) bhx.a(parcel, ComponentName.CREATOR));
                return true;
            case 4:
                d();
                return true;
            case 5:
                this.a.close();
                return true;
            case 6:
                ComponentName componentName = (ComponentName) bhx.a(parcel, ComponentName.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.gcm.IMessengerConnection");
                    nsy = queryLocalInterface instanceof nsy ? (nsy) queryLocalInterface : new nsw(readStrongBinder);
                } else {
                    nsy = null;
                }
                a(componentName, nsy);
                return true;
            case 7:
                this.b.handleMessage((Message) bhx.a(parcel, Message.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
