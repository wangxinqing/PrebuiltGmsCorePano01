package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mwe();
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public ThemeSettings j;
    public LogOptions k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;
    public mum q;

    public FeedbackOptions(ApplicationErrorReport applicationErrorReport) {
        this((String) null, (Bundle) null, (String) null, applicationErrorReport, (String) null, (BitmapTeleporter) null, (String) null, (List) null, true, (ThemeSettings) null, (LogOptions) null, false, (Bitmap) null, (String) null, false, 0);
    }

    public static FeedbackOptions a(List list) {
        FeedbackOptions feedbackOptions = new FeedbackOptions((ApplicationErrorReport) null);
        feedbackOptions.h = list;
        return feedbackOptions;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        mwe.a(this, parcel, i2);
    }

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2, Bitmap bitmap, String str5, boolean z3, long j2) {
        this.q = null;
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list;
        this.i = z;
        this.j = themeSettings;
        this.k = logOptions;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j2;
    }
}
