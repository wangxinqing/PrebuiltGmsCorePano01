package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.List;

/* renamed from: zvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class zvl extends bhw implements zvm {
    public zvl() {
        super("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public final void d(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), parcel.createTypedArrayList(RawContactEntity.CREATOR));
        } else if (i == 2) {
            a((Status) bhx.a(parcel, Status.CREATOR));
        } else if (i == 3) {
            b((Status) bhx.a(parcel, Status.CREATOR), parcel.createTypedArrayList(BackedUpContactsPerDeviceEntity.CREATOR));
        } else if (i == 4) {
            c((Status) bhx.a(parcel, Status.CREATOR), parcel.createTypedArrayList(SourceStatsEntity.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            d((Status) bhx.a(parcel, Status.CREATOR), parcel.createTypedArrayList(RestoreInfoEntity.CREATOR));
        }
        return true;
    }
}
