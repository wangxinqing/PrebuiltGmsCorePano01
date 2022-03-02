package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* renamed from: nbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nbo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BrowserSignRequestParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        SignRequestParams signRequestParams = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                signRequestParams = (SignRequestParams) ivw.a(parcel, readInt, SignRequestParams.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new BrowserSignRequestParams(signRequestParams, uri);
    }
}
