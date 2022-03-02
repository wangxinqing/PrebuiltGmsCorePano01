package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: mwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwe implements Parcelable.Creator {
    public static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 2, feedbackOptions.a, false);
        ivx.a(parcel, 3, feedbackOptions.b, false);
        ivx.a(parcel, 5, feedbackOptions.c, false);
        ivx.a(parcel, 6, feedbackOptions.d, i, false);
        ivx.a(parcel, 7, feedbackOptions.e, false);
        ivx.a(parcel, 8, feedbackOptions.f, i, false);
        ivx.a(parcel, 9, feedbackOptions.g, false);
        ivx.c(parcel, 10, feedbackOptions.h, false);
        ivx.a(parcel, 11, feedbackOptions.i);
        ivx.a(parcel, 12, feedbackOptions.j, i, false);
        ivx.a(parcel, 13, feedbackOptions.k, i, false);
        ivx.a(parcel, 14, feedbackOptions.l);
        ivx.a(parcel, 15, feedbackOptions.m, i, false);
        ivx.a(parcel, 16, feedbackOptions.n, false);
        ivx.a(parcel, 17, feedbackOptions.o);
        ivx.a(parcel, 18, feedbackOptions.p);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) ivw.a(parcel2, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) ivw.a(parcel2, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    arrayList = ivw.c(parcel2, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) ivw.a(parcel2, readInt, ThemeSettings.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    logOptions = (LogOptions) ivw.a(parcel2, readInt, LogOptions.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    bitmap = (Bitmap) ivw.a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 17:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 18:
                    j = ivw.i(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
