package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* renamed from: advs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class advs extends bhw implements advt {
    public advs() {
        super("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    public static advt asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof advt) {
            return (advt) queryLocalInterface;
        }
        return new advr(iBinder);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        mby mby;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby = null;
        }
        advq newBarcodeDetector$ar$class_merging = newBarcodeDetector$ar$class_merging(mby, (BarcodeDetectorOptions) bhx.a(parcel, BarcodeDetectorOptions.CREATOR));
        parcel2.writeNoException();
        bhx.a(parcel2, (IInterface) newBarcodeDetector$ar$class_merging);
        return true;
    }
}
