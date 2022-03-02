package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.io.File;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new nyv();
    public boolean A;
    public boolean B;
    public int C;
    public String D;
    public boolean E;
    public String F;
    public mum G;
    final int a;
    public String b;
    public Account c;
    public Bundle d;
    public String e;
    String f;
    Bitmap g;
    public boolean h;
    public boolean i;
    public List j;
    @Deprecated
    public Bundle k;
    @Deprecated
    public Bitmap l;
    @Deprecated
    public byte[] m;
    @Deprecated
    public int n;
    @Deprecated
    public int o;
    public String p;
    public Uri q;
    public List r;
    public ThemeSettings s;
    public List t;
    public boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    public PendingIntent y;
    public int z;

    @Deprecated
    public GoogleHelp(int i2, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z2, boolean z3, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i3, int i4, String str4, Uri uri, List list2, int i5, ThemeSettings themeSettings, List list3, boolean z4, ErrorReport errorReport, TogglingData togglingData, int i6, PendingIntent pendingIntent, int i7, boolean z5, boolean z6, int i8, String str5, boolean z7) {
        int i9 = i2;
        ErrorReport errorReport2 = errorReport;
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            Log.e("gH_GoogleHelp", "Help requires a non-empty appContext. Please fix ASAP.");
        }
        this.a = i9;
        this.z = i7;
        this.A = z5;
        this.B = z6;
        this.C = i8;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z2;
        this.i = z3;
        this.E = z7;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i3;
        this.o = i4;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i9 < 4) {
            ThemeSettings themeSettings2 = new ThemeSettings();
            themeSettings2.a = i5;
            this.s = themeSettings2;
        } else {
            this.s = themeSettings == null ? new ThemeSettings() : themeSettings;
        }
        this.t = list3;
        this.u = z4;
        this.v = errorReport2;
        if (errorReport2 != null) {
            errorReport2.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i6;
    }

    public static GoogleHelp a(String str) {
        return new GoogleHelp(str);
    }

    public final Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i2, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.h);
        ivx.a(parcel, 6, this.i);
        ivx.b(parcel, 7, this.j, false);
        ivx.a(parcel, 10, this.k, false);
        ivx.a(parcel, 11, this.l, i2, false);
        ivx.a(parcel, 14, this.p, false);
        ivx.a(parcel, 15, this.q, i2, false);
        ivx.c(parcel, 16, this.r, false);
        ivx.b(parcel, 17, 0);
        ivx.c(parcel, 18, this.t, false);
        ivx.a(parcel, 19, this.m, false);
        ivx.b(parcel, 20, this.n);
        ivx.b(parcel, 21, this.o);
        ivx.a(parcel, 22, this.u);
        ivx.a(parcel, 23, this.v, i2, false);
        ivx.a(parcel, 25, this.s, i2, false);
        ivx.a(parcel, 28, this.e, false);
        ivx.a(parcel, 31, this.w, i2, false);
        ivx.b(parcel, 32, this.x);
        ivx.a(parcel, 33, this.y, i2, false);
        ivx.a(parcel, 34, this.f, false);
        ivx.a(parcel, 35, this.g, i2, false);
        ivx.b(parcel, 36, this.z);
        ivx.a(parcel, 37, this.A);
        ivx.a(parcel, 38, this.B);
        ivx.b(parcel, 39, this.C);
        ivx.a(parcel, 40, this.D, false);
        ivx.a(parcel, 41, this.E);
        ivx.a(parcel, 42, this.F, false);
        ivx.b(parcel, a2);
    }

    public final void a(Context context) {
        this.f = context.getString(R.string.common_google_settings);
        this.g = BitmapFactory.decodeResource(context.getResources(), R.drawable.common_settings_icon);
    }

    public final void a(FeedbackOptions feedbackOptions, File file) {
        if (feedbackOptions != null) {
            this.G = feedbackOptions.q;
        }
        ErrorReport errorReport = new ErrorReport(feedbackOptions, file);
        this.v = errorReport;
        errorReport.X = "GoogleHelp";
    }

    @Deprecated
    public final void a(Map map) {
        this.d = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            this.d.putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public GoogleHelp(int i2, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z2, boolean z3, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i3, int i4, String str4, Uri uri, List list2, int i5, ThemeSettings themeSettings, List list3, boolean z4, ErrorReport errorReport, TogglingData togglingData, int i6, PendingIntent pendingIntent, int i7, boolean z5, boolean z6, int i8, String str5, boolean z7, String str6) {
        this(i2, str, account, bundle, str2, str3, bitmap, z2, z3, list, bundle2, bitmap2, bArr, i3, i4, str4, uri, list2, i5, themeSettings, list3, z4, errorReport, togglingData, i6, pendingIntent, i7, z5, z6, i8, str5, z7);
        this.F = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleHelp(java.lang.String r34) {
        /*
            r33 = this;
            r0 = r33
            r2 = r34
            java.util.ArrayList r1 = new java.util.ArrayList
            r10 = r1
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r18 = r1
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r21 = r1
            r1.<init>()
            com.google.android.gms.feedback.ErrorReport r1 = new com.google.android.gms.feedback.ErrorReport
            r23 = r1
            r1.<init>()
            r1 = 14
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 3
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = -1
            r28 = 0
            r29 = 0
            r30 = 200(0xc8, float:2.8E-43)
            r31 = 0
            r32 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.GoogleHelp.<init>(java.lang.String):void");
    }
}
