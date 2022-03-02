package defpackage;

/* renamed from: haq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum haq implements auco {
    VOICE(0),
    DATA(1),
    SMS(2);
    
    public final int d;

    private haq(int i) {
        this.d = i;
    }

    public static haq a(int i) {
        if (i == 0) {
            return VOICE;
        }
        if (i == 1) {
            return DATA;
        }
        if (i != 2) {
            return null;
        }
        return SMS;
    }

    public static aucq b() {
        return hap.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
