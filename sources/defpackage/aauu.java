package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aauu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aauu {
    public AtomicBoolean a;
    public final aarq b;
    private final long c;
    private final CookieStore d = new CookieManager().getCookieStore();
    private final ExecutorService e;
    private long f;

    /* access modifiers changed from: package-private */
    public final synchronized String a() {
        List<HttpCookie> cookies;
        cookies = this.d.getCookies();
        return (cookies == null || cookies.isEmpty()) ? null : TextUtils.join(";", cookies);
    }

    public aauu(Context context, ExecutorService executorService) {
        ArrayList arrayList;
        this.e = executorService;
        aarq aarq = new aarq(context);
        this.b = aarq;
        this.f = aarq.a.getLong("snet_safe_browsing_last_cookie_save_time_ms", 0);
        this.a = new AtomicBoolean(true);
        this.c = 900000;
        String string = this.b.a.getString("snet_safe_browsing_cookies", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = new ArrayList();
            for (String str : amsk.a(";").a((CharSequence) string)) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new String(Base64.decode(str.getBytes(Charset.forName("UTF-8")), 0)));
                }
            }
        } else {
            arrayList = null;
        }
        a(arrayList);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                this.d.removeAll();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        try {
                            for (HttpCookie add : HttpCookie.parse(str)) {
                                this.d.add((URI) null, add);
                            }
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f + this.c <= currentTimeMillis) {
                    this.f = currentTimeMillis;
                    this.e.execute(new aaut(this, list));
                }
            }
        }
    }
}
