package defpackage;

import android.content.ContentValues;

/* renamed from: kpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kpk extends kqq {
    public static final /* synthetic */ int f = 0;
    public final knc a;
    public final long b;
    public final int c;
    public long d;
    public String e;

    public kpk(kqg kqg, long j, knc knc, String str, long j2, int i, long j3) {
        super(kqg, kpn.a, j);
        this.a = knc;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = str;
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
        contentValues.put(kpm.ENTRY_ID.i.a(), l);
        contentValues.put(kpm.EVENT_TYPE.i.a(), Integer.valueOf(this.c));
        contentValues.put(kpm.LAST_UPDATE_TIME.i.a(), Long.valueOf(this.d));
        contentValues.put(kpm.ANDROID_APP_ID.i.a(), Long.valueOf(this.b));
        contentValues.put(kpm.SERIALIZED_SUBSCRIPTION_DETAILS.i.a(), this.e);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        int i = this.c;
        long j2 = this.d;
        String str = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 158 + String.valueOf(str).length());
        sb.append("Subscription [entrySpec=");
        sb.append(valueOf);
        sb.append(", androidAppSqlId= ");
        sb.append(j);
        sb.append(", eventType=");
        sb.append(i);
        sb.append(", lastUpdateTime =");
        sb.append(j2);
        sb.append(", serializedSubscriptionDetails =");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public kpk(kqg kqg, knc knc, String str, long j, int i, long j2) {
        this(kqg, -1, knc, str, j, i, j2);
    }
}
