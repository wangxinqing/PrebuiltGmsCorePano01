package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: pon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pon implements Runnable {
    private final poo a;
    private final boolean b;

    public pon(poo poo, boolean z) {
        this.a = poo;
        this.b = z;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        int i;
        boolean z;
        oq oqVar;
        Throwable th;
        Throwable th2;
        poo poo = this.a;
        boolean z2 = this.b;
        aucd o = aokt.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokt aokt = (aokt) o.b;
        "sms".getClass();
        aokt.a |= 1;
        aokt.b = "sms";
        long currentTimeMillis = System.currentTimeMillis();
        pop a2 = poo.a().a("sms", (Iterator) new por(poo.f, poo.b(), poo.e(poo.d).getInt("last_sms_id", -1)));
        oq oqVar2 = a2.b;
        if (oqVar2 != null) {
            poo.e(poo.d).edit().putLong("last_sms_date", ((Long) oqVar2.a).longValue()).apply();
            poo.e(poo.d).edit().putInt("last_sms_id", ((Integer) a2.b.b).intValue()).apply();
        }
        int i2 = a2.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokt aokt2 = (aokt) o.b;
        aokt2.a |= 2;
        aokt2.c = i2;
        int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
        pnz.d("ProcessNewSms completed in %d ms", Integer.valueOf(currentTimeMillis2));
        poo.a(aolt.SMS_CORPUS_PROCESS_NEW_SMS, currentTimeMillis2);
        long currentTimeMillis3 = System.currentTimeMillis();
        int i3 = ((aokt) o.b).c;
        pop a3 = poo.a().a("mms", (Iterator) new pos(poo.f, poo.c(), poo.e(poo.d).getInt("last_mms_id", -1)));
        oq oqVar3 = a3.b;
        if (oqVar3 != null) {
            poo.e(poo.d).edit().putLong("last_mms_date", ((Long) oqVar3.a).longValue()).apply();
            poo.e(poo.d).edit().putInt("last_mms_id", ((Integer) a3.b.b).intValue()).apply();
        }
        int i4 = i3 + a3.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokt aokt3 = (aokt) o.b;
        aokt3.a |= 2;
        aokt3.c = i4;
        int currentTimeMillis4 = (int) (System.currentTimeMillis() - currentTimeMillis3);
        pnz.d("ProcessNewMms completed in %d ms", Integer.valueOf(currentTimeMillis4));
        poo.a(aolt.SMS_CORPUS_PROCESS_NEW_MMS, currentTimeMillis4);
        if (!z2) {
            long currentTimeMillis5 = System.currentTimeMillis();
            pnz.c("Processing read status changes with lastSmsDate = %d, lastMmsDate = %d", Long.valueOf(poo.b()), Long.valueOf(poo.c()));
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            poq a4 = poo.a();
            SQLiteDatabase e = a4.e();
            if (e == null) {
                pnz.e("Got null db in SmsCorpusDbOpenHelpe.insertNewIdsAndDatesIntoSets");
            } else {
                Cursor query = e.query("mmssms_tag", poq.e, "tag=?", new String[]{"unread"}, (String) null, (String) null, (String) null, (String) null);
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            int intValue = jit.a(query, 0, (Integer) 0).intValue();
                            if (!"sms".equals(query.getString(1))) {
                                hashSet2.add(String.format(Locale.US, "'%d;%d'", new Object[]{Integer.valueOf(intValue), Long.valueOf(query.getLong(2))}));
                            } else {
                                hashSet.add(String.format(Locale.US, "'%d;%d'", new Object[]{Integer.valueOf(intValue), Long.valueOf(query.getLong(2))}));
                            }
                        } catch (Throwable th3) {
                            apev.a(th2, th3);
                        }
                    }
                    query.close();
                } else {
                    pnz.e("Got null Cursor in SmsCorpusDbOpenHelpe.insertNewIdsAndDatesIntoSets");
                }
            }
            pnz.c("Currently unread sms: %d, unread mms: %d", Integer.valueOf(hashSet.size()), Integer.valueOf(hashSet2.size()));
            int max = Math.max(1, ((Integer) ozx.am.c()).intValue());
            List a5 = poo.f.a(max, poo.a, (Set) hashSet);
            int a6 = a4.a(a5, "sms");
            List a7 = poo.f.a(max, poo.b, (Set) hashSet2);
            pnz.c("New read sms: %d, New read mms: %d", Integer.valueOf(a5.size()), Integer.valueOf(a7.size()));
            int a8 = a6 + a4.a(a7, "mms");
            pnz.d("Updated %d MMS/SMS readstatus in total", Integer.valueOf(a8));
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokt aokt4 = (aokt) o.b;
            aokt4.a |= 8;
            aokt4.e = a8;
            int currentTimeMillis6 = (int) (System.currentTimeMillis() - currentTimeMillis5);
            pnz.d("ProcessReadStatusChanges completed in %d ms", Integer.valueOf(currentTimeMillis6));
            poo.a(aolt.SMS_CORPUS_PROCESS_READ_STATUS_CHANGES, currentTimeMillis6);
        }
        if (System.currentTimeMillis() - poo.e(poo.d).getLong("last_deletion_time_ms", -1) > ((Long) ozx.X.c()).longValue()) {
            long currentTimeMillis7 = System.currentTimeMillis();
            pnz.d("Processing deletions");
            poq a9 = poo.a();
            Iterator a10 = poo.f.a(poo.a);
            Iterator a11 = poo.f.a(poo.b);
            SQLiteDatabase f = a9.f();
            if (f == null) {
                pnz.e("Got null db in SmsCorpusDbOpenHelper.processDeletions.");
                oqVar = new oq((Object) null, 0);
            } else {
                HashSet hashSet3 = new HashSet();
                HashSet<Integer> hashSet4 = new HashSet<>();
                Cursor query2 = f.query("mmssms", poq.d, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
                if (query2 != null) {
                    while (query2.moveToNext()) {
                        try {
                            Integer a12 = jit.a(query2, 0);
                            if (a12 != null) {
                                if (!"sms".equals(jit.c(query2, 1))) {
                                    hashSet4.add(a12);
                                } else {
                                    hashSet3.add(a12);
                                }
                            }
                        } catch (Throwable th4) {
                            apev.a(th, th4);
                        }
                    }
                    query2.close();
                    while (a10.hasNext()) {
                        hashSet3.remove(a10.next());
                    }
                    while (a11.hasNext()) {
                        hashSet4.remove(a11.next());
                    }
                    f.beginTransaction();
                    try {
                        for (Iterator it = hashSet3.iterator(); it.hasNext(); it = it) {
                            Integer num = (Integer) it.next();
                            f.delete("mmssms", "_id=? AND msg_type=?", new String[]{String.valueOf(num), "sms"});
                            f.delete("mmssms_tag", "_id=? AND msg_type=?", new String[]{String.valueOf(num), "sms"});
                        }
                        for (Integer num2 : hashSet4) {
                            f.delete("mmssms", "_id=? AND msg_type=?", new String[]{String.valueOf(num2), "mms"});
                            f.delete("mmssms_tag", "_id=? AND msg_type=?", new String[]{String.valueOf(num2), "mms"});
                        }
                        Long valueOf = Long.valueOf(System.currentTimeMillis());
                        f.setTransactionSuccessful();
                        f.endTransaction();
                        pnz.c("Processed %d SMS and %d MMS deletions", Integer.valueOf(hashSet3.size()), Integer.valueOf(hashSet4.size()));
                        oqVar = new oq(valueOf, Integer.valueOf(hashSet3.size() + hashSet4.size()));
                    } catch (Throwable th5) {
                        f.endTransaction();
                        throw th5;
                    }
                } else {
                    pnz.e("Got null cursor in SmsCorpusDbOpenHelper.processDeletions.");
                    oqVar = new oq((Object) null, 0);
                }
            }
            Object obj = oqVar.a;
            if (obj != null) {
                poo.e(poo.d).edit().putLong("last_deletion_time_ms", ((Long) obj).longValue()).apply();
            }
            int intValue2 = ((Integer) oqVar.b).intValue();
            if (!o.c) {
                i = 0;
            } else {
                o.c();
                i = 0;
                o.c = false;
            }
            aokt aokt5 = (aokt) o.b;
            aokt5.a |= 4;
            aokt5.d = intValue2;
            int currentTimeMillis8 = (int) (System.currentTimeMillis() - currentTimeMillis7);
            pnz.d("ProcessDeletions completed in %d ms", Integer.valueOf(currentTimeMillis8));
            poo.a(aolt.SMS_CORPUS_PROCESS_DELETIONS, currentTimeMillis8);
        } else {
            i = 0;
        }
        poo.e.a((aokt) o.i());
        aokt aokt6 = (aokt) o.b;
        if (aokt6.c > 0 || aokt6.d > 0 || aokt6.e > 0) {
            poq a13 = poo.a();
            dvj[] dvjArr = a13.c.b;
            int length = dvjArr.length;
            boolean z3 = true;
            while (i < length) {
                dvj dvj = dvjArr[i];
                String valueOf2 = String.valueOf(dvj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                sb.append("Requesting indexing: ");
                sb.append(valueOf2);
                pnz.a(sb.toString());
                if (pba.m()) {
                    z = a13.a(dvj, pnn.a);
                } else {
                    z = a13.a(dvj);
                }
                z3 = z & z3;
                i++;
            }
            pnz.d("requestIndexing with status %b", Boolean.valueOf(z3));
            return;
        }
        return;
        throw th2;
        throw th;
    }
}
