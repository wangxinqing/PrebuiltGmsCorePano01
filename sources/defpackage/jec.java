package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider;
import java.util.ArrayList;

/* renamed from: jec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jec {
    public static Cursor a(ContentResolver contentResolver, long j, long j2) {
        Uri uri;
        String[] strArr = {String.valueOf(j), String.valueOf(j2)};
        if (((Boolean) jcd.g.c()).booleanValue()) {
            if (jkr.c()) {
                uri = NetworkUsageChimeraContentProvider.e;
                return contentResolver.query(uri, (String[]) null, (String) null, strArr, (String) null);
            }
        } else if (jkr.g()) {
            return null;
        }
        uri = NetworkUsageChimeraContentProvider.d;
        return contentResolver.query(uri, (String[]) null, (String) null, strArr, (String) null);
    }

    public static ArrayList b(ContentResolver contentResolver, long j, long j2) {
        nz nzVar = new nz();
        int i = 2;
        int i2 = 1;
        int i3 = 3;
        int i4 = 4;
        int i5 = 5;
        int i6 = 6;
        int i7 = 7;
        String[] strArr = {"_id", "datetime_updated", "iface", "tag", "uid", "counter_set", "device_state", "transport_type", "rxbytes", "rxpackets", "txbytes", "txpackets"};
        ContentResolver contentResolver2 = contentResolver;
        Cursor query = contentResolver2.query(NetworkUsageChimeraContentProvider.a, strArr, "datetime_updated BETWEEN ? AND ?", new String[]{String.valueOf(j), String.valueOf(j2)}, (String) null);
        if (query == null) {
            return new ArrayList();
        }
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(i2);
                String string = query.getString(i);
                int i8 = query.getInt(i3);
                int i9 = query.getInt(i4);
                int i10 = query.getInt(i5);
                int i11 = query.getInt(i6);
                int i12 = query.getInt(i7);
                long j4 = query.getLong(8);
                long j5 = query.getLong(9);
                long j6 = query.getLong(10);
                long j7 = query.getLong(11);
                jdy jdy = new jdy(string, i8, i9, i11, i12);
                if (i10 <= 0) {
                    jdy.c = j4;
                    jdy.d = j5;
                    jdy.e = j6;
                    jdy.f = j7;
                } else {
                    jdy.g = j4;
                    jdy.h = j5;
                    jdy.i = j6;
                    jdy.j = j7;
                }
                jdy.p = j3;
                jdy.q = j3;
                String str = jdy.b;
                int i13 = jdy.l;
                int i14 = jdy.m;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
                sb.append(str);
                sb.append(i13);
                sb.append(i14);
                String sb2 = sb.toString();
                jdz jdz = (jdz) nzVar.get(sb2);
                if (jdz == null) {
                    jdz jdz2 = new jdz(jdy.b, jdy.l, jdy.m, jdy.o);
                    jdz2.a(jdy);
                    nzVar.put(sb2, jdz2);
                    i = 2;
                    i2 = 1;
                    i3 = 3;
                    i4 = 4;
                    i5 = 5;
                    i6 = 6;
                    i7 = 7;
                } else {
                    jdz.a(jdy);
                    i = 2;
                    i2 = 1;
                    i3 = 3;
                    i4 = 4;
                    i5 = 5;
                    i6 = 6;
                    i7 = 7;
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        query.close();
        return new ArrayList(nzVar.values());
    }

    public static ArrayList c(ContentResolver contentResolver, long j, long j2) {
        if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
            return new ArrayList();
        }
        nz nzVar = new nz();
        ContentResolver contentResolver2 = contentResolver;
        Cursor query = contentResolver2.query(NetworkUsageChimeraContentProvider.b, (String[]) null, "from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? ", new String[]{String.valueOf(j), String.valueOf(j2)}, (String) null);
        if (query == null) {
            try {
                return new ArrayList();
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } else {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("tag_androidN");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("uid_androidN");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("device_state_androidN");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("transport_type_androidN");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("rxbytes_androidN");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("rxpackets_androidN");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("txbytes_androidN");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("txpackets_androidN");
            while (query.moveToNext()) {
                jee jee = new jee(query.getInt(columnIndexOrThrow), query.getInt(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4));
                jee.r = query.getLong(columnIndexOrThrow5);
                jee.s = query.getLong(columnIndexOrThrow6);
                jee.t = query.getLong(columnIndexOrThrow7);
                jee.u = query.getLong(columnIndexOrThrow8);
                String valueOf = String.valueOf(jee.l);
                int i = jee.m;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
                sb.append(valueOf);
                sb.append(i);
                String sb2 = sb.toString();
                jef jef = (jef) nzVar.get(sb2);
                if (jef == null) {
                    jef jef2 = new jef(jee.l, jee.m, jee.o);
                    jef2.a(jee);
                    nzVar.put(sb2, jef2);
                } else {
                    jef.a(jee);
                }
            }
            query.close();
            return new ArrayList(nzVar.values());
        }
    }
}
