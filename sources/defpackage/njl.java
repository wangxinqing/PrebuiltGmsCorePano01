package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import java.util.Locale;

/* renamed from: njl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class njl extends Binder {
    private final IBinder a;
    private final njj b = njj.a();

    public njl(String str, IBinder iBinder) {
        this.a = iBinder;
        attachInterface((IInterface) null, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            nih b2 = nku.b();
            if (b2 == null) {
                amlv.b("OutgoingBinder");
            }
            int i3 = this.b.a;
            String str = null;
            if (!(b2 == null || (b2.a & 4) == 0)) {
                nii nii = b2.d;
                if (nii == null) {
                    nii = nii.d;
                }
                str = nii.b;
            }
            int dataSize = parcel.dataSize();
            parcel.setDataPosition(dataSize);
            parcel.writeString(str);
            int dataPosition = parcel.dataPosition();
            parcel.writeInt(dataPosition - dataSize);
            parcel.writeInt(-1205835348);
            int dataSize2 = parcel.dataSize();
            if (dataPosition != dataSize2 - 8) {
                Log.e("BinderPropagation", String.format(Locale.US, "Non-standard Parcel alignment. %d %d %d", new Object[]{Integer.valueOf(dataPosition), Integer.valueOf(dataSize2), Integer.valueOf(parcel.dataPosition())}));
                for (int i4 = 0; i4 < 4; i4++) {
                    parcel.writeInt(0);
                }
            }
        }
        return this.a.transact(i, parcel, parcel2, i2);
    }
}
