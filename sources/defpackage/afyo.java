package defpackage;

/* renamed from: afyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afyo {
    private anaf a;
    private Long b;
    private Long c;
    private Long d;

    public final afyp a() {
        String str = this.a == null ? " activeEventsWithDelaysMs" : "";
        if (this.b == null) {
            str = str.concat(" syncDurationMs");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" elapsedTimeBetweenLastSuccessfulAndCurrentSyncCompletionMs");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" elapsedTimeBetweenLastFailedAndCurrentSyncCompletionMs");
        }
        if (str.isEmpty()) {
            return new afxo(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }

    public final void c(long j) {
        this.b = Long.valueOf(j);
    }

    public final void a(long j) {
        this.d = Long.valueOf(j);
    }

    public final void a(anaf anaf) {
        if (anaf != null) {
            this.a = anaf;
            return;
        }
        throw new NullPointerException("Null activeEventsWithDelaysMs");
    }
}
