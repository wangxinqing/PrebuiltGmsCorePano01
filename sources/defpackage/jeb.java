package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: jeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jeb implements Runnable {
    private static final String[] a = {"_id", "datetime_updated"};
    private final ContentResolver b;
    private final int c;
    private long d;
    private Map e;

    public jeb(ContentResolver contentResolver, int i) {
        this.b = contentResolver;
        this.c = i;
    }

    private static final int a(ContentResolver contentResolver, ContentValues[] contentValuesArr, int i, jdt jdt, long j, long j2) {
        int i2;
        ArrayList arrayList;
        ContentResolver contentResolver2 = contentResolver;
        ContentValues[] contentValuesArr2 = contentValuesArr;
        long j3 = j;
        long j4 = j2;
        if (j3 > j4) {
            StringBuilder sb = new StringBuilder(90);
            sb.append("Error in groupData: fromDateTime(");
            sb.append(j3);
            sb.append(") > toDateTime (");
            sb.append(j4);
            sb.append(")");
            Log.e("NetworkUsageDbReporter", sb.toString());
            return i;
        }
        String[] strArr = {String.valueOf(j), String.valueOf(j2)};
        Cursor query = contentResolver.query(NetworkUsageChimeraContentProvider.j, (String[]) null, (String) null, strArr, (String) null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("datetime_updated");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("iface");
                int columnIndexOrThrow4 = query.getColumnIndexOrThrow("tag");
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("uid");
                int columnIndexOrThrow6 = query.getColumnIndexOrThrow("counter_set");
                int columnIndexOrThrow7 = query.getColumnIndexOrThrow("device_state");
                int columnIndexOrThrow8 = query.getColumnIndexOrThrow("transport_type");
                int columnIndexOrThrow9 = query.getColumnIndexOrThrow("rxbytes");
                int columnIndexOrThrow10 = query.getColumnIndexOrThrow("rxpackets");
                int columnIndexOrThrow11 = query.getColumnIndexOrThrow("txbytes");
                int columnIndexOrThrow12 = query.getColumnIndexOrThrow("txpackets");
                String[] strArr2 = strArr;
                int columnIndexOrThrow13 = query.getColumnIndexOrThrow("row_group_count");
                ArrayList arrayList2 = new ArrayList();
                i2 = i;
                boolean z = false;
                while (query.moveToNext()) {
                    long j5 = query.getLong(columnIndexOrThrow);
                    int i3 = columnIndexOrThrow;
                    arrayList2.add(Long.valueOf(j5));
                    if (query.getLong(columnIndexOrThrow13) != 1) {
                        String string = query.getString(columnIndexOrThrow3);
                        int i4 = query.getInt(columnIndexOrThrow4);
                        int i5 = query.getInt(columnIndexOrThrow5);
                        int i6 = query.getInt(columnIndexOrThrow6);
                        int i7 = query.getInt(columnIndexOrThrow7);
                        int i8 = query.getInt(columnIndexOrThrow8);
                        long j6 = query.getLong(columnIndexOrThrow2);
                        int i9 = columnIndexOrThrow2;
                        int i10 = columnIndexOrThrow3;
                        long j7 = query.getLong(columnIndexOrThrow9);
                        int i11 = columnIndexOrThrow4;
                        int i12 = columnIndexOrThrow5;
                        long j8 = query.getLong(columnIndexOrThrow10);
                        int i13 = columnIndexOrThrow6;
                        int i14 = columnIndexOrThrow7;
                        long j9 = query.getLong(columnIndexOrThrow11);
                        int i15 = columnIndexOrThrow13;
                        int i16 = columnIndexOrThrow11;
                        long j10 = query.getLong(columnIndexOrThrow12);
                        ArrayList arrayList3 = arrayList2;
                        jdy jdy = new jdy(string, i4, i5, i7, i8);
                        if (i6 <= 0) {
                            jdy.c = j7;
                            jdy.d = j8;
                            jdy.e = j9;
                            jdy.f = j10;
                        } else {
                            jdy.g = j7;
                            jdy.h = j8;
                            jdy.i = j9;
                            jdy.j = j10;
                        }
                        ContentValues b2 = jdt.b();
                        contentValuesArr2[i2] = b2;
                        a(b2, j6, i6, true, j5, jdy);
                        int i17 = i2 + 1;
                        if (i17 != 50) {
                            jdt jdt2 = jdt;
                            i2 = i17;
                            arrayList = arrayList3;
                            ContentResolver contentResolver3 = contentResolver;
                        } else {
                            arrayList = arrayList3;
                            a(contentResolver, contentValuesArr2, jdt, 50);
                            i2 = 0;
                        }
                        columnIndexOrThrow = i3;
                        columnIndexOrThrow2 = i9;
                        arrayList2 = arrayList;
                        columnIndexOrThrow3 = i10;
                        columnIndexOrThrow4 = i11;
                        columnIndexOrThrow5 = i12;
                        columnIndexOrThrow6 = i13;
                        columnIndexOrThrow7 = i14;
                        columnIndexOrThrow11 = i16;
                        columnIndexOrThrow13 = i15;
                        z = true;
                    } else {
                        int i18 = columnIndexOrThrow2;
                        int i19 = columnIndexOrThrow3;
                        int i20 = columnIndexOrThrow4;
                        int i21 = columnIndexOrThrow5;
                        int i22 = columnIndexOrThrow13;
                        int i23 = columnIndexOrThrow11;
                        int i24 = columnIndexOrThrow6;
                        int i25 = columnIndexOrThrow7;
                        jdt jdt3 = jdt;
                        ArrayList arrayList4 = arrayList2;
                        ContentResolver contentResolver4 = contentResolver;
                        columnIndexOrThrow = i3;
                        columnIndexOrThrow2 = i18;
                        arrayList2 = arrayList4;
                        columnIndexOrThrow3 = i19;
                    }
                }
                ArrayList arrayList5 = arrayList2;
                ContentResolver contentResolver5 = contentResolver;
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList5.size();
                    int i26 = 0;
                    while (i26 < size) {
                        String[] strArr3 = strArr2;
                        sb2.append(arrayList5.get(i26));
                        if (i26 < size - 1) {
                            sb2.append(",");
                        }
                        i26++;
                        strArr2 = strArr3;
                    }
                    contentResolver5.delete(NetworkUsageChimeraContentProvider.a, String.format("_id IN (SELECT _id FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? AND _id NOT IN (%s))", new Object[]{sb2.toString()}), strArr2);
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            i2 = i;
        }
        if (query != null) {
            query.close();
        }
        return i2;
    }

    public final void run() {
        jdu jdu;
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j;
        boolean z3;
        int i3;
        jdt jdt;
        int i4;
        Cursor query;
        boolean z4;
        long j2;
        ContentValues[] contentValuesArr;
        long j3;
        long j4;
        long j5;
        File file = new File("/proc/net/xt_qtaguid/stats");
        this.e = new HashMap(jcm.a());
        this.d = jed.c(System.currentTimeMillis()).longValue();
        try {
            jdu = new jdu(new FileInputStream(file));
            jdu.a();
            try {
                jdu.c();
                ContentResolver contentResolver = this.b;
                jdy jdy = new jdy("?", 0, this.c, 7, -1);
                jdy jdy2 = new jdy("?", 0, this.c, 7, -1);
                ContentValues[] contentValuesArr2 = new ContentValues[50];
                jdt jdt2 = new jdt();
                int i5 = 0;
                boolean z5 = false;
                int i6 = 0;
                while (true) {
                    try {
                        char c2 = 5;
                        if (!jdu.b() && !z5) {
                            break;
                        }
                        if (z5) {
                            jdy.l = jdy2.l;
                            jdy.m = jdy2.m;
                            jdy.b = jdy2.b;
                            jdy.o = jdy2.o;
                            jdy.n = jdy2.n;
                            jdy.c = jdy2.c;
                            jdy.d = jdy2.d;
                            jdy.e = jdy2.e;
                            jdy.f = jdy2.f;
                            jdy.g = jdy2.g;
                            jdy.h = jdy2.h;
                            jdy.i = jdy2.i;
                            jdy.j = jdy2.j;
                            z = false;
                        } else if (a(jdu, jdy)) {
                            if (jdu.b() && a(jdu, jdy2)) {
                                if (jdy.b.equals(jdy2.b) && jdy.m == jdy2.m && jdy.l == jdy2.l && jdy.n == jdy2.n && jdy.o == jdy2.o) {
                                    jdy.a((jee) jdy2);
                                } else {
                                    z = true;
                                }
                            }
                            z = z5;
                        } else {
                            jdt jdt3 = jdt2;
                            ContentValues[] contentValuesArr3 = contentValuesArr2;
                            jdy jdy3 = jdy2;
                            i5 = 0;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        jdt jdt4 = jdt2;
                        ContentValues[] contentValuesArr4 = contentValuesArr2;
                        jdy jdy4 = jdy2;
                        long a2 = a(contentResolver, currentTimeMillis, elapsedRealtime, 0, jdy);
                        long a3 = a(contentResolver, currentTimeMillis, elapsedRealtime, 1, jdy);
                        long j6 = currentTimeMillis - elapsedRealtime;
                        if (j6 >= this.d) {
                            i = i6;
                            z2 = z;
                            i2 = 0;
                        } else {
                            int i7 = 0;
                            while (i7 < 2) {
                                String[] strArr = new String[8];
                                strArr[0] = String.valueOf(j6);
                                strArr[1] = String.valueOf(this.d - 1);
                                strArr[2] = jdy.b;
                                strArr[3] = String.valueOf(jdy.l);
                                strArr[4] = String.valueOf(jdy.m);
                                strArr[c2] = String.valueOf(i7);
                                strArr[6] = String.valueOf(jdy.n);
                                strArr[7] = String.valueOf(jdy.o);
                                query = contentResolver.query(NetworkUsageChimeraContentProvider.c, (String[]) null, (String) null, strArr, (String) null);
                                if (query == null) {
                                    z4 = z;
                                } else if (query.moveToFirst()) {
                                    long j7 = query.getLong(query.getColumnIndexOrThrow("rxbytes"));
                                    long j8 = query.getLong(query.getColumnIndexOrThrow("rxpackets"));
                                    long j9 = query.getLong(query.getColumnIndexOrThrow("txbytes"));
                                    long j10 = query.getLong(query.getColumnIndexOrThrow("txpackets"));
                                    if (i7 == 0) {
                                        z4 = z;
                                        jdy.c -= j7;
                                        jdy.d -= j8;
                                        jdy.e -= j9;
                                        jdy.f -= j10;
                                    } else {
                                        z4 = z;
                                        jdy.g -= j7;
                                        jdy.h -= j8;
                                        jdy.i -= j9;
                                        jdy.j -= j10;
                                    }
                                } else {
                                    z4 = z;
                                }
                                if (query != null) {
                                    query.close();
                                }
                                i7++;
                                z = z4;
                                c2 = 5;
                            }
                            z2 = z;
                            i = i6;
                            i2 = 0;
                        }
                        for (int i8 = 2; i2 < i8; i8 = 2) {
                            if (i2 != 0) {
                                z3 = jdy.g > 0 || jdy.h > 0 || jdy.i > 0 || jdy.j > 0;
                                j = a3;
                            } else {
                                z3 = jdy.c > 0 || jdy.d > 0 || jdy.e > 0 || jdy.f > 0;
                                j = a2;
                            }
                            if (z3) {
                                ContentValues b2 = jdt4.b();
                                contentValuesArr4[i] = b2;
                                if (j > -1) {
                                    a(b2, currentTimeMillis, i2, true, j, jdy);
                                    i3 = i + 1;
                                } else {
                                    a(b2, currentTimeMillis, i2, false, 0, jdy);
                                    i3 = i + 1;
                                }
                            } else {
                                i3 = i;
                            }
                            if (i3 != 50) {
                                i4 = i3;
                                jdt = jdt4;
                            } else {
                                jdt = jdt4;
                                a(contentResolver, contentValuesArr4, jdt, 50);
                                i4 = 0;
                            }
                            i2++;
                            jdt4 = jdt;
                        }
                        jdt2 = jdt4;
                        contentValuesArr2 = contentValuesArr4;
                        i6 = i;
                        jdy2 = jdy4;
                        z5 = z2;
                        i5 = 0;
                    } catch (IOException e2) {
                        String.valueOf(e2.getMessage());
                        jjt.a((Closeable) jdu);
                        return;
                    } catch (IllegalArgumentException e3) {
                        try {
                            String valueOf = String.valueOf(e3.getMessage());
                            if (valueOf.length() == 0) {
                                new String("Illegal argument while reading database\n");
                            } else {
                                "Illegal argument while reading database\n".concat(valueOf);
                            }
                            jjt.a((Closeable) jdu);
                            return;
                        } catch (Throwable th) {
                            jjt.a((Closeable) jdu);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        query.close();
                        throw th2;
                    }
                }
                if (i6 > 0) {
                    a(contentResolver, contentValuesArr2, jdt2, i6);
                    i6 = 0;
                }
                jjt.a((Closeable) jdu);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long currentTimeMillis2 = System.currentTimeMillis();
                long j11 = currentTimeMillis2 - elapsedRealtime2;
                long j12 = this.d;
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j12);
                instance.set(11, i5);
                instance.set(12, i5);
                instance.set(13, i5);
                instance.set(14, i5);
                instance.set(5, 1);
                long timeInMillis = instance.getTimeInMillis();
                long longValue = jed.b(this.d).longValue();
                if (j11 > timeInMillis) {
                    if (j11 <= timeInMillis || j11 > longValue) {
                        contentValuesArr = contentValuesArr2;
                        if (j11 > longValue) {
                            long j13 = this.d;
                            if (j11 <= j13) {
                                j2 = j13;
                                j4 = longValue;
                                j3 = timeInMillis;
                                timeInMillis = j11;
                            }
                        }
                        j4 = timeInMillis <= longValue ? longValue : timeInMillis;
                        if (timeInMillis > longValue) {
                            timeInMillis = longValue;
                        }
                        longValue = this.d;
                        j2 = j11;
                    } else {
                        contentValuesArr = contentValuesArr2;
                        j2 = this.d;
                        j4 = j11;
                    }
                    long j14 = timeInMillis;
                    timeInMillis = longValue;
                    j3 = j14;
                } else {
                    contentValuesArr = contentValuesArr2;
                    if (j11 >= longValue) {
                        j5 = j11;
                        j11 = longValue;
                    } else {
                        if (longValue >= timeInMillis) {
                            j5 = timeInMillis;
                            timeInMillis = longValue;
                        }
                        j2 = this.d;
                        j4 = longValue;
                        j3 = j11;
                    }
                    longValue = j5;
                    j2 = this.d;
                    j4 = longValue;
                    j3 = j11;
                }
                if (j3 != j4) {
                    i6 = a(contentResolver, contentValuesArr, i6, jdt2, j3, j4 - 1);
                }
                if (j4 != timeInMillis) {
                    i6 = a(contentResolver, contentValuesArr, i6, jdt2, j4, timeInMillis - 1);
                }
                if (timeInMillis != j2) {
                    i6 = a(contentResolver, contentValuesArr, i6, jdt2, timeInMillis, j2 - 1);
                }
                int a4 = a(contentResolver, contentValuesArr, i6, jdt2, j2, currentTimeMillis2);
                if (a4 > 0) {
                    a(contentResolver, contentValuesArr, jdt2, a4);
                }
                if (elapsedRealtime2 < TimeUnit.DAYS.toMillis(31)) {
                    contentResolver.delete(NetworkUsageChimeraContentProvider.a, "datetime_updated < ?", new String[]{String.valueOf(Long.valueOf(jed.a(System.currentTimeMillis())))});
                }
            } catch (IOException e4) {
                e = e4;
                String.valueOf(e.getMessage());
                jjt.a((Closeable) jdu);
            }
        } catch (IOException e5) {
            e = e5;
            jdu = null;
            String.valueOf(e.getMessage());
            jjt.a((Closeable) jdu);
        }
    }

    private final long a(ContentResolver contentResolver, long j, long j2, int i, jdy jdy) {
        ContentResolver contentResolver2 = contentResolver;
        Cursor query = contentResolver2.query(NetworkUsageChimeraContentProvider.a, a, "datetime_updated BETWEEN ? AND ? AND iface = ? AND tag = ? AND uid = ? AND counter_set = ? AND device_state = ? AND transport_type = ? ", new String[]{String.valueOf(this.d), String.valueOf(this.d + 86399999), jdy.b, String.valueOf(jdy.l), String.valueOf(jdy.m), String.valueOf(i), String.valueOf(jdy.n), String.valueOf(jdy.o)}, "datetime_updated DESC");
        long j3 = -1;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("datetime_updated");
                    long j4 = query.getLong(columnIndexOrThrow);
                    if (j2 >= j - query.getLong(columnIndexOrThrow2)) {
                        j3 = j4;
                    }
                }
            } finally {
                query.close();
            }
        }
        return j3;
    }

    private static final void a(ContentResolver contentResolver, ContentValues[] contentValuesArr, jdt jdt, int i) {
        if (contentResolver.bulkInsert(NetworkUsageChimeraContentProvider.h, contentValuesArr) != i) {
            Log.w("NetworkUsageDbReporter", "Not all values were updated or inserted.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            ContentValues contentValues = contentValuesArr[i2];
            iva.a((Object) contentValues);
            jdt.a(contentValues);
            contentValuesArr[i2] = null;
        }
    }

    public static final void a(ContentValues contentValues, long j, int i, boolean z, long j2, jdy jdy) {
        contentValues.put("datetime_updated", Long.valueOf(j));
        contentValues.put("iface", jdy.b);
        contentValues.put("tag", Integer.valueOf(jdy.l));
        contentValues.put("uid", Integer.valueOf(jdy.m));
        contentValues.put("counter_set", Integer.valueOf(i));
        contentValues.put("device_state", Integer.valueOf(jdy.n));
        contentValues.put("transport_type", Integer.valueOf(jdy.o));
        if (i == 0) {
            contentValues.put("rxbytes", Long.valueOf(jdy.c));
            contentValues.put("rxpackets", Long.valueOf(jdy.d));
            contentValues.put("txbytes", Long.valueOf(jdy.e));
            contentValues.put("txpackets", Long.valueOf(jdy.f));
        } else {
            contentValues.put("rxbytes", Long.valueOf(jdy.g));
            contentValues.put("rxpackets", Long.valueOf(jdy.h));
            contentValues.put("txbytes", Long.valueOf(jdy.i));
            contentValues.put("txpackets", Long.valueOf(jdy.j));
        }
        contentValues.put("is_update", Boolean.valueOf(z));
        if (z) {
            contentValues.put("id_update_row", Long.valueOf(j2));
        }
    }

    private final boolean a(jdu jdu, jdy jdy) {
        int i;
        int i2;
        int i3;
        jdu.f();
        String d2 = jdu.d();
        jdy.b = d2;
        String d3 = jdu.d();
        int length = d3.length();
        if (length > 10) {
            i = Long.decode(d3.substring(0, length - 8)).intValue();
        } else {
            i = 0;
        }
        if (izi.b(i)) {
            int c2 = izi.c(i);
            i2 = izi.d(i);
            i = c2;
        } else {
            i2 = 7;
        }
        jdy.l = i;
        jdy.n = i2;
        try {
            i3 = this.e.containsKey(d2) ? ((Integer) this.e.get(d2)).intValue() : jcm.a(d2);
        } catch (ClassCastException e2) {
            i3 = jcm.a(d2);
        }
        jdy.o = i3;
        int f = jdu.f();
        if (f == this.c) {
            jdy.m = f;
            int f2 = jdu.f();
            long e3 = jdu.e();
            long e4 = jdu.e();
            long e5 = jdu.e();
            long e6 = jdu.e();
            jdu.c();
            if (f2 <= 0) {
                jdy.c = e3;
                jdy.d = e4;
                jdy.e = e5;
                jdy.f = e6;
                jdy.g = 0;
                jdy.h = 0;
                jdy.i = 0;
                jdy.j = 0;
                return true;
            }
            jdy.c = 0;
            jdy.d = 0;
            jdy.e = 0;
            jdy.f = 0;
            jdy.g = e3;
            jdy.h = e4;
            jdy.i = e5;
            jdy.j = e6;
            return true;
        }
        jdu.c();
        return false;
    }
}
