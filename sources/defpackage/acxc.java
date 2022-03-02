package defpackage;

import android.util.EventLog;

/* renamed from: acxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acxc {
    final long a;
    final int b;
    final Object c;

    public acxc(EventLog.Event event) {
        this.a = event.getTimeNanos();
        this.b = event.getTag();
        this.c = event.getData();
    }
}
