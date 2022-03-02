package defpackage;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.gms.R;

/* renamed from: mnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mnc extends adl implements View.OnClickListener {
    final NetworkImageView s;
    final TextView t;
    final View u;
    final Space v;
    final /* synthetic */ mng w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mnc(mng mng, View view) {
        super(view);
        this.w = mng;
        this.u = view.findViewById(R.id.fm_item_container);
        this.s = (NetworkImageView) view.findViewById(R.id.fm_item_avatar);
        this.t = (TextView) view.findViewById(R.id.fm_item_primary_text);
        this.v = (Space) view.findViewById(R.id.fm_top_item_space);
    }

    public void onClick(View view) {
        int d = d();
        if (this.w.a(d) == 0) {
            this.w.f(d);
        }
    }
}
