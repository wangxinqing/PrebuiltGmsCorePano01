package defpackage;

import com.google.android.gms.common.api.Scope;

/* renamed from: nlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlj {
    public static final Scope a = new Scope("https://www.googleapis.com/auth/games");
    public static final Scope b = new Scope("https://www.googleapis.com/auth/games_lite");
    @Deprecated
    public static final ibq c = new ibq("Games.API", g, f);
    public static final Scope d = new Scope("https://www.googleapis.com/auth/games.firstparty");
    public static final ibq e = new ibq("Games.API_1P", h, f);
    public static final ibg f = new ibg();
    private static final ibn g = new nle();
    private static final ibn h = new nlf();

    static {
        new Scope("https://www.googleapis.com/auth/drive.appdata");
    }
}
