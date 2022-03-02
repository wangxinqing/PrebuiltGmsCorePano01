package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: nzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzh {
    public static final String a = Boolean.toString(false);
    public static final nzh b = new nzh("product_id_string", "");
    public static final nzh c = new nzh("helpcenter_name", "");
    public static final nzh d = new nzh("top_level_topic_url", "");
    public static final nzh e = new nzh("contact_card_position", "");
    public static final nzh f;
    public static final nzh g;
    public static final nzh h;
    public static final nzh i;
    public static final nzh j;
    public static final nzh k;
    public static final nzh l;
    public static final nzh m;
    public static final nzh n;
    public static final nzh o = new nzh("autocomplete_client_name", 1, "help");
    public static final nzh p = new nzh("smart_journey_configured", 1, a);
    public static final nzh q = new nzh("smart_journey_path", 1, "");
    public static final nzh r = new nzh("community_path", 1, "");
    public static final nzh s = new nzh("smart_journey_existing_chat_case_id", 1, "");
    public static final nzh t = new nzh("smart_journey_existing_chat_pool_id", 1, "");
    public final oll u;
    public final String v;

    static {
        Boolean.toString(true);
        String z = axmj.z();
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 275);
        sb.append(z);
        sb.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=1&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE,PCT_TITLE,PCT_METADATA,PCT_NOTIFICATIONS,PCT_ARTICLE_QUALITY_SURVEY,PCT_CONTEXT_SELECTOR&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f = new nzh("answer_rendering_url_format", 2, sb.toString());
        String z2 = axmj.z();
        StringBuilder sb2 = new StringBuilder(String.valueOf(z2).length() + 275);
        sb2.append(z2);
        sb2.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=2&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE,PCT_TITLE,PCT_METADATA,PCT_NOTIFICATIONS,PCT_ARTICLE_QUALITY_SURVEY,PCT_CONTEXT_SELECTOR&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        g = new nzh("topic_rendering_url_format", 2, sb2.toString());
        String z3 = axmj.z();
        StringBuilder sb3 = new StringBuilder(String.valueOf(z3).length() + 225);
        sb3.append(z3);
        sb3.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=4&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,js_request_id.survey_request,full_page.1&components=PCT_NONE,PCT_TITLE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        h = new nzh("form_rendering_url_format", 2, sb3.toString());
        String z4 = axmj.z();
        StringBuilder sb4 = new StringBuilder(String.valueOf(z4).length() + 224);
        sb4.append(z4);
        sb4.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=22&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE,PCT_TITLE,PCT_ARTICLE_QUALITY_SURVEY&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        i = new nzh("support_forum_rendering_url_format", 1, sb4.toString());
        String z5 = axmj.z();
        StringBuilder sb5 = new StringBuilder(String.valueOf(z5).length() + 187);
        sb5.append(z5);
        sb5.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=25&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        j = new nzh("support_forum_thread_rendering_url_format", 1, sb5.toString());
        String z6 = axmj.z();
        StringBuilder sb6 = new StringBuilder(String.valueOf(z6).length() + 179);
        sb6.append(z6);
        sb6.append("/%1$s/apis/render?v=1&hl=%3$s&page_type=26&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        k = new nzh("support_forum_new_thread_rendering_url_format", 1, sb6.toString());
        String z7 = axmj.z();
        StringBuilder sb7 = new StringBuilder(String.valueOf(z7).length() + 187);
        sb7.append(z7);
        sb7.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=28&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        l = new nzh("support_forum_profile_rendering_url_format", 1, sb7.toString());
        String z8 = axmj.z();
        StringBuilder sb8 = new StringBuilder(String.valueOf(z8).length() + 179);
        sb8.append(z8);
        sb8.append("/%1$s/apis/render?v=1&hl=%3$s&page_type=24&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        m = new nzh("support_forum_threads_rendering_url_format", 1, sb8.toString());
        String z9 = axmj.z();
        StringBuilder sb9 = new StringBuilder(String.valueOf(z9).length() + 187);
        sb9.append(z9);
        sb9.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=31&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        n = new nzh("support_forum_community_rendering_url_format", 1, sb9.toString());
    }

    private nzh(String str, int i2, String str2) {
        this.u = oaq.a(str, i2);
        this.v = str2;
    }

    public static nzh[] a() {
        return new nzh[]{f, g, h, i, j, k, l, m, n};
    }

    public static Map b() {
        nzh[] nzhArr = {b, d, e, f, g, h, i, j, k, l, m, n, o, s, t};
        nz nzVar = new nz(15);
        for (int i2 = 0; i2 < 15; i2++) {
            nzh nzh = nzhArr[i2];
            nzVar.put(new nzg(nzh.u), nzh);
        }
        nzh[] nzhArr2 = {p, q};
        for (int i3 = 0; i3 < 2; i3++) {
            nzh nzh2 = nzhArr2[i3];
            nzVar.put(new nzg(nzh2.u), nzh2);
        }
        nzVar.put(new nzg(r.u), r);
        return nzVar;
    }

    private nzh(String str, String str2) {
        this.u = oaq.a(str);
        this.v = str2;
    }

    public static nzh a(String str) {
        String concat = String.valueOf(axmj.l()).concat(".%s");
        if (str.equals(String.format(concat, new Object[]{"answer_rendering_url_format"}))) {
            return f;
        }
        if (str.equals(String.format(concat, new Object[]{"topic_rendering_url_format"}))) {
            return g;
        }
        if (str.equals(String.format(concat, new Object[]{"form_rendering_url_format"}))) {
            return h;
        }
        if (str.equals(String.format(concat, new Object[]{"support_forum_rendering_url_format"}))) {
            return i;
        }
        if (str.equals("autocomplete_client_name")) {
            return o;
        }
        return null;
    }

    public static boolean a(oll oll, oll oll2) {
        if (oll == null && oll2 == null) {
            return true;
        }
        return oll != null && oll2 != null && oll.c == oll2.c && TextUtils.equals(oll.b, oll2.b);
    }
}
