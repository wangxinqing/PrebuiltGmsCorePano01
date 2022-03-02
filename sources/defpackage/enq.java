package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: enq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class enq {
    public static final iwd a = ehv.a("TokenCache");
    public static final fzi b = new enp();
    public final qub c;
    public final eny d;
    private final ekq e;

    public enq() {
        jiu jiu = jiu.a;
        ekq ekq = (ekq) ekq.b.b();
        qub a2 = qub.a((Context) ihs.b());
        eny eny = (eny) eny.a.b();
        iva.a((Object) jiu);
        iva.a((Object) ekq);
        this.e = ekq;
        iva.a((Object) a2);
        this.c = a2;
        iva.a((Object) eny);
        this.d = eny;
    }

    public static void a(TokenRequest tokenRequest) {
        iva.a((Object) tokenRequest);
        iva.a((Object) tokenRequest.a());
        iva.c(tokenRequest.b);
        iva.c(tokenRequest.j.e);
    }

    public final eis a(Account account, String str) {
        qub qub = this.c;
        amkr a2 = amlv.a("AccountManager.peekAuthToken");
        try {
            String peekAuthToken = qub.a.peekAuthToken(account, str);
            if (a2 != null) {
                a2.close();
            }
            if (peekAuthToken == null) {
                return null;
            }
            eis eis = new eis();
            eis.a = peekAuthToken;
            enx enx = eqb.a;
            enx a3 = eqh.a(str);
            Long l = (Long) this.d.a(account, a3);
            if (l == null) {
                eis.b = null;
                return eis;
            } else if (l.longValue() < System.currentTimeMillis() / 1000) {
                this.d.b(account, a3, (Object) null);
                this.c.b(account.type, peekAuthToken);
                return null;
            } else {
                eis.b = l;
                return eis;
            }
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final String a(TokenRequest tokenRequest, boolean z, List list) {
        String str;
        String str2 = tokenRequest.j.e;
        if (!z) {
            str = tokenRequest.b;
            if (awmt.a.a().a() && list != null && !list.isEmpty() && str.startsWith("oauth2:server:client_id:") && str.contains(":api_scope:")) {
                int indexOf = str.indexOf(":api_scope:") + 11;
                List asList = Arrays.asList(str.substring(indexOf).split(" "));
                str = str.substring(0, indexOf) + TextUtils.join(" ", amym.a((Iterable) list).a((amrm) new eno(asList)).a((Comparator) anfh.a));
            }
        } else {
            str = "^^snowballing^^";
        }
        try {
            String str3 = this.e.a(str2).b;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(':');
            sb.append(str3);
            sb.append(':');
            sb.append(str);
            TreeMap treeMap = new TreeMap();
            int i = tokenRequest.o;
            if (!(i == 0 || tokenRequest.p == null)) {
                treeMap.put("delegation_type", String.valueOf(i));
                treeMap.put("delegatee_user_id", tokenRequest.p);
            }
            Bundle b2 = tokenRequest.b();
            if (b2.containsKey("oauth2_include_email")) {
                treeMap.put("include_email", b2.getString("oauth2_include_email"));
            }
            if (b2.containsKey("oauth2_include_profile")) {
                treeMap.put("include_profile", b2.getString("oauth2_include_profile"));
            }
            aqll a2 = eie.a(b2).a();
            String str4 = null;
            if (a2 != null) {
                aqlj aqlj = a2.h;
                if (aqlj == null) {
                    aqlj = aqlj.c;
                }
                if ((aqlj.a & 1) != 0) {
                    aqlj aqlj2 = a2.h;
                    if (aqlj2 == null) {
                        aqlj2 = aqlj.c;
                    }
                    str4 = aqlj2.b;
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                treeMap.put("token_request_options", str4);
            }
            if (treeMap.size() > 0) {
                ArrayList arrayList = new ArrayList(treeMap.size());
                for (Map.Entry entry : treeMap.entrySet()) {
                    arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
                }
                sb.append('?');
                sb.append(URLEncodedUtils.format(arrayList, "UTF-8"));
            }
            return sb.toString();
        } catch (ekp e2) {
            throw new enl("Unable to get package signature.", e2);
        }
    }

    public final boolean a(String str) {
        return !str.startsWith("weblogin:");
    }
}
