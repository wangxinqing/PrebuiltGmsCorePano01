package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.pano.widget.FrameLayoutWithShadows;

/* renamed from: akdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akdv {
    public final akef a;
    public Activity b;
    public akfh c;
    public String d;
    public String e;
    public String f;
    public int g;
    public Uri h;
    public Bitmap i;
    public int j;
    public int k;
    private AccessibilityManager l;

    public akdv(akef akef) {
        this.a = akef;
    }

    public static Bundle a(String str, String str2, String str3, Uri uri, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("breadcrumb", str2);
        bundle.putString("description", str3);
        bundle.putInt("iconResourceId", 0);
        bundle.putParcelable("iconUri", uri);
        bundle.putParcelable("iconBitmap", (Parcelable) null);
        bundle.putInt("iconPadding", 0);
        bundle.putInt("iconBackground", i2);
        return bundle;
    }

    public static final void a(ImageView imageView) {
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (intrinsicWidth > 0) {
            layoutParams.height = (layoutParams.width * imageView.getDrawable().getIntrinsicHeight()) / intrinsicWidth;
        } else {
            layoutParams.height = layoutParams.width;
        }
    }

    public static final void a(ImageView imageView, View view) {
        FrameLayoutWithShadows frameLayoutWithShadows = (FrameLayoutWithShadows) view.findViewById(R.id.shadow_layout);
        if (frameLayoutWithShadows.a != 0) {
            Drawable drawable = frameLayoutWithShadows.getContext().getResources().getDrawable(frameLayoutWithShadows.a);
            akft akft = (akft) imageView.getTag(R.id.ShadowView);
            if (akft == null) {
                int size = frameLayoutWithShadows.d.size();
                if (size > 0) {
                    akft akft2 = (akft) frameLayoutWithShadows.d.remove(size - 1);
                    akft2.a = null;
                    akft2.b = null;
                }
                akft = new akft(frameLayoutWithShadows.getContext());
                akft.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                imageView.setTag(R.id.ShadowView, akft);
                akft.a = imageView;
                frameLayoutWithShadows.addView(akft, 0);
            }
            drawable.mutate();
            akft.setAlpha(frameLayoutWithShadows.c);
            akft.setBackground(drawable);
            if (frameLayoutWithShadows.b != 0) {
                akft.b = frameLayoutWithShadows.getResources().getDrawable(frameLayoutWithShadows.b).mutate();
                float f2 = akft.c;
                if (f2 >= 0.0f) {
                    akft.b.setAlpha((int) (f2 * 255.0f));
                }
                akft.invalidate();
            }
        }
    }

    public final void a(View view, int i2, String str) {
        TextView textView = (TextView) view.findViewById(i2);
        if (textView != null && str != null) {
            textView.setText(str);
            Activity activity = this.b;
            if (activity != null) {
                if (this.l == null) {
                    this.l = (AccessibilityManager) activity.getSystemService("accessibility");
                }
                if (this.l.isEnabled()) {
                    textView.setFocusable(true);
                    textView.setFocusableInTouchMode(true);
                }
            }
        }
    }
}
