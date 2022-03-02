package defpackage;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: zbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbu extends zax {
    private final ClientContext a;
    private final String b;
    private final ytk c;

    public zbu(ClientContext clientContext, String str, ytk ytk) {
        this.a = clientContext;
        this.b = str;
        this.c = ytk;
    }

    public final void a(Context context, yrr yrr) {
        ContentValues contentValues;
        ysw ysw;
        Context context2 = context;
        try {
            ClientContext clientContext = this.a;
            String str = this.b;
            yrv a2 = yrv.a();
            if (str != null) {
                synchronized (a2.b) {
                    contentValues = (ContentValues) a2.b.a((Object) str);
                }
            } else {
                contentValues = null;
            }
            if (contentValues != null) {
                ysw = new ysw(contentValues);
            } else {
                ActivityEntity a3 = yrr.c.b.a(clientContext, "me", (String) null, yxg.a(context), false, true, (Boolean) null, (String) null, (ActivityEntity) ysd.a(str, (Bundle) null));
                ContentValues a4 = ysd.a(str);
                ysd.a(a4, (zfa) a3);
                ysd.a(str, a4);
                ysw = new ysw(a4);
            }
            this.c.a(0, (Bundle) null, ysw.d());
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.a(), 0));
            this.c.a(4, bundle, (Bundle) null);
        } catch (eif e2) {
            this.c.a(4, yug.a(context2, this.a), (Bundle) null);
        } catch (VolleyError e3) {
            this.c.a(7, (Bundle) null, (Bundle) null);
        }
    }
}
