package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: ngv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ngv extends bhw implements ngw {
    public ngv() {
        super("com.google.android.gms.fonts.internal.IFontsService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        ngu ngu;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fonts.internal.IFontsCallbacks");
            ngu = queryLocalInterface instanceof ngu ? (ngu) queryLocalInterface : new ngu(readStrongBinder);
        } else {
            ngu = null;
        }
        a(ngu, (FontMatchSpec) bhx.a(parcel, FontMatchSpec.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
