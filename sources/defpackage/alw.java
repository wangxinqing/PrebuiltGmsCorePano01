package defpackage;

import android.view.View;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;

/* renamed from: alw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alw implements View.OnClickListener {
    final /* synthetic */ MediaRouteExpandCollapseButton a;

    public alw(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    public void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        boolean z = !mediaRouteExpandCollapseButton.e;
        mediaRouteExpandCollapseButton.e = z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.a);
            this.a.a.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = this.a;
            mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.d);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.b);
            this.a.b.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = this.a;
            mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.c);
        }
        View.OnClickListener onClickListener = this.a.f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
