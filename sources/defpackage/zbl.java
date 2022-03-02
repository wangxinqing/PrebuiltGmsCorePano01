package defpackage;

import android.content.Context;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.pos.PlusonesEntity;

/* renamed from: zbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbl extends zay {
    private final String c;
    private final String d;

    public zbl(ClientContext clientContext, String str, String str2, yth yth) {
        super(clientContext, yth);
        this.c = str;
        this.d = str2;
    }

    public final Pair b(Context context, yrr yrr) {
        String str;
        zcr zcr;
        yrr yrr2 = yrr;
        ClientContext clientContext = this.a;
        String str2 = this.c;
        String str3 = this.d;
        yse yse = yrr2.b;
        String a = yrr2.a(context, clientContext);
        yrx a2 = yrv.a().a(clientContext.b(), str2);
        String a3 = a2 != null ? a2.a() : null;
        String a4 = zak.a(context.getPackageManager(), clientContext.e);
        try {
            zcn zcn = new zcn();
            zcn.a(yse.a(str2));
            zcn.a = str3;
            zcn.b.add(2);
            zcn.a(true);
            zcr a5 = zcn.a();
            zcs zcs = yse.a;
            String format = String.format("plusones/%1$s", new Object[]{iyv.a(yse.a(str2))});
            if (str3 != null) {
                format = iyv.a(format, "abtk", iyv.a(str3));
            }
            if (a3 != null) {
                format = iyv.a(format, "cdx", iyv.a(a3));
            }
            if (a4 != null) {
                format = iyv.a(format, "container", iyv.a(a4));
            }
            zcr zcr2 = (PlusonesEntity) zcs.a.a(clientContext, 1, iyv.a(format, "source", iyv.a("native:android_app")), (Object) a5, PlusonesEntity.class);
            zcr a6 = yrv.a().a(clientContext.b(), str2, yrw.a(zcr2));
            String a7 = clientContext.a();
            if (a6 == null) {
                zcr = zcr2;
            } else {
                zcr = a6;
            }
            str = str2;
            try {
                return Pair.create(ConnectionResult.a, yrw.a(context, a7, true, str2, zcr, context.getResources().getString(R.string.plus_one_self), context.getResources().getString(R.string.common_chips_label_public), a).a);
            } catch (VolleyError e) {
                e = e;
                yrv.a().b(clientContext.b(), str);
                throw e;
            }
        } catch (VolleyError e2) {
            e = e2;
            str = str2;
            yrv.a().b(clientContext.b(), str);
            throw e;
        }
    }
}
