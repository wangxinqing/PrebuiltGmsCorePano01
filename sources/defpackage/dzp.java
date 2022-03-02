package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.people.ui.widget.AvatarReferenceImageView;

/* renamed from: dzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class dzp extends adl {
    public final TextView A;
    public final View B;
    public final ImageView C;
    public final View D;
    public final TextView E;
    public final View t;
    public final View u;
    public final AvatarReferenceImageView v;
    public final View w;
    public final ImageView x;
    public final ImageView y;
    public final TextView z;

    public dzp(View view) {
        super(view);
        this.t = view.findViewById(R.id.container);
        this.u = view.findViewById(R.id.avatar_frame);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.avatar_container);
        if (viewGroup != null) {
            if (viewGroup.getChildCount() == 0) {
                AvatarReferenceImageView avatarReferenceImageView = new AvatarReferenceImageView(viewGroup.getContext());
                this.v = avatarReferenceImageView;
                viewGroup.addView(avatarReferenceImageView, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.v = (AvatarReferenceImageView) viewGroup.getChildAt(0);
            }
            this.v.d();
        } else {
            this.v = null;
        }
        this.w = view.findViewById(R.id.selector_container);
        this.x = (ImageView) view.findViewById(R.id.selector);
        this.y = (ImageView) view.findViewById(R.id.contact_method);
        this.z = (TextView) view.findViewById(R.id.name);
        this.A = (TextView) view.findViewById(R.id.selected_name);
        this.E = (TextView) view.findViewById(R.id.contact_detail);
        this.B = view.findViewById(R.id.channel_switcher);
        this.C = (ImageView) view.findViewById(R.id.channel_switcher_icon);
        this.D = view.findViewById(R.id.disabled_overlay);
    }
}
