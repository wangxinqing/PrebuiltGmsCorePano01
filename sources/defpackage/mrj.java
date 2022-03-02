package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;

/* renamed from: mrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mrj extends adl {
    public final ImageView s;
    private final TextView t;
    private final TextView u;

    public mrj(View view) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.title);
        this.u = (TextView) view.findViewById(R.id.description);
        this.s = (ImageView) view.findViewById(16908294);
    }

    public final String a(int i, Object... objArr) {
        return v().getString(i, objArr);
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        this.u.setText(str);
    }

    public final Context v() {
        return this.a.getContext();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.t.setText(str);
    }

    public final boolean a(DiscoveryListItem discoveryListItem) {
        return discoveryListItem.l == avbx.f;
    }
}
