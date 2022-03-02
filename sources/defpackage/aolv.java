package defpackage;

/* renamed from: aolv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aolv implements auco {
    CONTENT_UPDATE(0),
    CONTENT_REMOVE(1),
    CONTENT_REMOVE_ALL(2),
    ACTION_START(3),
    ACTION_END(4),
    CONTENT_UPDATE_TAGS(5),
    CONTENT_GET(6),
    CONTENT_SEARCH(7),
    CONTENT_PATCH(8),
    CONTENT_MUTATE_REQUEST_INVALID(9),
    CONTENT_REMOVE_TYPES(10),
    UNRECOGNIZED(-1);
    
    private final int m;

    private aolv(int i) {
        this.m = i;
    }

    public static aolv a(int i) {
        switch (i) {
            case 0:
                return CONTENT_UPDATE;
            case 1:
                return CONTENT_REMOVE;
            case 2:
                return CONTENT_REMOVE_ALL;
            case 3:
                return ACTION_START;
            case 4:
                return ACTION_END;
            case 5:
                return CONTENT_UPDATE_TAGS;
            case 6:
                return CONTENT_GET;
            case 7:
                return CONTENT_SEARCH;
            case 8:
                return CONTENT_PATCH;
            case 9:
                return CONTENT_MUTATE_REQUEST_INVALID;
            case 10:
                return CONTENT_REMOVE_TYPES;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aolu.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
