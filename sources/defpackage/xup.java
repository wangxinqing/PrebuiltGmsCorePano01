package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: xup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xup extends adl {
    final RelativeLayout s;
    final ImageView t = ((ImageView) this.a.findViewById(R.id.icon));
    final TextView u = ((TextView) this.a.findViewById(R.id.title));
    final TextView v = ((TextView) this.a.findViewById(R.id.body));
    final TextView w = ((TextView) this.a.findViewById(R.id.button_text));
    final ImageView x;

    public xup(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false));
        ImageView imageView = (ImageView) this.a.findViewById(R.id.arrow_icon);
        this.x = imageView;
        imageView.setImageResource(R.drawable.quantum_ic_keyboard_arrow_right_vd_theme_24);
        RelativeLayout relativeLayout = (RelativeLayout) this.a.findViewById(R.id.top_container);
        this.s = (RelativeLayout) this.a.findViewById(R.id.bottom_container);
    }
}
