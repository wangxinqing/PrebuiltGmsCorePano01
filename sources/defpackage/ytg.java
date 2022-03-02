package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: ytg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ytg extends bhw implements yth {
    public ytg() {
        super("com.google.android.gms.plus.internal.IPlusCallbacks");
    }

    public final void a(int i, Bundle bundle) {
    }

    public void a(int i, Bundle bundle, Bundle bundle2) {
    }

    public void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
    }

    public final void a(int i, Bundle bundle, SafeParcelResponse safeParcelResponse) {
    }

    public final void a(int i, PersonEntity personEntity) {
    }

    public final void a(Status status) {
    }

    public final void a(DataHolder dataHolder, String str) {
    }

    public final void a(DataHolder dataHolder, String str, String str2) {
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) bhx.a(parcel, ParcelFileDescriptor.CREATOR));
                break;
            case 3:
                parcel.readString();
                break;
            case 4:
                DataHolder dataHolder = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                parcel.readString();
                break;
            case 5:
                parcel.readInt();
                Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                SafeParcelResponse safeParcelResponse = (SafeParcelResponse) bhx.a(parcel, SafeParcelResponse.CREATOR);
                break;
            case 6:
                DataHolder dataHolder2 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                parcel.readString();
                parcel.readString();
                break;
            case 7:
                parcel.readInt();
                Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                break;
            case 8:
                parcel.readString();
                break;
            case 9:
                parcel.readInt();
                PersonEntity personEntity = (PersonEntity) bhx.a(parcel, PersonEntity.CREATOR);
                break;
            case 10:
                Status status = (Status) bhx.a(parcel, Status.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
