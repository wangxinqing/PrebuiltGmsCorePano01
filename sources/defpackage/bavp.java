package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: bavp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavp implements bawd {
    final /* synthetic */ bawc a;

    public bavp(bawc bawc) {
        this.a = bawc;
    }

    public final void a() {
        if (((Integer) this.a.g.get()).intValue() != 8) {
            URL url = new URL(this.a.m);
            HttpURLConnection httpURLConnection = this.a.q;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.a.q = null;
            }
            this.a.q = (HttpURLConnection) url.openConnection();
            boolean z = false;
            this.a.q.setInstanceFollowRedirects(false);
            if (!this.a.e.containsKey("User-Agent")) {
                bawc bawc = this.a;
                bawc.e.put("User-Agent", bawc.d);
            }
            for (Map.Entry entry : this.a.e.entrySet()) {
                this.a.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            bawc bawc2 = this.a;
            if (bawc2.i == null) {
                bawc2.i = "GET";
            }
            bawc2.q.setRequestMethod(bawc2.i);
            bawc bawc3 = this.a;
            bawl bawl = bawc3.j;
            if (bawl != null) {
                bawc3.r = new bavb(bawc3, bawc3.k, bawc3.c, bawc3.q, bawl);
                bawc bawc4 = this.a;
                bavb bavb = bawc4.r;
                if (bawc4.f.size() == 1) {
                    z = true;
                }
                bavb.a((bawd) new bava(bavb, z));
                return;
            }
            bawc3.l = 10;
            this.a.q.connect();
            this.a.a();
        }
    }
}
