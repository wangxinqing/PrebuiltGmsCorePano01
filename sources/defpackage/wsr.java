package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wsr {
    private static final Map c = new HashMap();
    private static final Map d = new HashMap();
    public final String a;
    public final int b;

    static {
        a("get", c, "people/${gaia_id}?includeProfilesWithState=disabled&includeViewCount=true&onBehalfOf=${on_behalf_of}", 2);
        a("list", d, "people/me/people/all?onBehalfOf=${on_behalf_of}&fields=items(id,names/displayName,names/metadata/primary,images/url,images/metadata/primary)", 4);
        a("list_by_email", d, "people/lookup?id=${email}&onBehalfOf=${on_behalf_of}&type=email&matchType=lenient", 4);
        a("list_by_phone", d, "people/lookup?id=${phone}&onBehalfOf=${on_behalf_of}&type=phone&matchType=lenient", 4);
        a("list_by_focus_id", d, "people/lookup?id=${contact}&onBehalfOf=${on_behalf_of}&type=contact&matchType=lenient", 4);
        a("list_by_email_and_phone", d, "people/me/people/all?onBehalfOf=${on_behalf_of}&fields=items(id,names/displayName,names/metadata/primary,images/url,images/metadata/primary,emails(value,metadata/primary),phoneNumbers(value,metadata/primary))", 4);
    }

    public wsr(String str, String str2, int i) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("gms.people.endpoint.");
        } else {
            "gms.people.endpoint.".concat(valueOf);
        }
        this.a = str2;
        this.b = i;
    }

    public static synchronized wsr a(String str) {
        wsr b2;
        synchronized (wsr.class) {
            if (TextUtils.isEmpty(str)) {
                str = "get";
            }
            b2 = b(str, c, "people/${gaia_id}?includeProfilesWithState=disabled&includeViewCount=true&onBehalfOf=${on_behalf_of}", 2);
        }
        return b2;
    }

    public static synchronized wsr b(String str) {
        wsr b2;
        synchronized (wsr.class) {
            if (TextUtils.isEmpty(str)) {
                str = "list";
            }
            b2 = b(str, d, "people/me/people/all?onBehalfOf=${on_behalf_of}&fields=items(id,names/displayName,names/metadata/primary,images/url,images/metadata/primary)", 4);
        }
        return b2;
    }

    private static synchronized wsr a(String str, Map map, String str2, int i) {
        wsr wsr;
        synchronized (wsr.class) {
            wsr = new wsr(str, str2, i);
            map.put(str, wsr);
        }
        return wsr;
    }

    private static synchronized wsr b(String str, Map map, String str2, int i) {
        synchronized (wsr.class) {
            wsr wsr = (wsr) map.get(str);
            if (wsr != null) {
                return wsr;
            }
            wsr a2 = a(str, map, str2, i);
            return a2;
        }
    }
}
