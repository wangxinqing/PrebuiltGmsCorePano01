package com.google.android.gms.common.stats.net.contentprovider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkUsageChimeraContentProvider extends ContentProvider {
    public static final Uri a;
    public static final Uri b = Uri.withAppendedPath(l, "networkrawreportAndroidN");
    public static final Uri c = Uri.withAppendedPath(l, "networksummaryrangereport");
    public static final Uri d = Uri.withAppendedPath(l, "networkentriessummaryreport");
    public static final Uri e = Uri.withAppendedPath(l, "networkentriessummaryreportAndroidN");
    public static final Uri f = Uri.withAppendedPath(l, "networktypefortags");
    public static final Uri g = Uri.withAppendedPath(l, "networktypefortagsAndroidN");
    public static final Uri h = Uri.withAppendedPath(l, "insertorupdatebulk");
    public static final Uri i = Uri.withAppendedPath(l, "insertorupdatebulkAndroidN");
    public static final Uri j = Uri.withAppendedPath(l, "groupusageinrange");
    public static final Uri k = Uri.withAppendedPath(l, "groupusageinrangeAndroidN");
    private static final Uri l;
    private static final UriMatcher m;
    private jjj n;

    static {
        Uri parse = Uri.parse("content://com.google.android.gms.common.stats.net.contentprovider");
        l = parse;
        a = Uri.withAppendedPath(parse, "networkrawreport");
        UriMatcher uriMatcher = new UriMatcher(-1);
        m = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkrawreport", 10);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkrawreportAndroidN", 11);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "networksummaryrangereport", 20);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkentriessummaryreport", 30);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkentriessummaryreportAndroidN", 31);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "networktypefortags", 40);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "networktypefortagsAndroidN", 41);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "insertorupdatebulk", 60);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "insertorupdatebulkAndroidN", 61);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "groupusageinrange", 70);
        m.addURI("com.google.android.gms.common.stats.net.contentprovider", "groupusageinrangeAndroidN", 71);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int bulkInsert(android.net.Uri r19, android.content.ContentValues[] r20) {
        /*
            r18 = this;
            r0 = r20
            java.lang.String r1 = "is_update"
            java.lang.String r2 = "NetworkUsageCP"
            android.content.UriMatcher r3 = m
            r4 = r19
            int r3 = r3.match(r4)
            r5 = 60
            r6 = -1
            r7 = 0
            if (r3 == r5) goto L_0x005b
            r5 = 61
            if (r3 != r5) goto L_0x0030
            boolean r3 = defpackage.jkr.c()
            if (r3 == 0) goto L_0x002f
            agvx r3 = defpackage.jcd.g
            java.lang.Object r3 = r3.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = "network_raw_entry_androidN"
            goto L_0x005d
        L_0x002f:
            return r6
        L_0x0030:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r19)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            java.lang.String r2 = "Unknown URI: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x005b:
            java.lang.String r3 = "network_raw_entry"
        L_0x005d:
            r4 = 0
            r5 = r18
            jjj r8 = r5.n     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ec }
            android.database.sqlite.SQLiteDatabase r8 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ec }
            r8.beginTransaction()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            r9 = 0
            r10 = 0
        L_0x006b:
            int r11 = r0.length     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            if (r9 >= r11) goto L_0x00dd
            r11 = r0[r9]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            if (r11 == 0) goto L_0x00dd
            java.lang.Boolean r12 = r11.getAsBoolean(r1)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            if (r12 != 0) goto L_0x0083
            java.lang.String r0 = "Error bulkInsert: IS_UPDATE_KEY is not set"
            android.util.Log.e(r2, r0)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            if (r8 == 0) goto L_0x0082
            r8.endTransaction()
        L_0x0082:
            return r6
        L_0x0083:
            boolean r12 = r12.booleanValue()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            r13 = -1
            java.lang.String r15 = "id_update_row"
            if (r12 != 0) goto L_0x00a6
            r11.remove(r1)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            boolean r12 = r11.containsKey(r15)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            if (r12 == 0) goto L_0x0099
            r11.remove(r15)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
        L_0x0099:
            long r11 = r8.insert(r3, r4, r11)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x00a3
            goto L_0x00cf
        L_0x00a3:
            int r10 = r10 + 1
            goto L_0x00cf
        L_0x00a6:
            java.lang.Long r12 = r11.getAsLong(r15)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            if (r12 == 0) goto L_0x00b2
            long r13 = r12.longValue()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            goto L_0x00b3
        L_0x00b2:
        L_0x00b3:
            r16 = 0
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 < 0) goto L_0x00d2
            r12 = 1
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            r12[r7] = r13     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            r11.remove(r1)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            r11.remove(r15)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            java.lang.String r13 = "_id = ?"
            int r11 = r8.update(r3, r11, r13, r12)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            int r10 = r10 + r11
        L_0x00cf:
            int r9 = r9 + 1
            goto L_0x006b
        L_0x00d2:
            java.lang.String r0 = "Error bulkInsert: invalid ID_UPDATE_ROW"
            android.util.Log.e(r2, r0)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            if (r8 == 0) goto L_0x00dc
            r8.endTransaction()
        L_0x00dc:
            return r6
        L_0x00dd:
            r8.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e6 }
            if (r8 == 0) goto L_0x00e5
            r8.endTransaction()
        L_0x00e5:
            return r10
        L_0x00e6:
            r0 = move-exception
            r4 = r8
            goto L_0x0102
        L_0x00e9:
            r0 = move-exception
            r4 = r8
            goto L_0x00ef
        L_0x00ec:
            r0 = move-exception
            goto L_0x0102
        L_0x00ee:
            r0 = move-exception
        L_0x00ef:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0101 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x0100
            r4.endTransaction()
        L_0x0100:
            return r7
        L_0x0101:
            r0 = move-exception
        L_0x0102:
            if (r4 == 0) goto L_0x0107
            r4.endTransaction()
        L_0x0107:
            goto L_0x0109
        L_0x0108:
            throw r0
        L_0x0109:
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider.bulkInsert(android.net.Uri, android.content.ContentValues[]):int");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        String str2;
        int match = m.match(uri);
        if (match == 10) {
            str2 = "network_raw_entry";
            sQLiteDatabase = this.n.getWritableDatabase();
        } else if (match == 11) {
            try {
                if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
                    return -1;
                }
                str2 = "network_raw_entry_androidN";
                sQLiteDatabase = this.n.getWritableDatabase();
            } catch (SQLiteException e2) {
                Log.e("NetworkUsageCP", String.valueOf(e2.getMessage()));
                return -1;
            }
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(String.format(sb.toString(), new Object[0]));
        }
        int delete = sQLiteDatabase.delete(str2, str, strArr);
        getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
        return delete;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (jkr.c() && ((Boolean) jcd.g.c()).booleanValue()) {
            return null;
        }
        if (m.match(uri) == 10) {
            try {
                long insert = this.n.getWritableDatabase().insert("network_raw_entry", (String) null, contentValues);
                getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
                StringBuilder sb = new StringBuilder(37);
                sb.append("networkrawreport");
                sb.append("/");
                sb.append(insert);
                return Uri.parse(sb.toString());
            } catch (SQLiteException e2) {
                Log.e("NetworkUsageCP", String.valueOf(e2.getMessage()));
                return null;
            }
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb2.append("Unknown URI: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(String.format(sb2.toString(), new Object[0]));
        }
    }

    public final boolean onCreate() {
        if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
            this.n = new jdw(getContext());
            return true;
        }
        this.n = new jdv(getContext());
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Uri uri2 = uri;
        String[] strArr3 = strArr2;
        int match = m.match(uri);
        if (match == 10) {
            Cursor query = this.n.getWritableDatabase().query("network_raw_entry", strArr, str, strArr2, (String) null, (String) null, str2);
            query.setNotificationUri(getContext().getContentResolver(), uri);
            return query;
        } else if (match != 11) {
            if (match == 20) {
                Cursor rawQuery = this.n.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, SUM(rxbytes) AS rxbytes, SUM(rxpackets) AS rxpackets, SUM(txbytes) AS txbytes, SUM(txpackets) AS txpackets FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? AND iface = ? AND tag = ? AND uid = ? AND counter_set = ? AND device_state = ? AND transport_type = ? GROUP BY iface, transport_type, tag, uid", strArr2);
                rawQuery.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery;
            } else if (match == 30) {
                Cursor rawQuery2 = this.n.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, iface, tag, uid, device_state, transport_type, MIN(datetime_updated) AS from_datetime_updated, MAX(datetime_updated) AS to_datetime_updated, TOTAL(CASE WHEN counter_set = 0 THEN rxbytes ELSE 0 END) AS background_rxbytes, TOTAL(CASE WHEN counter_set = 0 THEN rxpackets ELSE 0 END) AS background_rxpackets, TOTAL(CASE WHEN counter_set = 0 THEN txbytes ELSE 0 END) AS background_txbytes, TOTAL(CASE WHEN counter_set = 0 THEN txpackets ELSE 0 END) AS background_txpackets, TOTAL(CASE WHEN counter_set = 1 THEN rxbytes ELSE 0 END) AS foreground_rxbytes, TOTAL(CASE WHEN counter_set = 1 THEN rxpackets ELSE 0 END) AS foreground_rxpackets, TOTAL(CASE WHEN counter_set = 1 THEN txbytes ELSE 0 END) AS foreground_txbytes, TOTAL(CASE WHEN counter_set = 1 THEN txpackets ELSE 0 END) AS foreground_txpackets, TOTAL(rxbytes + txbytes) AS total_bytes FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? GROUP BY iface, tag, uid, device_state, transport_type ORDER BY total_bytes DESC , tag DESC", strArr2);
                rawQuery2.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery2;
            } else if (match != 31) {
                if (match == 40) {
                    Cursor rawQuery3 = this.n.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, transport_type, tag, uid, device_state, MIN(datetime_updated) AS from_datetime_updated, MAX(datetime_updated) AS to_datetime_updated, TOTAL(CASE WHEN counter_set = 0 THEN rxbytes ELSE 0 END) AS background_rxbytes, TOTAL(CASE WHEN counter_set = 0 THEN rxpackets ELSE 0 END) AS background_rxpackets, TOTAL(CASE WHEN counter_set = 0 THEN txbytes ELSE 0 END) AS background_txbytes, TOTAL(CASE WHEN counter_set = 0 THEN txpackets ELSE 0 END) AS background_txpackets, TOTAL(CASE WHEN counter_set = 1 THEN rxbytes ELSE 0 END) AS foreground_rxbytes, TOTAL(CASE WHEN counter_set = 1 THEN rxpackets ELSE 0 END) AS foreground_rxpackets, TOTAL(CASE WHEN counter_set = 1 THEN txbytes ELSE 0 END) AS foreground_txbytes, TOTAL(CASE WHEN counter_set = 1 THEN txpackets ELSE 0 END) AS foreground_txpackets, TOTAL(rxbytes + txbytes) AS total_bytes FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? AND transport_type = ? AND tag != 0 GROUP BY transport_type, tag ORDER BY total_bytes DESC , tag DESC", strArr2);
                    rawQuery3.setNotificationUri(getContext().getContentResolver(), uri);
                    return rawQuery3;
                } else if (match != 41) {
                    if (match == 70) {
                        Cursor rawQuery4 = this.n.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, iface, tag, uid, counter_set, device_state, transport_type, MAX(datetime_updated) AS datetime_updated, COUNT(*) AS row_group_count, SUM(rxbytes) AS rxbytes, SUM(rxpackets) AS rxpackets, SUM(txbytes) AS txbytes, SUM(txpackets) AS txpackets FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? GROUP BY iface, tag, uid, counter_set, device_state, transport_type ORDER BY datetime_updated DESC ", strArr2);
                        rawQuery4.setNotificationUri(getContext().getContentResolver(), uri);
                        return rawQuery4;
                    } else if (match == 71) {
                        try {
                            if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
                                return null;
                            }
                            Cursor rawQuery5 = this.n.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, COUNT(*) AS row_group_count_AndroidN, SUM(rxbytes_androidN) AS rxbytes_androidN, SUM(rxpackets_androidN) AS rxpackets_androidN, SUM(txbytes_androidN) AS txbytes_androidN, SUM(txpackets_androidN) AS txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? GROUP BY tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN ORDER BY datetime_updated_androidN DESC ", strArr2);
                            rawQuery5.setNotificationUri(getContext().getContentResolver(), uri);
                            return rawQuery5;
                        } catch (SQLiteException e2) {
                            Log.e("NetworkUsageCP", String.valueOf(e2.getMessage()));
                            return null;
                        }
                    } else {
                        String valueOf = String.valueOf(uri);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                        sb.append("Unknown URI: ");
                        sb.append(valueOf);
                        throw new IllegalArgumentException(String.format(sb.toString(), new Object[0]));
                    }
                } else if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
                    return null;
                } else {
                    Cursor rawQuery6 = this.n.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, transport_type_androidN, tag_androidN, uid_androidN, device_state_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, rxbytes_androidN, txbytes_androidN, TOTAL(rxbytes_androidN + txbytes_androidN) AS total_bytes_androidN, rxpackets_androidN, txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? AND transport_type_androidN = ? AND tag_androidN != 0 GROUP BY transport_type_androidN, tag_androidN ORDER BY total_bytes_androidN DESC , tag_androidN DESC", strArr2);
                    rawQuery6.setNotificationUri(getContext().getContentResolver(), uri);
                    return rawQuery6;
                }
            } else if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
                return null;
            } else {
                Cursor rawQuery7 = this.n.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, rxbytes_androidN, txbytes_androidN, rxpackets_androidN, txpackets_androidN, TOTAL(rxbytes_androidN + txbytes_androidN) AS total_bytes_androidN, rxpackets_androidN, txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? GROUP BY tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN ORDER BY total_bytes_androidN DESC , tag_androidN DESC", strArr2);
                rawQuery7.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery7;
            }
        } else if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
            return null;
        } else {
            Cursor query2 = this.n.getWritableDatabase().query("network_raw_entry_androidN", strArr, str, strArr2, (String) null, (String) null, str2);
            query2.setNotificationUri(getContext().getContentResolver(), uri);
            return query2;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (jkr.c() && ((Boolean) jcd.g.c()).booleanValue()) {
            return -1;
        }
        if (m.match(uri) == 10) {
            try {
                int update = this.n.getWritableDatabase().update("network_raw_entry", contentValues, str, strArr);
                getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
                return update;
            } catch (SQLiteException e2) {
                Log.e("NetworkUsageCP", String.valueOf(e2.getMessage()));
                return -1;
            }
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(String.format(sb.toString(), new Object[0]));
        }
    }
}
