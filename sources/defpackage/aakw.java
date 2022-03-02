package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Request;

/* renamed from: aakw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aakw extends bhw implements aakx {
    public aakw() {
        super("com.google.android.gms.search.nativeapi.internal.INativeApiService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        aaku aaku;
        if (i != 2) {
            return false;
        }
        GetNativeApiInfoCall$Request getNativeApiInfoCall$Request = (GetNativeApiInfoCall$Request) bhx.a(parcel, GetNativeApiInfoCall$Request.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks");
            aaku = queryLocalInterface instanceof aaku ? (aaku) queryLocalInterface : new aaku(readStrongBinder);
        } else {
            aaku = null;
        }
        a(aaku);
        parcel2.writeNoException();
        return true;
    }
}
