package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* renamed from: ablc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablc extends ViewOutlineProvider {
    final /* synthetic */ HeaderView a;

    public ablc(HeaderView headerView) {
        this.a = headerView;
    }

    public final void getOutline(View view, Outline outline) {
        int a2 = this.a.a((int) R.dimen.profile_header_avatar_diameter);
        outline.setOval(0, 0, a2, a2);
    }
}
