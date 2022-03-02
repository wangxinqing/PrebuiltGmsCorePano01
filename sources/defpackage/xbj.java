package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: xbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xbj extends ilj implements xfj {
    private final Bundle c;
    private final xcb d;
    private final xca e;
    private final boolean f;

    public xbj(DataHolder dataHolder, int i, Bundle bundle, xcb xcb, xca xca) {
        super(dataHolder, i);
        this.c = bundle;
        this.d = xcb;
        this.e = xca;
        this.f = bundle.getBoolean("emails_with_affinities", false);
    }

    public final String a() {
        return d("qualified_id");
    }

    public final String b() {
        return d("gaia_id");
    }

    public final String c() {
        return d("name");
    }

    public final String d() {
        return ycb.a.a(d("avatar"));
    }

    public final String[] e() {
        String d2 = d("v_circle_ids");
        return TextUtils.isEmpty(d2) ? ycm.b : ycm.c.split(d2, -1);
    }

    public final Iterable f() {
        return this.e.a(d("v_emails"), this.f);
    }

    public final Iterable g() {
        return this.d.a(d("v_phones"), false);
    }
}
