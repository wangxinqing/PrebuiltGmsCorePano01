package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: heb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class heb implements Parcelable.Creator {
    public static void a(GoogleSettingsItem googleSettingsItem, Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.b(parcel, 1, googleSettingsItem.a);
        ivx.a(parcel, 2, googleSettingsItem.b, i, false);
        ivx.b(parcel, 3, googleSettingsItem.c);
        ivx.a(parcel, 4, googleSettingsItem.d, false);
        ivx.b(parcel, 6, googleSettingsItem.e);
        ivx.a(parcel, 7, googleSettingsItem.f);
        ivx.a(parcel, 8, googleSettingsItem.g);
        ivx.a(parcel, 9, googleSettingsItem.h);
        ivx.a(parcel, 10, googleSettingsItem.i, false);
        ivx.a(parcel, 11, googleSettingsItem.j);
        ivx.a(parcel, 12, googleSettingsItem.k);
        ivx.b(parcel, 13, googleSettingsItem.l, false);
        ivx.a(parcel, 14, googleSettingsItem.m);
        ivx.a(parcel, 15, googleSettingsItem.n, false);
        ivx.b(parcel, 16, googleSettingsItem.o);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Intent intent = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    intent = (Intent) ivw.a(parcel2, readInt, Intent.CREATOR);
                    break;
                case 3:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 11:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 16:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GoogleSettingsItem(i, intent, i2, str, i3, z, z2, z3, str2, z4, z5, arrayList, z6, str3, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSettingsItem[i];
    }
}
