package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: yyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyg extends yxw {
    private TextView d;

    public yyg(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return R.layout.plus_oob_field_hidden_button;
    }

    public final boolean b() {
        return true;
    }

    public final zea c() {
        return null;
    }

    public final String j() {
        TextView textView = this.d;
        if (textView != null) {
            return textView.getText().toString();
        }
        return null;
    }

    public final void a(zea zea, yxv yxv) {
        super.a(zea, yxv);
        this.d = (TextView) findViewWithTag(a(R.string.plus_oob_field_view_tag_hidden_button));
        if (zea.i() && zea.h().d()) {
            this.d.setText(zea.h().c());
        }
    }
}
