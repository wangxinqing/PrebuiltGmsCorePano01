package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.view.NfcEnableViewOptions;

/* renamed from: nct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nct implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NfcEnableViewOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        while (parcel.dataPosition() < b) {
            ivw.b(parcel, parcel.readInt());
        }
        ivw.E(parcel, b);
        return new NfcEnableViewOptions();
    }
}
