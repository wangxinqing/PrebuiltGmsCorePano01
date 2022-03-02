package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import java.util.ArrayList;

/* renamed from: adxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LabelValueRow[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList a = jhx.a();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a2 = ivw.a(readInt);
            if (a2 == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a2 == 3) {
                str2 = ivw.q(parcel, readInt);
            } else if (a2 != 4) {
                ivw.b(parcel, readInt);
            } else {
                a = ivw.c(parcel, readInt, LabelValue.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LabelValueRow(str, str2, a);
    }
}
