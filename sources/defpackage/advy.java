package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;

/* renamed from: advy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advy extends bhv implements adwa {
    public advy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public final advx newFaceDetector$ar$class_merging(mby mby, FaceSettingsParcel faceSettingsParcel) {
        advx advx;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        bhx.a(aQ, (Parcelable) faceSettingsParcel);
        Parcel a = a(1, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            advx = queryLocalInterface instanceof advx ? (advx) queryLocalInterface : new advx(readStrongBinder);
        } else {
            advx = null;
        }
        a.recycle();
        return advx;
    }
}
