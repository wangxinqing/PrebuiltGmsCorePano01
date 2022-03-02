package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.Formatter;

/* renamed from: zdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdg extends iyv {
    private final izb a;

    public zdg(izb izb) {
        this.a = izb;
        izb.g = 6400;
    }

    public final ActivityEntity a(ClientContext clientContext, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, ActivityEntity activityEntity) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("people/%1$s/activities", new Object[]{iyv.a(str)});
        if (str2 != null) {
            iyv.a(sb, "contextType", iyv.a(str2));
        }
        if (str3 != null) {
            iyv.a(sb, "language", iyv.a(str3));
        }
        iyv.a(sb, "notifyCircles", String.valueOf(bool));
        iyv.a(sb, "preview", String.valueOf(bool2));
        if (bool3 != null) {
            iyv.a(sb, "shareOnGooglePlus", String.valueOf(bool3));
        }
        if (str4 != null) {
            iyv.a(sb, "source", iyv.a(str4));
        }
        return (ActivityEntity) this.a.a(clientContext, 1, sb.toString(), (Object) activityEntity, ActivityEntity.class);
    }
}
