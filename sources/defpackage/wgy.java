package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: wgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wgy {
    static final String[] a = {"_id", "lookup"};
    static final String[] b = {"contact_id", "lookup", "display_name", "photo_thumb_uri", "mimetype", "data1", "data4", "account_name", "account_type", "starred"};
    public final Context c;

    public wgy(Context context) {
        this.c = context;
    }

    private static vih a(Cursor cursor, wic wic) {
        Boolean bool;
        aucd aucd;
        String str;
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("contact_id");
        int columnIndex2 = cursor2.getColumnIndex("lookup");
        int columnIndex3 = cursor2.getColumnIndex("display_name");
        int columnIndex4 = cursor2.getColumnIndex("photo_thumb_uri");
        int columnIndex5 = cursor2.getColumnIndex("mimetype");
        int columnIndex6 = cursor2.getColumnIndex("data1");
        int columnIndex7 = cursor2.getColumnIndex("data4");
        int columnIndex8 = cursor2.getColumnIndex("starred");
        String str2 = "wgy";
        String str3 = "a";
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1 || columnIndex6 == -1 || columnIndex7 == -1) {
            ((anih) ((anih) vvj.a.c()).a(str2, str3, 173, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to find the expected columns in the contact content uri.");
            return vih.b;
        }
        aucd o = vih.b.o();
        ArrayList arrayList = new ArrayList();
        aucd aucd2 = o;
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i));
            }
        } else {
            arrayList.add(Locale.getDefault());
        }
        boolean moveToFirst = cursor.moveToFirst();
        while (moveToFirst) {
            Long b2 = tgw.b(cursor2, columnIndex);
            if (b2 != null) {
                String a2 = tgw.a(cursor2, columnIndex2);
                if (TextUtils.isEmpty(a2)) {
                    moveToFirst = cursor.moveToNext();
                } else {
                    String a3 = tgw.a(cursor2, columnIndex3);
                    if (TextUtils.isEmpty(a3)) {
                        moveToFirst = cursor.moveToNext();
                    } else {
                        String a4 = tgw.a(cursor2, columnIndex4);
                        if (a4 == null) {
                            a4 = "";
                        }
                        String str4 = a4;
                        if (ayni.E()) {
                            bool = tgw.c(cursor2, columnIndex8);
                            if (bool == null) {
                                bool = false;
                            }
                        } else {
                            bool = false;
                        }
                        int i2 = columnIndex2;
                        aucd o2 = vig.l.o();
                        int i3 = columnIndex3;
                        aucd o3 = vii.d.o();
                        String str5 = str2;
                        String str6 = str3;
                        long longValue = b2.longValue();
                        int i4 = columnIndex4;
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        vii vii = (vii) o3.b;
                        int i5 = columnIndex8;
                        int i6 = vii.a | 1;
                        vii.a = i6;
                        vii.b = longValue;
                        a2.getClass();
                        vii.a = i6 | 2;
                        vii.c = a2;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        vig vig = (vig) o2.b;
                        vii vii2 = (vii) o3.i();
                        vii2.getClass();
                        vig.b = vii2;
                        vig.a |= 1;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        vig vig2 = (vig) o2.b;
                        a3.getClass();
                        int i7 = vig2.a | 2;
                        vig2.a = i7;
                        vig2.c = a3;
                        str4.getClass();
                        int i8 = i7 | 4;
                        vig2.a = i8;
                        vig2.d = str4;
                        vig2.a = i8 | 8;
                        vig2.g = false;
                        boolean booleanValue = bool.booleanValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        vig vig3 = (vig) o2.b;
                        vig3.a |= 128;
                        vig3.k = booleanValue;
                        while (true) {
                            String a5 = tgw.a(cursor2, columnIndex5);
                            if (a5 != null) {
                                String a6 = tgw.a(cursor2, columnIndex6);
                                if (TextUtils.isEmpty(a6)) {
                                    str2 = str5;
                                    str3 = str6;
                                } else if (a5.equals("vnd.android.cursor.item/email_v2")) {
                                    o2.o(a6);
                                    str2 = str5;
                                    str3 = str6;
                                } else if (a5.equals("vnd.android.cursor.item/phone_v2")) {
                                    String a7 = tgw.a(cursor2, columnIndex7);
                                    if (TextUtils.isEmpty(a7)) {
                                        int size = arrayList.size();
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= size) {
                                                str = null;
                                                break;
                                            }
                                            str = PhoneNumberUtils.formatNumberToE164(a6, ((Locale) arrayList.get(i9)).getCountry());
                                            i9++;
                                            if (str != null) {
                                                break;
                                            }
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            o2.p(str);
                                            str2 = str5;
                                            str3 = str6;
                                        } else {
                                            str2 = str5;
                                            str3 = str6;
                                        }
                                    } else {
                                        o2.p(a7);
                                        str2 = str5;
                                        str3 = str6;
                                    }
                                } else {
                                    str2 = str5;
                                    str3 = str6;
                                    ((anih) ((anih) vvj.a.c()).a(str2, str3, 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected mime type in contact content uri: %s.", (Object) a5);
                                }
                            } else {
                                str2 = str5;
                                str3 = str6;
                            }
                            moveToFirst = cursor.moveToNext();
                            if (moveToFirst && b2.equals(tgw.b(cursor2, columnIndex))) {
                                aucd aucd3 = aucd2;
                                str5 = str2;
                                str6 = str3;
                            }
                        }
                        if (((vig) o2.b).e.size() > 0 || ((vig) o2.b).f.size() > 0) {
                            aucd = aucd2;
                            aucd.s(o2);
                        } else {
                            aucd = aucd2;
                        }
                        aucd2 = aucd;
                        columnIndex2 = i2;
                        columnIndex3 = i3;
                        columnIndex4 = i4;
                        columnIndex8 = i5;
                    }
                }
            } else {
                int i10 = columnIndex2;
                int i11 = columnIndex3;
                int i12 = columnIndex8;
                aucd aucd4 = aucd2;
                columnIndex3 = i11;
                columnIndex4 = columnIndex4;
            }
        }
        return (vih) aucd2.i();
    }

    private static vii a(Cursor cursor, Uri uri) {
        if (cursor.getCount() != 1) {
            ((anih) ((anih) vvj.a.c()).a("wgy", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Found %d contacts for uri: %s.", cursor.getCount(), (Object) uri);
            return null;
        }
        Long b2 = tgw.b(cursor, "_id");
        if (b2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgy", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The contact's id does not exist.");
            return null;
        }
        String a2 = tgw.a(cursor, "lookup");
        if (!TextUtils.isEmpty(a2)) {
            aucd o = vii.d.o();
            long longValue = b2.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            vii vii = (vii) o.b;
            int i = 1 | vii.a;
            vii.a = i;
            vii.b = longValue;
            a2.getClass();
            vii.a = i | 2;
            vii.c = a2;
            return (vii) o.i();
        }
        ((anih) ((anih) vvj.a.c()).a("wgy", "a", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The contact's lookup key does not exist.");
        return null;
    }

    public final vih a(Account account) {
        vih vih;
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        int i;
        String str5;
        aucd aucd;
        String str6;
        Account account2 = account;
        Cursor a2 = tgw.a(this.c, ContactsContract.Data.CONTENT_URI, b, "(account_name=? AND account_type=?) AND (mimetype=? OR mimetype=?)", new String[]{account2.name, account2.type, "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"}, "contact_id ASC,data1 ASC");
        String str7 = "a";
        if (a2 != null) {
            try {
                int columnIndex = a2.getColumnIndex("contact_id");
                int columnIndex2 = a2.getColumnIndex("lookup");
                int columnIndex3 = a2.getColumnIndex("display_name");
                int columnIndex4 = a2.getColumnIndex("photo_thumb_uri");
                int columnIndex5 = a2.getColumnIndex("mimetype");
                int columnIndex6 = a2.getColumnIndex("data1");
                int columnIndex7 = a2.getColumnIndex("data4");
                int columnIndex8 = a2.getColumnIndex("starred");
                if (columnIndex == -1) {
                    str = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
                    str2 = str7;
                } else if (columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1 || columnIndex6 == -1 || columnIndex7 == -1) {
                    str = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
                    str2 = str7;
                } else {
                    aucd o = vih.b.o();
                    ArrayList arrayList = new ArrayList();
                    int i2 = columnIndex7;
                    String str8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
                    if (Build.VERSION.SDK_INT >= 24) {
                        LocaleList localeList = LocaleList.getDefault();
                        int i3 = 0;
                        while (true) {
                            str3 = str7;
                            if (i3 >= localeList.size()) {
                                break;
                            }
                            arrayList.add(localeList.get(i3));
                            i3++;
                            str7 = str3;
                        }
                    } else {
                        arrayList.add(Locale.getDefault());
                        str3 = str7;
                    }
                    boolean moveToFirst = a2.moveToFirst();
                    while (moveToFirst) {
                        Long b2 = tgw.b(a2, columnIndex);
                        if (b2 != null) {
                            String a3 = tgw.a(a2, columnIndex2);
                            if (!TextUtils.isEmpty(a3)) {
                                String a4 = tgw.a(a2, columnIndex3);
                                if (!TextUtils.isEmpty(a4)) {
                                    String a5 = tgw.a(a2, columnIndex4);
                                    if (a5 == null) {
                                        a5 = "";
                                    }
                                    String str9 = a5;
                                    if (ayni.E()) {
                                        bool = tgw.c(a2, columnIndex8);
                                        if (bool == null) {
                                            bool = null;
                                        }
                                    } else {
                                        bool = null;
                                    }
                                    int i4 = columnIndex2;
                                    aucd o2 = vig.l.o();
                                    int i5 = columnIndex8;
                                    aucd o3 = vii.d.o();
                                    int i6 = columnIndex3;
                                    int i7 = columnIndex4;
                                    long longValue = b2.longValue();
                                    aucd aucd2 = o;
                                    if (o3.c) {
                                        o3.c();
                                        o3.c = false;
                                    }
                                    vii vii = (vii) o3.b;
                                    Long l = b2;
                                    int i8 = vii.a | 1;
                                    vii.a = i8;
                                    vii.b = longValue;
                                    a3.getClass();
                                    vii.a = i8 | 2;
                                    vii.c = a3;
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    vig vig = (vig) o2.b;
                                    vii vii2 = (vii) o3.i();
                                    vii2.getClass();
                                    vig.b = vii2;
                                    vig.a |= 1;
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    vig vig2 = (vig) o2.b;
                                    a4.getClass();
                                    int i9 = vig2.a | 2;
                                    vig2.a = i9;
                                    vig2.c = a4;
                                    str9.getClass();
                                    int i10 = i9 | 4;
                                    vig2.a = i10;
                                    vig2.d = str9;
                                    vig2.a = i10 | 8;
                                    vig2.g = false;
                                    boolean booleanValue = bool.booleanValue();
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    vig vig3 = (vig) o2.b;
                                    vig3.a |= 128;
                                    vig3.k = booleanValue;
                                    while (true) {
                                        String a6 = tgw.a(a2, columnIndex5);
                                        if (a6 != null) {
                                            String a7 = tgw.a(a2, columnIndex6);
                                            if (TextUtils.isEmpty(a7)) {
                                                i = i2;
                                                str4 = str8;
                                                str5 = str3;
                                            } else if (a6.equals("vnd.android.cursor.item/email_v2")) {
                                                i = i2;
                                                str4 = str8;
                                                str5 = str3;
                                                o2.o(a7);
                                            } else if (!a6.equals("vnd.android.cursor.item/phone_v2")) {
                                                str4 = str8;
                                                str5 = str3;
                                                ((anih) ((anih) vvj.a.c()).a("wgy", str5, 247, str4)).a("Unexpected mime type in contact content uri: %s.", (Object) a6);
                                                i = i2;
                                            } else {
                                                str4 = str8;
                                                str5 = str3;
                                                i = i2;
                                                String a8 = tgw.a(a2, i);
                                                if (TextUtils.isEmpty(a8)) {
                                                    Iterator it = arrayList.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            str6 = null;
                                                            break;
                                                        }
                                                        str6 = PhoneNumberUtils.formatNumberToE164(a7, ((Locale) it.next()).getCountry());
                                                        if (str6 != null) {
                                                            break;
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(str6)) {
                                                        o2.p(str6);
                                                    }
                                                } else {
                                                    o2.p(a8);
                                                }
                                            }
                                        } else {
                                            i = i2;
                                            str4 = str8;
                                            str5 = str3;
                                        }
                                        moveToFirst = a2.moveToNext();
                                        if (!moveToFirst) {
                                            break;
                                        }
                                        Long l2 = l;
                                        if (!l2.equals(tgw.b(a2, columnIndex))) {
                                            break;
                                        }
                                        aucd aucd3 = aucd2;
                                        str3 = str5;
                                        l = l2;
                                        i2 = i;
                                        str8 = str4;
                                    }
                                    if (((vig) o2.b).e.size() <= 0) {
                                        if (((vig) o2.b).f.size() <= 0) {
                                            aucd = aucd2;
                                            str3 = str5;
                                            o = aucd;
                                            i2 = i;
                                            str8 = str4;
                                            columnIndex3 = i6;
                                            columnIndex2 = i4;
                                            columnIndex8 = i5;
                                            columnIndex4 = i7;
                                        }
                                    }
                                    aucd = aucd2;
                                    aucd.s(o2);
                                    str3 = str5;
                                    o = aucd;
                                    i2 = i;
                                    str8 = str4;
                                    columnIndex3 = i6;
                                    columnIndex2 = i4;
                                    columnIndex8 = i5;
                                    columnIndex4 = i7;
                                } else {
                                    moveToFirst = a2.moveToNext();
                                    str3 = str3;
                                    o = o;
                                    i2 = i2;
                                    str8 = str8;
                                    columnIndex3 = columnIndex3;
                                    columnIndex2 = columnIndex2;
                                    columnIndex8 = columnIndex8;
                                    columnIndex4 = columnIndex4;
                                }
                            } else {
                                moveToFirst = a2.moveToNext();
                                str3 = str3;
                                o = o;
                                i2 = i2;
                                str8 = str8;
                                columnIndex3 = columnIndex3;
                                columnIndex2 = columnIndex2;
                                columnIndex8 = columnIndex8;
                                columnIndex4 = columnIndex4;
                            }
                        } else {
                            int i11 = columnIndex2;
                            int i12 = columnIndex8;
                            int i13 = columnIndex3;
                            int i14 = columnIndex4;
                            int i15 = i2;
                            String str10 = str8;
                            String str11 = str3;
                            o = o;
                            columnIndex3 = i13;
                            columnIndex4 = i14;
                        }
                    }
                    vih = (vih) o.i();
                    return vih;
                }
                ((anih) ((anih) vvj.a.c()).a("wgy", str2, 173, str)).a("Unable to find the expected columns in the contact content uri.");
                vih = vih.b;
                return vih;
            } finally {
                a2.close();
            }
        } else {
            ((anih) ((anih) vvj.a.c()).a("wgy", str7, 144, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to get cursor for the contact content uri.");
            return vih.b;
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.vii a(defpackage.vii r9) {
        /*
            r8 = this;
            long r0 = r9.b
            java.lang.String r2 = r9.c
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.getLookupUri(r0, r2)
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "wgy"
            r4 = 0
            if (r0 != 0) goto L_0x002b
            jjg r0 = defpackage.vvj.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r5 = 86
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r5, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            long r1 = r9.b
            java.lang.String r9 = r9.c
            java.lang.String r3 = "Unable to construct the contact lookup uri from id: %d and lookup key: %s."
            r0.a((java.lang.String) r3, (long) r1, (java.lang.Object) r9)
            return r4
        L_0x002b:
            android.content.Context r9 = r8.c
            java.lang.String[] r5 = a
            android.database.Cursor r9 = defpackage.tgw.a(r9, r0, r5)
            if (r9 == 0) goto L_0x00cf
            int r5 = r9.getCount()     // Catch:{ all -> 0x00ca }
            r6 = 1
            if (r5 == r6) goto L_0x0056
            jjg r5 = defpackage.vvj.a     // Catch:{ all -> 0x00ca }
            anie r5 = r5.c()     // Catch:{ all -> 0x00ca }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x00ca }
            r6 = 108(0x6c, float:1.51E-43)
            anie r1 = r5.a((java.lang.String) r3, (java.lang.String) r2, (int) r6, (java.lang.String) r1)     // Catch:{ all -> 0x00ca }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = "Found %d contacts for uri: %s."
            int r3 = r9.getCount()     // Catch:{ all -> 0x00ca }
            r1.a((java.lang.String) r2, (int) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x00ca }
            goto L_0x00c6
        L_0x0056:
            java.lang.String r0 = "_id"
            java.lang.Long r0 = defpackage.tgw.b((android.database.Cursor) r9, (java.lang.String) r0)     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x0074
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x00ca }
            anie r0 = r0.c()     // Catch:{ all -> 0x00ca }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ca }
            r5 = 114(0x72, float:1.6E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00ca }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "The contact's id does not exist."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00ca }
            goto L_0x00c6
        L_0x0074:
            java.lang.String r5 = "lookup"
            java.lang.String r5 = defpackage.tgw.a((android.database.Cursor) r9, (java.lang.String) r5)     // Catch:{ all -> 0x00ca }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00ca }
            if (r7 == 0) goto L_0x0096
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x00ca }
            anie r0 = r0.c()     // Catch:{ all -> 0x00ca }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ca }
            r5 = 120(0x78, float:1.68E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00ca }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "The contact's lookup key does not exist."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00ca }
            goto L_0x00c6
        L_0x0096:
            vii r1 = defpackage.vii.d     // Catch:{ all -> 0x00ca }
            aucd r1 = r1.o()     // Catch:{ all -> 0x00ca }
            long r2 = r0.longValue()     // Catch:{ all -> 0x00ca }
            boolean r0 = r1.c     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            r1.c()     // Catch:{ all -> 0x00ca }
            r0 = 0
            r1.c = r0     // Catch:{ all -> 0x00ca }
        L_0x00ab:
            aucj r0 = r1.b     // Catch:{ all -> 0x00ca }
            vii r0 = (defpackage.vii) r0     // Catch:{ all -> 0x00ca }
            int r4 = r0.a     // Catch:{ all -> 0x00ca }
            r4 = r4 | r6
            r0.a = r4     // Catch:{ all -> 0x00ca }
            r0.b = r2     // Catch:{ all -> 0x00ca }
            r5.getClass()     // Catch:{ all -> 0x00ca }
            r2 = r4 | 2
            r0.a = r2     // Catch:{ all -> 0x00ca }
            r0.c = r5     // Catch:{ all -> 0x00ca }
            aucj r0 = r1.i()     // Catch:{ all -> 0x00ca }
            r4 = r0
            vii r4 = (defpackage.vii) r4     // Catch:{ all -> 0x00ca }
        L_0x00c6:
            r9.close()
            return r4
        L_0x00ca:
            r0 = move-exception
            r9.close()
            throw r0
        L_0x00cf:
            jjg r9 = defpackage.vvj.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r0 = 94
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "Unable to get cursor for the contact lookup uri."
            r9.a((java.lang.String) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgy.a(vii):vii");
    }
}
