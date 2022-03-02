package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: mpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpp extends mhh {
    private final String b;

    public mpp(Context context, String str) {
        super(context);
        this.b = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = aqkr.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqkr aqkr = (aqkr) o.b;
        "me".getClass();
        int i = 1;
        int i2 = aqkr.a | 1;
        aqkr.a = i2;
        aqkr.b = "me";
        aqkr.e = 0;
        aqkr.a = i2 | 8;
        aqkr aqkr2 = (aqkr) o.i();
        try {
            mfw.b();
            mfn a = mfw.a();
            mfw.b();
            ClientContext a2 = mfw.a(this.b);
            iyn iyn = a.a;
            StringBuilder sb = new StringBuilder();
            String a3 = iyv.a(aqkr2.b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 26);
            sb2.append("/users/");
            sb2.append(a3);
            sb2.append("/settings?alt=proto");
            sb.append(sb2.toString());
            if (!(aqkr2 == null || aqkr2.c.length() == 0)) {
                sb.append("&versionInfo=");
                sb.append(iyv.a(aqkr2.c));
            }
            if (!(aqkr2 == null || aqkr2.d.length() == 0)) {
                sb.append("&continueUrl=");
                sb.append(iyv.a(aqkr2.d));
            }
            if (aqkr2 != null) {
                int a4 = aqkq.a(aqkr2.e);
                if (a4 != 0) {
                    if (a4 != 1) {
                        sb.append("&delegationType=");
                        int a5 = aqkq.a(aqkr2.e);
                        if (a5 != 0) {
                            i = a5;
                        }
                        sb.append(i - 1);
                    }
                }
            }
            return (aqkv) iyn.a(a2, 0, sb.toString(), (byte[]) null, (Object) aqkv.d);
        } catch (VolleyError | eif e) {
            return null;
        }
    }
}
