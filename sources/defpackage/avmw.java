package defpackage;

/* renamed from: avmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avmw implements auco {
    HELP_CONSOLE(0),
    HELP_SUB_CONSOLE(1),
    HELP_ANSWER_FRAGMENT(2),
    CONTACT_US_FRAGMENT(3);
    
    public final int e;

    private avmw(int i) {
        this.e = i;
    }

    public static avmw a(int i) {
        if (i == 0) {
            return HELP_CONSOLE;
        }
        if (i == 1) {
            return HELP_SUB_CONSOLE;
        }
        if (i == 2) {
            return HELP_ANSWER_FRAGMENT;
        }
        if (i != 3) {
            return null;
        }
        return CONTACT_US_FRAGMENT;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
