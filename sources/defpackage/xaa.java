package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: xaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xaa extends ilj implements ilq {
    public xaa(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String c() {
        return d("account_name");
    }

    public final String d() {
        return e() ? d("display_name") : c();
    }

    public final boolean e() {
        return !TextUtils.isEmpty(d("display_name"));
    }

    public final String h() {
        return d("gaia_id");
    }

    public final String i() {
        return ycb.a.a(d("avatar"));
    }

    public final String j() {
        return d("page_gaia_id");
    }

    public final boolean k() {
        return !this.a.b();
    }

    public final /* bridge */ /* synthetic */ Object r() {
        throw new UnsupportedOperationException("Method not supported for object Owner");
    }

    public final String f() {
        return !TextUtils.isEmpty(d("given_name")) ? d("given_name") : "null";
    }

    public final String g() {
        return !TextUtils.isEmpty(d("family_name")) ? d("family_name") : "null";
    }
}
