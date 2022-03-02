package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;

/* renamed from: advz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class advz extends bhw implements adwa {
    public advz() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public static adwa asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        if (queryLocalInterface instanceof adwa) {
            return (adwa) queryLocalInterface;
        }
        return new advy(iBinder);
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
        advx newFaceDetector$ar$class_merging = newFaceDetector$ar$class_merging(mby, (FaceSettingsParcel) bhx.a(parcel, FaceSettingsParcel.CREATOR));
        parcel2.writeNoException();
        bhx.a(parcel2, (IInterface) newFaceDetector$ar$class_merging);
        return true;
    }
}
