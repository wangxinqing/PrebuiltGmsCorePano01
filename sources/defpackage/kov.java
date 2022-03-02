package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: kov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kov extends kqq {
    public final knc a;
    public final long b;
    public final String c;
    public long d;
    public int e;
    public int f;

    public kov(kqg kqg, long j, knc knc, long j2, String str, long j3, int i, int i2) {
        super(kqg, kpc.a, j);
        this.a = knc;
        this.b = j2;
        iva.a((Object) str);
        this.c = str;
        Long valueOf = Long.valueOf(j3);
        iva.a((Object) valueOf);
        this.d = valueOf.longValue();
        this.e = i;
        this.f = i2;
    }

    public static kov a(kqg kqg, Cursor cursor) {
        knc knc;
        Cursor cursor2 = cursor;
        Long b2 = kpb.ANDROID_APP_ID.g.b(cursor2);
        Long b3 = kpb.ENTRY_ID.g.b(cursor2);
        String a2 = kpb.SERIALIZED_EVENT.g.a(cursor2);
        long longValue = kpb.NEXT_NOTIFICATION_TIME.g.b(cursor2).longValue();
        int intValue = kpb.ATTEMPT_COUNT.g.b(cursor2).intValue();
        int intValue2 = kpb.SNOOZE_COUNT.g.b(cursor2).intValue();
        if (b3 != null) {
            knc = knc.a(b3.longValue());
        } else {
            knc = null;
        }
        return new kov(kqg, kpc.a.a.b(cursor2).longValue(), knc, b2.longValue(), a2, longValue, intValue, intValue2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String str = this.c;
        long j2 = this.d;
        int i = this.e;
        int i2 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 186 + String.valueOf(str).length());
        sb.append("PersistedEvent [entrySpec=");
        sb.append(valueOf);
        sb.append(", executingAndroidAppSqlId=");
        sb.append(j);
        sb.append(", serializedEvent=");
        sb.append(str);
        sb.append(", nextNotificationTime=");
        sb.append(j2);
        sb.append(", attemptCount=");
        sb.append(i);
        sb.append(", snoozeCount=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        Long l;
        knc knc = this.a;
        if (knc != null) {
            l = Long.valueOf(knc.a);
        } else {
            l = null;
        }
        contentValues.put(kpb.ENTRY_ID.g.a(), l);
        contentValues.put(kpb.ANDROID_APP_ID.g.a(), Long.valueOf(this.b));
        contentValues.put(kpb.SERIALIZED_EVENT.g.a(), this.c);
        contentValues.put(kpb.NEXT_NOTIFICATION_TIME.g.a(), Long.valueOf(this.d));
        contentValues.put(kpb.ATTEMPT_COUNT.g.a(), Integer.valueOf(this.e));
        contentValues.put(kpb.SNOOZE_COUNT.g.a(), Integer.valueOf(this.f));
    }
}
