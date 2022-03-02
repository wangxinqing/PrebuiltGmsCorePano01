package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zug implements amsv {
    private final Context a;
    private zum b;
    private final zuk c;

    public zug(Context context, zuk zuk) {
        this.a = context;
        this.c = zuk;
    }

    private final zum c() {
        if (this.b == null) {
            this.b = new zun(new zux(this.a.getContentResolver()));
        }
        return this.b;
    }

    /* renamed from: b */
    public final ztm a() {
        amri amri;
        List list;
        Cursor cursor;
        if (this.c.e) {
            SharedPreferences a2 = zti.a(this.a);
            long j = a2.getLong("romanesco-contacts-logger-incremental-upload-timestamp", 0);
            long j2 = a2.getLong("romanesco-contacts-logger-full-upload-timestamp", 0);
            if (azdq.m()) {
                try {
                    zsz zsz = new zsz(this.a);
                    aqxx[] a3 = zsz.a(false, j);
                    aqxa aqxa = (aqxa) aqxb.c.o();
                    aqxa.a(Arrays.asList(a3));
                    amri = amri.b(new ztm(((aqxb) aqxa.i()).a, zsz.a(j), zsz.b(), !azdq.j() ? new aqxt[0] : zsz.c()));
                } catch (InterruptedException | zst | zsu e) {
                    zsg zsg = zui.e;
                    String valueOf = String.valueOf(e.getMessage());
                    zsg.d(valueOf.length() == 0 ? new String("Failed query from ReadContactHelper: + ") : "Failed query from ReadContactHelper: + ".concat(valueOf));
                    amri = ampu.a;
                }
            } else {
                ztm a4 = c().a(this.a.getResources(), j, j2);
                if (a4 == null) {
                    amri = ampu.a;
                } else {
                    if (azdq.j()) {
                        try {
                            a4.e = new zsz(this.a).c();
                        } catch (InterruptedException | zst | zsu e2) {
                            zsg zsg2 = zui.e;
                            String valueOf2 = String.valueOf(e2.getMessage());
                            zsg2.d(valueOf2.length() == 0 ? new String("Failed query from ReadContactHelper.readGroupInfo: + ") : "Failed query from ReadContactHelper.readGroupInfo: + ".concat(valueOf2));
                        }
                    }
                    amri = amri.b(a4);
                }
            }
        } else {
            long j3 = zti.a(this.a).getLong("romanesco-contacts-logger-full-upload-timestamp", 0);
            if (azdq.m()) {
                try {
                    zsz zsz2 = new zsz(this.a);
                    aqxb a5 = zsz2.a(false);
                    if (j3 == 0) {
                        j3 = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(azdq.n());
                    }
                    amri = amri.b(new ztm(a5.a, zsz2.a(j3), zsz2.b(), !azdq.j() ? new aqxt[0] : zsz2.c()));
                } catch (InterruptedException | zst | zsu e3) {
                    zsg zsg3 = zui.e;
                    String valueOf3 = String.valueOf(e3.getMessage());
                    zsg3.d(valueOf3.length() == 0 ? new String("Failed query from ReadContactHelper: + ") : "Failed query from ReadContactHelper: + ".concat(valueOf3));
                    amri = ampu.a;
                }
            } else {
                ztm a6 = c().a(this.a.getResources(), 0, j3);
                if (!(a6 == null || (list = a6.a) == null || list.isEmpty())) {
                    List list2 = a6.a;
                    try {
                        cursor = this.a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, zui.f, (String) null, (String[]) null, "times_contacted DESC LIMIT 1000");
                    } catch (SQLiteException e4) {
                        if (azfa.g()) {
                            zui.e.a((Throwable) e4, "CP2 query exception.");
                            cursor = null;
                        } else {
                            zui.e.e("CP2 query exception.", e4);
                            cursor = null;
                        }
                    }
                    if (cursor == null) {
                        zui.e.c("CP2 query failed.");
                    } else {
                        HashMap hashMap = new HashMap();
                        while (cursor.moveToNext()) {
                            hashMap.put(Long.valueOf(cursor.getLong(cursor.getColumnIndex("contact_id"))), Pair.create(Long.valueOf(cursor.getLong(cursor.getColumnIndex("times_contacted"))), Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_time_contacted")))));
                        }
                        cursor.close();
                        int size = list2.size();
                        for (int i = 0; i < size; i++) {
                            zvb zvb = (zvb) list2.get(i);
                            Pair pair = (Pair) hashMap.get(Long.valueOf(zvb.a));
                            if (pair == null) {
                                zui.e.b("Could not get TimesContacted for contact = %d", Long.valueOf(zvb.a));
                            } else {
                                zvb.f = (double) ((Long) pair.first).longValue();
                                zvb.g = ((Long) pair.first).longValue();
                                zvb.h = ((Long) pair.second).longValue();
                                Object[] objArr = {pair.first, pair.second, zvb.b, Long.valueOf(zvb.a)};
                            }
                        }
                    }
                }
                if (a6 == null) {
                    amri = ampu.a;
                } else {
                    if (azdq.j()) {
                        try {
                            a6.e = new zsz(this.a).c();
                        } catch (InterruptedException | zst | zsu e5) {
                            zsg zsg4 = zui.e;
                            String valueOf4 = String.valueOf(e5.getMessage());
                            zsg4.d(valueOf4.length() == 0 ? new String("Failed query from ReadContactHelper.readGroupInfo: + ") : "Failed query from ReadContactHelper.readGroupInfo: + ".concat(valueOf4));
                        }
                    }
                    amri = amri.b(a6);
                }
            }
        }
        if (amri.a()) {
            return (ztm) amri.b();
        }
        return null;
    }
}
