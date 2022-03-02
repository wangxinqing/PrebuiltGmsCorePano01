package defpackage;

import android.database.DatabaseUtils;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: lit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lit {
    public static final Pattern a = Pattern.compile("[^\\s\"']+|\"([^\"]*)\"|'([^']*)'");

    public static kqy a(List list) {
        iva.a((Object) list);
        iva.a(!list.isEmpty());
        StringBuilder sb = new StringBuilder();
        sb.append(kmj.RESOURCE_ID.c.a());
        sb.append(" IN (");
        DatabaseUtils.appendEscapedSQLString(sb, (String) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(",");
            DatabaseUtils.appendEscapedSQLString(sb, (String) list.get(i));
        }
        sb.append(')');
        return kqz.a(sb.toString());
    }
}
