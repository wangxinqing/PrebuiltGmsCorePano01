package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wop {
    static DataHolder a(Context context, String str, String str2, int i) {
        wtx b = wtz.a(context).b();
        if (b == null) {
            return DataHolder.a(new String[0]).a(13);
        }
        return new DataHolder(b.a("SELECT DISTINCT gaia_id,value,type FROM gaia_id_map WHERE ((?1 = '') OR (value = ?1)) AND ((?2 = '') OR (gaia_id = ?2)) AND ((type& ?) != 0)", new String[]{ycm.b(str), ycm.b(str2), String.valueOf(i)}), (Bundle) null);
    }

    public static DataHolder a(Context context, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3, int i4, boolean z2) {
        String str5;
        String str6 = str;
        String str7 = str2;
        List list2 = list;
        int i5 = i;
        int i6 = i2;
        int i7 = i4;
        boolean z3 = (i7 & 4) != 0;
        Bundle bundle = new Bundle();
        bundle.putString("account", str6);
        bundle.putString("pagegaiaid", str7);
        a(context, str6, str7, bundle);
        bundle.putBoolean("emails_with_affinities", z3);
        wtx b = wtz.a(context).b();
        if (b == null) {
            return DataHolder.a(new String[0]).a(13);
        }
        long a = wtw.a(context).a(str6, str7);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        woo woo = new woo(sb);
        woo.a(i5, 16384, "_id");
        woo.a(i5, 1, "qualified_id");
        woo.a(i5, 2, "gaia_id");
        woo.a(i5, 4, "name");
        woo.a(i5, FragmentTransaction.TRANSIT_ENTER_MASK, "given_name");
        woo.a(i5, FragmentTransaction.TRANSIT_EXIT_MASK, "family_name");
        woo.a(i5, 2048, "name_verified");
        String str8 = "sort_key";
        woo.a(i5, 8, str8);
        woo.a(i5, 16, "sort_key_irank");
        woo.a(i5, 32, "avatar");
        woo.a(i5, 64, "profile_type");
        woo.a(i5, 128, "(SELECT group_concat(circle_id) FROM circle_members AS CM  WHERE CM.owner_id==P.owner_id AND CM.qualified_id=P.qualified_id)AS v_circle_ids");
        woo.a(i5, PSKKeyManager.MAX_KEY_LENGTH_BYTES, "blocked");
        woo.a(i5, 512, "last_modified");
        woo.a(i5, 1024, "in_viewer_domain");
        woo.a(i5, 32768, "affinity1");
        woo.a(i5, 65536, "affinity2");
        woo.a(i5, 131072, "affinity3");
        woo.a(i5, 262144, "affinity4");
        woo.a(i5, 524288, "affinity5");
        woo.a(i5, 32768, "logging_id");
        woo.a(i5, 65536, "logging_id2");
        woo.a(i5, 131072, "logging_id3");
        woo.a(i5, 262144, "logging_id4");
        woo.a(i5, 524288, "logging_id5");
        woo.a(i5, 1048576, "people_in_common");
        String str9 = z3 ? "||\"\u0001\"||ifnull(affinity1,0)||\"\u0001\"||ifnull(affinity2,0)||\"\u0001\"||ifnull(affinity3,0)||\"\u0001\"||ifnull(affinity4,0)||\"\u0001\"||ifnull(affinity5,0)||\"\u0001\"||ifnull(logging_id,'')||\"\u0001\"||ifnull(logging_id2,'')||\"\u0001\"||ifnull(logging_id3,'')||\"\u0001\"||ifnull(logging_id4,'')||\"\u0001\"||ifnull(logging_id5,'')" : "";
        StringBuilder sb2 = new StringBuilder(str9.length() + 168);
        sb2.append("(SELECT group_concat(type||\"\u0001\"||ifnull(custom_label,'')||\"\u0001\"||email");
        sb2.append(str9);
        sb2.append(",\"\u0002\") FROM emails AS EM  WHERE EM.owner_id==P.owner_id AND EM.qualified_id=P.qualified_id)AS v_emails");
        woo.a(i7, 1, sb2.toString());
        woo.a(i7, 2, "(SELECT group_concat(type||\"\u0001\"||ifnull(custom_label,'')||\"\u0001\"||phone,\"\u0002\") FROM phones AS PH  WHERE PH.owner_id==P.owner_id AND PH.qualified_id=P.qualified_id)AS v_phones");
        sb.append(" FROM people AS P WHERE (owner_id = ?)");
        arrayList.add(Long.toString(a));
        if (!TextUtils.isEmpty(str3)) {
            sb.append(" AND (qualified_id IN (SELECT qualified_id FROM circle_members WHERE owner_id=P.owner_id AND circle_id=?))");
            arrayList.add(str3);
        } else {
            sb.append(" AND ((in_circle =1)");
            if (z2) {
                sb.append(" OR (in_contacts=1");
                if (!aywy.a.a().D()) {
                    sb.append(" AND EXISTS (SELECT 1 FROM gaia_id_map G  WHERE G.owner_id=P.owner_id AND G.type!=2 AND G.gaia_id=P.gaia_id)");
                }
                sb.append(")");
            }
            sb.append(")");
        }
        if (z) {
            sb.append(" AND (profile_type=1)");
        }
        if (j != 0) {
            sb.append(" AND (last_modified>=?)");
            arrayList.add(String.valueOf(j));
        }
        if (list2 != null && list.size() > 0) {
            sb.append(" AND qualified_id IN (");
            for (int i8 = 0; i8 < list.size(); i8++) {
                if (i8 != 0) {
                    sb.append(",?");
                } else {
                    sb.append("?");
                }
                arrayList.add((String) list2.get(i8));
            }
            sb.append(")");
        }
        String a2 = ycm.a(str4);
        if (!TextUtils.isEmpty(a2)) {
            String[] split = ycm.d.split(a2);
            for (String str10 : split) {
                arrayList.add(String.valueOf(str10).concat("%"));
                arrayList.add(String.valueOf(wub.a(str10)).concat("%"));
                sb.append(" AND (_id IN (SELECT person_id FROM search_index WHERE ((value LIKE ? AND kind!=1) OR (value LIKE ? AND kind=1))");
                if (i6 != 7) {
                    sb.append(" AND kind IN(");
                    String str11 = ",";
                    if ((i6 & 1) != 0) {
                        sb.append("1");
                        str5 = str11;
                    } else {
                        str5 = "";
                    }
                    if ((i6 & 2) != 0) {
                        sb.append(str5);
                        sb.append(2);
                    } else {
                        str11 = str5;
                    }
                    if ((i6 & 4) != 0) {
                        sb.append(str11);
                        sb.append(3);
                    }
                    sb.append(")");
                }
                sb.append("))");
            }
        }
        sb.append("ORDER BY ");
        switch (i3) {
            case 2:
                str8 = "sort_key_irank DESC";
                break;
            case 3:
                str8 = "name COLLATE LOCALIZED";
                break;
            case 4:
                str8 = "affinity1 DESC";
                break;
            case 5:
                str8 = "affinity2 DESC";
                break;
            case 6:
                str8 = "affinity3 DESC";
                break;
            case 7:
                str8 = "affinity4 DESC";
                break;
            case 8:
                str8 = "affinity5 DESC";
                break;
        }
        sb.append(str8);
        sb.append(", sort_key, _id");
        return new DataHolder(b.a(sb.toString(), (String[]) arrayList.toArray(ycm.b)), bundle);
    }

    /* JADX INFO: finally extract failed */
    public static void a(Context context, String str, String str2, Bundle bundle) {
        long j;
        long j2;
        xej a = xej.a(context);
        boolean b = a.b(str, str2);
        boolean c = a.c(str, str2);
        wtx b2 = wtz.a(context).b();
        if (b2 != null) {
            int i = 0;
            Cursor a2 = b2.a("SELECT last_sync_start_time,last_sync_finish_time,last_successful_sync_time,last_sync_status FROM owners WHERE _id=?", new String[]{wtw.a(context).b(str, str2)});
            try {
                long j3 = 0;
                if (a2.moveToNext()) {
                    j3 = a2.getLong(0);
                    j = a2.getLong(1);
                    long j4 = a2.getLong(2);
                    i = a2.getInt(3);
                    j2 = j4;
                } else {
                    j = 0;
                    j2 = 0;
                }
                a2.close();
                bundle.putBoolean("is_tickle_sync_enabled", b);
                bundle.putBoolean("is_periodic_sync_enabled", c);
                bundle.putLong("last_sync_start_timestamp", j3);
                bundle.putLong("last_sync_finish_timestamp", j);
                bundle.putLong("last_successful_sync_finish_timestamp", j2);
                bundle.putInt("last_sync_status", i);
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
    }
}
