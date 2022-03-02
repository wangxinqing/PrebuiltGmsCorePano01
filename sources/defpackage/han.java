package defpackage;

/* renamed from: han  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum han implements auco {
    BASE_CLIENT_ID(1),
    SEARCH_CLIENT_ID(2),
    VOICESEARCH_CLIENT_ID(3),
    MAPS_CLIENT_ID(4),
    YOUTUBE_CLIENT_ID(5),
    MARKET_CLIENT_ID(6),
    SHOPPER_CLIENT_ID(7),
    WALLET_CLIENT_ID(8),
    CHROME_CLIENT_ID(9);
    
    public final int j;

    private han(int i) {
        this.j = i;
    }

    public static han a(int i) {
        switch (i) {
            case 1:
                return BASE_CLIENT_ID;
            case 2:
                return SEARCH_CLIENT_ID;
            case 3:
                return VOICESEARCH_CLIENT_ID;
            case 4:
                return MAPS_CLIENT_ID;
            case 5:
                return YOUTUBE_CLIENT_ID;
            case 6:
                return MARKET_CLIENT_ID;
            case 7:
                return SHOPPER_CLIENT_ID;
            case 8:
                return WALLET_CLIENT_ID;
            case 9:
                return CHROME_CLIENT_ID;
            default:
                return null;
        }
    }

    public static aucq b() {
        return ham.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
