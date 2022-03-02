package defpackage;

/* renamed from: avvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avvo implements auco {
    START_MILLIS(1),
    REPORT_LENGTH_HOURS(2);
    
    private final int c;

    private avvo(int i) {
        this.c = i;
    }

    public static avvo a(int i) {
        if (i == 1) {
            return START_MILLIS;
        }
        if (i != 2) {
            return null;
        }
        return REPORT_LENGTH_HOURS;
    }

    public static aucq b() {
        return avvn.a;
    }

    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
