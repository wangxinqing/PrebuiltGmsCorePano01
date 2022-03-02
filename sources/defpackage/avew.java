package defpackage;

/* renamed from: avew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avew implements auco {
    SYNC_ID_UNKNOWN(0),
    SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL(1),
    SYNC_ID_UPLOAD_CONTACTS_BATCH(2);
    
    public final int d;

    private avew(int i) {
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
