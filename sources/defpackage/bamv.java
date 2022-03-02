package defpackage;

/* renamed from: bamv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum bamv {
    HEADER_TABLE_SIZE(1),
    ENABLE_PUSH(2),
    MAX_CONCURRENT_STREAMS(4),
    MAX_FRAME_SIZE(5),
    MAX_HEADER_LIST_SIZE(6),
    INITIAL_WINDOW_SIZE(7);
    
    public final int g;

    private bamv(int i) {
        this.g = i;
    }
}
