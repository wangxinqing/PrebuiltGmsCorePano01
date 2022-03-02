package defpackage;

import android.content.ContentValues;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: xzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xzx implements Comparator {
    static final Set a = new HashSet();
    static final String[] b = new String[0];
    static final String[] c = {"data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "group_sourceid", "data_sync1", "data_sync2", "data_sync3", "is_primary"};
    static final anaf d;
    private static final xzx e = new xzx(true);
    private static final xzx f = new xzx(false);
    private static final Map g = new HashMap();
    private final boolean h;

    static {
        anab h2 = anaf.h();
        h2.a("data1", xkf.DATA1);
        h2.a("data2", xkf.DATA2);
        h2.a("data3", xkf.DATA3);
        h2.a("data4", xkf.DATA4);
        h2.a("data5", xkf.DATA5);
        h2.a("data6", xkf.DATA6);
        h2.a("data7", xkf.DATA7);
        h2.a("data8", xkf.DATA8);
        h2.a("data9", xkf.DATA9);
        h2.a("data10", xkf.DATA10);
        h2.a("data11", xkf.DATA11);
        h2.a("data12", xkf.DATA12);
        h2.a("data13", xkf.DATA13);
        h2.a("data14", xkf.DATA14);
        h2.a("data15", xkf.DATA15);
        h2.a("data_sync1", xkf.SYNC1);
        h2.a("data_sync2", xkf.SYNC2);
        h2.a("data_sync3", xkf.SYNC3);
        h2.a("group_sourceid", xkf.GROUP_SOURCE_ID);
        h2.a("is_primary", xkf.IS_PRIMARY);
        d = h2.a();
    }

    private xzx(boolean z) {
        this.h = z;
    }

    private static int a(ContentValues contentValues, ContentValues contentValues2, String[] strArr, Set set) {
        int a2;
        for (String str : strArr) {
            if (a(str, set) && (a2 = a(str, contentValues, contentValues2)) != 0) {
                return a2;
            }
        }
        return 0;
    }

    public static xzx a(boolean z) {
        return !z ? f : e;
    }

    private static int a(String str, ContentValues contentValues, ContentValues contentValues2) {
        String asString = contentValues.getAsString(str);
        String asString2 = contentValues2.getAsString(str);
        if ("null".equals(asString)) {
            asString = null;
        }
        if ("null".equals(asString2)) {
            asString2 = null;
        }
        if (asString == null && asString2 == null) {
            return 0;
        }
        if (asString == null) {
            return -1;
        }
        if (asString2 != null) {
            return asString.compareToIgnoreCase(asString2);
        }
        return 1;
    }

    public static amri a(List list, List list2) {
        amri amri;
        amri amri2;
        Collections.sort(list, e);
        Collections.sort(list2, e);
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            ContentValues contentValues2 = (ContentValues) it2.next();
            if (contentValues == null || contentValues2 == null) {
                throw new IllegalStateException("Either apiDataItem or localDataItem cannot be null");
            }
            int a2 = a("mimetype", contentValues, contentValues2);
            if (a2 != 0) {
                contentValues.getAsString("mimetype");
                contentValues2.getAsString("mimetype");
                amri = a2 < 0 ? amri.b(yay.a(wsp.a(contentValues), xkf.ONLY_EXIST_IN_SERVER)) : amri.b(yay.a(wsp.a(contentValues2), xkf.ONLY_EXIST_IN_LOCAL));
            } else {
                String asString = contentValues.getAsString("mimetype");
                xzy xzy = (xzy) g.get(asString);
                if (xzy == null) {
                    xzy = a(asString);
                    g.put(asString, xzy);
                }
                Set a3 = xzy.a();
                String[] c2 = xzy.c();
                int length = c2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        amri2 = ampu.a;
                        break;
                    }
                    String str = c2[i];
                    if (a(str, a3) && a(str, contentValues, contentValues2) != 0) {
                        amri2 = amri.b((xkf) d.getOrDefault(str, xkf.UNKNOWN));
                        break;
                    }
                    i++;
                }
                if (amri2.a()) {
                    ((xkf) amri2.b()).name();
                }
                amri = amri2.a() ? amri.b(yay.a(wsp.a(contentValues), (xkf) amri2.b())) : ampu.a;
            }
            if (amri.a()) {
                return amri;
            }
        }
        if (it.hasNext()) {
            return amri.b(yay.a(wsp.a((ContentValues) it.next()), xkf.ONLY_EXIST_IN_SERVER));
        }
        return it2.hasNext() ? amri.b(yay.a(wsp.a((ContentValues) it2.next()), xkf.ONLY_EXIST_IN_LOCAL)) : ampu.a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.xzy a(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -1729791444: goto L_0x010c;
                case -1569536764: goto L_0x0102;
                case -1328682538: goto L_0x00f8;
                case -1207225626: goto L_0x00ed;
                case -1079224304: goto L_0x00e2;
                case -1079210633: goto L_0x00d8;
                case -828105739: goto L_0x00cd;
                case -601229436: goto L_0x00c2;
                case -335220302: goto L_0x00b7;
                case 3430506: goto L_0x00ac;
                case 94070761: goto L_0x00a0;
                case 456415478: goto L_0x0094;
                case 684173810: goto L_0x0088;
                case 689862072: goto L_0x007d;
                case 905843021: goto L_0x0071;
                case 950831081: goto L_0x0066;
                case 1238509849: goto L_0x005a;
                case 1332665825: goto L_0x004e;
                case 1409846529: goto L_0x0042;
                case 1464444786: goto L_0x0036;
                case 1464725403: goto L_0x002b;
                case 1635852198: goto L_0x001f;
                case 1828520899: goto L_0x0014;
                case 2034973555: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0117
        L_0x0009:
            java.lang.String r0 = "vnd.android.cursor.item/nickname"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 5
            goto L_0x0118
        L_0x0014:
            java.lang.String r0 = "vnd.android.cursor.item/identity"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 3
            goto L_0x0118
        L_0x001f:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_jot"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 19
            goto L_0x0118
        L_0x002b:
            java.lang.String r0 = "vnd.android.cursor.item/group_membership"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 2
            goto L_0x0118
        L_0x0036:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_calendar_link"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 15
            goto L_0x0118
        L_0x0042:
            java.lang.String r0 = "vnd.android.cursor.item/relation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 10
            goto L_0x0118
        L_0x004e:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_language"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 20
            goto L_0x0118
        L_0x005a:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_user_defined_field"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 22
            goto L_0x0118
        L_0x0066:
            java.lang.String r0 = "vnd.android.cursor.item/im"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 4
            goto L_0x0118
        L_0x0071:
            java.lang.String r0 = "vnd.android.cursor.item/photo"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 9
            goto L_0x0118
        L_0x007d:
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 7
            goto L_0x0118
        L_0x0088:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 8
            goto L_0x0118
        L_0x0094:
            java.lang.String r0 = "vnd.android.cursor.item/website"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 14
            goto L_0x0118
        L_0x00a0:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_hobby"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 18
            goto L_0x0118
        L_0x00ac:
            java.lang.String r0 = "vnd.android.cursor.item/sip_address"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 11
            goto L_0x0118
        L_0x00b7:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_extended_property"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 16
            goto L_0x0118
        L_0x00c2:
            java.lang.String r0 = "vnd.android.cursor.item/postal-address_v2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 13
            goto L_0x0118
        L_0x00cd:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_misc"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 21
            goto L_0x0118
        L_0x00d8:
            java.lang.String r0 = "vnd.android.cursor.item/note"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 6
            goto L_0x0118
        L_0x00e2:
            java.lang.String r0 = "vnd.android.cursor.item/name"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 12
            goto L_0x0118
        L_0x00ed:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_external_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 17
            goto L_0x0118
        L_0x00f8:
            java.lang.String r0 = "vnd.android.cursor.item/contact_event"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 1
            goto L_0x0118
        L_0x0102:
            java.lang.String r0 = "vnd.android.cursor.item/email_v2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 0
            goto L_0x0118
        L_0x010c:
            java.lang.String r0 = "vnd.com.google.cursor.item/contact_file_as"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 23
            goto L_0x0118
        L_0x0117:
            r0 = -1
        L_0x0118:
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01b4;
                case 2: goto L_0x01ae;
                case 3: goto L_0x01a8;
                case 4: goto L_0x01a2;
                case 5: goto L_0x019c;
                case 6: goto L_0x0196;
                case 7: goto L_0x0190;
                case 8: goto L_0x018a;
                case 9: goto L_0x0184;
                case 10: goto L_0x017e;
                case 11: goto L_0x0178;
                case 12: goto L_0x0172;
                case 13: goto L_0x016c;
                case 14: goto L_0x0166;
                case 15: goto L_0x0160;
                case 16: goto L_0x015a;
                case 17: goto L_0x0154;
                case 18: goto L_0x014e;
                case 19: goto L_0x0148;
                case 20: goto L_0x0142;
                case 21: goto L_0x013c;
                case 22: goto L_0x0136;
                case 23: goto L_0x0130;
                default: goto L_0x011b;
            }
        L_0x011b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "No matcher found for "
            int r2 = r3.length()
            if (r2 != 0) goto L_0x01c0
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            goto L_0x01c4
        L_0x0130:
            xze r3 = new xze
            r3.<init>()
            return r3
        L_0x0136:
            xzv r3 = new xzv
            r3.<init>()
            return r3
        L_0x013c:
            xzl r3 = new xzl
            r3.<init>()
            return r3
        L_0x0142:
            xzk r3 = new xzk
            r3.<init>()
            return r3
        L_0x0148:
            xzj r3 = new xzj
            r3.<init>()
            return r3
        L_0x014e:
            xzg r3 = new xzg
            r3.<init>()
            return r3
        L_0x0154:
            xzd r3 = new xzd
            r3.<init>()
            return r3
        L_0x015a:
            xzc r3 = new xzc
            r3.<init>()
            return r3
        L_0x0160:
            xyz r3 = new xyz
            r3.<init>()
            return r3
        L_0x0166:
            xzw r3 = new xzw
            r3.<init>()
            return r3
        L_0x016c:
            xzs r3 = new xzs
            r3.<init>()
            return r3
        L_0x0172:
            xzm r3 = new xzm
            r3.<init>()
            return r3
        L_0x0178:
            xzu r3 = new xzu
            r3.<init>()
            return r3
        L_0x017e:
            xzt r3 = new xzt
            r3.<init>()
            return r3
        L_0x0184:
            xzr r3 = new xzr
            r3.<init>()
            return r3
        L_0x018a:
            xzq r3 = new xzq
            r3.<init>()
            return r3
        L_0x0190:
            xzp r3 = new xzp
            r3.<init>()
            return r3
        L_0x0196:
            xzo r3 = new xzo
            r3.<init>()
            return r3
        L_0x019c:
            xzn r3 = new xzn
            r3.<init>()
            return r3
        L_0x01a2:
            xzi r3 = new xzi
            r3.<init>()
            return r3
        L_0x01a8:
            xzh r3 = new xzh
            r3.<init>()
            return r3
        L_0x01ae:
            xzf r3 = new xzf
            r3.<init>()
            return r3
        L_0x01b4:
            xzb r3 = new xzb
            r3.<init>()
            return r3
        L_0x01ba:
            xza r3 = new xza
            r3.<init>()
            return r3
        L_0x01c0:
            java.lang.String r3 = r1.concat(r3)
        L_0x01c4:
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzx.a(java.lang.String):xzy");
    }

    private static boolean a(String str, Set set) {
        return !set.contains(str);
    }

    /* renamed from: a */
    public final int compare(ContentValues contentValues, ContentValues contentValues2) {
        if (contentValues == null || contentValues2 == null) {
            throw new IllegalStateException("Either apiDataItem or localDataItem cannot be null");
        }
        int a2 = a("mimetype", contentValues, contentValues2);
        if (a2 != 0) {
            contentValues.getAsString("mimetype");
            contentValues2.getAsString("mimetype");
            return a2;
        }
        String asString = contentValues.getAsString("mimetype");
        xzy xzy = (xzy) g.get(asString);
        if (xzy == null) {
            xzy = a(asString);
            g.put(asString, xzy);
        }
        if (!this.h) {
            return a(contentValues, contentValues2, xzy.b(), a);
        }
        return a(contentValues, contentValues2, xzy.c(), xzy.a());
    }
}
