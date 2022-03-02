package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import com.google.android.gms.R;

/* renamed from: twb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twb extends udg {
    private final Context E;
    private final boolean F;
    private final RemoteViews G;

    public twb(Context context, boolean z) {
        super(context);
        this.E = context;
        this.F = z;
        RemoteViews a = a(context, R.layout.fast_pair_heads_up_notification);
        this.G = a;
        if (a != null) {
            this.u = context.getResources().getColor(R.color.discovery_activity_accent);
            this.G.setViewVisibility(16908303, 8);
        }
    }

    public final Notification b() {
        if (this.G != null) {
            if (aymw.g()) {
                try {
                    RemoteViews remoteViews = this.G;
                    Context context = this.E;
                    remoteViews.apply(context, new LinearLayout(context));
                } catch (Resources.NotFoundException e) {
                    anih anih = (anih) tsp.a.c();
                    anih.a((Throwable) e);
                    anih.a("Failed to build notification, not setting custom view.");
                }
            }
            this.y = this.G;
        }
        return super.b();
    }

    public final void c(CharSequence charSequence) {
        if (this.G != null && aymw.a.a().aL()) {
            this.G.setTextViewText(16908309, charSequence);
        }
        super.c(charSequence);
    }

    public final void e(CharSequence charSequence) {
        RemoteViews remoteViews = this.G;
        if (remoteViews != null) {
            remoteViews.setTextViewText(16908310, charSequence);
        }
        super.e(charSequence);
    }

    public static RemoteViews a(Context context, int i) {
        for (ApplicationInfo next : context.getPackageManager().getInstalledApplications(0)) {
            if (next != null && next.packageName != null && next.packageName.equals("com.google.android.gms.policy_nearby")) {
                jjg jjg = tsp.a;
                return new RemoteViews("com.google.android.gms.policy_nearby", i);
            }
        }
        try {
            int a = hdg.a(context, i);
            if (a == 0) {
                ((anih) tsp.a.c()).a("FastPair: No valid container resources for notification.");
                return null;
            }
            jjg jjg2 = tsp.a;
            return new RemoteViews(context.getPackageName(), a);
        } catch (Resources.NotFoundException e) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e);
            anih.a("FastPair: Could not find resources, falling back to default notification style.");
            return null;
        }
    }

    public final void b(CharSequence charSequence) {
        RemoteViews remoteViews = this.G;
        if (remoteViews != null) {
            remoteViews.setTextViewText(16908308, charSequence);
        }
        jd jdVar = new jd();
        jdVar.a(charSequence);
        a((jh) jdVar);
        super.b(charSequence);
    }

    public final void a(int i, int i2, boolean z) {
        RemoteViews remoteViews = this.G;
        if (remoteViews != null) {
            remoteViews.setViewVisibility(16908303, 0);
            this.G.setProgressBar(16908301, i, i2, z);
        }
        super.a(i, i2, z);
    }

    public final void a(Bitmap bitmap) {
        int i;
        if (this.G != null) {
            Context context = this.E;
            if (!this.F) {
                i = R.layout.fast_pair_heads_up_notification_small_image;
            } else {
                i = R.layout.fast_pair_heads_up_notification_large_image;
            }
            RemoteViews a = a(context, i);
            if (a != null) {
                a.setImageViewBitmap(16908294, bitmap);
                if (aymw.a.a().r()) {
                    this.G.removeAllViews(16908295);
                }
                this.G.addView(16908295, a);
            }
        }
        super.a(bitmap);
    }
}
