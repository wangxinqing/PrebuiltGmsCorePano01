package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;

/* renamed from: ajnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReportingConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        Conditions conditions = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                arrayList = ivw.c(parcel, readInt, AccountConfig.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                conditions = (Conditions) ivw.a(parcel, readInt, Conditions.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ReportingConfig(arrayList, conditions);
    }
}
