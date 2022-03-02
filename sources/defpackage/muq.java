package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: muq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class muq implements Parcelable.Creator {
    public static final ErrorReport a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        while (parcel.dataPosition() < b) {
            int a = ivw.a(parcel);
            switch (ivw.a(a)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) ivw.a(parcel2, a, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = ivw.q(parcel2, a);
                    break;
                case 4:
                    i = ivw.g(parcel2, a);
                    break;
                case 5:
                    str2 = ivw.q(parcel2, a);
                    break;
                case 6:
                    str3 = ivw.q(parcel2, a);
                    break;
                case 7:
                    str4 = ivw.q(parcel2, a);
                    break;
                case 8:
                    str5 = ivw.q(parcel2, a);
                    break;
                case 9:
                    str6 = ivw.q(parcel2, a);
                    break;
                case 10:
                    str7 = ivw.q(parcel2, a);
                    break;
                case 11:
                    str8 = ivw.q(parcel2, a);
                    break;
                case 12:
                    i2 = ivw.g(parcel2, a);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str9 = ivw.q(parcel2, a);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str10 = ivw.q(parcel2, a);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str11 = ivw.q(parcel2, a);
                    break;
                case 16:
                    str12 = ivw.q(parcel2, a);
                    break;
                case 17:
                    str13 = ivw.q(parcel2, a);
                    break;
                case 18:
                    strArr = ivw.A(parcel2, a);
                    break;
                case 19:
                    strArr2 = ivw.A(parcel2, a);
                    break;
                case 20:
                    strArr3 = ivw.A(parcel2, a);
                    break;
                case 21:
                    str14 = ivw.q(parcel2, a);
                    break;
                case 22:
                    str15 = ivw.q(parcel2, a);
                    break;
                case 23:
                    bArr = ivw.t(parcel2, a);
                    break;
                case 24:
                    i3 = ivw.g(parcel2, a);
                    break;
                case 25:
                    i4 = ivw.g(parcel2, a);
                    break;
                case 26:
                    i5 = ivw.g(parcel2, a);
                    break;
                case 27:
                    i6 = ivw.g(parcel2, a);
                    break;
                case 28:
                    str16 = ivw.q(parcel2, a);
                    break;
                case 29:
                    str17 = ivw.q(parcel2, a);
                    break;
                case 30:
                    str18 = ivw.q(parcel2, a);
                    break;
                case 31:
                    bundle = ivw.s(parcel2, a);
                    break;
                case 32:
                    z = ivw.c(parcel2, a);
                    break;
                case 33:
                    i7 = ivw.g(parcel2, a);
                    break;
                case 34:
                    i8 = ivw.g(parcel2, a);
                    break;
                case 35:
                    z2 = ivw.c(parcel2, a);
                    break;
                case 36:
                    str19 = ivw.q(parcel2, a);
                    break;
                case 37:
                    str20 = ivw.q(parcel2, a);
                    break;
                case 38:
                    i9 = ivw.g(parcel2, a);
                    break;
                case 39:
                    str21 = ivw.q(parcel2, a);
                    break;
                case 40:
                    str22 = ivw.q(parcel2, a);
                    break;
                case 41:
                    str23 = ivw.q(parcel2, a);
                    break;
                case 42:
                    str24 = ivw.q(parcel2, a);
                    break;
                case 43:
                    str25 = ivw.q(parcel2, a);
                    break;
                case 44:
                    str26 = ivw.q(parcel2, a);
                    break;
                case 45:
                    str27 = ivw.q(parcel2, a);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) ivw.a(parcel2, a, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = ivw.q(parcel2, a);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) ivw.b(parcel2, a, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = ivw.A(parcel2, a);
                    break;
                case 50:
                    z3 = ivw.c(parcel2, a);
                    break;
                case 51:
                    str29 = ivw.q(parcel2, a);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) ivw.a(parcel2, a, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) ivw.a(parcel2, a, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = ivw.q(parcel2, a);
                    break;
                case 55:
                    z4 = ivw.c(parcel2, a);
                    break;
                case 56:
                    bundle2 = ivw.s(parcel2, a);
                    break;
                case 57:
                    arrayList = ivw.c(parcel2, a, RectF.CREATOR);
                    break;
                case 58:
                    z5 = ivw.c(parcel2, a);
                    break;
                case 59:
                    bitmap = (Bitmap) ivw.a(parcel2, a, Bitmap.CREATOR);
                    break;
                case 60:
                    str31 = ivw.q(parcel2, a);
                    break;
                case 61:
                    arrayList2 = ivw.C(parcel2, a);
                    break;
                case 62:
                    i10 = ivw.g(parcel2, a);
                    break;
                default:
                    ivw.b(parcel2, a);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }

    public static void a(ErrorReport errorReport, Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 2, errorReport.a, i, false);
        ivx.a(parcel, 3, errorReport.b, false);
        ivx.b(parcel, 4, errorReport.c);
        ivx.a(parcel, 5, errorReport.d, false);
        ivx.a(parcel, 6, errorReport.e, false);
        ivx.a(parcel, 7, errorReport.f, false);
        ivx.a(parcel, 8, errorReport.g, false);
        ivx.a(parcel, 9, errorReport.h, false);
        ivx.a(parcel, 10, errorReport.i, false);
        ivx.a(parcel, 11, errorReport.j, false);
        ivx.b(parcel, 12, errorReport.k);
        ivx.a(parcel, 13, errorReport.l, false);
        ivx.a(parcel, 14, errorReport.m, false);
        ivx.a(parcel, 15, errorReport.n, false);
        ivx.a(parcel, 16, errorReport.o, false);
        ivx.a(parcel, 17, errorReport.p, false);
        ivx.a(parcel, 18, errorReport.q, false);
        ivx.a(parcel, 19, errorReport.r, false);
        ivx.a(parcel, 20, errorReport.s, false);
        ivx.a(parcel, 21, errorReport.t, false);
        ivx.a(parcel, 22, errorReport.u, false);
        ivx.a(parcel, 23, errorReport.v, false);
        ivx.b(parcel, 24, errorReport.w);
        ivx.b(parcel, 25, errorReport.x);
        ivx.b(parcel, 26, errorReport.y);
        ivx.b(parcel, 27, errorReport.z);
        ivx.a(parcel, 28, errorReport.A, false);
        ivx.a(parcel, 29, errorReport.B, false);
        ivx.a(parcel, 30, errorReport.C, false);
        ivx.a(parcel, 31, errorReport.D, false);
        ivx.a(parcel, 32, errorReport.E);
        ivx.b(parcel, 33, errorReport.F);
        ivx.b(parcel, 34, errorReport.G);
        ivx.a(parcel, 35, errorReport.H);
        ivx.a(parcel, 36, errorReport.I, false);
        ivx.a(parcel, 37, errorReport.J, false);
        ivx.b(parcel, 38, errorReport.K);
        ivx.a(parcel, 39, errorReport.L, false);
        ivx.a(parcel, 40, errorReport.M, false);
        ivx.a(parcel, 41, errorReport.N, false);
        ivx.a(parcel, 42, errorReport.O, false);
        ivx.a(parcel, 43, errorReport.P, false);
        ivx.a(parcel, 44, errorReport.Q, false);
        ivx.a(parcel, 45, errorReport.R, false);
        ivx.a(parcel, 46, errorReport.S, i, false);
        ivx.a(parcel, 47, errorReport.T, false);
        ivx.a(parcel, 48, (Parcelable[]) errorReport.U, i);
        ivx.a(parcel, 49, errorReport.V, false);
        ivx.a(parcel, 50, errorReport.W);
        ivx.a(parcel, 51, errorReport.X, false);
        ivx.a(parcel, 52, errorReport.Y, i, false);
        ivx.a(parcel, 53, errorReport.Z, i, false);
        ivx.a(parcel, 54, errorReport.aa, false);
        ivx.a(parcel, 55, errorReport.ab);
        ivx.a(parcel, 56, errorReport.ac, false);
        ivx.c(parcel, 57, errorReport.ad, false);
        ivx.a(parcel, 58, errorReport.ae);
        ivx.a(parcel, 59, errorReport.af, i, false);
        ivx.a(parcel, 60, errorReport.ag, false);
        ivx.b(parcel, 61, errorReport.ah, false);
        ivx.b(parcel, 62, errorReport.ai);
        ivx.b(parcel, a);
    }
}
