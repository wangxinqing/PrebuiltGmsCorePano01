package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: alqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqy {
    public final alqx a;
    public final String b;
    public final Map c;
    public final String d;

    public alqy(alqw alqw) {
        alqx alqx;
        this.a = alqw.a;
        this.b = alqw.b;
        this.c = alqw.c;
        String str = alqw.d;
        this.d = str;
        if (this.b == null || (alqx = this.a) == null || !(str == null || alqx == alqx.POST)) {
            throw new IllegalArgumentException();
        }
    }

    public static alqy a(alqf alqf, String str, Map map, alqx alqx, String str2) {
        String str3 = alqf.a;
        String valueOf = String.valueOf(str);
        String str4 = valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap(alqf.b);
        for (alqe a2 : alqf.e) {
            a2.a(hashMap2);
        }
        hashMap.putAll(hashMap2);
        hashMap.putAll(map);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (sb.length() == 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(alrd.a((String) entry.getKey()));
            sb.append("=");
            sb.append(alrd.a((String) entry.getValue()));
        }
        alqw alqw = new alqw();
        if (alqx != null) {
            alqw.a = alqx;
            String valueOf2 = String.valueOf(str4);
            String valueOf3 = String.valueOf(sb.toString());
            String str5 = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            if (str5 != null) {
                alqw.b = str5;
                alqw.d = str2;
                HashMap hashMap3 = new HashMap(alqf.c);
                for (alqe alqe : alqf.e) {
                }
                alqw.c.putAll(hashMap3);
                if (str2 != null) {
                    alqw.c.put("Content-Type", "text/plain;charset=UTF-8");
                }
                return new alqy(alqw);
            }
            throw null;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof alqy)) {
            alqy alqy = (alqy) obj;
            if (this.c.equals(alqy.c) && this.a == alqy.a) {
                String str = this.d;
                if (str != null) {
                    if (!str.equals(alqy.d)) {
                        return false;
                    }
                } else if (alqy.d != null) {
                    return false;
                }
                String str2 = this.b;
                if (str2 != null) {
                    if (!str2.equals(alqy.b)) {
                        return false;
                    }
                } else if (alqy.b != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + 31) * 31;
        alqx alqx = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (alqx != null ? alqx.hashCode() : 0)) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String str2 = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("HttpRequestParams [method=");
        sb.append(valueOf);
        sb.append(", url=");
        sb.append(str);
        sb.append(", headers=");
        sb.append(valueOf2);
        sb.append(", postdata=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
