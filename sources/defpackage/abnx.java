package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.PendingAccountData;
import java.util.ArrayList;

/* renamed from: abnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abnx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BootstrapCompletionResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        BootstrapAccount bootstrapAccount = null;
        ArrayList arrayList2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    arrayList = ivw.c(parcel, readInt, BootstrapAccount.CREATOR);
                    break;
                case 5:
                    bootstrapAccount = (BootstrapAccount) ivw.a(parcel, readInt, BootstrapAccount.CREATOR);
                    break;
                case 6:
                    arrayList2 = ivw.c(parcel, readInt, PendingAccountData.CREATOR);
                    break;
                case 7:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 8:
                    j = ivw.i(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new BootstrapCompletionResult(i, str, arrayList, bootstrapAccount, arrayList2, i2, j);
    }
}
