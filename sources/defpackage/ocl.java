package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: ocl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocl {
    public final View a;
    private final avnm b;

    public ocl(avnm avnm, ViewGroup viewGroup, int i, View.OnClickListener onClickListener) {
        ock ock;
        int i2;
        this.b = avnm;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        this.a = inflate;
        if (onClickListener != null) {
            inflate.setOnClickListener(onClickListener);
            this.a.setEnabled(!avnm.e);
        }
        Context context = viewGroup.getContext();
        avmt a2 = avmt.a(this.b.b);
        int ordinal = (a2 == null ? avmt.UNKNOWN_CONTACT_MODE : a2).ordinal();
        if (ordinal != 1) {
            ock = ordinal != 3 ? new ock(R.drawable.quantum_ic_phone_white_24, R.string.common_phone) : new ock(R.drawable.quantum_ic_email_white_24, R.string.common_email);
        } else {
            ock = new ock(R.drawable.quantum_ic_chat_white_24, R.string.gh_menu_chat);
        }
        ImageView imageView = (ImageView) this.a.findViewById(R.id.gh_contact_option_icon);
        Drawable a3 = kf.a(context, ock.a);
        boolean z = this.b.e;
        boolean z2 = !z;
        Drawable a4 = ofx.a(a3, this.a.getResources());
        if (!ofy.b()) {
            if (!z) {
                i2 = R.color.google_blue600;
            } else {
                i2 = R.color.google_grey600;
            }
            ofx.a(a4, context, i2);
        } else {
            ofx.a(a4, !z2 ? ofy.a(context, R.attr.gh_disabledIconColor) : ofy.a(context, R.attr.gh_primaryBlueColor));
        }
        imageView.setImageDrawable(a4);
        a((TextView) this.a.findViewById(R.id.gh_contact_option_title), this.a.getResources().getString(ock.b));
        a();
        viewGroup.addView(this.a);
    }

    public static void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final TextView b() {
        return (TextView) this.a.findViewById(R.id.gh_contact_wait_time_value);
    }

    public final void a() {
        String str;
        TextView b2 = b();
        if (b2 != null) {
            a(b2, this.b.c);
        }
        TextView textView = (TextView) this.a.findViewById(R.id.gh_operation_hours);
        if (textView != null) {
            if (this.b.d.size() != 0) {
                str = TextUtils.join("\n", this.b.d);
            } else {
                str = null;
            }
            a(textView, str);
        }
    }
}
