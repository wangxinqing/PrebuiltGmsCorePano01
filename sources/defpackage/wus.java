package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: wus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wus {
    public static void a(Context context, String str, Account account, String str2) {
        a(context, str, account != null ? account.name : null, str2);
    }

    public static void b(Context context, String str, String str2) {
        a(context, str, (String) null, str2);
    }

    public static void a(Context context, String str, String str2) {
        a(context, str, str2, (Throwable) null);
    }

    public static void a(Context context, String str, String str2, String str3) {
        a(context, str, str2, str3, (Throwable) null);
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        a(context, str, str2, str3, str4, (Throwable) null);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, Throwable th) {
        String str5;
        ContentValues contentValues;
        ContentValues contentValues2;
        String str6;
        String str7;
        String str8;
        if (th != null) {
            try {
                String stackTraceString = Log.getStackTraceString(th);
                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(stackTraceString).length());
                sb.append(str4);
                sb.append("\n");
                sb.append(stackTraceString);
                str5 = sb.toString();
            } catch (RuntimeException e) {
                Log.w("PeopleLog", "Unable to write log", e);
                return;
            }
        } else {
            str5 = str4;
        }
        wux a = wux.a(context);
        int ch = (int) aywy.a.a().ch();
        int myPid = Process.myPid();
        int myTid = Process.myTid();
        SQLiteDatabase a2 = a.a();
        if (a2 != null) {
            ContentValues contentValues3 = a.c;
            synchronized (contentValues3) {
                int i = ch - 1;
                try {
                    int longForQuery = (int) DatabaseUtils.longForQuery(a2, "SELECT count(1) FROM logs", (String[]) null);
                    if (longForQuery > i) {
                        if (longForQuery > 0) {
                            a2.execSQL("DELETE FROM logs WHERE timestamp = (SELECT MIN(timestamp) FROM logs)");
                        }
                    }
                    if (aywy.a.a().n()) {
                        wuu wuu = new wuu(str2, str3, myPid, str5);
                        wut wut = a.d;
                        Iterator it = wut.a.entrySet().iterator();
                        long a3 = wut.b.a();
                        while (it.hasNext()) {
                            contentValues = contentValues3;
                            try {
                                if (((wuv) ((Map.Entry) it.next()).getValue()).a < a3 - aywy.a.a().K()) {
                                    it.remove();
                                    contentValues3 = contentValues;
                                } else {
                                    contentValues3 = contentValues;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        contentValues2 = contentValues3;
                        if (!wut.a.containsKey(wuu)) {
                            long a4 = a.a.a();
                            a.a(a2, str2, str3, myPid, str5, a4, myTid, str);
                            a.d.a(wuu, new wuv(a4, 1));
                        } else {
                            wuv wuv = (wuv) a.d.a.get(wuu);
                            if (wuu.a != null) {
                                str6 = "=?";
                            } else {
                                str6 = " IS NULL";
                            }
                            if (wuu.b != null) {
                                str7 = "=?";
                            } else {
                                str7 = " IS NULL";
                            }
                            if (wuu.d != null) {
                                str8 = "=?";
                            } else {
                                str8 = " IS NULL";
                            }
                            StringBuilder sb2 = new StringBuilder(str6.length() + 69 + str7.length() + str8.length());
                            sb2.append("process_id=? AND timestamp=? AND account_name");
                            sb2.append(str6);
                            sb2.append(" AND page_id");
                            sb2.append(str7);
                            sb2.append(" AND message");
                            sb2.append(str8);
                            String sb3 = sb2.toString();
                            long j = wuv.a;
                            int i2 = wuv.b;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Integer.toString(wuu.c));
                            arrayList.add(Long.toString(j));
                            String str9 = wuu.a;
                            if (str9 != null) {
                                arrayList.add(str9);
                            }
                            String str10 = wuu.b;
                            if (str10 != null) {
                                arrayList.add(str10);
                            }
                            if (wuu.d != null) {
                                arrayList.add(wuu.a(i2));
                            }
                            wuv wuv2 = new wuv(a.a.a(), wuv.b + 1);
                            a.d.a(wuu, wuv2);
                            a.c.clear();
                            String a5 = wuu.a(wuv2.b);
                            a.c.put("message", a5);
                            a.c.put("timestamp", Long.valueOf(wuv2.a));
                            int update = a2.update("logs", a.c, sb3, (String[]) arrayList.toArray(ycm.b));
                            if (update != 1) {
                                xdt.a("PeopleLog", "Updated %d rows to timestamp=%d, message=%s", Integer.valueOf(update), Long.valueOf(wuv2.a), a5);
                            }
                        }
                    } else {
                        String str11 = str2;
                        String str12 = str3;
                        contentValues2 = contentValues3;
                        a.a(a2, str2, str3, myPid, str5, a.a.a(), myTid, str);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    contentValues = contentValues3;
                    throw th;
                }
            }
        }
        long cg = aywy.a.a().cg() * 86400000;
        SQLiteDatabase a6 = a.a();
        if (a6 != null) {
            a6.execSQL("DELETE FROM logs WHERE timestamp<?;", new String[]{Long.toString(a.a.a() - cg)});
        }
    }

    public static void a(Context context, String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2)) {
            Log.i(str, str3);
        }
        a(context, str, str2, (String) null, str3, th);
    }

    public static void a(Context context, String str, String str2, Throwable th) {
        a(context, str, (String) null, (String) null, str2, th);
    }
}
