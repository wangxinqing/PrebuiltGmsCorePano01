package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v2whitelisted.models.PeopleList;
import java.util.Formatter;
import java.util.List;

/* renamed from: zin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zin extends iyv {
    public final izb a;

    public zin(izb izb) {
        this.a = izb;
    }

    public final PeopleList a(ClientContext clientContext, String str, String str2, String str3, Boolean bool, List list, Boolean bool2, Integer num, String str4, String str5, String str6, String str7, iyu iyu) {
        List list2 = list;
        iyu iyu2 = iyu;
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("people/%1$s/people/%2$s", new Object[]{iyv.a(str), iyv.a(str2)});
        if (iyu2 != null) {
            iyu2.a(sb);
        }
        if (str3 != null) {
            iyv.a(sb, "customResponseMaskingType", iyv.a(str3));
        }
        if (bool != null) {
            iyv.a(sb, "delayFullSync", String.valueOf(bool));
        }
        if (list2 != null) {
            iyv.a(sb, "includeAffinity", TextUtils.join("&includeAffinity=", list));
        }
        iyv.a(sb, "includeOthers", String.valueOf(bool2));
        iyv.a(sb, "maxResults", String.valueOf(num));
        if (str4 != null) {
            iyv.a(sb, "onBehalfOf", iyv.a(str4));
        }
        if (str5 != null) {
            iyv.a(sb, "orderBy", iyv.a(str5));
        }
        if (str6 != null) {
            iyv.a(sb, "pageToken", iyv.a(str6));
        }
        if (str7 != null) {
            iyv.a(sb, "syncToken", iyv.a(str7));
        }
        return (PeopleList) this.a.a(clientContext, 0, sb.toString(), (Object) null, PeopleList.class);
    }
}
