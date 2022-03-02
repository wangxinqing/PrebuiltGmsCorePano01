package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.internal.model.About;

/* renamed from: lnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lnt extends iyv {
    private final izb a;

    public lnt(izb izb) {
        this.a = izb;
    }

    public final About a(ClientContext clientContext, Boolean bool, Boolean bool2, Long l, Boolean bool3, Boolean bool4, String str, Long l2, Integer num, iyu iyu) {
        StringBuilder sb = new StringBuilder("about");
        iyu.a(sb);
        if (bool != null) {
            iyv.a(sb, "errorRecovery", String.valueOf(bool));
        }
        if (bool2 != null) {
            iyv.a(sb, "includeSubscribed", String.valueOf(bool2));
        }
        if (l != null) {
            iyv.a(sb, "maxChangeIdCount", String.valueOf(l));
        }
        if (bool3 != null) {
            iyv.a(sb, "mutationPrecondition", String.valueOf(bool3));
        }
        if (bool4 != null) {
            iyv.a(sb, "openDrive", String.valueOf(bool4));
        }
        if (str != null) {
            iyv.a(sb, "reason", iyv.a(str));
        }
        if (l2 != null) {
            iyv.a(sb, "startChangeId", String.valueOf(l2));
        }
        if (num != null) {
            iyv.a(sb, "syncType", String.valueOf(num));
        }
        return (About) this.a.a(clientContext, 0, sb.toString(), (Object) null, About.class);
    }
}
