package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: xvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvz extends xwa {
    private static final String[] b = {"data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "data_sync1", "data_sync2", "data_sync3", "data_sync4"};
    private final Set c;
    private final Set d;
    private int e = 0;

    private xvz(Cursor cursor, Set set, Set set2) {
        super(cursor);
        this.c = set;
        this.d = set2;
        this.a.moveToFirst();
    }

    public static xvz a(ContentResolver contentResolver, Account account, Set set, String str, String[] strArr) {
        String str2;
        Cursor query = contentResolver.query(xvw.a(ContactsContract.RawContactsEntity.CONTENT_URI, account), (String[]) null, str, strArr, (String) null);
        if (query != null) {
            if (xwb.a(contentResolver, account)) {
                str2 = xwb.c;
            } else {
                str2 = xwb.b;
            }
            List<xvu> a = xwb.a(contentResolver, account, str2);
            HashSet hashSet = new HashSet();
            for (xvu g : a) {
                hashSet.add(g.g());
            }
            return new xvz(query, set, hashSet);
        }
        Log.e("FSA2_ContactsCursor", "Failed to query CP2.");
        throw new xye(new RemoteException("Unable to query CP2."));
    }

    private final void b(ContentValues contentValues, String str) {
        Long b2 = b(str);
        if (b2 != null) {
            contentValues.put(str, b2);
        }
    }

    private final void a(ContentValues contentValues, String str) {
        String a = a(str);
        if (a != null) {
            contentValues.put(str, a);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02c8, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02c9, code lost:
        if (r5 != null) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02cb, code lost:
        defpackage.xdt.b("FSA2_ContactsCursor", "Error when adding data %s to Contact ID=%d", r2, java.lang.Long.valueOf(r3));
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0249 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xvs b() {
        /*
            r16 = this;
            r0 = r16
            android.database.Cursor r1 = r0.a
            boolean r1 = r1.isAfterLast()
            if (r1 != 0) goto L_0x02f2
            java.lang.String r1 = "_id"
            java.lang.Long r3 = r0.b(r1)
            long r3 = r3.longValue()
            java.lang.String r5 = "sourceid"
            java.lang.String r5 = r0.a(r5)
            xvr r6 = defpackage.xvs.a()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            defpackage.iva.a((java.lang.Object) r7)
            r6.e = r7
            r6.a = r5
            java.lang.String r7 = "version"
            java.lang.Long r7 = r0.b(r7)
            r6.f = r7
            java.lang.String r7 = "sync3"
            java.lang.Long r7 = r0.b(r7)
            r6.d = r7
            java.lang.String r7 = "sync2"
            if (r5 != 0) goto L_0x0044
            java.lang.String r5 = r0.a(r7)
            r6.c = r5
            goto L_0x004b
        L_0x0044:
            java.lang.String r5 = r0.a(r7)
            r6.b = r5
        L_0x004b:
            java.lang.String r5 = "dirty"
            boolean r5 = r0.d(r5)
            r7 = 1
            if (r5 != 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r6.g = r7
        L_0x0058:
            java.lang.String r5 = "starred"
            boolean r5 = r0.d(r5)
            if (r5 != 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r6.i = r7
        L_0x0064:
            java.lang.String r5 = "deleted"
            boolean r5 = r0.d(r5)
            if (r5 != 0) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r6.b()
        L_0x0071:
            java.lang.Long r5 = r0.b(r1)
            long r8 = r5.longValue()
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x02e3
            java.lang.String r5 = "mimetype"
            java.lang.String r8 = r0.a(r5)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x02dd
            java.util.Set r9 = r0.c
            boolean r9 = defpackage.ycm.a((java.util.Collection) r9)
            if (r9 != 0) goto L_0x02dd
            java.util.Set r9 = r0.c
            boolean r9 = r9.contains(r8)
            if (r9 == 0) goto L_0x02dd
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>()
            r9.put(r5, r8)
            java.lang.String r5 = "data_id"
            r0.b(r9, r5)
            java.lang.String r5 = "data_version"
            r0.b(r9, r5)
            java.lang.String r5 = "is_primary"
            r0.b(r9, r5)
            java.lang.String r5 = "vnd.android.cursor.item/group_membership"
            boolean r10 = android.text.TextUtils.equals(r8, r5)
            r13 = 2
            if (r10 == 0) goto L_0x00ec
            defpackage.xip.a()
            ayrj r10 = defpackage.ayrj.a
            aytn r10 = r10.a()
            boolean r10 = r10.ag()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            boolean r10 = r10.booleanValue()
            java.lang.String r15 = "group_sourceid"
            if (r10 == 0) goto L_0x00e8
            java.lang.String r10 = "data1"
            java.lang.Long r10 = r0.b(r10)
            java.util.Set r2 = r0.d
            boolean r2 = r2.contains(r10)
            if (r2 == 0) goto L_0x00e5
            r0.a(r9, r15)
            goto L_0x00ec
        L_0x00e5:
            r9 = 0
            r12 = 4
            goto L_0x0128
        L_0x00e8:
            r0.a(r9, r15)
        L_0x00ec:
            java.lang.String[] r2 = b
            int r10 = r2.length
            r15 = 0
        L_0x00f0:
            if (r15 >= r10) goto L_0x0127
            r14 = r2[r15]
            android.database.Cursor r11 = r0.a
            int r11 = r11.getColumnIndexOrThrow(r14)
            android.database.Cursor r12 = r0.a
            int r11 = r12.getType(r11)
            if (r11 == 0) goto L_0x0123
            if (r11 == r7) goto L_0x011e
            if (r11 == r13) goto L_0x011e
            r12 = 3
            if (r11 == r12) goto L_0x011e
            r12 = 4
            if (r11 != r12) goto L_0x0116
            byte[] r11 = r0.c(r14)
            if (r11 == 0) goto L_0x0124
            r9.put(r14, r11)
            goto L_0x0124
        L_0x0116:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid or unhandled data type"
            r1.<init>(r2)
            throw r1
        L_0x011e:
            r12 = 4
            r0.a(r9, r14)
            goto L_0x0124
        L_0x0123:
            r12 = 4
        L_0x0124:
            int r15 = r15 + 1
            goto L_0x00f0
        L_0x0127:
            r12 = 4
        L_0x0128:
            java.lang.String r2 = "/"
            int r2 = r8.lastIndexOf(r2)
            int r2 = r2 + r7
            java.lang.String r2 = r8.substring(r2)
            int r10 = r8.hashCode()
            switch(r10) {
                case -1729791444: goto L_0x023e;
                case -1569536764: goto L_0x0234;
                case -1328682538: goto L_0x0229;
                case -1207225626: goto L_0x021e;
                case -1079224304: goto L_0x0214;
                case -1079210633: goto L_0x0209;
                case -828105739: goto L_0x01fe;
                case -601229436: goto L_0x01f4;
                case -335220302: goto L_0x01e9;
                case 3430506: goto L_0x01df;
                case 94070761: goto L_0x01d3;
                case 456415478: goto L_0x01c7;
                case 684173810: goto L_0x01bc;
                case 689862072: goto L_0x01b1;
                case 905843021: goto L_0x01a5;
                case 950831081: goto L_0x019a;
                case 1238509849: goto L_0x018e;
                case 1332665825: goto L_0x0182;
                case 1409846529: goto L_0x0176;
                case 1464444786: goto L_0x016a;
                case 1464725403: goto L_0x0160;
                case 1635852198: goto L_0x0154;
                case 1828520899: goto L_0x0148;
                case 2034973555: goto L_0x013d;
                default: goto L_0x013b;
            }
        L_0x013b:
            goto L_0x0249
        L_0x013d:
            java.lang.String r5 = "vnd.android.cursor.item/nickname"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 1
            goto L_0x024a
        L_0x0148:
            java.lang.String r5 = "vnd.android.cursor.item/identity"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 14
            goto L_0x024a
        L_0x0154:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_jot"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 19
            goto L_0x024a
        L_0x0160:
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 12
            goto L_0x024a
        L_0x016a:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_calendar_link"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 17
            goto L_0x024a
        L_0x0176:
            java.lang.String r5 = "vnd.android.cursor.item/relation"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 9
            goto L_0x024a
        L_0x0182:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_language"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 15
            goto L_0x024a
        L_0x018e:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_user_defined_field"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 20
            goto L_0x024a
        L_0x019a:
            java.lang.String r5 = "vnd.android.cursor.item/im"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 4
            goto L_0x024a
        L_0x01a5:
            java.lang.String r5 = "vnd.android.cursor.item/photo"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 8
            goto L_0x024a
        L_0x01b1:
            java.lang.String r5 = "vnd.android.cursor.item/organization"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 7
            goto L_0x024a
        L_0x01bc:
            java.lang.String r5 = "vnd.android.cursor.item/phone_v2"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 2
            goto L_0x024a
        L_0x01c7:
            java.lang.String r5 = "vnd.android.cursor.item/website"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 13
            goto L_0x024a
        L_0x01d3:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_hobby"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 18
            goto L_0x024a
        L_0x01df:
            java.lang.String r5 = "vnd.android.cursor.item/sip_address"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 6
            goto L_0x024a
        L_0x01e9:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_extended_property"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 22
            goto L_0x024a
        L_0x01f4:
            java.lang.String r5 = "vnd.android.cursor.item/postal-address_v2"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 5
            goto L_0x024a
        L_0x01fe:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_misc"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 21
            goto L_0x024a
        L_0x0209:
            java.lang.String r5 = "vnd.android.cursor.item/note"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 11
            goto L_0x024a
        L_0x0214:
            java.lang.String r5 = "vnd.android.cursor.item/name"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 0
            goto L_0x024a
        L_0x021e:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_external_id"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 16
            goto L_0x024a
        L_0x0229:
            java.lang.String r5 = "vnd.android.cursor.item/contact_event"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 10
            goto L_0x024a
        L_0x0234:
            java.lang.String r5 = "vnd.android.cursor.item/email_v2"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 3
            goto L_0x024a
        L_0x023e:
            java.lang.String r5 = "vnd.com.google.cursor.item/contact_file_as"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0249
            r11 = 23
            goto L_0x024a
        L_0x0249:
            r11 = -1
        L_0x024a:
            switch(r11) {
                case 0: goto L_0x02c5;
                case 1: goto L_0x02c1;
                case 2: goto L_0x02bd;
                case 3: goto L_0x02b9;
                case 4: goto L_0x02b5;
                case 5: goto L_0x02b1;
                case 6: goto L_0x02ad;
                case 7: goto L_0x02a9;
                case 8: goto L_0x02a5;
                case 9: goto L_0x02a1;
                case 10: goto L_0x028a;
                case 11: goto L_0x0286;
                case 12: goto L_0x0282;
                case 13: goto L_0x027e;
                case 14: goto L_0x027a;
                case 15: goto L_0x0276;
                case 16: goto L_0x0272;
                case 17: goto L_0x026e;
                case 18: goto L_0x0269;
                case 19: goto L_0x0264;
                case 20: goto L_0x025f;
                case 21: goto L_0x025a;
                case 22: goto L_0x0255;
                case 23: goto L_0x0250;
                default: goto L_0x024d;
            }
        L_0x024d:
            r5 = 0
            goto L_0x02c9
        L_0x0250:
            r6.h(r9)
            goto L_0x02c8
        L_0x0255:
            r6.f(r9)
            goto L_0x02c8
        L_0x025a:
            r6.o(r9)
            goto L_0x02c8
        L_0x025f:
            r6.c(r9)
            goto L_0x02c8
        L_0x0264:
            r6.m(r9)
            goto L_0x02c8
        L_0x0269:
            r6.j(r9)
            goto L_0x02c8
        L_0x026e:
            r6.b(r9)
            goto L_0x02c8
        L_0x0272:
            r6.g(r9)
            goto L_0x02c8
        L_0x0276:
            r6.n(r9)
            goto L_0x02c8
        L_0x027a:
            r6.k(r9)
            goto L_0x02c8
        L_0x027e:
            r6.y(r9)
            goto L_0x02c8
        L_0x0282:
            r6.i(r9)
            goto L_0x02c8
        L_0x0286:
            r6.r(r9)
            goto L_0x02c8
        L_0x028a:
            java.lang.String r5 = "data2"
            java.lang.String r5 = r9.getAsString(r5)
            java.lang.String r8 = "3"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x029d
            r6.a(r9)
            goto L_0x02c8
        L_0x029d:
            r6.e(r9)
            goto L_0x02c8
        L_0x02a1:
            r6.w(r9)
            goto L_0x02c8
        L_0x02a5:
            r6.u(r9)
            goto L_0x02c8
        L_0x02a9:
            r6.s(r9)
            goto L_0x02c8
        L_0x02ad:
            r6.x(r9)
            goto L_0x02c8
        L_0x02b1:
            r6.v(r9)
            goto L_0x02c8
        L_0x02b5:
            r6.l(r9)
            goto L_0x02c8
        L_0x02b9:
            r6.d(r9)
            goto L_0x02c8
        L_0x02bd:
            r6.t(r9)
            goto L_0x02c8
        L_0x02c1:
            r6.q(r9)
            goto L_0x02c8
        L_0x02c5:
            r6.p(r9)
        L_0x02c8:
            r5 = r6
        L_0x02c9:
            if (r5 != 0) goto L_0x02dd
            java.lang.Object[] r5 = new java.lang.Object[r13]
            r8 = 0
            r5[r8] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r5[r7] = r2
            java.lang.String r2 = "FSA2_ContactsCursor"
            java.lang.String r8 = "Error when adding data %s to Contact ID=%d"
            defpackage.xdt.b(r2, r8, r5)
        L_0x02dd:
            boolean r2 = r16.d()
            if (r2 != 0) goto L_0x0071
        L_0x02e3:
            int r1 = r0.e
            int r1 = r1 + r7
            r0.e = r1
            xvs r1 = r6.a()
            java.util.List r2 = r1.I
            r2.size()
            return r1
        L_0x02f2:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvz.b():xvs");
    }
}
