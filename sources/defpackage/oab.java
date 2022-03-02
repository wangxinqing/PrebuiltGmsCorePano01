package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: oab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oab {
    public static final oab a;
    private static final Set x = new HashSet();
    private static int y;
    private String A;
    private final avna B;
    public String b;
    public final int c;
    public String d;
    public final String e;
    public final String f;
    public final String g;
    public final avmc h;
    public final String i;
    public final boolean j;
    public boolean k;
    public String l;
    public long m;
    public final boolean n;
    public final String o;
    public final String p;
    public boolean q;
    public boolean r;
    public final List s;
    public final boolean t;
    public final String u;
    public final int v;
    public final int w;
    private final String z;

    static {
        oaa oaa = new oaa();
        oaa.b = 5;
        a = oaa.a();
    }

    public oab(String str, int i2, String str2, String str3, String str4, String str5, String str6, avmc avmc, String str7, String str8, long j2, boolean z2, boolean z3, String str9, String str10, String str11, int i3, avna avna, int i4, boolean z4) {
        avna avna2 = avna;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.z = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = avmc;
        this.i = str7;
        this.l = str8;
        this.m = j2;
        this.j = z2;
        this.n = z3;
        this.o = str9;
        this.p = str10;
        this.u = str11;
        this.w = i3;
        if (avna2 == null) {
            this.B = avna.UNKNOWN_PROMOTION_PLACEMENT;
        } else {
            this.B = avna2;
        }
        this.v = i4;
        this.t = z4;
        this.q = false;
        this.r = false;
        this.s = new ArrayList();
        this.A = "";
    }

    private static String a(String str, HelpConfig helpConfig) {
        if (TextUtils.isEmpty(helpConfig.c)) {
            return str;
        }
        try {
            return oau.a(str, "extra_params", c("psc", URLEncoder.encode(helpConfig.c, "UTF-8")));
        } catch (UnsupportedEncodingException e2) {
            String str2 = helpConfig.c;
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 26 + String.valueOf(message).length());
            sb.append("Error encoding to UTF-8: ");
            sb.append(str2);
            sb.append("\n");
            sb.append(message);
            Log.e("HelpResponse", sb.toString());
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.oab b(java.lang.String r10, java.lang.String r11) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r10)
            java.lang.String r10 = "label"
            boolean r1 = r0.has(r10)
            r2 = 0
            if (r1 == 0) goto L_0x0118
            java.lang.String r1 = "description"
            boolean r3 = r0.has(r1)
            if (r3 == 0) goto L_0x001b
            java.lang.String r1 = r0.getString(r1)
            goto L_0x001d
        L_0x001b:
            java.lang.String r1 = ""
        L_0x001d:
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r3 = "type"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L_0x0116
            java.lang.String r4 = r0.getString(r3)
            int r5 = r4.hashCode()
            r6 = -1620425664(0xffffffff9f6a4440, float:-4.9607882E-20)
            r7 = 0
            r8 = 2
            r9 = 1
            if (r5 == r6) goto L_0x0059
            r6 = -311339055(0xffffffffed7157d1, float:-4.6682532E27)
            if (r5 == r6) goto L_0x004f
            r6 = 639565452(0x261efe8c, float:5.5162237E-16)
            if (r5 == r6) goto L_0x0045
            goto L_0x0063
        L_0x0045:
            java.lang.String r5 = "ANDROID_INTENT"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0063
            r4 = 0
            goto L_0x0064
        L_0x004f:
            java.lang.String r5 = "URL_NAVIGATION_ACTION"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0063
            r4 = 2
            goto L_0x0064
        L_0x0059:
            java.lang.String r5 = "ANDROID_SETTING"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = -1
        L_0x0064:
            if (r4 == 0) goto L_0x00f7
            if (r4 == r9) goto L_0x008e
            if (r4 == r8) goto L_0x006c
            goto L_0x0117
        L_0x006c:
            java.lang.String r3 = "urlNavigationDefinition"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L_0x008c
            org.json.JSONObject r0 = r0.getJSONObject(r3)
            java.lang.String r3 = "url"
            boolean r4 = r0.has(r3)
            if (r4 != 0) goto L_0x0083
            goto L_0x0117
        L_0x0083:
            java.lang.String r0 = r0.getString(r3)
            oab r10 = b(r10, r1, r0, r11)
            return r10
        L_0x008c:
            goto L_0x0117
        L_0x008e:
            java.lang.String r4 = "androidSettingDefinition"
            boolean r5 = r0.has(r4)
            if (r5 == 0) goto L_0x0116
            org.json.JSONObject r0 = r0.getJSONObject(r4)
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L_0x0116
            java.lang.String r4 = "key"
            boolean r5 = r0.has(r4)
            if (r5 == 0) goto L_0x0116
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r5 = "SWITCH"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0116
            avmc r2 = defpackage.avmc.d
            aucd r2 = r2.o()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x00c0
            goto L_0x00c5
        L_0x00c0:
            r2.c()
            r2.c = r7
        L_0x00c5:
            aucj r3 = r2.b
            avmc r3 = (defpackage.avmc) r3
            r3.b = r9
            int r5 = r3.a
            r5 = r5 | r9
            r3.a = r5
            java.lang.String r0 = r0.getString(r4)
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            r2.c()
            r2.c = r7
        L_0x00de:
            aucj r3 = r2.b
            avmc r3 = (defpackage.avmc) r3
            r0.getClass()
            int r4 = r3.a
            r4 = r4 | r8
            r3.a = r4
            r3.c = r0
            aucj r0 = r2.i()
            avmc r0 = (defpackage.avmc) r0
            oab r2 = a((java.lang.String) r10, (java.lang.String) r1, (defpackage.avmc) r0, (java.lang.String) r11)
            goto L_0x0117
        L_0x00f7:
            java.lang.String r3 = "intentDefinition"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L_0x0115
            org.json.JSONObject r0 = r0.getJSONObject(r3)
            java.lang.String r3 = "intentUri"
            boolean r4 = r0.has(r3)
            if (r4 != 0) goto L_0x010c
            goto L_0x0117
        L_0x010c:
            java.lang.String r0 = r0.getString(r3)
            oab r10 = a((java.lang.String) r10, (java.lang.String) r1, (java.lang.String) r0, (java.lang.String) r11)
            return r10
        L_0x0115:
            goto L_0x0117
        L_0x0116:
        L_0x0117:
            return r2
        L_0x0118:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oab.b(java.lang.String, java.lang.String):oab");
    }

    static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    public static String y() {
        return new StringBuilder("genie-eng:offline").toString();
    }

    public final String d() {
        String valueOf = String.valueOf(this.b);
        return valueOf.length() == 0 ? new String("content_id:") : "content_id:".concat(valueOf);
    }

    public final boolean e() {
        return this.c == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (android.text.TextUtils.equals(r1.c, r3.c) != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 == r8) goto L_0x00ee
            boolean r1 = r8 instanceof defpackage.oab
            r2 = 0
            if (r1 == 0) goto L_0x00ed
            oab r8 = (defpackage.oab) r8
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            defpackage.ofn.e()
            int r1 = r7.c
            int r3 = r8.c
            if (r1 != r3) goto L_0x00ed
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = r7.z
            java.lang.String r3 = r8.z
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = r7.g
            java.lang.String r3 = r8.g
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            avmc r1 = r7.h
            avmc r3 = r8.h
            if (r1 != 0) goto L_0x0058
            if (r3 != 0) goto L_0x0058
            goto L_0x007e
        L_0x0058:
            if (r1 == 0) goto L_0x00ed
            if (r3 == 0) goto L_0x00ed
            int r4 = r1.b
            int r4 = defpackage.avmb.a(r4)
            if (r4 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r4 = 1
        L_0x0066:
            int r5 = r3.b
            int r5 = defpackage.avmb.a(r5)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r5 = 1
        L_0x0070:
            if (r4 != r5) goto L_0x00ed
            java.lang.String r1 = r1.c
            java.lang.String r3 = r3.c
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L_0x007e
            goto L_0x00ed
        L_0x007e:
            java.lang.String r1 = r7.i
            java.lang.String r3 = r8.i
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = r7.l
            java.lang.String r3 = r8.l
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            long r3 = r7.m
            long r5 = r8.m
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00ed
            boolean r1 = r7.j
            boolean r3 = r8.j
            if (r1 != r3) goto L_0x00ed
            boolean r1 = r7.k
            boolean r3 = r8.k
            if (r1 != r3) goto L_0x00ed
            boolean r1 = r7.q
            boolean r3 = r8.q
            if (r1 != r3) goto L_0x00ed
            boolean r1 = r7.r
            boolean r3 = r8.r
            if (r1 != r3) goto L_0x00ed
            java.util.List r1 = r7.s
            java.util.List r3 = r8.s
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = r7.A
            java.lang.String r3 = r8.A
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            boolean r1 = r7.t
            boolean r3 = r8.t
            if (r1 != r3) goto L_0x00ed
            java.lang.String r1 = r7.o
            java.lang.String r3 = r8.o
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = r7.p
            java.lang.String r3 = r8.p
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x00ed
            avna r1 = r7.B
            avna r3 = r8.B
            if (r1 != r3) goto L_0x00ed
            int r1 = r7.v
            int r8 = r8.v
            if (r1 != r8) goto L_0x00ed
            return r0
        L_0x00ed:
            return r2
        L_0x00ee:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oab.equals(java.lang.Object):boolean");
    }

    public final boolean f() {
        return this.c == 15;
    }

    public final boolean g() {
        return this.c == 3;
    }

    public final boolean h() {
        return this.c == 4;
    }

    public final int hashCode() {
        ofn.e();
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), this.d, this.z, this.e, this.f, this.g, this.i, this.l, Long.valueOf(this.m), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.k), this.s, this.A, Boolean.valueOf(this.t), this.o, this.p, this.B, Integer.valueOf(this.v)});
    }

    public final boolean i() {
        return this.c == 5;
    }

    public final boolean j() {
        return this.c == 7;
    }

    public final boolean k() {
        return this.c == 11;
    }

    public final boolean l() {
        return this.c == 9;
    }

    public final boolean m() {
        return this.c == 8;
    }

    public final boolean n() {
        return this.c == 12;
    }

    public final boolean o() {
        return this.c == 22;
    }

    public final boolean p() {
        return this.c == 10;
    }

    public final boolean q() {
        return this.c == 16;
    }

    public final String r() {
        return !this.z.equals(this.d) ? this.z : "";
    }

    public final boolean s() {
        return !TextUtils.isEmpty(this.z);
    }

    public final boolean t() {
        return !TextUtils.isEmpty(this.e);
    }

    public final String toString() {
        try {
            JSONObject put = new JSONObject().put("id", this.b);
            ofn.e();
            put.put("type", this.c).put("title", this.d).put("snippet", this.z).put("url", this.e).put("apiUrl", this.f).put("intentUri", this.g).put("etag", this.l).put("visited_time", this.m).put("is_feeling_lucky", this.j).put("is_in_dark_mode", this.k).put("has_latest_leaf_content_in_database", this.q).put("child_ids", this.s).put("parent_id", this.A);
            avmc avmc = this.h;
            if (avmc != null) {
                put = put.put("androidSettingDefinition", avmc.toString());
            }
            if (this.n) {
                put = put.put("promotion_details", new JSONObject().put("image_base64", this.o).put("link_text", this.p).put("placement", this.B).put("promotion_version", this.v).toString());
            }
            if (o()) {
                put = put.put("URL_NAVIGATION_ACTION", this.i);
            }
            return put.toString();
        } catch (JSONException e2) {
            throw new IllegalStateException("Converting to JSONObject failed.");
        }
    }

    public final boolean u() {
        int a2;
        avmc avmc = this.h;
        if (avmc == null || (a2 = avmb.a(avmc.b)) == 0 || a2 == 1 || TextUtils.isEmpty(this.h.c)) {
            return false;
        }
        return true;
    }

    public final avmc v() {
        if (u()) {
            return this.h;
        }
        return null;
    }

    public final boolean w() {
        return TextUtils.isEmpty(this.A);
    }

    public final avna x() {
        iva.a((Object) this.B);
        return this.B;
    }

    public static oab c(String str, String str2, String str3, String str4, String str5, String str6, long j2) {
        oaa oaa = new oaa();
        oaa.a = str;
        oaa.b = 16;
        oaa.c = str2;
        oaa.d = str3;
        oaa.e = str4;
        oaa.f = str5;
        oaa.o = false;
        oaa.j = str6;
        oaa.k = j2;
        return oaa.a();
    }

    public final void c() {
        if (e()) {
            this.q = false;
            this.r = false;
            this.l = "";
        }
    }

    private static String a(String str, String str2, String str3, HelpConfig helpConfig, nzh nzh) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str2.charAt(0) == '/') {
            str2 = str2.substring(1);
        }
        String a2 = helpConfig.a(nzh);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str;
        if (TextUtils.isEmpty(str3)) {
            str3 = oal.a();
        }
        objArr[2] = str3;
        return oau.a(a(String.format(a2, objArr), helpConfig));
    }

    public static Map a(String str, avol avol, HelpConfig helpConfig) {
        int a2 = avmh.a(avol.c);
        boolean z2 = true;
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 != 4) {
            z2 = false;
        }
        String str2 = avol.d;
        return a(str, (List) avol.b, helpConfig, z2);
    }

    public static Map a(String str, List list, HelpConfig helpConfig, boolean z2) {
        String str2;
        avna avna;
        String str3 = str;
        HelpConfig helpConfig2 = helpConfig;
        nz nzVar = new nz();
        oab a2 = a(str3, z2);
        nzVar.put(str3, a2);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            avok avok = (avok) list.get(i2);
            oab oab = null;
            if (!avok.b.isEmpty() && !avok.c.isEmpty()) {
                int a3 = avmv.a(avok.e);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i3 = a3 - 1;
                if (i3 != 2) {
                    if (i3 == 5) {
                        oab = a(avok.b, avok.d, avok.c);
                    } else if (i3 == 11) {
                        avoi avoi = avok.h;
                        if (avoi == null) {
                            avoi = avoi.d;
                        }
                        String str4 = avoi.a;
                        avoi avoi2 = avok.h;
                        if (avoi2 == null) {
                            avoi2 = avoi.d;
                        }
                        String str5 = avoi2.b;
                        avoi avoi3 = avok.h;
                        if (avoi3 == null) {
                            avoi3 = avoi.d;
                        }
                        String a4 = a(str4, str5, avoi3.c, helpConfig2, nzh.i);
                        if (!TextUtils.isEmpty(a4)) {
                            avoi avoi4 = avok.h;
                            if (avoi4 == null) {
                                avoi4 = avoi.d;
                            }
                            String str6 = avoi4.a;
                            String str7 = avok.b;
                            String str8 = avok.d;
                            String str9 = avok.c;
                            oaa oaa = new oaa();
                            oaa.a = str6;
                            oaa.b = 11;
                            oaa.c = str7;
                            oaa.d = str8;
                            oaa.e = str9;
                            oaa.f = a4;
                            oab = oaa.a();
                        }
                    } else if (i3 == 8) {
                        avlz avlz = avok.f;
                        if (avlz == null) {
                            avlz = avlz.i;
                        }
                        oab = a(avlz, avok.b, avok.d, avok.c);
                    } else if (i3 == 9) {
                        oab = b(avok.b, avok.d, avok.c);
                    } else if (i3 != 13) {
                        if (i3 == 14 && (avok.a & 512) != 0) {
                            avoj avoj = avok.g;
                            if (avoj == null) {
                                avoj = avoj.e;
                            }
                            if (avoj.c < 2) {
                                String str10 = avok.b;
                                String str11 = avok.d;
                                String str12 = avok.c;
                                avoj avoj2 = avok.g;
                                if (avoj2 == null) {
                                    avoj2 = avoj.e;
                                }
                                String str13 = avoj2.b;
                                avoj avoj3 = avok.g;
                                if (avoj3 == null) {
                                    avoj3 = avoj.e;
                                }
                                String str14 = avoj3.a;
                                if (!TextUtils.isEmpty(str10) && !TextUtils.isEmpty(str11) && !TextUtils.isEmpty(str12) && !TextUtils.isEmpty(str13) && !TextUtils.isEmpty(str14)) {
                                    oaa oaa2 = new oaa();
                                    oaa2.a = "promotion_help_response_id_stub";
                                    oaa2.b = 13;
                                    oaa2.c = str10;
                                    oaa2.d = str11;
                                    oaa2.e = str12;
                                    oaa2.b();
                                    oaa2.m = str13;
                                    oaa2.n = str14;
                                    oab = oaa2.a();
                                }
                            } else {
                                String str15 = avok.b;
                                String str16 = avok.d;
                                String str17 = avok.c;
                                avoj avoj4 = avok.g;
                                if (avoj4 == null) {
                                    avoj4 = avoj.e;
                                }
                                String str18 = avoj4.b;
                                avoj avoj5 = avok.g;
                                if (avoj5 == null) {
                                    avoj5 = avoj.e;
                                }
                                String str19 = avoj5.a;
                                avoj avoj6 = avok.g;
                                if (avoj6 == null) {
                                    avoj6 = avoj.e;
                                }
                                avna a5 = avna.a(avoj6.d);
                                if (a5 != null) {
                                    avna = a5;
                                } else {
                                    avna = avna.UNKNOWN_PROMOTION_PLACEMENT;
                                }
                                avoj avoj7 = avok.g;
                                if (avoj7 == null) {
                                    avoj7 = avoj.e;
                                }
                                oab = a(str15, str16, str17, str18, str19, avna, avoj7.c);
                            }
                        }
                    } else if (axmj.n()) {
                        avoi avoi5 = avok.h;
                        if (avoi5 == null) {
                            avoi5 = avoi.d;
                        }
                        String str20 = avoi5.a;
                        avoi avoi6 = avok.h;
                        if (avoi6 == null) {
                            avoi6 = avoi.d;
                        }
                        String str21 = avoi6.b;
                        avoi avoi7 = avok.h;
                        if (avoi7 == null) {
                            avoi7 = avoi.d;
                        }
                        String a6 = a(str20, str21, avoi7.c, helpConfig2, nzh.j);
                        if (!TextUtils.isEmpty(a6)) {
                            avoi avoi8 = avok.h;
                            if (avoi8 == null) {
                                avoi8 = avoi.d;
                            }
                            String str22 = avoi8.a;
                            String str23 = avok.b;
                            String str24 = avok.d;
                            String str25 = avok.c;
                            oaa oaa3 = new oaa();
                            oaa3.a = str22;
                            oaa3.b = 16;
                            oaa3.c = str23;
                            oaa3.d = str24;
                            oaa3.e = str25;
                            oaa3.f = a6;
                            oaa3.o = false;
                            oab = oaa3.a();
                        }
                    }
                } else if ((avok.a & 1024) != 0) {
                    avoi avoi9 = avok.h;
                    if (avoi9 == null) {
                        avoi9 = avoi.d;
                    }
                    String str26 = avoi9.a;
                    avoi avoi10 = avok.h;
                    if (avoi10 == null) {
                        avoi10 = avoi.d;
                    }
                    String str27 = avoi10.b;
                    avoi avoi11 = avok.h;
                    if (avoi11 == null) {
                        avoi11 = avoi.d;
                    }
                    String str28 = avoi11.c;
                    if (TextUtils.isEmpty(str26) || TextUtils.isEmpty(str27)) {
                        str2 = null;
                    } else {
                        if (str27.charAt(0) == '/') {
                            str27 = str27.substring(1);
                        }
                        String a7 = helpConfig2.a(nzh.f);
                        Object[] objArr = new Object[3];
                        objArr[0] = str27;
                        objArr[1] = str26;
                        if (TextUtils.isEmpty(str28)) {
                            str28 = oal.a();
                        }
                        objArr[2] = str28;
                        str2 = oau.a(a(String.format(a7, objArr), helpConfig2));
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        avoi avoi12 = avok.h;
                        if (avoi12 == null) {
                            avoi12 = avoi.d;
                        }
                        String str29 = avoi12.a;
                        String str30 = avok.b;
                        String str31 = avok.d;
                        String str32 = avok.c;
                        oaa oaa4 = new oaa();
                        oaa4.a = str29;
                        oaa4.b = 1;
                        oaa4.c = str30;
                        oaa4.d = str31;
                        oaa4.e = str32;
                        oaa4.f = str2;
                        oab = oaa4.a();
                    }
                }
            }
            if (oab != null) {
                ofn.e();
                a2.a(oab);
                nzVar.put(oab.b, oab);
            }
        }
        return nzVar;
    }

    public static oab b(String str, String str2, String str3) {
        oaa oaa = new oaa();
        oaa.a = str3;
        oaa.b = 9;
        oaa.c = str;
        oaa.d = str2;
        oaa.e = str3;
        return oaa.a();
    }

    public static oab b(String str, String str2, String str3, String str4) {
        oaa oaa = new oaa();
        oaa.a = str3;
        oaa.b = 22;
        oaa.c = str;
        oaa.d = str2;
        oaa.i = str3;
        oaa.e = str4;
        return oaa.a();
    }

    public static oab b(String str, String str2, String str3, String str4, String str5) {
        oaa oaa = new oaa();
        oaa.b = 15;
        oaa.a = str;
        oaa.c = str2;
        oaa.e = str3;
        oaa.d = str4;
        oaa.j = str5;
        return oaa.a();
    }

    public static oab b(String str, String str2, String str3, String str4, String str5, String str6, long j2) {
        oaa oaa = new oaa();
        oaa.a = str;
        oaa.b = 11;
        oaa.c = str2;
        oaa.d = str3;
        oaa.e = str4;
        oaa.f = str5;
        oaa.j = str6;
        oaa.k = j2;
        return oaa.a();
    }

    public final String b() {
        try {
            URI uri = new URI(this.e);
            String path = uri.getPath();
            if (path.contains("/") && !path.endsWith("/")) {
                path = path.substring(0, path.lastIndexOf(47) + 1);
            }
            String scheme = uri.getScheme();
            if (TextUtils.isEmpty(scheme) || "http".equals(scheme)) {
                scheme = "https";
            }
            return new URI(scheme, uri.getHost(), path, (String) null).toString();
        } catch (URISyntaxException e2) {
            return "https";
        }
    }

    public static Set a() {
        String a2 = axmj.a.a().a();
        if (a2.hashCode() != y) {
            synchronized ("HelpResponse") {
                y = a2.hashCode();
                x.clear();
                Collections.addAll(x, ofx.a(a2));
            }
        }
        return x;
    }

    public static oab a(avlz avlz, String str, String str2, String str3) {
        if (avlz != null) {
            int a2 = avly.a(avlz.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 5 || (avlz.a & 16) == 0) {
                        return null;
                    }
                    avmc avmc = avlz.e;
                    if (avmc == null) {
                        avmc = avmc.d;
                    }
                    int a3 = avmb.a(avmc.b);
                    if (a3 == 0 || a3 != 2) {
                        return null;
                    }
                    avmc avmc2 = avlz.e;
                    if (avmc2 == null) {
                        avmc2 = avmc.d;
                    }
                    return a(str, str2, avmc2, str3);
                } else if ((avlz.a & 8) == 0) {
                    return null;
                } else {
                    avmd avmd = avlz.d;
                    if (avmd == null) {
                        avmd = avmd.b;
                    }
                    return b(str, str2, avmd.a, str3);
                }
            } else if ((avlz.a & 2) != 0) {
                avmf avmf = avlz.c;
                if (avmf == null) {
                    avmf = avmf.b;
                }
                return a(str, str2, avmf.a, str3);
            }
        }
        return null;
    }

    public static oab a(OfflineSuggestion offlineSuggestion) {
        oaa oaa = new oaa();
        oaa.a = offlineSuggestion.a;
        oaa.b = 4;
        oaa.c = offlineSuggestion.b;
        oaa.d = offlineSuggestion.c;
        oaa.e = offlineSuggestion.d;
        return oaa.a();
    }

    public static oab a(String str) {
        return a("notification_message", str);
    }

    public static oab a(String str, String str2) {
        oaa oaa = new oaa();
        oaa.a = str;
        oaa.b = 3;
        oaa.c = str2;
        return oaa.a();
    }

    public static oab a(String str, String str2, avmc avmc, String str3) {
        oaa oaa = new oaa();
        oaa.a = avmc.c;
        oaa.b = 12;
        oaa.c = str;
        oaa.d = str2;
        oaa.h = avmc;
        oaa.e = str3;
        return oaa.a();
    }

    public static oab a(String str, String str2, HelpConfig helpConfig) {
        return a(str, str2, helpConfig, false, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.oab a(java.lang.String r19, java.lang.String r20, com.google.android.gms.googlehelp.common.HelpConfig r21, boolean r22, int r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r23
            android.net.Uri r4 = android.net.Uri.parse(r19)     // Catch:{ NullPointerException -> 0x0351 }
            java.lang.String r5 = r4.getHost()
            if (r5 == 0) goto L_0x034f
            java.util.Set r6 = a()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x034f
            boolean r5 = r4.isHierarchical()
            if (r5 == 0) goto L_0x034f
            java.lang.String r5 = "hl"
            java.lang.String r5 = r4.getQueryParameter(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x002f
            r5 = r20
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            boolean r6 = defpackage.axnz.b()
            java.lang.String r7 = "contact"
            r8 = 3
            r11 = 2
            java.lang.String r12 = ""
            r13 = -1
            r15 = 0
            if (r6 == 0) goto L_0x00b1
            oaa r1 = new oaa
            r1.<init>()
            boolean r3 = defpackage.axor.c()
            if (r3 != 0) goto L_0x004c
            r14 = r22
            goto L_0x0051
        L_0x004c:
            if (r2 != r11) goto L_0x0050
            r14 = 1
            goto L_0x0051
        L_0x0050:
            r14 = 0
        L_0x0051:
            java.util.List r2 = r4.getPathSegments()
            int r3 = r2.size()
            if (r3 < r8) goto L_0x0085
            int r5 = r3 + -2
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = android.text.TextUtils.equals(r5, r7)
            if (r5 != 0) goto L_0x006b
            r9 = -1
            goto L_0x0086
        L_0x006b:
            if (r14 != 0) goto L_0x0082
            int r3 = r3 + r13
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = defpackage.axmj.w()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x007f
            goto L_0x0085
        L_0x007f:
            r9 = 21
            goto L_0x0086
        L_0x0082:
            r9 = 10
            goto L_0x0086
        L_0x0085:
            r9 = -1
        L_0x0086:
            r1.b = r9
            r1.e = r0
            r1.o = r15
            boolean r0 = defpackage.axpp.b()
            boolean r0 = defpackage.ofq.b(r0)
            if (r0 == 0) goto L_0x00ab
            java.util.List r0 = r4.getPathSegments()
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x00a8
            java.lang.Object r0 = r0.get(r15)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            r1.p = r12
        L_0x00ab:
            oab r3 = r1.a()
            goto L_0x0350
        L_0x00b1:
            java.util.List r6 = r4.getPathSegments()
            int r13 = r6.size()
            java.lang.String r3 = r4.getFragment()
            if (r3 == 0) goto L_0x00dd
            java.lang.String r9 = "&"
            java.lang.String[] r3 = r3.split(r9)
            int r9 = r3.length
            r10 = 0
        L_0x00c7:
            if (r10 >= r9) goto L_0x00dd
            r8 = r3[r10]
            java.lang.String r14 = "topic="
            boolean r14 = r8.startsWith(r14)
            if (r14 == 0) goto L_0x00d9
            r3 = 6
            java.lang.String r3 = r8.substring(r3)
            goto L_0x00de
        L_0x00d9:
            int r10 = r10 + 1
            r8 = 3
            goto L_0x00c7
        L_0x00dd:
            r3 = 0
        L_0x00de:
            if (r13 <= 0) goto L_0x00e9
            int r8 = r13 + -1
            java.lang.Object r8 = r6.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00ea
        L_0x00e9:
            r8 = r12
        L_0x00ea:
            if (r13 >= r11) goto L_0x00ee
            r9 = r12
            goto L_0x00f6
        L_0x00ee:
            int r9 = r13 + -2
            java.lang.Object r9 = r6.get(r9)
            java.lang.String r9 = (java.lang.String) r9
        L_0x00f6:
            java.lang.String r14 = "/"
            if (r13 <= 0) goto L_0x010c
            if (r3 == 0) goto L_0x010c
            java.util.List r2 = r6.subList(r15, r13)
            java.lang.String r2 = android.text.TextUtils.join(r14, r2)
            r4 = r2
            r6 = r12
            r2 = 0
            r15 = 1
            r12 = r3
            r3 = r6
            goto L_0x0293
        L_0x010c:
            java.lang.String r10 = "community"
            if (r13 != r11) goto L_0x0151
            boolean r16 = defpackage.axmj.n()
            if (r16 == 0) goto L_0x0151
            r2 = 1
            java.util.List r3 = r6.subList(r15, r2)
            java.lang.String r2 = android.text.TextUtils.join(r14, r3)
            java.lang.String r3 = "threads"
            boolean r3 = android.text.TextUtils.equals(r3, r8)
            if (r3 == 0) goto L_0x0140
            java.lang.String r3 = "thread_filter"
            java.lang.String r4 = r4.getQueryParameter(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0138
            java.lang.String r4 = android.net.Uri.encode(r4)
            goto L_0x013a
        L_0x0138:
            r3 = r12
            r4 = r3
        L_0x013a:
            r6 = r4
            r4 = r2
            r2 = 19
            goto L_0x0293
        L_0x0140:
            boolean r3 = android.text.TextUtils.equals(r10, r8)
            if (r3 == 0) goto L_0x014e
            r4 = r2
            r3 = r12
            r6 = r3
            r2 = 20
            goto L_0x0293
        L_0x014e:
            r3 = 0
            goto L_0x0350
        L_0x0151:
            r11 = 3
            if (r13 < r11) goto L_0x034d
            java.lang.String r11 = "answer.py"
            boolean r11 = r8.equals(r11)
            java.lang.String r15 = "bin"
            r17 = r3
            java.lang.String r3 = "answer"
            if (r11 == 0) goto L_0x0178
            boolean r11 = r9.equals(r15)
            if (r11 != 0) goto L_0x016e
            boolean r11 = r9.equals(r3)
            if (r11 == 0) goto L_0x0178
        L_0x016e:
            java.lang.String r3 = r4.getQueryParameter(r3)
            r18 = r12
            r2 = 1
            goto L_0x0249
        L_0x0178:
            java.lang.String r11 = "topic.py"
            boolean r11 = r8.equals(r11)
            r18 = r12
            java.lang.String r12 = "topic"
            if (r11 == 0) goto L_0x019c
            boolean r11 = r9.equals(r15)
            if (r11 != 0) goto L_0x0192
            boolean r11 = r9.equals(r12)
            if (r11 != 0) goto L_0x0192
            goto L_0x019c
        L_0x0192:
            java.lang.String r3 = r4.getQueryParameter(r12)
            r12 = r18
            r2 = 0
            goto L_0x0249
        L_0x019c:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x01b5
            java.lang.String r2 = "co"
            java.lang.String r3 = r4.getQueryParameter(r2)
            if (r3 == 0) goto L_0x01af
            r12 = r2
            r18 = r3
            goto L_0x01b1
        L_0x01af:
            r12 = r18
        L_0x01b1:
            r3 = r8
            r2 = 1
            goto L_0x0249
        L_0x01b5:
            avnq r3 = r1.j
            if (r3 == 0) goto L_0x01dc
            int r4 = r3.a
            r11 = 1
            r4 = r4 & r11
            if (r4 == 0) goto L_0x01dc
            avnp r3 = r3.b
            if (r3 == 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            avnp r3 = defpackage.avnp.e
        L_0x01c6:
            java.lang.String r3 = r3.d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x01da
            avnq r3 = r1.j
            avnp r3 = r3.b
            if (r3 == 0) goto L_0x01d5
            goto L_0x01d7
        L_0x01d5:
            avnp r3 = defpackage.avnp.e
        L_0x01d7:
            java.lang.String r3 = r3.d
            goto L_0x01dd
        L_0x01da:
            r3 = 0
            goto L_0x01dd
        L_0x01dc:
            r3 = 0
        L_0x01dd:
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x01ea
            r3 = r8
            r12 = r18
            r2 = 10
            goto L_0x0249
        L_0x01ea:
            boolean r3 = r9.equals(r12)
            if (r3 == 0) goto L_0x01f5
            r3 = r8
            r12 = r18
            r2 = 0
            goto L_0x0249
        L_0x01f5:
            java.lang.String r3 = "forum"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0203
            r3 = r8
            r12 = r18
            r2 = 11
            goto L_0x0249
        L_0x0203:
            if (r22 == 0) goto L_0x0211
            boolean r3 = r9.equals(r7)
            if (r3 == 0) goto L_0x0211
            r3 = r8
            r12 = r18
            r2 = 10
            goto L_0x0249
        L_0x0211:
            boolean r3 = defpackage.axor.c()
            if (r3 == 0) goto L_0x0220
            r3 = 4
            if (r2 != r3) goto L_0x0220
            r3 = r8
            r12 = r18
            r2 = 21
            goto L_0x0249
        L_0x0220:
            if (r22 == 0) goto L_0x0228
            r3 = r17
            r12 = r18
            r2 = -1
            goto L_0x0249
        L_0x0228:
            boolean r2 = r9.equals(r7)
            if (r2 != 0) goto L_0x0234
            r3 = r17
            r12 = r18
            r2 = -1
            goto L_0x0249
        L_0x0234:
            java.lang.String r2 = defpackage.axmj.w()
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0244
            r3 = r8
            r12 = r18
            r2 = 21
            goto L_0x0249
        L_0x0244:
            r3 = r17
            r12 = r18
            r2 = -1
        L_0x0249:
            boolean r4 = defpackage.axmj.n()
            if (r4 != 0) goto L_0x0252
            r8 = r3
            r3 = 1
            goto L_0x0283
        L_0x0252:
            java.lang.String r4 = "thread"
            boolean r4 = android.text.TextUtils.equals(r4, r9)
            if (r4 == 0) goto L_0x026a
            java.lang.String r2 = "new"
            boolean r2 = android.text.TextUtils.equals(r2, r8)
            if (r2 == 0) goto L_0x0266
            r2 = 17
            goto L_0x0268
        L_0x0266:
            r2 = 16
        L_0x0268:
            r3 = 0
            goto L_0x0283
        L_0x026a:
            java.lang.String r4 = "profile"
            boolean r4 = android.text.TextUtils.equals(r4, r9)
            if (r4 == 0) goto L_0x0277
            r2 = 18
            r3 = 0
            goto L_0x0283
        L_0x0277:
            boolean r4 = android.text.TextUtils.equals(r10, r9)
            if (r4 == 0) goto L_0x0281
            r2 = 20
            r3 = 0
            goto L_0x0283
        L_0x0281:
            r8 = r3
            r3 = 1
        L_0x0283:
            int r13 = r13 + -2
            r4 = 0
            java.util.List r6 = r6.subList(r4, r13)
            java.lang.String r4 = android.text.TextUtils.join(r14, r6)
            r15 = r3
            r3 = r12
            r6 = r18
            r12 = r8
        L_0x0293:
            boolean r7 = android.text.TextUtils.isEmpty(r12)
            if (r7 == 0) goto L_0x02ae
            boolean r7 = defpackage.axmj.n()
            if (r7 != 0) goto L_0x02a2
            r3 = 0
            goto L_0x0350
        L_0x02a2:
            r7 = 19
            if (r2 != r7) goto L_0x02a7
            goto L_0x02ae
        L_0x02a7:
            r7 = 20
            if (r2 == r7) goto L_0x02ae
            r3 = 0
            goto L_0x0350
        L_0x02ae:
            if (r2 == 0) goto L_0x02e4
            r7 = 1
            if (r2 == r7) goto L_0x02e1
            r7 = 10
            if (r2 == r7) goto L_0x02de
            r7 = 11
            if (r2 == r7) goto L_0x02db
            r7 = 21
            if (r2 == r7) goto L_0x02de
            boolean r7 = defpackage.axmj.n()     // Catch:{ IllegalStateException -> 0x034a }
            if (r7 != 0) goto L_0x02c7
            r7 = 0
            goto L_0x02e6
        L_0x02c7:
            switch(r2) {
                case 16: goto L_0x02d8;
                case 17: goto L_0x02d5;
                case 18: goto L_0x02d2;
                case 19: goto L_0x02cf;
                case 20: goto L_0x02cc;
                default: goto L_0x02ca;
            }     // Catch:{ IllegalStateException -> 0x034a }
        L_0x02ca:
            r7 = 0
            goto L_0x02e6
        L_0x02cc:
            nzh r7 = defpackage.nzh.n     // Catch:{ IllegalStateException -> 0x034a }
            goto L_0x02e6
        L_0x02cf:
            nzh r7 = defpackage.nzh.m     // Catch:{ IllegalStateException -> 0x034a }
            goto L_0x02e6
        L_0x02d2:
            nzh r7 = defpackage.nzh.l     // Catch:{ IllegalStateException -> 0x034a }
            goto L_0x02e6
        L_0x02d5:
            nzh r7 = defpackage.nzh.k     // Catch:{ IllegalStateException -> 0x034a }
            goto L_0x02e6
        L_0x02d8:
            nzh r7 = defpackage.nzh.j     // Catch:{ IllegalStateException -> 0x034a }
            goto L_0x02e6
        L_0x02db:
            nzh r7 = defpackage.nzh.i     // Catch:{ IllegalStateException -> 0x034a }
            goto L_0x02e6
        L_0x02de:
            nzh r7 = defpackage.nzh.h     // Catch:{ IllegalStateException -> 0x034a }
            goto L_0x02e6
        L_0x02e1:
            nzh r7 = defpackage.nzh.f     // Catch:{ IllegalStateException -> 0x034a }
            goto L_0x02e6
        L_0x02e4:
            nzh r7 = defpackage.nzh.g     // Catch:{ IllegalStateException -> 0x034a }
        L_0x02e6:
            if (r7 == 0) goto L_0x0344
            java.lang.String r7 = r1.a((defpackage.nzh) r7)     // Catch:{ IllegalStateException -> 0x034a }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x034a }
            if (r8 != 0) goto L_0x033e
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IllegalStateException -> 0x034a }
            r9 = 0
            r8[r9] = r4     // Catch:{ IllegalStateException -> 0x034a }
            r9 = 1
            r8[r9] = r12     // Catch:{ IllegalStateException -> 0x034a }
            r9 = 2
            r8[r9] = r5     // Catch:{ IllegalStateException -> 0x034a }
            java.lang.String r5 = java.lang.String.format(r7, r8)     // Catch:{ IllegalStateException -> 0x034a }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x034a }
            if (r7 == 0) goto L_0x0309
        L_0x0308:
            goto L_0x0319
        L_0x0309:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x034a }
            if (r7 != 0) goto L_0x0308
            java.lang.String r7 = "extra_params"
            java.lang.String r3 = c(r3, r6)     // Catch:{ IllegalStateException -> 0x034a }
            java.lang.String r5 = defpackage.oau.a(r5, r7, r3)     // Catch:{ IllegalStateException -> 0x034a }
        L_0x0319:
            java.lang.String r1 = a((java.lang.String) r5, (com.google.android.gms.googlehelp.common.HelpConfig) r1)     // Catch:{ IllegalStateException -> 0x034a }
            oaa r3 = new oaa
            r3.<init>()
            r3.a = r12
            r3.b = r2
            r3.e = r0
            r3.f = r1
            r3.o = r15
            boolean r0 = defpackage.axpp.b()
            boolean r0 = defpackage.ofq.b(r0)
            if (r0 != 0) goto L_0x0337
            goto L_0x0339
        L_0x0337:
            r3.p = r4
        L_0x0339:
            oab r3 = r3.a()
            goto L_0x0350
        L_0x033e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x034a }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x034a }
            throw r0     // Catch:{ IllegalStateException -> 0x034a }
        L_0x0344:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x034a }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x034a }
            throw r0     // Catch:{ IllegalStateException -> 0x034a }
        L_0x034a:
            r0 = move-exception
            r3 = 0
            goto L_0x0350
        L_0x034d:
            r3 = 0
            goto L_0x0350
        L_0x034f:
            r3 = 0
        L_0x0350:
            return r3
        L_0x0351:
            r0 = move-exception
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oab.a(java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, boolean, int):oab");
    }

    public static oab a(String str, String str2, String str3) {
        oaa oaa = new oaa();
        oaa.a = str3;
        oaa.b = 7;
        oaa.c = str;
        oaa.d = str2;
        oaa.e = str3;
        return oaa.a();
    }

    public static oab a(String str, String str2, String str3, String str4) {
        oaa oaa = new oaa();
        oaa.a = str3;
        oaa.b = 8;
        oaa.c = str;
        oaa.d = str2;
        oaa.g = str3;
        oaa.e = str4;
        return oaa.a();
    }

    public static oab a(String str, String str2, String str3, String str4, String str5) {
        oaa oaa = new oaa();
        oaa.b = 14;
        oaa.a = str;
        oaa.c = str2;
        oaa.e = str3;
        oaa.d = str4;
        oaa.j = str5;
        return oaa.a();
    }

    public static oab a(String str, String str2, String str3, String str4, String str5, avna avna, int i2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            return null;
        }
        if ((avna != avna.PROMOTION_PLACEMENT_TOP && avna != avna.PROMOTION_PLACEMENT_BOTTOM) || i2 < 2) {
            return null;
        }
        oaa oaa = new oaa();
        oaa.a = "promotion_help_response_id_stub";
        oaa.b = 13;
        oaa.c = str;
        oaa.d = str2;
        oaa.e = str3;
        oaa.b();
        oaa.m = str4;
        oaa.n = str5;
        iva.a((Object) avna);
        oaa.q = avna;
        oaa.r = i2;
        return oaa.a();
    }

    public static oab a(String str, String str2, String str3, String str4, String str5, String str6, long j2) {
        oaa oaa = new oaa();
        oaa.a = str;
        oaa.b = 1;
        oaa.c = str2;
        oaa.d = str3;
        oaa.e = str4;
        oaa.f = str5;
        oaa.j = str6;
        oaa.k = j2;
        return oaa.a();
    }

    public static oab a(String str, String str2, String str3, String str4, String str5, boolean z2) {
        oaa oaa = new oaa();
        oaa.a = str;
        oaa.b = 2;
        oaa.c = str2;
        oaa.d = str4;
        oaa.e = str3;
        oaa.j = str5;
        oaa.o = z2;
        return oaa.a();
    }

    public static oab a(String str, boolean z2) {
        oaa oaa = new oaa();
        oaa.a = str;
        oaa.b = 0;
        oaa.l = z2;
        return oaa.a();
    }

    public static oab a(JSONObject jSONObject, oab oab) {
        int i2;
        String str;
        boolean z2;
        String str2;
        String str3;
        if (!jSONObject.has("html")) {
            return null;
        }
        String string = jSONObject.has("etag") ? jSONObject.getString("etag") : jSONObject.has("fingerprint") ? jSONObject.getString("fingerprint") : "";
        String valueOf = String.valueOf(oab.b);
        String str4 = valueOf.length() == 0 ? new String("content_id:") : "content_id:".concat(valueOf);
        boolean z3 = oab.t;
        if (jSONObject.has("page_metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("page_metadata");
            if (jSONObject2.has("content_id")) {
                String string2 = jSONObject2.getString("content_id");
                if (!TextUtils.isEmpty(string2)) {
                    String valueOf2 = String.valueOf(string2);
                    str4 = valueOf2.length() == 0 ? new String("content_id:") : "content_id:".concat(valueOf2);
                    z3 = true;
                }
            }
            if (!ofq.b(axpp.d())) {
                i2 = 101;
                boolean z4 = z3;
                str = str4;
                z2 = z4;
            } else {
                if (jSONObject2.has("page_type")) {
                    int i3 = jSONObject2.getInt("page_type");
                    int[] iArr = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 101};
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 35) {
                            i2 = 101;
                            break;
                        }
                        i2 = iArr[i4];
                        int i5 = i2 - 1;
                        if (i2 != 0) {
                            if (i5 == i3) {
                                break;
                            }
                            i4++;
                        } else {
                            throw null;
                        }
                    }
                } else {
                    i2 = 101;
                }
                boolean z5 = z3;
                str = str4;
                z2 = z5;
            }
        } else {
            i2 = 101;
            boolean z6 = z3;
            str = str4;
            z2 = z6;
        }
        if (ofq.b(axpp.d()) && i2 != 101) {
            if (jSONObject.has("title")) {
                str3 = jSONObject.getString("title");
            } else {
                str3 = oab.d;
            }
            String str5 = oab.e;
            String string3 = jSONObject.getString("html");
            oaa oaa = new oaa();
            oaa.a = str;
            oaa.b = 2;
            oaa.c = str3;
            oaa.d = string3;
            oaa.e = str5;
            oaa.j = string;
            oaa.s = i2;
            oaa.o = z2;
            return oaa.a();
        }
        if (jSONObject.has("title")) {
            str2 = jSONObject.getString("title");
        } else {
            str2 = oab.d;
        }
        return a(str, str2, oab.e, jSONObject.getString("html"), string, z2);
    }

    public final void a(oab oab) {
        this.s.add(oab.b);
        oab.A = this.b;
    }
}
