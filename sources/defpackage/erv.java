package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: erv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erv implements erl {
    private static final byte[] a = {71, 111, 111, 103, 108, 101, 79, 102, 102, 108, 105, 110, 101, 79, 84, 80};
    private static final byte[] b = {84, 72, 79, 84, 80, 45, 67, 111, 117, 110, 116, 101, 114};
    private final eru c;

    private static final Long a(byte[] bArr) {
        MessageDigest b2 = jhg.b("SHA256");
        if (b2 != null) {
            byte[] digest = b2.digest(a);
            try {
                return Long.valueOf(ByteBuffer.wrap(autp.a(new SecretKeySpec(bArr, "AES"), digest, b)).order(ByteOrder.LITTLE_ENDIAN).getLong() & Long.MAX_VALUE);
            } catch (GeneralSecurityException e) {
            }
        }
        return null;
    }

    public erv(Context context) {
        this.c = new eru(context);
    }

    public final Long a(ert ert) {
        String str;
        Long l;
        long j;
        ert ert2 = ert;
        try {
            byte[] bArr = ert2.b;
            MessageDigest b2 = jhg.b("SHA256");
            if (b2 != null) {
                b2.update(bArr);
                str = jjp.d(b2.digest());
            } else {
                str = null;
            }
            if (str != null) {
                try {
                    SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    Cursor query = writableDatabase.query("otp_counters", new String[]{"counter"}, "otp_secret_hash = ?", new String[]{str}, (String) null, (String) null, (String) null);
                    try {
                        if (!query.moveToFirst()) {
                            l = a(ert2.b);
                            if (l == null) {
                                query.close();
                                writableDatabase.endTransaction();
                                return null;
                            }
                        } else {
                            l = Long.valueOf(query.getLong(query.getColumnIndexOrThrow("counter")));
                        }
                        query.close();
                        ContentValues contentValues = new ContentValues();
                        if (l.longValue() != Long.MAX_VALUE) {
                            j = l.longValue() + 1;
                        } else {
                            j = 0;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        contentValues.put("counter", Long.valueOf(j));
                        Long valueOf = Long.valueOf(currentTimeMillis);
                        contentValues.put("modification_time_millis", valueOf);
                        if (writableDatabase.update("otp_counters", contentValues, "otp_secret_hash = ?", new String[]{str}) == 0) {
                            contentValues.put("otp_secret_hash", str);
                            contentValues.put("account_name", ert2.a);
                            contentValues.put("creation_time_millis", valueOf);
                            contentValues.put("otp_secret_creation_time_millis", Long.valueOf(ert2.c));
                            if (writableDatabase.insert("otp_counters", (String) null, contentValues) == -1) {
                                writableDatabase.endTransaction();
                                return null;
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        return l;
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("SqliteCounterStorage", "Unexpected exception.", e);
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            Log.e("SqliteCounterStorage", "Unexpected exception.", e);
            return null;
        }
    }
}
