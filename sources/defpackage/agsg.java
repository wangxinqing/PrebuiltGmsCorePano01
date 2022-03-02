package defpackage;

import android.content.BroadcastReceiver;

/* renamed from: agsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agsg implements aora {
    final /* synthetic */ long a;
    final /* synthetic */ BroadcastReceiver.PendingResult b;
    final /* synthetic */ agsh c;

    public agsg(agsh agsh, long j, BroadcastReceiver.PendingResult pendingResult) {
        this.c = agsh;
        this.a = j;
        this.b = pendingResult;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        agsh agsh = this.c;
        agsh.a.a(3009, true, agsh.b.b() - this.a, 0, (atvr) null, (Boolean) null, (Boolean) null);
        this.b.finish();
    }

    public final void a(Throwable th) {
        agsh agsh = this.c;
        agsh.a.a(3009, agsh.b.b() - this.a, 0);
        this.b.finish();
    }
}
