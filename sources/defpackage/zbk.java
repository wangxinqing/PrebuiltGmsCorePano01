package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity;
import java.util.Formatter;

/* renamed from: zbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbk extends zax {
    private final ClientContext a;
    private final ytk b;
    private final Comment c;

    public zbk(ClientContext clientContext, ytk ytk, Comment comment) {
        this.a = clientContext;
        this.b = ytk;
        this.c = comment;
    }

    public final void a(Context context, yrr yrr) {
        Comment comment;
        try {
            ClientContext clientContext = this.a;
            Comment comment2 = this.c;
            ysd ysd = yrr.c;
            zgp zgp = new zgp();
            if (!TextUtils.isEmpty(comment2.d)) {
                zgp.a = comment2.d;
                zgp.b.add(2);
            }
            zgo zgo = new zgo();
            zgo.a = new CommentEntity.ObjectEntity(zgp.b, zgp.a);
            zgo.b.add(7);
            String str = !TextUtils.isEmpty(comment2.f) ? comment2.f : "me";
            zdk zdk = ysd.d;
            String str2 = comment2.c;
            String str3 = comment2.e;
            CommentEntity commentEntity = new CommentEntity(zgo.b, zgo.a);
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("activities/%1$s/comments", new Object[]{iyv.a(str2)});
            iyv.a(sb, "contentFormat", iyv.a("html"));
            if (str3 != null) {
                iyv.a(sb, "contextType", iyv.a(str3));
            }
            if (str != null) {
                iyv.a(sb, "onBehalfOf", iyv.a(str));
            }
            CommentEntity commentEntity2 = (CommentEntity) zdk.a.a(clientContext, 1, sb.toString(), (Object) commentEntity, CommentEntity.class);
            if (commentEntity2 != null) {
                yxm yxm = new yxm(comment2);
                yxm.b = commentEntity2.d;
                String str4 = yxm.b;
                Comment comment3 = yxm.a;
                comment = new Comment(1, str4, comment3.c, comment3.d, comment3.e, comment3.f);
            } else {
                comment = null;
            }
            this.b.a(0, (Bundle) null, comment);
        } catch (eif e) {
            this.b.a(4, yug.a(context, this.a), (Comment) null);
        } catch (VolleyError e2) {
            Log.e("InsertCommentOperation", e2.getMessage(), e2);
            this.b.a(7, (Bundle) null, (Comment) null);
        }
    }
}
