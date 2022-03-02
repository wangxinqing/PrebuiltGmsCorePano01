package defpackage;

/* renamed from: auoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum auoj implements auco {
    UNKNOWN(0),
    SUCCESS(1),
    UNCLASSIFIED_EXCEPTION(2),
    INTERRUPTED_EXCEPTION(3),
    SYNC_CONSTRAINTS_NOT_MET_EXCEPTION(4),
    GRPC_STATUS_EXCEPTION(5),
    GOOGLE_AUTH_EXCEPTION(6),
    USER_RECOVERABLE_AUTH_EXCEPTION(7),
    USER_RECOVERABLE_NOTIFIED_EXCEPTION(8),
    GOOGLE_PLAY_SERVICES_AVAILABILITY_EXCEPTION(9),
    TASK_INTERRUPTED_EXCEPTION(10);
    
    public final int l;

    private auoj(int i) {
        this.l = i;
    }

    public final int a() {
        return this.l;
    }

    public final String toString() {
        return Integer.toString(this.l);
    }
}
