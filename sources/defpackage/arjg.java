package defpackage;

/* renamed from: arjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum arjg implements auco {
    UNKNOWN_MODEL(0),
    TREE_BAGGING(1),
    DNN_V1(2),
    DNN_GRU_V1(3),
    DNN_V2(4),
    CNN_GRU_V1(5);
    
    public final int g;

    private arjg(int i) {
        this.g = i;
    }

    public static arjg a(int i) {
        if (i == 0) {
            return UNKNOWN_MODEL;
        }
        if (i == 1) {
            return TREE_BAGGING;
        }
        if (i == 2) {
            return DNN_V1;
        }
        if (i == 3) {
            return DNN_GRU_V1;
        }
        if (i == 4) {
            return DNN_V2;
        }
        if (i != 5) {
            return null;
        }
        return CNN_GRU_V1;
    }

    public static aucq b() {
        return arjf.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
