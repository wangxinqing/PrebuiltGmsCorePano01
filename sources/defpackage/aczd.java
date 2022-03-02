package defpackage;

/* renamed from: aczd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aczd implements auco {
    SYNC_ID_UNKNOWN(0),
    SYNC_ID_CUSTOM_CACHE(1);
    
    public final int c;

    private aczd(int i) {
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
