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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: wgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wgx {
    private final Context a;
    private final wgy b;

    public wgx(Context context, wgy wgy) {
        this.a = context;
        this.b = wgy;
    }

    private final int a(Account account, vii vii, boolean z) {
        vih b2 = b(account);
        aucd aucd = (aucd) b2.c(5);
        aucd.a((aucj) b2);
        int size = ((vih) aucd.b).a.size();
        int i = 0;
        while (i < size) {
            vig A = aucd.A(i);
            vii vii2 = A.b;
            if (vii2 == null) {
                vii2 = vii.d;
            }
            if (!vii2.equals(vii)) {
                i++;
            } else if (A.g == z) {
                return 35500;
            } else {
                aucd aucd2 = (aucd) A.c(5);
                aucd2.a((aucj) A);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                vig vig = (vig) aucd2.b;
                vig vig2 = vig.l;
                vig.a |= 8;
                vig.g = z;
                aucd.c(i, aucd2);
                if (!a(account, (vih) aucd.i())) {
                    return 35506;
                }
                ((anih) ((anih) vvj.a.d()).a("wgx", "a", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully toggled contact %s to isSelected=%s.", vii.b, z);
                return 0;
            }
        }
        ((anih) ((anih) vvj.a.c()).a("wgx", "a", 125, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to select contact %s: this contact does not exist.", vii.b);
        return 35508;
    }

    private final File d(Account account) {
        return who.a(this.a, account, "nearby_sharing_contact_book");
    }

    public final synchronized int b(Account account, vii vii) {
        return a(account, vii, false);
    }

    public final synchronized boolean c(Account account) {
        if (account == null) {
            ((anih) ((anih) vvj.a.c()).a("wgx", "c", 167, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to check has contacts: account is null.");
            return false;
        }
        return d(account).exists();
    }

    public final synchronized vih b(Account account) {
        FileInputStream fileInputStream;
        if (account == null) {
            ((anih) ((anih) vvj.a.c()).a("wgx", "b", 132, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to load contact book from disk: account is null.");
            return vih.b;
        }
        File d = d(account);
        if (d.exists()) {
            try {
                fileInputStream = new FileInputStream(d);
                vih vih = (vih) aucj.a((aucj) vih.b, (InputStream) fileInputStream);
                fileInputStream.close();
                return vih;
            } catch (IOException e) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("wgx", "b", 141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read contact book from disk.");
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        return vih.b;
        throw th;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vig vig = (vig) list.get(i);
            arrayList.addAll(vig.e);
            arrayList.addAll(vig.f);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final nz a(vih vih, vih vih2) {
        int i;
        vii vii;
        ob obVar = new ob();
        aucx aucx = vih2.a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            vih vih3 = vih;
            vii vii2 = ((vig) aucx.get(i2)).b;
            if (vii2 == null) {
                vii2 = vii.d;
            }
            obVar.add(vii2);
        }
        nz nzVar = new nz();
        aucx aucx2 = vih.a;
        int i3 = 0;
        for (int size2 = aucx2.size(); i3 < size2; size2 = i) {
            vig vig = (vig) aucx2.get(i3);
            wgv wgv = new wgv(wgv.a(vig), vig.g, vig.h, vig.i, vig.j);
            vii vii3 = vig.b;
            if (vii3 == null) {
                vii3 = vii.d;
            }
            if (!obVar.contains(vii3)) {
                wgy wgy = this.b;
                vii vii4 = vig.b;
                if (vii4 == null) {
                    vii4 = vii.d;
                }
                Uri lookupUri = ContactsContract.Contacts.getLookupUri(vii4.b, vii4.c);
                if (lookupUri == null) {
                    ((anih) ((anih) vvj.a.c()).a("wgy", "a", 86, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to construct the contact lookup uri from id: %d and lookup key: %s.", vii4.b, (Object) vii4.c);
                    i = size2;
                    vii = null;
                } else {
                    Cursor a2 = tgw.a(wgy.c, lookupUri, wgy.a);
                    if (a2 == null) {
                        ((anih) ((anih) vvj.a.c()).a("wgy", "a", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to get cursor for the contact lookup uri.");
                        i = size2;
                        vii = null;
                    } else {
                        try {
                            if (a2.getCount() != 1) {
                                ((anih) ((anih) vvj.a.c()).a("wgy", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Found %d contacts for uri: %s.", a2.getCount(), (Object) lookupUri);
                                i = size2;
                                vii = null;
                            } else {
                                Long b2 = tgw.b(a2, "_id");
                                if (b2 == null) {
                                    ((anih) ((anih) vvj.a.c()).a("wgy", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The contact's id does not exist.");
                                    i = size2;
                                    vii = null;
                                } else {
                                    String a3 = tgw.a(a2, "lookup");
                                    if (TextUtils.isEmpty(a3)) {
                                        ((anih) ((anih) vvj.a.c()).a("wgy", "a", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The contact's lookup key does not exist.");
                                        i = size2;
                                        vii = null;
                                    } else {
                                        aucd o = vii.d.o();
                                        i = size2;
                                        long longValue = b2.longValue();
                                        if (o.c) {
                                            o.c();
                                            o.c = false;
                                        }
                                        vii vii5 = (vii) o.b;
                                        int i4 = vii5.a | 1;
                                        vii5.a = i4;
                                        vii5.b = longValue;
                                        a3.getClass();
                                        vii5.a = i4 | 2;
                                        vii5.c = a3;
                                        vii = (vii) o.i();
                                    }
                                }
                            }
                        } finally {
                            a2.close();
                        }
                    }
                }
                if (vii != null && obVar.contains(vii)) {
                    nzVar.put(vii, wgv);
                } else {
                    ((anih) ((anih) vvj.a.c()).a("wgx", "a", 231, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Discarding contact %s: we could not find this contact in the database.", (Object) vig.c);
                }
            } else {
                i = size2;
                vii vii6 = vig.b;
                if (vii6 == null) {
                    vii6 = vii.d;
                }
                nzVar.put(vii6, wgv);
            }
            i3++;
        }
        return nzVar;
    }

    public final synchronized int a(Account account, vii vii) {
        return a(account, vii, true);
    }

    /* JADX INFO: finally extract failed */
    public final synchronized wgw a(Account account) {
        vih vih;
        vih vih2;
        long j;
        aucx aucx;
        vii vii;
        Long l;
        vih vih3;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        int i3;
        aucd aucd;
        String str8;
        Account account2 = account;
        synchronized (this) {
            vih b2 = b(account);
            Cursor a2 = tgw.a(this.b.c, ContactsContract.Data.CONTENT_URI, wgy.b, "(account_name=? AND account_type=?) AND (mimetype=? OR mimetype=?)", new String[]{account2.name, account2.type, "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"}, "contact_id ASC,data1 ASC");
            if (a2 == null) {
                ((anih) ((anih) vvj.a.c()).a("wgy", "a", 144, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to get cursor for the contact content uri.");
                vih2 = vih.b;
                vih = b2;
            } else {
                String str9 = "wgy";
                String str10 = "a";
                String str11 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
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
                        str3 = str9;
                        vih = b2;
                        str2 = str10;
                        str = str11;
                    } else if (columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1 || columnIndex6 == -1 || columnIndex7 == -1) {
                        str3 = str9;
                        vih = b2;
                        str2 = str10;
                        str = str11;
                    } else {
                        aucd o = vih.b.o();
                        ArrayList arrayList = new ArrayList();
                        vih = b2;
                        int i4 = columnIndex7;
                        if (Build.VERSION.SDK_INT >= 24) {
                            LocaleList localeList = LocaleList.getDefault();
                            int i5 = 0;
                            while (true) {
                                str4 = str9;
                                if (i5 >= localeList.size()) {
                                    break;
                                }
                                arrayList.add(localeList.get(i5));
                                i5++;
                                str9 = str4;
                            }
                        } else {
                            arrayList.add(Locale.getDefault());
                            str4 = str9;
                        }
                        boolean moveToFirst = a2.moveToFirst();
                        while (moveToFirst) {
                            Long b3 = tgw.b(a2, columnIndex);
                            if (b3 != null) {
                                String a3 = tgw.a(a2, columnIndex2);
                                if (!TextUtils.isEmpty(a3)) {
                                    String a4 = tgw.a(a2, columnIndex3);
                                    if (!TextUtils.isEmpty(a4)) {
                                        String a5 = tgw.a(a2, columnIndex4);
                                        if (a5 == null) {
                                            a5 = "";
                                        }
                                        String str12 = a5;
                                        if (ayni.E()) {
                                            i2 = columnIndex2;
                                            i = columnIndex3;
                                            bool = (Boolean) tgw.a("getBoolean", (Callable) new tgv(a2, columnIndex8));
                                            if (bool == null) {
                                                bool = false;
                                            }
                                        } else {
                                            i2 = columnIndex2;
                                            i = columnIndex3;
                                            bool = false;
                                        }
                                        aucd o2 = vig.l.o();
                                        int i6 = columnIndex8;
                                        aucd o3 = vii.d.o();
                                        String str13 = str10;
                                        String str14 = str11;
                                        long longValue = b3.longValue();
                                        int i7 = columnIndex4;
                                        if (o3.c) {
                                            o3.c();
                                            o3.c = false;
                                        }
                                        vii vii2 = (vii) o3.b;
                                        aucd aucd2 = o;
                                        int i8 = vii2.a | 1;
                                        vii2.a = i8;
                                        vii2.b = longValue;
                                        a3.getClass();
                                        vii2.a = i8 | 2;
                                        vii2.c = a3;
                                        if (o2.c) {
                                            o2.c();
                                            o2.c = false;
                                        }
                                        vig vig = (vig) o2.b;
                                        vii vii3 = (vii) o3.i();
                                        vii3.getClass();
                                        vig.b = vii3;
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
                                        str12.getClass();
                                        int i10 = i9 | 4;
                                        vig2.a = i10;
                                        vig2.d = str12;
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
                                                    i3 = i4;
                                                    str7 = str4;
                                                    str6 = str13;
                                                    str5 = str14;
                                                } else if (a6.equals("vnd.android.cursor.item/email_v2")) {
                                                    i3 = i4;
                                                    str7 = str4;
                                                    str6 = str13;
                                                    str5 = str14;
                                                    o2.o(a7);
                                                } else if (!a6.equals("vnd.android.cursor.item/phone_v2")) {
                                                    str7 = str4;
                                                    str6 = str13;
                                                    str5 = str14;
                                                    ((anih) ((anih) vvj.a.c()).a(str7, str6, 247, str5)).a("Unexpected mime type in contact content uri: %s.", (Object) a6);
                                                    i3 = i4;
                                                } else {
                                                    str7 = str4;
                                                    str6 = str13;
                                                    str5 = str14;
                                                    i3 = i4;
                                                    String a8 = tgw.a(a2, i3);
                                                    if (TextUtils.isEmpty(a8)) {
                                                        Iterator it = arrayList.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                str8 = null;
                                                                break;
                                                            }
                                                            str8 = PhoneNumberUtils.formatNumberToE164(a7, ((Locale) it.next()).getCountry());
                                                            if (str8 != null) {
                                                                break;
                                                            }
                                                        }
                                                        if (!TextUtils.isEmpty(str8)) {
                                                            o2.p(str8);
                                                        }
                                                    } else {
                                                        o2.p(a8);
                                                    }
                                                }
                                            } else {
                                                i3 = i4;
                                                str7 = str4;
                                                str6 = str13;
                                                str5 = str14;
                                            }
                                            moveToFirst = a2.moveToNext();
                                            if (!moveToFirst) {
                                                break;
                                            } else if (!b3.equals(tgw.b(a2, columnIndex))) {
                                                break;
                                            } else {
                                                aucd aucd3 = aucd2;
                                                i4 = i3;
                                                str4 = str7;
                                                str13 = str6;
                                                str14 = str5;
                                            }
                                        }
                                        if (((vig) o2.b).e.size() <= 0) {
                                            if (((vig) o2.b).f.size() <= 0) {
                                                aucd = aucd2;
                                                i4 = i3;
                                                str4 = str7;
                                                str11 = str5;
                                                columnIndex2 = i2;
                                                columnIndex3 = i;
                                                columnIndex4 = i7;
                                                o = aucd;
                                                str10 = str6;
                                                columnIndex8 = i6;
                                            }
                                        }
                                        aucd = aucd2;
                                        aucd.s(o2);
                                        i4 = i3;
                                        str4 = str7;
                                        str11 = str5;
                                        columnIndex2 = i2;
                                        columnIndex3 = i;
                                        columnIndex4 = i7;
                                        o = aucd;
                                        str10 = str6;
                                        columnIndex8 = i6;
                                    } else {
                                        int i11 = columnIndex8;
                                        moveToFirst = a2.moveToNext();
                                        i4 = i4;
                                        str4 = str4;
                                        str11 = str11;
                                        columnIndex2 = columnIndex2;
                                        columnIndex3 = columnIndex3;
                                        columnIndex4 = columnIndex4;
                                        o = o;
                                        str10 = str10;
                                        columnIndex8 = i11;
                                    }
                                } else {
                                    int i12 = columnIndex8;
                                    moveToFirst = a2.moveToNext();
                                    i4 = i4;
                                    str4 = str4;
                                    str11 = str11;
                                    columnIndex2 = columnIndex2;
                                    columnIndex3 = columnIndex3;
                                    columnIndex4 = columnIndex4;
                                    o = o;
                                    str10 = str10;
                                    columnIndex8 = i12;
                                }
                            } else {
                                int i13 = columnIndex2;
                                int i14 = columnIndex3;
                                int i15 = columnIndex8;
                                int i16 = columnIndex4;
                                int i17 = i4;
                                String str15 = str10;
                                aucd aucd4 = o;
                                String str16 = str4;
                                str11 = str11;
                                columnIndex2 = i13;
                                o = aucd4;
                                str10 = str15;
                                columnIndex8 = i15;
                            }
                        }
                        vih3 = (vih) o.i();
                        a2.close();
                        vih2 = vih3;
                    }
                    ((anih) ((anih) vvj.a.c()).a(str3, str2, 173, str)).a("Unable to find the expected columns in the contact content uri.");
                    vih3 = vih.b;
                    a2.close();
                    vih2 = vih3;
                } catch (Throwable th) {
                    a2.close();
                    throw th;
                }
            }
            ob obVar = new ob();
            aucx aucx2 = vih2.a;
            int size = aucx2.size();
            int i18 = 0;
            while (i18 < size) {
                Account account3 = account;
                vih vih4 = vih;
                vii vii4 = ((vig) aucx2.get(i18)).b;
                if (vii4 == null) {
                    vii4 = vii.d;
                }
                obVar.add(vii4);
                i18++;
                vih = vih4;
            }
            nz nzVar = new nz();
            vih vih5 = vih;
            aucx aucx3 = vih5.a;
            int size2 = aucx3.size();
            int i19 = 0;
            while (i19 < size2) {
                vig vig4 = (vig) aucx3.get(i19);
                wgv wgv = new wgv(wgv.a(vig4), vig4.g, vig4.h, vig4.i, vig4.j);
                vii vii5 = vig4.b;
                if (vii5 == null) {
                    vii5 = vii.d;
                }
                if (!obVar.contains(vii5)) {
                    wgy wgy = this.b;
                    vii vii6 = vig4.b;
                    if (vii6 == null) {
                        vii6 = vii.d;
                    }
                    Uri lookupUri = ContactsContract.Contacts.getLookupUri(vii6.b, vii6.c);
                    if (lookupUri == null) {
                        ((anih) ((anih) vvj.a.c()).a("wgy", "a", 86, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to construct the contact lookup uri from id: %d and lookup key: %s.", vii6.b, (Object) vii6.c);
                        aucx = aucx3;
                        vii = null;
                    } else {
                        Cursor a9 = tgw.a(wgy.c, lookupUri, wgy.a);
                        if (a9 == null) {
                            ((anih) ((anih) vvj.a.c()).a("wgy", "a", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to get cursor for the contact lookup uri.");
                            aucx = aucx3;
                            vii = null;
                        } else {
                            try {
                                aucx = aucx3;
                                if (a9.getCount() != 1) {
                                    ((anih) ((anih) vvj.a.c()).a("wgy", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Found %d contacts for uri: %s.", a9.getCount(), (Object) lookupUri);
                                    vii = null;
                                } else {
                                    l = tgw.b(a9, a9.getColumnIndexOrThrow("_id"));
                                    if (l == null) {
                                        ((anih) ((anih) vvj.a.c()).a("wgy", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The contact's id does not exist.");
                                        vii = null;
                                    } else {
                                        String a10 = tgw.a(a9, "lookup");
                                        if (TextUtils.isEmpty(a10)) {
                                            ((anih) ((anih) vvj.a.c()).a("wgy", "a", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The contact's lookup key does not exist.");
                                            vii = null;
                                        } else {
                                            aucd o4 = vii.d.o();
                                            long longValue2 = l.longValue();
                                            if (o4.c) {
                                                o4.c();
                                                o4.c = false;
                                            }
                                            vii vii7 = (vii) o4.b;
                                            int i20 = vii7.a | 1;
                                            vii7.a = i20;
                                            vii7.b = longValue2;
                                            a10.getClass();
                                            vii7.a = i20 | 2;
                                            vii7.c = a10;
                                            vii = (vii) o4.i();
                                        }
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                anih anih = (anih) tgb.a.c();
                                anih.a((Throwable) e);
                                anih.a("Failed to get the %s column value", (Object) "_id");
                                l = null;
                            } catch (Throwable th2) {
                                a9.close();
                                throw th2;
                            }
                            a9.close();
                        }
                    }
                    if (vii != null) {
                        if (obVar.contains(vii)) {
                            nzVar.put(vii, wgv);
                        }
                    }
                    ((anih) ((anih) vvj.a.c()).a("wgx", "a", 231, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Discarding contact %s: we could not find this contact in the database.", (Object) vig4.c);
                } else {
                    aucx = aucx3;
                    vii vii8 = vig4.b;
                    if (vii8 == null) {
                        vii8 = vii.d;
                    }
                    nzVar.put(vii8, wgv);
                }
                i19++;
                aucx3 = aucx;
            }
            aucd aucd5 = (aucd) vih2.c(5);
            aucd5.a((aucj) vih2);
            for (int i21 = 0; i21 < ((vih) aucd5.b).a.size(); i21++) {
                vig A = aucd5.A(i21);
                vii vii9 = A.b;
                if (vii9 == null) {
                    vii9 = vii.d;
                }
                wgv wgv2 = (wgv) nzVar.get(vii9);
                if (wgv2 != null) {
                    if (wgv2.a == wgv.a(A)) {
                        j = wgv2.e;
                    } else {
                        j = 0;
                    }
                    aucd aucd6 = (aucd) A.c(5);
                    aucd6.a((aucj) A);
                    boolean z = wgv2.b;
                    if (aucd6.c) {
                        aucd6.c();
                        aucd6.c = false;
                    }
                    vig vig5 = (vig) aucd6.b;
                    vig vig6 = vig.l;
                    int i22 = vig5.a | 8;
                    vig5.a = i22;
                    vig5.g = z;
                    boolean z2 = wgv2.c;
                    int i23 = i22 | 16;
                    vig5.a = i23;
                    vig5.h = z2;
                    boolean z3 = wgv2.d;
                    int i24 = i23 | 32;
                    vig5.a = i24;
                    vig5.i = z3;
                    vig5.a = i24 | 64;
                    vig5.j = j;
                    aucd5.c(i21, aucd6);
                }
            }
            vih vih6 = (vih) aucd5.i();
            a(account, vih6);
            List a11 = a((List) vih5.a);
            List a12 = a((List) vih6.a);
            if (a12.size() < a11.size()) {
                ((anih) ((anih) vvj.a.d()).a("wgx", "a", 64, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("A contact was removed from the contact book.");
                wgw wgw = wgw.CONTACT_REMOVED;
                return wgw;
            } else if (a12.size() > a11.size()) {
                ((anih) ((anih) vvj.a.d()).a("wgx", "a", 67, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("A contact was added to the contact book.");
                wgw wgw2 = wgw.CONTACT_ADDED;
                return wgw2;
            } else if (a11.equals(a12)) {
                ((anih) ((anih) vvj.a.d()).a("wgx", "a", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The contact book was modified but all emails and phone numbers are unchanged.");
                wgw wgw3 = wgw.NO_CONTACTS_CHANGED;
                return wgw3;
            } else {
                ((anih) ((anih) vvj.a.d()).a("wgx", "a", 74, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("An email or phone number was edited in the contact book.");
                wgw wgw4 = wgw.CONTACT_EDITED;
                return wgw4;
            }
        }
    }

    public final synchronized void a() {
        List a2 = who.a(this.a, "nearby_sharing_contact_book");
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            ((File) a2.get(i)).delete();
        }
        ((anih) ((anih) vvj.a.d()).a("wgx", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Reset ContactBook.");
    }

    public final synchronized boolean a(Account account, vih vih) {
        FileOutputStream fileOutputStream;
        if (account == null) {
            ((anih) ((anih) vvj.a.c()).a("wgx", "a", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to save contact book to disk: account is null.");
            return false;
        }
        try {
            fileOutputStream = new FileOutputStream(d(account));
            vih.a(fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("wgx", "a", 160, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save contact book to disk.");
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
