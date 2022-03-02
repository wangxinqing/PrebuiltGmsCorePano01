package defpackage;

import android.net.Uri;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;

/* renamed from: akdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akdx implements ViewTreeObserver.OnGlobalLayoutListener {
    final Runnable a = new akdw(this);
    final /* synthetic */ RelativeLayout b;
    final /* synthetic */ TextView c;
    final /* synthetic */ TextView d;
    final /* synthetic */ TextView e;
    final /* synthetic */ Activity f;
    final /* synthetic */ ImageView g;
    final /* synthetic */ akey h;
    final /* synthetic */ Uri i;
    final /* synthetic */ akdz j;

    public akdx(akdz akdz, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, Activity activity, ImageView imageView, akey akey, Uri uri) {
        this.j = akdz;
        this.b = relativeLayout;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = activity;
        this.g = imageView;
        this.h = akey;
        this.i = uri;
    }

    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.postOnAnimationDelayed(this.a, 550);
    }
}
