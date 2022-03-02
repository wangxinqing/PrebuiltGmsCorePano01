package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: dzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzq extends adl {
    public final TextView s;
    public final EditText t;
    public final View u;
    public final TextView v;
    public final ImageView w;
    public final View x;
    public final View y;

    public dzq(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.message_header);
        this.t = (EditText) view.findViewById(R.id.message);
        this.u = view.findViewById(R.id.message_separator);
        this.v = (TextView) view.findViewById(R.id.message_limit);
        this.w = (ImageView) view.findViewById(R.id.image_thumbnail);
        this.x = view.findViewById(R.id.thumbnail_frame);
        view.findViewById(R.id.separator);
        this.y = view.findViewById(R.id.preview_message);
    }
}
