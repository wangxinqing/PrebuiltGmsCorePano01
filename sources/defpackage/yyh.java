package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: yyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyh extends yxw {
    private TextView d;

    public yyh(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return !this.a ? R.layout.plus_oob_field_info : R.layout.plus_oob_field_info_setup_wizard;
    }

    public final boolean b() {
        return true;
    }

    public final zea c() {
        zdq h = h();
        h.a(new zdw().a());
        return h.a();
    }

    /* access modifiers changed from: protected */
    public final FavaDiagnosticsEntity g() {
        if ("domainInfo".equals(this.b.f())) {
            return iaq.b;
        }
        if ("termsOfService".equals(this.b.f())) {
            return iaq.c;
        }
        return null;
    }

    public final void a(zea zea, yxv yxv) {
        super.a(zea, yxv);
        TextView textView = (TextView) findViewWithTag(a(R.string.plus_oob_field_view_tag_info));
        this.d = textView;
        textView.setText(i());
        this.d.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
