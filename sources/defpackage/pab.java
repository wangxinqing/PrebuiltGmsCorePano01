package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pab implements agvv {
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        int i;
        if (bArr.length == 0) {
            return Collections.emptyList();
        }
        List<String> c = amsk.a(',').c(new String(bArr, amqn.c));
        ArrayList arrayList = new ArrayList(c.size());
        for (String str : c) {
            List c2 = amsk.a('/').c(str);
            if (c2.size() == 3) {
                if (!((String) c2.get(2)).isEmpty()) {
                    i = Integer.parseInt((String) c2.get(2));
                    if (i < 0 || i > 100) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
                        sb.append("Invalid percentage \"");
                        sb.append(i);
                        sb.append("\" not in [0,100] in filter string: \"");
                        sb.append(str);
                        sb.append("\"");
                        oso.b(sb.toString());
                        return Collections.emptyList();
                    }
                } else {
                    i = 0;
                }
                aucd o = otq.e.o();
                String str2 = (String) c2.get(0);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                otq otq = (otq) o.b;
                str2.getClass();
                otq.a |= 1;
                otq.b = str2;
                String str3 = (String) c2.get(1);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                otq otq2 = (otq) o.b;
                str3.getClass();
                int i2 = 2 | otq2.a;
                otq2.a = i2;
                otq2.c = str3;
                otq2.a = i2 | 4;
                otq2.d = i;
                arrayList.add((otq) o.i());
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24);
                sb2.append("Invalid filter string \"");
                sb2.append(str);
                sb2.append("\"");
                oso.b(sb2.toString());
                return Collections.emptyList();
            }
        }
        return arrayList;
    }
}
