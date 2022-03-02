package defpackage;

import android.content.ContentValues;
import java.util.Locale;

/* renamed from: kmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kmq extends kqq {
    public static final /* synthetic */ int c = 0;
    public final long a;
    public final String b;

    public kmq(kqg kqg, long j, long j2, String str) {
        super(kqg, kmt.a, j);
        this.a = j2;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kms.ENTRY_ID.c.a(), Long.valueOf(this.a));
        contentValues.put(kms.SDK_APP_ID.c.a(), this.b);
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "EntryAuthorizedApp [entrySqlId=%d, sdkAppId=%s]", new Object[]{Long.valueOf(this.a), this.b});
    }

    public kmq(kqg kqg, long j, String str) {
        this(kqg, -1, j, str);
    }
}
