package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.File;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new muq();
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public FileTeleporter[] U;
    public String[] V;
    public boolean W;
    public String X;
    public ThemeSettings Y;
    public LogOptions Z;
    public ApplicationErrorReport a;
    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        muq.a(this, parcel, i2);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i4, int i5, int i6, int i7, String str16, String str17, String str18, Bundle bundle, boolean z2, int i8, int i9, boolean z3, String str19, String str20, int i10, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z4, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z5, Bundle bundle2, List list, boolean z6, Bitmap bitmap, String str31, List list2, int i11) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i3;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i4;
        this.x = i5;
        this.y = i6;
        this.z = i7;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z2;
        this.F = i8;
        this.G = i9;
        this.H = z3;
        this.I = str19;
        this.J = str20;
        this.K = i10;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = fileTeleporterArr;
        this.V = strArr4;
        this.W = z4;
        this.X = str29;
        this.Y = themeSettings;
        this.Z = logOptions;
        this.aa = str30;
        this.ab = z5;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z6;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i11;
    }

    public ErrorReport(FeedbackOptions feedbackOptions, File file) {
        ApplicationErrorReport.CrashInfo crashInfo;
        this.a = new ApplicationErrorReport();
        if (feedbackOptions != null) {
            Bundle bundle = feedbackOptions.b;
            if (bundle != null && bundle.size() > 0) {
                this.D = feedbackOptions.b;
            }
            if (!TextUtils.isEmpty(feedbackOptions.a)) {
                this.B = feedbackOptions.a;
            }
            if (!TextUtils.isEmpty(feedbackOptions.c)) {
                this.b = feedbackOptions.c;
            }
            ApplicationErrorReport applicationErrorReport = feedbackOptions.d;
            if (applicationErrorReport != null) {
                crashInfo = applicationErrorReport.crashInfo;
            } else {
                crashInfo = null;
            }
            if (crashInfo != null) {
                this.M = crashInfo.throwMethodName;
                this.K = crashInfo.throwLineNumber;
                this.L = crashInfo.throwClassName;
                this.N = crashInfo.stackTrace;
                this.I = crashInfo.exceptionClassName;
                this.O = crashInfo.exceptionMessage;
                this.J = crashInfo.throwFileName;
            }
            ThemeSettings themeSettings = feedbackOptions.j;
            if (themeSettings != null) {
                this.Y = themeSettings;
            }
            if (!TextUtils.isEmpty(feedbackOptions.e)) {
                this.P = feedbackOptions.e;
            }
            if (!TextUtils.isEmpty(feedbackOptions.g)) {
                this.a.packageName = feedbackOptions.g;
            }
            if (!TextUtils.isEmpty(feedbackOptions.n)) {
                this.ag = feedbackOptions.n;
            }
            Bitmap bitmap = feedbackOptions.m;
            if (bitmap != null) {
                this.af = bitmap;
            }
            if (file != null) {
                BitmapTeleporter bitmapTeleporter = feedbackOptions.f;
                if (bitmapTeleporter != null) {
                    this.S = bitmapTeleporter;
                    bitmapTeleporter.a(file);
                }
                List<FileTeleporter> list = feedbackOptions.h;
                if (list != null && !list.isEmpty()) {
                    for (FileTeleporter a2 : list) {
                        a2.a(file);
                    }
                    this.U = (FileTeleporter[]) list.toArray(new FileTeleporter[feedbackOptions.h.size()]);
                }
            }
            LogOptions logOptions = feedbackOptions.k;
            if (logOptions != null) {
                this.Z = logOptions;
            }
            this.W = feedbackOptions.i;
            this.ae = feedbackOptions.l;
            this.E = feedbackOptions.o;
        }
    }
}
