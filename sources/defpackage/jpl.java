package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.PhoneNumberInfo;
import java.util.List;

/* renamed from: jpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jpl extends bhw implements IInterface {
    public jpl() {
        super("com.google.android.gms.constellation.internal.IConstellationCallbacks");
    }

    public void a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), parcel.createTypedArrayList(PhoneNumberInfo.CREATOR));
        return true;
    }
}
