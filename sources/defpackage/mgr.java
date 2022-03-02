package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.people.ui.widget.AvatarReferenceImageView;

/* renamed from: mgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgr extends adl {
    AvatarReferenceImageView s;
    ImageView t;
    final TextView u;
    final TextView v;

    public mgr(View view, boolean z) {
        super(view);
        if (axgg.b()) {
            this.t = (ImageView) view.findViewById(R.id.fm_item_avatar);
        } else {
            this.s = (AvatarReferenceImageView) view.findViewById(R.id.fm_item_avatar_reference);
        }
        this.u = (TextView) view.findViewById(R.id.fm_item_primary_text);
        this.v = (TextView) view.findViewById(R.id.fm_item_secondary_text);
        if (z) {
            ((ImageView) view.findViewById(R.id.fm_item_icon)).setImageResource(R.drawable.quantum_ic_error_red_24);
        } else {
            view.findViewById(R.id.fm_item_icon).setVisibility(8);
        }
    }
}
