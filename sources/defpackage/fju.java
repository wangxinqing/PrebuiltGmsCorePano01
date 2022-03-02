package defpackage;

import android.database.DatabaseUtils;
import android.os.Bundle;
import java.util.TreeSet;

/* renamed from: fju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fju implements aoqb {
    private final fjw a;
    private final String b;
    private final hhy c;

    public fju(fjw fjw, String str, hhy hhy) {
        this.a = fjw;
        this.b = str;
        this.c = hhy;
    }

    public final aorr a(Object obj) {
        fjw fjw = this.a;
        String str = this.b;
        hhy hhy = this.c;
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(str);
        anhk i = ((amzy) obj).listIterator();
        while (i.hasNext()) {
            aucx aucx = ((auum) i.next()).a;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                treeSet.add(((auun) aucx.get(i2)).b);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : treeSet) {
            if (sb.length() > 0) {
                sb.append(" OR ");
            }
            sb.append("idx_signon_realm = ");
            DatabaseUtils.appendEscapedSQLString(sb, str2);
        }
        Bundle bundle = new Bundle();
        bundle.putString("where_string", sb.toString());
        return hih.a(hhy, fjw.b, new fjk(hhy, bundle));
    }
}
