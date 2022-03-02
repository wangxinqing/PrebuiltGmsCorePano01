package defpackage;

import android.content.ContentValues;

/* renamed from: jer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jer implements jic {
    static final jic a = new jer();

    private jer() {
    }

    public final void a(Object obj, ContentValues contentValues) {
        jeq jeq = (jeq) obj;
        int i = jes.c;
        contentValues.put("event_time_ms", Long.valueOf(jeq.a));
        contentValues.put("network_type", Integer.valueOf(jeq.b));
    }
}
