package defpackage;

import android.view.View;
import com.google.android.gms.R;

/* renamed from: dcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dcb implements ax {
    private final dch a;

    public dcb(dch dch) {
        this.a = dch;
    }

    public final void a(Object obj) {
        dch dch = this.a;
        dih dih = (dih) obj;
        if (dio.a(dih)) {
            String string = dch.getResources().getString(R.string.as_account_spinner_a11y_description, new Object[]{dih.a});
            dch.f.setContentDescription(string);
            View view = dch.d;
            if (view != null) {
                view.setContentDescription(string);
            }
            dch.f.setImportantForAccessibility(0);
            return;
        }
        dch.f.setImportantForAccessibility(2);
    }
}
