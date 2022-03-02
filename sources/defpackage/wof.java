package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.R;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.Audience;
import com.google.android.gms.plus.service.v1whitelisted.models.AudiencesFeed;
import java.util.Formatter;
import java.util.List;

/* renamed from: wof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wof extends wnc {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final String g;
    private final boolean s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wof(String str, String str2, int i, wzv wzv, String str3, String str4, String str5, int i2, String str6, boolean z) {
        super(str, i, wzv, str3, "LoadCircles");
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i2;
        this.g = str6;
        this.s = z;
    }

    public final DataHolder d(Context context) {
        String str;
        String str2;
        int i;
        Context context2 = context;
        String str3 = this.b;
        String str4 = this.c;
        String str5 = this.d;
        String str6 = this.e;
        int i2 = this.f;
        String str7 = this.g;
        boolean z = this.s;
        Bundle bundle = new Bundle();
        bundle.putString("account", str4);
        bundle.putString("pagegaiaid", str5);
        Resources resources = context.getResources();
        Bundle bundle2 = new Bundle();
        bundle2.putString("1", resources.getString(R.string.common_chips_label_public));
        bundle2.putString("3", resources.getString(R.string.common_chips_label_your_circles));
        bundle2.putString("4", resources.getString(R.string.common_chips_label_extended_circles));
        bundle.putBundle("localized_group_names", bundle2);
        wop.a(context2, str4, str5, bundle);
        if (z) {
            wmr a = wmr.a(context2, 5386);
            xpk a2 = wmr.a(context2, str4, str5, str3);
            Bundle bundle3 = new Bundle();
            String str8 = null;
            while (true) {
                try {
                    zdi zdi = a.b;
                    ClientContext clientContext = a2.a;
                    String str9 = a2.b;
                    if (str9 == null) {
                        str9 = "me";
                    }
                    String a3 = yxg.a(context);
                    StringBuilder sb = new StringBuilder();
                    xpk xpk = a2;
                    new Formatter(sb).format("people/%1$s/audiences", new Object[]{iyv.a(str9)});
                    if (a3 != null) {
                        iyv.a(sb, "language", iyv.a(a3));
                    }
                    iyv.a(sb, "maxResults", String.valueOf(100));
                    if (str8 != null) {
                        iyv.a(sb, "pageToken", iyv.a(str8));
                    }
                    AudiencesFeed audiencesFeed = (AudiencesFeed) zdi.a.a(clientContext, 0, sb.toString(), (Object) null, AudiencesFeed.class);
                    List list = audiencesFeed.d;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Audience audience = (Audience) list.get(i3);
                        if ("circle".equals(audience.c.e)) {
                            String str10 = audience.d;
                            String str11 = audience.c.d;
                            if (!"limited".equals(str10)) {
                                i = !"public".equals(str10) ? "private".equals(str10) ? 3 : 0 : 1;
                            } else {
                                i = 2;
                            }
                            bundle3.putInt(str11, i);
                        }
                    }
                    String str12 = audiencesFeed.e;
                    if (str12 == null) {
                        break;
                    }
                    Context context3 = context;
                    str8 = str12;
                    a2 = xpk;
                } catch (eif e2) {
                    Log.e("BasePeopleOperation", "Authentication error", e2);
                    bundle3 = null;
                } catch (VolleyError e3) {
                    Object[] objArr = new Object[2];
                    objArr[0] = e3.getMessage();
                    NetworkResponse networkResponse = e3.networkResponse;
                    if (networkResponse != null) {
                        str2 = String.valueOf(networkResponse.statusCode);
                    } else {
                        str2 = "none";
                    }
                    objArr[1] = str2;
                    xdt.b("BasePeopleOperation", "Network error %s [%s]", objArr);
                    bundle3 = null;
                }
            }
            if (bundle3 != null) {
                bundle.putBundle("circlevisibility", bundle3);
            }
        }
        wtx b2 = wtz.a(context).b();
        if (b2 == null) {
            return DataHolder.a(new String[0]).a(13);
        }
        String[] strArr = new String[4];
        strArr[0] = Long.toString(wtw.a(context).a(str4, str5));
        strArr[1] = ycm.b(str6);
        strArr[2] = Integer.toString(i2);
        String l = ycm.l(str7);
        if (!TextUtils.isEmpty(l)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(l).length() + 1);
            sb2.append(l);
            sb2.append('%');
            str = sb2.toString();
        } else {
            str = "";
        }
        strArr[3] = str;
        return new DataHolder(b2.a("SELECT _id,circle_id,name,sort_key,people_count,type,client_policies,last_modified,sync_to_contacts,for_sharing FROM circles WHERE (owner_id = ?1)AND ((?2 = '') OR (circle_id = ?2))AND ((?3='-999') OR (?3=type) OR (?3='-998' AND type != -1))AND ((?4 = '') OR (name like ?4 escape '\\')) ORDER BY sort_key", strArr), bundle);
    }
}
