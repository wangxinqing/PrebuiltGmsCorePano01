package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;

/* renamed from: asnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class asnc extends bhw implements asnd {
    public asnc() {
        super("com.google.location.nearby.messages.debug.internal.IDebugPokeService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        asnb asnb;
        if (i != 2) {
            return false;
        }
        DebugPokeRequest debugPokeRequest = (DebugPokeRequest) bhx.a(parcel, DebugPokeRequest.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.location.nearby.messages.debug.internal.IDebugPokeResponseCallback");
            asnb = queryLocalInterface instanceof asnb ? (asnb) queryLocalInterface : new asnb(readStrongBinder);
        } else {
            asnb = null;
        }
        a(debugPokeRequest, asnb);
        parcel2.writeNoException();
        return true;
    }
}
