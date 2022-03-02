package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: rxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rxz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OverrideFileGroupRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        ParcelFileDescriptor[] parcelFileDescriptorArr = null;
        Account account = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 3:
                    strArr = ivw.A(parcel, readInt);
                    break;
                case 4:
                    strArr2 = ivw.A(parcel, readInt);
                    break;
                case 5:
                    parcelFileDescriptorArr = (ParcelFileDescriptor[]) ivw.b(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new OverrideFileGroupRequest(str, str2, strArr, strArr2, parcelFileDescriptorArr, account);
    }
}
