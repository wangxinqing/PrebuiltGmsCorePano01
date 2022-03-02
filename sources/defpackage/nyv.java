package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: nyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nyv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 5:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 10:
                    bundle2 = ivw.s(parcel2, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) ivw.a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = ivw.c(parcel2, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case 18:
                    arrayList3 = ivw.c(parcel2, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 20:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 21:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 22:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) ivw.a(parcel2, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) ivw.a(parcel2, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) ivw.a(parcel2, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = ivw.g(parcel2, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) ivw.a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) ivw.a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = ivw.g(parcel2, readInt);
                    break;
                case 37:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 38:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 39:
                    i7 = ivw.g(parcel2, readInt);
                    break;
                case 40:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 41:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case 42:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6);
    }
}
