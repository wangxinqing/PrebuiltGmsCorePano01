package defpackage;

/* renamed from: agyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum agyj {
    NOT_STARTED,
    PAUSED,
    IN_PROGRESS,
    FINISHED;

    public static agyj a(String str) {
        return (agyj) Enum.valueOf(agyj.class, str);
    }
}
