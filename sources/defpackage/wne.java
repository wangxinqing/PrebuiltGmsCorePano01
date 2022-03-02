package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.Request;
import com.android.volley.Response;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: wne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wne extends wnf {
    protected wne(wzv wzv, String str, int i, String str2, String str3, String str4, String str5, int i2) {
        super(wzv, str, i, str2, str3, str4, str5, i2);
    }

    protected static void a(xpr xpr, wsr wsr, Bundle bundle, ClientContext clientContext, Response.Listener listener, Response.ErrorListener errorListener) {
        xpr xpr2 = xpr;
        Bundle bundle2 = bundle;
        ClientContext clientContext2 = clientContext;
        String b = xpr.b(clientContext2);
        String c = xpr.c(clientContext2);
        String str = wsr.a;
        String str2 = str.length() == 0 ? new String("https://www.googleapis.com/plus/v2whitelisted/") : "https://www.googleapis.com/plus/v2whitelisted/".concat(str);
        Matcher matcher = jlh.a.matcher(str2);
        if (matcher.find()) {
            StringBuffer stringBuffer = new StringBuffer();
            do {
                String group = matcher.group(1);
                Object obj = bundle.get(group);
                if (obj != null) {
                    matcher.appendReplacement(stringBuffer, obj.toString());
                } else if (bundle.containsKey(group)) {
                    matcher.appendReplacement(stringBuffer, "null");
                } else {
                    matcher.appendReplacement(stringBuffer, "");
                }
            } while (matcher.find());
            matcher.appendTail(stringBuffer);
            str2 = stringBuffer.toString();
        }
        Locale locale = Locale.getDefault();
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("_");
            sb.append(locale.getCountry());
        }
        hashMap.put("Accept-Language", sb.toString());
        xpr.a((Request) new iyr(str2, listener, errorListener, b, c, hashMap, xpr2.g, xpr2.h), true, b);
    }
}
