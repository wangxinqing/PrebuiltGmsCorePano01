package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;

/* renamed from: ffm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ffm implements ax {
    private final ffp a;

    public ffm(ffp ffp) {
        this.a = ffp;
    }

    public final void a(Object obj) {
        ffp ffp = this.a;
        if (((MatchPasswordResult) obj).a.size() == 1) {
            ffp.e.setVisibility(8);
            ffp.d.setBackground((Drawable) null);
            ffp.d.setOnClickListener((View.OnClickListener) null);
        }
    }
}
