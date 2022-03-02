package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.CookieManager;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

/* renamed from: eiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eiw {
    private final Context a;
    private final CookieManager b;

    public eiw(Context context) {
        CookieManager instance = CookieManager.getInstance();
        this.a = context;
        this.b = instance;
    }

    public static eiw a(Context context) {
        return new eiw(context);
    }

    static String a(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                StringBuilder sb = new StringBuilder(String.valueOf(protocol).length() + 3 + String.valueOf(host).length());
                sb.append(protocol);
                sb.append("://");
                sb.append(host);
                builder.appendQueryParameter("url", sb.toString());
                i++;
            } catch (MalformedURLException e) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid URL: ") : "Invalid URL: ".concat(valueOf));
            }
        }
        String valueOf2 = String.valueOf(builder.build().getQuery());
        return valueOf2.length() == 0 ? new String("weblogin:") : "weblogin:".concat(valueOf2);
    }

    private final Set a(List list) {
        String str;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Long l;
        Set b2 = jir.b(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gjp gjp = (gjp) list.get(i);
            if (!TextUtils.isEmpty(gjp.e)) {
                str = gjp.e;
            } else {
                str = gjp.d;
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(gjp.b) || TextUtils.isEmpty(gjp.c)) {
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                if ((gjp.a & 32) != 0) {
                    bool = Boolean.valueOf(gjp.g);
                } else {
                    bool = null;
                }
                String a2 = ehz.a(str, bool);
                String str2 = gjp.b;
                String str3 = gjp.c;
                String str4 = gjp.d;
                String str5 = gjp.f;
                if ((gjp.a & 64) != 0) {
                    bool2 = Boolean.valueOf(gjp.h);
                } else {
                    bool2 = null;
                }
                if ((gjp.a & 32) != 0) {
                    bool3 = Boolean.valueOf(gjp.g);
                } else {
                    bool3 = null;
                }
                if ((gjp.a & 128) != 0) {
                    l = Long.valueOf((long) gjp.i);
                } else {
                    l = null;
                }
                String a3 = ehz.a(str2, str3, str4, str5, bool2, bool3, l);
                String valueOf = String.valueOf(a2);
                if (valueOf.length() == 0) {
                    new String("Setting cookie for url: ");
                } else {
                    "Setting cookie for url: ".concat(valueOf);
                }
                this.b.setCookie(a2, a3);
                b2.add(a2);
            }
        }
        return b2;
    }

    public final Set a(Account account, String... strArr) {
        boolean z;
        iva.a((Object) account);
        int i = 1;
        if (strArr == null || strArr.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z, "Must have at least one URL.");
        try {
            gjq gjq = (gjq) aucj.a((aucj) gjq.c, Base64.decode(eim.d(this.a, account, a(strArr)), 9), aubs.c());
            if (gjq == null || (gjq.a & 1) == 0) {
                throw new eif("Invalid response.");
            }
            gjw gjw = gjq.b;
            if (gjw == null) {
                gjw = gjw.d;
            }
            int a2 = gjv.a(gjw.a);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 1) {
                return a((List) gjw.b);
            }
            if (i2 == 2) {
                throw new IOException("Request failed, but server said RETRY.");
            } else if (i2 != 5) {
                String valueOf = String.valueOf(gjw);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("WebLoginHelper", sb.toString());
                int a3 = gjv.a(gjw.a);
                if (a3 != 0) {
                    i = a3;
                }
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("Unknown response status: ");
                sb2.append(i - 1);
                throw new eif(sb2.toString());
            } else {
                a((List) gjw.b);
                aucx aucx = gjw.c;
                int size = aucx.size();
                for (int i3 = 0; i3 < size; i3++) {
                    gjt gjt = (gjt) aucx.get(i3);
                    int a4 = gjs.a(gjt.a);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i4 = a4 - 1;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            throw new eiv(gjt.b);
                        } else if (i4 != 3) {
                            int a5 = gjs.a(gjt.a);
                            if (a5 == 0) {
                                a5 = 1;
                            }
                            StringBuilder sb3 = new StringBuilder(47);
                            sb3.append("Unrecognized failed account status: ");
                            sb3.append(a5 - 1);
                            Log.w("WebLoginHelper", sb3.toString());
                        }
                    }
                }
                throw new eif("Authorization failed, but no recoverable accounts.");
            }
        } catch (auda e) {
            throw new eif("Couldn't read data from server.", e);
        }
    }
}
