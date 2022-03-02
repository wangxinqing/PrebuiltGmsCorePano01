package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: fwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class fwp extends bhw implements fwq {
    public fwp() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                a((GoogleSignInAccount) bhx.a(parcel, GoogleSignInAccount.CREATOR), (Status) bhx.a(parcel, Status.CREATOR));
                break;
            case 102:
                a((Status) bhx.a(parcel, Status.CREATOR));
                break;
            case 103:
                b((Status) bhx.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
