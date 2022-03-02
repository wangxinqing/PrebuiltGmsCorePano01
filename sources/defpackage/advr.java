package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* renamed from: advr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advr extends bhv implements advt {
    public advr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    public final advq newBarcodeDetector$ar$class_merging(mby mby, BarcodeDetectorOptions barcodeDetectorOptions) {
        advq advq;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        bhx.a(aQ, (Parcelable) barcodeDetectorOptions);
        Parcel a = a(1, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            advq = queryLocalInterface instanceof advq ? (advq) queryLocalInterface : new advq(readStrongBinder);
        } else {
            advq = null;
        }
        a.recycle();
        return advq;
    }
}
