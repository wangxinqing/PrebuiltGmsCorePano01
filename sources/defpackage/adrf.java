package defpackage;

import java.util.Map;

/* renamed from: adrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrf extends adri {
    public adrf(String str) {
        super(str, adre.a(new adrc[0]));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return adre.a(str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        StringBuilder sb = new StringBuilder();
        anhj a = ((adre) obj).a.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(jhy.b(((String) entry.getKey()).getBytes()));
            sb.append(':');
            sb.append(jhy.b(((String) entry.getValue()).getBytes()));
        }
        return sb.toString();
    }
}
