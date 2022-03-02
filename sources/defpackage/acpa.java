package defpackage;

import java.util.Map;

/* renamed from: acpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpa {
    public final String a;
    public final Map b;

    public acpa(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("network={");
        for (String str : this.b.keySet()) {
            String str2 = (String) this.b.get(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
            sb2.append("\t");
            sb2.append(str);
            sb2.append("=");
            sb2.append(str2);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
