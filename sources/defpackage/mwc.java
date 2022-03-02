package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class mwc {
    public String a;
    public String b;
    public String c;
    public final List d;
    public ThemeSettings e;
    public LogOptions f;
    public long g;
    ApplicationErrorReport h;
    private Bitmap i;
    private BitmapTeleporter j;
    private final Bundle k;
    private boolean l;
    private boolean m;
    private mum n;
    private String o;
    private final boolean p;

    @Deprecated
    public mwc() {
        this.k = new Bundle();
        this.d = new ArrayList();
        this.o = myo.a();
        this.p = false;
        this.g = 0;
    }

    public FeedbackOptions a() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.m = this.i;
        feedbackOptions.f = this.j;
        feedbackOptions.a = this.a;
        feedbackOptions.c = this.b;
        feedbackOptions.b = this.k;
        feedbackOptions.e = this.c;
        feedbackOptions.h = this.d;
        feedbackOptions.i = this.l;
        feedbackOptions.j = this.e;
        feedbackOptions.k = this.f;
        feedbackOptions.l = this.m;
        feedbackOptions.q = this.n;
        feedbackOptions.n = this.o;
        feedbackOptions.o = this.p;
        feedbackOptions.p = this.g;
        return feedbackOptions;
    }

    public final void b() {
        this.l = true;
    }

    public mwc(Context context) {
        aeej.a(context);
        this.k = new Bundle();
        this.d = new ArrayList();
        try {
            this.o = !((Boolean) myq.c.a()).booleanValue() ? myo.a() : myo.b();
        } catch (SecurityException e2) {
            this.o = myo.a();
        }
        this.p = false;
        this.g = 0;
    }

    public final void b(Bitmap bitmap) {
        if (!this.l || !axhn.a.a().c()) {
            this.i = bitmap;
            return;
        }
        throw new IllegalStateException("Can't call setScreenshotBitmap after report is already certified pii free.");
    }

    @Deprecated
    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            b(bitmap);
        }
    }

    @Deprecated
    public final void a(String str, String str2) {
        if (!this.m) {
            this.k.putString(str, str2);
            return;
        }
        throw new IllegalStateException("Can't call addPsd after psd is already certified pii free");
    }

    public final void a(String str, String str2, boolean z) {
        a(z);
        this.k.putString(str, str2);
    }

    public mwc(FeedbackOptions feedbackOptions) {
        this.i = feedbackOptions.m;
        this.j = feedbackOptions.f;
        this.a = feedbackOptions.a;
        this.b = feedbackOptions.c;
        this.k = feedbackOptions.b;
        this.c = feedbackOptions.e;
        this.d = feedbackOptions.h;
        this.l = feedbackOptions.i;
        this.e = feedbackOptions.j;
        this.f = feedbackOptions.k;
        this.m = feedbackOptions.l;
        this.n = feedbackOptions.q;
        this.o = feedbackOptions.n;
        this.p = feedbackOptions.o;
        this.g = feedbackOptions.p;
        this.h = feedbackOptions.d;
    }

    public final void a(mum mum, boolean z) {
        a(z);
        this.n = mum;
    }

    public final void a(boolean z) {
        if ((!this.k.isEmpty() || !this.d.isEmpty()) && this.m != z) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.m = z;
    }
}
