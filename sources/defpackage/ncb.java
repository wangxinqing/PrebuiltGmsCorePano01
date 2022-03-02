package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;

/* renamed from: ncb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ncb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignRequestParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Integer num = null;
        Double d = null;
        Uri uri = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        ChannelIdValue channelIdValue = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    num = ivw.h(parcel, readInt);
                    break;
                case 3:
                    d = ivw.o(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    bArr = ivw.t(parcel, readInt);
                    break;
                case 6:
                    arrayList = ivw.c(parcel, readInt, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) ivw.a(parcel, readInt, ChannelIdValue.CREATOR);
                    break;
                case 8:
                    str = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new SignRequestParams(num, d, uri, bArr, arrayList, channelIdValue, str);
    }
}
