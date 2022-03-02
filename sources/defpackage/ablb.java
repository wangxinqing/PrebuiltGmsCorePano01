package defpackage;

import android.view.View;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* renamed from: ablb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ablb implements View.OnLongClickListener {
    private final HeaderView a;
    private final String b;

    public ablb(HeaderView headerView, String str) {
        this.a = headerView;
        this.b = str;
    }

    public final boolean onLongClick(View view) {
        HeaderView headerView = this.a;
        jpr.a(headerView.getContext(), this.b).show();
        return true;
    }
}
