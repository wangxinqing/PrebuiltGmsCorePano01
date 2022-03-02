package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: woh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class woh {
    static final amzy a;
    private static final amzy b;
    private static final String c = String.format("%s.%s IN (SELECT %s FROM %s WHERE (%s=?) AND (%s>=?) AND (%s<=?))", new Object[]{"mq", "item_id", "item_id", "ac_email_exact_index_view", "owner_id", "value", "value"});
    private static final String d = String.format("%s.%s IN (SELECT %s FROM %s WHERE (%s=?) AND (%s>=?) AND (%s<=?))", new Object[]{"mq", "item_id", "item_id", "ac_email_normalized_index_view", "owner_id", "value", "value"});
    private static final String e;
    private static final String f;
    private static final String g = String.format(" AND (%s.%s IN (SELECT %s FROM %s WHERE (%s=?) AND (%s=?)))", new Object[]{"mq", "item_id", "item_id", "ac_email_exact_index_view", "owner_id", "value"});

    static {
        amzy a2 = amzy.a("v2_id", "container_type", "profile_type", "gaia_id", "contact_id", "has_cp2_avatar", "display_name", "compressed_avatar_url", "person_affinity1", "person_affinity2", "person_affinity3", "person_affinity4", "person_affinity5", "person_logging_id1", "person_logging_id2", "person_logging_id3", "person_logging_id4", "person_logging_id5", "item_type", "value", "value2", "value_type", "custom_label", "item_affinity1", "item_affinity2", "item_affinity3", "item_affinity4", "item_affinity5", "item_logging_id1", "item_logging_id2", "item_logging_id3", "item_logging_id4", "item_logging_id5", "item_certificate_expiration_millis", "item_certificate_status");
        b = a2;
        ArrayList arrayList = new ArrayList(a2.size());
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            String str = (String) a2.get(i);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3);
            sb.append("mq.");
            sb.append(str);
            arrayList.add(sb.toString());
        }
        a = amzy.a((Collection) arrayList);
        String format = String.format("%s.%s IN (SELECT %s FROM %s WHERE (%s=?) AND (%s>=?) AND (%s<=?))", new Object[]{"mq", "item_id", "item_id", "ac_name_search_index_view", "owner_id", "value", "value"});
        e = format;
        f = String.format("(%s) OR (%s) OR (%s)", new Object[]{c, d, format});
    }

    public static String a(String str, int i, String[] strArr, List list, int i2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        xip.a();
        if (!Boolean.valueOf(aywy.a.a().de()).booleanValue()) {
            str2 = "ac_main_query_view";
        } else {
            str2 = "ac_main_query_view_legacy";
        }
        sb.append("SELECT ");
        sb.append(TextUtils.join(",", a));
        sb.append(" FROM ");
        sb.append(str2);
        sb.append(" AS mq WHERE (mq.owner_id=?)");
        list.add(str);
        if (i == 0) {
            for (String str3 : strArr) {
                sb.append(" AND (");
                list.add(str);
                list.add(str3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append(65535);
                list.add(sb2.toString());
                String c2 = wue.c(str3);
                list.add(str);
                list.add(c2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 1);
                sb3.append(c2);
                sb3.append(65535);
                list.add(sb3.toString());
                list.add(str);
                list.add(c2);
                StringBuilder sb4 = new StringBuilder(String.valueOf(c2).length() + 1);
                sb4.append(c2);
                sb4.append(65535);
                list.add(sb4.toString());
                sb.append(f);
                sb.append(")");
            }
        } else if (i != 1) {
            iva.a(false);
        } else {
            if (strArr.length > 1) {
                Log.w("LoadFromAutocompleteSql", "Multiple tokens for EMAIL_EXACT, using only first token.");
            }
            String str4 = strArr[0];
            sb.append(g);
            list.add(str);
            list.add(str4);
        }
        xip.a();
        if (!Boolean.valueOf(aywy.a.a().aG()).booleanValue()) {
            sb.append(" ORDER BY mq.item_affinity1 DESC,mq.person_affinity1 DESC,mq.display_name,mq.container_type,mq.item_id");
        } else {
            amzt j = amzy.j();
            xip.a();
            if (Boolean.valueOf(aywy.a.a().aI()).booleanValue()) {
                j.c("mq.item_affinity1 DESC");
            }
            if (Boolean.valueOf(aywy.a.a().aJ()).booleanValue()) {
                j.c("mq.person_affinity1 DESC");
            }
            if (Boolean.valueOf(aywy.a.a().aH()).booleanValue()) {
                j.c("mq.display_name");
            }
            sb.append(" ORDER BY ");
            sb.append(TextUtils.join(",", j.a()));
        }
        if (Boolean.valueOf(aywy.a.a().aE()).booleanValue() && i2 >= 0) {
            sb.append(" LIMIT ");
            sb.append(i2 * Integer.valueOf((int) aywy.a.a().aF()).intValue());
        }
        sb.append(";");
        return sb.toString();
    }
}
