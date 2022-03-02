package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: aker  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aker {
    public Uri a;
    public BitmapDrawable b;
    public final Rect c = new Rect();
    public int d = 0;
    public float e = 1.0f;
    public float f = 1.0f;
    public final RectF g = new RectF();
    public final RectF h = new RectF();

    public static boolean a(float[] fArr, RectF rectF) {
        if (fArr == null || fArr.length != 4) {
            return false;
        }
        rectF.set(fArr[0], fArr[1], fArr[2], fArr[3]);
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.b);
        float f2 = this.e;
        float f3 = this.f;
        int i = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 129 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("{TransitionImage Uri=");
        sb.append(valueOf);
        sb.append(" rect=");
        sb.append(valueOf2);
        sb.append(" unclipRect=");
        sb.append(valueOf3);
        sb.append(" clipRect=");
        sb.append(valueOf4);
        sb.append(" bitmap=");
        sb.append(valueOf5);
        sb.append(" alpha=");
        sb.append(f2);
        sb.append(" saturation=");
        sb.append(f3);
        sb.append(" background=");
        sb.append(i);
        return sb.toString();
    }

    public final void a(Rect rect) {
        if (this.d == 0) {
            this.h.round(rect);
        } else {
            rect.set(this.c);
        }
    }

    public final boolean a(Context context, Rect rect, Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        Rect rect2 = null;
        this.b = null;
        if (bundle != null) {
            Uri uri = (Uri) bundle.getParcelable("com.google.android.pano.transition_bmp_uri");
            this.a = uri;
            if (uri != null) {
                if (akfs.b == null) {
                    synchronized (akfs.c) {
                        if (akfs.b == null) {
                            akfs.b = new akfs(context);
                        }
                    }
                }
                akfs akfs = akfs.b;
                akfk akfk = new akfk(context);
                akfk.a = this.a;
                String a2 = akfk.a().a();
                StringBuilder sb = new StringBuilder(a2.length() + 16);
                sb.append(a2);
                sb.append(":");
                sb.append("");
                if (((akfr) akfs.a.get(sb.toString())) != null) {
                    throw null;
                }
            }
            if (bundle.containsKey("com.google.android.pano.transition_bitmap")) {
                bitmapDrawable = new BitmapDrawable(context.getResources(), akel.a(bundle.getBundle("com.google.android.pano.transition_bitmap")));
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null) {
                String string = bundle.getString("com.google.android.pano.transition_bmp_rect");
                if (!TextUtils.isEmpty(string)) {
                    rect2 = Rect.unflattenFromString(string);
                }
                if (rect2 != null) {
                    rect = rect2;
                }
                if (rect != null) {
                    this.b = bitmapDrawable;
                    this.c.set(rect);
                    if (!a(bundle.getFloatArray("com.google.android.pano.transition_bmp_clipped_rect"), this.h)) {
                        this.h.set(rect);
                    }
                    if (!a(bundle.getFloatArray("com.google.android.pano.transition_bmp_unclipped_rect"), this.g)) {
                        this.g.set(rect);
                    }
                    this.e = bundle.getFloat("com.google.android.pano.transition_bmp_alpha", 1.0f);
                    this.f = bundle.getFloat("com.google.android.pano.transition_bmp_saturation", 1.0f);
                    this.d = bundle.getInt("com.google.android.pano.transition_bmp_background", 0);
                    return true;
                }
            }
        }
        return false;
    }
}
