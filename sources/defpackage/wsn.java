package defpackage;

import android.content.ContentValues;
import android.util.Log;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: wsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wsn {
    public static final wsn a = new wsn();
    private static final anaf b = anaf.a("home", 1, "work", 2, "other", 3);
    private final Map c;

    private wsn() {
        anab h = anaf.h();
        h.a(amey.class, new wrp());
        h.a(amez.class, new wrq());
        h.a(amfa.class, new wrr());
        h.a(amfb.class, new wrs());
        h.a(amfm.class, new wrw());
        h.a(amfn.class, new wrx());
        h.a(amfo.class, new wry());
        h.a(amfs.class, new wrz());
        h.a(amfv.class, new wsa());
        h.a(amfw.class, new wsb());
        h.a(amfx.class, new wsc());
        h.a(amfy.class, new wsd());
        h.a(amfd.class, new wrt());
        h.a(amfz.class, new wse());
        h.a(amgc.class, new wsf());
        h.a(amgg.class, new wsg());
        h.a(amgo.class, new wsh());
        h.a(amgp.class, new wsi());
        h.a(amgs.class, new wsj());
        h.a(amgt.class, new wsk());
        h.a(amgv.class, new wsl());
        h.a(amgw.class, new wsm());
        this.c = new HashMap(h.a());
    }

    public static long a(long j) {
        if (j == 0) {
            return 1;
        }
        return j;
    }

    static String b(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setTimeInMillis(j);
        int i = 0;
        int i2 = gregorianCalendar.get(0);
        int i3 = gregorianCalendar.get(1);
        if (i2 != 0) {
            i = i3;
        }
        int i4 = gregorianCalendar.get(2);
        int i5 = gregorianCalendar.get(5);
        DecimalFormat decimalFormat = new DecimalFormat("0000");
        DecimalFormat decimalFormat2 = new DecimalFormat("00");
        String format = decimalFormat.format((long) i);
        String format2 = decimalFormat2.format((long) (i4 + 1));
        String format3 = decimalFormat2.format((long) i5);
        int length = String.valueOf(format).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(format2).length() + String.valueOf(format3).length());
        sb.append(format);
        sb.append("-");
        sb.append(format2);
        sb.append("-");
        sb.append(format3);
        return sb.toString();
    }

    public static String c(String str) {
        if (str != null) {
            return str.matches("--[0-2][0-9]-[0-3][0-9]") ? str.replace("--", "0000-") : str;
        }
        return null;
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("0000-[0-2][0-9]-[0-3][0-9]")) {
            return str;
        }
        String valueOf = String.valueOf(str.substring(5));
        return valueOf.length() == 0 ? new String("--") : "--".concat(valueOf);
    }

    public static Long e(String str) {
        int i;
        List c2 = amsk.a('-').c(str);
        if (c2.size() != 3) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt((String) c2.get(0));
            int parseInt2 = Integer.parseInt((String) c2.get(1)) - 1;
            int parseInt3 = Integer.parseInt((String) c2.get(2));
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
            if (parseInt == 0) {
                gregorianCalendar.set(0, 0);
                i = 1;
            } else {
                i = parseInt;
            }
            gregorianCalendar.set(i, parseInt2, parseInt3, 0, 0, 0);
            gregorianCalendar.set(14, 0);
            return Long.valueOf(gregorianCalendar.getTimeInMillis());
        } catch (NumberFormatException e) {
            xdt.b("FSA2_DataTypeConverters", "NumberFormatException when converting date %s to ms", str);
            return null;
        }
    }

    public static amgl f(String str) {
        aucd o = amgl.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgl amgl = (amgl) o.b;
        amgl.c = 2;
        int i = amgl.a | 4;
        amgl.a = i;
        if (str != null) {
            str.getClass();
            amgl.a = i | 16;
            amgl.d = str;
        }
        return (amgl) o.i();
    }

    public static amgl a(String str, boolean z) {
        amgl f = f(str);
        aucd aucd = (aucd) f.c(5);
        aucd.a((aucj) f);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amgl amgl = (amgl) aucd.b;
        amgl amgl2 = amgl.h;
        amgl.a |= 2048;
        amgl.g = z;
        return (amgl) aucd.i();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011b, code lost:
        if (r1.equals("vnd.android.cursor.item/email_v2") != false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List c(java.util.List r4, java.lang.String r5) {
        /*
            r3 = this;
            boolean r0 = defpackage.ycm.a((java.util.Collection) r4)
            if (r0 != 0) goto L_0x017d
            r0 = 0
            java.lang.Object r1 = r4.get(r0)
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            java.lang.String r2 = "mimetype"
            java.lang.String r1 = r1.getAsString(r2)
            int r2 = r1.hashCode()
            switch(r2) {
                case -1729791444: goto L_0x011e;
                case -1569536764: goto L_0x0115;
                case -1328682538: goto L_0x010b;
                case -1207225626: goto L_0x0100;
                case -1079224304: goto L_0x00f5;
                case -1079210633: goto L_0x00eb;
                case -828105739: goto L_0x00e0;
                case -601229436: goto L_0x00d5;
                case -335220302: goto L_0x00ca;
                case 3430506: goto L_0x00bf;
                case 94070761: goto L_0x00b3;
                case 456415478: goto L_0x00a7;
                case 684173810: goto L_0x009c;
                case 689862072: goto L_0x0091;
                case 905843021: goto L_0x0085;
                case 950831081: goto L_0x007a;
                case 1238509849: goto L_0x006e;
                case 1332665825: goto L_0x0062;
                case 1409846529: goto L_0x0056;
                case 1464444786: goto L_0x004a;
                case 1464725403: goto L_0x003f;
                case 1635852198: goto L_0x0033;
                case 1828520899: goto L_0x0027;
                case 2034973555: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0129
        L_0x001c:
            java.lang.String r0 = "vnd.android.cursor.item/nickname"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 4
            goto L_0x012a
        L_0x0027:
            java.lang.String r0 = "vnd.android.cursor.item/identity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 20
            goto L_0x012a
        L_0x0033:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_jot"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 22
            goto L_0x012a
        L_0x003f:
            java.lang.String r0 = "vnd.android.cursor.item/group_membership"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 2
            goto L_0x012a
        L_0x004a:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_calendar_link"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 14
            goto L_0x012a
        L_0x0056:
            java.lang.String r0 = "vnd.android.cursor.item/relation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 9
            goto L_0x012a
        L_0x0062:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_language"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 19
            goto L_0x012a
        L_0x006e:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_user_defined_field"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 16
            goto L_0x012a
        L_0x007a:
            java.lang.String r0 = "vnd.android.cursor.item/im"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 3
            goto L_0x012a
        L_0x0085:
            java.lang.String r0 = "vnd.android.cursor.item/photo"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 8
            goto L_0x012a
        L_0x0091:
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 6
            goto L_0x012a
        L_0x009c:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 7
            goto L_0x012a
        L_0x00a7:
            java.lang.String r0 = "vnd.android.cursor.item/website"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 13
            goto L_0x012a
        L_0x00b3:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_hobby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 15
            goto L_0x012a
        L_0x00bf:
            java.lang.String r0 = "vnd.android.cursor.item/sip_address"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 10
            goto L_0x012a
        L_0x00ca:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_extended_property"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 21
            goto L_0x012a
        L_0x00d5:
            java.lang.String r0 = "vnd.android.cursor.item/postal-address_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 12
            goto L_0x012a
        L_0x00e0:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_misc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 23
            goto L_0x012a
        L_0x00eb:
            java.lang.String r0 = "vnd.android.cursor.item/note"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 5
            goto L_0x012a
        L_0x00f5:
            java.lang.String r0 = "vnd.android.cursor.item/name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 11
            goto L_0x012a
        L_0x0100:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_external_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 18
            goto L_0x012a
        L_0x010b:
            java.lang.String r0 = "vnd.android.cursor.item/contact_event"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 1
            goto L_0x012a
        L_0x0115:
            java.lang.String r2 = "vnd.android.cursor.item/email_v2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0129
            goto L_0x012a
        L_0x011e:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_file_as"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0129
            r0 = 17
            goto L_0x012a
        L_0x0129:
            r0 = -1
        L_0x012a:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x016f;
                case 1: goto L_0x0166;
                case 2: goto L_0x0163;
                case 3: goto L_0x0160;
                case 4: goto L_0x015d;
                case 5: goto L_0x015a;
                case 6: goto L_0x0157;
                case 7: goto L_0x0154;
                case 8: goto L_0x0151;
                case 9: goto L_0x014e;
                case 10: goto L_0x014b;
                case 11: goto L_0x0148;
                case 12: goto L_0x0145;
                case 13: goto L_0x0142;
                case 14: goto L_0x013f;
                case 15: goto L_0x013c;
                case 16: goto L_0x0139;
                case 17: goto L_0x0136;
                case 18: goto L_0x0133;
                case 19: goto L_0x0130;
                case 20: goto L_0x012f;
                case 21: goto L_0x012f;
                case 22: goto L_0x012f;
                case 23: goto L_0x012f;
                default: goto L_0x012e;
            }
        L_0x012e:
            goto L_0x0171
        L_0x012f:
            goto L_0x0171
        L_0x0130:
            java.lang.Class<amfx> r1 = defpackage.amfx.class
            goto L_0x0171
        L_0x0133:
            java.lang.Class<amfo> r1 = defpackage.amfo.class
            goto L_0x0171
        L_0x0136:
            java.lang.Class<amfs> r1 = defpackage.amfs.class
            goto L_0x0171
        L_0x0139:
            java.lang.Class<amgv> r1 = defpackage.amgv.class
            goto L_0x0171
        L_0x013c:
            java.lang.Class<amfw> r1 = defpackage.amfw.class
            goto L_0x0171
        L_0x013f:
            java.lang.Class<amfb> r1 = defpackage.amfb.class
            goto L_0x0171
        L_0x0142:
            java.lang.Class<amgw> r1 = defpackage.amgw.class
            goto L_0x0171
        L_0x0145:
            java.lang.Class<amez> r1 = defpackage.amez.class
            goto L_0x0171
        L_0x0148:
            java.lang.Class<amfz> r1 = defpackage.amfz.class
            goto L_0x0171
        L_0x014b:
            java.lang.Class<amgt> r1 = defpackage.amgt.class
            goto L_0x0171
        L_0x014e:
            java.lang.Class<amgs> r1 = defpackage.amgs.class
            goto L_0x0171
        L_0x0151:
            java.lang.Class<amgp> r1 = defpackage.amgp.class
            goto L_0x0171
        L_0x0154:
            java.lang.Class<amgo> r1 = defpackage.amgo.class
            goto L_0x0171
        L_0x0157:
            java.lang.Class<amgg> r1 = defpackage.amgg.class
            goto L_0x0171
        L_0x015a:
            java.lang.Class<amey> r1 = defpackage.amey.class
            goto L_0x0171
        L_0x015d:
            java.lang.Class<amgc> r1 = defpackage.amgc.class
            goto L_0x0171
        L_0x0160:
            java.lang.Class<amfv> r1 = defpackage.amfv.class
            goto L_0x0171
        L_0x0163:
            java.lang.Class<amfy> r1 = defpackage.amfy.class
            goto L_0x0171
        L_0x0166:
            java.lang.String r0 = "FSA2_DataTypeConverters"
            java.lang.String r2 = "@getDataType: Use either fromCp2Events or fromCp2Birthdays"
            android.util.Log.w(r0, r2)
            goto L_0x0171
        L_0x016f:
            java.lang.Class<amfm> r1 = defpackage.amfm.class
        L_0x0171:
            if (r1 != 0) goto L_0x0174
            goto L_0x017d
        L_0x0174:
            wru r0 = r3.a((java.lang.Class) r1)
            java.util.List r4 = a((java.util.List) r4, (java.lang.String) r5, (defpackage.wru) r0)
            return r4
        L_0x017d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsn.c(java.util.List, java.lang.String):java.util.List");
    }

    public static Integer a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString(str);
        if (asString == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(asString));
        } catch (NumberFormatException e) {
            xdt.a("FSA2_DataTypeConverters", "Failed to parse {rawType=%s}", (Object) asString);
            return null;
        }
    }

    public static List b(List list, String str) {
        ContentValues contentValues;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            amfm amfm = (amfm) list.get(i);
            if (amfm != null) {
                amgl amgl = amfm.b;
                if (amgl == null) {
                    amgl = amgl.h;
                }
                if (a(amgl, str, 2)) {
                    boolean z = amgl.g;
                    wrv a2 = a(amfm.d, (Map) b, (Integer) 0);
                    contentValues = wso.a(a2.a.intValue(), amfm.c, amfm.e, a2.b, z);
                } else {
                    contentValues = null;
                }
                if (contentValues != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(contentValues);
                }
            }
        }
        return arrayList;
    }

    public static String a(Integer num, String str, Map map, Integer num2) {
        if (num != null) {
            return !num.equals(num2) ? (String) map.get(num) : str;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r8.equals("vnd.android.cursor.item/phone_v2") == false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(defpackage.amgl r7, java.lang.String r8, java.lang.String r9, java.util.List r10) {
        /*
            if (r7 == 0) goto L_0x00f8
            aucx r7 = r7.f
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00f8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
            r3 = 0
        L_0x0015:
            r4 = 2
            if (r3 >= r1) goto L_0x005a
            java.lang.Object r5 = r7.get(r3)
            amfl r5 = (defpackage.amfl) r5
            if (r5 == 0) goto L_0x0057
            int r6 = r5.b
            int r6 = defpackage.amff.a(r6)
            if (r6 != 0) goto L_0x0029
        L_0x0028:
            goto L_0x0057
        L_0x0029:
            if (r6 != r4) goto L_0x0028
            int r4 = r5.a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0028
            amgx r4 = r5.c
            if (r4 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            amgx r4 = defpackage.amgx.b
        L_0x0038:
            java.lang.String r4 = r4.a
            java.lang.String r4 = defpackage.ycm.m(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "gprofile:"
            int r6 = r4.length()
            if (r6 != 0) goto L_0x0050
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
            goto L_0x0054
        L_0x0050:
            java.lang.String r4 = r5.concat(r4)
        L_0x0054:
            r0.add(r4)
        L_0x0057:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x005a:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L_0x00f8
            java.lang.String r7 = ","
            java.lang.String r7 = android.text.TextUtils.join(r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 != 0) goto L_0x00e7
            int r0 = r8.hashCode()
            r3 = -1569536764(0xffffffffa272c504, float:-3.2901415E-18)
            r5 = 1
            if (r0 == r3) goto L_0x0095
            r3 = 456415478(0x1b3458f6, float:1.4917996E-22)
            if (r0 == r3) goto L_0x008b
            r3 = 684173810(0x28c7a9f2, float:2.216714E-14)
            if (r0 == r3) goto L_0x0082
            goto L_0x009f
        L_0x0082:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x008b:
            java.lang.String r0 = "vnd.android.cursor.item/website"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x009f
            r2 = 2
            goto L_0x00a0
        L_0x0095:
            java.lang.String r0 = "vnd.android.cursor.item/email_v2"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x009f
            r2 = 1
            goto L_0x00a0
        L_0x009f:
            r2 = -1
        L_0x00a0:
            if (r2 == 0) goto L_0x00a7
            if (r2 == r5) goto L_0x00a7
            if (r2 == r4) goto L_0x00a7
            goto L_0x00e7
        L_0x00a7:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r0 = "mimetype"
            java.lang.String r2 = "vnd.android.cursor.item/identity"
            r1.put(r0, r2)
            java.lang.String r0 = "data1"
            r1.put(r0, r7)
            java.lang.String r7 = "data2"
            java.lang.String r0 = "com.google"
            r1.put(r7, r0)
            int r7 = r8.length()
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r7 = r7 + r5
            int r7 = r7 + r0
            r2.<init>(r7)
            r2.append(r8)
            java.lang.String r7 = " "
            r2.append(r7)
            r2.append(r9)
            java.lang.String r7 = r2.toString()
            java.lang.String r8 = "data_sync3"
            r1.put(r8, r7)
            goto L_0x00e8
        L_0x00e7:
        L_0x00e8:
            if (r1 != 0) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            if (r10 != 0) goto L_0x00f3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            goto L_0x00f4
        L_0x00f3:
        L_0x00f4:
            r10.add(r1)
            goto L_0x00f9
        L_0x00f8:
        L_0x00f9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsn.a(amgl, java.lang.String, java.lang.String, java.util.List):java.util.List");
    }

    public static boolean b(String str) {
        if (str != null) {
            return str.startsWith("--");
        }
        return false;
    }

    public static List a(List list, String str, wru wru) {
        ArrayList arrayList = new ArrayList();
        if (wru != null && !ycm.a((Collection) list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object a2 = wru.a((ContentValues) it.next(), str);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.util.List r5, java.lang.String r6, defpackage.wru r7, int r8) {
        /*
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        L_0x0006:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r5.next()
            if (r2 == 0) goto L_0x0006
            amgl r3 = r7.a(r2)
            if (r3 == 0) goto L_0x002e
            boolean r4 = a((defpackage.amgl) r3, (java.lang.String) r6, (int) r8)     // Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x002e
            boolean r3 = r3.g     // Catch:{ all -> 0x0025 }
            android.content.ContentValues r2 = r7.a((java.lang.Object) r2, (boolean) r3)     // Catch:{ all -> 0x0025 }
            goto L_0x002f
        L_0x0025:
            r2 = move-exception
            java.lang.String r3 = "FSA2_DataTypeConverters"
            java.lang.String r4 = "Failed to convert People-API data item"
            android.util.Log.e(r3, r4, r2)
            goto L_0x0006
        L_0x002e:
            r2 = r0
        L_0x002f:
            if (r2 == 0) goto L_0x0006
            if (r1 != 0) goto L_0x0038
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0038:
            r1.add(r2)
            goto L_0x0006
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsn.a(java.util.List, java.lang.String, wru, int):java.util.List");
    }

    public static Map a(Map map) {
        HashMap hashMap = new HashMap();
        for (Object next : map.keySet()) {
            hashMap.put(map.get(next), next);
        }
        return hashMap;
    }

    public static wrv a(String str, Map map, Integer num) {
        Integer num2 = (Integer) map.get(str);
        if (num2 != null) {
            str = "";
        }
        if (num2 != null) {
            num = num2;
        }
        return new wrv(num, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = defpackage.amff.a(r2.c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.amgl r2, java.lang.String r3) {
        /*
            if (r2 == 0) goto L_0x0017
            int r0 = r2.c
            int r0 = defpackage.amff.a(r0)
            if (r0 == 0) goto L_0x0017
            r1 = 3
            if (r0 != r1) goto L_0x0017
            java.lang.String r2 = r2.d
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0017
            r2 = 1
            return r2
        L_0x0017:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsn.a(amgl, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r3 = defpackage.amff.a(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r3 = defpackage.amff.a(r1.c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(defpackage.amgl r1, java.lang.String r2, int r3) {
        /*
            r0 = 3
            if (r3 == r0) goto L_0x002b
            if (r1 == 0) goto L_0x0011
            int r3 = r1.c
            int r3 = defpackage.amff.a(r3)
            if (r3 == 0) goto L_0x0011
            r0 = 2
            if (r3 != r0) goto L_0x0011
            goto L_0x001f
        L_0x0011:
            if (r1 == 0) goto L_0x0029
            int r3 = r1.c
            int r3 = defpackage.amff.a(r3)
            if (r3 == 0) goto L_0x0029
            r0 = 8
            if (r3 != r0) goto L_0x0029
        L_0x001f:
            java.lang.String r1 = r1.d
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            return r1
        L_0x0029:
            r1 = 0
            return r1
        L_0x002b:
            boolean r1 = a((defpackage.amgl) r1, (java.lang.String) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsn.a(amgl, java.lang.String, int):boolean");
    }

    public static boolean a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("is_primary");
        return asLong != null && asLong.longValue() > 0;
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.startsWith("0000-");
        }
        return false;
    }

    public final List a(List list, String str) {
        wru a2 = a((Class) list.get(0).getClass());
        if (a2 != null) {
            return a(list, str, a2, 2);
        }
        return null;
    }

    public final wru a(Class cls) {
        wru wru = (wru) this.c.get(cls);
        if (wru == null) {
            Log.e("FSA2_DataTypeConverters", "Missing converter, bailing out", new UnsupportedOperationException());
        }
        return wru;
    }
}
