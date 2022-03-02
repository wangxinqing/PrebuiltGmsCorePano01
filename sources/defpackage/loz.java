package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: loz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class loz extends adl {
    protected final TextView s;
    protected final TextView t;
    protected final ImageView u;
    final ImageView v;
    final ImageView w;
    final ImageView x;

    public loz(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.drive_file_list_item_title);
        this.t = (TextView) view.findViewById(R.id.drive_file_list_item_subtitle);
        this.u = (ImageView) view.findViewById(R.id.drive_file_list_item_icon);
        this.v = (ImageView) view.findViewById(R.id.drive_file_list_item_state_on_device);
        this.w = (ImageView) view.findViewById(R.id.drive_file_list_item_state_shared);
        this.x = (ImageView) view.findViewById(R.id.drive_file_list_item_state_starred);
    }
}
