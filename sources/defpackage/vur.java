package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: vur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vur extends vud {
    final /* synthetic */ vus s;
    private final TextView t;
    private final ImageView u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vur(vus vus, View view) {
        super(view);
        this.s = vus;
        this.t = (TextView) view.findViewById(R.id.title);
        this.u = (ImageView) view.findViewById(R.id.icon);
    }

    private static final Drawable a(Context context, int i) {
        return new vwt(new vt(context, i));
    }

    private final boolean c(int i) {
        int i2 = this.s.g;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1) {
            i3 = i2 != 2 ? -1 : 0;
        }
        return i3 == i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Context context, Object obj) {
        int intValue = ((Integer) obj).intValue();
        if (intValue == 0) {
            this.t.setText(R.string.sharing_visibility_option_hidden);
            if (c(0)) {
                this.u.setImageDrawable(a(context, 2132017970));
                this.t.setTextColor(context.getColor(R.color.sharing_color_accent));
                return;
            }
            this.u.setImageDrawable(a(context, 2132017961));
            this.t.setTextColor(context.getResources().getColor(R.color.sharing_text_color_visibility_unselected));
        } else if (intValue == 1) {
            this.t.setText(R.string.sharing_visibility_option_all_contacts);
            if (c(1)) {
                this.u.setImageDrawable(a(context, 2132017969));
                this.t.setTextColor(context.getColor(R.color.sharing_color_accent));
                return;
            }
            this.u.setImageDrawable(a(context, 2132017960));
            this.t.setTextColor(context.getResources().getColor(R.color.sharing_text_color_visibility_unselected));
        } else if (intValue == 2) {
            this.t.setText(R.string.sharing_visibility_option_some_contacts);
            if (c(2)) {
                this.u.setImageDrawable(a(context, 2132017971));
                this.t.setTextColor(context.getColor(R.color.sharing_color_accent));
                return;
            }
            this.u.setImageDrawable(a(context, 2132017962));
            this.t.setTextColor(context.getResources().getColor(R.color.sharing_text_color_visibility_unselected));
        }
    }
}
