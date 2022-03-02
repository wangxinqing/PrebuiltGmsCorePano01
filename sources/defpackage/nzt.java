package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import java.util.ArrayList;

/* renamed from: nzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HelpConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Account account = null;
        String str3 = null;
        Bundle bundle = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        Bundle bundle4 = null;
        Bitmap bitmap = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str5 = null;
        ErrorReport errorReport = null;
        ThemeSettings themeSettings = null;
        PendingIntent pendingIntent = null;
        Boolean bool = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel2, readInt);
            } else if (a == 3) {
                str2 = ivw.q(parcel2, readInt);
            } else if (a == 4) {
                account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
            } else if (a == 5) {
                str3 = ivw.q(parcel2, readInt);
            } else if (a == 6) {
                bundle = ivw.s(parcel2, readInt);
            } else if (a == 8) {
                z = ivw.c(parcel2, readInt);
            } else if (a == 9) {
                z2 = ivw.c(parcel2, readInt);
            } else if (a == 11) {
                arrayList = ivw.C(parcel2, readInt);
            } else if (a == 19) {
                str4 = ivw.q(parcel2, readInt);
            } else if (a == 25) {
                arrayList3 = ivw.c(parcel2, readInt, OfflineSuggestion.CREATOR);
            } else if (a == 50) {
                bundle3 = ivw.s(parcel2, readInt);
            } else if (a == 15) {
                bundle4 = ivw.s(parcel2, readInt);
            } else if (a == 16) {
                bitmap = (Bitmap) ivw.a(parcel2, readInt, Bitmap.CREATOR);
            } else if (a == 22) {
                uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
            } else if (a == 23) {
                arrayList2 = ivw.c(parcel2, readInt, OverflowMenuItem.CREATOR);
            } else if (a == 38) {
                z3 = ivw.c(parcel2, readInt);
            } else if (a == 39) {
                errorReport = (ErrorReport) ivw.a(parcel2, readInt, ErrorReport.CREATOR);
            } else if (a == 52) {
                pendingIntent = (PendingIntent) ivw.a(parcel2, readInt, PendingIntent.CREATOR);
            } else if (a != 53) {
                switch (a) {
                    case 31:
                        str5 = ivw.q(parcel2, readInt);
                        break;
                    case 32:
                        bArr = ivw.t(parcel2, readInt);
                        break;
                    case 33:
                        i2 = ivw.g(parcel2, readInt);
                        break;
                    case 34:
                        i3 = ivw.g(parcel2, readInt);
                        break;
                    case 35:
                        bundle2 = ivw.s(parcel2, readInt);
                        break;
                    case 36:
                        i = ivw.g(parcel2, readInt);
                        break;
                    default:
                        switch (a) {
                            case 41:
                                themeSettings = (ThemeSettings) ivw.a(parcel2, readInt, ThemeSettings.CREATOR);
                                break;
                            case 42:
                                z4 = ivw.c(parcel2, readInt);
                                break;
                            case 43:
                                i4 = ivw.g(parcel2, readInt);
                                break;
                            default:
                                switch (a) {
                                    case 56:
                                        i5 = ivw.g(parcel2, readInt);
                                        break;
                                    case 57:
                                        z5 = ivw.c(parcel2, readInt);
                                        break;
                                    case 58:
                                        z6 = ivw.c(parcel2, readInt);
                                        break;
                                    case 59:
                                        z7 = ivw.c(parcel2, readInt);
                                        break;
                                    case 60:
                                        z8 = ivw.c(parcel2, readInt);
                                        break;
                                    case 61:
                                        str6 = ivw.q(parcel2, readInt);
                                        break;
                                    case 62:
                                        str7 = ivw.q(parcel2, readInt);
                                        break;
                                    case 63:
                                        str8 = ivw.q(parcel2, readInt);
                                        break;
                                    case 64:
                                        str9 = ivw.q(parcel2, readInt);
                                        break;
                                    default:
                                        ivw.b(parcel2, readInt);
                                        break;
                                }
                        }
                }
            } else {
                bool = ivw.d(parcel2, readInt);
            }
        }
        ivw.E(parcel2, b);
        return new HelpConfig(str, str2, account, str3, bundle, z, z2, arrayList, bundle2, bundle3, i, bundle4, bitmap, bArr, i2, i3, str4, uri, arrayList2, arrayList3, z3, z4, i4, str5, errorReport, themeSettings, pendingIntent, bool, i5, z5, z6, z7, z8, str6, str7, str8, str9);
    }
}
