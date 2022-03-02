package defpackage;

import com.android.volley.Response;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.Formatter;

/* renamed from: zdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdf extends iyv {
    public final izb a;

    public zdf(izb izb) {
        this.a = izb;
        izb.g = 6400;
    }

    public final AclEntity a(ClientContext clientContext, String str, String str2, String str3, AclEntity aclEntity) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("applications/%1$s/acl/%2$s", new Object[]{iyv.a(str), iyv.a(str2)});
        if (str3 != null) {
            iyv.a(sb, "language", iyv.a(str3));
        }
        return (AclEntity) this.a.a(clientContext, 2, sb.toString(), (Object) aclEntity, AclEntity.class);
    }

    public final void b(ClientContext clientContext, String str, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("authCategories/%1$s/acl/%2$s", new Object[]{iyv.a(str), iyv.a(str2)});
        if (str3 != null) {
            iyv.a(sb, "language", iyv.a(str3));
        }
        ClientContext clientContext2 = clientContext;
        this.a.a(clientContext2, sb.toString(), AclEntity.class, listener, errorListener);
    }

    public final void a(ClientContext clientContext, String str, String str2, AclEntity aclEntity) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("authCategories/%1$s/acl/%2$s", new Object[]{iyv.a(str), iyv.a(str2)});
        ClientContext clientContext2 = clientContext;
        AclEntity aclEntity2 = (AclEntity) this.a.a(clientContext2, 2, sb.toString(), (Object) aclEntity, AclEntity.class);
    }

    public final void a(ClientContext clientContext, String str, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("applications/%1$s/acl/%2$s", new Object[]{iyv.a(str), iyv.a(str2)});
        if (str3 != null) {
            iyv.a(sb, "language", iyv.a(str3));
        }
        ClientContext clientContext2 = clientContext;
        this.a.a(clientContext2, sb.toString(), AclEntity.class, listener, errorListener);
    }
}
