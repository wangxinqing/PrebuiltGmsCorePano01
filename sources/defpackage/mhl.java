package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.family.model.InvitationDataModel;

/* renamed from: mhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mhl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new InvitationDataModel(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InvitationDataModel[i];
    }
}
