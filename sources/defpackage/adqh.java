package defpackage;

import android.text.Html;
import android.text.TextUtils;
import com.google.android.gms.R;

/* renamed from: adqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqh extends adqj {
    public final String a() {
        String g = adjk.g();
        return TextUtils.isEmpty(g) ? getString(R.string.system_update_default_title) : g;
    }

    public final String b() {
        String i = adjk.i();
        if (!TextUtils.isEmpty(i)) {
            return Html.fromHtml(i).toString();
        }
        return getString(R.string.system_update_default_downloading_description);
    }
}
