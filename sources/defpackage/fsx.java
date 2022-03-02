package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* renamed from: fsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class fsx extends bhw implements fsy {
    public fsx() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        fsw fsw;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
            fsw = queryLocalInterface instanceof fsw ? (fsw) queryLocalInterface : new fsw(readStrongBinder);
        } else {
            fsw = null;
        }
        a(fsw, (AuthorizationRequest) bhx.a(parcel, AuthorizationRequest.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
