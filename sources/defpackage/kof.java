package defpackage;

import android.content.ContentValues;
import java.util.Locale;

/* renamed from: kof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kof extends kqq {
    public static final /* synthetic */ int h = 0;
    public final long a;
    public String b;
    public int c;
    public knc d;
    public final long e;
    public volatile boolean f;
    public String g;

    public kof(kqg kqg, long j, long j2, String str, knc knc, int i, long j3, boolean z, String str2) {
        super(kqg, koi.a, j);
        this.a = j2;
        iva.a((Object) str, (Object) "null payload");
        this.b = str;
        this.d = knc;
        this.c = i;
        this.e = j3;
        this.f = z;
        this.g = str2;
    }

    public static kkp b() {
        return new koe();
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(koh.ACCOUNT_ID.h.a(), Long.valueOf(this.a));
        contentValues.put(koh.PAYLOAD.h.a(), this.b);
        contentValues.put(koh.ATTEMPT_COUNT.h.a(), Integer.valueOf(this.c));
        if (this.d == null) {
            contentValues.putNull(koh.REQUIRED_ENTRY_ID.h.a());
        } else {
            contentValues.put(koh.REQUIRED_ENTRY_ID.h.a(), Long.valueOf(this.d.a));
        }
        contentValues.put(koh.APPLY_LOCALLY_TIMESTAMP.h.a(), Long.valueOf(this.e));
        contentValues.put(koh.IS_PAUSED.h.a(), Boolean.valueOf(this.f));
        contentValues.put(koh.TRANSFER_PREFERENCES_OVERRIDE.h.a(), this.g);
    }

    public final String toString() {
        return String.format(Locale.US, "PendingAction[accountSqlId=%d, payload=%s, sqlId=%s]", new Object[]{Long.valueOf(this.a), this.b, Long.valueOf(this.m)});
    }

    public final void a(String str) {
        iva.a((Object) str);
        this.b = str;
    }

    public final void a(boolean z) {
        this.f = z;
        t();
    }
}
