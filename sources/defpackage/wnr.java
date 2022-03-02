package defpackage;

import android.os.Bundle;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/* renamed from: wnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wnr extends wnu {
    final /* synthetic */ wnw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnr(wnw wnw) {
        super(wnw);
        this.a = wnw;
    }

    /* access modifiers changed from: protected */
    public final wsr a() {
        if (this.a.e.c == null) {
            return wsr.b("list_by_phone");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, Bundle bundle) {
        if (!wxh.e(str)) {
            return false;
        }
        bundle.putString("on_behalf_of", this.a.c);
        bundle.putString("qualified_id", str);
        String h = wxh.h(str);
        try {
            bundle.putString("phone", URLEncoder.encode(h, Charset.defaultCharset().name()));
            return true;
        } catch (UnsupportedEncodingException e) {
            bundle.putString("phone", h);
            return true;
        }
    }
}
