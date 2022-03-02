package defpackage;

/* renamed from: uth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uth implements bape {
    final /* synthetic */ aosh a;
    final /* synthetic */ ulv b;

    public uth(aosh aosh, ulv ulv) {
        this.a = aosh;
        this.b = ulv;
    }

    public final void a() {
        ((anih) ((anih) ulh.a.d()).a("uth", "a", 225, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Finished receiving messages from tachyon.");
        this.a.a((Throwable) new RuntimeException("ReceiveMessages stream has completed."));
    }

    public final void a(awgg awgg) {
        int i = awgg.a;
        if (i == 5) {
            ((anih) ((anih) ulh.a.d()).a("uth", "a", 207, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received end of batch message from tachyon.");
            this.a.b((Object) null);
        } else if (i == 2) {
            ((anih) ((anih) ulh.a.d()).a("uth", "a", 210, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received inbox message from tachyon.");
            this.b.a((awgg.a == 2 ? (awfw) awgg.b : awfw.e).c.k());
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        awgg awgg = (awgg) obj;
        int i = awgg.a;
        if (i == 5) {
            ((anih) ((anih) ulh.a.d()).a("uth", "a", 207, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received end of batch message from tachyon.");
            this.a.b((Object) null);
        } else if (i == 2) {
            ((anih) ((anih) ulh.a.d()).a("uth", "a", 210, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received inbox message from tachyon.");
            this.b.a((awgg.a == 2 ? (awfw) awgg.b : awfw.e).c.k());
        }
    }

    public final void a(Throwable th) {
        anih anih = (anih) ulh.a.c();
        anih.a(th);
        ((anih) anih.a("uth", "a", 218, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive messages from tachyon with an error.");
        this.a.a(th);
    }
}
