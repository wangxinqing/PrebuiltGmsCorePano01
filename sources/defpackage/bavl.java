package defpackage;

import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bavl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavl implements bawd {
    final /* synthetic */ bawc a;

    public bavl(bawc bawc) {
        this.a = bawc;
    }

    public final void a() {
        List list;
        if (this.a.q != null) {
            ArrayList arrayList = new ArrayList();
            String str = "http/1.1";
            int i = 0;
            while (true) {
                String headerFieldKey = this.a.q.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    str = this.a.q.getHeaderField(i);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.a.q.getHeaderField(i)));
                }
                i++;
            }
            int responseCode = this.a.q.getResponseCode();
            bawc bawc = this.a;
            bawc.o = new bawj(new ArrayList(bawc.f), responseCode, this.a.q.getResponseMessage(), Collections.unmodifiableList(arrayList), str, "");
            if (responseCode >= 300 && responseCode < 400 && (list = (List) this.a.o.getAllHeaders().get("location")) != null) {
                bawc bawc2 = this.a;
                bawc2.a(1, 2, new bavo(bawc2, (String) list.get(0)));
                return;
            }
            this.a.b();
            if (responseCode >= 400) {
                InputStream errorStream = this.a.q.getErrorStream();
                this.a.n = errorStream != null ? bauq.a(errorStream) : null;
                this.a.b.a();
                return;
            }
            bawc bawc3 = this.a;
            bawc3.n = bauq.a(bawc3.q.getInputStream());
            this.a.b.a();
        }
    }
}
