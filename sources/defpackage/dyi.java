package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: dyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dyi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SelectionFragmentOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String[] strArr = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        Bundle bundle = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    arrayList = ivw.c(parcel2, readInt, ContactPerson.CREATOR);
                    break;
                case 5:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    strArr = ivw.A(parcel2, readInt);
                    break;
                case 7:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 8:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 9:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 11:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    arrayList2 = ivw.c(parcel2, readInt, Bundle.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new SelectionFragmentOptions(str, i, arrayList, z, strArr, i2, i3, str2, str3, z2, arrayList2, z3, z4, bundle);
    }
}
