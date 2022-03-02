package defpackage;

/* renamed from: joa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum joa {
    CACHE(false, false),
    FETCH_THROTTLED(false, true),
    FETCH_NOT_THROTTLED(true, false),
    FETCH_ANOTHER_TASK_INFLIGHT(false, false);
    
    public final boolean e;
    public final boolean f;
    public long g;

    private joa(boolean z, boolean z2) {
        this.g = -1;
        this.e = z;
        this.f = z2;
    }
}
