package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: mmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mmj extends adl {
    public static final /* synthetic */ int w = 0;
    public final View s;
    public final LinearLayout t;
    public boolean u;
    final /* synthetic */ mmk v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mmj(mmk mmk, View view) {
        super(view);
        this.v = mmk;
        this.s = view.findViewById(R.id.fm_cp_primary_contact_row);
        this.t = (LinearLayout) view.findViewById(R.id.fm_cp_expandable_contact_rows_container);
    }

    public static final ImageView a(View view) {
        return (ImageView) view.findViewById(R.id.fm_cp_avatar);
    }

    public static final ImageView b(View view) {
        return (ImageView) view.findViewById(R.id.fm_cp_default_avatar);
    }

    public static final TextView c(View view) {
        return (TextView) view.findViewById(R.id.fm_cp_contact_row_line_1);
    }

    public static final TextView d(View view) {
        return (TextView) view.findViewById(R.id.fm_cp_contact_row_line_2);
    }

    public static final RelativeLayout e(View view) {
        return (RelativeLayout) view.findViewById(R.id.fm_cp_selected_avatar);
    }

    public final ImageView v() {
        return (ImageView) this.s.findViewById(R.id.fm_cp_method_expand_button);
    }
}
