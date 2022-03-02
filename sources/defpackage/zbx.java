package defpackage;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: zbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbx extends zax {
    private final ClientContext a;
    private final ytk b;
    private final Post c;

    public zbx(ClientContext clientContext, ytk ytk, Post post) {
        this.a = clientContext;
        this.b = ytk;
        this.c = post;
    }

    public final void a(Context context, yrr yrr) {
        Bundle bundle;
        Context context2 = context;
        try {
            ClientContext clientContext = this.a;
            Post post = this.c;
            ysd ysd = yrr.c;
            String str = post.k;
            if (TextUtils.isEmpty(str)) {
                str = "me";
            }
            if (post.a()) {
                String uri = post.d.toString();
                zfa a2 = ysd.a(uri, post.h);
                zdg zdg = ysd.b;
                String str2 = post.j;
                String str3 = uri;
                ActivityEntity a3 = zdg.a(clientContext, str, str2, yxg.a(context), false, true, (Boolean) null, (String) null, (ActivityEntity) a2);
                ContentValues a4 = ysd.a(str3);
                ysd.a(a4, (zfa) a3);
                ysd.a(str3, a4);
                bundle = new ysw(a4).d();
            } else {
                bundle = null;
            }
            this.b.a(0, (Bundle) null, bundle);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.a(), 0));
            this.b.a(4, bundle2, (Bundle) null);
        } catch (eif e2) {
            this.b.a(4, yug.a(context2, this.a), (Bundle) null);
        } catch (VolleyError e3) {
            jad.a(e3, "PlusInternalClient");
            this.b.a(7, (Bundle) null, (Bundle) null);
        }
    }
}
