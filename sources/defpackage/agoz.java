package defpackage;

/* renamed from: agoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agoz {
    private Long a;
    private agpa b;
    private Boolean c;

    public final agpb a() {
        String str = this.a == null ? " timeoutMillis" : "";
        if (this.b == null) {
            str = str.concat(" reason");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" uploadPushNotificationPayloads");
        }
        if (str.isEmpty()) {
            return new agov(this.a.longValue(), this.b, this.c.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void a(long j) {
        this.a = Long.valueOf(j);
    }

    public final void a(agpa agpa) {
        if (agpa != null) {
            this.b = agpa;
            return;
        }
        throw new NullPointerException("Null reason");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
