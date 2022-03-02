package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: aldn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aldn extends adl {
    public final TextView s;
    public final TextView t;
    public final ImageView u;
    public rhq v;
    final /* synthetic */ aldp w;
    private final View x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aldn(aldp aldp, View view) {
        super(view);
        this.w = aldp;
        this.x = view;
        view.setOnClickListener(new aldm(this));
        this.s = (TextView) view.findViewById(R.id.place_name);
        this.t = (TextView) view.findViewById(R.id.place_address);
        this.u = (ImageView) view.findViewById(R.id.place_icon);
    }
}
