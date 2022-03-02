package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: vsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vsg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ShareTarget[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        Uri uri = null;
        Bundle bundle = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str2 = null;
        String str3 = null;
        PendingIntent pendingIntent = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 4:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 6:
                    arrayList = ivw.c(parcel2, readInt, TextAttachment.CREATOR);
                    break;
                case 7:
                    arrayList2 = ivw.c(parcel2, readInt, FileAttachment.CREATOR);
                    break;
                case 8:
                    arrayList3 = ivw.c(parcel2, readInt, WifiCredentialsAttachment.CREATOR);
                    break;
                case 9:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 11:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    pendingIntent = (PendingIntent) ivw.a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ShareTarget(j, str, uri, i, bundle, arrayList, arrayList2, arrayList3, z, str2, z2, str3, pendingIntent, z3);
    }
}
