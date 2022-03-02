package defpackage;

/* renamed from: actn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actn extends actp {
    public actn() {
        super("Notificationstats", "notification", "NOTIFICATION_STATS", false);
    }

    /* access modifiers changed from: protected */
    public final String[] a(long j, long j2) {
        return new String[]{"--stats", String.valueOf(j)};
    }

    public final boolean b() {
        return azms.a.a().i() && jkr.b();
    }

    public final long c() {
        return aznn.a.a().h();
    }
}
