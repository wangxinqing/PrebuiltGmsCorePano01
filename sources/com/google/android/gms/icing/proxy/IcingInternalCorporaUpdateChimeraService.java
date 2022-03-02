package com.google.android.gms.icing.proxy;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IcingInternalCorporaUpdateChimeraService extends qwf {
    static final qvz a;
    static final qvz b;
    static final qvz c = new qvz(CalendarContract.CONTENT_URI, 1);

    static {
        qvz qvz;
        if (jkr.c()) {
            a = new qvz(poo.c, 1);
            qvz = new qvz(ContactsContract.AUTHORITY_URI, 1);
        } else {
            qvz = null;
            a = null;
        }
        b = qvz;
    }

    public static void a(Context context) {
        if (((Boolean) pba.ay.c()).booleanValue()) {
            b(context);
        }
    }

    public static void b(Context context) {
        pnz.d("Calling IcingInternalCorporaUpdateChimeraService.schedule");
        if (jkr.c()) {
            ArrayList arrayList = new ArrayList();
            if (((Boolean) ozx.an.c()).booleanValue()) {
                if (poo.a(context)) {
                    pnz.d("SMS Corpus is enabled. Adding its uri trigger to list");
                    arrayList.add(a);
                }
                if (((Long) ozx.ak.c()).longValue() >= 0 && pnm.a()) {
                    pnz.d("Contacts Corpus is enabled. Adding its uri trigger to list");
                    arrayList.add(b);
                }
            }
            if (axsd.c() && ((Boolean) ozx.aU.c()).booleanValue()) {
                pnz.d("Calendar Corpus is enabled. Adding its uri trigger to list");
                arrayList.add(c);
            }
            if (!arrayList.isEmpty()) {
                pnz.d("Scheduling ContentUriTriggeredTask");
                qwq a2 = qwq.a((Context) ihs.b());
                qwa qwa = new qwa();
                qwa.k = "internal-corpora-update";
                qwa.i = "com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateService";
                qwa.b(1);
                qwa.a((Collection) arrayList);
                qwa.e();
                a2.a((qxx) qwa.b());
                pnz.d("ContentUriTriggeredTask is scheduled");
                return;
            }
            pnz.d("Not schedule ContentUriTriggeredTask because the uri trigger list is empty.");
            return;
        }
        pnz.d("Not schedule ContenUriTriggeredTask because of platform version is lower than N.");
    }

    public final int a(qxz qxz) {
        Cursor a2;
        Throwable th;
        qxz qxz2 = qxz;
        String str = qxz2.a;
        pnz.a("Running gcm task %s", (Object) str);
        if ("internal-corpora-update".equals(str)) {
            try {
                List<Uri> list = qxz2.c;
                pnz.d("Processing triggered uris");
                if (list == null) {
                    pnz.e("Triggered uri list is null");
                } else if (jkr.c()) {
                    String uri = a.a.toString();
                    String uri2 = ContactsContract.ProviderStatus.CONTENT_URI.toString();
                    String uri3 = b.a.toString();
                    String uri4 = c.a.toString();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    for (Uri uri5 : list) {
                        if (uri5 != null) {
                            String uri6 = uri5.toString();
                            if (!z && uri6.startsWith(uri)) {
                                z = true;
                            } else if (!z2 && uri2.equals(uri6)) {
                                z2 = jkr.e();
                            } else if (!z3 && uri6.startsWith(uri3)) {
                                z3 = true;
                            } else if (!z4) {
                                if (uri6.startsWith(uri4)) {
                                    z4 = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        pnz.d("SMS provider changed");
                        poj.c(this);
                    }
                    if (z2) {
                        a2 = new pni(new oyq(this), getContentResolver()).a(ContactsContract.ProviderStatus.CONTENT_URI, new String[]{"database_creation_timestamp"}, (String) null, (String[]) null, (String) null);
                        long j = -1;
                        if (a2 != null) {
                            if (a2.moveToNext()) {
                                j = jit.a(a2, 0, (Long) -1L).longValue();
                            }
                        }
                        if (a2 != null) {
                            a2.close();
                        }
                        SharedPreferences sharedPreferences = getSharedPreferences("icing_internal_corpora_prefs", 0);
                        if (sharedPreferences.getLong("contacts_db_creation_time_ms", 0) < j) {
                            pnz.d("Contacts database created");
                            sharedPreferences.edit().putLong("contacts_db_creation_time_ms", j).apply();
                            UpdateIcingCorporaIntentOperation.a((Context) this);
                        }
                    }
                    if (z3) {
                        pnz.d("Contacts provider changed");
                        pmb.a(this);
                        synchronized (pmb.class) {
                            if (pmb.a != null) {
                                pmb.a.onChange(false);
                            }
                        }
                    }
                    if (z4) {
                        pnz.d("Calendar provider changed");
                        ppk.a.a(getApplicationContext(), 1, 1);
                    }
                } else {
                    pnz.a("Not process triggered uri because platform version is lower than N.");
                }
                b(this);
            } catch (Throwable th2) {
                b(this);
                throw th2;
            }
        } else if ("InternalCorporaMaintenance".equals(str)) {
            pnm.c(this);
        }
        return 0;
        throw th;
    }
}
