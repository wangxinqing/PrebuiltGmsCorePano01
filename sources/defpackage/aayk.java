package defpackage;

import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: aayk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayk {
    static aayj a() {
        aayj aayj = new aayj();
        String property = System.getProperty("http.proxyHost");
        if (!TextUtils.isEmpty(property)) {
            aayj.a = true;
            try {
                InetAddress[] allByName = Inet4Address.getAllByName(property);
                int length = allByName.length;
                int i = 0;
                while (i < length) {
                    if (!allByName[i].isSiteLocalAddress()) {
                        i++;
                    } else {
                        aayj.b = true;
                        return aayj;
                    }
                }
            } catch (UnknownHostException e) {
            }
            aayj.c = property;
        }
        return aayj;
    }
}
