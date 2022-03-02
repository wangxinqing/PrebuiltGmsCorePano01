package defpackage;

/* renamed from: kpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum kpd {
    UNPINNED(0),
    PINNED_ACTIVE(1),
    PINNED_PAUSED(2);
    
    public final long d;

    private kpd(long j) {
        this.d = j;
    }

    public final boolean a() {
        return UNPINNED.equals(this);
    }

    public final boolean b() {
        return PINNED_ACTIVE.equals(this);
    }

    public final boolean c() {
        return PINNED_PAUSED.equals(this);
    }
}
