package defpackage;

/* renamed from: utc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class utc implements bape {
    final /* synthetic */ aosh a;
    final /* synthetic */ ulv b;

    public utc(aosh aosh, ulv ulv) {
        this.a = aosh;
        this.b = ulv;
    }

    public final void a() {
        ((anih) ((anih) ulh.a.d()).a("utc", "a", 149, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Finished receiving messages from tachyon.");
        this.a.a((Throwable) new RuntimeException("ReceiveMessagesExpress stream has completed."));
    }

    public final void a(awgg awgg) {
        int i = awgg.a;
        if (i == 7) {
            ((anih) ((anih) ulh.a.d()).a("utc", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received fast path ready message from tachyon.");
            this.a.b((Object) null);
        } else if (i == 2) {
            ((anih) ((anih) ulh.a.d()).a("utc", "a", 134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received inbox message from tachyon.");
            this.b.a((awgg.a == 2 ? (awfw) awgg.b : awfw.e).c.k());
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        awgg awgg = (awgg) obj;
        int i = awgg.a;
        if (i == 7) {
            ((anih) ((anih) ulh.a.d()).a("utc", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received fast path ready message from tachyon.");
            this.a.b((Object) null);
        } else if (i == 2) {
            ((anih) ((anih) ulh.a.d()).a("utc", "a", 134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received inbox message from tachyon.");
            this.b.a((awgg.a == 2 ? (awfw) awgg.b : awfw.e).c.k());
        }
    }

    public final void a(Throwable th) {
        anih anih = (anih) ulh.a.c();
        anih.a(th);
        ((anih) anih.a("utc", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive messages from tachyon with an error.");
        this.a.a(th);
    }
}
