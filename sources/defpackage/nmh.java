package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.games.internal.PopupLocationInfoParcelable;

/* renamed from: nmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nmh extends bhw implements IInterface {
    public nmh() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    public PopupLocationInfoParcelable a() {
        throw null;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1001) {
            return false;
        }
        PopupLocationInfoParcelable a = a();
        parcel2.writeNoException();
        bhx.b(parcel2, a);
        return true;
    }
}
