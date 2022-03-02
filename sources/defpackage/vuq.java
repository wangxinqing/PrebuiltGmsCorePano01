package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Map;

/* renamed from: vuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vuq extends vue {
    public final LruCache g = new LruCache(10);
    private final Map h = new nz();
    private final Map i = new nz();

    private vuq(Context context, vul vul) {
        super(context, vul);
    }

    public static vuq a(Context context, vul vul) {
        vuq vuq = new vuq(context, vul);
        vuq.a(true);
        return vuq;
    }

    private final long c(ShareTarget shareTarget) {
        return this.i.containsKey(shareTarget) ? ((Long) this.i.get(shareTarget)).longValue() : shareTarget.a;
    }

    public final long J(int i2) {
        return c((ShareTarget) f(i2));
    }

    public final TransferMetadata b(ShareTarget shareTarget) {
        if (this.h.containsKey(shareTarget)) {
            return (TransferMetadata) this.h.get(shareTarget);
        }
        return new vtv(0).a();
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i2) {
        return a(LayoutInflater.from(this.a).inflate(R.layout.sharing_list_item_share_target, viewGroup, false));
    }

    public final void c() {
        this.e.clear();
        as();
        this.h.clear();
    }

    public final vup a(View view) {
        return new vup(this, view);
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.h.put(shareTarget, transferMetadata);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(vud vud) {
        vup vup = (vup) vud;
        vup.s.setAlpha(0.0f);
        vup.s.animate().alpha(1.0f).setInterpolator(new AccelerateInterpolator());
        wil.a((View) vup.t, 0.3f);
        vup.t.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator());
    }

    public final void a(vup vup, int i2) {
        ShareTarget shareTarget = (ShareTarget) f(i2);
        if (!shareTarget.equals(vup.a.getTag(R.layout.sharing_list_item_share_target)) || !b(shareTarget).equals(vup.a.getTag(R.id.progress_bar))) {
            super.a((vud) vup, i2);
            vup.a.setTag(R.layout.sharing_list_item_share_target, shareTarget.clone());
            vup.a.setTag(R.id.progress_bar, b(shareTarget).clone());
        }
    }

    public final boolean a(ShareTarget shareTarget) {
        int i2 = 0;
        while (i2 < a()) {
            if (J(i2) != c(shareTarget)) {
                i2++;
            } else {
                a(i2, (Object) shareTarget);
                return true;
            }
        }
        return false;
    }

    public final boolean a(ShareTarget shareTarget, ShareTarget shareTarget2) {
        int b = b((Object) shareTarget);
        if (b < 0) {
            return false;
        }
        a(b, (Object) shareTarget2);
        Drawable drawable = (Drawable) this.g.remove(shareTarget);
        if (drawable != null) {
            this.g.put(shareTarget2, drawable);
        }
        TransferMetadata transferMetadata = (TransferMetadata) this.h.remove(shareTarget);
        if (transferMetadata != null) {
            this.h.put(shareTarget2, transferMetadata);
        }
        long c = c(shareTarget);
        this.i.remove(shareTarget);
        this.i.put(shareTarget2, Long.valueOf(c));
        return true;
    }
}
